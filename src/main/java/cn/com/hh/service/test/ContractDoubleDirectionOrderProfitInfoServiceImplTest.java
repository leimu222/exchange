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
public class ContractDoubleDirectionOrderProfitInfoServiceImplTest  {

	@Autowired
	private IContractDoubleDirectionOrderProfitInfoService contractDoubleDirectionOrderProfitInfoService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractDoubleDirectionOrderProfitInfoById() {
		ContractDoubleDirectionOrderProfitInfo contractDoubleDirectionOrderProfitInfo = contractDoubleDirectionOrderProfitInfoService.selectContractDoubleDirectionOrderProfitInfoById(1);
		System.out.println(contractDoubleDirectionOrderProfitInfo.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractDoubleDirectionOrderProfitInfoList() {
		List<ContractDoubleDirectionOrderProfitInfo> list = contractDoubleDirectionOrderProfitInfoService.selectContractDoubleDirectionOrderProfitInfoList(new ContractDoubleDirectionOrderProfitInfo());
		for(ContractDoubleDirectionOrderProfitInfo model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractDoubleDirectionOrderProfitInfo() {
		for (int i = 1;i < 30; i++) {
			ContractDoubleDirectionOrderProfitInfo contractDoubleDirectionOrderProfitInfo = new ContractDoubleDirectionOrderProfitInfo();
			contractDoubleDirectionOrderProfitInfoService.insertContractDoubleDirectionOrderProfitInfo(contractDoubleDirectionOrderProfitInfo);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractDoubleDirectionOrderProfitInfo() {
		ContractDoubleDirectionOrderProfitInfo contractDoubleDirectionOrderProfitInfo = new ContractDoubleDirectionOrderProfitInfo();
		contractDoubleDirectionOrderProfitInfoService.updateContractDoubleDirectionOrderProfitInfo(contractDoubleDirectionOrderProfitInfo);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractDoubleDirectionOrderProfitInfoByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractDoubleDirectionOrderProfitInfoById() {
	}

}
