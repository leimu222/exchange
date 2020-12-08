package com.common.api.mapper;

import com.common.api.model.MemberGrade;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public interface MemberGradeMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberGrade selectMemberGradeById(Long id);

	/**
	* 查询member列表
	*
	* @param memberGrade member
	* @return member集合
	*/
	public List<MemberGrade> selectMemberGradeList(MemberGrade memberGrade);

	/**
	* 新增member
	*
	* @param memberGrade member
	* @return 结果
	*/
	public int insertMemberGrade(MemberGrade memberGrade);

	/**
	* 修改member
	*
	* @param memberGrade member
	* @return 结果
	*/
	public int updateMemberGrade(MemberGrade memberGrade);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberGradeById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberGradeByIds(Long[] ids);

}
