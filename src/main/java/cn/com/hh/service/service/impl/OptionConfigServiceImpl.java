package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionConfigMapper;
import com.common.api.model.OptionConfig;
import com.common.api.service.IOptionConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [option服务实现]
 */
@Service
public class OptionConfigServiceImpl implements IOptionConfigService {
	@Autowired
	private OptionConfigMapper optionConfigMapper;

	/**
	* 查询option
	*
	* @param configKey optionID
	* @return option
	*/
	@Override
	public OptionConfig selectOptionConfigById(String configKey) {
		return optionConfigMapper.selectOptionConfigById(configKey);
	}

	/**
	* 查询option列表
	*
	* @param optionConfig option
	* @return option
	*/
	@Override
	public List<OptionConfig> selectOptionConfigList(OptionConfig optionConfig) {
		return optionConfigMapper.selectOptionConfigList(optionConfig);
	}

	/**
	* 新增option
	*
	* @param optionConfig option
	* @return 结果
	*/
	@Override
	public int insertOptionConfig(OptionConfig optionConfig) {
		return optionConfigMapper.insertOptionConfig(optionConfig);
	}

	/**
	* 修改option
	*
	* @param optionConfig option
	* @return 结果
	*/
	@Override
	public int updateOptionConfig(OptionConfig optionConfig) {
		return optionConfigMapper.updateOptionConfig(optionConfig);
	}

	/**
	* 批量删除option
	*
	* @param configKeys 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionConfigByIds(String[] configKeys) {
		return optionConfigMapper.deleteOptionConfigByIds(configKeys);
	}

	/**
	* 删除option信息
	*
	* @param configKey optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionConfigById(String configKey) {
		return optionConfigMapper.deleteOptionConfigById(configKey);
	}

}
