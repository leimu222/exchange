package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [chain服务实现]
 */
public class ChainLastBlock  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 最新区块高度
     */
	private Long lastBlockNum;
	/**
     * BTC，ETH
     */
	private String assetsName;
	/**
     * 更新时间
     */
	private java.util.Date updateTime;
	
	// setter and getter
	/**
	* 
	* @return Integer
    */
	public Integer getId(){
		return id;
	}
	/**
	* 
	*/
	public void setId(Integer id){
		this.id = id;
	}
	/**
	* 最新区块高度
	* @return Long
    */
	public Long getLastBlockNum(){
		return lastBlockNum;
	}
	/**
	* 最新区块高度
	*/
	public void setLastBlockNum(Long lastBlockNum){
		this.lastBlockNum = lastBlockNum;
	}
	/**
	* BTC，ETH
	* @return String
    */
	public String getAssetsName(){
		return assetsName;
	}
	/**
	* BTC，ETH
	*/
	public void setAssetsName(String assetsName){
		this.assetsName = assetsName;
	}
	/**
	* 更新时间
	* @return java.util.Date
    */
	public java.util.Date getUpdateTime(){
		return updateTime;
	}
	/**
	* 更新时间
	*/
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("lastBlockNum:").append(getLastBlockNum()).append(";");
		sb.append("assetsName:").append(getAssetsName()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		return sb.toString();
	}
}
