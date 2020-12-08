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
public class ContractExchangeOrderCloseServiceImplTest  {

	@Autowired
	private IContractExchangeOrderCloseService contractExchangeOrderCloseService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractExchangeOrderCloseById() {
		ContractExchangeOrderClose contractExchangeOrderClose = contractExchangeOrderCloseService.selectContractExchangeOrderCloseById(1);
		System.out.println(contractExchangeOrderClose.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractExchangeOrderCloseList() {
		List<ContractExchangeOrderClose> list = contractExchangeOrderCloseService.selectContractExchangeOrderCloseList(new ContractExchangeOrderClose());
		for(ContractExchangeOrderClose model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractExchangeOrderClose() {
		for (int i = 1;i < 30; i++) {
			ContractExchangeOrderClose contractExchangeOrderClose = new ContractExchangeOrderClose();
			contractExchangeOrderCloseService.insertContractExchangeOrderClose(contractExchangeOrderClose);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractExchangeOrderClose() {
		ContractExchangeOrderClose contractExchangeOrderClose = new ContractExchangeOrderClose();
		contractExchangeOrderCloseService.updateContractExchangeOrderClose(contractExchangeOrderClose);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractExchangeOrderCloseByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractExchangeOrderCloseById() {
	}

}
