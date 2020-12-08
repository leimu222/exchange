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
 * Description: [contractBiz服务实现]
 */
@Service
public class ContractDoubleDirectionOrderProfitInfoBizServiceImpl extends CommonService implements IContractDoubleDirectionOrderProfitInfoBizService {
	@Autowired
	private IContractDoubleDirectionOrderProfitInfoService contractDoubleDirectionOrderProfitInfoService;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractDoubleDirectionOrderProfitInfo selectContractDoubleDirectionOrderProfitInfoById(Long id) {
		return contractDoubleDirectionOrderProfitInfoService.selectContractDoubleDirectionOrderProfitInfoById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractDoubleDirectionOrderProfitInfo contract
	* @return contract
	*/
	@Override
	public List<ContractDoubleDirectionOrderProfitInfo> selectContractDoubleDirectionOrderProfitInfoList(ContractDoubleDirectionOrderProfitInfo contractDoubleDirectionOrderProfitInfo) {
		return contractDoubleDirectionOrderProfitInfoService.selectContractDoubleDirectionOrderProfitInfoList(contractDoubleDirectionOrderProfitInfo);
	}

	/**
	* 新增contract
	*
	* @param contractDoubleDirectionOrderProfitInfo contract
	* @return 结果
	*/
	@Override
	public int insertContractDoubleDirectionOrderProfitInfo(ContractDoubleDirectionOrderProfitInfo contractDoubleDirectionOrderProfitInfo) {
		return contractDoubleDirectionOrderProfitInfoService.insertContractDoubleDirectionOrderProfitInfo(contractDoubleDirectionOrderProfitInfo);
	}

	/**
	* 修改contract
	*
	* @param contractDoubleDirectionOrderProfitInfo contract
	* @return 结果
	*/
	@Override
	public int updateContractDoubleDirectionOrderProfitInfo(ContractDoubleDirectionOrderProfitInfo contractDoubleDirectionOrderProfitInfo) {
		return contractDoubleDirectionOrderProfitInfoService.updateContractDoubleDirectionOrderProfitInfo(contractDoubleDirectionOrderProfitInfo);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractDoubleDirectionOrderProfitInfoByIds(Long[] ids) {
		return contractDoubleDirectionOrderProfitInfoService.deleteContractDoubleDirectionOrderProfitInfoByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractDoubleDirectionOrderProfitInfoById(Long id) {
		return contractDoubleDirectionOrderProfitInfoService.deleteContractDoubleDirectionOrderProfitInfoById(id);
	}

}
