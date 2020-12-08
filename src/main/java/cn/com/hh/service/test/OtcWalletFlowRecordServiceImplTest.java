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
 * Description: [otc单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OtcWalletFlowRecordServiceImplTest  {

	@Autowired
	private IOtcWalletFlowRecordService otcWalletFlowRecordService;

	/**
	* 查询otc
	*/
	@Test
	public void selectOtcWalletFlowRecordById() {
		OtcWalletFlowRecord otcWalletFlowRecord = otcWalletFlowRecordService.selectOtcWalletFlowRecordById(1);
		System.out.println(otcWalletFlowRecord.toString());
	}

	/**
	* 查询otc列表
	*/
	@Test
	public void selectOtcWalletFlowRecordList() {
		List<OtcWalletFlowRecord> list = otcWalletFlowRecordService.selectOtcWalletFlowRecordList(new OtcWalletFlowRecord());
		for(OtcWalletFlowRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增otc
	*/
	@Test
	public void insertOtcWalletFlowRecord() {
		for (int i = 1;i < 30; i++) {
			OtcWalletFlowRecord otcWalletFlowRecord = new OtcWalletFlowRecord();
			otcWalletFlowRecordService.insertOtcWalletFlowRecord(otcWalletFlowRecord);
		}
	}

	/**
	* 修改otc
	*/
	@Test
	public void updateOtcWalletFlowRecord() {
		OtcWalletFlowRecord otcWalletFlowRecord = new OtcWalletFlowRecord();
		otcWalletFlowRecordService.updateOtcWalletFlowRecord(otcWalletFlowRecord);
	}

	/**
	* 批量删除otc
	*/
	@Test
	public void deleteOtcWalletFlowRecordByIds() {
	}

	/**
	* 删除otc信息
	*/
	@Test
	public void deleteOtcWalletFlowRecordById() {
	}

}
