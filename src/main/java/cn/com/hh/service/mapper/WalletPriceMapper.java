package com.common.api.mapper;

import com.common.api.model.WalletPrice;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [wallet服务实现]
 */
public interface WalletPriceMapper{

	/**
	* 查询wallet
	*
	* @param id walletID
	* @return wallet
	*/
	public WalletPrice selectWalletPriceById(Integer id);

	/**
	* 查询wallet列表
	*
	* @param walletPrice wallet
	* @return wallet集合
	*/
	public List<WalletPrice> selectWalletPriceList(WalletPrice walletPrice);

	/**
	* 新增wallet
	*
	* @param walletPrice wallet
	* @return 结果
	*/
	public int insertWalletPrice(WalletPrice walletPrice);

	/**
	* 修改wallet
	*
	* @param walletPrice wallet
	* @return 结果
	*/
	public int updateWalletPrice(WalletPrice walletPrice);

	/**
	* 删除wallet
	*
	* @param id walletID
	* @return 结果
	*/
	public int deleteWalletPriceById(Integer id);

	/**
	* 批量删除wallet
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteWalletPriceByIds(Integer[] ids);

}
