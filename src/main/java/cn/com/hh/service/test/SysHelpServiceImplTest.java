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
public class SysHelpServiceImplTest  {

	@Autowired
	private ISysHelpService sysHelpService;

	/**
	* 查询sys
	*/
	@Test
	public void selectSysHelpById() {
		SysHelp sysHelp = sysHelpService.selectSysHelpById(1);
		System.out.println(sysHelp.toString());
	}

	/**
	* 查询sys列表
	*/
	@Test
	public void selectSysHelpList() {
		List<SysHelp> list = sysHelpService.selectSysHelpList(new SysHelp());
		for(SysHelp model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增sys
	*/
	@Test
	public void insertSysHelp() {
		for (int i = 1;i < 30; i++) {
			SysHelp sysHelp = new SysHelp();
			sysHelpService.insertSysHelp(sysHelp);
		}
	}

	/**
	* 修改sys
	*/
	@Test
	public void updateSysHelp() {
		SysHelp sysHelp = new SysHelp();
		sysHelpService.updateSysHelp(sysHelp);
	}

	/**
	* 批量删除sys
	*/
	@Test
	public void deleteSysHelpByIds() {
	}

	/**
	* 删除sys信息
	*/
	@Test
	public void deleteSysHelpById() {
	}

}
