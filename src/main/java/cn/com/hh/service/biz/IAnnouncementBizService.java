package com.common.api.service;

import java.util.List;

import com.common.api.model.announcement;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:01
 * Description: [announcementBiz服务]
 */
public interface IAnnouncementBizService {

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
	* 批量删除announcement
	*
	* @param ids 需要删除的announcementID
	* @return 结果
	*/
	public int deleteAnnouncementByIds(Long[] ids);

	/**
	* 删除announcement信息
	*
	* @param id announcementID
	* @return 结果
	*/
	public int deleteAnnouncementById(Long id);
	
}
