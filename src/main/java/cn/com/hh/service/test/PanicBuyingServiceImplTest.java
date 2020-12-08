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
public class PanicBuyingServiceImplTest  {

	@Autowired
	private IPanicBuyingService panicBuyingService;

	/**
	* 查询panic
	*/
	@Test
	public void selectPanicBuyingById() {
		PanicBuying panicBuying = panicBuyingService.selectPanicBuyingById(1);
		System.out.println(panicBuying.toString());
	}

	/**
	* 查询panic列表
	*/
	@Test
	public void selectPanicBuyingList() {
		List<PanicBuying> list = panicBuyingService.selectPanicBuyingList(new PanicBuying());
		for(PanicBuying model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增panic
	*/
	@Test
	public void insertPanicBuying() {
		for (int i = 1;i < 30; i++) {
			PanicBuying panicBuying = new PanicBuying();
			panicBuyingService.insertPanicBuying(panicBuying);
		}
	}

	/**
	* 修改panic
	*/
	@Test
	public void updatePanicBuying() {
		PanicBuying panicBuying = new PanicBuying();
		panicBuyingService.updatePanicBuying(panicBuying);
	}

	/**
	* 批量删除panic
	*/
	@Test
	public void deletePanicBuyingByIds() {
	}

	/**
	* 删除panic信息
	*/
	@Test
	public void deletePanicBuyingById() {
	}

}
