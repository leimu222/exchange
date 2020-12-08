package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberSignRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private java.math.BigDecimal amount;
	/**
     * 
     */
	private java.util.Date creationTime;
	/**
     * 
     */
	private String coinName;
	/**
     * 
     */
	private Long memberId;
	/**
     * 
     */
	private Long signId;
	
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
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getCreationTime(){
		return creationTime;
	}
	/**
	* 
	*/
	public void setCreationTime(java.util.Date creationTime){
		this.creationTime = creationTime;
	}
	/**
	* 
	* @return String
    */
	public String getCoinName(){
		return coinName;
	}
	/**
	* 
	*/
	public void setCoinName(String coinName){
		this.coinName = coinName;
	}
	/**
	* 
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 
	* @return Long
    */
	public Long getSignId(){
		return signId;
	}
	/**
	* 
	*/
	public void setSignId(Long signId){
		this.signId = signId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("creationTime:").append(getCreationTime()).append(";");
		sb.append("coinName:").append(getCoinName()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("signId:").append(getSignId()).append(";");
		return sb.toString();
	}
}
