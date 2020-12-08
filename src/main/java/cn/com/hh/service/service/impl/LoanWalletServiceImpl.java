package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.LoanWalletMapper;
import com.common.api.model.LoanWallet;
import com.common.api.service.ILoanWalletService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [loan服务实现]
 */
@Service
public class LoanWalletServiceImpl implements ILoanWalletService {
	@Autowired
	private LoanWalletMapper loanWalletMapper;

	/**
	* 查询loan
	*
	* @param id loanID
	* @return loan
	*/
	@Override
	public LoanWallet selectLoanWalletById(Long id) {
		return loanWalletMapper.selectLoanWalletById(id);
	}

	/**
	* 查询loan列表
	*
	* @param loanWallet loan
	* @return loan
	*/
	@Override
	public List<LoanWallet> selectLoanWalletList(LoanWallet loanWallet) {
		return loanWalletMapper.selectLoanWalletList(loanWallet);
	}

	/**
	* 新增loan
	*
	* @param loanWallet loan
	* @return 结果
	*/
	@Override
	public int insertLoanWallet(LoanWallet loanWallet) {
		return loanWalletMapper.insertLoanWallet(loanWallet);
	}

	/**
	* 修改loan
	*
	* @param loanWallet loan
	* @return 结果
	*/
	@Override
	public int updateLoanWallet(LoanWallet loanWallet) {
		return loanWalletMapper.updateLoanWallet(loanWallet);
	}

	/**
	* 批量删除loan
	*
	* @param ids 需要删除的loanID
	* @return 结果
	*/
	@Override
	public int deleteLoanWalletByIds(Long[] ids) {
		return loanWalletMapper.deleteLoanWalletByIds(ids);
	}

	/**
	* 删除loan信息
	*
	* @param id loanID
	* @return 结果
	*/
	@Override
	public int deleteLoanWalletById(Long id) {
		return loanWalletMapper.deleteLoanWalletById(id);
	}

}
