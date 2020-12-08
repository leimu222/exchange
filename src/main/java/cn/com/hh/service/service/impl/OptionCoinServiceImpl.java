package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionCoinMapper;
import com.common.api.model.OptionCoin;
import com.common.api.service.IOptionCoinService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [option服务实现]
 */
@Service
public class OptionCoinServiceImpl implements IOptionCoinService {
	@Autowired
	private OptionCoinMapper optionCoinMapper;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionCoin selectOptionCoinById(Long id) {
		return optionCoinMapper.selectOptionCoinById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionCoin option
	* @return option
	*/
	@Override
	public List<OptionCoin> selectOptionCoinList(OptionCoin optionCoin) {
		return optionCoinMapper.selectOptionCoinList(optionCoin);
	}

	/**
	* 新增option
	*
	* @param optionCoin option
	* @return 结果
	*/
	@Override
	public int insertOptionCoin(OptionCoin optionCoin) {
		return optionCoinMapper.insertOptionCoin(optionCoin);
	}

	/**
	* 修改option
	*
	* @param optionCoin option
	* @return 结果
	*/
	@Override
	public int updateOptionCoin(OptionCoin optionCoin) {
		return optionCoinMapper.updateOptionCoin(optionCoin);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionCoinByIds(Long[] ids) {
		return optionCoinMapper.deleteOptionCoinByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionCoinById(Long id) {
		return optionCoinMapper.deleteOptionCoinById(id);
	}

}
