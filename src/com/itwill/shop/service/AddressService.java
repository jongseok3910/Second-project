package com.itwill.shop.service;

import java.util.List;

import com.itwill.shop.dao.AddressDao;
import com.itwill.shop.dao.AddressDaoImpl;
import com.itwill.shop.domain.Address;

public class AddressService {

	private AddressDao addressDao;
	
	public AddressService() throws Exception{
		addressDao = new AddressDaoImpl();
	}
	
	public Address findAddressByNo(Integer addressNo) {
		return addressDao.findAddressByNo(addressNo);
	}
	public List<Address> findAddressAll(){
		return addressDao.findAddressAll();
	}
	public int insertAddress(Address address) {
		return addressDao.insertAddress(address);
	}
	public int updateAddressByNo(Address address) {
		return addressDao.updateAddressByNo(address);
	}
	public int deleteAddresByNo(Integer addressNo) {
		return addressDao.deleteAddressByNo(addressNo);
	}
}