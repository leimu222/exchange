package com.common.api.service;

import java.util.List;

import com.common.api.model.coinIssued;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:02
 * Description: [coinBiz服务]
 */
public interface ICoinIssuedBizService {

	/**
	* 查询coin
	*
	* @param name coinID
	* @return coin
	*/
	public CoinIssued selectCoinIssuedById(String name);

	/**
	* 查询coin列表
	*
	* @param coinIssued coin
	* @return coin集合
	*/
	public List<CoinIssued> selectCoinIssuedList(CoinIssued coinIssued);

	/**
	* 新增coin
	*
	* @param coinIssued coin
	* @return 结果
	*/
	public int insertCoinIssued(CoinIssued coinIssued);

	/**
	* 修改coin
	*
	* @param coinIssued coin
	* @return 结果
	*/
	public int updateCoinIssued(CoinIssued coinIssued);

	/**
	* 批量删除coin
	*
	* @param names 需要删除的coinID
	* @return 结果
	*/
	public int deleteCoinIssuedByIds(String[] names);

	/**
	* 删除coin信息
	*
	* @param name coinID
	* @return 结果
	*/
	public int deleteCoinIssuedById(String name);
	
}
