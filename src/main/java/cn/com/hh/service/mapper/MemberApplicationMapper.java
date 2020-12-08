package com.common.api.mapper;

import com.common.api.model.MemberApplication;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public interface MemberApplicationMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberApplication selectMemberApplicationById(Long id);

	/**
	* 查询member列表
	*
	* @param memberApplication member
	* @return member集合
	*/
	public List<MemberApplication> selectMemberApplicationList(MemberApplication memberApplication);

	/**
	* 新增member
	*
	* @param memberApplication member
	* @return 结果
	*/
	public int insertMemberApplication(MemberApplication memberApplication);

	/**
	* 修改member
	*
	* @param memberApplication member
	* @return 结果
	*/
	public int updateMemberApplication(MemberApplication memberApplication);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberApplicationById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberApplicationByIds(Long[] ids);

}
