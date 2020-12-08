package com.common.api.mapper;

import com.common.api.model.OptionStrategyHedgingOrder;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public interface OptionStrategyHedgingOrderMapper{

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionStrategyHedgingOrder selectOptionStrategyHedgingOrderById(Long id);

	/**
	* 查询option列表
	*
	* @param optionStrategyHedgingOrder option
	* @return option集合
	*/
	public List<OptionStrategyHedgingOrder> selectOptionStrategyHedgingOrderList(OptionStrategyHedgingOrder optionStrategyHedgingOrder);

	/**
	* 新增option
	*
	* @param optionStrategyHedgingOrder option
	* @return 结果
	*/
	public int insertOptionStrategyHedgingOrder(OptionStrategyHedgingOrder optionStrategyHedgingOrder);

	/**
	* 修改option
	*
	* @param optionStrategyHedgingOrder option
	* @return 结果
	*/
	public int updateOptionStrategyHedgingOrder(OptionStrategyHedgingOrder optionStrategyHedgingOrder);

	/**
	* 删除option
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionStrategyHedgingOrderById(Long id);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionStrategyHedgingOrderByIds(Long[] ids);

}
