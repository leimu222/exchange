package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.AnnouncementMapper;
import com.common.api.model.Announcement;
import com.common.api.service.IAnnouncementService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:01
 * Description: [announcement服务实现]
 */
@Service
public class AnnouncementServiceImpl implements IAnnouncementService {
	@Autowired
	private AnnouncementMapper announcementMapper;

	/**
	* 查询announcement
	*
	* @param id announcementID
	* @return announcement
	*/
	@Override
	public Announcement selectAnnouncementById(Long id) {
		return announcementMapper.selectAnnouncementById(id);
	}

	/**
	* 查询announcement列表
	*
	* @param announcement announcement
	* @return announcement
	*/
	@Override
	public List<Announcement> selectAnnouncementList(Announcement announcement) {
		return announcementMapper.selectAnnouncementList(announcement);
	}

	/**
	* 新增announcement
	*
	* @param announcement announcement
	* @return 结果
	*/
	@Override
	public int insertAnnouncement(Announcement announcement) {
		return announcementMapper.insertAnnouncement(announcement);
	}

	/**
	* 修改announcement
	*
	* @param announcement announcement
	* @return 结果
	*/
	@Override
	public int updateAnnouncement(Announcement announcement) {
		return announcementMapper.updateAnnouncement(announcement);
	}

	/**
	* 批量删除announcement
	*
	* @param ids 需要删除的announcementID
	* @return 结果
	*/
	@Override
	public int deleteAnnouncementByIds(Long[] ids) {
		return announcementMapper.deleteAnnouncementByIds(ids);
	}

	/**
	* 删除announcement信息
	*
	* @param id announcementID
	* @return 结果
	*/
	@Override
	public int deleteAnnouncementById(Long id) {
		return announcementMapper.deleteAnnouncementById(id);
	}

}
