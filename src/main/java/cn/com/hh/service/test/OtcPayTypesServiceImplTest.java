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
 * @date 2020-12-08 18:16:07
 * Description: [otc单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OtcPayTypesServiceImplTest  {

	@Autowired
	private IOtcPayTypesService otcPayTypesService;

	/**
	* 查询otc
	*/
	@Test
	public void selectOtcPayTypesById() {
		OtcPayTypes otcPayTypes = otcPayTypesService.selectOtcPayTypesById(1);
		System.out.println(otcPayTypes.toString());
	}

	/**
	* 查询otc列表
	*/
	@Test
	public void selectOtcPayTypesList() {
		List<OtcPayTypes> list = otcPayTypesService.selectOtcPayTypesList(new OtcPayTypes());
		for(OtcPayTypes model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增otc
	*/
	@Test
	public void insertOtcPayTypes() {
		for (int i = 1;i < 30; i++) {
			OtcPayTypes otcPayTypes = new OtcPayTypes();
			otcPayTypesService.insertOtcPayTypes(otcPayTypes);
		}
	}

	/**
	* 修改otc
	*/
	@Test
	public void updateOtcPayTypes() {
		OtcPayTypes otcPayTypes = new OtcPayTypes();
		otcPayTypesService.updateOtcPayTypes(otcPayTypes);
	}

	/**
	* 批量删除otc
	*/
	@Test
	public void deleteOtcPayTypesByIds() {
	}

	/**
	* 删除otc信息
	*/
	@Test
	public void deleteOtcPayTypesById() {
	}

}
