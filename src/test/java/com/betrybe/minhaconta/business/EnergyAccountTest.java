package com.betrybe.minhaconta.business;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.ions.lightdealer.sdk.model.Address;
import com.ions.lightdealer.sdk.model.Client;
import com.ions.lightdealer.sdk.model.ElectronicDevice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("[11] Testes da classe EnergyAccount")
public class EnergyAccountTest {

  private Client client;
  private ElectronicDevice device1;
  private ElectronicDevice device2;
  private ElectronicDevice device3;

  @BeforeEach
  public void setUp() {
    client = new Client();

    Address address1 = new Address();
    Address address2 = new Address();
    Address address3 = new Address();

    client.addAddress(address1);
    client.addAddress(address2);
    client.addAddress(address3);

    device1 = new ElectronicDevice();
    device1.setName("Device 1");
    device1.setPower(100);
    device1.setHoursUsedDaily(2);
    device1.setDaysUsedMonthly(30);

    device2 = new ElectronicDevice();
    device2.setName("Device 2");
    device2.setPower(200);
    device2.setHoursUsedDaily(2);
    device2.setDaysUsedMonthly(30);

    device3 = new ElectronicDevice();
    device3.setName("Device 3");
    device3.setPower(50);
    device3.setHoursUsedDaily(2);
    device3.setDaysUsedMonthly(30);

    address1.addDevice(device1);
    address1.addDevice(device2);

    address3.addDevice(device3);
  }

  @Test
  @DisplayName("11 - Desafio final - Implemente o método findHighConsumptionDevices()")
  public void testFindHighConsumptionDevices() {
    ElectronicDevice[] expectedDevices = new ElectronicDevice[] {
        device2, null, device3
    };

    EnergyAccount energyAccount = new EnergyAccount(client);
    ElectronicDevice[] highConsumptionDevices = energyAccount.findHighConsumptionDevices();

    assertArrayEquals(
        expectedDevices,
        highConsumptionDevices,
        "O dispositivo de maior consumo de cada endereço deve ser identificado corretamente");
  }
}
