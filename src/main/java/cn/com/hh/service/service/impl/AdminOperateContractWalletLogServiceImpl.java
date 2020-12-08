package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.AdminOperateContractWalletLogMapper;
import com.common.api.model.AdminOperateContractWalletLog;
import com.common.api.service.IAdminOperateContractWalletLogService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:00
 * Description: [admin服务实现]
 */
@Service
public class AdminOperateContractWalletLogServiceImpl implements IAdminOperateContractWalletLogService {
	@Autowired
	private AdminOperateContractWalletLogMapper adminOperateContractWalletLogMapper;

	/**
	* 查询admin
	*
	* @param id adminID
	* @return admin
	*/
	@Override
	public AdminOperateContractWalletLog selectAdminOperateContractWalletLogById(Long id) {
		return adminOperateContractWalletLogMapper.selectAdminOperateContractWalletLogById(id);
	}

	/**
	* 查询admin列表
	*
	* @param adminOperateContractWalletLog admin
	* @return admin
	*/
	@Override
	public List<AdminOperateContractWalletLog> selectAdminOperateContractWalletLogList(AdminOperateContractWalletLog adminOperateContractWalletLog) {
		return adminOperateContractWalletLogMapper.selectAdminOperateContractWalletLogList(adminOperateContractWalletLog);
	}

	/**
	* 新增admin
	*
	* @param adminOperateContractWalletLog admin
	* @return 结果
	*/
	@Override
	public int insertAdminOperateContractWalletLog(AdminOperateContractWalletLog adminOperateContractWalletLog) {
		return adminOperateContractWalletLogMapper.insertAdminOperateContractWalletLog(adminOperateContractWalletLog);
	}

	/**
	* 修改admin
	*
	* @param adminOperateContractWalletLog admin
	* @return 结果
	*/
	@Override
	public int updateAdminOperateContractWalletLog(AdminOperateContractWalletLog adminOperateContractWalletLog) {
		return adminOperateContractWalletLogMapper.updateAdminOperateContractWalletLog(adminOperateContractWalletLog);
	}

	/**
	* 批量删除admin
	*
	* @param ids 需要删除的adminID
	* @return 结果
	*/
	@Override
	public int deleteAdminOperateContractWalletLogByIds(Long[] ids) {
		return adminOperateContractWalletLogMapper.deleteAdminOperateContractWalletLogByIds(ids);
	}

	/**
	* 删除admin信息
	*
	* @param id adminID
	* @return 结果
	*/
	@Override
	public int deleteAdminOperateContractWalletLogById(Long id) {
		return adminOperateContractWalletLogMapper.deleteAdminOperateContractWalletLogById(id);
	}

}
