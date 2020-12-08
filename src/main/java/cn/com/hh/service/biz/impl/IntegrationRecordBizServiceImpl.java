package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.IntegrationRecordMapper;
import com.common.api.model.IntegrationRecord;
import com.common.api.service.IIntegrationRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [integrationBiz服务实现]
 */
@Service
public class IntegrationRecordBizServiceImpl extends CommonService implements IIntegrationRecordBizService {
	@Autowired
	private IIntegrationRecordService integrationRecordService;

	/**
	* 查询integration
	*
	* @param id integrationID
	* @return integration
	*/
	@Override
	public IntegrationRecord selectIntegrationRecordById(Long id) {
		return integrationRecordService.selectIntegrationRecordById(id);
	}

	/**
	* 查询integration列表
	*
	* @param integrationRecord integration
	* @return integration
	*/
	@Override
	public List<IntegrationRecord> selectIntegrationRecordList(IntegrationRecord integrationRecord) {
		return integrationRecordService.selectIntegrationRecordList(integrationRecord);
	}

	/**
	* 新增integration
	*
	* @param integrationRecord integration
	* @return 结果
	*/
	@Override
	public int insertIntegrationRecord(IntegrationRecord integrationRecord) {
		return integrationRecordService.insertIntegrationRecord(integrationRecord);
	}

	/**
	* 修改integration
	*
	* @param integrationRecord integration
	* @return 结果
	*/
	@Override
	public int updateIntegrationRecord(IntegrationRecord integrationRecord) {
		return integrationRecordService.updateIntegrationRecord(integrationRecord);
	}

	/**
	* 批量删除integration
	*
	* @param ids 需要删除的integrationID
	* @return 结果
	*/
	@Override
	public int deleteIntegrationRecordByIds(Long[] ids) {
		return integrationRecordService.deleteIntegrationRecordByIds(ids);
	}

	/**
	* 删除integration信息
	*
	* @param id integrationID
	* @return 结果
	*/
	@Override
	public int deleteIntegrationRecordById(Long id) {
		return integrationRecordService.deleteIntegrationRecordById(id);
	}

}
