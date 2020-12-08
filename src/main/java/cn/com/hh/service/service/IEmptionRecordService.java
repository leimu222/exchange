package com.common.api.service;

import java.util.List;

import com.common.api.model.emptionRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [emption服务]
 */
public interface IEmptionRecordService {

	/**
	* 查询emption
	*
	* @param id emptionID
	* @return emption
	*/
	public EmptionRecord selectEmptionRecordById(Long id);

	/**
	* 查询emption列表
	*
	* @param emptionRecord emption
	* @return emption集合
	*/
	public List<EmptionRecord> selectEmptionRecordList(EmptionRecord emptionRecord);

	/**
	* 新增emption
	*
	* @param emptionRecord emption
	* @return 结果
	*/
	public int insertEmptionRecord(EmptionRecord emptionRecord);

	/**
	* 修改emption
	*
	* @param emptionRecord emption
	* @return 结果
	*/
	public int updateEmptionRecord(EmptionRecord emptionRecord);

	/**
	* 批量删除emption
	*
	* @param ids 需要删除的emptionID
	* @return 结果
	*/
	public int deleteEmptionRecordByIds(Long[] ids);

	/**
	* 删除emption信息
	*
	* @param id emptionID
	* @return 结果
	*/
	public int deleteEmptionRecordById(Long id);
	
}
