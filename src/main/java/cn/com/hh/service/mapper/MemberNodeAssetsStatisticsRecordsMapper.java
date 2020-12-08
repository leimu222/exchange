package com.common.api.mapper;

import com.common.api.model.MemberNodeAssetsStatisticsRecords;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public interface MemberNodeAssetsStatisticsRecordsMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberNodeAssetsStatisticsRecords selectMemberNodeAssetsStatisticsRecordsById(Long id);

	/**
	* 查询member列表
	*
	* @param memberNodeAssetsStatisticsRecords member
	* @return member集合
	*/
	public List<MemberNodeAssetsStatisticsRecords> selectMemberNodeAssetsStatisticsRecordsList(MemberNodeAssetsStatisticsRecords memberNodeAssetsStatisticsRecords);

	/**
	* 新增member
	*
	* @param memberNodeAssetsStatisticsRecords member
	* @return 结果
	*/
	public int insertMemberNodeAssetsStatisticsRecords(MemberNodeAssetsStatisticsRecords memberNodeAssetsStatisticsRecords);

	/**
	* 修改member
	*
	* @param memberNodeAssetsStatisticsRecords member
	* @return 结果
	*/
	public int updateMemberNodeAssetsStatisticsRecords(MemberNodeAssetsStatisticsRecords memberNodeAssetsStatisticsRecords);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberNodeAssetsStatisticsRecordsById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberNodeAssetsStatisticsRecordsByIds(Long[] ids);

}
