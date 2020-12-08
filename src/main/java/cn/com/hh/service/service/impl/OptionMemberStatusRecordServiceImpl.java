package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionMemberStatusRecordMapper;
import com.common.api.model.OptionMemberStatusRecord;
import com.common.api.service.IOptionMemberStatusRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [option服务实现]
 */
@Service
public class OptionMemberStatusRecordServiceImpl implements IOptionMemberStatusRecordService {
	@Autowired
	private OptionMemberStatusRecordMapper optionMemberStatusRecordMapper;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionMemberStatusRecord selectOptionMemberStatusRecordById(Long id) {
		return optionMemberStatusRecordMapper.selectOptionMemberStatusRecordById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionMemberStatusRecord option
	* @return option
	*/
	@Override
	public List<OptionMemberStatusRecord> selectOptionMemberStatusRecordList(OptionMemberStatusRecord optionMemberStatusRecord) {
		return optionMemberStatusRecordMapper.selectOptionMemberStatusRecordList(optionMemberStatusRecord);
	}

	/**
	* 新增option
	*
	* @param optionMemberStatusRecord option
	* @return 结果
	*/
	@Override
	public int insertOptionMemberStatusRecord(OptionMemberStatusRecord optionMemberStatusRecord) {
		return optionMemberStatusRecordMapper.insertOptionMemberStatusRecord(optionMemberStatusRecord);
	}

	/**
	* 修改option
	*
	* @param optionMemberStatusRecord option
	* @return 结果
	*/
	@Override
	public int updateOptionMemberStatusRecord(OptionMemberStatusRecord optionMemberStatusRecord) {
		return optionMemberStatusRecordMapper.updateOptionMemberStatusRecord(optionMemberStatusRecord);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionMemberStatusRecordByIds(Long[] ids) {
		return optionMemberStatusRecordMapper.deleteOptionMemberStatusRecordByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionMemberStatusRecordById(Long id) {
		return optionMemberStatusRecordMapper.deleteOptionMemberStatusRecordById(id);
	}

}
