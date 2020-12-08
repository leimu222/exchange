package com.common.api.mapper;

import com.common.api.model.LoanRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [loan服务实现]
 */
public interface LoanRecordMapper{

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
	* 删除loan
	*
	* @param id loanID
	* @return 结果
	*/
	public int deleteLoanRecordById(Long id);

	/**
	* 批量删除loan
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteLoanRecordByIds(Long[] ids);

}
