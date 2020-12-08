package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionNodeMapper;
import com.common.api.model.OptionNode;
import com.common.api.service.IOptionNodeService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [option服务实现]
 */
@Service
public class OptionNodeServiceImpl implements IOptionNodeService {
	@Autowired
	private OptionNodeMapper optionNodeMapper;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionNode selectOptionNodeById(Long id) {
		return optionNodeMapper.selectOptionNodeById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionNode option
	* @return option
	*/
	@Override
	public List<OptionNode> selectOptionNodeList(OptionNode optionNode) {
		return optionNodeMapper.selectOptionNodeList(optionNode);
	}

	/**
	* 新增option
	*
	* @param optionNode option
	* @return 结果
	*/
	@Override
	public int insertOptionNode(OptionNode optionNode) {
		return optionNodeMapper.insertOptionNode(optionNode);
	}

	/**
	* 修改option
	*
	* @param optionNode option
	* @return 结果
	*/
	@Override
	public int updateOptionNode(OptionNode optionNode) {
		return optionNodeMapper.updateOptionNode(optionNode);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionNodeByIds(Long[] ids) {
		return optionNodeMapper.deleteOptionNodeByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionNodeById(Long id) {
		return optionNodeMapper.deleteOptionNodeById(id);
	}

}
