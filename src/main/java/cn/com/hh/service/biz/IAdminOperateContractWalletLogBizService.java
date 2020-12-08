package com.common.api.service;

import java.util.List;

import com.common.api.model.adminOperateContractWalletLog;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:00
 * Description: [adminBiz服务]
 */
public interface IAdminOperateContractWalletLogBizService {

	/**
	* 查询admin
	*
	* @param id adminID
	* @return admin
	*/
	public AdminOperateContractWalletLog selectAdminOperateContractWalletLogById(Long id);

	/**
	* 查询admin列表
	*
	* @param adminOperateContractWalletLog admin
	* @return admin集合
	*/
	public List<AdminOperateContractWalletLog> selectAdminOperateContractWalletLogList(AdminOperateContractWalletLog adminOperateContractWalletLog);

	/**
	* 新增admin
	*
	* @param adminOperateContractWalletLog admin
	* @return 结果
	*/
	public int insertAdminOperateContractWalletLog(AdminOperateContractWalletLog adminOperateContractWalletLog);

	/**
	* 修改admin
	*
	* @param adminOperateContractWalletLog admin
	* @return 结果
	*/
	public int updateAdminOperateContractWalletLog(AdminOperateContractWalletLog adminOperateContractWalletLog);

	/**
	* 批量删除admin
	*
	* @param ids 需要删除的adminID
	* @return 结果
	*/
	public int deleteAdminOperateContractWalletLogByIds(Long[] ids);

	/**
	* 删除admin信息
	*
	* @param id adminID
	* @return 结果
	*/
	public int deleteAdminOperateContractWalletLogById(Long id);
	
}
