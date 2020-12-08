package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionWalletFlowRecordMapper;
import com.common.api.model.OptionWalletFlowRecord;
import com.common.api.service.IOptionWalletFlowRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [option服务实现]
 */
@Service
public class OptionWalletFlowRecordServiceImpl implements IOptionWalletFlowRecordService {
	@Autowired
	private OptionWalletFlowRecordMapper optionWalletFlowRecordMapper;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionWalletFlowRecord selectOptionWalletFlowRecordById(Long id) {
		return optionWalletFlowRecordMapper.selectOptionWalletFlowRecordById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionWalletFlowRecord option
	* @return option
	*/
	@Override
	public List<OptionWalletFlowRecord> selectOptionWalletFlowRecordList(OptionWalletFlowRecord optionWalletFlowRecord) {
		return optionWalletFlowRecordMapper.selectOptionWalletFlowRecordList(optionWalletFlowRecord);
	}

	/**
	* 新增option
	*
	* @param optionWalletFlowRecord option
	* @return 结果
	*/
	@Override
	public int insertOptionWalletFlowRecord(OptionWalletFlowRecord optionWalletFlowRecord) {
		return optionWalletFlowRecordMapper.insertOptionWalletFlowRecord(optionWalletFlowRecord);
	}

	/**
	* 修改option
	*
	* @param optionWalletFlowRecord option
	* @return 结果
	*/
	@Override
	public int updateOptionWalletFlowRecord(OptionWalletFlowRecord optionWalletFlowRecord) {
		return optionWalletFlowRecordMapper.updateOptionWalletFlowRecord(optionWalletFlowRecord);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionWalletFlowRecordByIds(Long[] ids) {
		return optionWalletFlowRecordMapper.deleteOptionWalletFlowRecordByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionWalletFlowRecordById(Long id) {
		return optionWalletFlowRecordMapper.deleteOptionWalletFlowRecordById(id);
	}

}
