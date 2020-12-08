package com.common.api.service;

import java.util.List;

import com.common.api.model.dataDictionary;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [dataBiz服务]
 */
public interface IDataDictionaryBizService {

	/**
	* 查询data
	*
	* @param id dataID
	* @return data
	*/
	public DataDictionary selectDataDictionaryById(Long id);

	/**
	* 查询data列表
	*
	* @param dataDictionary data
	* @return data集合
	*/
	public List<DataDictionary> selectDataDictionaryList(DataDictionary dataDictionary);

	/**
	* 新增data
	*
	* @param dataDictionary data
	* @return 结果
	*/
	public int insertDataDictionary(DataDictionary dataDictionary);

	/**
	* 修改data
	*
	* @param dataDictionary data
	* @return 结果
	*/
	public int updateDataDictionary(DataDictionary dataDictionary);

	/**
	* 批量删除data
	*
	* @param ids 需要删除的dataID
	* @return 结果
	*/
	public int deleteDataDictionaryByIds(Long[] ids);

	/**
	* 删除data信息
	*
	* @param id dataID
	* @return 结果
	*/
	public int deleteDataDictionaryById(Long id);
	
}
