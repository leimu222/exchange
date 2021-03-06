package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.PaymentHistoryMapper;
import com.common.api.model.PaymentHistory;
import com.common.api.service.IPaymentHistoryService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [paymentBiz服务实现]
 */
@Service
public class PaymentHistoryBizServiceImpl extends CommonService implements IPaymentHistoryBizService {
	@Autowired
	private IPaymentHistoryService paymentHistoryService;

	/**
	* 查询payment
	*
	* @param id paymentID
	* @return payment
	*/
	@Override
	public PaymentHistory selectPaymentHistoryById(Long id) {
		return paymentHistoryService.selectPaymentHistoryById(id);
	}

	/**
	* 查询payment列表
	*
	* @param paymentHistory payment
	* @return payment
	*/
	@Override
	public List<PaymentHistory> selectPaymentHistoryList(PaymentHistory paymentHistory) {
		return paymentHistoryService.selectPaymentHistoryList(paymentHistory);
	}

	/**
	* 新增payment
	*
	* @param paymentHistory payment
	* @return 结果
	*/
	@Override
	public int insertPaymentHistory(PaymentHistory paymentHistory) {
		return paymentHistoryService.insertPaymentHistory(paymentHistory);
	}

	/**
	* 修改payment
	*
	* @param paymentHistory payment
	* @return 结果
	*/
	@Override
	public int updatePaymentHistory(PaymentHistory paymentHistory) {
		return paymentHistoryService.updatePaymentHistory(paymentHistory);
	}

	/**
	* 批量删除payment
	*
	* @param ids 需要删除的paymentID
	* @return 结果
	*/
	@Override
	public int deletePaymentHistoryByIds(Long[] ids) {
		return paymentHistoryService.deletePaymentHistoryByIds(ids);
	}

	/**
	* 删除payment信息
	*
	* @param id paymentID
	* @return 结果
	*/
	@Override
	public int deletePaymentHistoryById(Long id) {
		return paymentHistoryService.deletePaymentHistoryById(id);
	}

}
