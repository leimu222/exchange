package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.PanicBuyingRecordMapper;
import com.common.api.model.PanicBuyingRecord;
import com.common.api.service.IPanicBuyingRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [panic服务实现]
 */
@Service
public class PanicBuyingRecordServiceImpl implements IPanicBuyingRecordService {
	@Autowired
	private PanicBuyingRecordMapper panicBuyingRecordMapper;

	/**
	* 查询panic
	*
	* @param id panicID
	* @return panic
	*/
	@Override
	public PanicBuyingRecord selectPanicBuyingRecordById(Long id) {
		return panicBuyingRecordMapper.selectPanicBuyingRecordById(id);
	}

	/**
	* 查询panic列表
	*
	* @param panicBuyingRecord panic
	* @return panic
	*/
	@Override
	public List<PanicBuyingRecord> selectPanicBuyingRecordList(PanicBuyingRecord panicBuyingRecord) {
		return panicBuyingRecordMapper.selectPanicBuyingRecordList(panicBuyingRecord);
	}

	/**
	* 新增panic
	*
	* @param panicBuyingRecord panic
	* @return 结果
	*/
	@Override
	public int insertPanicBuyingRecord(PanicBuyingRecord panicBuyingRecord) {
		return panicBuyingRecordMapper.insertPanicBuyingRecord(panicBuyingRecord);
	}

	/**
	* 修改panic
	*
	* @param panicBuyingRecord panic
	* @return 结果
	*/
	@Override
	public int updatePanicBuyingRecord(PanicBuyingRecord panicBuyingRecord) {
		return panicBuyingRecordMapper.updatePanicBuyingRecord(panicBuyingRecord);
	}

	/**
	* 批量删除panic
	*
	* @param ids 需要删除的panicID
	* @return 结果
	*/
	@Override
	public int deletePanicBuyingRecordByIds(Long[] ids) {
		return panicBuyingRecordMapper.deletePanicBuyingRecordByIds(ids);
	}

	/**
	* 删除panic信息
	*
	* @param id panicID
	* @return 结果
	*/
	@Override
	public int deletePanicBuyingRecordById(Long id) {
		return panicBuyingRecordMapper.deletePanicBuyingRecordById(id);
	}

}
