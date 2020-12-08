package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.HotTransferRecordMapper;
import com.common.api.model.HotTransferRecord;
import com.common.api.service.IHotTransferRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [hotBiz服务实现]
 */
@Service
public class HotTransferRecordBizServiceImpl extends CommonService implements IHotTransferRecordBizService {
	@Autowired
	private IHotTransferRecordService hotTransferRecordService;

	/**
	* 查询hot
	*
	* @param id hotID
	* @return hot
	*/
	@Override
	public HotTransferRecord selectHotTransferRecordById(Long id) {
		return hotTransferRecordService.selectHotTransferRecordById(id);
	}

	/**
	* 查询hot列表
	*
	* @param hotTransferRecord hot
	* @return hot
	*/
	@Override
	public List<HotTransferRecord> selectHotTransferRecordList(HotTransferRecord hotTransferRecord) {
		return hotTransferRecordService.selectHotTransferRecordList(hotTransferRecord);
	}

	/**
	* 新增hot
	*
	* @param hotTransferRecord hot
	* @return 结果
	*/
	@Override
	public int insertHotTransferRecord(HotTransferRecord hotTransferRecord) {
		return hotTransferRecordService.insertHotTransferRecord(hotTransferRecord);
	}

	/**
	* 修改hot
	*
	* @param hotTransferRecord hot
	* @return 结果
	*/
	@Override
	public int updateHotTransferRecord(HotTransferRecord hotTransferRecord) {
		return hotTransferRecordService.updateHotTransferRecord(hotTransferRecord);
	}

	/**
	* 批量删除hot
	*
	* @param ids 需要删除的hotID
	* @return 结果
	*/
	@Override
	public int deleteHotTransferRecordByIds(Long[] ids) {
		return hotTransferRecordService.deleteHotTransferRecordByIds(ids);
	}

	/**
	* 删除hot信息
	*
	* @param id hotID
	* @return 结果
	*/
	@Override
	public int deleteHotTransferRecordById(Long id) {
		return hotTransferRecordService.deleteHotTransferRecordById(id);
	}

}
