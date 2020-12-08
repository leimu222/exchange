package com.common.api.service;

import java.util.List;

import com.common.api.model.feeStastic;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [fee服务]
 */
public interface IFeeStasticService {

	/**
	* 查询fee
	*
	* @param id feeID
	* @return fee
	*/
	public FeeStastic selectFeeStasticById(Long id);

	/**
	* 查询fee列表
	*
	* @param feeStastic fee
	* @return fee集合
	*/
	public List<FeeStastic> selectFeeStasticList(FeeStastic feeStastic);

	/**
	* 新增fee
	*
	* @param feeStastic fee
	* @return 结果
	*/
	public int insertFeeStastic(FeeStastic feeStastic);

	/**
	* 修改fee
	*
	* @param feeStastic fee
	* @return 结果
	*/
	public int updateFeeStastic(FeeStastic feeStastic);

	/**
	* 批量删除fee
	*
	* @param ids 需要删除的feeID
	* @return 结果
	*/
	public int deleteFeeStasticByIds(Long[] ids);

	/**
	* 删除fee信息
	*
	* @param id feeID
	* @return 结果
	*/
	public int deleteFeeStasticById(Long id);
	
}
