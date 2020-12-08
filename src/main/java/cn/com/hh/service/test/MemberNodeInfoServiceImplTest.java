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
public class MemberNodeInfoServiceImplTest  {

	@Autowired
	private IMemberNodeInfoService memberNodeInfoService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberNodeInfoById() {
		MemberNodeInfo memberNodeInfo = memberNodeInfoService.selectMemberNodeInfoById(1);
		System.out.println(memberNodeInfo.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberNodeInfoList() {
		List<MemberNodeInfo> list = memberNodeInfoService.selectMemberNodeInfoList(new MemberNodeInfo());
		for(MemberNodeInfo model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberNodeInfo() {
		for (int i = 1;i < 30; i++) {
			MemberNodeInfo memberNodeInfo = new MemberNodeInfo();
			memberNodeInfoService.insertMemberNodeInfo(memberNodeInfo);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberNodeInfo() {
		MemberNodeInfo memberNodeInfo = new MemberNodeInfo();
		memberNodeInfoService.updateMemberNodeInfo(memberNodeInfo);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberNodeInfoByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberNodeInfoById() {
	}

}
