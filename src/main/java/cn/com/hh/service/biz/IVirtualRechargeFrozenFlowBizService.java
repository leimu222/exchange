package com.common.api.service;

import java.util.List;

import com.common.api.model.virtualRechargeFrozenFlow;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [virtualBiz服务]
 */
public interface IVirtualRechargeFrozenFlowBizService {

	/**
	* 查询virtual
	*
	* @param id virtualID
	* @return virtual
	*/
	public VirtualRechargeFrozenFlow selectVirtualRechargeFrozenFlowById(Long id);

	/**
	* 查询virtual列表
	*
	* @param virtualRechargeFrozenFlow virtual
	* @return virtual集合
	*/
	public List<VirtualRechargeFrozenFlow> selectVirtualRechargeFrozenFlowList(VirtualRechargeFrozenFlow virtualRechargeFrozenFlow);

	/**
	* 新增virtual
	*
	* @param virtualRechargeFrozenFlow virtual
	* @return 结果
	*/
	public int insertVirtualRechargeFrozenFlow(VirtualRechargeFrozenFlow virtualRechargeFrozenFlow);

	/**
	* 修改virtual
	*
	* @param virtualRechargeFrozenFlow virtual
	* @return 结果
	*/
	public int updateVirtualRechargeFrozenFlow(VirtualRechargeFrozenFlow virtualRechargeFrozenFlow);

	/**
	* 批量删除virtual
	*
	* @param ids 需要删除的virtualID
	* @return 结果
	*/
	public int deleteVirtualRechargeFrozenFlowByIds(Long[] ids);

	/**
	* 删除virtual信息
	*
	* @param id virtualID
	* @return 结果
	*/
	public int deleteVirtualRechargeFrozenFlowById(Long id);
	
}
