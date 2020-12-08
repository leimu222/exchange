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
 * Description: [ieo单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class IeoEmptionServiceImplTest  {

	@Autowired
	private IIeoEmptionService ieoEmptionService;

	/**
	* 查询ieo
	*/
	@Test
	public void selectIeoEmptionById() {
		IeoEmption ieoEmption = ieoEmptionService.selectIeoEmptionById(1);
		System.out.println(ieoEmption.toString());
	}

	/**
	* 查询ieo列表
	*/
	@Test
	public void selectIeoEmptionList() {
		List<IeoEmption> list = ieoEmptionService.selectIeoEmptionList(new IeoEmption());
		for(IeoEmption model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增ieo
	*/
	@Test
	public void insertIeoEmption() {
		for (int i = 1;i < 30; i++) {
			IeoEmption ieoEmption = new IeoEmption();
			ieoEmptionService.insertIeoEmption(ieoEmption);
		}
	}

	/**
	* 修改ieo
	*/
	@Test
	public void updateIeoEmption() {
		IeoEmption ieoEmption = new IeoEmption();
		ieoEmptionService.updateIeoEmption(ieoEmption);
	}

	/**
	* 批量删除ieo
	*/
	@Test
	public void deleteIeoEmptionByIds() {
	}

	/**
	* 删除ieo信息
	*/
	@Test
	public void deleteIeoEmptionById() {
	}

}
