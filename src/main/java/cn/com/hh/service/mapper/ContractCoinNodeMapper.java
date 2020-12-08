package com.common.api.mapper;

import com.common.api.model.ContractCoinNode;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [contract服务实现]
 */
public interface ContractCoinNodeMapper{

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
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractCoinNodeById(Integer id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractCoinNodeByIds(Integer[] ids);

}
