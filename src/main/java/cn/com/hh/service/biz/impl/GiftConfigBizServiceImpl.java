package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.GiftConfigMapper;
import com.common.api.model.GiftConfig;
import com.common.api.service.IGiftConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [giftBiz服务实现]
 */
@Service
public class GiftConfigBizServiceImpl extends CommonService implements IGiftConfigBizService {
	@Autowired
	private IGiftConfigService giftConfigService;

	/**
	* 查询gift
	*
	* @param id giftID
	* @return gift
	*/
	@Override
	public GiftConfig selectGiftConfigById(Long id) {
		return giftConfigService.selectGiftConfigById(id);
	}

	/**
	* 查询gift列表
	*
	* @param giftConfig gift
	* @return gift
	*/
	@Override
	public List<GiftConfig> selectGiftConfigList(GiftConfig giftConfig) {
		return giftConfigService.selectGiftConfigList(giftConfig);
	}

	/**
	* 新增gift
	*
	* @param giftConfig gift
	* @return 结果
	*/
	@Override
	public int insertGiftConfig(GiftConfig giftConfig) {
		return giftConfigService.insertGiftConfig(giftConfig);
	}

	/**
	* 修改gift
	*
	* @param giftConfig gift
	* @return 结果
	*/
	@Override
	public int updateGiftConfig(GiftConfig giftConfig) {
		return giftConfigService.updateGiftConfig(giftConfig);
	}

	/**
	* 批量删除gift
	*
	* @param ids 需要删除的giftID
	* @return 结果
	*/
	@Override
	public int deleteGiftConfigByIds(Long[] ids) {
		return giftConfigService.deleteGiftConfigByIds(ids);
	}

	/**
	* 删除gift信息
	*
	* @param id giftID
	* @return 结果
	*/
	@Override
	public int deleteGiftConfigById(Long id) {
		return giftConfigService.deleteGiftConfigById(id);
	}

}
