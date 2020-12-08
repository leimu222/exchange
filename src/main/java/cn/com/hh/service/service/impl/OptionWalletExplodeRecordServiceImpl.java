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
 * Description: [option服务实现]
 */
@Service
public class OptionWalletExplodeRecordServiceImpl implements IOptionWalletExplodeRecordService {
	@Autowired
	private OptionWalletExplodeRecordMapper optionWalletExplodeRecordMapper;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionWalletExplodeRecord selectOptionWalletExplodeRecordById(Long id) {
		return optionWalletExplodeRecordMapper.selectOptionWalletExplodeRecordById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionWalletExplodeRecord option
	* @return option
	*/
	@Override
	public List<OptionWalletExplodeRecord> selectOptionWalletExplodeRecordList(OptionWalletExplodeRecord optionWalletExplodeRecord) {
		return optionWalletExplodeRecordMapper.selectOptionWalletExplodeRecordList(optionWalletExplodeRecord);
	}

	/**
	* 新增option
	*
	* @param optionWalletExplodeRecord option
	* @return 结果
	*/
	@Override
	public int insertOptionWalletExplodeRecord(OptionWalletExplodeRecord optionWalletExplodeRecord) {
		return optionWalletExplodeRecordMapper.insertOptionWalletExplodeRecord(optionWalletExplodeRecord);
	}

	/**
	* 修改option
	*
	* @param optionWalletExplodeRecord option
	* @return 结果
	*/
	@Override
	public int updateOptionWalletExplodeRecord(OptionWalletExplodeRecord optionWalletExplodeRecord) {
		return optionWalletExplodeRecordMapper.updateOptionWalletExplodeRecord(optionWalletExplodeRecord);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionWalletExplodeRecordByIds(Long[] ids) {
		return optionWalletExplodeRecordMapper.deleteOptionWalletExplodeRecordByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionWalletExplodeRecordById(Long id) {
		return optionWalletExplodeRecordMapper.deleteOptionWalletExplodeRecordById(id);
	}

}
