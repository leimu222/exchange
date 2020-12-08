package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.LeverCoinMapper;
import com.common.api.model.LeverCoin;
import com.common.api.service.ILeverCoinService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [lever服务实现]
 */
@Service
public class LeverCoinServiceImpl implements ILeverCoinService {
	@Autowired
	private LeverCoinMapper leverCoinMapper;

	/**
	* 查询lever
	*
	* @param id leverID
	* @return lever
	*/
	@Override
	public LeverCoin selectLeverCoinById(Long id) {
		return leverCoinMapper.selectLeverCoinById(id);
	}

	/**
	* 查询lever列表
	*
	* @param leverCoin lever
	* @return lever
	*/
	@Override
	public List<LeverCoin> selectLeverCoinList(LeverCoin leverCoin) {
		return leverCoinMapper.selectLeverCoinList(leverCoin);
	}

	/**
	* 新增lever
	*
	* @param leverCoin lever
	* @return 结果
	*/
	@Override
	public int insertLeverCoin(LeverCoin leverCoin) {
		return leverCoinMapper.insertLeverCoin(leverCoin);
	}

	/**
	* 修改lever
	*
	* @param leverCoin lever
	* @return 结果
	*/
	@Override
	public int updateLeverCoin(LeverCoin leverCoin) {
		return leverCoinMapper.updateLeverCoin(leverCoin);
	}

	/**
	* 批量删除lever
	*
	* @param ids 需要删除的leverID
	* @return 结果
	*/
	@Override
	public int deleteLeverCoinByIds(Long[] ids) {
		return leverCoinMapper.deleteLeverCoinByIds(ids);
	}

	/**
	* 删除lever信息
	*
	* @param id leverID
	* @return 结果
	*/
	@Override
	public int deleteLeverCoinById(Long id) {
		return leverCoinMapper.deleteLeverCoinById(id);
	}

}
