package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractRobotSymbolConfigHuobiBbMapper;
import com.common.api.model.ContractRobotSymbolConfigHuobiBb;
import com.common.api.service.IContractRobotSymbolConfigHuobiBbService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractRobotSymbolConfigHuobiBbServiceImpl implements IContractRobotSymbolConfigHuobiBbService {
	@Autowired
	private ContractRobotSymbolConfigHuobiBbMapper contractRobotSymbolConfigHuobiBbMapper;

	/**
	* 查询contract
	*
	* @param symbol contractID
	* @return contract
	*/
	@Override
	public ContractRobotSymbolConfigHuobiBb selectContractRobotSymbolConfigHuobiBbById(String symbol) {
		return contractRobotSymbolConfigHuobiBbMapper.selectContractRobotSymbolConfigHuobiBbById(symbol);
	}

	/**
	* 查询contract列表
	*
	* @param contractRobotSymbolConfigHuobiBb contract
	* @return contract
	*/
	@Override
	public List<ContractRobotSymbolConfigHuobiBb> selectContractRobotSymbolConfigHuobiBbList(ContractRobotSymbolConfigHuobiBb contractRobotSymbolConfigHuobiBb) {
		return contractRobotSymbolConfigHuobiBbMapper.selectContractRobotSymbolConfigHuobiBbList(contractRobotSymbolConfigHuobiBb);
	}

	/**
	* 新增contract
	*
	* @param contractRobotSymbolConfigHuobiBb contract
	* @return 结果
	*/
	@Override
	public int insertContractRobotSymbolConfigHuobiBb(ContractRobotSymbolConfigHuobiBb contractRobotSymbolConfigHuobiBb) {
		return contractRobotSymbolConfigHuobiBbMapper.insertContractRobotSymbolConfigHuobiBb(contractRobotSymbolConfigHuobiBb);
	}

	/**
	* 修改contract
	*
	* @param contractRobotSymbolConfigHuobiBb contract
	* @return 结果
	*/
	@Override
	public int updateContractRobotSymbolConfigHuobiBb(ContractRobotSymbolConfigHuobiBb contractRobotSymbolConfigHuobiBb) {
		return contractRobotSymbolConfigHuobiBbMapper.updateContractRobotSymbolConfigHuobiBb(contractRobotSymbolConfigHuobiBb);
	}

	/**
	* 批量删除contract
	*
	* @param symbols 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractRobotSymbolConfigHuobiBbByIds(String[] symbols) {
		return contractRobotSymbolConfigHuobiBbMapper.deleteContractRobotSymbolConfigHuobiBbByIds(symbols);
	}

	/**
	* 删除contract信息
	*
	* @param symbol contractID
	* @return 结果
	*/
	@Override
	public int deleteContractRobotSymbolConfigHuobiBbById(String symbol) {
		return contractRobotSymbolConfigHuobiBbMapper.deleteContractRobotSymbolConfigHuobiBbById(symbol);
	}

}
