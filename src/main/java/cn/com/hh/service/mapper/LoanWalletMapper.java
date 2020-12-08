package com.common.api.mapper;

import com.common.api.model.LoanWallet;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [loan服务实现]
 */
public interface LoanWalletMapper{

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
	* 删除loan
	*
	* @param id loanID
	* @return 结果
	*/
	public int deleteLoanWalletById(Long id);

	/**
	* 批量删除loan
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteLoanWalletByIds(Long[] ids);

}
