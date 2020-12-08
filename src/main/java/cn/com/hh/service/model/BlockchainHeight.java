package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [blockchain服务实现]
 */
public class BlockchainHeight  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String coin;
	/**
     * 区块高度
     */
	private Long lastBlockNum;
	/**
     * 更新时间
     */
	private java.util.Date updateTime;
	
	// setter and getter
	/**
	* 
	* @return Long
    */
	public Long getId(){
		return id;
	}
	/**
	* 
	*/
	public void setId(Long id){
		this.id = id;
	}
	/**
	* 
	* @return String
    */
	public String getCoin(){
		return coin;
	}
	/**
	* 
	*/
	public void setCoin(String coin){
		this.coin = coin;
	}
	/**
	* 区块高度
	* @return Long
    */
	public Long getLastBlockNum(){
		return lastBlockNum;
	}
	/**
	* 区块高度
	*/
	public void setLastBlockNum(Long lastBlockNum){
		this.lastBlockNum = lastBlockNum;
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
		sb.append("coin:").append(getCoin()).append(";");
		sb.append("lastBlockNum:").append(getLastBlockNum()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		return sb.toString();
	}
}
