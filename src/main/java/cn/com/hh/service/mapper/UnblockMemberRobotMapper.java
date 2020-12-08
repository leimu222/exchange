package com.common.api.mapper;

import com.common.api.model.UnblockMemberRobot;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public interface UnblockMemberRobotMapper{

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockMemberRobot selectUnblockMemberRobotById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockMemberRobot unblock
	* @return unblock集合
	*/
	public List<UnblockMemberRobot> selectUnblockMemberRobotList(UnblockMemberRobot unblockMemberRobot);

	/**
	* 新增unblock
	*
	* @param unblockMemberRobot unblock
	* @return 结果
	*/
	public int insertUnblockMemberRobot(UnblockMemberRobot unblockMemberRobot);

	/**
	* 修改unblock
	*
	* @param unblockMemberRobot unblock
	* @return 结果
	*/
	public int updateUnblockMemberRobot(UnblockMemberRobot unblockMemberRobot);

	/**
	* 删除unblock
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockMemberRobotById(Long id);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteUnblockMemberRobotByIds(Long[] ids);

}
