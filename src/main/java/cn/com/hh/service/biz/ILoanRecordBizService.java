package com.common.api.service;

import java.util.List;

import com.common.api.model.loanRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [loanBiz服务]
 */
public interface ILoanRecordBizService {

	/**
	* 查询loan
	*
	* @param id loanID
	* @return loan
	*/
	public LoanRecord selectLoanRecordById(Long id);

	/**
	* 查询loan列表
	*
	* @param loanRecord loan
	* @return loan集合
	*/
	public List<LoanRecord> selectLoanRecordList(LoanRecord loanRecord);

	/**
	* 新增loan
	*
	* @param loanRecord loan
	* @return 结果
	*/
	public int insertLoanRecord(LoanRecord loanRecord);

	/**
	* 修改loan
	*
	* @param loanRecord loan
	* @return 结果
	*/
	public int updateLoanRecord(LoanRecord loanRecord);

	/**
	* 批量删除loan
	*
	* @param ids 需要删除的loanID
	* @return 结果
	*/
	public int deleteLoanRecordByIds(Long[] ids);

	/**
	* 删除loan信息
	*
	* @param id loanID
	* @return 结果
	*/
	public int deleteLoanRecordById(Long id);
	
}
