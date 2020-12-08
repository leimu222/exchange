package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionWalletTransferRecordMapper;
import com.common.api.model.OptionWalletTransferRecord;
import com.common.api.service.IOptionWalletTransferRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [optionBiz服务实现]
 */
@Service
public class OptionWalletTransferRecordBizServiceImpl extends CommonService implements IOptionWalletTransferRecordBizService {
	@Autowired
	private IOptionWalletTransferRecordService optionWalletTransferRecordService;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionWalletTransferRecord selectOptionWalletTransferRecordById(Long id) {
		return optionWalletTransferRecordService.selectOptionWalletTransferRecordById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionWalletTransferRecord option
	* @return option
	*/
	@Override
	public List<OptionWalletTransferRecord> selectOptionWalletTransferRecordList(OptionWalletTransferRecord optionWalletTransferRecord) {
		return optionWalletTransferRecordService.selectOptionWalletTransferRecordList(optionWalletTransferRecord);
	}

	/**
	* 新增option
	*
	* @param optionWalletTransferRecord option
	* @return 结果
	*/
	@Override
	public int insertOptionWalletTransferRecord(OptionWalletTransferRecord optionWalletTransferRecord) {
		return optionWalletTransferRecordService.insertOptionWalletTransferRecord(optionWalletTransferRecord);
	}

	/**
	* 修改option
	*
	* @param optionWalletTransferRecord option
	* @return 结果
	*/
	@Override
	public int updateOptionWalletTransferRecord(OptionWalletTransferRecord optionWalletTransferRecord) {
		return optionWalletTransferRecordService.updateOptionWalletTransferRecord(optionWalletTransferRecord);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionWalletTransferRecordByIds(Long[] ids) {
		return optionWalletTransferRecordService.deleteOptionWalletTransferRecordByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionWalletTransferRecordById(Long id) {
		return optionWalletTransferRecordService.deleteOptionWalletTransferRecordById(id);
	}

}
