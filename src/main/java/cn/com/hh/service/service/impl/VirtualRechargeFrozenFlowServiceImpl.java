package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.VirtualRechargeFrozenFlowMapper;
import com.common.api.model.VirtualRechargeFrozenFlow;
import com.common.api.service.IVirtualRechargeFrozenFlowService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [virtual服务实现]
 */
@Service
public class VirtualRechargeFrozenFlowServiceImpl implements IVirtualRechargeFrozenFlowService {
	@Autowired
	private VirtualRechargeFrozenFlowMapper virtualRechargeFrozenFlowMapper;

	/**
	* 查询virtual
	*
	* @param id virtualID
	* @return virtual
	*/
	@Override
	public VirtualRechargeFrozenFlow selectVirtualRechargeFrozenFlowById(Long id) {
		return virtualRechargeFrozenFlowMapper.selectVirtualRechargeFrozenFlowById(id);
	}

	/**
	* 查询virtual列表
	*
	* @param virtualRechargeFrozenFlow virtual
	* @return virtual
	*/
	@Override
	public List<VirtualRechargeFrozenFlow> selectVirtualRechargeFrozenFlowList(VirtualRechargeFrozenFlow virtualRechargeFrozenFlow) {
		return virtualRechargeFrozenFlowMapper.selectVirtualRechargeFrozenFlowList(virtualRechargeFrozenFlow);
	}

	/**
	* 新增virtual
	*
	* @param virtualRechargeFrozenFlow virtual
	* @return 结果
	*/
	@Override
	public int insertVirtualRechargeFrozenFlow(VirtualRechargeFrozenFlow virtualRechargeFrozenFlow) {
		return virtualRechargeFrozenFlowMapper.insertVirtualRechargeFrozenFlow(virtualRechargeFrozenFlow);
	}

	/**
	* 修改virtual
	*
	* @param virtualRechargeFrozenFlow virtual
	* @return 结果
	*/
	@Override
	public int updateVirtualRechargeFrozenFlow(VirtualRechargeFrozenFlow virtualRechargeFrozenFlow) {
		return virtualRechargeFrozenFlowMapper.updateVirtualRechargeFrozenFlow(virtualRechargeFrozenFlow);
	}

	/**
	* 批量删除virtual
	*
	* @param ids 需要删除的virtualID
	* @return 结果
	*/
	@Override
	public int deleteVirtualRechargeFrozenFlowByIds(Long[] ids) {
		return virtualRechargeFrozenFlowMapper.deleteVirtualRechargeFrozenFlowByIds(ids);
	}

	/**
	* 删除virtual信息
	*
	* @param id virtualID
	* @return 结果
	*/
	@Override
	public int deleteVirtualRechargeFrozenFlowById(Long id) {
		return virtualRechargeFrozenFlowMapper.deleteVirtualRechargeFrozenFlowById(id);
	}

}
