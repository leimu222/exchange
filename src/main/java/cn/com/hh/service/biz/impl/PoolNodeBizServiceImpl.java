package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.PoolNodeMapper;
import com.common.api.model.PoolNode;
import com.common.api.service.IPoolNodeService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [poolBiz服务实现]
 */
@Service
public class PoolNodeBizServiceImpl extends CommonService implements IPoolNodeBizService {
	@Autowired
	private IPoolNodeService poolNodeService;

	/**
	* 查询pool
	*
	* @param id poolID
	* @return pool
	*/
	@Override
	public PoolNode selectPoolNodeById(Long id) {
		return poolNodeService.selectPoolNodeById(id);
	}

	/**
	* 查询pool列表
	*
	* @param poolNode pool
	* @return pool
	*/
	@Override
	public List<PoolNode> selectPoolNodeList(PoolNode poolNode) {
		return poolNodeService.selectPoolNodeList(poolNode);
	}

	/**
	* 新增pool
	*
	* @param poolNode pool
	* @return 结果
	*/
	@Override
	public int insertPoolNode(PoolNode poolNode) {
		return poolNodeService.insertPoolNode(poolNode);
	}

	/**
	* 修改pool
	*
	* @param poolNode pool
	* @return 结果
	*/
	@Override
	public int updatePoolNode(PoolNode poolNode) {
		return poolNodeService.updatePoolNode(poolNode);
	}

	/**
	* 批量删除pool
	*
	* @param ids 需要删除的poolID
	* @return 结果
	*/
	@Override
	public int deletePoolNodeByIds(Long[] ids) {
		return poolNodeService.deletePoolNodeByIds(ids);
	}

	/**
	* 删除pool信息
	*
	* @param id poolID
	* @return 结果
	*/
	@Override
	public int deletePoolNodeById(Long id) {
		return poolNodeService.deletePoolNodeById(id);
	}

}
