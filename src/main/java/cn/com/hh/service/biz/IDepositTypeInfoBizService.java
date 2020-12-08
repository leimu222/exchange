package com.common.api.service;

import java.util.List;

import com.common.api.model.depositTypeInfo;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [depositBiz服务]
 */
public interface IDepositTypeInfoBizService {

	/**
	* 查询deposit
	*
	* @param id depositID
	* @return deposit
	*/
	public DepositTypeInfo selectDepositTypeInfoById(Integer id);

	/**
	* 查询deposit列表
	*
	* @param depositTypeInfo deposit
	* @return deposit集合
	*/
	public List<DepositTypeInfo> selectDepositTypeInfoList(DepositTypeInfo depositTypeInfo);

	/**
	* 新增deposit
	*
	* @param depositTypeInfo deposit
	* @return 结果
	*/
	public int insertDepositTypeInfo(DepositTypeInfo depositTypeInfo);

	/**
	* 修改deposit
	*
	* @param depositTypeInfo deposit
	* @return 结果
	*/
	public int updateDepositTypeInfo(DepositTypeInfo depositTypeInfo);

	/**
	* 批量删除deposit
	*
	* @param ids 需要删除的depositID
	* @return 结果
	*/
	public int deleteDepositTypeInfoByIds(Integer[] ids);

	/**
	* 删除deposit信息
	*
	* @param id depositID
	* @return 结果
	*/
	public int deleteDepositTypeInfoById(Integer id);
	
}
