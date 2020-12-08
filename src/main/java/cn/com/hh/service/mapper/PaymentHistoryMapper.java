package com.common.api.mapper;

import com.common.api.model.PaymentHistory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [payment服务实现]
 */
public interface PaymentHistoryMapper{

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
	* 删除payment
	*
	* @param id paymentID
	* @return 结果
	*/
	public int deletePaymentHistoryById(Long id);

	/**
	* 批量删除payment
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deletePaymentHistoryByIds(Long[] ids);

}
