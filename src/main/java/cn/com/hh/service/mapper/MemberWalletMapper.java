package com.common.api.mapper;

import com.common.api.model.MemberWallet;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public interface MemberWalletMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberWallet selectMemberWalletById(Long id);

	/**
	* 查询member列表
	*
	* @param memberWallet member
	* @return member集合
	*/
	public List<MemberWallet> selectMemberWalletList(MemberWallet memberWallet);

	/**
	* 新增member
	*
	* @param memberWallet member
	* @return 结果
	*/
	public int insertMemberWallet(MemberWallet memberWallet);

	/**
	* 修改member
	*
	* @param memberWallet member
	* @return 结果
	*/
	public int updateMemberWallet(MemberWallet memberWallet);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberWalletById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberWalletByIds(Long[] ids);

}
