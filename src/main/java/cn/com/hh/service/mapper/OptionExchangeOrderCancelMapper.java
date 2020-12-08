package com.common.api.mapper;

import com.common.api.model.OptionExchangeOrderCancel;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public interface OptionExchangeOrderCancelMapper{

	/**
	* 查询option
	*
	* @param orderId optionID
	* @return option
	*/
	public OptionExchangeOrderCancel selectOptionExchangeOrderCancelById(Long orderId);

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderCancel option
	* @return option集合
	*/
	public List<OptionExchangeOrderCancel> selectOptionExchangeOrderCancelList(OptionExchangeOrderCancel optionExchangeOrderCancel);

	/**
	* 新增option
	*
	* @param optionExchangeOrderCancel option
	* @return 结果
	*/
	public int insertOptionExchangeOrderCancel(OptionExchangeOrderCancel optionExchangeOrderCancel);

	/**
	* 修改option
	*
	* @param optionExchangeOrderCancel option
	* @return 结果
	*/
	public int updateOptionExchangeOrderCancel(OptionExchangeOrderCancel optionExchangeOrderCancel);

	/**
	* 删除option
	*
	* @param orderId optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderCancelById(Long orderId);

	/**
	* 批量删除option
	*
	* @param orderIds 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderCancelByIds(Long[] orderIds);

}
