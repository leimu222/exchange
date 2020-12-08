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
 * @date 2020-12-08 18:16:02
 * Description: [community单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CommunityTraderProfitRecordServiceImplTest  {

	@Autowired
	private ICommunityTraderProfitRecordService communityTraderProfitRecordService;

	/**
	* 查询community
	*/
	@Test
	public void selectCommunityTraderProfitRecordById() {
		CommunityTraderProfitRecord communityTraderProfitRecord = communityTraderProfitRecordService.selectCommunityTraderProfitRecordById(1);
		System.out.println(communityTraderProfitRecord.toString());
	}

	/**
	* 查询community列表
	*/
	@Test
	public void selectCommunityTraderProfitRecordList() {
		List<CommunityTraderProfitRecord> list = communityTraderProfitRecordService.selectCommunityTraderProfitRecordList(new CommunityTraderProfitRecord());
		for(CommunityTraderProfitRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增community
	*/
	@Test
	public void insertCommunityTraderProfitRecord() {
		for (int i = 1;i < 30; i++) {
			CommunityTraderProfitRecord communityTraderProfitRecord = new CommunityTraderProfitRecord();
			communityTraderProfitRecordService.insertCommunityTraderProfitRecord(communityTraderProfitRecord);
		}
	}

	/**
	* 修改community
	*/
	@Test
	public void updateCommunityTraderProfitRecord() {
		CommunityTraderProfitRecord communityTraderProfitRecord = new CommunityTraderProfitRecord();
		communityTraderProfitRecordService.updateCommunityTraderProfitRecord(communityTraderProfitRecord);
	}

	/**
	* 批量删除community
	*/
	@Test
	public void deleteCommunityTraderProfitRecordByIds() {
	}

	/**
	* 删除community信息
	*/
	@Test
	public void deleteCommunityTraderProfitRecordById() {
	}

}
