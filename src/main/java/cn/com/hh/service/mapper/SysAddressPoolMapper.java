package com.common.api.mapper;

import com.common.api.model.SysAddressPool;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [sys服务实现]
 */
public interface SysAddressPoolMapper{

	/**
	* 查询sys
	*
	* @param address sysID
	* @return sys
	*/
	public SysAddressPool selectSysAddressPoolById(String address);

	/**
	* 查询sys列表
	*
	* @param sysAddressPool sys
	* @return sys集合
	*/
	public List<SysAddressPool> selectSysAddressPoolList(SysAddressPool sysAddressPool);

	/**
	* 新增sys
	*
	* @param sysAddressPool sys
	* @return 结果
	*/
	public int insertSysAddressPool(SysAddressPool sysAddressPool);

	/**
	* 修改sys
	*
	* @param sysAddressPool sys
	* @return 结果
	*/
	public int updateSysAddressPool(SysAddressPool sysAddressPool);

	/**
	* 删除sys
	*
	* @param address sysID
	* @return 结果
	*/
	public int deleteSysAddressPoolById(String address);

	/**
	* 批量删除sys
	*
	* @param addresss 需要删除的数据ID
	* @return 结果
	*/
	public int deleteSysAddressPoolByIds(String[] addresss);

}
