package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionStrategyConfigMapper;
import com.common.api.model.OptionStrategyConfig;
import com.common.api.service.IOptionStrategyConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [option服务实现]
 */
@Service
public class OptionStrategyConfigServiceImpl implements IOptionStrategyConfigService {
	@Autowired
	private OptionStrategyConfigMapper optionStrategyConfigMapper;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionStrategyConfig selectOptionStrategyConfigById(Long id) {
		return optionStrategyConfigMapper.selectOptionStrategyConfigById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionStrategyConfig option
	* @return option
	*/
	@Override
	public List<OptionStrategyConfig> selectOptionStrategyConfigList(OptionStrategyConfig optionStrategyConfig) {
		return optionStrategyConfigMapper.selectOptionStrategyConfigList(optionStrategyConfig);
	}

	/**
	* 新增option
	*
	* @param optionStrategyConfig option
	* @return 结果
	*/
	@Override
	public int insertOptionStrategyConfig(OptionStrategyConfig optionStrategyConfig) {
		return optionStrategyConfigMapper.insertOptionStrategyConfig(optionStrategyConfig);
	}

	/**
	* 修改option
	*
	* @param optionStrategyConfig option
	* @return 结果
	*/
	@Override
	public int updateOptionStrategyConfig(OptionStrategyConfig optionStrategyConfig) {
		return optionStrategyConfigMapper.updateOptionStrategyConfig(optionStrategyConfig);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionStrategyConfigByIds(Long[] ids) {
		return optionStrategyConfigMapper.deleteOptionStrategyConfigByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionStrategyConfigById(Long id) {
		return optionStrategyConfigMapper.deleteOptionStrategyConfigById(id);
	}

}
