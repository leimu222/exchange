package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [contract服务实现]
 */
public class ContractCommissionInfo  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 用户id
     */
	private Long memberId;
	/**
     * 代理商用户id
     */
	private Long proxyId;
	/**
     * 返佣金额
     */
	private Double amount;
	/**
     * 返佣金币名，默认USDT
     */
	private String coinName;
	/**
     * 后台操作用户名
     */
	private String sysUser;
	/**
     * 0未发放，1已发放
     */
	private Integer status;
	/**
     * 会员状态（1节点，2代理，3市场管理员）
     */
	private Integer memberStatus;
	/**
     * 返佣类型：0盈亏返佣，1手续费返佣
     */
	private Integer type;
	/**
     * 更新时间
     */
	private java.util.Date updateTime;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	/**
     * 时间戳
     */
	private Long sequence;
	
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
	* 代理商用户id
	* @return Long
    */
	public Long getProxyId(){
		return proxyId;
	}
	/**
	* 代理商用户id
	*/
	public void setProxyId(Long proxyId){
		this.proxyId = proxyId;
	}
	/**
	* 返佣金额
	* @return Double
    */
	public Double getAmount(){
		return amount;
	}
	/**
	* 返佣金额
	*/
	public void setAmount(Double amount){
		this.amount = amount;
	}
	/**
	* 返佣金币名，默认USDT
	* @return String
    */
	public String getCoinName(){
		return coinName;
	}
	/**
	* 返佣金币名，默认USDT
	*/
	public void setCoinName(String coinName){
		this.coinName = coinName;
	}
	/**
	* 后台操作用户名
	* @return String
    */
	public String getSysUser(){
		return sysUser;
	}
	/**
	* 后台操作用户名
	*/
	public void setSysUser(String sysUser){
		this.sysUser = sysUser;
	}
	/**
	* 0未发放，1已发放
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 0未发放，1已发放
	*/
	public void setStatus(Integer status){
		this.status = status;
	}
	/**
	* 会员状态（1节点，2代理，3市场管理员）
	* @return Integer
    */
	public Integer getMemberStatus(){
		return memberStatus;
	}
	/**
	* 会员状态（1节点，2代理，3市场管理员）
	*/
	public void setMemberStatus(Integer memberStatus){
		this.memberStatus = memberStatus;
	}
	/**
	* 返佣类型：0盈亏返佣，1手续费返佣
	* @return Integer
    */
	public Integer getType(){
		return type;
	}
	/**
	* 返佣类型：0盈亏返佣，1手续费返佣
	*/
	public void setType(Integer type){
		this.type = type;
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
	* 时间戳
	* @return Long
    */
	public Long getSequence(){
		return sequence;
	}
	/**
	* 时间戳
	*/
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("proxyId:").append(getProxyId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("coinName:").append(getCoinName()).append(";");
		sb.append("sysUser:").append(getSysUser()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("memberStatus:").append(getMemberStatus()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
