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
 * @date 2020-12-08 18:16:01
 * Description: [advertise单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdvertiseServiceImplTest  {

	@Autowired
	private IAdvertiseService advertiseService;

	/**
	* 查询advertise
	*/
	@Test
	public void selectAdvertiseById() {
		Advertise advertise = advertiseService.selectAdvertiseById(1);
		System.out.println(advertise.toString());
	}

	/**
	* 查询advertise列表
	*/
	@Test
	public void selectAdvertiseList() {
		List<Advertise> list = advertiseService.selectAdvertiseList(new Advertise());
		for(Advertise model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增advertise
	*/
	@Test
	public void insertAdvertise() {
		for (int i = 1;i < 30; i++) {
			Advertise advertise = new Advertise();
			advertiseService.insertAdvertise(advertise);
		}
	}

	/**
	* 修改advertise
	*/
	@Test
	public void updateAdvertise() {
		Advertise advertise = new Advertise();
		advertiseService.updateAdvertise(advertise);
	}

	/**
	* 批量删除advertise
	*/
	@Test
	public void deleteAdvertiseByIds() {
	}

	/**
	* 删除advertise信息
	*/
	@Test
	public void deleteAdvertiseById() {
	}

}
