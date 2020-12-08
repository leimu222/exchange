package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public class MemberAccountOperateRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Long id;
	/**
     * 用户ID
     */
	private Long memberId;
	/**
     * 变动金额
     */
	private java.math.BigDecimal changeAmount;
	/**
     * 充币币种名称
     */
	private String coin;
	/**
     * 充币类型：0可用余额，1冻结余额，2可释放余额，3虚充冻结金额
     */
	private Integer balanceType;
	/**
     * 账户类型：0币币账户，1合约账户，2法币账户，3期权账户
     */
	private Integer accountType;
	/**
     * 后台操作用户ID
     */
	private String adminUserId;
	/**
     * 时间戳
     */
	private Long sequence;
	/**
     * 时间
     */
	private java.util.Date createTime;
	
	// setter and getter
	/**
	* 主键
	* @return Long
    */
	public Long getId(){
		return id;
	}
	/**
	* 主键
	*/
	public void setId(Long id){
		this.id = id;
	}
	/**
	* 用户ID
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 用户ID
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 变动金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getChangeAmount(){
		return changeAmount;
	}
	/**
	* 变动金额
	*/
	public void setChangeAmount(java.math.BigDecimal changeAmount){
		this.changeAmount = changeAmount;
	}
	/**
	* 充币币种名称
	* @return String
    */
	public String getCoin(){
		return coin;
	}
	/**
	* 充币币种名称
	*/
	public void setCoin(String coin){
		this.coin = coin;
	}
	/**
	* 充币类型：0可用余额，1冻结余额，2可释放余额，3虚充冻结金额
	* @return Integer
    */
	public Integer getBalanceType(){
		return balanceType;
	}
	/**
	* 充币类型：0可用余额，1冻结余额，2可释放余额，3虚充冻结金额
	*/
	public void setBalanceType(Integer balanceType){
		this.balanceType = balanceType;
	}
	/**
	* 账户类型：0币币账户，1合约账户，2法币账户，3期权账户
	* @return Integer
    */
	public Integer getAccountType(){
		return accountType;
	}
	/**
	* 账户类型：0币币账户，1合约账户，2法币账户，3期权账户
	*/
	public void setAccountType(Integer accountType){
		this.accountType = accountType;
	}
	/**
	* 后台操作用户ID
	* @return String
    */
	public String getAdminUserId(){
		return adminUserId;
	}
	/**
	* 后台操作用户ID
	*/
	public void setAdminUserId(String adminUserId){
		this.adminUserId = adminUserId;
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
	/**
	* 时间
	* @return java.util.Date
    */
	public java.util.Date getCreateTime(){
		return createTime;
	}
	/**
	* 时间
	*/
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("changeAmount:").append(getChangeAmount()).append(";");
		sb.append("coin:").append(getCoin()).append(";");
		sb.append("balanceType:").append(getBalanceType()).append(";");
		sb.append("accountType:").append(getAccountType()).append(";");
		sb.append("adminUserId:").append(getAdminUserId()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		return sb.toString();
	}
}
