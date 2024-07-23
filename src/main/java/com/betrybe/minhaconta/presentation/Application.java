package com.betrybe.minhaconta.presentation;

import com.betrybe.minhaconta.business.EnergyAccount;
import com.ions.lightdealer.sdk.model.ElectronicDevice;
import com.ions.lightdealer.sdk.service.LightDealerApi;

/**
 * The type Application.
 */
public class Application {

  ConsoleUserInterface ui;
  LightDealerApi api;

  /**
   * Constructor that instantiates a new Application.
   */
  public Application(ConsoleUserInterface ui) {
    this.ui = ui;
    this.api = new LightDealerApi();
  }

  /**
   * Req. 4 – Creates CLI menu.
   */
  public void run() {
    String[] options = {
      "1 - Cadastrar cliente",
      "2 - Cadastrar endereço",
      "3 - Cadastrar dispositivos",
      "4 - Estimar conta de energia",
      "5 - Otimizar conta de energia",
      "6 - Sair"
    };

    char option = ui.inputMenuOption(options);
    runOptionAction(option);

    while (option != '6') {
      option = ui.inputMenuOption(options);
      runOptionAction(option);
    }
  }

  /**
   * Req. 5 – Run menu options.
   */
  public void runOptionAction(char option) {
    switch (option) {
      case '1':
        registerClient();
        break;
      case '2':
        registerClientAddress();
        break;
      case '3':
        registerAddressDevices();
        break;
      case '4':
        estimateAddressBill();
        break;
      case '5':
        optimizeEnergyBill();
        break;
      case '6':
        ui.showMessage("Volte sempre!");
        break;
      default:
        ui.showMessage("Opção inválida!");
    }
  }

  /**
   * Req. 6 – Register client.
   */
  public void registerClient() {
  }

  /**
   * Req. 7 – Register client address.
   */
  public void registerClientAddress() {
  }

  /**
   * Req. 8 – Register address devices.
   */
  public void registerAddressDevices() {
  }

  /**
   * Req. 9 – Estimates the address energy bill.
   */
  public void estimateAddressBill() {
  }

  /**
   * Req. 10 – Optimizes the energy bill.
   */
  public void optimizeEnergyBill() {
  }

  /**
   * Req 10 - Aux. Method to display high consumptions devices.
   */
  public void suggestReducedUsage(EnergyAccount energyAccount) {
  }
}
