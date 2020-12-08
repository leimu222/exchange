package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractCoinNodeMapper;
import com.common.api.model.ContractCoinNode;
import com.common.api.service.IContractCoinNodeService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:02
 * Description: [contractBiz服务实现]
 */
@Service
public class ContractCoinNodeBizServiceImpl extends CommonService implements IContractCoinNodeBizService {
	@Autowired
	private IContractCoinNodeService contractCoinNodeService;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractCoinNode selectContractCoinNodeById(Integer id) {
		return contractCoinNodeService.selectContractCoinNodeById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractCoinNode contract
	* @return contract
	*/
	@Override
	public List<ContractCoinNode> selectContractCoinNodeList(ContractCoinNode contractCoinNode) {
		return contractCoinNodeService.selectContractCoinNodeList(contractCoinNode);
	}

	/**
	* 新增contract
	*
	* @param contractCoinNode contract
	* @return 结果
	*/
	@Override
	public int insertContractCoinNode(ContractCoinNode contractCoinNode) {
		return contractCoinNodeService.insertContractCoinNode(contractCoinNode);
	}

	/**
	* 修改contract
	*
	* @param contractCoinNode contract
	* @return 结果
	*/
	@Override
	public int updateContractCoinNode(ContractCoinNode contractCoinNode) {
		return contractCoinNodeService.updateContractCoinNode(contractCoinNode);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractCoinNodeByIds(Integer[] ids) {
		return contractCoinNodeService.deleteContractCoinNodeByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractCoinNodeById(Integer id) {
		return contractCoinNodeService.deleteContractCoinNodeById(id);
	}

}
