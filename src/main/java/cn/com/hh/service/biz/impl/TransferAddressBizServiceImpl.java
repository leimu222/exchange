package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.TransferAddressMapper;
import com.common.api.model.TransferAddress;
import com.common.api.service.ITransferAddressService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [transferBiz服务实现]
 */
@Service
public class TransferAddressBizServiceImpl extends CommonService implements ITransferAddressBizService {
	@Autowired
	private ITransferAddressService transferAddressService;

	/**
	* 查询transfer
	*
	* @param id transferID
	* @return transfer
	*/
	@Override
	public TransferAddress selectTransferAddressById(Long id) {
		return transferAddressService.selectTransferAddressById(id);
	}

	/**
	* 查询transfer列表
	*
	* @param transferAddress transfer
	* @return transfer
	*/
	@Override
	public List<TransferAddress> selectTransferAddressList(TransferAddress transferAddress) {
		return transferAddressService.selectTransferAddressList(transferAddress);
	}

	/**
	* 新增transfer
	*
	* @param transferAddress transfer
	* @return 结果
	*/
	@Override
	public int insertTransferAddress(TransferAddress transferAddress) {
		return transferAddressService.insertTransferAddress(transferAddress);
	}

	/**
	* 修改transfer
	*
	* @param transferAddress transfer
	* @return 结果
	*/
	@Override
	public int updateTransferAddress(TransferAddress transferAddress) {
		return transferAddressService.updateTransferAddress(transferAddress);
	}

	/**
	* 批量删除transfer
	*
	* @param ids 需要删除的transferID
	* @return 结果
	*/
	@Override
	public int deleteTransferAddressByIds(Long[] ids) {
		return transferAddressService.deleteTransferAddressByIds(ids);
	}

	/**
	* 删除transfer信息
	*
	* @param id transferID
	* @return 结果
	*/
	@Override
	public int deleteTransferAddressById(Long id) {
		return transferAddressService.deleteTransferAddressById(id);
	}

}
