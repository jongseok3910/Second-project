package com.itwill.shop.dao;

import java.util.List;

import com.itwill.shop.domain.Address;

public interface AddressDao {
	public List<Address> findAddressByNo(int addressNo);
	public List<Address> findAddressAll();
	public int insertAddress(Address address);
	public int updateAddressByNo(Address address);
	public int deleteAddressByNo(int addressNo);
}
