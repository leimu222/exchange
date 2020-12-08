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
 * Description: [payment单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentHistoryServiceImplTest  {

	@Autowired
	private IPaymentHistoryService paymentHistoryService;

	/**
	* 查询payment
	*/
	@Test
	public void selectPaymentHistoryById() {
		PaymentHistory paymentHistory = paymentHistoryService.selectPaymentHistoryById(1);
		System.out.println(paymentHistory.toString());
	}

	/**
	* 查询payment列表
	*/
	@Test
	public void selectPaymentHistoryList() {
		List<PaymentHistory> list = paymentHistoryService.selectPaymentHistoryList(new PaymentHistory());
		for(PaymentHistory model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增payment
	*/
	@Test
	public void insertPaymentHistory() {
		for (int i = 1;i < 30; i++) {
			PaymentHistory paymentHistory = new PaymentHistory();
			paymentHistoryService.insertPaymentHistory(paymentHistory);
		}
	}

	/**
	* 修改payment
	*/
	@Test
	public void updatePaymentHistory() {
		PaymentHistory paymentHistory = new PaymentHistory();
		paymentHistoryService.updatePaymentHistory(paymentHistory);
	}

	/**
	* 批量删除payment
	*/
	@Test
	public void deletePaymentHistoryByIds() {
	}

	/**
	* 删除payment信息
	*/
	@Test
	public void deletePaymentHistoryById() {
	}

}
