package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.CoinCollectLogMapper;
import com.common.api.model.CoinCollectLog;
import com.common.api.service.ICoinCollectLogService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:01
 * Description: [coin服务实现]
 */
@Service
public class CoinCollectLogServiceImpl implements ICoinCollectLogService {
	@Autowired
	private CoinCollectLogMapper coinCollectLogMapper;

	/**
	* 查询coin
	*
	* @param id coinID
	* @return coin
	*/
	@Override
	public CoinCollectLog selectCoinCollectLogById(Integer id) {
		return coinCollectLogMapper.selectCoinCollectLogById(id);
	}

	/**
	* 查询coin列表
	*
	* @param coinCollectLog coin
	* @return coin
	*/
	@Override
	public List<CoinCollectLog> selectCoinCollectLogList(CoinCollectLog coinCollectLog) {
		return coinCollectLogMapper.selectCoinCollectLogList(coinCollectLog);
	}

	/**
	* 新增coin
	*
	* @param coinCollectLog coin
	* @return 结果
	*/
	@Override
	public int insertCoinCollectLog(CoinCollectLog coinCollectLog) {
		return coinCollectLogMapper.insertCoinCollectLog(coinCollectLog);
	}

	/**
	* 修改coin
	*
	* @param coinCollectLog coin
	* @return 结果
	*/
	@Override
	public int updateCoinCollectLog(CoinCollectLog coinCollectLog) {
		return coinCollectLogMapper.updateCoinCollectLog(coinCollectLog);
	}

	/**
	* 批量删除coin
	*
	* @param ids 需要删除的coinID
	* @return 结果
	*/
	@Override
	public int deleteCoinCollectLogByIds(Integer[] ids) {
		return coinCollectLogMapper.deleteCoinCollectLogByIds(ids);
	}

	/**
	* 删除coin信息
	*
	* @param id coinID
	* @return 结果
	*/
	@Override
	public int deleteCoinCollectLogById(Integer id) {
		return coinCollectLogMapper.deleteCoinCollectLogById(id);
	}

}
