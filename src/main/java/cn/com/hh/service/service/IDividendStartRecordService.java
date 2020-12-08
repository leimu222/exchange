package com.common.api.service;

import java.util.List;

import com.common.api.model.dividendStartRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [dividend服务]
 */
public interface IDividendStartRecordService {

	/**
	* 查询dividend
	*
	* @param id dividendID
	* @return dividend
	*/
	public DividendStartRecord selectDividendStartRecordById(Long id);

	/**
	* 查询dividend列表
	*
	* @param dividendStartRecord dividend
	* @return dividend集合
	*/
	public List<DividendStartRecord> selectDividendStartRecordList(DividendStartRecord dividendStartRecord);

	/**
	* 新增dividend
	*
	* @param dividendStartRecord dividend
	* @return 结果
	*/
	public int insertDividendStartRecord(DividendStartRecord dividendStartRecord);

	/**
	* 修改dividend
	*
	* @param dividendStartRecord dividend
	* @return 结果
	*/
	public int updateDividendStartRecord(DividendStartRecord dividendStartRecord);

	/**
	* 批量删除dividend
	*
	* @param ids 需要删除的dividendID
	* @return 结果
	*/
	public int deleteDividendStartRecordByIds(Long[] ids);

	/**
	* 删除dividend信息
	*
	* @param id dividendID
	* @return 结果
	*/
	public int deleteDividendStartRecordById(Long id);
	
}
