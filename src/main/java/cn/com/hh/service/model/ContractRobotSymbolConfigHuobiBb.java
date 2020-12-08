package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public class ContractRobotSymbolConfigHuobiBb  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 交易对
     */
	private String symbol;
	/**
     * 来源交易所编码，关联配置交易所
     */
	private Long fromExchangeId;
	/**
     * 来源交易所的交易对
     */
	private String fromExchangeSymbol;
	/**
     * 倍数
     */
	private java.math.BigDecimal amountMultiple;
	/**
     * 状态 0-停止 1-启动
     */
	private Boolean status;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private Long sequence;
	/**
     * 版本号
     */
	private Long version;
	
	// setter and getter
	/**
	* 交易对
	* @return String
    */
	public String getSymbol(){
		return symbol;
	}
	/**
	* 交易对
	*/
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	/**
	* 来源交易所编码，关联配置交易所
	* @return Long
    */
	public Long getFromExchangeId(){
		return fromExchangeId;
	}
	/**
	* 来源交易所编码，关联配置交易所
	*/
	public void setFromExchangeId(Long fromExchangeId){
		this.fromExchangeId = fromExchangeId;
	}
	/**
	* 来源交易所的交易对
	* @return String
    */
	public String getFromExchangeSymbol(){
		return fromExchangeSymbol;
	}
	/**
	* 来源交易所的交易对
	*/
	public void setFromExchangeSymbol(String fromExchangeSymbol){
		this.fromExchangeSymbol = fromExchangeSymbol;
	}
	/**
	* 倍数
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmountMultiple(){
		return amountMultiple;
	}
	/**
	* 倍数
	*/
	public void setAmountMultiple(java.math.BigDecimal amountMultiple){
		this.amountMultiple = amountMultiple;
	}
	/**
	* 状态 0-停止 1-启动
	* @return Boolean
    */
	public Boolean getStatus(){
		return status;
	}
	/**
	* 状态 0-停止 1-启动
	*/
	public void setStatus(Boolean status){
		this.status = status;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getCreateTime(){
		return createTime;
	}
	/**
	* 
	*/
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	/**
	* 
	* @return Long
    */
	public Long getSequence(){
		return sequence;
	}
	/**
	* 
	*/
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}
	/**
	* 版本号
	* @return Long
    */
	public Long getVersion(){
		return version;
	}
	/**
	* 版本号
	*/
	public void setVersion(Long version){
		this.version = version;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("symbol:").append(getSymbol()).append(";");
		sb.append("fromExchangeId:").append(getFromExchangeId()).append(";");
		sb.append("fromExchangeSymbol:").append(getFromExchangeSymbol()).append(";");
		sb.append("amountMultiple:").append(getAmountMultiple()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		return sb.toString();
	}
}
