package com.common.api.mapper;

import com.common.api.model.PoolWallet;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [pool服务实现]
 */
public interface PoolWalletMapper{

	/**
	* 查询pool
	*
	* @param id poolID
	* @return pool
	*/
	public PoolWallet selectPoolWalletById(Long id);

	/**
	* 查询pool列表
	*
	* @param poolWallet pool
	* @return pool集合
	*/
	public List<PoolWallet> selectPoolWalletList(PoolWallet poolWallet);

	/**
	* 新增pool
	*
	* @param poolWallet pool
	* @return 结果
	*/
	public int insertPoolWallet(PoolWallet poolWallet);

	/**
	* 修改pool
	*
	* @param poolWallet pool
	* @return 结果
	*/
	public int updatePoolWallet(PoolWallet poolWallet);

	/**
	* 删除pool
	*
	* @param id poolID
	* @return 结果
	*/
	public int deletePoolWalletById(Long id);

	/**
	* 批量删除pool
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deletePoolWalletByIds(Long[] ids);

}
