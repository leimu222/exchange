package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.DividendStartRecordMapper;
import com.common.api.model.DividendStartRecord;
import com.common.api.service.IDividendStartRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [dividendBiz服务实现]
 */
@Service
public class DividendStartRecordBizServiceImpl extends CommonService implements IDividendStartRecordBizService {
	@Autowired
	private IDividendStartRecordService dividendStartRecordService;

	/**
	* 查询dividend
	*
	* @param id dividendID
	* @return dividend
	*/
	@Override
	public DividendStartRecord selectDividendStartRecordById(Long id) {
		return dividendStartRecordService.selectDividendStartRecordById(id);
	}

	/**
	* 查询dividend列表
	*
	* @param dividendStartRecord dividend
	* @return dividend
	*/
	@Override
	public List<DividendStartRecord> selectDividendStartRecordList(DividendStartRecord dividendStartRecord) {
		return dividendStartRecordService.selectDividendStartRecordList(dividendStartRecord);
	}

	/**
	* 新增dividend
	*
	* @param dividendStartRecord dividend
	* @return 结果
	*/
	@Override
	public int insertDividendStartRecord(DividendStartRecord dividendStartRecord) {
		return dividendStartRecordService.insertDividendStartRecord(dividendStartRecord);
	}

	/**
	* 修改dividend
	*
	* @param dividendStartRecord dividend
	* @return 结果
	*/
	@Override
	public int updateDividendStartRecord(DividendStartRecord dividendStartRecord) {
		return dividendStartRecordService.updateDividendStartRecord(dividendStartRecord);
	}

	/**
	* 批量删除dividend
	*
	* @param ids 需要删除的dividendID
	* @return 结果
	*/
	@Override
	public int deleteDividendStartRecordByIds(Long[] ids) {
		return dividendStartRecordService.deleteDividendStartRecordByIds(ids);
	}

	/**
	* 删除dividend信息
	*
	* @param id dividendID
	* @return 结果
	*/
	@Override
	public int deleteDividendStartRecordById(Long id) {
		return dividendStartRecordService.deleteDividendStartRecordById(id);
	}

}
