package com.common.api.mapper;

import com.common.api.model.EmptionRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [emption服务实现]
 */
public interface EmptionRecordMapper{

	/**
	* 查询emption
	*
	* @param id emptionID
	* @return emption
	*/
	public EmptionRecord selectEmptionRecordById(Long id);

	/**
	* 查询emption列表
	*
	* @param emptionRecord emption
	* @return emption集合
	*/
	public List<EmptionRecord> selectEmptionRecordList(EmptionRecord emptionRecord);

	/**
	* 新增emption
	*
	* @param emptionRecord emption
	* @return 结果
	*/
	public int insertEmptionRecord(EmptionRecord emptionRecord);

	/**
	* 修改emption
	*
	* @param emptionRecord emption
	* @return 结果
	*/
	public int updateEmptionRecord(EmptionRecord emptionRecord);

	/**
	* 删除emption
	*
	* @param id emptionID
	* @return 结果
	*/
	public int deleteEmptionRecordById(Long id);

	/**
	* 批量删除emption
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteEmptionRecordByIds(Long[] ids);

}
