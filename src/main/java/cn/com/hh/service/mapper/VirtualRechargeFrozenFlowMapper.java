package com.common.api.mapper;

import com.common.api.model.VirtualRechargeFrozenFlow;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [virtual服务实现]
 */
public interface VirtualRechargeFrozenFlowMapper{

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
	* 删除virtual
	*
	* @param id virtualID
	* @return 结果
	*/
	public int deleteVirtualRechargeFrozenFlowById(Long id);

	/**
	* 批量删除virtual
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteVirtualRechargeFrozenFlowByIds(Long[] ids);

}
