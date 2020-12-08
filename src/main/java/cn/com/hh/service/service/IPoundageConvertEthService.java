package com.common.api.service;

import java.util.List;

import com.common.api.model.poundageConvertEth;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [poundage服务]
 */
public interface IPoundageConvertEthService {

	/**
	* 查询poundage
	*
	* @param id poundageID
	* @return poundage
	*/
	public PoundageConvertEth selectPoundageConvertEthById(Long id);

	/**
	* 查询poundage列表
	*
	* @param poundageConvertEth poundage
	* @return poundage集合
	*/
	public List<PoundageConvertEth> selectPoundageConvertEthList(PoundageConvertEth poundageConvertEth);

	/**
	* 新增poundage
	*
	* @param poundageConvertEth poundage
	* @return 结果
	*/
	public int insertPoundageConvertEth(PoundageConvertEth poundageConvertEth);

	/**
	* 修改poundage
	*
	* @param poundageConvertEth poundage
	* @return 结果
	*/
	public int updatePoundageConvertEth(PoundageConvertEth poundageConvertEth);

	/**
	* 批量删除poundage
	*
	* @param ids 需要删除的poundageID
	* @return 结果
	*/
	public int deletePoundageConvertEthByIds(Long[] ids);

	/**
	* 删除poundage信息
	*
	* @param id poundageID
	* @return 结果
	*/
	public int deletePoundageConvertEthById(Long id);
	
}
