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
public class ContractMemberServiceImplTest  {

	@Autowired
	private IContractMemberService contractMemberService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractMemberById() {
		ContractMember contractMember = contractMemberService.selectContractMemberById(1);
		System.out.println(contractMember.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractMemberList() {
		List<ContractMember> list = contractMemberService.selectContractMemberList(new ContractMember());
		for(ContractMember model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractMember() {
		for (int i = 1;i < 30; i++) {
			ContractMember contractMember = new ContractMember();
			contractMemberService.insertContractMember(contractMember);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractMember() {
		ContractMember contractMember = new ContractMember();
		contractMemberService.updateContractMember(contractMember);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractMemberByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractMemberById() {
	}

}
