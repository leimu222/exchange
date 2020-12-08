package com.common.api.mapper;

import com.common.api.model.MemberMiningProfitDay;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public interface MemberMiningProfitDayMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberMiningProfitDay selectMemberMiningProfitDayById(Long id);

	/**
	* 查询member列表
	*
	* @param memberMiningProfitDay member
	* @return member集合
	*/
	public List<MemberMiningProfitDay> selectMemberMiningProfitDayList(MemberMiningProfitDay memberMiningProfitDay);

	/**
	* 新增member
	*
	* @param memberMiningProfitDay member
	* @return 结果
	*/
	public int insertMemberMiningProfitDay(MemberMiningProfitDay memberMiningProfitDay);

	/**
	* 修改member
	*
	* @param memberMiningProfitDay member
	* @return 结果
	*/
	public int updateMemberMiningProfitDay(MemberMiningProfitDay memberMiningProfitDay);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberMiningProfitDayById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberMiningProfitDayByIds(Long[] ids);

}
