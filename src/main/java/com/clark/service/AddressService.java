package com.clark.service;

import com.clark.pojo.Address;

import java.util.List;

public interface AddressService {

    List<Address> getAddresses();

    Address getAddressById(int id);

    Address getAddressByPostcode(String postcode);

    int addAddress(Address address);

    int updateAddress(Address address);

    int deleteAddress(int id);

}
