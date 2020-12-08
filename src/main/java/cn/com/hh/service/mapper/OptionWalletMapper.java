package com.common.api.mapper;

import com.common.api.model.OptionWallet;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public interface OptionWalletMapper{

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionWallet selectOptionWalletById(Long id);

	/**
	* 查询option列表
	*
	* @param optionWallet option
	* @return option集合
	*/
	public List<OptionWallet> selectOptionWalletList(OptionWallet optionWallet);

	/**
	* 新增option
	*
	* @param optionWallet option
	* @return 结果
	*/
	public int insertOptionWallet(OptionWallet optionWallet);

	/**
	* 修改option
	*
	* @param optionWallet option
	* @return 结果
	*/
	public int updateOptionWallet(OptionWallet optionWallet);

	/**
	* 删除option
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionWalletById(Long id);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionWalletByIds(Long[] ids);

}
