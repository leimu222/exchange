package com.common.api.mapper;

import com.common.api.model.Coin;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [coin服务实现]
 */
public interface CoinMapper{

	/**
	* 查询coin
	*
	* @param name coinID
	* @return coin
	*/
	public Coin selectCoinById(String name);

	/**
	* 查询coin列表
	*
	* @param coin coin
	* @return coin集合
	*/
	public List<Coin> selectCoinList(Coin coin);

	/**
	* 新增coin
	*
	* @param coin coin
	* @return 结果
	*/
	public int insertCoin(Coin coin);

	/**
	* 修改coin
	*
	* @param coin coin
	* @return 结果
	*/
	public int updateCoin(Coin coin);

	/**
	* 删除coin
	*
	* @param name coinID
	* @return 结果
	*/
	public int deleteCoinById(String name);

	/**
	* 批量删除coin
	*
	* @param names 需要删除的数据ID
	* @return 结果
	*/
	public int deleteCoinByIds(String[] names);

}
