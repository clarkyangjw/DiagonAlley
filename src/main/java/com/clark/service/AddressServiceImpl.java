package com.clark.service;

import com.clark.mapper.AddressMapper;
import com.clark.pojo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> getAddresses() {
        return addressMapper.getAddresses();
    }

    @Override
    public Address getAddressById(int id) {
        return addressMapper.getAddressById(id);
    }

    @Override
    public Address getAddressByPostcode(String postcode) {
        return addressMapper.getAddressByPostcode(postcode);
    }

    @Override
    public int addAddress(Address address) {
        return addressMapper.addAddress(address);
    }

    @Override
    public int updateAddress(Address address) {
        return addressMapper.updateAddress(address);
    }

    @Override
    public int deleteAddress(int id) {
        return addressMapper.deleteAddress(id);
    }
}
