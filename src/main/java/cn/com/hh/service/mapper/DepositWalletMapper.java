package com.common.api.mapper;

import com.common.api.model.DepositWallet;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [deposit服务实现]
 */
public interface DepositWalletMapper{

	/**
	* 查询deposit
	*
	* @param id depositID
	* @return deposit
	*/
	public DepositWallet selectDepositWalletById(Integer id);

	/**
	* 查询deposit列表
	*
	* @param depositWallet deposit
	* @return deposit集合
	*/
	public List<DepositWallet> selectDepositWalletList(DepositWallet depositWallet);

	/**
	* 新增deposit
	*
	* @param depositWallet deposit
	* @return 结果
	*/
	public int insertDepositWallet(DepositWallet depositWallet);

	/**
	* 修改deposit
	*
	* @param depositWallet deposit
	* @return 结果
	*/
	public int updateDepositWallet(DepositWallet depositWallet);

	/**
	* 删除deposit
	*
	* @param id depositID
	* @return 结果
	*/
	public int deleteDepositWalletById(Integer id);

	/**
	* 批量删除deposit
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteDepositWalletByIds(Integer[] ids);

}
