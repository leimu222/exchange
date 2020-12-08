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
 * @date 2020-12-08 18:16:02
 * Description: [contract单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ContractCoinNodeServiceImplTest  {

	@Autowired
	private IContractCoinNodeService contractCoinNodeService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractCoinNodeById() {
		ContractCoinNode contractCoinNode = contractCoinNodeService.selectContractCoinNodeById(1);
		System.out.println(contractCoinNode.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractCoinNodeList() {
		List<ContractCoinNode> list = contractCoinNodeService.selectContractCoinNodeList(new ContractCoinNode());
		for(ContractCoinNode model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractCoinNode() {
		for (int i = 1;i < 30; i++) {
			ContractCoinNode contractCoinNode = new ContractCoinNode();
			contractCoinNodeService.insertContractCoinNode(contractCoinNode);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractCoinNode() {
		ContractCoinNode contractCoinNode = new ContractCoinNode();
		contractCoinNodeService.updateContractCoinNode(contractCoinNode);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractCoinNodeByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractCoinNodeById() {
	}

}
