package com.common.api.service;

import java.util.List;

import com.common.api.model.copywdRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [copywd服务]
 */
public interface ICopywdRecordService {

	/**
	* 查询copywd
	*
	* @param id copywdID
	* @return copywd
	*/
	public CopywdRecord selectCopywdRecordById(Long id);

	/**
	* 查询copywd列表
	*
	* @param copywdRecord copywd
	* @return copywd集合
	*/
	public List<CopywdRecord> selectCopywdRecordList(CopywdRecord copywdRecord);

	/**
	* 新增copywd
	*
	* @param copywdRecord copywd
	* @return 结果
	*/
	public int insertCopywdRecord(CopywdRecord copywdRecord);

	/**
	* 修改copywd
	*
	* @param copywdRecord copywd
	* @return 结果
	*/
	public int updateCopywdRecord(CopywdRecord copywdRecord);

	/**
	* 批量删除copywd
	*
	* @param ids 需要删除的copywdID
	* @return 结果
	*/
	public int deleteCopywdRecordByIds(Long[] ids);

	/**
	* 删除copywd信息
	*
	* @param id copywdID
	* @return 结果
	*/
	public int deleteCopywdRecordById(Long id);
	
}
