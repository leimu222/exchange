package com.common.api.mapper;

import com.common.api.model.CoinConvert;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [coin服务实现]
 */
public interface CoinConvertMapper{

	/**
	* 查询coin
	*
	* @param id coinID
	* @return coin
	*/
	public CoinConvert selectCoinConvertById(Integer id);

	/**
	* 查询coin列表
	*
	* @param coinConvert coin
	* @return coin集合
	*/
	public List<CoinConvert> selectCoinConvertList(CoinConvert coinConvert);

	/**
	* 新增coin
	*
	* @param coinConvert coin
	* @return 结果
	*/
	public int insertCoinConvert(CoinConvert coinConvert);

	/**
	* 修改coin
	*
	* @param coinConvert coin
	* @return 结果
	*/
	public int updateCoinConvert(CoinConvert coinConvert);

	/**
	* 删除coin
	*
	* @param id coinID
	* @return 结果
	*/
	public int deleteCoinConvertById(Integer id);

	/**
	* 批量删除coin
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteCoinConvertByIds(Integer[] ids);

}
