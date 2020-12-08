package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.CoinMapper;
import com.common.api.model.Coin;
import com.common.api.service.ICoinService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:01
 * Description: [coin服务实现]
 */
@Service
public class CoinServiceImpl implements ICoinService {
	@Autowired
	private CoinMapper coinMapper;

	/**
	* 查询coin
	*
	* @param name coinID
	* @return coin
	*/
	@Override
	public Coin selectCoinById(String name) {
		return coinMapper.selectCoinById(name);
	}

	/**
	* 查询coin列表
	*
	* @param coin coin
	* @return coin
	*/
	@Override
	public List<Coin> selectCoinList(Coin coin) {
		return coinMapper.selectCoinList(coin);
	}

	/**
	* 新增coin
	*
	* @param coin coin
	* @return 结果
	*/
	@Override
	public int insertCoin(Coin coin) {
		return coinMapper.insertCoin(coin);
	}

	/**
	* 修改coin
	*
	* @param coin coin
	* @return 结果
	*/
	@Override
	public int updateCoin(Coin coin) {
		return coinMapper.updateCoin(coin);
	}

	/**
	* 批量删除coin
	*
	* @param names 需要删除的coinID
	* @return 结果
	*/
	@Override
	public int deleteCoinByIds(String[] names) {
		return coinMapper.deleteCoinByIds(names);
	}

	/**
	* 删除coin信息
	*
	* @param name coinID
	* @return 结果
	*/
	@Override
	public int deleteCoinById(String name) {
		return coinMapper.deleteCoinById(name);
	}

}
