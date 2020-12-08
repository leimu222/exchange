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
 * Description: [sys单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysAddressPoolServiceImplTest  {

	@Autowired
	private ISysAddressPoolService sysAddressPoolService;

	/**
	* 查询sys
	*/
	@Test
	public void selectSysAddressPoolById() {
		SysAddressPool sysAddressPool = sysAddressPoolService.selectSysAddressPoolById(1);
		System.out.println(sysAddressPool.toString());
	}

	/**
	* 查询sys列表
	*/
	@Test
	public void selectSysAddressPoolList() {
		List<SysAddressPool> list = sysAddressPoolService.selectSysAddressPoolList(new SysAddressPool());
		for(SysAddressPool model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增sys
	*/
	@Test
	public void insertSysAddressPool() {
		for (int i = 1;i < 30; i++) {
			SysAddressPool sysAddressPool = new SysAddressPool();
			sysAddressPoolService.insertSysAddressPool(sysAddressPool);
		}
	}

	/**
	* 修改sys
	*/
	@Test
	public void updateSysAddressPool() {
		SysAddressPool sysAddressPool = new SysAddressPool();
		sysAddressPoolService.updateSysAddressPool(sysAddressPool);
	}

	/**
	* 批量删除sys
	*/
	@Test
	public void deleteSysAddressPoolByIds() {
	}

	/**
	* 删除sys信息
	*/
	@Test
	public void deleteSysAddressPoolById() {
	}

}
