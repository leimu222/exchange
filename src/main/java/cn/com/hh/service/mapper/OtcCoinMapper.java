package com.common.api.mapper;

import com.common.api.model.OtcCoin;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [otc服务实现]
 */
public interface OtcCoinMapper{

	/**
	* 查询otc
	*
	* @param id otcID
	* @return otc
	*/
	public OtcCoin selectOtcCoinById(Long id);

	/**
	* 查询otc列表
	*
	* @param otcCoin otc
	* @return otc集合
	*/
	public List<OtcCoin> selectOtcCoinList(OtcCoin otcCoin);

	/**
	* 新增otc
	*
	* @param otcCoin otc
	* @return 结果
	*/
	public int insertOtcCoin(OtcCoin otcCoin);

	/**
	* 修改otc
	*
	* @param otcCoin otc
	* @return 结果
	*/
	public int updateOtcCoin(OtcCoin otcCoin);

	/**
	* 删除otc
	*
	* @param id otcID
	* @return 结果
	*/
	public int deleteOtcCoinById(Long id);

	/**
	* 批量删除otc
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOtcCoinByIds(Long[] ids);

}
