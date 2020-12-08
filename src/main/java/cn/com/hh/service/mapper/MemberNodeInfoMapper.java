package com.common.api.mapper;

import com.common.api.model.MemberNodeInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public interface MemberNodeInfoMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberNodeInfo selectMemberNodeInfoById(Integer id);

	/**
	* 查询member列表
	*
	* @param memberNodeInfo member
	* @return member集合
	*/
	public List<MemberNodeInfo> selectMemberNodeInfoList(MemberNodeInfo memberNodeInfo);

	/**
	* 新增member
	*
	* @param memberNodeInfo member
	* @return 结果
	*/
	public int insertMemberNodeInfo(MemberNodeInfo memberNodeInfo);

	/**
	* 修改member
	*
	* @param memberNodeInfo member
	* @return 结果
	*/
	public int updateMemberNodeInfo(MemberNodeInfo memberNodeInfo);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberNodeInfoById(Integer id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberNodeInfoByIds(Integer[] ids);

}
