package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionCoinNodeMapper;
import com.common.api.model.OptionCoinNode;
import com.common.api.service.IOptionCoinNodeService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [option服务实现]
 */
@Service
public class OptionCoinNodeServiceImpl implements IOptionCoinNodeService {
	@Autowired
	private OptionCoinNodeMapper optionCoinNodeMapper;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionCoinNode selectOptionCoinNodeById(Integer id) {
		return optionCoinNodeMapper.selectOptionCoinNodeById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionCoinNode option
	* @return option
	*/
	@Override
	public List<OptionCoinNode> selectOptionCoinNodeList(OptionCoinNode optionCoinNode) {
		return optionCoinNodeMapper.selectOptionCoinNodeList(optionCoinNode);
	}

	/**
	* 新增option
	*
	* @param optionCoinNode option
	* @return 结果
	*/
	@Override
	public int insertOptionCoinNode(OptionCoinNode optionCoinNode) {
		return optionCoinNodeMapper.insertOptionCoinNode(optionCoinNode);
	}

	/**
	* 修改option
	*
	* @param optionCoinNode option
	* @return 结果
	*/
	@Override
	public int updateOptionCoinNode(OptionCoinNode optionCoinNode) {
		return optionCoinNodeMapper.updateOptionCoinNode(optionCoinNode);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionCoinNodeByIds(Integer[] ids) {
		return optionCoinNodeMapper.deleteOptionCoinNodeByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionCoinNodeById(Integer id) {
		return optionCoinNodeMapper.deleteOptionCoinNodeById(id);
	}

}
