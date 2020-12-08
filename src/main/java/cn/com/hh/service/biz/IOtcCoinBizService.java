package com.common.api.service;

import java.util.List;

import com.common.api.model.otcCoin;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [otcBiz服务]
 */
public interface IOtcCoinBizService {

	/**
	* 查询otc
	*
	* @param id otcID
	* @return otc
	*/
	public OtcCoin selectOtcCoinById(Long id);

	/**
	* 查询otc列表
	*
	* @param otcCoin otc
	* @return otc集合
	*/
	public List<OtcCoin> selectOtcCoinList(OtcCoin otcCoin);

	/**
	* 新增otc
	*
	* @param otcCoin otc
	* @return 结果
	*/
	public int insertOtcCoin(OtcCoin otcCoin);

	/**
	* 修改otc
	*
	* @param otcCoin otc
	* @return 结果
	*/
	public int updateOtcCoin(OtcCoin otcCoin);

	/**
	* 批量删除otc
	*
	* @param ids 需要删除的otcID
	* @return 结果
	*/
	public int deleteOtcCoinByIds(Long[] ids);

	/**
	* 删除otc信息
	*
	* @param id otcID
	* @return 结果
	*/
	public int deleteOtcCoinById(Long id);
	
}
