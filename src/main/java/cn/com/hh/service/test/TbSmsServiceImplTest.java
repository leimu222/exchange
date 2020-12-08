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
 * Description: [tb单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TbSmsServiceImplTest  {

	@Autowired
	private ITbSmsService tbSmsService;

	/**
	* 查询tb
	*/
	@Test
	public void selectTbSmsById() {
		TbSms tbSms = tbSmsService.selectTbSmsById(1);
		System.out.println(tbSms.toString());
	}

	/**
	* 查询tb列表
	*/
	@Test
	public void selectTbSmsList() {
		List<TbSms> list = tbSmsService.selectTbSmsList(new TbSms());
		for(TbSms model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增tb
	*/
	@Test
	public void insertTbSms() {
		for (int i = 1;i < 30; i++) {
			TbSms tbSms = new TbSms();
			tbSmsService.insertTbSms(tbSms);
		}
	}

	/**
	* 修改tb
	*/
	@Test
	public void updateTbSms() {
		TbSms tbSms = new TbSms();
		tbSmsService.updateTbSms(tbSms);
	}

	/**
	* 批量删除tb
	*/
	@Test
	public void deleteTbSmsByIds() {
	}

	/**
	* 删除tb信息
	*/
	@Test
	public void deleteTbSmsById() {
	}

}
