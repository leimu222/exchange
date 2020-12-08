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
public class MemberAccountOperateRecordServiceImplTest  {

	@Autowired
	private IMemberAccountOperateRecordService memberAccountOperateRecordService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberAccountOperateRecordById() {
		MemberAccountOperateRecord memberAccountOperateRecord = memberAccountOperateRecordService.selectMemberAccountOperateRecordById(1);
		System.out.println(memberAccountOperateRecord.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberAccountOperateRecordList() {
		List<MemberAccountOperateRecord> list = memberAccountOperateRecordService.selectMemberAccountOperateRecordList(new MemberAccountOperateRecord());
		for(MemberAccountOperateRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberAccountOperateRecord() {
		for (int i = 1;i < 30; i++) {
			MemberAccountOperateRecord memberAccountOperateRecord = new MemberAccountOperateRecord();
			memberAccountOperateRecordService.insertMemberAccountOperateRecord(memberAccountOperateRecord);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberAccountOperateRecord() {
		MemberAccountOperateRecord memberAccountOperateRecord = new MemberAccountOperateRecord();
		memberAccountOperateRecordService.updateMemberAccountOperateRecord(memberAccountOperateRecord);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberAccountOperateRecordByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberAccountOperateRecordById() {
	}

}
