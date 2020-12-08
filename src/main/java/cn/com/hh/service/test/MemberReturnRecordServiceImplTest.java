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
public class MemberReturnRecordServiceImplTest  {

	@Autowired
	private IMemberReturnRecordService memberReturnRecordService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberReturnRecordById() {
		MemberReturnRecord memberReturnRecord = memberReturnRecordService.selectMemberReturnRecordById(1);
		System.out.println(memberReturnRecord.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberReturnRecordList() {
		List<MemberReturnRecord> list = memberReturnRecordService.selectMemberReturnRecordList(new MemberReturnRecord());
		for(MemberReturnRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberReturnRecord() {
		for (int i = 1;i < 30; i++) {
			MemberReturnRecord memberReturnRecord = new MemberReturnRecord();
			memberReturnRecordService.insertMemberReturnRecord(memberReturnRecord);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberReturnRecord() {
		MemberReturnRecord memberReturnRecord = new MemberReturnRecord();
		memberReturnRecordService.updateMemberReturnRecord(memberReturnRecord);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberReturnRecordByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberReturnRecordById() {
	}

}
