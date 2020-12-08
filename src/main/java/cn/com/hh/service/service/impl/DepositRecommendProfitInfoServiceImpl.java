package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.DepositRecommendProfitInfoMapper;
import com.common.api.model.DepositRecommendProfitInfo;
import com.common.api.service.IDepositRecommendProfitInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [deposit服务实现]
 */
@Service
public class DepositRecommendProfitInfoServiceImpl implements IDepositRecommendProfitInfoService {
	@Autowired
	private DepositRecommendProfitInfoMapper depositRecommendProfitInfoMapper;

	/**
	* 查询deposit
	*
	* @param id depositID
	* @return deposit
	*/
	@Override
	public DepositRecommendProfitInfo selectDepositRecommendProfitInfoById(Long id) {
		return depositRecommendProfitInfoMapper.selectDepositRecommendProfitInfoById(id);
	}

	/**
	* 查询deposit列表
	*
	* @param depositRecommendProfitInfo deposit
	* @return deposit
	*/
	@Override
	public List<DepositRecommendProfitInfo> selectDepositRecommendProfitInfoList(DepositRecommendProfitInfo depositRecommendProfitInfo) {
		return depositRecommendProfitInfoMapper.selectDepositRecommendProfitInfoList(depositRecommendProfitInfo);
	}

	/**
	* 新增deposit
	*
	* @param depositRecommendProfitInfo deposit
	* @return 结果
	*/
	@Override
	public int insertDepositRecommendProfitInfo(DepositRecommendProfitInfo depositRecommendProfitInfo) {
		return depositRecommendProfitInfoMapper.insertDepositRecommendProfitInfo(depositRecommendProfitInfo);
	}

	/**
	* 修改deposit
	*
	* @param depositRecommendProfitInfo deposit
	* @return 结果
	*/
	@Override
	public int updateDepositRecommendProfitInfo(DepositRecommendProfitInfo depositRecommendProfitInfo) {
		return depositRecommendProfitInfoMapper.updateDepositRecommendProfitInfo(depositRecommendProfitInfo);
	}

	/**
	* 批量删除deposit
	*
	* @param ids 需要删除的depositID
	* @return 结果
	*/
	@Override
	public int deleteDepositRecommendProfitInfoByIds(Long[] ids) {
		return depositRecommendProfitInfoMapper.deleteDepositRecommendProfitInfoByIds(ids);
	}

	/**
	* 删除deposit信息
	*
	* @param id depositID
	* @return 结果
	*/
	@Override
	public int deleteDepositRecommendProfitInfoById(Long id) {
		return depositRecommendProfitInfoMapper.deleteDepositRecommendProfitInfoById(id);
	}

}
