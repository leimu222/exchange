package com.common.api.service;

import java.util.List;

import com.common.api.model.integrationRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [integrationBiz服务]
 */
public interface IIntegrationRecordBizService {

	/**
	* 查询integration
	*
	* @param id integrationID
	* @return integration
	*/
	public IntegrationRecord selectIntegrationRecordById(Long id);

	/**
	* 查询integration列表
	*
	* @param integrationRecord integration
	* @return integration集合
	*/
	public List<IntegrationRecord> selectIntegrationRecordList(IntegrationRecord integrationRecord);

	/**
	* 新增integration
	*
	* @param integrationRecord integration
	* @return 结果
	*/
	public int insertIntegrationRecord(IntegrationRecord integrationRecord);

	/**
	* 修改integration
	*
	* @param integrationRecord integration
	* @return 结果
	*/
	public int updateIntegrationRecord(IntegrationRecord integrationRecord);

	/**
	* 批量删除integration
	*
	* @param ids 需要删除的integrationID
	* @return 结果
	*/
	public int deleteIntegrationRecordByIds(Long[] ids);

	/**
	* 删除integration信息
	*
	* @param id integrationID
	* @return 结果
	*/
	public int deleteIntegrationRecordById(Long id);
	
}
