package com.common.api.mapper;

import com.common.api.model.MemberApplyNode;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public interface MemberApplyNodeMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberApplyNode selectMemberApplyNodeById(Integer id);

	/**
	* 查询member列表
	*
	* @param memberApplyNode member
	* @return member集合
	*/
	public List<MemberApplyNode> selectMemberApplyNodeList(MemberApplyNode memberApplyNode);

	/**
	* 新增member
	*
	* @param memberApplyNode member
	* @return 结果
	*/
	public int insertMemberApplyNode(MemberApplyNode memberApplyNode);

	/**
	* 修改member
	*
	* @param memberApplyNode member
	* @return 结果
	*/
	public int updateMemberApplyNode(MemberApplyNode memberApplyNode);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberApplyNodeById(Integer id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberApplyNodeByIds(Integer[] ids);

}
