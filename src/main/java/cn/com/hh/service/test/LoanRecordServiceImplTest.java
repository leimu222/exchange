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
 * Description: [loan单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoanRecordServiceImplTest  {

	@Autowired
	private ILoanRecordService loanRecordService;

	/**
	* 查询loan
	*/
	@Test
	public void selectLoanRecordById() {
		LoanRecord loanRecord = loanRecordService.selectLoanRecordById(1);
		System.out.println(loanRecord.toString());
	}

	/**
	* 查询loan列表
	*/
	@Test
	public void selectLoanRecordList() {
		List<LoanRecord> list = loanRecordService.selectLoanRecordList(new LoanRecord());
		for(LoanRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增loan
	*/
	@Test
	public void insertLoanRecord() {
		for (int i = 1;i < 30; i++) {
			LoanRecord loanRecord = new LoanRecord();
			loanRecordService.insertLoanRecord(loanRecord);
		}
	}

	/**
	* 修改loan
	*/
	@Test
	public void updateLoanRecord() {
		LoanRecord loanRecord = new LoanRecord();
		loanRecordService.updateLoanRecord(loanRecord);
	}

	/**
	* 批量删除loan
	*/
	@Test
	public void deleteLoanRecordByIds() {
	}

	/**
	* 删除loan信息
	*/
	@Test
	public void deleteLoanRecordById() {
	}

}
