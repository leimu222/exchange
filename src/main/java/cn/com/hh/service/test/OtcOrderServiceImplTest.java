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
 * @date 2020-12-08 18:16:07
 * Description: [otc单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OtcOrderServiceImplTest  {

	@Autowired
	private IOtcOrderService otcOrderService;

	/**
	* 查询otc
	*/
	@Test
	public void selectOtcOrderById() {
		OtcOrder otcOrder = otcOrderService.selectOtcOrderById(1);
		System.out.println(otcOrder.toString());
	}

	/**
	* 查询otc列表
	*/
	@Test
	public void selectOtcOrderList() {
		List<OtcOrder> list = otcOrderService.selectOtcOrderList(new OtcOrder());
		for(OtcOrder model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增otc
	*/
	@Test
	public void insertOtcOrder() {
		for (int i = 1;i < 30; i++) {
			OtcOrder otcOrder = new OtcOrder();
			otcOrderService.insertOtcOrder(otcOrder);
		}
	}

	/**
	* 修改otc
	*/
	@Test
	public void updateOtcOrder() {
		OtcOrder otcOrder = new OtcOrder();
		otcOrderService.updateOtcOrder(otcOrder);
	}

	/**
	* 批量删除otc
	*/
	@Test
	public void deleteOtcOrderByIds() {
	}

	/**
	* 删除otc信息
	*/
	@Test
	public void deleteOtcOrderById() {
	}

}
