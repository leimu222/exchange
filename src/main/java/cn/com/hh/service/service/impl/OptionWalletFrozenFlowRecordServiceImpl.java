package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionWalletFrozenFlowRecordMapper;
import com.common.api.model.OptionWalletFrozenFlowRecord;
import com.common.api.service.IOptionWalletFrozenFlowRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [option服务实现]
 */
@Service
public class OptionWalletFrozenFlowRecordServiceImpl implements IOptionWalletFrozenFlowRecordService {
	@Autowired
	private OptionWalletFrozenFlowRecordMapper optionWalletFrozenFlowRecordMapper;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionWalletFrozenFlowRecord selectOptionWalletFrozenFlowRecordById(Long id) {
		return optionWalletFrozenFlowRecordMapper.selectOptionWalletFrozenFlowRecordById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionWalletFrozenFlowRecord option
	* @return option
	*/
	@Override
	public List<OptionWalletFrozenFlowRecord> selectOptionWalletFrozenFlowRecordList(OptionWalletFrozenFlowRecord optionWalletFrozenFlowRecord) {
		return optionWalletFrozenFlowRecordMapper.selectOptionWalletFrozenFlowRecordList(optionWalletFrozenFlowRecord);
	}

	/**
	* 新增option
	*
	* @param optionWalletFrozenFlowRecord option
	* @return 结果
	*/
	@Override
	public int insertOptionWalletFrozenFlowRecord(OptionWalletFrozenFlowRecord optionWalletFrozenFlowRecord) {
		return optionWalletFrozenFlowRecordMapper.insertOptionWalletFrozenFlowRecord(optionWalletFrozenFlowRecord);
	}

	/**
	* 修改option
	*
	* @param optionWalletFrozenFlowRecord option
	* @return 结果
	*/
	@Override
	public int updateOptionWalletFrozenFlowRecord(OptionWalletFrozenFlowRecord optionWalletFrozenFlowRecord) {
		return optionWalletFrozenFlowRecordMapper.updateOptionWalletFrozenFlowRecord(optionWalletFrozenFlowRecord);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionWalletFrozenFlowRecordByIds(Long[] ids) {
		return optionWalletFrozenFlowRecordMapper.deleteOptionWalletFrozenFlowRecordByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionWalletFrozenFlowRecordById(Long id) {
		return optionWalletFrozenFlowRecordMapper.deleteOptionWalletFrozenFlowRecordById(id);
	}

}
