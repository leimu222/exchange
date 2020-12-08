package com.common.api.service;

import java.util.List;

import com.common.api.model.coinConvert;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:01
 * Description: [coin服务]
 */
public interface ICoinConvertService {

	/**
	* 查询coin
	*
	* @param id coinID
	* @return coin
	*/
	public CoinConvert selectCoinConvertById(Integer id);

	/**
	* 查询coin列表
	*
	* @param coinConvert coin
	* @return coin集合
	*/
	public List<CoinConvert> selectCoinConvertList(CoinConvert coinConvert);

	/**
	* 新增coin
	*
	* @param coinConvert coin
	* @return 结果
	*/
	public int insertCoinConvert(CoinConvert coinConvert);

	/**
	* 修改coin
	*
	* @param coinConvert coin
	* @return 结果
	*/
	public int updateCoinConvert(CoinConvert coinConvert);

	/**
	* 批量删除coin
	*
	* @param ids 需要删除的coinID
	* @return 结果
	*/
	public int deleteCoinConvertByIds(Integer[] ids);

	/**
	* 删除coin信息
	*
	* @param id coinID
	* @return 结果
	*/
	public int deleteCoinConvertById(Integer id);
	
}
