package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractRobotSymbolConfigHuobiMapper;
import com.common.api.model.ContractRobotSymbolConfigHuobi;
import com.common.api.service.IContractRobotSymbolConfigHuobiService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractRobotSymbolConfigHuobiServiceImpl implements IContractRobotSymbolConfigHuobiService {
	@Autowired
	private ContractRobotSymbolConfigHuobiMapper contractRobotSymbolConfigHuobiMapper;

	/**
	* 查询contract
	*
	* @param symbol contractID
	* @return contract
	*/
	@Override
	public ContractRobotSymbolConfigHuobi selectContractRobotSymbolConfigHuobiById(String symbol) {
		return contractRobotSymbolConfigHuobiMapper.selectContractRobotSymbolConfigHuobiById(symbol);
	}

	/**
	* 查询contract列表
	*
	* @param contractRobotSymbolConfigHuobi contract
	* @return contract
	*/
	@Override
	public List<ContractRobotSymbolConfigHuobi> selectContractRobotSymbolConfigHuobiList(ContractRobotSymbolConfigHuobi contractRobotSymbolConfigHuobi) {
		return contractRobotSymbolConfigHuobiMapper.selectContractRobotSymbolConfigHuobiList(contractRobotSymbolConfigHuobi);
	}

	/**
	* 新增contract
	*
	* @param contractRobotSymbolConfigHuobi contract
	* @return 结果
	*/
	@Override
	public int insertContractRobotSymbolConfigHuobi(ContractRobotSymbolConfigHuobi contractRobotSymbolConfigHuobi) {
		return contractRobotSymbolConfigHuobiMapper.insertContractRobotSymbolConfigHuobi(contractRobotSymbolConfigHuobi);
	}

	/**
	* 修改contract
	*
	* @param contractRobotSymbolConfigHuobi contract
	* @return 结果
	*/
	@Override
	public int updateContractRobotSymbolConfigHuobi(ContractRobotSymbolConfigHuobi contractRobotSymbolConfigHuobi) {
		return contractRobotSymbolConfigHuobiMapper.updateContractRobotSymbolConfigHuobi(contractRobotSymbolConfigHuobi);
	}

	/**
	* 批量删除contract
	*
	* @param symbols 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractRobotSymbolConfigHuobiByIds(String[] symbols) {
		return contractRobotSymbolConfigHuobiMapper.deleteContractRobotSymbolConfigHuobiByIds(symbols);
	}

	/**
	* 删除contract信息
	*
	* @param symbol contractID
	* @return 结果
	*/
	@Override
	public int deleteContractRobotSymbolConfigHuobiById(String symbol) {
		return contractRobotSymbolConfigHuobiMapper.deleteContractRobotSymbolConfigHuobiById(symbol);
	}

}
