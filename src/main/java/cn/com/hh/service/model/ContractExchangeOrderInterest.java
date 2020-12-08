package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public class ContractExchangeOrderInterest  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键，自增
     */
	private Long id;
	/**
     * 关联持仓订单表主键
     */
	private Long orderId;
	/**
     * 持仓利息
     */
	private java.math.BigDecimal balance;
	/**
     * 乐观锁版本号
     */
	private Long version;
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
	* 主键，自增
	* @return Long
    */
	public Long getId(){
		return id;
	}
	/**
	* 主键，自增
	*/
	public void setId(Long id){
		this.id = id;
	}
	/**
	* 关联持仓订单表主键
	* @return Long
    */
	public Long getOrderId(){
		return orderId;
	}
	/**
	* 关联持仓订单表主键
	*/
	public void setOrderId(Long orderId){
		this.orderId = orderId;
	}
	/**
	* 持仓利息
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBalance(){
		return balance;
	}
	/**
	* 持仓利息
	*/
	public void setBalance(java.math.BigDecimal balance){
		this.balance = balance;
	}
	/**
	* 乐观锁版本号
	* @return Long
    */
	public Long getVersion(){
		return version;
	}
	/**
	* 乐观锁版本号
	*/
	public void setVersion(Long version){
		this.version = version;
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
		sb.append("orderId:").append(getOrderId()).append(";");
		sb.append("balance:").append(getBalance()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
