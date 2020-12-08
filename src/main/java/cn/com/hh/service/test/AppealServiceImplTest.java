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
 * Description: [appeal单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppealServiceImplTest  {

	@Autowired
	private IAppealService appealService;

	/**
	* 查询appeal
	*/
	@Test
	public void selectAppealById() {
		Appeal appeal = appealService.selectAppealById(1);
		System.out.println(appeal.toString());
	}

	/**
	* 查询appeal列表
	*/
	@Test
	public void selectAppealList() {
		List<Appeal> list = appealService.selectAppealList(new Appeal());
		for(Appeal model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增appeal
	*/
	@Test
	public void insertAppeal() {
		for (int i = 1;i < 30; i++) {
			Appeal appeal = new Appeal();
			appealService.insertAppeal(appeal);
		}
	}

	/**
	* 修改appeal
	*/
	@Test
	public void updateAppeal() {
		Appeal appeal = new Appeal();
		appealService.updateAppeal(appeal);
	}

	/**
	* 批量删除appeal
	*/
	@Test
	public void deleteAppealByIds() {
	}

	/**
	* 删除appeal信息
	*/
	@Test
	public void deleteAppealById() {
	}

}
