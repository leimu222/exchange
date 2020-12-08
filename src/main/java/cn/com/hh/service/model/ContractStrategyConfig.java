package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public class ContractStrategyConfig  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 来源交易所
     */
	private Long fromExchangeId;
	/**
     * 公钥
     */
	private String apiKey;
	/**
     * 私钥
     */
	private String secretKey;
	/**
     * api过期时间
     */
	private java.util.Date expireDate;
	/**
     * 备注信息
     */
	private String remark;
	/**
     * 关联后台节点用户id
     */
	private Long adminId;
	/**
     * 关联前端会员编码
     */
	private Long memberId;
	/**
     * 价格上浮率 ，买跌（卖出开空）价格起点
     */
	private java.math.BigDecimal priceRiseRate;
	/**
     * 价格下浮率，买涨（买入开多）价格起点
     */
	private java.math.BigDecimal priceFallRate;
	/**
     * 交易对
     */
	private String symbol;
	/**
     * 状态 0-开启 1-关闭
     */
	private Boolean status;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
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
	* 来源交易所
	* @return Long
    */
	public Long getFromExchangeId(){
		return fromExchangeId;
	}
	/**
	* 来源交易所
	*/
	public void setFromExchangeId(Long fromExchangeId){
		this.fromExchangeId = fromExchangeId;
	}
	/**
	* 公钥
	* @return String
    */
	public String getApiKey(){
		return apiKey;
	}
	/**
	* 公钥
	*/
	public void setApiKey(String apiKey){
		this.apiKey = apiKey;
	}
	/**
	* 私钥
	* @return String
    */
	public String getSecretKey(){
		return secretKey;
	}
	/**
	* 私钥
	*/
	public void setSecretKey(String secretKey){
		this.secretKey = secretKey;
	}
	/**
	* api过期时间
	* @return java.util.Date
    */
	public java.util.Date getExpireDate(){
		return expireDate;
	}
	/**
	* api过期时间
	*/
	public void setExpireDate(java.util.Date expireDate){
		this.expireDate = expireDate;
	}
	/**
	* 备注信息
	* @return String
    */
	public String getRemark(){
		return remark;
	}
	/**
	* 备注信息
	*/
	public void setRemark(String remark){
		this.remark = remark;
	}
	/**
	* 关联后台节点用户id
	* @return Long
    */
	public Long getAdminId(){
		return adminId;
	}
	/**
	* 关联后台节点用户id
	*/
	public void setAdminId(Long adminId){
		this.adminId = adminId;
	}
	/**
	* 关联前端会员编码
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 关联前端会员编码
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 价格上浮率 ，买跌（卖出开空）价格起点
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPriceRiseRate(){
		return priceRiseRate;
	}
	/**
	* 价格上浮率 ，买跌（卖出开空）价格起点
	*/
	public void setPriceRiseRate(java.math.BigDecimal priceRiseRate){
		this.priceRiseRate = priceRiseRate;
	}
	/**
	* 价格下浮率，买涨（买入开多）价格起点
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPriceFallRate(){
		return priceFallRate;
	}
	/**
	* 价格下浮率，买涨（买入开多）价格起点
	*/
	public void setPriceFallRate(java.math.BigDecimal priceFallRate){
		this.priceFallRate = priceFallRate;
	}
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
	* 状态 0-开启 1-关闭
	* @return Boolean
    */
	public Boolean getStatus(){
		return status;
	}
	/**
	* 状态 0-开启 1-关闭
	*/
	public void setStatus(Boolean status){
		this.status = status;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("fromExchangeId:").append(getFromExchangeId()).append(";");
		sb.append("apiKey:").append(getApiKey()).append(";");
		sb.append("secretKey:").append(getSecretKey()).append(";");
		sb.append("expireDate:").append(getExpireDate()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("adminId:").append(getAdminId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("priceRiseRate:").append(getPriceRiseRate()).append(";");
		sb.append("priceFallRate:").append(getPriceFallRate()).append(";");
		sb.append("symbol:").append(getSymbol()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		return sb.toString();
	}
}
