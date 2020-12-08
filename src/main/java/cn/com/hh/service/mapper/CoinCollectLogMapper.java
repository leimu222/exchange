package com.common.api.mapper;

import com.common.api.model.CoinCollectLog;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [coin服务实现]
 */
public interface CoinCollectLogMapper{

	/**
	* 查询coin
	*
	* @param id coinID
	* @return coin
	*/
	public CoinCollectLog selectCoinCollectLogById(Integer id);

	/**
	* 查询coin列表
	*
	* @param coinCollectLog coin
	* @return coin集合
	*/
	public List<CoinCollectLog> selectCoinCollectLogList(CoinCollectLog coinCollectLog);

	/**
	* 新增coin
	*
	* @param coinCollectLog coin
	* @return 结果
	*/
	public int insertCoinCollectLog(CoinCollectLog coinCollectLog);

	/**
	* 修改coin
	*
	* @param coinCollectLog coin
	* @return 结果
	*/
	public int updateCoinCollectLog(CoinCollectLog coinCollectLog);

	/**
	* 删除coin
	*
	* @param id coinID
	* @return 结果
	*/
	public int deleteCoinCollectLogById(Integer id);

	/**
	* 批量删除coin
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteCoinCollectLogByIds(Integer[] ids);

}
