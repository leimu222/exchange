package com.common.api.mapper;

import com.common.api.model.UnblockMemberReward;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public interface UnblockMemberRewardMapper{

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockMemberReward selectUnblockMemberRewardById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockMemberReward unblock
	* @return unblock集合
	*/
	public List<UnblockMemberReward> selectUnblockMemberRewardList(UnblockMemberReward unblockMemberReward);

	/**
	* 新增unblock
	*
	* @param unblockMemberReward unblock
	* @return 结果
	*/
	public int insertUnblockMemberReward(UnblockMemberReward unblockMemberReward);

	/**
	* 修改unblock
	*
	* @param unblockMemberReward unblock
	* @return 结果
	*/
	public int updateUnblockMemberReward(UnblockMemberReward unblockMemberReward);

	/**
	* 删除unblock
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockMemberRewardById(Long id);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteUnblockMemberRewardByIds(Long[] ids);

}
