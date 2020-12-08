package com.common.api.mapper;

import com.common.api.model.AdminOperateContractWalletLog;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:00
  * Description: [admin服务实现]
 */
public interface AdminOperateContractWalletLogMapper{

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
	* 删除admin
	*
	* @param id adminID
	* @return 结果
	*/
	public int deleteAdminOperateContractWalletLogById(Long id);

	/**
	* 批量删除admin
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteAdminOperateContractWalletLogByIds(Long[] ids);

}
