package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionExchangeOrderConditionRecordMapper;
import com.common.api.model.OptionExchangeOrderConditionRecord;
import com.common.api.service.IOptionExchangeOrderConditionRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [optionBiz服务实现]
 */
@Service
public class OptionExchangeOrderConditionRecordBizServiceImpl extends CommonService implements IOptionExchangeOrderConditionRecordBizService {
	@Autowired
	private IOptionExchangeOrderConditionRecordService optionExchangeOrderConditionRecordService;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionExchangeOrderConditionRecord selectOptionExchangeOrderConditionRecordById(Long id) {
		return optionExchangeOrderConditionRecordService.selectOptionExchangeOrderConditionRecordById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderConditionRecord option
	* @return option
	*/
	@Override
	public List<OptionExchangeOrderConditionRecord> selectOptionExchangeOrderConditionRecordList(OptionExchangeOrderConditionRecord optionExchangeOrderConditionRecord) {
		return optionExchangeOrderConditionRecordService.selectOptionExchangeOrderConditionRecordList(optionExchangeOrderConditionRecord);
	}

	/**
	* 新增option
	*
	* @param optionExchangeOrderConditionRecord option
	* @return 结果
	*/
	@Override
	public int insertOptionExchangeOrderConditionRecord(OptionExchangeOrderConditionRecord optionExchangeOrderConditionRecord) {
		return optionExchangeOrderConditionRecordService.insertOptionExchangeOrderConditionRecord(optionExchangeOrderConditionRecord);
	}

	/**
	* 修改option
	*
	* @param optionExchangeOrderConditionRecord option
	* @return 结果
	*/
	@Override
	public int updateOptionExchangeOrderConditionRecord(OptionExchangeOrderConditionRecord optionExchangeOrderConditionRecord) {
		return optionExchangeOrderConditionRecordService.updateOptionExchangeOrderConditionRecord(optionExchangeOrderConditionRecord);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionExchangeOrderConditionRecordByIds(Long[] ids) {
		return optionExchangeOrderConditionRecordService.deleteOptionExchangeOrderConditionRecordByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionExchangeOrderConditionRecordById(Long id) {
		return optionExchangeOrderConditionRecordService.deleteOptionExchangeOrderConditionRecordById(id);
	}

}
