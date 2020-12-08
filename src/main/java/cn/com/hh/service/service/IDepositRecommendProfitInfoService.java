package com.common.api.service;

import java.util.List;

import com.common.api.model.depositRecommendProfitInfo;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [deposit服务]
 */
public interface IDepositRecommendProfitInfoService {

	/**
	* 查询deposit
	*
	* @param id depositID
	* @return deposit
	*/
	public DepositRecommendProfitInfo selectDepositRecommendProfitInfoById(Long id);

	/**
	* 查询deposit列表
	*
	* @param depositRecommendProfitInfo deposit
	* @return deposit集合
	*/
	public List<DepositRecommendProfitInfo> selectDepositRecommendProfitInfoList(DepositRecommendProfitInfo depositRecommendProfitInfo);

	/**
	* 新增deposit
	*
	* @param depositRecommendProfitInfo deposit
	* @return 结果
	*/
	public int insertDepositRecommendProfitInfo(DepositRecommendProfitInfo depositRecommendProfitInfo);

	/**
	* 修改deposit
	*
	* @param depositRecommendProfitInfo deposit
	* @return 结果
	*/
	public int updateDepositRecommendProfitInfo(DepositRecommendProfitInfo depositRecommendProfitInfo);

	/**
	* 批量删除deposit
	*
	* @param ids 需要删除的depositID
	* @return 结果
	*/
	public int deleteDepositRecommendProfitInfoByIds(Long[] ids);

	/**
	* 删除deposit信息
	*
	* @param id depositID
	* @return 结果
	*/
	public int deleteDepositRecommendProfitInfoById(Long id);
	
}
