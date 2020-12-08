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
public class MemberApplyNodeServiceImplTest  {

	@Autowired
	private IMemberApplyNodeService memberApplyNodeService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberApplyNodeById() {
		MemberApplyNode memberApplyNode = memberApplyNodeService.selectMemberApplyNodeById(1);
		System.out.println(memberApplyNode.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberApplyNodeList() {
		List<MemberApplyNode> list = memberApplyNodeService.selectMemberApplyNodeList(new MemberApplyNode());
		for(MemberApplyNode model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberApplyNode() {
		for (int i = 1;i < 30; i++) {
			MemberApplyNode memberApplyNode = new MemberApplyNode();
			memberApplyNodeService.insertMemberApplyNode(memberApplyNode);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberApplyNode() {
		MemberApplyNode memberApplyNode = new MemberApplyNode();
		memberApplyNodeService.updateMemberApplyNode(memberApplyNode);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberApplyNodeByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberApplyNodeById() {
	}

}
