package com.common.api.service;

import java.util.List;

import com.common.api.model.contractDoubleDirectionOrderProfitInfo;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contract服务]
 */
public interface IContractDoubleDirectionOrderProfitInfoService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractDoubleDirectionOrderProfitInfo selectContractDoubleDirectionOrderProfitInfoById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractDoubleDirectionOrderProfitInfo contract
	* @return contract集合
	*/
	public List<ContractDoubleDirectionOrderProfitInfo> selectContractDoubleDirectionOrderProfitInfoList(ContractDoubleDirectionOrderProfitInfo contractDoubleDirectionOrderProfitInfo);

	/**
	* 新增contract
	*
	* @param contractDoubleDirectionOrderProfitInfo contract
	* @return 结果
	*/
	public int insertContractDoubleDirectionOrderProfitInfo(ContractDoubleDirectionOrderProfitInfo contractDoubleDirectionOrderProfitInfo);

	/**
	* 修改contract
	*
	* @param contractDoubleDirectionOrderProfitInfo contract
	* @return 结果
	*/
	public int updateContractDoubleDirectionOrderProfitInfo(ContractDoubleDirectionOrderProfitInfo contractDoubleDirectionOrderProfitInfo);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractDoubleDirectionOrderProfitInfoByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractDoubleDirectionOrderProfitInfoById(Long id);
	
}
