package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionCoinInfoMapper;
import com.common.api.model.OptionCoinInfo;
import com.common.api.service.IOptionCoinInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [option服务实现]
 */
@Service
public class OptionCoinInfoServiceImpl implements IOptionCoinInfoService {
	@Autowired
	private OptionCoinInfoMapper optionCoinInfoMapper;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionCoinInfo selectOptionCoinInfoById(Integer id) {
		return optionCoinInfoMapper.selectOptionCoinInfoById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionCoinInfo option
	* @return option
	*/
	@Override
	public List<OptionCoinInfo> selectOptionCoinInfoList(OptionCoinInfo optionCoinInfo) {
		return optionCoinInfoMapper.selectOptionCoinInfoList(optionCoinInfo);
	}

	/**
	* 新增option
	*
	* @param optionCoinInfo option
	* @return 结果
	*/
	@Override
	public int insertOptionCoinInfo(OptionCoinInfo optionCoinInfo) {
		return optionCoinInfoMapper.insertOptionCoinInfo(optionCoinInfo);
	}

	/**
	* 修改option
	*
	* @param optionCoinInfo option
	* @return 结果
	*/
	@Override
	public int updateOptionCoinInfo(OptionCoinInfo optionCoinInfo) {
		return optionCoinInfoMapper.updateOptionCoinInfo(optionCoinInfo);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionCoinInfoByIds(Integer[] ids) {
		return optionCoinInfoMapper.deleteOptionCoinInfoByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionCoinInfoById(Integer id) {
		return optionCoinInfoMapper.deleteOptionCoinInfoById(id);
	}

}
