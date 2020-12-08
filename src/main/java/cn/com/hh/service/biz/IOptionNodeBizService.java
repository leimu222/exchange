package com.common.api.service;

import java.util.List;

import com.common.api.model.optionNode;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [optionBiz服务]
 */
public interface IOptionNodeBizService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionNode selectOptionNodeById(Long id);

	/**
	* 查询option列表
	*
	* @param optionNode option
	* @return option集合
	*/
	public List<OptionNode> selectOptionNodeList(OptionNode optionNode);

	/**
	* 新增option
	*
	* @param optionNode option
	* @return 结果
	*/
	public int insertOptionNode(OptionNode optionNode);

	/**
	* 修改option
	*
	* @param optionNode option
	* @return 结果
	*/
	public int updateOptionNode(OptionNode optionNode);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionNodeByIds(Long[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionNodeById(Long id);
	
}
