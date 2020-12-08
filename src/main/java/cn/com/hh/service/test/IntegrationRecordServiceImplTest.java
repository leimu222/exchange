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
 * Description: [integration单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class IntegrationRecordServiceImplTest  {

	@Autowired
	private IIntegrationRecordService integrationRecordService;

	/**
	* 查询integration
	*/
	@Test
	public void selectIntegrationRecordById() {
		IntegrationRecord integrationRecord = integrationRecordService.selectIntegrationRecordById(1);
		System.out.println(integrationRecord.toString());
	}

	/**
	* 查询integration列表
	*/
	@Test
	public void selectIntegrationRecordList() {
		List<IntegrationRecord> list = integrationRecordService.selectIntegrationRecordList(new IntegrationRecord());
		for(IntegrationRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增integration
	*/
	@Test
	public void insertIntegrationRecord() {
		for (int i = 1;i < 30; i++) {
			IntegrationRecord integrationRecord = new IntegrationRecord();
			integrationRecordService.insertIntegrationRecord(integrationRecord);
		}
	}

	/**
	* 修改integration
	*/
	@Test
	public void updateIntegrationRecord() {
		IntegrationRecord integrationRecord = new IntegrationRecord();
		integrationRecordService.updateIntegrationRecord(integrationRecord);
	}

	/**
	* 批量删除integration
	*/
	@Test
	public void deleteIntegrationRecordByIds() {
	}

	/**
	* 删除integration信息
	*/
	@Test
	public void deleteIntegrationRecordById() {
	}

}
