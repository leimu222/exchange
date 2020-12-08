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
public class LoanInfoServiceImplTest  {

	@Autowired
	private ILoanInfoService loanInfoService;

	/**
	* 查询loan
	*/
	@Test
	public void selectLoanInfoById() {
		LoanInfo loanInfo = loanInfoService.selectLoanInfoById(1);
		System.out.println(loanInfo.toString());
	}

	/**
	* 查询loan列表
	*/
	@Test
	public void selectLoanInfoList() {
		List<LoanInfo> list = loanInfoService.selectLoanInfoList(new LoanInfo());
		for(LoanInfo model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增loan
	*/
	@Test
	public void insertLoanInfo() {
		for (int i = 1;i < 30; i++) {
			LoanInfo loanInfo = new LoanInfo();
			loanInfoService.insertLoanInfo(loanInfo);
		}
	}

	/**
	* 修改loan
	*/
	@Test
	public void updateLoanInfo() {
		LoanInfo loanInfo = new LoanInfo();
		loanInfoService.updateLoanInfo(loanInfo);
	}

	/**
	* 批量删除loan
	*/
	@Test
	public void deleteLoanInfoByIds() {
	}

	/**
	* 删除loan信息
	*/
	@Test
	public void deleteLoanInfoById() {
	}

}
