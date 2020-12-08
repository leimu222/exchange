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
 * @date 2020-12-08 18:16:04
 * Description: [fee单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FeeStasticServiceImplTest  {

	@Autowired
	private IFeeStasticService feeStasticService;

	/**
	* 查询fee
	*/
	@Test
	public void selectFeeStasticById() {
		FeeStastic feeStastic = feeStasticService.selectFeeStasticById(1);
		System.out.println(feeStastic.toString());
	}

	/**
	* 查询fee列表
	*/
	@Test
	public void selectFeeStasticList() {
		List<FeeStastic> list = feeStasticService.selectFeeStasticList(new FeeStastic());
		for(FeeStastic model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增fee
	*/
	@Test
	public void insertFeeStastic() {
		for (int i = 1;i < 30; i++) {
			FeeStastic feeStastic = new FeeStastic();
			feeStasticService.insertFeeStastic(feeStastic);
		}
	}

	/**
	* 修改fee
	*/
	@Test
	public void updateFeeStastic() {
		FeeStastic feeStastic = new FeeStastic();
		feeStasticService.updateFeeStastic(feeStastic);
	}

	/**
	* 批量删除fee
	*/
	@Test
	public void deleteFeeStasticByIds() {
	}

	/**
	* 删除fee信息
	*/
	@Test
	public void deleteFeeStasticById() {
	}

}
