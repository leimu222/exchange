package com.common.api.mapper;

import com.common.api.model.CoinIssued;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [coin服务实现]
 */
public interface CoinIssuedMapper{

	/**
	* 查询coin
	*
	* @param name coinID
	* @return coin
	*/
	public CoinIssued selectCoinIssuedById(String name);

	/**
	* 查询coin列表
	*
	* @param coinIssued coin
	* @return coin集合
	*/
	public List<CoinIssued> selectCoinIssuedList(CoinIssued coinIssued);

	/**
	* 新增coin
	*
	* @param coinIssued coin
	* @return 结果
	*/
	public int insertCoinIssued(CoinIssued coinIssued);

	/**
	* 修改coin
	*
	* @param coinIssued coin
	* @return 结果
	*/
	public int updateCoinIssued(CoinIssued coinIssued);

	/**
	* 删除coin
	*
	* @param name coinID
	* @return 结果
	*/
	public int deleteCoinIssuedById(String name);

	/**
	* 批量删除coin
	*
	* @param names 需要删除的数据ID
	* @return 结果
	*/
	public int deleteCoinIssuedByIds(String[] names);

}
