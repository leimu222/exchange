package com.common.api.mapper;

import com.common.api.model.UnblockLotteryConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public interface UnblockLotteryConfigMapper{

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockLotteryConfig selectUnblockLotteryConfigById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockLotteryConfig unblock
	* @return unblock集合
	*/
	public List<UnblockLotteryConfig> selectUnblockLotteryConfigList(UnblockLotteryConfig unblockLotteryConfig);

	/**
	* 新增unblock
	*
	* @param unblockLotteryConfig unblock
	* @return 结果
	*/
	public int insertUnblockLotteryConfig(UnblockLotteryConfig unblockLotteryConfig);

	/**
	* 修改unblock
	*
	* @param unblockLotteryConfig unblock
	* @return 结果
	*/
	public int updateUnblockLotteryConfig(UnblockLotteryConfig unblockLotteryConfig);

	/**
	* 删除unblock
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockLotteryConfigById(Long id);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteUnblockLotteryConfigByIds(Long[] ids);

}
