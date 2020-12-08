package com.common.api.mapper;

import com.common.api.model.Feedback;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [feedback服务实现]
 */
public interface FeedbackMapper{

	/**
	* 查询feedback
	*
	* @param id feedbackID
	* @return feedback
	*/
	public Feedback selectFeedbackById(Long id);

	/**
	* 查询feedback列表
	*
	* @param feedback feedback
	* @return feedback集合
	*/
	public List<Feedback> selectFeedbackList(Feedback feedback);

	/**
	* 新增feedback
	*
	* @param feedback feedback
	* @return 结果
	*/
	public int insertFeedback(Feedback feedback);

	/**
	* 修改feedback
	*
	* @param feedback feedback
	* @return 结果
	*/
	public int updateFeedback(Feedback feedback);

	/**
	* 删除feedback
	*
	* @param id feedbackID
	* @return 结果
	*/
	public int deleteFeedbackById(Long id);

	/**
	* 批量删除feedback
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteFeedbackByIds(Long[] ids);

}
