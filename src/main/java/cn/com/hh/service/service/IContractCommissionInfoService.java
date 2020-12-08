package com.common.api.service;

import java.util.List;

import com.common.api.model.contractCommissionInfo;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:02
 * Description: [contract服务]
 */
public interface IContractCommissionInfoService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractCommissionInfo selectContractCommissionInfoById(Integer id);

	/**
	* 查询contract列表
	*
	* @param contractCommissionInfo contract
	* @return contract集合
	*/
	public List<ContractCommissionInfo> selectContractCommissionInfoList(ContractCommissionInfo contractCommissionInfo);

	/**
	* 新增contract
	*
	* @param contractCommissionInfo contract
	* @return 结果
	*/
	public int insertContractCommissionInfo(ContractCommissionInfo contractCommissionInfo);

	/**
	* 修改contract
	*
	* @param contractCommissionInfo contract
	* @return 结果
	*/
	public int updateContractCommissionInfo(ContractCommissionInfo contractCommissionInfo);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractCommissionInfoByIds(Integer[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractCommissionInfoById(Integer id);
	
}
