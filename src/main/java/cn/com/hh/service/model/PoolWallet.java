package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [pool服务实现]
 */
public class PoolWallet  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 用户 id

     */
	private Long memberId;
	/**
     * 币种
     */
	private String coin;
	/**
     * 余额
     */
	private java.math.BigDecimal balance;
	/**
     * 乐观锁
     */
	private Integer version;
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
	* 用户 id

	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 用户 id

	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 币种
	* @return String
    */
	public String getCoin(){
		return coin;
	}
	/**
	* 币种
	*/
	public void setCoin(String coin){
		this.coin = coin;
	}
	/**
	* 余额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBalance(){
		return balance;
	}
	/**
	* 余额
	*/
	public void setBalance(java.math.BigDecimal balance){
		this.balance = balance;
	}
	/**
	* 乐观锁
	* @return Integer
    */
	public Integer getVersion(){
		return version;
	}
	/**
	* 乐观锁
	*/
	public void setVersion(Integer version){
		this.version = version;
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
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("coin:").append(getCoin()).append(";");
		sb.append("balance:").append(getBalance()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		return sb.toString();
	}
}
