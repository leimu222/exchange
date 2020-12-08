package com.common.api.mapper;

import com.common.api.model.MemberApplicationConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public interface MemberApplicationConfigMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberApplicationConfig selectMemberApplicationConfigById(Long id);

	/**
	* 查询member列表
	*
	* @param memberApplicationConfig member
	* @return member集合
	*/
	public List<MemberApplicationConfig> selectMemberApplicationConfigList(MemberApplicationConfig memberApplicationConfig);

	/**
	* 新增member
	*
	* @param memberApplicationConfig member
	* @return 结果
	*/
	public int insertMemberApplicationConfig(MemberApplicationConfig memberApplicationConfig);

	/**
	* 修改member
	*
	* @param memberApplicationConfig member
	* @return 结果
	*/
	public int updateMemberApplicationConfig(MemberApplicationConfig memberApplicationConfig);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberApplicationConfigById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberApplicationConfigByIds(Long[] ids);

}
