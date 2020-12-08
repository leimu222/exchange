package com.common.api.mapper;

import com.common.api.model.OptionExchangeOrderClose;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public interface OptionExchangeOrderCloseMapper{

	/**
	* 查询option
	*
	* @param orderId optionID
	* @return option
	*/
	public OptionExchangeOrderClose selectOptionExchangeOrderCloseById(Long orderId);

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderClose option
	* @return option集合
	*/
	public List<OptionExchangeOrderClose> selectOptionExchangeOrderCloseList(OptionExchangeOrderClose optionExchangeOrderClose);

	/**
	* 新增option
	*
	* @param optionExchangeOrderClose option
	* @return 结果
	*/
	public int insertOptionExchangeOrderClose(OptionExchangeOrderClose optionExchangeOrderClose);

	/**
	* 修改option
	*
	* @param optionExchangeOrderClose option
	* @return 结果
	*/
	public int updateOptionExchangeOrderClose(OptionExchangeOrderClose optionExchangeOrderClose);

	/**
	* 删除option
	*
	* @param orderId optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderCloseById(Long orderId);

	/**
	* 批量删除option
	*
	* @param orderIds 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderCloseByIds(Long[] orderIds);

}
