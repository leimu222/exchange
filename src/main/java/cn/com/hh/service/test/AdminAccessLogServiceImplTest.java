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
 * @date 2020-12-08 18:16:00
 * Description: [admin单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminAccessLogServiceImplTest  {

	@Autowired
	private IAdminAccessLogService adminAccessLogService;

	/**
	* 查询admin
	*/
	@Test
	public void selectAdminAccessLogById() {
		AdminAccessLog adminAccessLog = adminAccessLogService.selectAdminAccessLogById(1);
		System.out.println(adminAccessLog.toString());
	}

	/**
	* 查询admin列表
	*/
	@Test
	public void selectAdminAccessLogList() {
		List<AdminAccessLog> list = adminAccessLogService.selectAdminAccessLogList(new AdminAccessLog());
		for(AdminAccessLog model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增admin
	*/
	@Test
	public void insertAdminAccessLog() {
		for (int i = 1;i < 30; i++) {
			AdminAccessLog adminAccessLog = new AdminAccessLog();
			adminAccessLogService.insertAdminAccessLog(adminAccessLog);
		}
	}

	/**
	* 修改admin
	*/
	@Test
	public void updateAdminAccessLog() {
		AdminAccessLog adminAccessLog = new AdminAccessLog();
		adminAccessLogService.updateAdminAccessLog(adminAccessLog);
	}

	/**
	* 批量删除admin
	*/
	@Test
	public void deleteAdminAccessLogByIds() {
	}

	/**
	* 删除admin信息
	*/
	@Test
	public void deleteAdminAccessLogById() {
	}

}
