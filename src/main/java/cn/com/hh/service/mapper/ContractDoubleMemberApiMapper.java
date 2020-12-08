package com.common.api.mapper;

import com.common.api.model.ContractDoubleMemberApi;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractDoubleMemberApiMapper{

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
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractDoubleMemberApiById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractDoubleMemberApiByIds(Long[] ids);

}
