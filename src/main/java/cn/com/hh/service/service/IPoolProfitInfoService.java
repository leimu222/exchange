package com.common.api.service;

import java.util.List;

import com.common.api.model.poolProfitInfo;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [pool服务]
 */
public interface IPoolProfitInfoService {

	/**
	* 查询pool
	*
	* @param id poolID
	* @return pool
	*/
	public PoolProfitInfo selectPoolProfitInfoById(Long id);

	/**
	* 查询pool列表
	*
	* @param poolProfitInfo pool
	* @return pool集合
	*/
	public List<PoolProfitInfo> selectPoolProfitInfoList(PoolProfitInfo poolProfitInfo);

	/**
	* 新增pool
	*
	* @param poolProfitInfo pool
	* @return 结果
	*/
	public int insertPoolProfitInfo(PoolProfitInfo poolProfitInfo);

	/**
	* 修改pool
	*
	* @param poolProfitInfo pool
	* @return 结果
	*/
	public int updatePoolProfitInfo(PoolProfitInfo poolProfitInfo);

	/**
	* 批量删除pool
	*
	* @param ids 需要删除的poolID
	* @return 结果
	*/
	public int deletePoolProfitInfoByIds(Long[] ids);

	/**
	* 删除pool信息
	*
	* @param id poolID
	* @return 结果
	*/
	public int deletePoolProfitInfoById(Long id);
	
}
