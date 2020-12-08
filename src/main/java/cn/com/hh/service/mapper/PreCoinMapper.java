package com.common.api.mapper;

import com.common.api.model.PreCoin;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [pre服务实现]
 */
public interface PreCoinMapper{

	/**
	* 查询pre
	*
	* @param id preID
	* @return pre
	*/
	public PreCoin selectPreCoinById(Long id);

	/**
	* 查询pre列表
	*
	* @param preCoin pre
	* @return pre集合
	*/
	public List<PreCoin> selectPreCoinList(PreCoin preCoin);

	/**
	* 新增pre
	*
	* @param preCoin pre
	* @return 结果
	*/
	public int insertPreCoin(PreCoin preCoin);

	/**
	* 修改pre
	*
	* @param preCoin pre
	* @return 结果
	*/
	public int updatePreCoin(PreCoin preCoin);

	/**
	* 删除pre
	*
	* @param id preID
	* @return 结果
	*/
	public int deletePreCoinById(Long id);

	/**
	* 批量删除pre
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deletePreCoinByIds(Long[] ids);

}
