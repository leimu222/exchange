package com.common.api.mapper;

import com.common.api.model.TransferAddress;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [transfer服务实现]
 */
public interface TransferAddressMapper{

	/**
	* 查询transfer
	*
	* @param id transferID
	* @return transfer
	*/
	public TransferAddress selectTransferAddressById(Long id);

	/**
	* 查询transfer列表
	*
	* @param transferAddress transfer
	* @return transfer集合
	*/
	public List<TransferAddress> selectTransferAddressList(TransferAddress transferAddress);

	/**
	* 新增transfer
	*
	* @param transferAddress transfer
	* @return 结果
	*/
	public int insertTransferAddress(TransferAddress transferAddress);

	/**
	* 修改transfer
	*
	* @param transferAddress transfer
	* @return 结果
	*/
	public int updateTransferAddress(TransferAddress transferAddress);

	/**
	* 删除transfer
	*
	* @param id transferID
	* @return 结果
	*/
	public int deleteTransferAddressById(Long id);

	/**
	* 批量删除transfer
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteTransferAddressByIds(Long[] ids);

}
