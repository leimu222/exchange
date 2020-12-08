package com.common.api.service;

import java.util.List;

import com.common.api.model.riskRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [riskBiz服务]
 */
public interface IRiskRecordBizService {

	/**
	* 查询risk
	*
	* @param id riskID
	* @return risk
	*/
	public RiskRecord selectRiskRecordById(Long id);

	/**
	* 查询risk列表
	*
	* @param riskRecord risk
	* @return risk集合
	*/
	public List<RiskRecord> selectRiskRecordList(RiskRecord riskRecord);

	/**
	* 新增risk
	*
	* @param riskRecord risk
	* @return 结果
	*/
	public int insertRiskRecord(RiskRecord riskRecord);

	/**
	* 修改risk
	*
	* @param riskRecord risk
	* @return 结果
	*/
	public int updateRiskRecord(RiskRecord riskRecord);

	/**
	* 批量删除risk
	*
	* @param ids 需要删除的riskID
	* @return 结果
	*/
	public int deleteRiskRecordByIds(Long[] ids);

	/**
	* 删除risk信息
	*
	* @param id riskID
	* @return 结果
	*/
	public int deleteRiskRecordById(Long id);
	
}
