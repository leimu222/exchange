package com.common.api.mapper;

import com.common.api.model.OptionCommissionInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [option服务实现]
 */
public interface OptionCommissionInfoMapper{

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionCommissionInfo selectOptionCommissionInfoById(Integer id);

	/**
	* 查询option列表
	*
	* @param optionCommissionInfo option
	* @return option集合
	*/
	public List<OptionCommissionInfo> selectOptionCommissionInfoList(OptionCommissionInfo optionCommissionInfo);

	/**
	* 新增option
	*
	* @param optionCommissionInfo option
	* @return 结果
	*/
	public int insertOptionCommissionInfo(OptionCommissionInfo optionCommissionInfo);

	/**
	* 修改option
	*
	* @param optionCommissionInfo option
	* @return 结果
	*/
	public int updateOptionCommissionInfo(OptionCommissionInfo optionCommissionInfo);

	/**
	* 删除option
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionCommissionInfoById(Integer id);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionCommissionInfoByIds(Integer[] ids);

}
