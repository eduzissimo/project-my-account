package com.betrybe.minhaconta.business;

import com.ions.lightdealer.sdk.model.Address;
import com.ions.lightdealer.sdk.model.Client;
import com.ions.lightdealer.sdk.model.ElectronicDevice;
import java.util.Arrays;


/**
 * The type Energy account.
 */
public class EnergyAccount {

  Client client;

  public EnergyAccount(Client client) {
    this.client = client;
  }

  /**
   * Req. 11 – Find high consumption device per address.
   */
  public ElectronicDevice[] findHighConsumptionDevices() {
    Address[] addresses = client.getAddressesAsArray();
    ElectronicDevice[] highConsumptionDevices = new ElectronicDevice[addresses.length];

    int i = 0;
    for (Address address : addresses) {
      ElectronicDevice[] devices = address.getDevicesAsArray();
      ElectronicDevice highestDevice = Arrays.stream(devices)
          .max((device1, device2) -> Double.compare(device1.monthlyKwh(), device2.monthlyKwh()))
          .orElse(null);
      highConsumptionDevices[i++] = highestDevice;
    }
    return highConsumptionDevices;
  }
}
