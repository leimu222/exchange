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
public class MemberAssetsStatisticsRecordsServiceImplTest  {

	@Autowired
	private IMemberAssetsStatisticsRecordsService memberAssetsStatisticsRecordsService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberAssetsStatisticsRecordsById() {
		MemberAssetsStatisticsRecords memberAssetsStatisticsRecords = memberAssetsStatisticsRecordsService.selectMemberAssetsStatisticsRecordsById(1);
		System.out.println(memberAssetsStatisticsRecords.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberAssetsStatisticsRecordsList() {
		List<MemberAssetsStatisticsRecords> list = memberAssetsStatisticsRecordsService.selectMemberAssetsStatisticsRecordsList(new MemberAssetsStatisticsRecords());
		for(MemberAssetsStatisticsRecords model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberAssetsStatisticsRecords() {
		for (int i = 1;i < 30; i++) {
			MemberAssetsStatisticsRecords memberAssetsStatisticsRecords = new MemberAssetsStatisticsRecords();
			memberAssetsStatisticsRecordsService.insertMemberAssetsStatisticsRecords(memberAssetsStatisticsRecords);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberAssetsStatisticsRecords() {
		MemberAssetsStatisticsRecords memberAssetsStatisticsRecords = new MemberAssetsStatisticsRecords();
		memberAssetsStatisticsRecordsService.updateMemberAssetsStatisticsRecords(memberAssetsStatisticsRecords);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberAssetsStatisticsRecordsByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberAssetsStatisticsRecordsById() {
	}

}
