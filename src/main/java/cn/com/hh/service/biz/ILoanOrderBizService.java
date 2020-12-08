package com.common.api.service;

import java.util.List;

import com.common.api.model.loanOrder;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [loanBiz服务]
 */
public interface ILoanOrderBizService {

	/**
	* 查询loan
	*
	* @param id loanID
	* @return loan
	*/
	public LoanOrder selectLoanOrderById(Long id);

	/**
	* 查询loan列表
	*
	* @param loanOrder loan
	* @return loan集合
	*/
	public List<LoanOrder> selectLoanOrderList(LoanOrder loanOrder);

	/**
	* 新增loan
	*
	* @param loanOrder loan
	* @return 结果
	*/
	public int insertLoanOrder(LoanOrder loanOrder);

	/**
	* 修改loan
	*
	* @param loanOrder loan
	* @return 结果
	*/
	public int updateLoanOrder(LoanOrder loanOrder);

	/**
	* 批量删除loan
	*
	* @param ids 需要删除的loanID
	* @return 结果
	*/
	public int deleteLoanOrderByIds(Long[] ids);

	/**
	* 删除loan信息
	*
	* @param id loanID
	* @return 结果
	*/
	public int deleteLoanOrderById(Long id);
	
}
