package com.common.api.service;

import java.util.List;

import com.common.api.model.loanWallet;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [loan服务]
 */
public interface ILoanWalletService {

	/**
	* 查询loan
	*
	* @param id loanID
	* @return loan
	*/
	public LoanWallet selectLoanWalletById(Long id);

	/**
	* 查询loan列表
	*
	* @param loanWallet loan
	* @return loan集合
	*/
	public List<LoanWallet> selectLoanWalletList(LoanWallet loanWallet);

	/**
	* 新增loan
	*
	* @param loanWallet loan
	* @return 结果
	*/
	public int insertLoanWallet(LoanWallet loanWallet);

	/**
	* 修改loan
	*
	* @param loanWallet loan
	* @return 结果
	*/
	public int updateLoanWallet(LoanWallet loanWallet);

	/**
	* 批量删除loan
	*
	* @param ids 需要删除的loanID
	* @return 结果
	*/
	public int deleteLoanWalletByIds(Long[] ids);

	/**
	* 删除loan信息
	*
	* @param id loanID
	* @return 结果
	*/
	public int deleteLoanWalletById(Long id);
	
}
