package com.common.api.mapper;

import com.common.api.model.LegalWalletWithdraw;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [legal服务实现]
 */
public interface LegalWalletWithdrawMapper{

	/**
	* 查询legal
	*
	* @param id legalID
	* @return legal
	*/
	public LegalWalletWithdraw selectLegalWalletWithdrawById(Long id);

	/**
	* 查询legal列表
	*
	* @param legalWalletWithdraw legal
	* @return legal集合
	*/
	public List<LegalWalletWithdraw> selectLegalWalletWithdrawList(LegalWalletWithdraw legalWalletWithdraw);

	/**
	* 新增legal
	*
	* @param legalWalletWithdraw legal
	* @return 结果
	*/
	public int insertLegalWalletWithdraw(LegalWalletWithdraw legalWalletWithdraw);

	/**
	* 修改legal
	*
	* @param legalWalletWithdraw legal
	* @return 结果
	*/
	public int updateLegalWalletWithdraw(LegalWalletWithdraw legalWalletWithdraw);

	/**
	* 删除legal
	*
	* @param id legalID
	* @return 结果
	*/
	public int deleteLegalWalletWithdrawById(Long id);

	/**
	* 批量删除legal
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteLegalWalletWithdrawByIds(Long[] ids);

}
