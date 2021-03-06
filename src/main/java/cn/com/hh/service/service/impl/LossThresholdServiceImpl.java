package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.LossThresholdMapper;
import com.common.api.model.LossThreshold;
import com.common.api.service.ILossThresholdService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [loss服务实现]
 */
@Service
public class LossThresholdServiceImpl implements ILossThresholdService {
	@Autowired
	private LossThresholdMapper lossThresholdMapper;

	/**
	* 查询loss
	*
	* @param id lossID
	* @return loss
	*/
	@Override
	public LossThreshold selectLossThresholdById(Long id) {
		return lossThresholdMapper.selectLossThresholdById(id);
	}

	/**
	* 查询loss列表
	*
	* @param lossThreshold loss
	* @return loss
	*/
	@Override
	public List<LossThreshold> selectLossThresholdList(LossThreshold lossThreshold) {
		return lossThresholdMapper.selectLossThresholdList(lossThreshold);
	}

	/**
	* 新增loss
	*
	* @param lossThreshold loss
	* @return 结果
	*/
	@Override
	public int insertLossThreshold(LossThreshold lossThreshold) {
		return lossThresholdMapper.insertLossThreshold(lossThreshold);
	}

	/**
	* 修改loss
	*
	* @param lossThreshold loss
	* @return 结果
	*/
	@Override
	public int updateLossThreshold(LossThreshold lossThreshold) {
		return lossThresholdMapper.updateLossThreshold(lossThreshold);
	}

	/**
	* 批量删除loss
	*
	* @param ids 需要删除的lossID
	* @return 结果
	*/
	@Override
	public int deleteLossThresholdByIds(Long[] ids) {
		return lossThresholdMapper.deleteLossThresholdByIds(ids);
	}

	/**
	* 删除loss信息
	*
	* @param id lossID
	* @return 结果
	*/
	@Override
	public int deleteLossThresholdById(Long id) {
		return lossThresholdMapper.deleteLossThresholdById(id);
	}

}
