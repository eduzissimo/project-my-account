package com.betrybe.minhaconta.presentation;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.betrybe.minhaconta.business.EnergyAccount;
import com.betrybe.minhaconta.business.EnergyBill;
import com.ions.lightdealer.sdk.model.Address;
import com.ions.lightdealer.sdk.model.Client;
import com.ions.lightdealer.sdk.model.ElectronicDevice;
import com.ions.lightdealer.sdk.service.LightDealerApi;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@DisplayName("[4-10] Testes da classe Application")
public class ApplicationTest {

  private Application appMock;
  private ConsoleUserInterface uiMock;
  private LightDealerApi apiMock;

  @BeforeEach
  public void setUp() {
    uiMock = mock(ConsoleUserInterface.class);
    apiMock = mock(LightDealerApi.class);
    appMock = spy(new Application(uiMock));
    appMock.api = apiMock;
  }

  @AfterEach
  public void tearDown() {
    resetAllMocks();
  }

  private void resetAllMocks() {
    reset(uiMock, apiMock, appMock);
  }

  @Test
  @DisplayName("4 - Implemente o método run()")
  public void testRun() {
    when(uiMock.inputMenuOption(any(String[].class))).thenReturn('1', '6');

    appMock.run();

    verify(uiMock, atLeastOnce()).inputMenuOption(any(String[].class));
    verify(appMock, atLeastOnce()).runOptionAction(eq('1'));
    verify(appMock, atLeastOnce()).runOptionAction(eq('6'));
  }

  @Test
  @DisplayName("5 - Implemente o método runOptionAction()")
  public void testAllRunOptionActions() {
    resetAllMocks();
    appMock.runOptionAction('1');
    verify(appMock).registerClient();

    resetAllMocks();
    appMock.runOptionAction('2');
    verify(appMock).registerClientAddress();

    resetAllMocks();
    appMock.runOptionAction('3');
    verify(appMock).registerAddressDevices();

    resetAllMocks();
    appMock.runOptionAction('4');
    verify(appMock).estimateAddressBill();

    resetAllMocks();
    appMock.runOptionAction('5');
    verify(appMock).optimizeEnergyBill();

    resetAllMocks();
    appMock.runOptionAction('6');
    verify(uiMock).showMessage("Volte sempre!");

    resetAllMocks();
    appMock.runOptionAction('X');
    verify(uiMock).showMessage("Opção inválida!");
  }

  @Test
  @DisplayName("6 - Implemente o método registerClient()")
  public void testRegisterClient() {
    Client mockClient = new Client();
    mockClient.setName("mock name");
    mockClient.setCpf("123456789-00");

    doAnswer(
        invocation -> {
          Client client = invocation.getArgument(0);
          client.setName(mockClient.getName());
          client.setCpf(mockClient.getCpf());
          return null;
        }
    ).when(uiMock).fillClientData(any());

    appMock.registerClient();

    verify(uiMock).fillClientData(any());
    verify(apiMock).addClient(eq(mockClient));
  }

  @Test
  @DisplayName("7 - Implemente o método registerClientAddress()")
  public void testRegisterClientAddress() {
    testFailToRegisterClientAddress();
    resetAllMocks();
    testRegisterClientAddressWithSuccess();
  }

  public void testFailToRegisterClientAddress() {
    Client mockClient = new Client();
    mockClient.setName("mock name");
    mockClient.setCpf("123456789-00");

    Mockito.when(
        uiMock.inputClientCpf()
    ).thenReturn(mockClient.getCpf());

    Mockito.when(
        apiMock.findClient(any())
    ).thenReturn(null);

    appMock.registerClientAddress();
    verify(uiMock).showMessage("Pessoa cliente não encontrada!");
  }

  public void testRegisterClientAddressWithSuccess() {
    Client mockClient = new Client();
    mockClient.setName("mock name");
    mockClient.setCpf("123456789-00");

    Address mockAddress = new Address();
    mockAddress.setDistrict("mock district");
    mockAddress.setStreet("mock street");
    mockAddress.setNumber(1234);
    mockAddress.setRegistration("99887766");

    Mockito.when(
        uiMock.inputClientCpf()
    ).thenReturn(mockClient.getCpf());

    Mockito.when(
        apiMock.findClient(any())
    ).thenReturn(mockClient);

    doAnswer(
        invocation -> {
          Address address = invocation.getArgument(0);

          address.setDistrict(mockAddress.getDistrict());
          address.setStreet(mockAddress.getStreet());
          address.setNumber(mockAddress.getNumber());
          address.setRegistration(mockAddress.getRegistration());
          return null;
        }
    ).when(uiMock).fillAddressData(any());

    appMock.registerClientAddress();

    verify(uiMock).inputClientCpf();
    verify(uiMock).fillAddressData(any());
    verify(apiMock).findClient(eq(mockClient.getCpf()));
    verify(apiMock).addAddressToClient(eq(mockAddress), eq(mockClient));
  }

  @Test
  @DisplayName("8 - Implemente o método registerAddressDevices()")
  public void testRegisterAddressDevices() {
    testFailToRegisterAddressDevices();
    resetAllMocks();
    testRegisterAddressDevicesWithSuccess();
  }

  public void testFailToRegisterAddressDevices() {
    Address mockAddress = new Address();
    mockAddress.setRegistration("99887766");

    Mockito.when(
        uiMock.inputAddressRegistration()
    ).thenReturn(mockAddress.getRegistration());

    Mockito.when(
        apiMock.findAddress(any())
    ).thenReturn(null);

    appMock.registerAddressDevices();
    verify(uiMock).showMessage("Endereço não encontrado!");
  }

