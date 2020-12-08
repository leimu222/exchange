package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractDoubleDirectionOrderProfitInfoMapper;
import com.common.api.model.ContractDoubleDirectionOrderProfitInfo;
import com.common.api.service.IContractDoubleDirectionOrderProfitInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractDoubleDirectionOrderProfitInfoServiceImpl implements IContractDoubleDirectionOrderProfitInfoService {
	@Autowired
	private ContractDoubleDirectionOrderProfitInfoMapper contractDoubleDirectionOrderProfitInfoMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractDoubleDirectionOrderProfitInfo selectContractDoubleDirectionOrderProfitInfoById(Long id) {
		return contractDoubleDirectionOrderProfitInfoMapper.selectContractDoubleDirectionOrderProfitInfoById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractDoubleDirectionOrderProfitInfo contract
	* @return contract
	*/
	@Override
	public List<ContractDoubleDirectionOrderProfitInfo> selectContractDoubleDirectionOrderProfitInfoList(ContractDoubleDirectionOrderProfitInfo contractDoubleDirectionOrderProfitInfo) {
		return contractDoubleDirectionOrderProfitInfoMapper.selectContractDoubleDirectionOrderProfitInfoList(contractDoubleDirectionOrderProfitInfo);
	}

	/**
	* 新增contract
	*
	* @param contractDoubleDirectionOrderProfitInfo contract
	* @return 结果
	*/
	@Override
	public int insertContractDoubleDirectionOrderProfitInfo(ContractDoubleDirectionOrderProfitInfo contractDoubleDirectionOrderProfitInfo) {
		return contractDoubleDirectionOrderProfitInfoMapper.insertContractDoubleDirectionOrderProfitInfo(contractDoubleDirectionOrderProfitInfo);
	}

	/**
	* 修改contract
	*
	* @param contractDoubleDirectionOrderProfitInfo contract
	* @return 结果
	*/
	@Override
	public int updateContractDoubleDirectionOrderProfitInfo(ContractDoubleDirectionOrderProfitInfo contractDoubleDirectionOrderProfitInfo) {
		return contractDoubleDirectionOrderProfitInfoMapper.updateContractDoubleDirectionOrderProfitInfo(contractDoubleDirectionOrderProfitInfo);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractDoubleDirectionOrderProfitInfoByIds(Long[] ids) {
		return contractDoubleDirectionOrderProfitInfoMapper.deleteContractDoubleDirectionOrderProfitInfoByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractDoubleDirectionOrderProfitInfoById(Long id) {
		return contractDoubleDirectionOrderProfitInfoMapper.deleteContractDoubleDirectionOrderProfitInfoById(id);
	}

}
