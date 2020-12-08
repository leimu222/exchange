package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.AdminAccessLogMapper;
import com.common.api.model.AdminAccessLog;
import com.common.api.service.IAdminAccessLogService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:00
 * Description: [admin服务实现]
 */
@Service
public class AdminAccessLogServiceImpl implements IAdminAccessLogService {
	@Autowired
	private AdminAccessLogMapper adminAccessLogMapper;

	/**
	* 查询admin
	*
	* @param id adminID
	* @return admin
	*/
	@Override
	public AdminAccessLog selectAdminAccessLogById(Long id) {
		return adminAccessLogMapper.selectAdminAccessLogById(id);
	}

	/**
	* 查询admin列表
	*
	* @param adminAccessLog admin
	* @return admin
	*/
	@Override
	public List<AdminAccessLog> selectAdminAccessLogList(AdminAccessLog adminAccessLog) {
		return adminAccessLogMapper.selectAdminAccessLogList(adminAccessLog);
	}

	/**
	* 新增admin
	*
	* @param adminAccessLog admin
	* @return 结果
	*/
	@Override
	public int insertAdminAccessLog(AdminAccessLog adminAccessLog) {
		return adminAccessLogMapper.insertAdminAccessLog(adminAccessLog);
	}

	/**
	* 修改admin
	*
	* @param adminAccessLog admin
	* @return 结果
	*/
	@Override
	public int updateAdminAccessLog(AdminAccessLog adminAccessLog) {
		return adminAccessLogMapper.updateAdminAccessLog(adminAccessLog);
	}

	/**
	* 批量删除admin
	*
	* @param ids 需要删除的adminID
	* @return 结果
	*/
	@Override
	public int deleteAdminAccessLogByIds(Long[] ids) {
		return adminAccessLogMapper.deleteAdminAccessLogByIds(ids);
	}

	/**
	* 删除admin信息
	*
	* @param id adminID
	* @return 结果
	*/
	@Override
	public int deleteAdminAccessLogById(Long id) {
		return adminAccessLogMapper.deleteAdminAccessLogById(id);
	}

}
