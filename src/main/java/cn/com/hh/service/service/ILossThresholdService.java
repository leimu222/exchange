package com.common.api.service;

import java.util.List;

import com.common.api.model.lossThreshold;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [loss服务]
 */
public interface ILossThresholdService {

	/**
	* 查询loss
	*
	* @param id lossID
	* @return loss
	*/
	public LossThreshold selectLossThresholdById(Long id);

	/**
	* 查询loss列表
	*
	* @param lossThreshold loss
	* @return loss集合
	*/
	public List<LossThreshold> selectLossThresholdList(LossThreshold lossThreshold);

	/**
	* 新增loss
	*
	* @param lossThreshold loss
	* @return 结果
	*/
	public int insertLossThreshold(LossThreshold lossThreshold);

	/**
	* 修改loss
	*
	* @param lossThreshold loss
	* @return 结果
	*/
	public int updateLossThreshold(LossThreshold lossThreshold);

	/**
	* 批量删除loss
	*
	* @param ids 需要删除的lossID
	* @return 结果
	*/
	public int deleteLossThresholdByIds(Long[] ids);

	/**
	* 删除loss信息
	*
	* @param id lossID
	* @return 结果
	*/
	public int deleteLossThresholdById(Long id);
	
}
