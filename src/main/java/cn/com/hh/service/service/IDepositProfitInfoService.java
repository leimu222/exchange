package com.common.api.service;

import java.util.List;

import com.common.api.model.depositProfitInfo;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [deposit服务]
 */
public interface IDepositProfitInfoService {

	/**
	* 查询deposit
	*
	* @param id depositID
	* @return deposit
	*/
	public DepositProfitInfo selectDepositProfitInfoById(Long id);

	/**
	* 查询deposit列表
	*
	* @param depositProfitInfo deposit
	* @return deposit集合
	*/
	public List<DepositProfitInfo> selectDepositProfitInfoList(DepositProfitInfo depositProfitInfo);

	/**
	* 新增deposit
	*
	* @param depositProfitInfo deposit
	* @return 结果
	*/
	public int insertDepositProfitInfo(DepositProfitInfo depositProfitInfo);

	/**
	* 修改deposit
	*
	* @param depositProfitInfo deposit
	* @return 结果
	*/
	public int updateDepositProfitInfo(DepositProfitInfo depositProfitInfo);

	/**
	* 批量删除deposit
	*
	* @param ids 需要删除的depositID
	* @return 结果
	*/
	public int deleteDepositProfitInfoByIds(Long[] ids);

	/**
	* 删除deposit信息
	*
	* @param id depositID
	* @return 结果
	*/
	public int deleteDepositProfitInfoById(Long id);
	
}
