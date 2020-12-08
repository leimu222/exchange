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
 * Description: [bussiness单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BussinessCancelApplyServiceImplTest  {

	@Autowired
	private IBussinessCancelApplyService bussinessCancelApplyService;

	/**
	* 查询bussiness
	*/
	@Test
	public void selectBussinessCancelApplyById() {
		BussinessCancelApply bussinessCancelApply = bussinessCancelApplyService.selectBussinessCancelApplyById(1);
		System.out.println(bussinessCancelApply.toString());
	}

	/**
	* 查询bussiness列表
	*/
	@Test
	public void selectBussinessCancelApplyList() {
		List<BussinessCancelApply> list = bussinessCancelApplyService.selectBussinessCancelApplyList(new BussinessCancelApply());
		for(BussinessCancelApply model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增bussiness
	*/
	@Test
	public void insertBussinessCancelApply() {
		for (int i = 1;i < 30; i++) {
			BussinessCancelApply bussinessCancelApply = new BussinessCancelApply();
			bussinessCancelApplyService.insertBussinessCancelApply(bussinessCancelApply);
		}
	}

	/**
	* 修改bussiness
	*/
	@Test
	public void updateBussinessCancelApply() {
		BussinessCancelApply bussinessCancelApply = new BussinessCancelApply();
		bussinessCancelApplyService.updateBussinessCancelApply(bussinessCancelApply);
	}

	/**
	* 批量删除bussiness
	*/
	@Test
	public void deleteBussinessCancelApplyByIds() {
	}

	/**
	* 删除bussiness信息
	*/
	@Test
	public void deleteBussinessCancelApplyById() {
	}

}
