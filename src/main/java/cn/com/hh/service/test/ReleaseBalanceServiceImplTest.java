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
 * Description: [release单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ReleaseBalanceServiceImplTest  {

	@Autowired
	private IReleaseBalanceService releaseBalanceService;

	/**
	* 查询release
	*/
	@Test
	public void selectReleaseBalanceById() {
		ReleaseBalance releaseBalance = releaseBalanceService.selectReleaseBalanceById(1);
		System.out.println(releaseBalance.toString());
	}

	/**
	* 查询release列表
	*/
	@Test
	public void selectReleaseBalanceList() {
		List<ReleaseBalance> list = releaseBalanceService.selectReleaseBalanceList(new ReleaseBalance());
		for(ReleaseBalance model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增release
	*/
	@Test
	public void insertReleaseBalance() {
		for (int i = 1;i < 30; i++) {
			ReleaseBalance releaseBalance = new ReleaseBalance();
			releaseBalanceService.insertReleaseBalance(releaseBalance);
		}
	}

	/**
	* 修改release
	*/
	@Test
	public void updateReleaseBalance() {
		ReleaseBalance releaseBalance = new ReleaseBalance();
		releaseBalanceService.updateReleaseBalance(releaseBalance);
	}

	/**
	* 批量删除release
	*/
	@Test
	public void deleteReleaseBalanceByIds() {
	}

	/**
	* 删除release信息
	*/
	@Test
	public void deleteReleaseBalanceById() {
	}

}
