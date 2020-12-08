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
public class MemberBuyCoinInfoServiceImplTest  {

	@Autowired
	private IMemberBuyCoinInfoService memberBuyCoinInfoService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberBuyCoinInfoById() {
		MemberBuyCoinInfo memberBuyCoinInfo = memberBuyCoinInfoService.selectMemberBuyCoinInfoById(1);
		System.out.println(memberBuyCoinInfo.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberBuyCoinInfoList() {
		List<MemberBuyCoinInfo> list = memberBuyCoinInfoService.selectMemberBuyCoinInfoList(new MemberBuyCoinInfo());
		for(MemberBuyCoinInfo model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberBuyCoinInfo() {
		for (int i = 1;i < 30; i++) {
			MemberBuyCoinInfo memberBuyCoinInfo = new MemberBuyCoinInfo();
			memberBuyCoinInfoService.insertMemberBuyCoinInfo(memberBuyCoinInfo);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberBuyCoinInfo() {
		MemberBuyCoinInfo memberBuyCoinInfo = new MemberBuyCoinInfo();
		memberBuyCoinInfoService.updateMemberBuyCoinInfo(memberBuyCoinInfo);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberBuyCoinInfoByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberBuyCoinInfoById() {
	}

}
