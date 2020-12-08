package com.common.api.mapper;

import com.common.api.model.OptionMemberProfitLoss;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public interface OptionMemberProfitLossMapper{

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionMemberProfitLoss selectOptionMemberProfitLossById(Long id);

	/**
	* 查询option列表
	*
	* @param optionMemberProfitLoss option
	* @return option集合
	*/
	public List<OptionMemberProfitLoss> selectOptionMemberProfitLossList(OptionMemberProfitLoss optionMemberProfitLoss);

	/**
	* 新增option
	*
	* @param optionMemberProfitLoss option
	* @return 结果
	*/
	public int insertOptionMemberProfitLoss(OptionMemberProfitLoss optionMemberProfitLoss);

	/**
	* 修改option
	*
	* @param optionMemberProfitLoss option
	* @return 结果
	*/
	public int updateOptionMemberProfitLoss(OptionMemberProfitLoss optionMemberProfitLoss);

	/**
	* 删除option
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionMemberProfitLossById(Long id);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionMemberProfitLossByIds(Long[] ids);

}
