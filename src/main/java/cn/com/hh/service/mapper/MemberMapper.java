package com.common.api.mapper;

import com.common.api.model.Member;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public interface MemberMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public Member selectMemberById(Long id);

	/**
	* 查询member列表
	*
	* @param member member
	* @return member集合
	*/
	public List<Member> selectMemberList(Member member);

	/**
	* 新增member
	*
	* @param member member
	* @return 结果
	*/
	public int insertMember(Member member);

	/**
	* 修改member
	*
	* @param member member
	* @return 结果
	*/
	public int updateMember(Member member);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberByIds(Long[] ids);

}
