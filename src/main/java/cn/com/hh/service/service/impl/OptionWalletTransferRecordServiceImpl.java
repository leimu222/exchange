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
 * Description: [option服务实现]
 */
@Service
public class OptionWalletTransferRecordServiceImpl implements IOptionWalletTransferRecordService {
	@Autowired
	private OptionWalletTransferRecordMapper optionWalletTransferRecordMapper;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionWalletTransferRecord selectOptionWalletTransferRecordById(Long id) {
		return optionWalletTransferRecordMapper.selectOptionWalletTransferRecordById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionWalletTransferRecord option
	* @return option
	*/
	@Override
	public List<OptionWalletTransferRecord> selectOptionWalletTransferRecordList(OptionWalletTransferRecord optionWalletTransferRecord) {
		return optionWalletTransferRecordMapper.selectOptionWalletTransferRecordList(optionWalletTransferRecord);
	}

	/**
	* 新增option
	*
	* @param optionWalletTransferRecord option
	* @return 结果
	*/
	@Override
	public int insertOptionWalletTransferRecord(OptionWalletTransferRecord optionWalletTransferRecord) {
		return optionWalletTransferRecordMapper.insertOptionWalletTransferRecord(optionWalletTransferRecord);
	}

	/**
	* 修改option
	*
	* @param optionWalletTransferRecord option
	* @return 结果
	*/
	@Override
	public int updateOptionWalletTransferRecord(OptionWalletTransferRecord optionWalletTransferRecord) {
		return optionWalletTransferRecordMapper.updateOptionWalletTransferRecord(optionWalletTransferRecord);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionWalletTransferRecordByIds(Long[] ids) {
		return optionWalletTransferRecordMapper.deleteOptionWalletTransferRecordByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionWalletTransferRecordById(Long id) {
		return optionWalletTransferRecordMapper.deleteOptionWalletTransferRecordById(id);
	}

}
