package com.common.api.mapper;

import com.common.api.model.OptionExchangeOrderFee;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public interface OptionExchangeOrderFeeMapper{

	/**
	* 查询option
	*
	* @param orderId optionID
	* @return option
	*/
	public OptionExchangeOrderFee selectOptionExchangeOrderFeeById(Long orderId);

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderFee option
	* @return option集合
	*/
	public List<OptionExchangeOrderFee> selectOptionExchangeOrderFeeList(OptionExchangeOrderFee optionExchangeOrderFee);

	/**
	* 新增option
	*
	* @param optionExchangeOrderFee option
	* @return 结果
	*/
	public int insertOptionExchangeOrderFee(OptionExchangeOrderFee optionExchangeOrderFee);

	/**
	* 修改option
	*
	* @param optionExchangeOrderFee option
	* @return 结果
	*/
	public int updateOptionExchangeOrderFee(OptionExchangeOrderFee optionExchangeOrderFee);

	/**
	* 删除option
	*
	* @param orderId optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderFeeById(Long orderId);

	/**
	* 批量删除option
	*
	* @param orderIds 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderFeeByIds(Long[] orderIds);

}
