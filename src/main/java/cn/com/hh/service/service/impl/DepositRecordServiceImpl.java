package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.DepositRecordMapper;
import com.common.api.model.DepositRecord;
import com.common.api.service.IDepositRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [deposit服务实现]
 */
@Service
public class DepositRecordServiceImpl implements IDepositRecordService {
	@Autowired
	private DepositRecordMapper depositRecordMapper;

	/**
	* 查询deposit
	*
	* @param id depositID
	* @return deposit
	*/
	@Override
	public DepositRecord selectDepositRecordById(String id) {
		return depositRecordMapper.selectDepositRecordById(id);
	}

	/**
	* 查询deposit列表
	*
	* @param depositRecord deposit
	* @return deposit
	*/
	@Override
	public List<DepositRecord> selectDepositRecordList(DepositRecord depositRecord) {
		return depositRecordMapper.selectDepositRecordList(depositRecord);
	}

	/**
	* 新增deposit
	*
	* @param depositRecord deposit
	* @return 结果
	*/
	@Override
	public int insertDepositRecord(DepositRecord depositRecord) {
		return depositRecordMapper.insertDepositRecord(depositRecord);
	}

	/**
	* 修改deposit
	*
	* @param depositRecord deposit
	* @return 结果
	*/
	@Override
	public int updateDepositRecord(DepositRecord depositRecord) {
		return depositRecordMapper.updateDepositRecord(depositRecord);
	}

	/**
	* 批量删除deposit
	*
	* @param ids 需要删除的depositID
	* @return 结果
	*/
	@Override
	public int deleteDepositRecordByIds(String[] ids) {
		return depositRecordMapper.deleteDepositRecordByIds(ids);
	}

	/**
	* 删除deposit信息
	*
	* @param id depositID
	* @return 结果
	*/
	@Override
	public int deleteDepositRecordById(String id) {
		return depositRecordMapper.deleteDepositRecordById(id);
	}

}
