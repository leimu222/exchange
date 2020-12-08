package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractExchangeOrderCloseMapper;
import com.common.api.model.ContractExchangeOrderClose;
import com.common.api.service.IContractExchangeOrderCloseService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contractBiz服务实现]
 */
@Service
public class ContractExchangeOrderCloseBizServiceImpl extends CommonService implements IContractExchangeOrderCloseBizService {
	@Autowired
	private IContractExchangeOrderCloseService contractExchangeOrderCloseService;

	/**
	* 查询contract
	*
	* @param orderId contractID
	* @return contract
	*/
	@Override
	public ContractExchangeOrderClose selectContractExchangeOrderCloseById(Long orderId) {
		return contractExchangeOrderCloseService.selectContractExchangeOrderCloseById(orderId);
	}

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderClose contract
	* @return contract
	*/
	@Override
	public List<ContractExchangeOrderClose> selectContractExchangeOrderCloseList(ContractExchangeOrderClose contractExchangeOrderClose) {
		return contractExchangeOrderCloseService.selectContractExchangeOrderCloseList(contractExchangeOrderClose);
	}

	/**
	* 新增contract
	*
	* @param contractExchangeOrderClose contract
	* @return 结果
	*/
	@Override
	public int insertContractExchangeOrderClose(ContractExchangeOrderClose contractExchangeOrderClose) {
		return contractExchangeOrderCloseService.insertContractExchangeOrderClose(contractExchangeOrderClose);
	}

	/**
	* 修改contract
	*
	* @param contractExchangeOrderClose contract
	* @return 结果
	*/
	@Override
	public int updateContractExchangeOrderClose(ContractExchangeOrderClose contractExchangeOrderClose) {
		return contractExchangeOrderCloseService.updateContractExchangeOrderClose(contractExchangeOrderClose);
	}

	/**
	* 批量删除contract
	*
	* @param orderIds 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderCloseByIds(Long[] orderIds) {
		return contractExchangeOrderCloseService.deleteContractExchangeOrderCloseByIds(orderIds);
	}

	/**
	* 删除contract信息
	*
	* @param orderId contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderCloseById(Long orderId) {
		return contractExchangeOrderCloseService.deleteContractExchangeOrderCloseById(orderId);
	}

}
