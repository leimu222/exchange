package com.common.api.mapper;

import com.common.api.model.GiftConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [gift服务实现]
 */
public interface GiftConfigMapper{

	/**
	* 查询gift
	*
	* @param id giftID
	* @return gift
	*/
	public GiftConfig selectGiftConfigById(Long id);

	/**
	* 查询gift列表
	*
	* @param giftConfig gift
	* @return gift集合
	*/
	public List<GiftConfig> selectGiftConfigList(GiftConfig giftConfig);

	/**
	* 新增gift
	*
	* @param giftConfig gift
	* @return 结果
	*/
	public int insertGiftConfig(GiftConfig giftConfig);

	/**
	* 修改gift
	*
	* @param giftConfig gift
	* @return 结果
	*/
	public int updateGiftConfig(GiftConfig giftConfig);

	/**
	* 删除gift
	*
	* @param id giftID
	* @return 结果
	*/
	public int deleteGiftConfigById(Long id);

	/**
	* 批量删除gift
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteGiftConfigByIds(Long[] ids);

}
