package com.common.api.mapper;

import com.common.api.model.HotWalletInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [hot服务实现]
 */
public interface HotWalletInfoMapper{

	/**
	* 查询hot
	*
	* @param id hotID
	* @return hot
	*/
	public HotWalletInfo selectHotWalletInfoById(Integer id);

	/**
	* 查询hot列表
	*
	* @param hotWalletInfo hot
	* @return hot集合
	*/
	public List<HotWalletInfo> selectHotWalletInfoList(HotWalletInfo hotWalletInfo);

	/**
	* 新增hot
	*
	* @param hotWalletInfo hot
	* @return 结果
	*/
	public int insertHotWalletInfo(HotWalletInfo hotWalletInfo);

	/**
	* 修改hot
	*
	* @param hotWalletInfo hot
	* @return 结果
	*/
	public int updateHotWalletInfo(HotWalletInfo hotWalletInfo);

	/**
	* 删除hot
	*
	* @param id hotID
	* @return 结果
	*/
	public int deleteHotWalletInfoById(Integer id);

	/**
	* 批量删除hot
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteHotWalletInfoByIds(Integer[] ids);

}
