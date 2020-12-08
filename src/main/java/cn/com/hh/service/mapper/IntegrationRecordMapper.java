package com.common.api.mapper;

import com.common.api.model.IntegrationRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [integration服务实现]
 */
public interface IntegrationRecordMapper{

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
	* 删除integration
	*
	* @param id integrationID
	* @return 结果
	*/
	public int deleteIntegrationRecordById(Long id);

	/**
	* 批量删除integration
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteIntegrationRecordByIds(Long[] ids);

}
