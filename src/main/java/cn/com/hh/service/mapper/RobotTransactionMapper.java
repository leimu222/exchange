package com.common.api.mapper;

import com.common.api.model.RobotTransaction;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [robot服务实现]
 */
public interface RobotTransactionMapper{

	/**
	* 查询robot
	*
	* @param id robotID
	* @return robot
	*/
	public RobotTransaction selectRobotTransactionById(Long id);

	/**
	* 查询robot列表
	*
	* @param robotTransaction robot
	* @return robot集合
	*/
	public List<RobotTransaction> selectRobotTransactionList(RobotTransaction robotTransaction);

	/**
	* 新增robot
	*
	* @param robotTransaction robot
	* @return 结果
	*/
	public int insertRobotTransaction(RobotTransaction robotTransaction);

	/**
	* 修改robot
	*
	* @param robotTransaction robot
	* @return 结果
	*/
	public int updateRobotTransaction(RobotTransaction robotTransaction);

	/**
	* 删除robot
	*
	* @param id robotID
	* @return 结果
	*/
	public int deleteRobotTransactionById(Long id);

	/**
	* 批量删除robot
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteRobotTransactionByIds(Long[] ids);

}
