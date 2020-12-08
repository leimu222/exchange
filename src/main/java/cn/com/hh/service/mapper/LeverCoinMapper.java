package com.common.api.mapper;

import com.common.api.model.LeverCoin;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [lever服务实现]
 */
public interface LeverCoinMapper{

	/**
	* 查询lever
	*
	* @param id leverID
	* @return lever
	*/
	public LeverCoin selectLeverCoinById(Long id);

	/**
	* 查询lever列表
	*
	* @param leverCoin lever
	* @return lever集合
	*/
	public List<LeverCoin> selectLeverCoinList(LeverCoin leverCoin);

	/**
	* 新增lever
	*
	* @param leverCoin lever
	* @return 结果
	*/
	public int insertLeverCoin(LeverCoin leverCoin);

	/**
	* 修改lever
	*
	* @param leverCoin lever
	* @return 结果
	*/
	public int updateLeverCoin(LeverCoin leverCoin);

	/**
	* 删除lever
	*
	* @param id leverID
	* @return 结果
	*/
	public int deleteLeverCoinById(Long id);

	/**
	* 批量删除lever
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteLeverCoinByIds(Long[] ids);

}
