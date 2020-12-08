package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.CopywdRecordMapper;
import com.common.api.model.CopywdRecord;
import com.common.api.service.ICopywdRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [copywd服务实现]
 */
@Service
public class CopywdRecordServiceImpl implements ICopywdRecordService {
	@Autowired
	private CopywdRecordMapper copywdRecordMapper;

	/**
	* 查询copywd
	*
	* @param id copywdID
	* @return copywd
	*/
	@Override
	public CopywdRecord selectCopywdRecordById(Long id) {
		return copywdRecordMapper.selectCopywdRecordById(id);
	}

	/**
	* 查询copywd列表
	*
	* @param copywdRecord copywd
	* @return copywd
	*/
	@Override
	public List<CopywdRecord> selectCopywdRecordList(CopywdRecord copywdRecord) {
		return copywdRecordMapper.selectCopywdRecordList(copywdRecord);
	}

	/**
	* 新增copywd
	*
	* @param copywdRecord copywd
	* @return 结果
	*/
	@Override
	public int insertCopywdRecord(CopywdRecord copywdRecord) {
		return copywdRecordMapper.insertCopywdRecord(copywdRecord);
	}

	/**
	* 修改copywd
	*
	* @param copywdRecord copywd
	* @return 结果
	*/
	@Override
	public int updateCopywdRecord(CopywdRecord copywdRecord) {
		return copywdRecordMapper.updateCopywdRecord(copywdRecord);
	}

	/**
	* 批量删除copywd
	*
	* @param ids 需要删除的copywdID
	* @return 结果
	*/
	@Override
	public int deleteCopywdRecordByIds(Long[] ids) {
		return copywdRecordMapper.deleteCopywdRecordByIds(ids);
	}

	/**
	* 删除copywd信息
	*
	* @param id copywdID
	* @return 结果
	*/
	@Override
	public int deleteCopywdRecordById(Long id) {
		return copywdRecordMapper.deleteCopywdRecordById(id);
	}

}
