package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.WithdrawRecordMapper;
import com.common.api.model.WithdrawRecord;
import com.common.api.service.IWithdrawRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [withdraw服务实现]
 */
@Service
public class WithdrawRecordServiceImpl implements IWithdrawRecordService {
	@Autowired
	private WithdrawRecordMapper withdrawRecordMapper;

	/**
	* 查询withdraw
	*
	* @param id withdrawID
	* @return withdraw
	*/
	@Override
	public WithdrawRecord selectWithdrawRecordById(Long id) {
		return withdrawRecordMapper.selectWithdrawRecordById(id);
	}

	/**
	* 查询withdraw列表
	*
	* @param withdrawRecord withdraw
	* @return withdraw
	*/
	@Override
	public List<WithdrawRecord> selectWithdrawRecordList(WithdrawRecord withdrawRecord) {
		return withdrawRecordMapper.selectWithdrawRecordList(withdrawRecord);
	}

	/**
	* 新增withdraw
	*
	* @param withdrawRecord withdraw
	* @return 结果
	*/
	@Override
	public int insertWithdrawRecord(WithdrawRecord withdrawRecord) {
		return withdrawRecordMapper.insertWithdrawRecord(withdrawRecord);
	}

	/**
	* 修改withdraw
	*
	* @param withdrawRecord withdraw
	* @return 结果
	*/
	@Override
	public int updateWithdrawRecord(WithdrawRecord withdrawRecord) {
		return withdrawRecordMapper.updateWithdrawRecord(withdrawRecord);
	}

	/**
	* 批量删除withdraw
	*
	* @param ids 需要删除的withdrawID
	* @return 结果
	*/
	@Override
	public int deleteWithdrawRecordByIds(Long[] ids) {
		return withdrawRecordMapper.deleteWithdrawRecordByIds(ids);
	}

	/**
	* 删除withdraw信息
	*
	* @param id withdrawID
	* @return 结果
	*/
	@Override
	public int deleteWithdrawRecordById(Long id) {
		return withdrawRecordMapper.deleteWithdrawRecordById(id);
	}

}
