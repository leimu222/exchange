package com.common.api.mapper;

import com.common.api.model.OptionCoin;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [option服务实现]
 */
public interface OptionCoinMapper{

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionCoin selectOptionCoinById(Long id);

	/**
	* 查询option列表
	*
	* @param optionCoin option
	* @return option集合
	*/
	public List<OptionCoin> selectOptionCoinList(OptionCoin optionCoin);

	/**
	* 新增option
	*
	* @param optionCoin option
	* @return 结果
	*/
	public int insertOptionCoin(OptionCoin optionCoin);

	/**
	* 修改option
	*
	* @param optionCoin option
	* @return 结果
	*/
	public int updateOptionCoin(OptionCoin optionCoin);

	/**
	* 删除option
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionCoinById(Long id);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionCoinByIds(Long[] ids);

}
