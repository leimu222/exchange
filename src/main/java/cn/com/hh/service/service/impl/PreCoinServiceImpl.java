package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.PreCoinMapper;
import com.common.api.model.PreCoin;
import com.common.api.service.IPreCoinService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [pre服务实现]
 */
@Service
public class PreCoinServiceImpl implements IPreCoinService {
	@Autowired
	private PreCoinMapper preCoinMapper;

	/**
	* 查询pre
	*
	* @param id preID
	* @return pre
	*/
	@Override
	public PreCoin selectPreCoinById(Long id) {
		return preCoinMapper.selectPreCoinById(id);
	}

	/**
	* 查询pre列表
	*
	* @param preCoin pre
	* @return pre
	*/
	@Override
	public List<PreCoin> selectPreCoinList(PreCoin preCoin) {
		return preCoinMapper.selectPreCoinList(preCoin);
	}

	/**
	* 新增pre
	*
	* @param preCoin pre
	* @return 结果
	*/
	@Override
	public int insertPreCoin(PreCoin preCoin) {
		return preCoinMapper.insertPreCoin(preCoin);
	}

	/**
	* 修改pre
	*
	* @param preCoin pre
	* @return 结果
	*/
	@Override
	public int updatePreCoin(PreCoin preCoin) {
		return preCoinMapper.updatePreCoin(preCoin);
	}

	/**
	* 批量删除pre
	*
	* @param ids 需要删除的preID
	* @return 结果
	*/
	@Override
	public int deletePreCoinByIds(Long[] ids) {
		return preCoinMapper.deletePreCoinByIds(ids);
	}

	/**
	* 删除pre信息
	*
	* @param id preID
	* @return 结果
	*/
	@Override
	public int deletePreCoinById(Long id) {
		return preCoinMapper.deletePreCoinById(id);
	}

}
