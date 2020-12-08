package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionMemberTransferRecordMapper;
import com.common.api.model.OptionMemberTransferRecord;
import com.common.api.service.IOptionMemberTransferRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [optionBiz服务实现]
 */
@Service
public class OptionMemberTransferRecordBizServiceImpl extends CommonService implements IOptionMemberTransferRecordBizService {
	@Autowired
	private IOptionMemberTransferRecordService optionMemberTransferRecordService;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionMemberTransferRecord selectOptionMemberTransferRecordById(Long id) {
		return optionMemberTransferRecordService.selectOptionMemberTransferRecordById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionMemberTransferRecord option
	* @return option
	*/
	@Override
	public List<OptionMemberTransferRecord> selectOptionMemberTransferRecordList(OptionMemberTransferRecord optionMemberTransferRecord) {
		return optionMemberTransferRecordService.selectOptionMemberTransferRecordList(optionMemberTransferRecord);
	}

	/**
	* 新增option
	*
	* @param optionMemberTransferRecord option
	* @return 结果
	*/
	@Override
	public int insertOptionMemberTransferRecord(OptionMemberTransferRecord optionMemberTransferRecord) {
		return optionMemberTransferRecordService.insertOptionMemberTransferRecord(optionMemberTransferRecord);
	}

	/**
	* 修改option
	*
	* @param optionMemberTransferRecord option
	* @return 结果
	*/
	@Override
	public int updateOptionMemberTransferRecord(OptionMemberTransferRecord optionMemberTransferRecord) {
		return optionMemberTransferRecordService.updateOptionMemberTransferRecord(optionMemberTransferRecord);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionMemberTransferRecordByIds(Long[] ids) {
		return optionMemberTransferRecordService.deleteOptionMemberTransferRecordByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionMemberTransferRecordById(Long id) {
		return optionMemberTransferRecordService.deleteOptionMemberTransferRecordById(id);
	}

}
