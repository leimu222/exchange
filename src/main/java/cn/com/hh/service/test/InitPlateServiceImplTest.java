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
 * Description: [init单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class InitPlateServiceImplTest  {

	@Autowired
	private IInitPlateService initPlateService;

	/**
	* 查询init
	*/
	@Test
	public void selectInitPlateById() {
		InitPlate initPlate = initPlateService.selectInitPlateById(1);
		System.out.println(initPlate.toString());
	}

	/**
	* 查询init列表
	*/
	@Test
	public void selectInitPlateList() {
		List<InitPlate> list = initPlateService.selectInitPlateList(new InitPlate());
		for(InitPlate model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增init
	*/
	@Test
	public void insertInitPlate() {
		for (int i = 1;i < 30; i++) {
			InitPlate initPlate = new InitPlate();
			initPlateService.insertInitPlate(initPlate);
		}
	}

	/**
	* 修改init
	*/
	@Test
	public void updateInitPlate() {
		InitPlate initPlate = new InitPlate();
		initPlateService.updateInitPlate(initPlate);
	}

	/**
	* 批量删除init
	*/
	@Test
	public void deleteInitPlateByIds() {
	}

	/**
	* 删除init信息
	*/
	@Test
	public void deleteInitPlateById() {
	}

}
