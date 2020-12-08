package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionWalletExplodeRecordMapper;
import com.common.api.model.OptionWalletExplodeRecord;
import com.common.api.service.IOptionWalletExplodeRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [optionBiz服务实现]
 */
@Service
public class OptionWalletExplodeRecordBizServiceImpl extends CommonService implements IOptionWalletExplodeRecordBizService {
	@Autowired
	private IOptionWalletExplodeRecordService optionWalletExplodeRecordService;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionWalletExplodeRecord selectOptionWalletExplodeRecordById(Long id) {
		return optionWalletExplodeRecordService.selectOptionWalletExplodeRecordById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionWalletExplodeRecord option
	* @return option
	*/
	@Override
	public List<OptionWalletExplodeRecord> selectOptionWalletExplodeRecordList(OptionWalletExplodeRecord optionWalletExplodeRecord) {
		return optionWalletExplodeRecordService.selectOptionWalletExplodeRecordList(optionWalletExplodeRecord);
	}

	/**
	* 新增option
	*
	* @param optionWalletExplodeRecord option
	* @return 结果
	*/
	@Override
	public int insertOptionWalletExplodeRecord(OptionWalletExplodeRecord optionWalletExplodeRecord) {
		return optionWalletExplodeRecordService.insertOptionWalletExplodeRecord(optionWalletExplodeRecord);
	}

	/**
	* 修改option
	*
	* @param optionWalletExplodeRecord option
	* @return 结果
	*/
	@Override
	public int updateOptionWalletExplodeRecord(OptionWalletExplodeRecord optionWalletExplodeRecord) {
		return optionWalletExplodeRecordService.updateOptionWalletExplodeRecord(optionWalletExplodeRecord);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionWalletExplodeRecordByIds(Long[] ids) {
		return optionWalletExplodeRecordService.deleteOptionWalletExplodeRecordByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionWalletExplodeRecordById(Long id) {
		return optionWalletExplodeRecordService.deleteOptionWalletExplodeRecordById(id);
	}

}
