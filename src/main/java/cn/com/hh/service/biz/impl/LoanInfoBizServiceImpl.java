package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.LoanInfoMapper;
import com.common.api.model.LoanInfo;
import com.common.api.service.ILoanInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [loanBiz服务实现]
 */
@Service
public class LoanInfoBizServiceImpl extends CommonService implements ILoanInfoBizService {
	@Autowired
	private ILoanInfoService loanInfoService;

	/**
	* 查询loan
	*
	* @param id loanID
	* @return loan
	*/
	@Override
	public LoanInfo selectLoanInfoById(Long id) {
		return loanInfoService.selectLoanInfoById(id);
	}

	/**
	* 查询loan列表
	*
	* @param loanInfo loan
	* @return loan
	*/
	@Override
	public List<LoanInfo> selectLoanInfoList(LoanInfo loanInfo) {
		return loanInfoService.selectLoanInfoList(loanInfo);
	}

	/**
	* 新增loan
	*
	* @param loanInfo loan
	* @return 结果
	*/
	@Override
	public int insertLoanInfo(LoanInfo loanInfo) {
		return loanInfoService.insertLoanInfo(loanInfo);
	}

	/**
	* 修改loan
	*
	* @param loanInfo loan
	* @return 结果
	*/
	@Override
	public int updateLoanInfo(LoanInfo loanInfo) {
		return loanInfoService.updateLoanInfo(loanInfo);
	}

	/**
	* 批量删除loan
	*
	* @param ids 需要删除的loanID
	* @return 结果
	*/
	@Override
	public int deleteLoanInfoByIds(Long[] ids) {
		return loanInfoService.deleteLoanInfoByIds(ids);
	}

	/**
	* 删除loan信息
	*
	* @param id loanID
	* @return 结果
	*/
	@Override
	public int deleteLoanInfoById(Long id) {
		return loanInfoService.deleteLoanInfoById(id);
	}

}
