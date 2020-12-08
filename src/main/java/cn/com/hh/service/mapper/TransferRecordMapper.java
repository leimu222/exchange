package com.common.api.mapper;

import com.common.api.model.TransferRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [transfer服务实现]
 */
public interface TransferRecordMapper{

	/**
	* 查询transfer
	*
	* @param id transferID
	* @return transfer
	*/
	public TransferRecord selectTransferRecordById(Long id);

	/**
	* 查询transfer列表
	*
	* @param transferRecord transfer
	* @return transfer集合
	*/
	public List<TransferRecord> selectTransferRecordList(TransferRecord transferRecord);

	/**
	* 新增transfer
	*
	* @param transferRecord transfer
	* @return 结果
	*/
	public int insertTransferRecord(TransferRecord transferRecord);

	/**
	* 修改transfer
	*
	* @param transferRecord transfer
	* @return 结果
	*/
	public int updateTransferRecord(TransferRecord transferRecord);

	/**
	* 删除transfer
	*
	* @param id transferID
	* @return 结果
	*/
	public int deleteTransferRecordById(Long id);

	/**
	* 批量删除transfer
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteTransferRecordByIds(Long[] ids);

}
