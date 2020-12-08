package com.common.api.mapper;

import com.common.api.model.BusinessAuthApply;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [business服务实现]
 */
public interface BusinessAuthApplyMapper{

	/**
	* 查询business
	*
	* @param id businessID
	* @return business
	*/
	public BusinessAuthApply selectBusinessAuthApplyById(Long id);

	/**
	* 查询business列表
	*
	* @param businessAuthApply business
	* @return business集合
	*/
	public List<BusinessAuthApply> selectBusinessAuthApplyList(BusinessAuthApply businessAuthApply);

	/**
	* 新增business
	*
	* @param businessAuthApply business
	* @return 结果
	*/
	public int insertBusinessAuthApply(BusinessAuthApply businessAuthApply);

	/**
	* 修改business
	*
	* @param businessAuthApply business
	* @return 结果
	*/
	public int updateBusinessAuthApply(BusinessAuthApply businessAuthApply);

	/**
	* 删除business
	*
	* @param id businessID
	* @return 结果
	*/
	public int deleteBusinessAuthApplyById(Long id);

	/**
	* 批量删除business
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteBusinessAuthApplyByIds(Long[] ids);

}
