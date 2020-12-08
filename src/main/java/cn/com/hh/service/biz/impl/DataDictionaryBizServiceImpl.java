package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.DataDictionaryMapper;
import com.common.api.model.DataDictionary;
import com.common.api.service.IDataDictionaryService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [dataBiz服务实现]
 */
@Service
public class DataDictionaryBizServiceImpl extends CommonService implements IDataDictionaryBizService {
	@Autowired
	private IDataDictionaryService dataDictionaryService;

	/**
	* 查询data
	*
	* @param id dataID
	* @return data
	*/
	@Override
	public DataDictionary selectDataDictionaryById(Long id) {
		return dataDictionaryService.selectDataDictionaryById(id);
	}

	/**
	* 查询data列表
	*
	* @param dataDictionary data
	* @return data
	*/
	@Override
	public List<DataDictionary> selectDataDictionaryList(DataDictionary dataDictionary) {
		return dataDictionaryService.selectDataDictionaryList(dataDictionary);
	}

	/**
	* 新增data
	*
	* @param dataDictionary data
	* @return 结果
	*/
	@Override
	public int insertDataDictionary(DataDictionary dataDictionary) {
		return dataDictionaryService.insertDataDictionary(dataDictionary);
	}

	/**
	* 修改data
	*
	* @param dataDictionary data
	* @return 结果
	*/
	@Override
	public int updateDataDictionary(DataDictionary dataDictionary) {
		return dataDictionaryService.updateDataDictionary(dataDictionary);
	}

	/**
	* 批量删除data
	*
	* @param ids 需要删除的dataID
	* @return 结果
	*/
	@Override
	public int deleteDataDictionaryByIds(Long[] ids) {
		return dataDictionaryService.deleteDataDictionaryByIds(ids);
	}

	/**
	* 删除data信息
	*
	* @param id dataID
	* @return 结果
	*/
	@Override
	public int deleteDataDictionaryById(Long id) {
		return dataDictionaryService.deleteDataDictionaryById(id);
	}

}
