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
 * Description: [lever单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LeverWalletTransferRecordServiceImplTest  {

	@Autowired
	private ILeverWalletTransferRecordService leverWalletTransferRecordService;

	/**
	* 查询lever
	*/
	@Test
	public void selectLeverWalletTransferRecordById() {
		LeverWalletTransferRecord leverWalletTransferRecord = leverWalletTransferRecordService.selectLeverWalletTransferRecordById(1);
		System.out.println(leverWalletTransferRecord.toString());
	}

	/**
	* 查询lever列表
	*/
	@Test
	public void selectLeverWalletTransferRecordList() {
		List<LeverWalletTransferRecord> list = leverWalletTransferRecordService.selectLeverWalletTransferRecordList(new LeverWalletTransferRecord());
		for(LeverWalletTransferRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增lever
	*/
	@Test
	public void insertLeverWalletTransferRecord() {
		for (int i = 1;i < 30; i++) {
			LeverWalletTransferRecord leverWalletTransferRecord = new LeverWalletTransferRecord();
			leverWalletTransferRecordService.insertLeverWalletTransferRecord(leverWalletTransferRecord);
		}
	}

	/**
	* 修改lever
	*/
	@Test
	public void updateLeverWalletTransferRecord() {
		LeverWalletTransferRecord leverWalletTransferRecord = new LeverWalletTransferRecord();
		leverWalletTransferRecordService.updateLeverWalletTransferRecord(leverWalletTransferRecord);
	}

	/**
	* 批量删除lever
	*/
	@Test
	public void deleteLeverWalletTransferRecordByIds() {
	}

	/**
	* 删除lever信息
	*/
	@Test
	public void deleteLeverWalletTransferRecordById() {
	}

}
