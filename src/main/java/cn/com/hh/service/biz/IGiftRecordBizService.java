package com.common.api.service;

import java.util.List;

import com.common.api.model.giftRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [giftBiz服务]
 */
public interface IGiftRecordBizService {

	/**
	* 查询gift
	*
	* @param id giftID
	* @return gift
	*/
	public GiftRecord selectGiftRecordById(Long id);

	/**
	* 查询gift列表
	*
	* @param giftRecord gift
	* @return gift集合
	*/
	public List<GiftRecord> selectGiftRecordList(GiftRecord giftRecord);

	/**
	* 新增gift
	*
	* @param giftRecord gift
	* @return 结果
	*/
	public int insertGiftRecord(GiftRecord giftRecord);

	/**
	* 修改gift
	*
	* @param giftRecord gift
	* @return 结果
	*/
	public int updateGiftRecord(GiftRecord giftRecord);

	/**
	* 批量删除gift
	*
	* @param ids 需要删除的giftID
	* @return 结果
	*/
	public int deleteGiftRecordByIds(Long[] ids);

	/**
	* 删除gift信息
	*
	* @param id giftID
	* @return 结果
	*/
	public int deleteGiftRecordById(Long id);
	
}
