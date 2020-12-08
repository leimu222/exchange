package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.GiftRecordMapper;
import com.common.api.model.GiftRecord;
import com.common.api.service.IGiftRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [giftBiz服务实现]
 */
@Service
public class GiftRecordBizServiceImpl extends CommonService implements IGiftRecordBizService {
	@Autowired
	private IGiftRecordService giftRecordService;

	/**
	* 查询gift
	*
	* @param id giftID
	* @return gift
	*/
	@Override
	public GiftRecord selectGiftRecordById(Long id) {
		return giftRecordService.selectGiftRecordById(id);
	}

	/**
	* 查询gift列表
	*
	* @param giftRecord gift
	* @return gift
	*/
	@Override
	public List<GiftRecord> selectGiftRecordList(GiftRecord giftRecord) {
		return giftRecordService.selectGiftRecordList(giftRecord);
	}

	/**
	* 新增gift
	*
	* @param giftRecord gift
	* @return 结果
	*/
	@Override
	public int insertGiftRecord(GiftRecord giftRecord) {
		return giftRecordService.insertGiftRecord(giftRecord);
	}

	/**
	* 修改gift
	*
	* @param giftRecord gift
	* @return 结果
	*/
	@Override
	public int updateGiftRecord(GiftRecord giftRecord) {
		return giftRecordService.updateGiftRecord(giftRecord);
	}

	/**
	* 批量删除gift
	*
	* @param ids 需要删除的giftID
	* @return 结果
	*/
	@Override
	public int deleteGiftRecordByIds(Long[] ids) {
		return giftRecordService.deleteGiftRecordByIds(ids);
	}

	/**
	* 删除gift信息
	*
	* @param id giftID
	* @return 结果
	*/
	@Override
	public int deleteGiftRecordById(Long id) {
		return giftRecordService.deleteGiftRecordById(id);
	}

}
