package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:01
 * Description: [announcement单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnouncementServiceImplTest  {

	@Autowired
	private IAnnouncementService announcementService;

	/**
	* 查询announcement
	*/
	@Test
	public void selectAnnouncementById() {
		Announcement announcement = announcementService.selectAnnouncementById(1);
		System.out.println(announcement.toString());
	}

	/**
	* 查询announcement列表
	*/
	@Test
	public void selectAnnouncementList() {
		List<Announcement> list = announcementService.selectAnnouncementList(new Announcement());
		for(Announcement model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增announcement
	*/
	@Test
	public void insertAnnouncement() {
		for (int i = 1;i < 30; i++) {
			Announcement announcement = new Announcement();
			announcementService.insertAnnouncement(announcement);
		}
	}

	/**
	* 修改announcement
	*/
	@Test
	public void updateAnnouncement() {
		Announcement announcement = new Announcement();
		announcementService.updateAnnouncement(announcement);
	}

	/**
	* 批量删除announcement
	*/
	@Test
	public void deleteAnnouncementByIds() {
	}

	/**
	* 删除announcement信息
	*/
	@Test
	public void deleteAnnouncementById() {
	}

}
