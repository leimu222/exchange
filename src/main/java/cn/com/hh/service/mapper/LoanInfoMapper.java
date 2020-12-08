package com.common.api.mapper;

import com.common.api.model.LoanInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [loan服务实现]
 */
public interface LoanInfoMapper{

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
	* 删除loan
	*
	* @param id loanID
	* @return 结果
	*/
	public int deleteLoanInfoById(Long id);

	/**
	* 批量删除loan
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteLoanInfoByIds(Long[] ids);

}
