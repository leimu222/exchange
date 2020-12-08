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
 * @date 2020-12-08 18:16:08
 * Description: [risk单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RiskRecordServiceImplTest  {

	@Autowired
	private IRiskRecordService riskRecordService;

	/**
	* 查询risk
	*/
	@Test
	public void selectRiskRecordById() {
		RiskRecord riskRecord = riskRecordService.selectRiskRecordById(1);
		System.out.println(riskRecord.toString());
	}

	/**
	* 查询risk列表
	*/
	@Test
	public void selectRiskRecordList() {
		List<RiskRecord> list = riskRecordService.selectRiskRecordList(new RiskRecord());
		for(RiskRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增risk
	*/
	@Test
	public void insertRiskRecord() {
		for (int i = 1;i < 30; i++) {
			RiskRecord riskRecord = new RiskRecord();
			riskRecordService.insertRiskRecord(riskRecord);
		}
	}

	/**
	* 修改risk
	*/
	@Test
	public void updateRiskRecord() {
		RiskRecord riskRecord = new RiskRecord();
		riskRecordService.updateRiskRecord(riskRecord);
	}

	/**
	* 批量删除risk
	*/
	@Test
	public void deleteRiskRecordByIds() {
	}

	/**
	* 删除risk信息
	*/
	@Test
	public void deleteRiskRecordById() {
	}

}
