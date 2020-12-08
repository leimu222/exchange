package com.common.api.mapper;

import com.common.api.model.FeeStastic;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [fee服务实现]
 */
public interface FeeStasticMapper{

	/**
	* 查询fee
	*
	* @param id feeID
	* @return fee
	*/
	public FeeStastic selectFeeStasticById(Long id);

	/**
	* 查询fee列表
	*
	* @param feeStastic fee
	* @return fee集合
	*/
	public List<FeeStastic> selectFeeStasticList(FeeStastic feeStastic);

	/**
	* 新增fee
	*
	* @param feeStastic fee
	* @return 结果
	*/
	public int insertFeeStastic(FeeStastic feeStastic);

	/**
	* 修改fee
	*
	* @param feeStastic fee
	* @return 结果
	*/
	public int updateFeeStastic(FeeStastic feeStastic);

	/**
	* 删除fee
	*
	* @param id feeID
	* @return 结果
	*/
	public int deleteFeeStasticById(Long id);

	/**
	* 批量删除fee
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteFeeStasticByIds(Long[] ids);

}
