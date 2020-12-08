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
 * Description: [sign单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SignServiceImplTest  {

	@Autowired
	private ISignService signService;

	/**
	* 查询sign
	*/
	@Test
	public void selectSignById() {
		Sign sign = signService.selectSignById(1);
		System.out.println(sign.toString());
	}

	/**
	* 查询sign列表
	*/
	@Test
	public void selectSignList() {
		List<Sign> list = signService.selectSignList(new Sign());
		for(Sign model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增sign
	*/
	@Test
	public void insertSign() {
		for (int i = 1;i < 30; i++) {
			Sign sign = new Sign();
			signService.insertSign(sign);
		}
	}

	/**
	* 修改sign
	*/
	@Test
	public void updateSign() {
		Sign sign = new Sign();
		signService.updateSign(sign);
	}

	/**
	* 批量删除sign
	*/
	@Test
	public void deleteSignByIds() {
	}

	/**
	* 删除sign信息
	*/
	@Test
	public void deleteSignById() {
	}

}
