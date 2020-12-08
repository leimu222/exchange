package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [otc服务实现]
 */
public class OtcOrder  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private Long advertiseId;
	/**
     * 
     */
	private Integer advertiseType;
	/**
     * 
     */
	private String aliNo;
	/**
     * 
     */
	private String qrCodeUrl;
	/**
     * 
     */
	private String bank;
	/**
     * 
     */
	private String branch;
	/**
     * 
     */
	private String cardNo;
	/**
     * 
     */
	private java.util.Date cancelTime;
	/**
     * 手续费
     */
	private java.math.BigDecimal commission;
	/**
     * 
     */
	private String country;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private Long customerId;
	/**
     * 
     */
	private String customerName;
	/**
     * 
     */
	private String customerRealName;
	/**
     * 最高交易额
     */
	private java.math.BigDecimal maxLimit;
	/**
     * 
     */
	private Long memberId;
	/**
     * 
     */
	private String memberName;
	/**
     * 
     */
	private String memberRealName;
	/**
     * 最低交易额
     */
	private java.math.BigDecimal minLimit;
	/**
     * 交易金额
     */
	private java.math.BigDecimal money;
	/**
     * 交易数量
     */
	private java.math.BigDecimal number;
	/**
     * 
     */
	private String orderSn;
	/**
     * 
     */
	private String payMode;
	/**
     * 
     */
	private java.util.Date payTime;
	/**
     * 价格
     */
	private java.math.BigDecimal price;
	/**
     * 付款参考号
     */
	private String referenceNumber;
	/**
     * 
     */
	private java.util.Date releaseTime;
	/**
     * 
     */
	private String remark;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private Integer timeLimit;
	/**
     * 
     */
	private Long version;
	/**
     * 
     */
	private String qrWeCodeUrl;
	/**
     * 
     */
	private String wechat;
	/**
     * 
     */
	private Long coinId;
	/**
     * 是否是平台订单，0不是，1是
     */
	private Integer platType;
	/**
     * 支付url
     */
	private String payUrl;
	/**
     * 银行卡所属国家
     */
	private String bankCountry;
	/**
     * 银行卡所属国家英文名
     */
	private String bankCountryEn;
	/**
     * 银行代码
     */
	private String bankCode;
	/**
     * 所在代理银行账号
     */
	private String bankProxyCode;
	/**
     * 银行地址
     */
	private String bankAddress;
	/**
     * 收款人手机号
     */
	private String payeeMobile;
	/**
     * 收款人地址
     */
	private String payeeAddress;
	/**
     * 付款备注
     */
	private String payRemark;
	/**
     * 收款人姓名
     */
	private String payeeName;
	
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
	* @return Long
    */
	public Long getAdvertiseId(){
		return advertiseId;
	}
	/**
	* 
	*/
	public void setAdvertiseId(Long advertiseId){
		this.advertiseId = advertiseId;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getAdvertiseType(){
		return advertiseType;
	}
	/**
	* 
	*/
	public void setAdvertiseType(Integer advertiseType){
		this.advertiseType = advertiseType;
	}
	/**
	* 
	* @return String
    */
	public String getAliNo(){
		return aliNo;
	}
	/**
	* 
	*/
	public void setAliNo(String aliNo){
		this.aliNo = aliNo;
	}
	/**
	* 
	* @return String
    */
	public String getQrCodeUrl(){
		return qrCodeUrl;
	}
	/**
	* 
	*/
	public void setQrCodeUrl(String qrCodeUrl){
		this.qrCodeUrl = qrCodeUrl;
	}
	/**
	* 
	* @return String
    */
	public String getBank(){
		return bank;
	}
	/**
	* 
	*/
	public void setBank(String bank){
		this.bank = bank;
	}
	/**
	* 
	* @return String
    */
	public String getBranch(){
		return branch;
	}
	/**
	* 
	*/
	public void setBranch(String branch){
		this.branch = branch;
	}
	/**
	* 
	* @return String
    */
	public String getCardNo(){
		return cardNo;
	}
	/**
	* 
	*/
	public void setCardNo(String cardNo){
		this.cardNo = cardNo;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getCancelTime(){
		return cancelTime;
	}
	/**
	* 
	*/
	public void setCancelTime(java.util.Date cancelTime){
		this.cancelTime = cancelTime;
	}
	/**
	* 手续费
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getCommission(){
		return commission;
	}
	/**
	* 手续费
	*/
	public void setCommission(java.math.BigDecimal commission){
		this.commission = commission;
	}
	/**
	* 
	* @return String
    */
	public String getCountry(){
		return country;
	}
	/**
	* 
	*/
	public void setCountry(String country){
		this.country = country;
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
	public Long getCustomerId(){
		return customerId;
	}
	/**
	* 
	*/
	public void setCustomerId(Long customerId){
		this.customerId = customerId;
	}
	/**
	* 
	* @return String
    */
	public String getCustomerName(){
		return customerName;
	}
	/**
	* 
	*/
	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}
	/**
	* 
	* @return String
    */
	public String getCustomerRealName(){
		return customerRealName;
	}
	/**
	* 
	*/
	public void setCustomerRealName(String customerRealName){
		this.customerRealName = customerRealName;
	}
	/**
	* 最高交易额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMaxLimit(){
		return maxLimit;
	}
	/**
	* 最高交易额
	*/
	public void setMaxLimit(java.math.BigDecimal maxLimit){
		this.maxLimit = maxLimit;
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
	* @return String
    */
	public String getMemberName(){
		return memberName;
	}
	/**
	* 
	*/
	public void setMemberName(String memberName){
		this.memberName = memberName;
	}
	/**
	* 
	* @return String
    */
	public String getMemberRealName(){
		return memberRealName;
	}
	/**
	* 
	*/
	public void setMemberRealName(String memberRealName){
		this.memberRealName = memberRealName;
	}
	/**
	* 最低交易额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMinLimit(){
		return minLimit;
	}
	/**
	* 最低交易额
	*/
	public void setMinLimit(java.math.BigDecimal minLimit){
		this.minLimit = minLimit;
	}
	/**
	* 交易金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMoney(){
		return money;
	}
	/**
	* 交易金额
	*/
	public void setMoney(java.math.BigDecimal money){
		this.money = money;
	}
	/**
	* 交易数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getNumber(){
		return number;
	}
	/**
	* 交易数量
	*/
	public void setNumber(java.math.BigDecimal number){
		this.number = number;
	}
	/**
	* 
	* @return String
    */
	public String getOrderSn(){
		return orderSn;
	}
	/**
	* 
	*/
	public void setOrderSn(String orderSn){
		this.orderSn = orderSn;
	}
	/**
	* 
	* @return String
    */
	public String getPayMode(){
		return payMode;
	}
	/**
	* 
	*/
	public void setPayMode(String payMode){
		this.payMode = payMode;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getPayTime(){
		return payTime;
	}
	/**
	* 
	*/
	public void setPayTime(java.util.Date payTime){
		this.payTime = payTime;
	}
	/**
	* 价格
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPrice(){
		return price;
	}
	/**
	* 价格
	*/
	public void setPrice(java.math.BigDecimal price){
		this.price = price;
	}
	/**
	* 付款参考号
	* @return String
    */
	public String getReferenceNumber(){
		return referenceNumber;
	}
	/**
	* 付款参考号
	*/
	public void setReferenceNumber(String referenceNumber){
		this.referenceNumber = referenceNumber;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getReleaseTime(){
		return releaseTime;
	}
	/**
	* 
	*/
	public void setReleaseTime(java.util.Date releaseTime){
		this.releaseTime = releaseTime;
	}
	/**
	* 
	* @return String
    */
	public String getRemark(){
		return remark;
	}
	/**
	* 
	*/
	public void setRemark(String remark){
		this.remark = remark;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 
	*/
	public void setStatus(Integer status){
		this.status = status;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getTimeLimit(){
		return timeLimit;
	}
	/**
	* 
	*/
	public void setTimeLimit(Integer timeLimit){
		this.timeLimit = timeLimit;
	}
	/**
	* 
	* @return Long
    */
	public Long getVersion(){
		return version;
	}
	/**
	* 
	*/
	public void setVersion(Long version){
		this.version = version;
	}
	/**
	* 
	* @return String
    */
	public String getQrWeCodeUrl(){
		return qrWeCodeUrl;
	}
	/**
	* 
	*/
	public void setQrWeCodeUrl(String qrWeCodeUrl){
		this.qrWeCodeUrl = qrWeCodeUrl;
	}
	/**
	* 
	* @return String
    */
	public String getWechat(){
		return wechat;
	}
	/**
	* 
	*/
	public void setWechat(String wechat){
		this.wechat = wechat;
	}
	/**
	* 
	* @return Long
    */
	public Long getCoinId(){
		return coinId;
	}
	/**
	* 
	*/
	public void setCoinId(Long coinId){
		this.coinId = coinId;
	}
	/**
	* 是否是平台订单，0不是，1是
	* @return Integer
    */
	public Integer getPlatType(){
		return platType;
	}
	/**
	* 是否是平台订单，0不是，1是
	*/
	public void setPlatType(Integer platType){
		this.platType = platType;
	}
	/**
	* 支付url
	* @return String
    */
	public String getPayUrl(){
		return payUrl;
	}
	/**
	* 支付url
	*/
	public void setPayUrl(String payUrl){
		this.payUrl = payUrl;
	}
	/**
	* 银行卡所属国家
	* @return String
    */
	public String getBankCountry(){
		return bankCountry;
	}
	/**
	* 银行卡所属国家
	*/
	public void setBankCountry(String bankCountry){
		this.bankCountry = bankCountry;
	}
	/**
	* 银行卡所属国家英文名
	* @return String
    */
	public String getBankCountryEn(){
		return bankCountryEn;
	}
	/**
	* 银行卡所属国家英文名
	*/
	public void setBankCountryEn(String bankCountryEn){
		this.bankCountryEn = bankCountryEn;
	}
	/**
	* 银行代码
	* @return String
    */
	public String getBankCode(){
		return bankCode;
	}
	/**
	* 银行代码
	*/
	public void setBankCode(String bankCode){
		this.bankCode = bankCode;
	}
	/**
	* 所在代理银行账号
	* @return String
    */
	public String getBankProxyCode(){
		return bankProxyCode;
	}
	/**
	* 所在代理银行账号
	*/
	public void setBankProxyCode(String bankProxyCode){
		this.bankProxyCode = bankProxyCode;
	}
	/**
	* 银行地址
	* @return String
    */
	public String getBankAddress(){
		return bankAddress;
	}
	/**
	* 银行地址
	*/
	public void setBankAddress(String bankAddress){
		this.bankAddress = bankAddress;
	}
	/**
	* 收款人手机号
	* @return String
    */
	public String getPayeeMobile(){
		return payeeMobile;
	}
	/**
	* 收款人手机号
	*/
	public void setPayeeMobile(String payeeMobile){
		this.payeeMobile = payeeMobile;
	}
	/**
	* 收款人地址
	* @return String
    */
	public String getPayeeAddress(){
		return payeeAddress;
	}
	/**
	* 收款人地址
	*/
	public void setPayeeAddress(String payeeAddress){
		this.payeeAddress = payeeAddress;
	}
	/**
	* 付款备注
	* @return String
    */
	public String getPayRemark(){
		return payRemark;
	}
	/**
	* 付款备注
	*/
	public void setPayRemark(String payRemark){
		this.payRemark = payRemark;
	}
	/**
	* 收款人姓名
	* @return String
    */
	public String getPayeeName(){
		return payeeName;
	}
	/**
	* 收款人姓名
	*/
	public void setPayeeName(String payeeName){
		this.payeeName = payeeName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("advertiseId:").append(getAdvertiseId()).append(";");
		sb.append("advertiseType:").append(getAdvertiseType()).append(";");
		sb.append("aliNo:").append(getAliNo()).append(";");
		sb.append("qrCodeUrl:").append(getQrCodeUrl()).append(";");
		sb.append("bank:").append(getBank()).append(";");
		sb.append("branch:").append(getBranch()).append(";");
		sb.append("cardNo:").append(getCardNo()).append(";");
		sb.append("cancelTime:").append(getCancelTime()).append(";");
		sb.append("commission:").append(getCommission()).append(";");
		sb.append("country:").append(getCountry()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("customerId:").append(getCustomerId()).append(";");
		sb.append("customerName:").append(getCustomerName()).append(";");
		sb.append("customerRealName:").append(getCustomerRealName()).append(";");
		sb.append("maxLimit:").append(getMaxLimit()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("memberName:").append(getMemberName()).append(";");
		sb.append("memberRealName:").append(getMemberRealName()).append(";");
		sb.append("minLimit:").append(getMinLimit()).append(";");
		sb.append("money:").append(getMoney()).append(";");
		sb.append("number:").append(getNumber()).append(";");
		sb.append("orderSn:").append(getOrderSn()).append(";");
		sb.append("payMode:").append(getPayMode()).append(";");
		sb.append("payTime:").append(getPayTime()).append(";");
		sb.append("price:").append(getPrice()).append(";");
		sb.append("referenceNumber:").append(getReferenceNumber()).append(";");
		sb.append("releaseTime:").append(getReleaseTime()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("timeLimit:").append(getTimeLimit()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		sb.append("qrWeCodeUrl:").append(getQrWeCodeUrl()).append(";");
		sb.append("wechat:").append(getWechat()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("platType:").append(getPlatType()).append(";");
		sb.append("payUrl:").append(getPayUrl()).append(";");
		sb.append("bankCountry:").append(getBankCountry()).append(";");
		sb.append("bankCountryEn:").append(getBankCountryEn()).append(";");
		sb.append("bankCode:").append(getBankCode()).append(";");
		sb.append("bankProxyCode:").append(getBankProxyCode()).append(";");
		sb.append("bankAddress:").append(getBankAddress()).append(";");
		sb.append("payeeMobile:").append(getPayeeMobile()).append(";");
		sb.append("payeeAddress:").append(getPayeeAddress()).append(";");
		sb.append("payRemark:").append(getPayRemark()).append(";");
		sb.append("payeeName:").append(getPayeeName()).append(";");
		return sb.toString();
	}
}
