package com.common.api.mapper;

import com.common.api.model.ContractNode;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractNodeMapper{

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
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractNodeById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractNodeByIds(Long[] ids);

}
