package com.common.api.mapper;

import com.common.api.model.OtcWallet;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [otc服务实现]
 */
public interface OtcWalletMapper{

	/**
	* 查询otc
	*
	* @param id otcID
	* @return otc
	*/
	public OtcWallet selectOtcWalletById(Long id);

	/**
	* 查询otc列表
	*
	* @param otcWallet otc
	* @return otc集合
	*/
	public List<OtcWallet> selectOtcWalletList(OtcWallet otcWallet);

	/**
	* 新增otc
	*
	* @param otcWallet otc
	* @return 结果
	*/
	public int insertOtcWallet(OtcWallet otcWallet);

	/**
	* 修改otc
	*
	* @param otcWallet otc
	* @return 结果
	*/
	public int updateOtcWallet(OtcWallet otcWallet);

	/**
	* 删除otc
	*
	* @param id otcID
	* @return 结果
	*/
	public int deleteOtcWalletById(Long id);

	/**
	* 批量删除otc
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOtcWalletByIds(Long[] ids);

}
