package com.common.api.mapper;

import com.common.api.model.LeverWallet;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [lever服务实现]
 */
public interface LeverWalletMapper{

	/**
	* 查询lever
	*
	* @param id leverID
	* @return lever
	*/
	public LeverWallet selectLeverWalletById(Long id);

	/**
	* 查询lever列表
	*
	* @param leverWallet lever
	* @return lever集合
	*/
	public List<LeverWallet> selectLeverWalletList(LeverWallet leverWallet);

	/**
	* 新增lever
	*
	* @param leverWallet lever
	* @return 结果
	*/
	public int insertLeverWallet(LeverWallet leverWallet);

	/**
	* 修改lever
	*
	* @param leverWallet lever
	* @return 结果
	*/
	public int updateLeverWallet(LeverWallet leverWallet);

	/**
	* 删除lever
	*
	* @param id leverID
	* @return 结果
	*/
	public int deleteLeverWalletById(Long id);

	/**
	* 批量删除lever
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteLeverWalletByIds(Long[] ids);

}
