package com.common.api.mapper;

import com.common.api.model.Announcement;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [announcement服务实现]
 */
public interface AnnouncementMapper{

	/**
	* 查询announcement
	*
	* @param id announcementID
	* @return announcement
	*/
	public Announcement selectAnnouncementById(Long id);

	/**
	* 查询announcement列表
	*
	* @param announcement announcement
	* @return announcement集合
	*/
	public List<Announcement> selectAnnouncementList(Announcement announcement);

	/**
	* 新增announcement
	*
	* @param announcement announcement
	* @return 结果
	*/
	public int insertAnnouncement(Announcement announcement);

	/**
	* 修改announcement
	*
	* @param announcement announcement
	* @return 结果
	*/
	public int updateAnnouncement(Announcement announcement);

	/**
	* 删除announcement
	*
	* @param id announcementID
	* @return 结果
	*/
	public int deleteAnnouncementById(Long id);

	/**
	* 批量删除announcement
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteAnnouncementByIds(Long[] ids);

}
