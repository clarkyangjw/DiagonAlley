package com.clark.mapper;

import com.clark.pojo.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressMapper {

    List<Address> getAddresses();

    Address getAddressById(int id);

    Address getAddressByPostcode(String postcode);

    int addAddress(Address address);

    int updateAddress(Address address);

    int deleteAddress(int id);

}
