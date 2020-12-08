package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.TbSmsMapper;
import com.common.api.model.TbSms;
import com.common.api.service.ITbSmsService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [tb服务实现]
 */
@Service
public class TbSmsServiceImpl implements ITbSmsService {
	@Autowired
	private TbSmsMapper tbSmsMapper;

	/**
	* 查询tb
	*
	* @param id tbID
	* @return tb
	*/
	@Override
	public TbSms selectTbSmsById(Long id) {
		return tbSmsMapper.selectTbSmsById(id);
	}

	/**
	* 查询tb列表
	*
	* @param tbSms tb
	* @return tb
	*/
	@Override
	public List<TbSms> selectTbSmsList(TbSms tbSms) {
		return tbSmsMapper.selectTbSmsList(tbSms);
	}

	/**
	* 新增tb
	*
	* @param tbSms tb
	* @return 结果
	*/
	@Override
	public int insertTbSms(TbSms tbSms) {
		return tbSmsMapper.insertTbSms(tbSms);
	}

	/**
	* 修改tb
	*
	* @param tbSms tb
	* @return 结果
	*/
	@Override
	public int updateTbSms(TbSms tbSms) {
		return tbSmsMapper.updateTbSms(tbSms);
	}

	/**
	* 批量删除tb
	*
	* @param ids 需要删除的tbID
	* @return 结果
	*/
	@Override
	public int deleteTbSmsByIds(Long[] ids) {
		return tbSmsMapper.deleteTbSmsByIds(ids);
	}

	/**
	* 删除tb信息
	*
	* @param id tbID
	* @return 结果
	*/
	@Override
	public int deleteTbSmsById(Long id) {
		return tbSmsMapper.deleteTbSmsById(id);
	}

}
