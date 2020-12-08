package com.common.api.service;

import java.util.List;

import com.common.api.model.coinCollectLog;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:01
 * Description: [coinBiz服务]
 */
public interface ICoinCollectLogBizService {

	/**
	* 查询coin
	*
	* @param id coinID
	* @return coin
	*/
	public CoinCollectLog selectCoinCollectLogById(Integer id);

	/**
	* 查询coin列表
	*
	* @param coinCollectLog coin
	* @return coin集合
	*/
	public List<CoinCollectLog> selectCoinCollectLogList(CoinCollectLog coinCollectLog);

	/**
	* 新增coin
	*
	* @param coinCollectLog coin
	* @return 结果
	*/
	public int insertCoinCollectLog(CoinCollectLog coinCollectLog);

	/**
	* 修改coin
	*
	* @param coinCollectLog coin
	* @return 结果
	*/
	public int updateCoinCollectLog(CoinCollectLog coinCollectLog);

	/**
	* 批量删除coin
	*
	* @param ids 需要删除的coinID
	* @return 结果
	*/
	public int deleteCoinCollectLogByIds(Integer[] ids);

	/**
	* 删除coin信息
	*
	* @param id coinID
	* @return 结果
	*/
	public int deleteCoinCollectLogById(Integer id);
	
}
