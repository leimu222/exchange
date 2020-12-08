package com.common.api.service;

import java.util.List;

import com.common.api.model.optionCoinNode;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [option服务]
 */
public interface IOptionCoinNodeService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionCoinNode selectOptionCoinNodeById(Integer id);

	/**
	* 查询option列表
	*
	* @param optionCoinNode option
	* @return option集合
	*/
	public List<OptionCoinNode> selectOptionCoinNodeList(OptionCoinNode optionCoinNode);

	/**
	* 新增option
	*
	* @param optionCoinNode option
	* @return 结果
	*/
	public int insertOptionCoinNode(OptionCoinNode optionCoinNode);

	/**
	* 修改option
	*
	* @param optionCoinNode option
	* @return 结果
	*/
	public int updateOptionCoinNode(OptionCoinNode optionCoinNode);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionCoinNodeByIds(Integer[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionCoinNodeById(Integer id);
	
}
