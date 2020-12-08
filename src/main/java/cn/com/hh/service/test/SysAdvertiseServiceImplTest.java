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
 * Description: [sys单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysAdvertiseServiceImplTest  {

	@Autowired
	private ISysAdvertiseService sysAdvertiseService;

	/**
	* 查询sys
	*/
	@Test
	public void selectSysAdvertiseById() {
		SysAdvertise sysAdvertise = sysAdvertiseService.selectSysAdvertiseById(1);
		System.out.println(sysAdvertise.toString());
	}

	/**
	* 查询sys列表
	*/
	@Test
	public void selectSysAdvertiseList() {
		List<SysAdvertise> list = sysAdvertiseService.selectSysAdvertiseList(new SysAdvertise());
		for(SysAdvertise model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增sys
	*/
	@Test
	public void insertSysAdvertise() {
		for (int i = 1;i < 30; i++) {
			SysAdvertise sysAdvertise = new SysAdvertise();
			sysAdvertiseService.insertSysAdvertise(sysAdvertise);
		}
	}

	/**
	* 修改sys
	*/
	@Test
	public void updateSysAdvertise() {
		SysAdvertise sysAdvertise = new SysAdvertise();
		sysAdvertiseService.updateSysAdvertise(sysAdvertise);
	}

	/**
	* 批量删除sys
	*/
	@Test
	public void deleteSysAdvertiseByIds() {
	}

	/**
	* 删除sys信息
	*/
	@Test
	public void deleteSysAdvertiseById() {
	}

}
