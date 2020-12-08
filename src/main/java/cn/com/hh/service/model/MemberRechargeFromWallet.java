package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberRechargeFromWallet  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 用户id
     */
	private Long memberId;
	/**
     * 变动金额
     */
	private java.math.BigDecimal amount;
	/**
     * 变动后余额
     */
	private java.math.BigDecimal afterBalance;
	/**
     * 币种
     */
	private String coinName;
	/**
     * 来源项目
     */
	private String fromProject;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	/**
     * 更新时间
     */
	private java.util.Date updateTime;
	/**
     * 充值状态，0未审核，1审核通过已到账，2拒绝通过
     */
	private Integer status;
	
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
	* 用户id
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 用户id
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 变动金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 变动金额
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 变动后余额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAfterBalance(){
		return afterBalance;
	}
	/**
	* 变动后余额
	*/
	public void setAfterBalance(java.math.BigDecimal afterBalance){
		this.afterBalance = afterBalance;
	}
	/**
	* 币种
	* @return String
    */
	public String getCoinName(){
		return coinName;
	}
	/**
	* 币种
	*/
	public void setCoinName(String coinName){
		this.coinName = coinName;
	}
	/**
	* 来源项目
	* @return String
    */
	public String getFromProject(){
		return fromProject;
	}
	/**
	* 来源项目
	*/
	public void setFromProject(String fromProject){
		this.fromProject = fromProject;
	}
	/**
	* 创建时间
	* @return java.util.Date
    */
	public java.util.Date getCreateTime(){
		return createTime;
	}
	/**
	* 创建时间
	*/
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
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
	/**
	* 充值状态，0未审核，1审核通过已到账，2拒绝通过
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 充值状态，0未审核，1审核通过已到账，2拒绝通过
	*/
	public void setStatus(Integer status){
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("afterBalance:").append(getAfterBalance()).append(";");
		sb.append("coinName:").append(getCoinName()).append(";");
		sb.append("fromProject:").append(getFromProject()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		return sb.toString();
	}
}
