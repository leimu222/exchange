package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.PoolProfitInfoMapper;
import com.common.api.model.PoolProfitInfo;
import com.common.api.service.IPoolProfitInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [poolBiz服务实现]
 */
@Service
public class PoolProfitInfoBizServiceImpl extends CommonService implements IPoolProfitInfoBizService {
	@Autowired
	private IPoolProfitInfoService poolProfitInfoService;

	/**
	* 查询pool
	*
	* @param id poolID
	* @return pool
	*/
	@Override
	public PoolProfitInfo selectPoolProfitInfoById(Long id) {
		return poolProfitInfoService.selectPoolProfitInfoById(id);
	}

	/**
	* 查询pool列表
	*
	* @param poolProfitInfo pool
	* @return pool
	*/
	@Override
	public List<PoolProfitInfo> selectPoolProfitInfoList(PoolProfitInfo poolProfitInfo) {
		return poolProfitInfoService.selectPoolProfitInfoList(poolProfitInfo);
	}

	/**
	* 新增pool
	*
	* @param poolProfitInfo pool
	* @return 结果
	*/
	@Override
	public int insertPoolProfitInfo(PoolProfitInfo poolProfitInfo) {
		return poolProfitInfoService.insertPoolProfitInfo(poolProfitInfo);
	}

	/**
	* 修改pool
	*
	* @param poolProfitInfo pool
	* @return 结果
	*/
	@Override
	public int updatePoolProfitInfo(PoolProfitInfo poolProfitInfo) {
		return poolProfitInfoService.updatePoolProfitInfo(poolProfitInfo);
	}

	/**
	* 批量删除pool
	*
	* @param ids 需要删除的poolID
	* @return 结果
	*/
	@Override
	public int deletePoolProfitInfoByIds(Long[] ids) {
		return poolProfitInfoService.deletePoolProfitInfoByIds(ids);
	}

	/**
	* 删除pool信息
	*
	* @param id poolID
	* @return 结果
	*/
	@Override
	public int deletePoolProfitInfoById(Long id) {
		return poolProfitInfoService.deletePoolProfitInfoById(id);
	}

}
