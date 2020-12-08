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
 * @date 2020-12-08 18:16:09
 * Description: [whole单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WholeNetInsuranceFundWalletRecordServiceImplTest  {

	@Autowired
	private IWholeNetInsuranceFundWalletRecordService wholeNetInsuranceFundWalletRecordService;

	/**
	* 查询whole
	*/
	@Test
	public void selectWholeNetInsuranceFundWalletRecordById() {
		WholeNetInsuranceFundWalletRecord wholeNetInsuranceFundWalletRecord = wholeNetInsuranceFundWalletRecordService.selectWholeNetInsuranceFundWalletRecordById(1);
		System.out.println(wholeNetInsuranceFundWalletRecord.toString());
	}

	/**
	* 查询whole列表
	*/
	@Test
	public void selectWholeNetInsuranceFundWalletRecordList() {
		List<WholeNetInsuranceFundWalletRecord> list = wholeNetInsuranceFundWalletRecordService.selectWholeNetInsuranceFundWalletRecordList(new WholeNetInsuranceFundWalletRecord());
		for(WholeNetInsuranceFundWalletRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增whole
	*/
	@Test
	public void insertWholeNetInsuranceFundWalletRecord() {
		for (int i = 1;i < 30; i++) {
			WholeNetInsuranceFundWalletRecord wholeNetInsuranceFundWalletRecord = new WholeNetInsuranceFundWalletRecord();
			wholeNetInsuranceFundWalletRecordService.insertWholeNetInsuranceFundWalletRecord(wholeNetInsuranceFundWalletRecord);
		}
	}

	/**
	* 修改whole
	*/
	@Test
	public void updateWholeNetInsuranceFundWalletRecord() {
		WholeNetInsuranceFundWalletRecord wholeNetInsuranceFundWalletRecord = new WholeNetInsuranceFundWalletRecord();
		wholeNetInsuranceFundWalletRecordService.updateWholeNetInsuranceFundWalletRecord(wholeNetInsuranceFundWalletRecord);
	}

	/**
	* 批量删除whole
	*/
	@Test
	public void deleteWholeNetInsuranceFundWalletRecordByIds() {
	}

	/**
	* 删除whole信息
	*/
	@Test
	public void deleteWholeNetInsuranceFundWalletRecordById() {
	}

}
