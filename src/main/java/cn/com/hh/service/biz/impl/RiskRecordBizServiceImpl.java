package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.RiskRecordMapper;
import com.common.api.model.RiskRecord;
import com.common.api.service.IRiskRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [riskBiz服务实现]
 */
@Service
public class RiskRecordBizServiceImpl extends CommonService implements IRiskRecordBizService {
	@Autowired
	private IRiskRecordService riskRecordService;

	/**
	* 查询risk
	*
	* @param id riskID
	* @return risk
	*/
	@Override
	public RiskRecord selectRiskRecordById(Long id) {
		return riskRecordService.selectRiskRecordById(id);
	}

	/**
	* 查询risk列表
	*
	* @param riskRecord risk
	* @return risk
	*/
	@Override
	public List<RiskRecord> selectRiskRecordList(RiskRecord riskRecord) {
		return riskRecordService.selectRiskRecordList(riskRecord);
	}

	/**
	* 新增risk
	*
	* @param riskRecord risk
	* @return 结果
	*/
	@Override
	public int insertRiskRecord(RiskRecord riskRecord) {
		return riskRecordService.insertRiskRecord(riskRecord);
	}

	/**
	* 修改risk
	*
	* @param riskRecord risk
	* @return 结果
	*/
	@Override
	public int updateRiskRecord(RiskRecord riskRecord) {
		return riskRecordService.updateRiskRecord(riskRecord);
	}

	/**
	* 批量删除risk
	*
	* @param ids 需要删除的riskID
	* @return 结果
	*/
	@Override
	public int deleteRiskRecordByIds(Long[] ids) {
		return riskRecordService.deleteRiskRecordByIds(ids);
	}

	/**
	* 删除risk信息
	*
	* @param id riskID
	* @return 结果
	*/
	@Override
	public int deleteRiskRecordById(Long id) {
		return riskRecordService.deleteRiskRecordById(id);
	}

}
