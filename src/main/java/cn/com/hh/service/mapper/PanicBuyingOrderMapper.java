package com.common.api.mapper;

import com.common.api.model.PanicBuyingOrder;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [panic服务实现]
 */
public interface PanicBuyingOrderMapper{

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
	* 删除panic
	*
	* @param id panicID
	* @return 结果
	*/
	public int deletePanicBuyingOrderById(Long id);

	/**
	* 批量删除panic
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deletePanicBuyingOrderByIds(Long[] ids);

}
