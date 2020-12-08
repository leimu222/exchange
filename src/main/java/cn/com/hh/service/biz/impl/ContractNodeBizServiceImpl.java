package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractNodeMapper;
import com.common.api.model.ContractNode;
import com.common.api.service.IContractNodeService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contractBiz服务实现]
 */
@Service
public class ContractNodeBizServiceImpl extends CommonService implements IContractNodeBizService {
	@Autowired
	private IContractNodeService contractNodeService;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractNode selectContractNodeById(Long id) {
		return contractNodeService.selectContractNodeById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractNode contract
	* @return contract
	*/
	@Override
	public List<ContractNode> selectContractNodeList(ContractNode contractNode) {
		return contractNodeService.selectContractNodeList(contractNode);
	}

	/**
	* 新增contract
	*
	* @param contractNode contract
	* @return 结果
	*/
	@Override
	public int insertContractNode(ContractNode contractNode) {
		return contractNodeService.insertContractNode(contractNode);
	}

	/**
	* 修改contract
	*
	* @param contractNode contract
	* @return 结果
	*/
	@Override
	public int updateContractNode(ContractNode contractNode) {
		return contractNodeService.updateContractNode(contractNode);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractNodeByIds(Long[] ids) {
		return contractNodeService.deleteContractNodeByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractNodeById(Long id) {
		return contractNodeService.deleteContractNodeById(id);
	}

}
