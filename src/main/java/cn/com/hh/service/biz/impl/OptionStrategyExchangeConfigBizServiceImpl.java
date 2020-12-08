package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionStrategyExchangeConfigMapper;
import com.common.api.model.OptionStrategyExchangeConfig;
import com.common.api.service.IOptionStrategyExchangeConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [optionBiz服务实现]
 */
@Service
public class OptionStrategyExchangeConfigBizServiceImpl extends CommonService implements IOptionStrategyExchangeConfigBizService {
	@Autowired
	private IOptionStrategyExchangeConfigService optionStrategyExchangeConfigService;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionStrategyExchangeConfig selectOptionStrategyExchangeConfigById(Long id) {
		return optionStrategyExchangeConfigService.selectOptionStrategyExchangeConfigById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionStrategyExchangeConfig option
	* @return option
	*/
	@Override
	public List<OptionStrategyExchangeConfig> selectOptionStrategyExchangeConfigList(OptionStrategyExchangeConfig optionStrategyExchangeConfig) {
		return optionStrategyExchangeConfigService.selectOptionStrategyExchangeConfigList(optionStrategyExchangeConfig);
	}

	/**
	* 新增option
	*
	* @param optionStrategyExchangeConfig option
	* @return 结果
	*/
	@Override
	public int insertOptionStrategyExchangeConfig(OptionStrategyExchangeConfig optionStrategyExchangeConfig) {
		return optionStrategyExchangeConfigService.insertOptionStrategyExchangeConfig(optionStrategyExchangeConfig);
	}

	/**
	* 修改option
	*
	* @param optionStrategyExchangeConfig option
	* @return 结果
	*/
	@Override
	public int updateOptionStrategyExchangeConfig(OptionStrategyExchangeConfig optionStrategyExchangeConfig) {
		return optionStrategyExchangeConfigService.updateOptionStrategyExchangeConfig(optionStrategyExchangeConfig);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionStrategyExchangeConfigByIds(Long[] ids) {
		return optionStrategyExchangeConfigService.deleteOptionStrategyExchangeConfigByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionStrategyExchangeConfigById(Long id) {
		return optionStrategyExchangeConfigService.deleteOptionStrategyExchangeConfigById(id);
	}

}
