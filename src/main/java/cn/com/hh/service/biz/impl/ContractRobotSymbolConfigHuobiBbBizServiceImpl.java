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
 * Description: [contractBiz服务实现]
 */
@Service
public class ContractRobotSymbolConfigHuobiBbBizServiceImpl extends CommonService implements IContractRobotSymbolConfigHuobiBbBizService {
	@Autowired
	private IContractRobotSymbolConfigHuobiBbService contractRobotSymbolConfigHuobiBbService;

	/**
	* 查询contract
	*
	* @param symbol contractID
	* @return contract
	*/
	@Override
	public ContractRobotSymbolConfigHuobiBb selectContractRobotSymbolConfigHuobiBbById(String symbol) {
		return contractRobotSymbolConfigHuobiBbService.selectContractRobotSymbolConfigHuobiBbById(symbol);
	}

	/**
	* 查询contract列表
	*
	* @param contractRobotSymbolConfigHuobiBb contract
	* @return contract
	*/
	@Override
	public List<ContractRobotSymbolConfigHuobiBb> selectContractRobotSymbolConfigHuobiBbList(ContractRobotSymbolConfigHuobiBb contractRobotSymbolConfigHuobiBb) {
		return contractRobotSymbolConfigHuobiBbService.selectContractRobotSymbolConfigHuobiBbList(contractRobotSymbolConfigHuobiBb);
	}

	/**
	* 新增contract
	*
	* @param contractRobotSymbolConfigHuobiBb contract
	* @return 结果
	*/
	@Override
	public int insertContractRobotSymbolConfigHuobiBb(ContractRobotSymbolConfigHuobiBb contractRobotSymbolConfigHuobiBb) {
		return contractRobotSymbolConfigHuobiBbService.insertContractRobotSymbolConfigHuobiBb(contractRobotSymbolConfigHuobiBb);
	}

	/**
	* 修改contract
	*
	* @param contractRobotSymbolConfigHuobiBb contract
	* @return 结果
	*/
	@Override
	public int updateContractRobotSymbolConfigHuobiBb(ContractRobotSymbolConfigHuobiBb contractRobotSymbolConfigHuobiBb) {
		return contractRobotSymbolConfigHuobiBbService.updateContractRobotSymbolConfigHuobiBb(contractRobotSymbolConfigHuobiBb);
	}

	/**
	* 批量删除contract
	*
	* @param symbols 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractRobotSymbolConfigHuobiBbByIds(String[] symbols) {
		return contractRobotSymbolConfigHuobiBbService.deleteContractRobotSymbolConfigHuobiBbByIds(symbols);
	}

	/**
	* 删除contract信息
	*
	* @param symbol contractID
	* @return 结果
	*/
	@Override
	public int deleteContractRobotSymbolConfigHuobiBbById(String symbol) {
		return contractRobotSymbolConfigHuobiBbService.deleteContractRobotSymbolConfigHuobiBbById(symbol);
	}

}
