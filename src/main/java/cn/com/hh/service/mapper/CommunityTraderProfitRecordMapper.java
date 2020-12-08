package com.common.api.mapper;

import com.common.api.model.CommunityTraderProfitRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [community服务实现]
 */
public interface CommunityTraderProfitRecordMapper{

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	public CommunityTraderProfitRecord selectCommunityTraderProfitRecordById(Long id);

	/**
	* 查询community列表
	*
	* @param communityTraderProfitRecord community
	* @return community集合
	*/
	public List<CommunityTraderProfitRecord> selectCommunityTraderProfitRecordList(CommunityTraderProfitRecord communityTraderProfitRecord);

	/**
	* 新增community
	*
	* @param communityTraderProfitRecord community
	* @return 结果
	*/
	public int insertCommunityTraderProfitRecord(CommunityTraderProfitRecord communityTraderProfitRecord);

	/**
	* 修改community
	*
	* @param communityTraderProfitRecord community
	* @return 结果
	*/
	public int updateCommunityTraderProfitRecord(CommunityTraderProfitRecord communityTraderProfitRecord);

	/**
	* 删除community
	*
	* @param id communityID
	* @return 结果
	*/
	public int deleteCommunityTraderProfitRecordById(Long id);

	/**
	* 批量删除community
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteCommunityTraderProfitRecordByIds(Long[] ids);

}
