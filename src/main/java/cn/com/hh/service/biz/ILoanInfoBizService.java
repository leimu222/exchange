package com.common.api.service;

import java.util.List;

import com.common.api.model.loanInfo;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [loanBiz服务]
 */
public interface ILoanInfoBizService {

	/**
	* 查询loan
	*
	* @param id loanID
	* @return loan
	*/
	public LoanInfo selectLoanInfoById(Long id);

	/**
	* 查询loan列表
	*
	* @param loanInfo loan
	* @return loan集合
	*/
	public List<LoanInfo> selectLoanInfoList(LoanInfo loanInfo);

	/**
	* 新增loan
	*
	* @param loanInfo loan
	* @return 结果
	*/
	public int insertLoanInfo(LoanInfo loanInfo);

	/**
	* 修改loan
	*
	* @param loanInfo loan
	* @return 结果
	*/
	public int updateLoanInfo(LoanInfo loanInfo);

	/**
	* 批量删除loan
	*
	* @param ids 需要删除的loanID
	* @return 结果
	*/
	public int deleteLoanInfoByIds(Long[] ids);

	/**
	* 删除loan信息
	*
	* @param id loanID
	* @return 结果
	*/
	public int deleteLoanInfoById(Long id);
	
}
