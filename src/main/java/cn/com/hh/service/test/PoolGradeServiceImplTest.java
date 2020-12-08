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
 * Description: [pool单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PoolGradeServiceImplTest  {

	@Autowired
	private IPoolGradeService poolGradeService;

	/**
	* 查询pool
	*/
	@Test
	public void selectPoolGradeById() {
		PoolGrade poolGrade = poolGradeService.selectPoolGradeById(1);
		System.out.println(poolGrade.toString());
	}

	/**
	* 查询pool列表
	*/
	@Test
	public void selectPoolGradeList() {
		List<PoolGrade> list = poolGradeService.selectPoolGradeList(new PoolGrade());
		for(PoolGrade model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增pool
	*/
	@Test
	public void insertPoolGrade() {
		for (int i = 1;i < 30; i++) {
			PoolGrade poolGrade = new PoolGrade();
			poolGradeService.insertPoolGrade(poolGrade);
		}
	}

	/**
	* 修改pool
	*/
	@Test
	public void updatePoolGrade() {
		PoolGrade poolGrade = new PoolGrade();
		poolGradeService.updatePoolGrade(poolGrade);
	}

	/**
	* 批量删除pool
	*/
	@Test
	public void deletePoolGradeByIds() {
	}

	/**
	* 删除pool信息
	*/
	@Test
	public void deletePoolGradeById() {
	}

}
