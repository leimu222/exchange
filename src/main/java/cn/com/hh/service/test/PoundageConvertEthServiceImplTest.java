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
 * Description: [poundage单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PoundageConvertEthServiceImplTest  {

	@Autowired
	private IPoundageConvertEthService poundageConvertEthService;

	/**
	* 查询poundage
	*/
	@Test
	public void selectPoundageConvertEthById() {
		PoundageConvertEth poundageConvertEth = poundageConvertEthService.selectPoundageConvertEthById(1);
		System.out.println(poundageConvertEth.toString());
	}

	/**
	* 查询poundage列表
	*/
	@Test
	public void selectPoundageConvertEthList() {
		List<PoundageConvertEth> list = poundageConvertEthService.selectPoundageConvertEthList(new PoundageConvertEth());
		for(PoundageConvertEth model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增poundage
	*/
	@Test
	public void insertPoundageConvertEth() {
		for (int i = 1;i < 30; i++) {
			PoundageConvertEth poundageConvertEth = new PoundageConvertEth();
			poundageConvertEthService.insertPoundageConvertEth(poundageConvertEth);
		}
	}

	/**
	* 修改poundage
	*/
	@Test
	public void updatePoundageConvertEth() {
		PoundageConvertEth poundageConvertEth = new PoundageConvertEth();
		poundageConvertEthService.updatePoundageConvertEth(poundageConvertEth);
	}

	/**
	* 批量删除poundage
	*/
	@Test
	public void deletePoundageConvertEthByIds() {
	}

	/**
	* 删除poundage信息
	*/
	@Test
	public void deletePoundageConvertEthById() {
	}

}
