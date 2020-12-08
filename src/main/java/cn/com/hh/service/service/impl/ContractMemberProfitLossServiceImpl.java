package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractMemberProfitLossMapper;
import com.common.api.model.ContractMemberProfitLoss;
import com.common.api.service.IContractMemberProfitLossService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractMemberProfitLossServiceImpl implements IContractMemberProfitLossService {
	@Autowired
	private ContractMemberProfitLossMapper contractMemberProfitLossMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractMemberProfitLoss selectContractMemberProfitLossById(Long id) {
		return contractMemberProfitLossMapper.selectContractMemberProfitLossById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractMemberProfitLoss contract
	* @return contract
	*/
	@Override
	public List<ContractMemberProfitLoss> selectContractMemberProfitLossList(ContractMemberProfitLoss contractMemberProfitLoss) {
		return contractMemberProfitLossMapper.selectContractMemberProfitLossList(contractMemberProfitLoss);
	}

	/**
	* 新增contract
	*
	* @param contractMemberProfitLoss contract
	* @return 结果
	*/
	@Override
	public int insertContractMemberProfitLoss(ContractMemberProfitLoss contractMemberProfitLoss) {
		return contractMemberProfitLossMapper.insertContractMemberProfitLoss(contractMemberProfitLoss);
	}

	/**
	* 修改contract
	*
	* @param contractMemberProfitLoss contract
	* @return 结果
	*/
	@Override
	public int updateContractMemberProfitLoss(ContractMemberProfitLoss contractMemberProfitLoss) {
		return contractMemberProfitLossMapper.updateContractMemberProfitLoss(contractMemberProfitLoss);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractMemberProfitLossByIds(Long[] ids) {
		return contractMemberProfitLossMapper.deleteContractMemberProfitLossByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractMemberProfitLossById(Long id) {
		return contractMemberProfitLossMapper.deleteContractMemberProfitLossById(id);
	}

}
