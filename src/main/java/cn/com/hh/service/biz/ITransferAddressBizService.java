package com.common.api.service;

import java.util.List;

import com.common.api.model.transferAddress;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [transferBiz服务]
 */
public interface ITransferAddressBizService {

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
	* 批量删除transfer
	*
	* @param ids 需要删除的transferID
	* @return 结果
	*/
	public int deleteTransferAddressByIds(Long[] ids);

	/**
	* 删除transfer信息
	*
	* @param id transferID
	* @return 结果
	*/
	public int deleteTransferAddressById(Long id);
	
}
