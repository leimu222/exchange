package com.common.api.service;

import java.util.List;

import com.common.api.model.panicBuyingRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [panic服务]
 */
public interface IPanicBuyingRecordService {

	/**
	* 查询panic
	*
	* @param id panicID
	* @return panic
	*/
	public PanicBuyingRecord selectPanicBuyingRecordById(Long id);

	/**
	* 查询panic列表
	*
	* @param panicBuyingRecord panic
	* @return panic集合
	*/
	public List<PanicBuyingRecord> selectPanicBuyingRecordList(PanicBuyingRecord panicBuyingRecord);

	/**
	* 新增panic
	*
	* @param panicBuyingRecord panic
	* @return 结果
	*/
	public int insertPanicBuyingRecord(PanicBuyingRecord panicBuyingRecord);

	/**
	* 修改panic
	*
	* @param panicBuyingRecord panic
	* @return 结果
	*/
	public int updatePanicBuyingRecord(PanicBuyingRecord panicBuyingRecord);

	/**
	* 批量删除panic
	*
	* @param ids 需要删除的panicID
	* @return 结果
	*/
	public int deletePanicBuyingRecordByIds(Long[] ids);

	/**
	* 删除panic信息
	*
	* @param id panicID
	* @return 结果
	*/
	public int deletePanicBuyingRecordById(Long id);
	
}
