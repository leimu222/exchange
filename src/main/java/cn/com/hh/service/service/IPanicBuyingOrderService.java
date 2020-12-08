package com.common.api.service;

import java.util.List;

import com.common.api.model.panicBuyingOrder;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [panic服务]
 */
public interface IPanicBuyingOrderService {

	/**
	* 查询panic
	*
	* @param id panicID
	* @return panic
	*/
	public PanicBuyingOrder selectPanicBuyingOrderById(Long id);

	/**
	* 查询panic列表
	*
	* @param panicBuyingOrder panic
	* @return panic集合
	*/
	public List<PanicBuyingOrder> selectPanicBuyingOrderList(PanicBuyingOrder panicBuyingOrder);

	/**
	* 新增panic
	*
	* @param panicBuyingOrder panic
	* @return 结果
	*/
	public int insertPanicBuyingOrder(PanicBuyingOrder panicBuyingOrder);

	/**
	* 修改panic
	*
	* @param panicBuyingOrder panic
	* @return 结果
	*/
	public int updatePanicBuyingOrder(PanicBuyingOrder panicBuyingOrder);

	/**
	* 批量删除panic
	*
	* @param ids 需要删除的panicID
	* @return 结果
	*/
	public int deletePanicBuyingOrderByIds(Long[] ids);

	/**
	* 删除panic信息
	*
	* @param id panicID
	* @return 结果
	*/
	public int deletePanicBuyingOrderById(Long id);
	
}
