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
 * Description: [data单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataDictionaryServiceImplTest  {

	@Autowired
	private IDataDictionaryService dataDictionaryService;

	/**
	* 查询data
	*/
	@Test
	public void selectDataDictionaryById() {
		DataDictionary dataDictionary = dataDictionaryService.selectDataDictionaryById(1);
		System.out.println(dataDictionary.toString());
	}

	/**
	* 查询data列表
	*/
	@Test
	public void selectDataDictionaryList() {
		List<DataDictionary> list = dataDictionaryService.selectDataDictionaryList(new DataDictionary());
		for(DataDictionary model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增data
	*/
	@Test
	public void insertDataDictionary() {
		for (int i = 1;i < 30; i++) {
			DataDictionary dataDictionary = new DataDictionary();
			dataDictionaryService.insertDataDictionary(dataDictionary);
		}
	}

	/**
	* 修改data
	*/
	@Test
	public void updateDataDictionary() {
		DataDictionary dataDictionary = new DataDictionary();
		dataDictionaryService.updateDataDictionary(dataDictionary);
	}

	/**
	* 批量删除data
	*/
	@Test
	public void deleteDataDictionaryByIds() {
	}

	/**
	* 删除data信息
	*/
	@Test
	public void deleteDataDictionaryById() {
	}

}
