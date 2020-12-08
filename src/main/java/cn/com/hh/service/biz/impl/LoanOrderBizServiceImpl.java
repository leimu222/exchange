package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.LoanOrderMapper;
import com.common.api.model.LoanOrder;
import com.common.api.service.ILoanOrderService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [loanBiz服务实现]
 */
@Service
public class LoanOrderBizServiceImpl extends CommonService implements ILoanOrderBizService {
	@Autowired
	private ILoanOrderService loanOrderService;

	/**
	* 查询loan
	*
	* @param id loanID
	* @return loan
	*/
	@Override
	public LoanOrder selectLoanOrderById(Long id) {
		return loanOrderService.selectLoanOrderById(id);
	}

	/**
	* 查询loan列表
	*
	* @param loanOrder loan
	* @return loan
	*/
	@Override
	public List<LoanOrder> selectLoanOrderList(LoanOrder loanOrder) {
		return loanOrderService.selectLoanOrderList(loanOrder);
	}

	/**
	* 新增loan
	*
	* @param loanOrder loan
	* @return 结果
	*/
	@Override
	public int insertLoanOrder(LoanOrder loanOrder) {
		return loanOrderService.insertLoanOrder(loanOrder);
	}

	/**
	* 修改loan
	*
	* @param loanOrder loan
	* @return 结果
	*/
	@Override
	public int updateLoanOrder(LoanOrder loanOrder) {
		return loanOrderService.updateLoanOrder(loanOrder);
	}

	/**
	* 批量删除loan
	*
	* @param ids 需要删除的loanID
	* @return 结果
	*/
	@Override
	public int deleteLoanOrderByIds(Long[] ids) {
		return loanOrderService.deleteLoanOrderByIds(ids);
	}

	/**
	* 删除loan信息
	*
	* @param id loanID
	* @return 结果
	*/
	@Override
	public int deleteLoanOrderById(Long id) {
		return loanOrderService.deleteLoanOrderById(id);
	}

}
