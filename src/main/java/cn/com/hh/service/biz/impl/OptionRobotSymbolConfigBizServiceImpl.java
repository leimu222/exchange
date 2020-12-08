package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionRobotSymbolConfigMapper;
import com.common.api.model.OptionRobotSymbolConfig;
import com.common.api.service.IOptionRobotSymbolConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [optionBiz服务实现]
 */
@Service
public class OptionRobotSymbolConfigBizServiceImpl extends CommonService implements IOptionRobotSymbolConfigBizService {
	@Autowired
	private IOptionRobotSymbolConfigService optionRobotSymbolConfigService;

	/**
	* 查询option
	*
	* @param symbol optionID
	* @return option
	*/
	@Override
	public OptionRobotSymbolConfig selectOptionRobotSymbolConfigById(String symbol) {
		return optionRobotSymbolConfigService.selectOptionRobotSymbolConfigById(symbol);
	}

	/**
	* 查询option列表
	*
	* @param optionRobotSymbolConfig option
	* @return option
	*/
	@Override
	public List<OptionRobotSymbolConfig> selectOptionRobotSymbolConfigList(OptionRobotSymbolConfig optionRobotSymbolConfig) {
		return optionRobotSymbolConfigService.selectOptionRobotSymbolConfigList(optionRobotSymbolConfig);
	}

	/**
	* 新增option
	*
	* @param optionRobotSymbolConfig option
	* @return 结果
	*/
	@Override
	public int insertOptionRobotSymbolConfig(OptionRobotSymbolConfig optionRobotSymbolConfig) {
		return optionRobotSymbolConfigService.insertOptionRobotSymbolConfig(optionRobotSymbolConfig);
	}

	/**
	* 修改option
	*
	* @param optionRobotSymbolConfig option
	* @return 结果
	*/
	@Override
	public int updateOptionRobotSymbolConfig(OptionRobotSymbolConfig optionRobotSymbolConfig) {
		return optionRobotSymbolConfigService.updateOptionRobotSymbolConfig(optionRobotSymbolConfig);
	}

	/**
	* 批量删除option
	*
	* @param symbols 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionRobotSymbolConfigByIds(String[] symbols) {
		return optionRobotSymbolConfigService.deleteOptionRobotSymbolConfigByIds(symbols);
	}

	/**
	* 删除option信息
	*
	* @param symbol optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionRobotSymbolConfigById(String symbol) {
		return optionRobotSymbolConfigService.deleteOptionRobotSymbolConfigById(symbol);
	}

}
