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
 * @date 2020-12-08 18:16:05
 * Description: [loss单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LossThresholdServiceImplTest  {

	@Autowired
	private ILossThresholdService lossThresholdService;

	/**
	* 查询loss
	*/
	@Test
	public void selectLossThresholdById() {
		LossThreshold lossThreshold = lossThresholdService.selectLossThresholdById(1);
		System.out.println(lossThreshold.toString());
	}

	/**
	* 查询loss列表
	*/
	@Test
	public void selectLossThresholdList() {
		List<LossThreshold> list = lossThresholdService.selectLossThresholdList(new LossThreshold());
		for(LossThreshold model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增loss
	*/
	@Test
	public void insertLossThreshold() {
		for (int i = 1;i < 30; i++) {
			LossThreshold lossThreshold = new LossThreshold();
			lossThresholdService.insertLossThreshold(lossThreshold);
		}
	}

	/**
	* 修改loss
	*/
	@Test
	public void updateLossThreshold() {
		LossThreshold lossThreshold = new LossThreshold();
		lossThresholdService.updateLossThreshold(lossThreshold);
	}

	/**
	* 批量删除loss
	*/
	@Test
	public void deleteLossThresholdByIds() {
	}

	/**
	* 删除loss信息
	*/
	@Test
	public void deleteLossThresholdById() {
	}

}
