package com.common.api.service;

import java.util.List;

import com.common.api.model.contractCoinNode;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:02
 * Description: [contractBiz服务]
 */
public interface IContractCoinNodeBizService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractCoinNode selectContractCoinNodeById(Integer id);

	/**
	* 查询contract列表
	*
	* @param contractCoinNode contract
	* @return contract集合
	*/
	public List<ContractCoinNode> selectContractCoinNodeList(ContractCoinNode contractCoinNode);

	/**
	* 新增contract
	*
	* @param contractCoinNode contract
	* @return 结果
	*/
	public int insertContractCoinNode(ContractCoinNode contractCoinNode);

	/**
	* 修改contract
	*
	* @param contractCoinNode contract
	* @return 结果
	*/
	public int updateContractCoinNode(ContractCoinNode contractCoinNode);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractCoinNodeByIds(Integer[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractCoinNodeById(Integer id);
	
}
