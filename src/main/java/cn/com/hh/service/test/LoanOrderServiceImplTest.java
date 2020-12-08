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
public class LoanOrderServiceImplTest  {

	@Autowired
	private ILoanOrderService loanOrderService;

	/**
	* 查询loan
	*/
	@Test
	public void selectLoanOrderById() {
		LoanOrder loanOrder = loanOrderService.selectLoanOrderById(1);
		System.out.println(loanOrder.toString());
	}

	/**
	* 查询loan列表
	*/
	@Test
	public void selectLoanOrderList() {
		List<LoanOrder> list = loanOrderService.selectLoanOrderList(new LoanOrder());
		for(LoanOrder model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增loan
	*/
	@Test
	public void insertLoanOrder() {
		for (int i = 1;i < 30; i++) {
			LoanOrder loanOrder = new LoanOrder();
			loanOrderService.insertLoanOrder(loanOrder);
		}
	}

	/**
	* 修改loan
	*/
	@Test
	public void updateLoanOrder() {
		LoanOrder loanOrder = new LoanOrder();
		loanOrderService.updateLoanOrder(loanOrder);
	}

	/**
	* 批量删除loan
	*/
	@Test
	public void deleteLoanOrderByIds() {
	}

	/**
	* 删除loan信息
	*/
	@Test
	public void deleteLoanOrderById() {
	}

}
