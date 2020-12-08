package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.LoanRecordMapper;
import com.common.api.model.LoanRecord;
import com.common.api.service.ILoanRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [loanBiz服务实现]
 */
@Service
public class LoanRecordBizServiceImpl extends CommonService implements ILoanRecordBizService {
	@Autowired
	private ILoanRecordService loanRecordService;

	/**
	* 查询loan
	*
	* @param id loanID
	* @return loan
	*/
	@Override
	public LoanRecord selectLoanRecordById(Long id) {
		return loanRecordService.selectLoanRecordById(id);
	}

	/**
	* 查询loan列表
	*
	* @param loanRecord loan
	* @return loan
	*/
	@Override
	public List<LoanRecord> selectLoanRecordList(LoanRecord loanRecord) {
		return loanRecordService.selectLoanRecordList(loanRecord);
	}

	/**
	* 新增loan
	*
	* @param loanRecord loan
	* @return 结果
	*/
	@Override
	public int insertLoanRecord(LoanRecord loanRecord) {
		return loanRecordService.insertLoanRecord(loanRecord);
	}

	/**
	* 修改loan
	*
	* @param loanRecord loan
	* @return 结果
	*/
	@Override
	public int updateLoanRecord(LoanRecord loanRecord) {
		return loanRecordService.updateLoanRecord(loanRecord);
	}

	/**
	* 批量删除loan
	*
	* @param ids 需要删除的loanID
	* @return 结果
	*/
	@Override
	public int deleteLoanRecordByIds(Long[] ids) {
		return loanRecordService.deleteLoanRecordByIds(ids);
	}

	/**
	* 删除loan信息
	*
	* @param id loanID
	* @return 结果
	*/
	@Override
	public int deleteLoanRecordById(Long id) {
		return loanRecordService.deleteLoanRecordById(id);
	}

}
