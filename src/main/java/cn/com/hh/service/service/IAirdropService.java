package com.common.api.service;

import java.util.List;

import com.common.api.model.airdrop;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:01
 * Description: [airdrop服务]
 */
public interface IAirdropService {

	/**
	* 查询airdrop
	*
	* @param id airdropID
	* @return airdrop
	*/
	public Airdrop selectAirdropById(Long id);

	/**
	* 查询airdrop列表
	*
	* @param airdrop airdrop
	* @return airdrop集合
	*/
	public List<Airdrop> selectAirdropList(Airdrop airdrop);

	/**
	* 新增airdrop
	*
	* @param airdrop airdrop
	* @return 结果
	*/
	public int insertAirdrop(Airdrop airdrop);

	/**
	* 修改airdrop
	*
	* @param airdrop airdrop
	* @return 结果
	*/
	public int updateAirdrop(Airdrop airdrop);

	/**
	* 批量删除airdrop
	*
	* @param ids 需要删除的airdropID
	* @return 结果
	*/
	public int deleteAirdropByIds(Long[] ids);

	/**
	* 删除airdrop信息
	*
	* @param id airdropID
	* @return 结果
	*/
	public int deleteAirdropById(Long id);
	
}
