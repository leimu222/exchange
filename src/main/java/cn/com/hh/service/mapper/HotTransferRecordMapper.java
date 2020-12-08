package com.common.api.mapper;

import com.common.api.model.HotTransferRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [hot服务实现]
 */
public interface HotTransferRecordMapper{

	/**
	* 查询hot
	*
	* @param id hotID
	* @return hot
	*/
	public HotTransferRecord selectHotTransferRecordById(Long id);

	/**
	* 查询hot列表
	*
	* @param hotTransferRecord hot
	* @return hot集合
	*/
	public List<HotTransferRecord> selectHotTransferRecordList(HotTransferRecord hotTransferRecord);

	/**
	* 新增hot
	*
	* @param hotTransferRecord hot
	* @return 结果
	*/
	public int insertHotTransferRecord(HotTransferRecord hotTransferRecord);

	/**
	* 修改hot
	*
	* @param hotTransferRecord hot
	* @return 结果
	*/
	public int updateHotTransferRecord(HotTransferRecord hotTransferRecord);

	/**
	* 删除hot
	*
	* @param id hotID
	* @return 结果
	*/
	public int deleteHotTransferRecordById(Long id);

	/**
	* 批量删除hot
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteHotTransferRecordByIds(Long[] ids);

}
