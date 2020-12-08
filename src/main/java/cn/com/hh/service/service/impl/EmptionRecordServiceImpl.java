package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.EmptionRecordMapper;
import com.common.api.model.EmptionRecord;
import com.common.api.service.IEmptionRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [emption服务实现]
 */
@Service
public class EmptionRecordServiceImpl implements IEmptionRecordService {
	@Autowired
	private EmptionRecordMapper emptionRecordMapper;

	/**
	* 查询emption
	*
	* @param id emptionID
	* @return emption
	*/
	@Override
	public EmptionRecord selectEmptionRecordById(Long id) {
		return emptionRecordMapper.selectEmptionRecordById(id);
	}

	/**
	* 查询emption列表
	*
	* @param emptionRecord emption
	* @return emption
	*/
	@Override
	public List<EmptionRecord> selectEmptionRecordList(EmptionRecord emptionRecord) {
		return emptionRecordMapper.selectEmptionRecordList(emptionRecord);
	}

	/**
	* 新增emption
	*
	* @param emptionRecord emption
	* @return 结果
	*/
	@Override
	public int insertEmptionRecord(EmptionRecord emptionRecord) {
		return emptionRecordMapper.insertEmptionRecord(emptionRecord);
	}

	/**
	* 修改emption
	*
	* @param emptionRecord emption
	* @return 结果
	*/
	@Override
	public int updateEmptionRecord(EmptionRecord emptionRecord) {
		return emptionRecordMapper.updateEmptionRecord(emptionRecord);
	}

	/**
	* 批量删除emption
	*
	* @param ids 需要删除的emptionID
	* @return 结果
	*/
	@Override
	public int deleteEmptionRecordByIds(Long[] ids) {
		return emptionRecordMapper.deleteEmptionRecordByIds(ids);
	}

	/**
	* 删除emption信息
	*
	* @param id emptionID
	* @return 结果
	*/
	@Override
	public int deleteEmptionRecordById(Long id) {
		return emptionRecordMapper.deleteEmptionRecordById(id);
	}

}
