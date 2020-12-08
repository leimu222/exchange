package com.common.api.service;

import java.util.List;

import com.common.api.model.contractDoubleMemberApi;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contractBiz服务]
 */
public interface IContractDoubleMemberApiBizService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractDoubleMemberApi selectContractDoubleMemberApiById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractDoubleMemberApi contract
	* @return contract集合
	*/
	public List<ContractDoubleMemberApi> selectContractDoubleMemberApiList(ContractDoubleMemberApi contractDoubleMemberApi);

	/**
	* 新增contract
	*
	* @param contractDoubleMemberApi contract
	* @return 结果
	*/
	public int insertContractDoubleMemberApi(ContractDoubleMemberApi contractDoubleMemberApi);

	/**
	* 修改contract
	*
	* @param contractDoubleMemberApi contract
	* @return 结果
	*/
	public int updateContractDoubleMemberApi(ContractDoubleMemberApi contractDoubleMemberApi);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractDoubleMemberApiByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractDoubleMemberApiById(Long id);
	
}
