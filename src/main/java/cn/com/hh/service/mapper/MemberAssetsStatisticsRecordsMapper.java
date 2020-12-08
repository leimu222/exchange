package com.common.api.mapper;

import com.common.api.model.MemberAssetsStatisticsRecords;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public interface MemberAssetsStatisticsRecordsMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberAssetsStatisticsRecords selectMemberAssetsStatisticsRecordsById(Long id);

	/**
	* 查询member列表
	*
	* @param memberAssetsStatisticsRecords member
	* @return member集合
	*/
	public List<MemberAssetsStatisticsRecords> selectMemberAssetsStatisticsRecordsList(MemberAssetsStatisticsRecords memberAssetsStatisticsRecords);

	/**
	* 新增member
	*
	* @param memberAssetsStatisticsRecords member
	* @return 结果
	*/
	public int insertMemberAssetsStatisticsRecords(MemberAssetsStatisticsRecords memberAssetsStatisticsRecords);

	/**
	* 修改member
	*
	* @param memberAssetsStatisticsRecords member
	* @return 结果
	*/
	public int updateMemberAssetsStatisticsRecords(MemberAssetsStatisticsRecords memberAssetsStatisticsRecords);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberAssetsStatisticsRecordsById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberAssetsStatisticsRecordsByIds(Long[] ids);

}
