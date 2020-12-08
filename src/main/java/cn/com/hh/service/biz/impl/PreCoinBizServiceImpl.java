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
 * Description: [preBiz服务实现]
 */
@Service
public class PreCoinBizServiceImpl extends CommonService implements IPreCoinBizService {
	@Autowired
	private IPreCoinService preCoinService;

	/**
	* 查询pre
	*
	* @param id preID
	* @return pre
	*/
	@Override
	public PreCoin selectPreCoinById(Long id) {
		return preCoinService.selectPreCoinById(id);
	}

	/**
	* 查询pre列表
	*
	* @param preCoin pre
	* @return pre
	*/
	@Override
	public List<PreCoin> selectPreCoinList(PreCoin preCoin) {
		return preCoinService.selectPreCoinList(preCoin);
	}

	/**
	* 新增pre
	*
	* @param preCoin pre
	* @return 结果
	*/
	@Override
	public int insertPreCoin(PreCoin preCoin) {
		return preCoinService.insertPreCoin(preCoin);
	}

	/**
	* 修改pre
	*
	* @param preCoin pre
	* @return 结果
	*/
	@Override
	public int updatePreCoin(PreCoin preCoin) {
		return preCoinService.updatePreCoin(preCoin);
	}

	/**
	* 批量删除pre
	*
	* @param ids 需要删除的preID
	* @return 结果
	*/
	@Override
	public int deletePreCoinByIds(Long[] ids) {
		return preCoinService.deletePreCoinByIds(ids);
	}

	/**
	* 删除pre信息
	*
	* @param id preID
	* @return 结果
	*/
	@Override
	public int deletePreCoinById(Long id) {
		return preCoinService.deletePreCoinById(id);
	}

}
