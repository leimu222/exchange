package com.common.api.service;

import java.util.List;

import com.common.api.model.giftConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [giftBiz服务]
 */
public interface IGiftConfigBizService {

	/**
	* 查询gift
	*
	* @param id giftID
	* @return gift
	*/
	public GiftConfig selectGiftConfigById(Long id);

	/**
	* 查询gift列表
	*
	* @param giftConfig gift
	* @return gift集合
	*/
	public List<GiftConfig> selectGiftConfigList(GiftConfig giftConfig);

	/**
	* 新增gift
	*
	* @param giftConfig gift
	* @return 结果
	*/
	public int insertGiftConfig(GiftConfig giftConfig);

	/**
	* 修改gift
	*
	* @param giftConfig gift
	* @return 结果
	*/
	public int updateGiftConfig(GiftConfig giftConfig);

	/**
	* 批量删除gift
	*
	* @param ids 需要删除的giftID
	* @return 结果
	*/
	public int deleteGiftConfigByIds(Long[] ids);

	/**
	* 删除gift信息
	*
	* @param id giftID
	* @return 结果
	*/
	public int deleteGiftConfigById(Long id);
	
}
