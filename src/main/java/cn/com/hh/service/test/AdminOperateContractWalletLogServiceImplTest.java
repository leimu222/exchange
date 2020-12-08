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
public class AdminOperateContractWalletLogServiceImplTest  {

	@Autowired
	private IAdminOperateContractWalletLogService adminOperateContractWalletLogService;

	/**
	* 查询admin
	*/
	@Test
	public void selectAdminOperateContractWalletLogById() {
		AdminOperateContractWalletLog adminOperateContractWalletLog = adminOperateContractWalletLogService.selectAdminOperateContractWalletLogById(1);
		System.out.println(adminOperateContractWalletLog.toString());
	}

	/**
	* 查询admin列表
	*/
	@Test
	public void selectAdminOperateContractWalletLogList() {
		List<AdminOperateContractWalletLog> list = adminOperateContractWalletLogService.selectAdminOperateContractWalletLogList(new AdminOperateContractWalletLog());
		for(AdminOperateContractWalletLog model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增admin
	*/
	@Test
	public void insertAdminOperateContractWalletLog() {
		for (int i = 1;i < 30; i++) {
			AdminOperateContractWalletLog adminOperateContractWalletLog = new AdminOperateContractWalletLog();
			adminOperateContractWalletLogService.insertAdminOperateContractWalletLog(adminOperateContractWalletLog);
		}
	}

	/**
	* 修改admin
	*/
	@Test
	public void updateAdminOperateContractWalletLog() {
		AdminOperateContractWalletLog adminOperateContractWalletLog = new AdminOperateContractWalletLog();
		adminOperateContractWalletLogService.updateAdminOperateContractWalletLog(adminOperateContractWalletLog);
	}

	/**
	* 批量删除admin
	*/
	@Test
	public void deleteAdminOperateContractWalletLogByIds() {
	}

	/**
	* 删除admin信息
	*/
	@Test
	public void deleteAdminOperateContractWalletLogById() {
	}

}
