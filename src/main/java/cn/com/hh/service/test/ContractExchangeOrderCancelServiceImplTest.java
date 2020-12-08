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
 * @date 2020-12-08 18:16:03
 * Description: [contract单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ContractExchangeOrderCancelServiceImplTest  {

	@Autowired
	private IContractExchangeOrderCancelService contractExchangeOrderCancelService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractExchangeOrderCancelById() {
		ContractExchangeOrderCancel contractExchangeOrderCancel = contractExchangeOrderCancelService.selectContractExchangeOrderCancelById(1);
		System.out.println(contractExchangeOrderCancel.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractExchangeOrderCancelList() {
		List<ContractExchangeOrderCancel> list = contractExchangeOrderCancelService.selectContractExchangeOrderCancelList(new ContractExchangeOrderCancel());
		for(ContractExchangeOrderCancel model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractExchangeOrderCancel() {
		for (int i = 1;i < 30; i++) {
			ContractExchangeOrderCancel contractExchangeOrderCancel = new ContractExchangeOrderCancel();
			contractExchangeOrderCancelService.insertContractExchangeOrderCancel(contractExchangeOrderCancel);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractExchangeOrderCancel() {
		ContractExchangeOrderCancel contractExchangeOrderCancel = new ContractExchangeOrderCancel();
		contractExchangeOrderCancelService.updateContractExchangeOrderCancel(contractExchangeOrderCancel);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractExchangeOrderCancelByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractExchangeOrderCancelById() {
	}

}
