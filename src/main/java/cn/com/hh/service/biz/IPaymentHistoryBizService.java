package com.common.api.service;

import java.util.List;

import com.common.api.model.paymentHistory;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [paymentBiz服务]
 */
public interface IPaymentHistoryBizService {

	/**
	* 查询payment
	*
	* @param id paymentID
	* @return payment
	*/
	public PaymentHistory selectPaymentHistoryById(Long id);

	/**
	* 查询payment列表
	*
	* @param paymentHistory payment
	* @return payment集合
	*/
	public List<PaymentHistory> selectPaymentHistoryList(PaymentHistory paymentHistory);

	/**
	* 新增payment
	*
	* @param paymentHistory payment
	* @return 结果
	*/
	public int insertPaymentHistory(PaymentHistory paymentHistory);

	/**
	* 修改payment
	*
	* @param paymentHistory payment
	* @return 结果
	*/
	public int updatePaymentHistory(PaymentHistory paymentHistory);

	/**
	* 批量删除payment
	*
	* @param ids 需要删除的paymentID
	* @return 结果
	*/
	public int deletePaymentHistoryByIds(Long[] ids);

	/**
	* 删除payment信息
	*
	* @param id paymentID
	* @return 结果
	*/
	public int deletePaymentHistoryById(Long id);
	
}
