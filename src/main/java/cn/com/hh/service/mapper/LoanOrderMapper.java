package com.common.api.mapper;

import com.common.api.model.LoanOrder;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [loan服务实现]
 */
public interface LoanOrderMapper{

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
	* 删除loan
	*
	* @param id loanID
	* @return 结果
	*/
	public int deleteLoanOrderById(Long id);

	/**
	* 批量删除loan
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteLoanOrderByIds(Long[] ids);

}
