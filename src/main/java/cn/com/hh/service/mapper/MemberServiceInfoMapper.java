package com.common.api.mapper;

import com.common.api.model.MemberServiceInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public interface MemberServiceInfoMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberServiceInfo selectMemberServiceInfoById(Integer id);

	/**
	* 查询member列表
	*
	* @param memberServiceInfo member
	* @return member集合
	*/
	public List<MemberServiceInfo> selectMemberServiceInfoList(MemberServiceInfo memberServiceInfo);

	/**
	* 新增member
	*
	* @param memberServiceInfo member
	* @return 结果
	*/
	public int insertMemberServiceInfo(MemberServiceInfo memberServiceInfo);

	/**
	* 修改member
	*
	* @param memberServiceInfo member
	* @return 结果
	*/
	public int updateMemberServiceInfo(MemberServiceInfo memberServiceInfo);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberServiceInfoById(Integer id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberServiceInfoByIds(Integer[] ids);

}
