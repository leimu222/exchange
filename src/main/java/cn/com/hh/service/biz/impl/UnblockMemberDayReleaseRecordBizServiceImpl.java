package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.UnblockMemberDayReleaseRecordMapper;
import com.common.api.model.UnblockMemberDayReleaseRecord;
import com.common.api.service.IUnblockMemberDayReleaseRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [unblockBiz服务实现]
 */
@Service
public class UnblockMemberDayReleaseRecordBizServiceImpl extends CommonService implements IUnblockMemberDayReleaseRecordBizService {
	@Autowired
	private IUnblockMemberDayReleaseRecordService unblockMemberDayReleaseRecordService;

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	@Override
	public UnblockMemberDayReleaseRecord selectUnblockMemberDayReleaseRecordById(Long id) {
		return unblockMemberDayReleaseRecordService.selectUnblockMemberDayReleaseRecordById(id);
	}

	/**
	* 查询unblock列表
	*
	* @param unblockMemberDayReleaseRecord unblock
	* @return unblock
	*/
	@Override
	public List<UnblockMemberDayReleaseRecord> selectUnblockMemberDayReleaseRecordList(UnblockMemberDayReleaseRecord unblockMemberDayReleaseRecord) {
		return unblockMemberDayReleaseRecordService.selectUnblockMemberDayReleaseRecordList(unblockMemberDayReleaseRecord);
	}

	/**
	* 新增unblock
	*
	* @param unblockMemberDayReleaseRecord unblock
	* @return 结果
	*/
	@Override
	public int insertUnblockMemberDayReleaseRecord(UnblockMemberDayReleaseRecord unblockMemberDayReleaseRecord) {
		return unblockMemberDayReleaseRecordService.insertUnblockMemberDayReleaseRecord(unblockMemberDayReleaseRecord);
	}

	/**
	* 修改unblock
	*
	* @param unblockMemberDayReleaseRecord unblock
	* @return 结果
	*/
	@Override
	public int updateUnblockMemberDayReleaseRecord(UnblockMemberDayReleaseRecord unblockMemberDayReleaseRecord) {
		return unblockMemberDayReleaseRecordService.updateUnblockMemberDayReleaseRecord(unblockMemberDayReleaseRecord);
	}

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockMemberDayReleaseRecordByIds(Long[] ids) {
		return unblockMemberDayReleaseRecordService.deleteUnblockMemberDayReleaseRecordByIds(ids);
	}

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockMemberDayReleaseRecordById(Long id) {
		return unblockMemberDayReleaseRecordService.deleteUnblockMemberDayReleaseRecordById(id);
	}

}
