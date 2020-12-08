package com.common.api.mapper;

import com.common.api.model.MemberMiningProfitDay20201112;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public interface MemberMiningProfitDay20201112Mapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberMiningProfitDay20201112 selectMemberMiningProfitDay20201112ById(Long id);

	/**
	* 查询member列表
	*
	* @param memberMiningProfitDay20201112 member
	* @return member集合
	*/
	public List<MemberMiningProfitDay20201112> selectMemberMiningProfitDay20201112List(MemberMiningProfitDay20201112 memberMiningProfitDay20201112);

	/**
	* 新增member
	*
	* @param memberMiningProfitDay20201112 member
	* @return 结果
	*/
	public int insertMemberMiningProfitDay20201112(MemberMiningProfitDay20201112 memberMiningProfitDay20201112);

	/**
	* 修改member
	*
	* @param memberMiningProfitDay20201112 member
	* @return 结果
	*/
	public int updateMemberMiningProfitDay20201112(MemberMiningProfitDay20201112 memberMiningProfitDay20201112);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberMiningProfitDay20201112ById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberMiningProfitDay20201112ByIds(Long[] ids);

}
