package com.common.api.mapper;

import com.common.api.model.MemberTransaction;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public interface MemberTransactionMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberTransaction selectMemberTransactionById(Long id);

	/**
	* 查询member列表
	*
	* @param memberTransaction member
	* @return member集合
	*/
	public List<MemberTransaction> selectMemberTransactionList(MemberTransaction memberTransaction);

	/**
	* 新增member
	*
	* @param memberTransaction member
	* @return 结果
	*/
	public int insertMemberTransaction(MemberTransaction memberTransaction);

	/**
	* 修改member
	*
	* @param memberTransaction member
	* @return 结果
	*/
	public int updateMemberTransaction(MemberTransaction memberTransaction);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberTransactionById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberTransactionByIds(Long[] ids);

}
