package com.common.api.mapper;

import com.common.api.model.BussinessCancelApply;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [bussiness服务实现]
 */
public interface BussinessCancelApplyMapper{

	/**
	* 查询bussiness
	*
	* @param id bussinessID
	* @return bussiness
	*/
	public BussinessCancelApply selectBussinessCancelApplyById(Long id);

	/**
	* 查询bussiness列表
	*
	* @param bussinessCancelApply bussiness
	* @return bussiness集合
	*/
	public List<BussinessCancelApply> selectBussinessCancelApplyList(BussinessCancelApply bussinessCancelApply);

	/**
	* 新增bussiness
	*
	* @param bussinessCancelApply bussiness
	* @return 结果
	*/
	public int insertBussinessCancelApply(BussinessCancelApply bussinessCancelApply);

	/**
	* 修改bussiness
	*
	* @param bussinessCancelApply bussiness
	* @return 结果
	*/
	public int updateBussinessCancelApply(BussinessCancelApply bussinessCancelApply);

	/**
	* 删除bussiness
	*
	* @param id bussinessID
	* @return 结果
	*/
	public int deleteBussinessCancelApplyById(Long id);

	/**
	* 批量删除bussiness
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteBussinessCancelApplyByIds(Long[] ids);

}
