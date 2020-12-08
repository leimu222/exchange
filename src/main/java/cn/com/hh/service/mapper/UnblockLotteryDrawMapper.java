package com.common.api.mapper;

import com.common.api.model.UnblockLotteryDraw;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public interface UnblockLotteryDrawMapper{

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockLotteryDraw selectUnblockLotteryDrawById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockLotteryDraw unblock
	* @return unblock集合
	*/
	public List<UnblockLotteryDraw> selectUnblockLotteryDrawList(UnblockLotteryDraw unblockLotteryDraw);

	/**
	* 新增unblock
	*
	* @param unblockLotteryDraw unblock
	* @return 结果
	*/
	public int insertUnblockLotteryDraw(UnblockLotteryDraw unblockLotteryDraw);

	/**
	* 修改unblock
	*
	* @param unblockLotteryDraw unblock
	* @return 结果
	*/
	public int updateUnblockLotteryDraw(UnblockLotteryDraw unblockLotteryDraw);

	/**
	* 删除unblock
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockLotteryDrawById(Long id);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteUnblockLotteryDrawByIds(Long[] ids);

}
