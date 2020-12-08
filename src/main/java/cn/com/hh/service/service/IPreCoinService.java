package com.common.api.service;

import java.util.List;

import com.common.api.model.preCoin;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [pre服务]
 */
public interface IPreCoinService {

	/**
	* 查询pre
	*
	* @param id preID
	* @return pre
	*/
	public PreCoin selectPreCoinById(Long id);

	/**
	* 查询pre列表
	*
	* @param preCoin pre
	* @return pre集合
	*/
	public List<PreCoin> selectPreCoinList(PreCoin preCoin);

	/**
	* 新增pre
	*
	* @param preCoin pre
	* @return 结果
	*/
	public int insertPreCoin(PreCoin preCoin);

	/**
	* 修改pre
	*
	* @param preCoin pre
	* @return 结果
	*/
	public int updatePreCoin(PreCoin preCoin);

	/**
	* 批量删除pre
	*
	* @param ids 需要删除的preID
	* @return 结果
	*/
	public int deletePreCoinByIds(Long[] ids);

	/**
	* 删除pre信息
	*
	* @param id preID
	* @return 结果
	*/
	public int deletePreCoinById(Long id);
	
}
