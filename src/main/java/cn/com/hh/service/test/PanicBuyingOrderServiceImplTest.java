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
 * Description: [panic单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PanicBuyingOrderServiceImplTest  {

	@Autowired
	private IPanicBuyingOrderService panicBuyingOrderService;

	/**
	* 查询panic
	*/
	@Test
	public void selectPanicBuyingOrderById() {
		PanicBuyingOrder panicBuyingOrder = panicBuyingOrderService.selectPanicBuyingOrderById(1);
		System.out.println(panicBuyingOrder.toString());
	}

	/**
	* 查询panic列表
	*/
	@Test
	public void selectPanicBuyingOrderList() {
		List<PanicBuyingOrder> list = panicBuyingOrderService.selectPanicBuyingOrderList(new PanicBuyingOrder());
		for(PanicBuyingOrder model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增panic
	*/
	@Test
	public void insertPanicBuyingOrder() {
		for (int i = 1;i < 30; i++) {
			PanicBuyingOrder panicBuyingOrder = new PanicBuyingOrder();
			panicBuyingOrderService.insertPanicBuyingOrder(panicBuyingOrder);
		}
	}

	/**
	* 修改panic
	*/
	@Test
	public void updatePanicBuyingOrder() {
		PanicBuyingOrder panicBuyingOrder = new PanicBuyingOrder();
		panicBuyingOrderService.updatePanicBuyingOrder(panicBuyingOrder);
	}

	/**
	* 批量删除panic
	*/
	@Test
	public void deletePanicBuyingOrderByIds() {
	}

	/**
	* 删除panic信息
	*/
	@Test
	public void deletePanicBuyingOrderById() {
	}

}
