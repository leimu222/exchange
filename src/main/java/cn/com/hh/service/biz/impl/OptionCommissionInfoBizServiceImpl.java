package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionCommissionInfoMapper;
import com.common.api.model.OptionCommissionInfo;
import com.common.api.service.IOptionCommissionInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [optionBiz服务实现]
 */
@Service
public class OptionCommissionInfoBizServiceImpl extends CommonService implements IOptionCommissionInfoBizService {
	@Autowired
	private IOptionCommissionInfoService optionCommissionInfoService;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionCommissionInfo selectOptionCommissionInfoById(Integer id) {
		return optionCommissionInfoService.selectOptionCommissionInfoById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionCommissionInfo option
	* @return option
	*/
	@Override
	public List<OptionCommissionInfo> selectOptionCommissionInfoList(OptionCommissionInfo optionCommissionInfo) {
		return optionCommissionInfoService.selectOptionCommissionInfoList(optionCommissionInfo);
	}

	/**
	* 新增option
	*
	* @param optionCommissionInfo option
	* @return 结果
	*/
	@Override
	public int insertOptionCommissionInfo(OptionCommissionInfo optionCommissionInfo) {
		return optionCommissionInfoService.insertOptionCommissionInfo(optionCommissionInfo);
	}

	/**
	* 修改option
	*
	* @param optionCommissionInfo option
	* @return 结果
	*/
	@Override
	public int updateOptionCommissionInfo(OptionCommissionInfo optionCommissionInfo) {
		return optionCommissionInfoService.updateOptionCommissionInfo(optionCommissionInfo);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionCommissionInfoByIds(Integer[] ids) {
		return optionCommissionInfoService.deleteOptionCommissionInfoByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionCommissionInfoById(Integer id) {
		return optionCommissionInfoService.deleteOptionCommissionInfoById(id);
	}

}
