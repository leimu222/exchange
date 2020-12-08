package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractWalletMapper;
import com.common.api.model.ContractWallet;
import com.common.api.service.IContractWalletService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [contract服务实现]
 */
@Service
public class ContractWalletServiceImpl implements IContractWalletService {
	@Autowired
	private ContractWalletMapper contractWalletMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractWallet selectContractWalletById(Long id) {
		return contractWalletMapper.selectContractWalletById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractWallet contract
	* @return contract
	*/
	@Override
	public List<ContractWallet> selectContractWalletList(ContractWallet contractWallet) {
		return contractWalletMapper.selectContractWalletList(contractWallet);
	}

	/**
	* 新增contract
	*
	* @param contractWallet contract
	* @return 结果
	*/
	@Override
	public int insertContractWallet(ContractWallet contractWallet) {
		return contractWalletMapper.insertContractWallet(contractWallet);
	}

	/**
	* 修改contract
	*
	* @param contractWallet contract
	* @return 结果
	*/
	@Override
	public int updateContractWallet(ContractWallet contractWallet) {
		return contractWalletMapper.updateContractWallet(contractWallet);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractWalletByIds(Long[] ids) {
		return contractWalletMapper.deleteContractWalletByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractWalletById(Long id) {
		return contractWalletMapper.deleteContractWalletById(id);
	}

}
