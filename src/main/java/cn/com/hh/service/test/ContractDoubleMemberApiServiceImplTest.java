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
public class ContractDoubleMemberApiServiceImplTest  {

	@Autowired
	private IContractDoubleMemberApiService contractDoubleMemberApiService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractDoubleMemberApiById() {
		ContractDoubleMemberApi contractDoubleMemberApi = contractDoubleMemberApiService.selectContractDoubleMemberApiById(1);
		System.out.println(contractDoubleMemberApi.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractDoubleMemberApiList() {
		List<ContractDoubleMemberApi> list = contractDoubleMemberApiService.selectContractDoubleMemberApiList(new ContractDoubleMemberApi());
		for(ContractDoubleMemberApi model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractDoubleMemberApi() {
		for (int i = 1;i < 30; i++) {
			ContractDoubleMemberApi contractDoubleMemberApi = new ContractDoubleMemberApi();
			contractDoubleMemberApiService.insertContractDoubleMemberApi(contractDoubleMemberApi);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractDoubleMemberApi() {
		ContractDoubleMemberApi contractDoubleMemberApi = new ContractDoubleMemberApi();
		contractDoubleMemberApiService.updateContractDoubleMemberApi(contractDoubleMemberApi);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractDoubleMemberApiByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractDoubleMemberApiById() {
	}

}
