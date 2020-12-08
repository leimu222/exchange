package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.DepositProfitInfoMapper;
import com.common.api.model.DepositProfitInfo;
import com.common.api.service.IDepositProfitInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [depositBiz服务实现]
 */
@Service
public class DepositProfitInfoBizServiceImpl extends CommonService implements IDepositProfitInfoBizService {
	@Autowired
	private IDepositProfitInfoService depositProfitInfoService;

	/**
	* 查询deposit
	*
	* @param id depositID
	* @return deposit
	*/
	@Override
	public DepositProfitInfo selectDepositProfitInfoById(Long id) {
		return depositProfitInfoService.selectDepositProfitInfoById(id);
	}

	/**
	* 查询deposit列表
	*
	* @param depositProfitInfo deposit
	* @return deposit
	*/
	@Override
	public List<DepositProfitInfo> selectDepositProfitInfoList(DepositProfitInfo depositProfitInfo) {
		return depositProfitInfoService.selectDepositProfitInfoList(depositProfitInfo);
	}

	/**
	* 新增deposit
	*
	* @param depositProfitInfo deposit
	* @return 结果
	*/
	@Override
	public int insertDepositProfitInfo(DepositProfitInfo depositProfitInfo) {
		return depositProfitInfoService.insertDepositProfitInfo(depositProfitInfo);
	}

	/**
	* 修改deposit
	*
	* @param depositProfitInfo deposit
	* @return 结果
	*/
	@Override
	public int updateDepositProfitInfo(DepositProfitInfo depositProfitInfo) {
		return depositProfitInfoService.updateDepositProfitInfo(depositProfitInfo);
	}

	/**
	* 批量删除deposit
	*
	* @param ids 需要删除的depositID
	* @return 结果
	*/
	@Override
	public int deleteDepositProfitInfoByIds(Long[] ids) {
		return depositProfitInfoService.deleteDepositProfitInfoByIds(ids);
	}

	/**
	* 删除deposit信息
	*
	* @param id depositID
	* @return 结果
	*/
	@Override
	public int deleteDepositProfitInfoById(Long id) {
		return depositProfitInfoService.deleteDepositProfitInfoById(id);
	}

}
