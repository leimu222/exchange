package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OtcWalletFlowRecordMapper;
import com.common.api.model.OtcWalletFlowRecord;
import com.common.api.service.IOtcWalletFlowRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [otc服务实现]
 */
@Service
public class OtcWalletFlowRecordServiceImpl implements IOtcWalletFlowRecordService {
	@Autowired
	private OtcWalletFlowRecordMapper otcWalletFlowRecordMapper;

	/**
	* 查询otc
	*
	* @param id otcID
	* @return otc
	*/
	@Override
	public OtcWalletFlowRecord selectOtcWalletFlowRecordById(Long id) {
		return otcWalletFlowRecordMapper.selectOtcWalletFlowRecordById(id);
	}

	/**
	* 查询otc列表
	*
	* @param otcWalletFlowRecord otc
	* @return otc
	*/
	@Override
	public List<OtcWalletFlowRecord> selectOtcWalletFlowRecordList(OtcWalletFlowRecord otcWalletFlowRecord) {
		return otcWalletFlowRecordMapper.selectOtcWalletFlowRecordList(otcWalletFlowRecord);
	}

	/**
	* 新增otc
	*
	* @param otcWalletFlowRecord otc
	* @return 结果
	*/
	@Override
	public int insertOtcWalletFlowRecord(OtcWalletFlowRecord otcWalletFlowRecord) {
		return otcWalletFlowRecordMapper.insertOtcWalletFlowRecord(otcWalletFlowRecord);
	}

	/**
	* 修改otc
	*
	* @param otcWalletFlowRecord otc
	* @return 结果
	*/
	@Override
	public int updateOtcWalletFlowRecord(OtcWalletFlowRecord otcWalletFlowRecord) {
		return otcWalletFlowRecordMapper.updateOtcWalletFlowRecord(otcWalletFlowRecord);
	}

	/**
	* 批量删除otc
	*
	* @param ids 需要删除的otcID
	* @return 结果
	*/
	@Override
	public int deleteOtcWalletFlowRecordByIds(Long[] ids) {
		return otcWalletFlowRecordMapper.deleteOtcWalletFlowRecordByIds(ids);
	}

	/**
	* 删除otc信息
	*
	* @param id otcID
	* @return 结果
	*/
	@Override
	public int deleteOtcWalletFlowRecordById(Long id) {
		return otcWalletFlowRecordMapper.deleteOtcWalletFlowRecordById(id);
	}

}
