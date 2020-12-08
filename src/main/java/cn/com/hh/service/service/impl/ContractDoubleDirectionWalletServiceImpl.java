package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractDoubleDirectionWalletMapper;
import com.common.api.model.ContractDoubleDirectionWallet;
import com.common.api.service.IContractDoubleDirectionWalletService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractDoubleDirectionWalletServiceImpl implements IContractDoubleDirectionWalletService {
	@Autowired
	private ContractDoubleDirectionWalletMapper contractDoubleDirectionWalletMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractDoubleDirectionWallet selectContractDoubleDirectionWalletById(Integer id) {
		return contractDoubleDirectionWalletMapper.selectContractDoubleDirectionWalletById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractDoubleDirectionWallet contract
	* @return contract
	*/
	@Override
	public List<ContractDoubleDirectionWallet> selectContractDoubleDirectionWalletList(ContractDoubleDirectionWallet contractDoubleDirectionWallet) {
		return contractDoubleDirectionWalletMapper.selectContractDoubleDirectionWalletList(contractDoubleDirectionWallet);
	}

	/**
	* 新增contract
	*
	* @param contractDoubleDirectionWallet contract
	* @return 结果
	*/
	@Override
	public int insertContractDoubleDirectionWallet(ContractDoubleDirectionWallet contractDoubleDirectionWallet) {
		return contractDoubleDirectionWalletMapper.insertContractDoubleDirectionWallet(contractDoubleDirectionWallet);
	}

	/**
	* 修改contract
	*
	* @param contractDoubleDirectionWallet contract
	* @return 结果
	*/
	@Override
	public int updateContractDoubleDirectionWallet(ContractDoubleDirectionWallet contractDoubleDirectionWallet) {
		return contractDoubleDirectionWalletMapper.updateContractDoubleDirectionWallet(contractDoubleDirectionWallet);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractDoubleDirectionWalletByIds(Integer[] ids) {
		return contractDoubleDirectionWalletMapper.deleteContractDoubleDirectionWalletByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractDoubleDirectionWalletById(Integer id) {
		return contractDoubleDirectionWalletMapper.deleteContractDoubleDirectionWalletById(id);
	}

}
