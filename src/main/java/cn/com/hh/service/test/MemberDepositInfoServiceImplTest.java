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
 * @date 2020-12-08 18:16:06
 * Description: [member单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberDepositInfoServiceImplTest  {

	@Autowired
	private IMemberDepositInfoService memberDepositInfoService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberDepositInfoById() {
		MemberDepositInfo memberDepositInfo = memberDepositInfoService.selectMemberDepositInfoById(1);
		System.out.println(memberDepositInfo.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberDepositInfoList() {
		List<MemberDepositInfo> list = memberDepositInfoService.selectMemberDepositInfoList(new MemberDepositInfo());
		for(MemberDepositInfo model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberDepositInfo() {
		for (int i = 1;i < 30; i++) {
			MemberDepositInfo memberDepositInfo = new MemberDepositInfo();
			memberDepositInfoService.insertMemberDepositInfo(memberDepositInfo);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberDepositInfo() {
		MemberDepositInfo memberDepositInfo = new MemberDepositInfo();
		memberDepositInfoService.updateMemberDepositInfo(memberDepositInfo);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberDepositInfoByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberDepositInfoById() {
	}

}
