package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.FeeStasticMapper;
import com.common.api.model.FeeStastic;
import com.common.api.service.IFeeStasticService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [fee服务实现]
 */
@Service
public class FeeStasticServiceImpl implements IFeeStasticService {
	@Autowired
	private FeeStasticMapper feeStasticMapper;

	/**
	* 查询fee
	*
	* @param id feeID
	* @return fee
	*/
	@Override
	public FeeStastic selectFeeStasticById(Long id) {
		return feeStasticMapper.selectFeeStasticById(id);
	}

	/**
	* 查询fee列表
	*
	* @param feeStastic fee
	* @return fee
	*/
	@Override
	public List<FeeStastic> selectFeeStasticList(FeeStastic feeStastic) {
		return feeStasticMapper.selectFeeStasticList(feeStastic);
	}

	/**
	* 新增fee
	*
	* @param feeStastic fee
	* @return 结果
	*/
	@Override
	public int insertFeeStastic(FeeStastic feeStastic) {
		return feeStasticMapper.insertFeeStastic(feeStastic);
	}

	/**
	* 修改fee
	*
	* @param feeStastic fee
	* @return 结果
	*/
	@Override
	public int updateFeeStastic(FeeStastic feeStastic) {
		return feeStasticMapper.updateFeeStastic(feeStastic);
	}

	/**
	* 批量删除fee
	*
	* @param ids 需要删除的feeID
	* @return 结果
	*/
	@Override
	public int deleteFeeStasticByIds(Long[] ids) {
		return feeStasticMapper.deleteFeeStasticByIds(ids);
	}

	/**
	* 删除fee信息
	*
	* @param id feeID
	* @return 结果
	*/
	@Override
	public int deleteFeeStasticById(Long id) {
		return feeStasticMapper.deleteFeeStasticById(id);
	}

}
