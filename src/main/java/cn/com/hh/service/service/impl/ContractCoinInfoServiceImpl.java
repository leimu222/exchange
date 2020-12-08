package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractCoinInfoMapper;
import com.common.api.model.ContractCoinInfo;
import com.common.api.service.IContractCoinInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:02
 * Description: [contract服务实现]
 */
@Service
public class ContractCoinInfoServiceImpl implements IContractCoinInfoService {
	@Autowired
	private ContractCoinInfoMapper contractCoinInfoMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractCoinInfo selectContractCoinInfoById(Integer id) {
		return contractCoinInfoMapper.selectContractCoinInfoById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractCoinInfo contract
	* @return contract
	*/
	@Override
	public List<ContractCoinInfo> selectContractCoinInfoList(ContractCoinInfo contractCoinInfo) {
		return contractCoinInfoMapper.selectContractCoinInfoList(contractCoinInfo);
	}

	/**
	* 新增contract
	*
	* @param contractCoinInfo contract
	* @return 结果
	*/
	@Override
	public int insertContractCoinInfo(ContractCoinInfo contractCoinInfo) {
		return contractCoinInfoMapper.insertContractCoinInfo(contractCoinInfo);
	}

	/**
	* 修改contract
	*
	* @param contractCoinInfo contract
	* @return 结果
	*/
	@Override
	public int updateContractCoinInfo(ContractCoinInfo contractCoinInfo) {
		return contractCoinInfoMapper.updateContractCoinInfo(contractCoinInfo);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractCoinInfoByIds(Integer[] ids) {
		return contractCoinInfoMapper.deleteContractCoinInfoByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractCoinInfoById(Integer id) {
		return contractCoinInfoMapper.deleteContractCoinInfoById(id);
	}

}
