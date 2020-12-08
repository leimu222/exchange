package com.common.api.mapper;

import com.common.api.model.LegalWalletRecharge;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [legal服务实现]
 */
public interface LegalWalletRechargeMapper{

	/**
	* 查询legal
	*
	* @param id legalID
	* @return legal
	*/
	public LegalWalletRecharge selectLegalWalletRechargeById(Long id);

	/**
	* 查询legal列表
	*
	* @param legalWalletRecharge legal
	* @return legal集合
	*/
	public List<LegalWalletRecharge> selectLegalWalletRechargeList(LegalWalletRecharge legalWalletRecharge);

	/**
	* 新增legal
	*
	* @param legalWalletRecharge legal
	* @return 结果
	*/
	public int insertLegalWalletRecharge(LegalWalletRecharge legalWalletRecharge);

	/**
	* 修改legal
	*
	* @param legalWalletRecharge legal
	* @return 结果
	*/
	public int updateLegalWalletRecharge(LegalWalletRecharge legalWalletRecharge);

	/**
	* 删除legal
	*
	* @param id legalID
	* @return 结果
	*/
	public int deleteLegalWalletRechargeById(Long id);

	/**
	* 批量删除legal
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteLegalWalletRechargeByIds(Long[] ids);

}
