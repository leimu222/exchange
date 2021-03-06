package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.CoinIssuedMapper;
import com.common.api.model.CoinIssued;
import com.common.api.service.ICoinIssuedService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:02
 * Description: [coin服务实现]
 */
@Service
public class CoinIssuedServiceImpl implements ICoinIssuedService {
	@Autowired
	private CoinIssuedMapper coinIssuedMapper;

	/**
	* 查询coin
	*
	* @param name coinID
	* @return coin
	*/
	@Override
	public CoinIssued selectCoinIssuedById(String name) {
		return coinIssuedMapper.selectCoinIssuedById(name);
	}

	/**
	* 查询coin列表
	*
	* @param coinIssued coin
	* @return coin
	*/
	@Override
	public List<CoinIssued> selectCoinIssuedList(CoinIssued coinIssued) {
		return coinIssuedMapper.selectCoinIssuedList(coinIssued);
	}

	/**
	* 新增coin
	*
	* @param coinIssued coin
	* @return 结果
	*/
	@Override
	public int insertCoinIssued(CoinIssued coinIssued) {
		return coinIssuedMapper.insertCoinIssued(coinIssued);
	}

	/**
	* 修改coin
	*
	* @param coinIssued coin
	* @return 结果
	*/
	@Override
	public int updateCoinIssued(CoinIssued coinIssued) {
		return coinIssuedMapper.updateCoinIssued(coinIssued);
	}

	/**
	* 批量删除coin
	*
	* @param names 需要删除的coinID
	* @return 结果
	*/
	@Override
	public int deleteCoinIssuedByIds(String[] names) {
		return coinIssuedMapper.deleteCoinIssuedByIds(names);
	}

	/**
	* 删除coin信息
	*
	* @param name coinID
	* @return 结果
	*/
	@Override
	public int deleteCoinIssuedById(String name) {
		return coinIssuedMapper.deleteCoinIssuedById(name);
	}

}
