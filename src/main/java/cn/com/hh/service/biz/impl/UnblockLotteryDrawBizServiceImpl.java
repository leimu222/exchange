package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.UnblockLotteryDrawMapper;
import com.common.api.model.UnblockLotteryDraw;
import com.common.api.service.IUnblockLotteryDrawService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [unblockBiz服务实现]
 */
@Service
public class UnblockLotteryDrawBizServiceImpl extends CommonService implements IUnblockLotteryDrawBizService {
	@Autowired
	private IUnblockLotteryDrawService unblockLotteryDrawService;

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	@Override
	public UnblockLotteryDraw selectUnblockLotteryDrawById(Long id) {
		return unblockLotteryDrawService.selectUnblockLotteryDrawById(id);
	}

	/**
	* 查询unblock列表
	*
	* @param unblockLotteryDraw unblock
	* @return unblock
	*/
	@Override
	public List<UnblockLotteryDraw> selectUnblockLotteryDrawList(UnblockLotteryDraw unblockLotteryDraw) {
		return unblockLotteryDrawService.selectUnblockLotteryDrawList(unblockLotteryDraw);
	}

	/**
	* 新增unblock
	*
	* @param unblockLotteryDraw unblock
	* @return 结果
	*/
	@Override
	public int insertUnblockLotteryDraw(UnblockLotteryDraw unblockLotteryDraw) {
		return unblockLotteryDrawService.insertUnblockLotteryDraw(unblockLotteryDraw);
	}

	/**
	* 修改unblock
	*
	* @param unblockLotteryDraw unblock
	* @return 结果
	*/
	@Override
	public int updateUnblockLotteryDraw(UnblockLotteryDraw unblockLotteryDraw) {
		return unblockLotteryDrawService.updateUnblockLotteryDraw(unblockLotteryDraw);
	}

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockLotteryDrawByIds(Long[] ids) {
		return unblockLotteryDrawService.deleteUnblockLotteryDrawByIds(ids);
	}

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockLotteryDrawById(Long id) {
		return unblockLotteryDrawService.deleteUnblockLotteryDrawById(id);
	}

}
