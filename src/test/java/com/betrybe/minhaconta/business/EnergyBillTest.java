package com.betrybe.minhaconta.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import com.ions.lightdealer.sdk.model.Address;
import com.ions.lightdealer.sdk.model.ElectronicDevice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@DisplayName("[1-3] Testes da classe EnergyBill")
public class EnergyBillTest {

  private EnergyBill billResidential;
  private EnergyBill billNonResidential;
  private Address address;

  @BeforeEach
  public void setUp() {
    address = new Address();

    billResidential = new EnergyBill(address, true);
    billNonResidential = new EnergyBill(address, false);
  }

  @Test
  @DisplayName("1 - Implemente os atributos e o construtor da classe EnergyBill")
  public void testEnergyBillConstructor() {
    assertEquals(address, billResidential.address, "O endereço deve ser igual ao fornecido");

    assertTrue(
        billResidential.residentialPlan,
        "O plano deve ser residencial quando o parâmetro for verdadeiro");
    assertFalse(
        billNonResidential.residentialPlan,
        "O plano não deve ser residencial quando o parâmetro for falso");
  }

  @Test
  @DisplayName("2 - Implemente o método adjustedTariff()")
  public void testAdjustedTariff() {
    double baseValue = 100.0;
    assertEquals(baseValue, billResidential.adjustedTariff(baseValue),
        "A tarifa para planos residenciais não deve ser ajustada.");

    assertEquals(baseValue * 1.1, billNonResidential.adjustedTariff(baseValue),
        "A tarifa para planos não residenciais deve ser ajustada em 10%.");
  }

  @Test
  @DisplayName("3 - Implemente o método calculateTotalUsage()")
  public void testCalculateTotalUsage() {
    ElectronicDevice device1 = mock(ElectronicDevice.class);
    Mockito.when(device1.monthlyKwh()).thenReturn(5.25);
    ElectronicDevice device2 = mock(ElectronicDevice.class);
    Mockito.when(device2.monthlyKwh()).thenReturn(7.5);

    ElectronicDevice[] devices = {device1, device2};
    int actualTotalUsage = EnergyBill.calculateTotalUsage(devices);

    assertEquals(12, actualTotalUsage, "O cálculo do uso total de energia deve ser correto.");
  }

}
