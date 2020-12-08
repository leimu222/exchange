package com.common.api.service;

import java.util.List;

import com.common.api.model.contractNode;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contractBiz服务]
 */
public interface IContractNodeBizService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractNode selectContractNodeById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractNode contract
	* @return contract集合
	*/
	public List<ContractNode> selectContractNodeList(ContractNode contractNode);

	/**
	* 新增contract
	*
	* @param contractNode contract
	* @return 结果
	*/
	public int insertContractNode(ContractNode contractNode);

	/**
	* 修改contract
	*
	* @param contractNode contract
	* @return 结果
	*/
	public int updateContractNode(ContractNode contractNode);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractNodeByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractNodeById(Long id);
	
}
