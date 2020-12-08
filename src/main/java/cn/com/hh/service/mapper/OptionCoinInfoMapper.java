package com.common.api.mapper;

import com.common.api.model.OptionCoinInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [option服务实现]
 */
public interface OptionCoinInfoMapper{

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionCoinInfo selectOptionCoinInfoById(Integer id);

	/**
	* 查询option列表
	*
	* @param optionCoinInfo option
	* @return option集合
	*/
	public List<OptionCoinInfo> selectOptionCoinInfoList(OptionCoinInfo optionCoinInfo);

	/**
	* 新增option
	*
	* @param optionCoinInfo option
	* @return 结果
	*/
	public int insertOptionCoinInfo(OptionCoinInfo optionCoinInfo);

	/**
	* 修改option
	*
	* @param optionCoinInfo option
	* @return 结果
	*/
	public int updateOptionCoinInfo(OptionCoinInfo optionCoinInfo);

	/**
	* 删除option
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionCoinInfoById(Integer id);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionCoinInfoByIds(Integer[] ids);

}
