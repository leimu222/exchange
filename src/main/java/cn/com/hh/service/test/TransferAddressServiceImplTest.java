package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [transfer单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TransferAddressServiceImplTest  {

	@Autowired
	private ITransferAddressService transferAddressService;

	/**
	* 查询transfer
	*/
	@Test
	public void selectTransferAddressById() {
		TransferAddress transferAddress = transferAddressService.selectTransferAddressById(1);
		System.out.println(transferAddress.toString());
	}

	/**
	* 查询transfer列表
	*/
	@Test
	public void selectTransferAddressList() {
		List<TransferAddress> list = transferAddressService.selectTransferAddressList(new TransferAddress());
		for(TransferAddress model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增transfer
	*/
	@Test
	public void insertTransferAddress() {
		for (int i = 1;i < 30; i++) {
			TransferAddress transferAddress = new TransferAddress();
			transferAddressService.insertTransferAddress(transferAddress);
		}
	}

	/**
	* 修改transfer
	*/
	@Test
	public void updateTransferAddress() {
		TransferAddress transferAddress = new TransferAddress();
		transferAddressService.updateTransferAddress(transferAddress);
	}

	/**
	* 批量删除transfer
	*/
	@Test
	public void deleteTransferAddressByIds() {
	}

	/**
	* 删除transfer信息
	*/
	@Test
	public void deleteTransferAddressById() {
	}

}