  public void testRegisterAddressDevicesWithSuccess() {
    Address mockAddress = new Address();
    mockAddress.setDistrict("mock district");
    mockAddress.setStreet("mock street");
    mockAddress.setNumber(1234);
    mockAddress.setRegistration("99887766");

    ElectronicDevice mockDevice = new ElectronicDevice();
    mockDevice.setName("mock name");
    mockDevice.setPower(1234.5);
    mockDevice.setHoursUsedDaily(3);
    mockDevice.setDaysUsedMonthly(14);

    Mockito.when(
        uiMock.inputAddressRegistration()
    ).thenReturn(mockAddress.getRegistration());

    Mockito.when(
        apiMock.findAddress(any())
    ).thenReturn(mockAddress);

    int numberOfDevices = 3;
    Mockito.when(
        uiMock.inputNumberOfDevices()
    ).thenReturn(numberOfDevices);

    doAnswer(
        invocation -> {
          ElectronicDevice device = invocation.getArgument(0);

          mockDevice.setName(device.getName());
          mockDevice.setPower(device.getPower());
          mockDevice.setHoursUsedDaily(device.getHoursUsedDaily());
          mockDevice.setDaysUsedMonthly(device.getDaysUsedMonthly());
          return null;
        }
    ).when(uiMock).fillDeviceData(any());

    appMock.registerAddressDevices();

    verify(uiMock).inputAddressRegistration();
    verify(uiMock, times(numberOfDevices)).fillDeviceData(eq(mockDevice));
    verify(apiMock, times(numberOfDevices)).addDeviceToAddress(mockDevice, mockAddress);
  }

  @Test
  @DisplayName("9 - Implemente o método estimateAddressBill()")
  public void testEstimateAddressBill() {
    testFailToEstimateAddressBill();
    resetAllMocks();
    testEstimateAddressBillWithSuccess();
  }

  public void testFailToEstimateAddressBill() {
    Address mockAddress = new Address();
    mockAddress.setRegistration("99887766");

    Mockito.when(
        uiMock.inputAddressRegistration()
    ).thenReturn(mockAddress.getRegistration());

    Mockito.when(
        apiMock.findAddress(any())
    ).thenReturn(null);

    appMock.estimateAddressBill();
    verify(uiMock).showMessage("Endereço não encontrado!");
  }

  public void testEstimateAddressBillWithSuccess() {
    Address mockAddress = new Address();
    mockAddress.setDistrict("mock district");
    mockAddress.setStreet("mock street");
    mockAddress.setNumber(1234);
    mockAddress.setRegistration("99887766");

    ElectronicDevice mockDevice1 = Mockito.mock(ElectronicDevice.class);
    ElectronicDevice mockDevice2 = Mockito.mock(ElectronicDevice.class);
    Mockito.when(mockDevice1.monthlyKwh()).thenReturn(100.0);
    Mockito.when(mockDevice2.monthlyKwh()).thenReturn(200.0);

    mockAddress.addDevice(mockDevice1);
    mockAddress.addDevice(mockDevice2);

    Mockito.when(
        uiMock.inputAddressRegistration()
    ).thenReturn(mockAddress.getRegistration());

    Mockito.when(
        apiMock.findAddress(any())
    ).thenReturn(mockAddress);

    appMock.estimateAddressBill();

    verify(uiMock).inputAddressRegistration();
    verify(apiMock).findAddress(eq(mockAddress.getRegistration()));

    EnergyBill testBill = new EnergyBill(mockAddress, true);
    double expectedBill = testBill.estimate();

    String expectedMessage = "Valor estimado para a conta: " + expectedBill;
    verify(uiMock).showMessage(eq(expectedMessage));
  }

  @Test
  @DisplayName("10 - Implemente os métodos optimizeEnergyBill() e suggestReducedUsage()")
  public void testOptimizeEnergyBillAndSuggestReducedUsage() {
    testFailToRegisterClientAddressInOptimize();
    resetAllMocks();
    testOptimizeEnergyBill();
  }

  public void testFailToRegisterClientAddressInOptimize() {
    Client mockClient = new Client();
    mockClient.setName("mock name");
    mockClient.setCpf("123456789-00");

    Mockito.when(
        uiMock.inputClientCpf()
    ).thenReturn(mockClient.getCpf());

    Mockito.when(
        apiMock.findClient(any())
    ).thenReturn(null);

    appMock.optimizeEnergyBill();
    verify(uiMock).showMessage("Pessoa cliente não encontrada!");
  }

  public void testOptimizeEnergyBill() {
    checkOptimizeEnergyBill();
    resetAllMocks();
    checkSuggestReducedUsage();
  }

  private void checkOptimizeEnergyBill() {
    String mockCpf = "12345678900";

    Mockito.when(uiMock.inputClientCpf())
        .thenReturn(mockCpf);
    Mockito.when(apiMock.findClient(eq(mockCpf)))
        .thenReturn(Mockito.mock(Client.class));

    doNothing().when(appMock).suggestReducedUsage(any());

    appMock.optimizeEnergyBill();

    verify(uiMock).inputClientCpf();
    verify(apiMock).findClient(eq(mockCpf));
  }

  private void checkSuggestReducedUsage() {
    ElectronicDevice device1 = new ElectronicDevice();
    device1.setName("mock device 1");
    ElectronicDevice device2 = new ElectronicDevice();
    device1.setName("mock device 2");

    EnergyAccount energyAccount = mock(EnergyAccount.class);
    Mockito.when(energyAccount.findHighConsumptionDevices())
        .thenReturn(new ElectronicDevice[] {device1, device2});

    appMock.suggestReducedUsage(energyAccount);

    verify(uiMock).showMessage(eq("Considere reduzir o uso dos seguintes dispositivos:"));
    verify(uiMock).showMessage(eq(device1.getName()));
    verify(uiMock).showMessage(eq(device2.getName()));
  }
}
