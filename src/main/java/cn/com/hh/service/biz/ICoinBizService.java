package com.common.api.service;

import java.util.List;

import com.common.api.model.coin;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:01
 * Description: [coinBiz服务]
 */
public interface ICoinBizService {

	/**
	* 查询coin
	*
	* @param name coinID
	* @return coin
	*/
	public Coin selectCoinById(String name);

	/**
	* 查询coin列表
	*
	* @param coin coin
	* @return coin集合
	*/
	public List<Coin> selectCoinList(Coin coin);

	/**
	* 新增coin
	*
	* @param coin coin
	* @return 结果
	*/
	public int insertCoin(Coin coin);

	/**
	* 修改coin
	*
	* @param coin coin
	* @return 结果
	*/
	public int updateCoin(Coin coin);

	/**
	* 批量删除coin
	*
	* @param names 需要删除的coinID
	* @return 结果
	*/
	public int deleteCoinByIds(String[] names);

	/**
	* 删除coin信息
	*
	* @param name coinID
	* @return 结果
	*/
	public int deleteCoinById(String name);
	
}
