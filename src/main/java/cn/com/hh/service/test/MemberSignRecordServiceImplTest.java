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
public class MemberSignRecordServiceImplTest  {

	@Autowired
	private IMemberSignRecordService memberSignRecordService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberSignRecordById() {
		MemberSignRecord memberSignRecord = memberSignRecordService.selectMemberSignRecordById(1);
		System.out.println(memberSignRecord.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberSignRecordList() {
		List<MemberSignRecord> list = memberSignRecordService.selectMemberSignRecordList(new MemberSignRecord());
		for(MemberSignRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberSignRecord() {
		for (int i = 1;i < 30; i++) {
			MemberSignRecord memberSignRecord = new MemberSignRecord();
			memberSignRecordService.insertMemberSignRecord(memberSignRecord);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberSignRecord() {
		MemberSignRecord memberSignRecord = new MemberSignRecord();
		memberSignRecordService.updateMemberSignRecord(memberSignRecord);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberSignRecordByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberSignRecordById() {
	}

}
