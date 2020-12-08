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
 * @date 2020-12-08 18:16:05
 * Description: [member单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberAddressServiceImplTest  {

	@Autowired
	private IMemberAddressService memberAddressService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberAddressById() {
		MemberAddress memberAddress = memberAddressService.selectMemberAddressById(1);
		System.out.println(memberAddress.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberAddressList() {
		List<MemberAddress> list = memberAddressService.selectMemberAddressList(new MemberAddress());
		for(MemberAddress model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberAddress() {
		for (int i = 1;i < 30; i++) {
			MemberAddress memberAddress = new MemberAddress();
			memberAddressService.insertMemberAddress(memberAddress);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberAddress() {
		MemberAddress memberAddress = new MemberAddress();
		memberAddressService.updateMemberAddress(memberAddress);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberAddressByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberAddressById() {
	}

}
