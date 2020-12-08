package com.common.api.mapper;

import com.common.api.model.MemberWalletHistory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public interface MemberWalletHistoryMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberWalletHistory selectMemberWalletHistoryById(Long id);

	/**
	* 查询member列表
	*
	* @param memberWalletHistory member
	* @return member集合
	*/
	public List<MemberWalletHistory> selectMemberWalletHistoryList(MemberWalletHistory memberWalletHistory);

	/**
	* 新增member
	*
	* @param memberWalletHistory member
	* @return 结果
	*/
	public int insertMemberWalletHistory(MemberWalletHistory memberWalletHistory);

	/**
	* 修改member
	*
	* @param memberWalletHistory member
	* @return 结果
	*/
	public int updateMemberWalletHistory(MemberWalletHistory memberWalletHistory);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberWalletHistoryById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberWalletHistoryByIds(Long[] ids);

}
