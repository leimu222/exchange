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
public class MemberTrustGatewayInfoServiceImplTest  {

	@Autowired
	private IMemberTrustGatewayInfoService memberTrustGatewayInfoService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberTrustGatewayInfoById() {
		MemberTrustGatewayInfo memberTrustGatewayInfo = memberTrustGatewayInfoService.selectMemberTrustGatewayInfoById(1);
		System.out.println(memberTrustGatewayInfo.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberTrustGatewayInfoList() {
		List<MemberTrustGatewayInfo> list = memberTrustGatewayInfoService.selectMemberTrustGatewayInfoList(new MemberTrustGatewayInfo());
		for(MemberTrustGatewayInfo model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberTrustGatewayInfo() {
		for (int i = 1;i < 30; i++) {
			MemberTrustGatewayInfo memberTrustGatewayInfo = new MemberTrustGatewayInfo();
			memberTrustGatewayInfoService.insertMemberTrustGatewayInfo(memberTrustGatewayInfo);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberTrustGatewayInfo() {
		MemberTrustGatewayInfo memberTrustGatewayInfo = new MemberTrustGatewayInfo();
		memberTrustGatewayInfoService.updateMemberTrustGatewayInfo(memberTrustGatewayInfo);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberTrustGatewayInfoByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberTrustGatewayInfoById() {
	}

}
