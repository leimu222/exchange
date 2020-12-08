package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.LeverWalletTransferRecordMapper;
import com.common.api.model.LeverWalletTransferRecord;
import com.common.api.service.ILeverWalletTransferRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [leverBiz服务实现]
 */
@Service
public class LeverWalletTransferRecordBizServiceImpl extends CommonService implements ILeverWalletTransferRecordBizService {
	@Autowired
	private ILeverWalletTransferRecordService leverWalletTransferRecordService;

	/**
	* 查询lever
	*
	* @param id leverID
	* @return lever
	*/
	@Override
	public LeverWalletTransferRecord selectLeverWalletTransferRecordById(Long id) {
		return leverWalletTransferRecordService.selectLeverWalletTransferRecordById(id);
	}

	/**
	* 查询lever列表
	*
	* @param leverWalletTransferRecord lever
	* @return lever
	*/
	@Override
	public List<LeverWalletTransferRecord> selectLeverWalletTransferRecordList(LeverWalletTransferRecord leverWalletTransferRecord) {
		return leverWalletTransferRecordService.selectLeverWalletTransferRecordList(leverWalletTransferRecord);
	}

	/**
	* 新增lever
	*
	* @param leverWalletTransferRecord lever
	* @return 结果
	*/
	@Override
	public int insertLeverWalletTransferRecord(LeverWalletTransferRecord leverWalletTransferRecord) {
		return leverWalletTransferRecordService.insertLeverWalletTransferRecord(leverWalletTransferRecord);
	}

	/**
	* 修改lever
	*
	* @param leverWalletTransferRecord lever
	* @return 结果
	*/
	@Override
	public int updateLeverWalletTransferRecord(LeverWalletTransferRecord leverWalletTransferRecord) {
		return leverWalletTransferRecordService.updateLeverWalletTransferRecord(leverWalletTransferRecord);
	}

	/**
	* 批量删除lever
	*
	* @param ids 需要删除的leverID
	* @return 结果
	*/
	@Override
	public int deleteLeverWalletTransferRecordByIds(Long[] ids) {
		return leverWalletTransferRecordService.deleteLeverWalletTransferRecordByIds(ids);
	}

	/**
	* 删除lever信息
	*
	* @param id leverID
	* @return 结果
	*/
	@Override
	public int deleteLeverWalletTransferRecordById(Long id) {
		return leverWalletTransferRecordService.deleteLeverWalletTransferRecordById(id);
	}

}
