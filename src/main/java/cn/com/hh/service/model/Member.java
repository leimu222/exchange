package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public class Member  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
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
	private Integer appealSuccessTimes;
	/**
     * 
     */
	private Integer appealTimes;
	/**
     * 
     */
	private java.util.Date applicationTime;
	/**
     * 
     */
	private String avatar;
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
	private java.util.Date certifiedBusinessApplyTime;
	/**
     * 
     */
	private java.util.Date certifiedBusinessCheckTime;
	/**
     * 
     */
	private Integer certifiedBusinessStatus;
	/**
     * 
     */
	private Integer channelId;
	/**
     * 
     */
	private String email;
	/**
     * 
     */
	private Integer firstLevel;
	/**
     * 
     */
	private java.util.Date googleDate;
	/**
     * 
     */
	private String googleKey;
	/**
     * 
     */
	private Integer googleState;
	/**
     * 
     */
	private String idNumber;
	/**
     * 
     */
	private Long inviterId;
	/**
     * 
     */
	private Integer isChannel;
	/**
     * 
     */
	private String jyPassword;
	/**
     * 
     */
	private java.util.Date lastLoginTime;
	/**
     * 
     */
	private String city;
	/**
     * 
     */
	private String country;
	/**
     * 
     */
	private String district;
	/**
     * 
     */
	private String province;
	/**
     * 
     */
	private Integer loginCount;
	/**
     * 
     */
	private Integer loginLock;
	/**
     * 
     */
	private String margin;
	/**
     * 
     */
	private Integer memberLevel;
	/**
     * 
     */
	private String mobilePhone;
	/**
     * 
     */
	private String password;
	/**
     * 
     */
	private String promotionCode;
	/**
     * 
     */
	private Integer publishAdvertise;
	/**
     * 
     */
	private String realName;
	/**
     * 
     */
	private Integer realNameStatus;
	/**
     * 
     */
	private java.util.Date registrationTime;
	/**
     * 
     */
	private String salt;
	/**
     * 
     */
	private Integer secondLevel;
	/**
     * 
     */
	private Boolean signInAbility;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private Integer thirdLevel;
	/**
     * 
     */
	private String token;
	/**
     * Token 有效期、单位秒
     */
	private Integer tokenExpireSecond;
	/**
     * 
     */
	private java.util.Date tokenExpireTime;
	/**
     * 
     */
	private Integer transactionStatus;
	/**
     * 
     */
	private java.util.Date transactionTime;
	/**
     * 
     */
	private Integer transactions;
	/**
     * 
     */
	private String username;
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
	private String local;
	/**
     * 
     */
	private Long integration;
	/**
     * 等级id
     */
	private Long memberGradeId;
	/**
     * kyc等级
     */
	private Integer kycStatus;
	/**
     * 注册赠送积分
     */
	private Long generalizeTotal;
	/**
     * 
     */
	private Long inviterParentId;
	/**
     * 代理状态（1节点，2代理，3市场管理员，0普通用户）
     */
	private Integer ifNode;
	/**
     * 用户状态（0普通用户，1带单用户）
     */
	private Integer userType;
	/**
     * 是否是平台账号，0不是，1是
     */
	private Integer platType;
	/**
     * 节点id
     */
	private Long nodeId;
	/**
     * 银行卡所属国家
     */
	private String bankCountry;
	/**
     * 银行卡所属国家英文名
     */
	private String bankCountryEn;
	/**
     * epay支付账号
     */
	private String epayNo;
	/**
     * epay收款二维码
     */
	private String epayQrCodeUrl;
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
     * 汇款备注
     */
	private String payRemark;
	/**
     * 收款人姓名
     */
	private String payeeName;
	/**
     * 是否固定会员等级：0不固定，1固定
     */
	private Integer ifFixMemberGrade;
	/**
     * 绑定邀请码
     */
	private String bindPromotionCode;
	/**
     * 0-未激活 1-已激活
     */
	private Boolean activeState;
	/**
     * 设备ID
     */
	private String deviceId;
	/**
     * 矿池等级 id
     */
	private Long poolGradeId;
	/**
     * 节点等级
     */
	private Long nodeGradeId;
	/**
     * 
     */
	private Integer nodeType;
	
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
	* @return Integer
    */
	public Integer getAppealSuccessTimes(){
		return appealSuccessTimes;
	}
	/**
	* 
	*/
	public void setAppealSuccessTimes(Integer appealSuccessTimes){
		this.appealSuccessTimes = appealSuccessTimes;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getAppealTimes(){
		return appealTimes;
	}
	/**
	* 
	*/
	public void setAppealTimes(Integer appealTimes){
		this.appealTimes = appealTimes;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getApplicationTime(){
		return applicationTime;
	}
	/**
	* 
	*/
	public void setApplicationTime(java.util.Date applicationTime){
		this.applicationTime = applicationTime;
	}
	/**
	* 
	* @return String
    */
	public String getAvatar(){
		return avatar;
	}
	/**
	* 
	*/
	public void setAvatar(String avatar){
		this.avatar = avatar;
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
	public java.util.Date getCertifiedBusinessApplyTime(){
		return certifiedBusinessApplyTime;
	}
	/**
	* 
	*/
	public void setCertifiedBusinessApplyTime(java.util.Date certifiedBusinessApplyTime){
		this.certifiedBusinessApplyTime = certifiedBusinessApplyTime;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getCertifiedBusinessCheckTime(){
		return certifiedBusinessCheckTime;
	}
	/**
	* 
	*/
	public void setCertifiedBusinessCheckTime(java.util.Date certifiedBusinessCheckTime){
		this.certifiedBusinessCheckTime = certifiedBusinessCheckTime;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getCertifiedBusinessStatus(){
		return certifiedBusinessStatus;
	}
	/**
	* 
	*/
	public void setCertifiedBusinessStatus(Integer certifiedBusinessStatus){
		this.certifiedBusinessStatus = certifiedBusinessStatus;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getChannelId(){
		return channelId;
	}
	/**
	* 
	*/
	public void setChannelId(Integer channelId){
		this.channelId = channelId;
	}
	/**
	* 
	* @return String
    */
	public String getEmail(){
		return email;
	}
	/**
	* 
	*/
	public void setEmail(String email){
		this.email = email;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getFirstLevel(){
		return firstLevel;
	}
	/**
	* 
	*/
	public void setFirstLevel(Integer firstLevel){
		this.firstLevel = firstLevel;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getGoogleDate(){
		return googleDate;
	}
	/**
	* 
	*/
	public void setGoogleDate(java.util.Date googleDate){
		this.googleDate = googleDate;
	}
	/**
	* 
	* @return String
    */
	public String getGoogleKey(){
		return googleKey;
	}
	/**
	* 
	*/
	public void setGoogleKey(String googleKey){
		this.googleKey = googleKey;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getGoogleState(){
		return googleState;
	}
	/**
	* 
	*/
	public void setGoogleState(Integer googleState){
		this.googleState = googleState;
	}
	/**
	* 
	* @return String
    */
	public String getIdNumber(){
		return idNumber;
	}
	/**
	* 
	*/
	public void setIdNumber(String idNumber){
		this.idNumber = idNumber;
	}
	/**
	* 
	* @return Long
    */
	public Long getInviterId(){
		return inviterId;
	}
	/**
	* 
	*/
	public void setInviterId(Long inviterId){
		this.inviterId = inviterId;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getIsChannel(){
		return isChannel;
	}
	/**
	* 
	*/
	public void setIsChannel(Integer isChannel){
		this.isChannel = isChannel;
	}
	/**
	* 
	* @return String
    */
	public String getJyPassword(){
		return jyPassword;
	}
	/**
	* 
	*/
	public void setJyPassword(String jyPassword){
		this.jyPassword = jyPassword;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getLastLoginTime(){
		return lastLoginTime;
	}
	/**
	* 
	*/
	public void setLastLoginTime(java.util.Date lastLoginTime){
		this.lastLoginTime = lastLoginTime;
	}
	/**
	* 
	* @return String
    */
	public String getCity(){
		return city;
	}
	/**
	* 
	*/
	public void setCity(String city){
		this.city = city;
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
	* @return String
    */
	public String getDistrict(){
		return district;
	}
	/**
	* 
	*/
	public void setDistrict(String district){
		this.district = district;
	}
	/**
	* 
	* @return String
    */
	public String getProvince(){
		return province;
	}
	/**
	* 
	*/
	public void setProvince(String province){
		this.province = province;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getLoginCount(){
		return loginCount;
	}
	/**
	* 
	*/
	public void setLoginCount(Integer loginCount){
		this.loginCount = loginCount;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getLoginLock(){
		return loginLock;
	}
	/**
	* 
	*/
	public void setLoginLock(Integer loginLock){
		this.loginLock = loginLock;
	}
	/**
	* 
	* @return String
    */
	public String getMargin(){
		return margin;
	}
	/**
	* 
	*/
	public void setMargin(String margin){
		this.margin = margin;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getMemberLevel(){
		return memberLevel;
	}
	/**
	* 
	*/
	public void setMemberLevel(Integer memberLevel){
		this.memberLevel = memberLevel;
	}
	/**
	* 
	* @return String
    */
	public String getMobilePhone(){
		return mobilePhone;
	}
	/**
	* 
	*/
	public void setMobilePhone(String mobilePhone){
		this.mobilePhone = mobilePhone;
	}
	/**
	* 
	* @return String
    */
	public String getPassword(){
		return password;
	}
	/**
	* 
	*/
	public void setPassword(String password){
		this.password = password;
	}
	/**
	* 
	* @return String
    */
	public String getPromotionCode(){
		return promotionCode;
	}
	/**
	* 
	*/
	public void setPromotionCode(String promotionCode){
		this.promotionCode = promotionCode;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getPublishAdvertise(){
		return publishAdvertise;
	}
	/**
	* 
	*/
	public void setPublishAdvertise(Integer publishAdvertise){
		this.publishAdvertise = publishAdvertise;
	}
	/**
	* 
	* @return String
    */
	public String getRealName(){
		return realName;
	}
	/**
	* 
	*/
	public void setRealName(String realName){
		this.realName = realName;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getRealNameStatus(){
		return realNameStatus;
	}
	/**
	* 
	*/
	public void setRealNameStatus(Integer realNameStatus){
		this.realNameStatus = realNameStatus;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getRegistrationTime(){
		return registrationTime;
	}
	/**
	* 
	*/
	public void setRegistrationTime(java.util.Date registrationTime){
		this.registrationTime = registrationTime;
	}
	/**
	* 
	* @return String
    */
	public String getSalt(){
		return salt;
	}
	/**
	* 
	*/
	public void setSalt(String salt){
		this.salt = salt;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getSecondLevel(){
		return secondLevel;
	}
	/**
	* 
	*/
	public void setSecondLevel(Integer secondLevel){
		this.secondLevel = secondLevel;
	}
	/**
	* 
	* @return Boolean
    */
	public Boolean getSignInAbility(){
		return signInAbility;
	}
	/**
	* 
	*/
	public void setSignInAbility(Boolean signInAbility){
		this.signInAbility = signInAbility;
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
	public Integer getThirdLevel(){
		return thirdLevel;
	}
	/**
	* 
	*/
	public void setThirdLevel(Integer thirdLevel){
		this.thirdLevel = thirdLevel;
	}
	/**
	* 
	* @return String
    */
	public String getToken(){
		return token;
	}
	/**
	* 
	*/
	public void setToken(String token){
		this.token = token;
	}
	/**
	* Token 有效期、单位秒
	* @return Integer
    */
	public Integer getTokenExpireSecond(){
		return tokenExpireSecond;
	}
	/**
	* Token 有效期、单位秒
	*/
	public void setTokenExpireSecond(Integer tokenExpireSecond){
		this.tokenExpireSecond = tokenExpireSecond;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getTokenExpireTime(){
		return tokenExpireTime;
	}
	/**
	* 
	*/
	public void setTokenExpireTime(java.util.Date tokenExpireTime){
		this.tokenExpireTime = tokenExpireTime;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getTransactionStatus(){
		return transactionStatus;
	}
	/**
	* 
	*/
	public void setTransactionStatus(Integer transactionStatus){
		this.transactionStatus = transactionStatus;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getTransactionTime(){
		return transactionTime;
	}
	/**
	* 
	*/
	public void setTransactionTime(java.util.Date transactionTime){
		this.transactionTime = transactionTime;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getTransactions(){
		return transactions;
	}
	/**
	* 
	*/
	public void setTransactions(Integer transactions){
		this.transactions = transactions;
	}
	/**
	* 
	* @return String
    */
	public String getUsername(){
		return username;
	}
	/**
	* 
	*/
	public void setUsername(String username){
		this.username = username;
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
	* @return String
    */
	public String getLocal(){
		return local;
	}
	/**
	* 
	*/
	public void setLocal(String local){
		this.local = local;
	}
	/**
	* 
	* @return Long
    */
	public Long getIntegration(){
		return integration;
	}
	/**
	* 
	*/
	public void setIntegration(Long integration){
		this.integration = integration;
	}
	/**
	* 等级id
	* @return Long
    */
	public Long getMemberGradeId(){
		return memberGradeId;
	}
	/**
	* 等级id
	*/
	public void setMemberGradeId(Long memberGradeId){
		this.memberGradeId = memberGradeId;
	}
	/**
	* kyc等级
	* @return Integer
    */
	public Integer getKycStatus(){
		return kycStatus;
	}
	/**
	* kyc等级
	*/
	public void setKycStatus(Integer kycStatus){
		this.kycStatus = kycStatus;
	}
	/**
	* 注册赠送积分
	* @return Long
    */
	public Long getGeneralizeTotal(){
		return generalizeTotal;
	}
	/**
	* 注册赠送积分
	*/
	public void setGeneralizeTotal(Long generalizeTotal){
		this.generalizeTotal = generalizeTotal;
	}
	/**
	* 
	* @return Long
    */
	public Long getInviterParentId(){
		return inviterParentId;
	}
	/**
	* 
	*/
	public void setInviterParentId(Long inviterParentId){
		this.inviterParentId = inviterParentId;
	}
	/**
	* 代理状态（1节点，2代理，3市场管理员，0普通用户）
	* @return Integer
    */
	public Integer getIfNode(){
		return ifNode;
	}
	/**
	* 代理状态（1节点，2代理，3市场管理员，0普通用户）
	*/
	public void setIfNode(Integer ifNode){
		this.ifNode = ifNode;
	}
	/**
	* 用户状态（0普通用户，1带单用户）
	* @return Integer
    */
	public Integer getUserType(){
		return userType;
	}
	/**
	* 用户状态（0普通用户，1带单用户）
	*/
	public void setUserType(Integer userType){
		this.userType = userType;
	}
	/**
	* 是否是平台账号，0不是，1是
	* @return Integer
    */
	public Integer getPlatType(){
		return platType;
	}
	/**
	* 是否是平台账号，0不是，1是
	*/
	public void setPlatType(Integer platType){
		this.platType = platType;
	}
	/**
	* 节点id
	* @return Long
    */
	public Long getNodeId(){
		return nodeId;
	}
	/**
	* 节点id
	*/
	public void setNodeId(Long nodeId){
		this.nodeId = nodeId;
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
	* epay支付账号
	* @return String
    */
	public String getEpayNo(){
		return epayNo;
	}
	/**
	* epay支付账号
	*/
	public void setEpayNo(String epayNo){
		this.epayNo = epayNo;
	}
	/**
	* epay收款二维码
	* @return String
    */
	public String getEpayQrCodeUrl(){
		return epayQrCodeUrl;
	}
	/**
	* epay收款二维码
	*/
	public void setEpayQrCodeUrl(String epayQrCodeUrl){
		this.epayQrCodeUrl = epayQrCodeUrl;
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
	* 汇款备注
	* @return String
    */
	public String getPayRemark(){
		return payRemark;
	}
	/**
	* 汇款备注
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
	/**
	* 是否固定会员等级：0不固定，1固定
	* @return Integer
    */
	public Integer getIfFixMemberGrade(){
		return ifFixMemberGrade;
	}
	/**
	* 是否固定会员等级：0不固定，1固定
	*/
	public void setIfFixMemberGrade(Integer ifFixMemberGrade){
		this.ifFixMemberGrade = ifFixMemberGrade;
	}
	/**
	* 绑定邀请码
	* @return String
    */
	public String getBindPromotionCode(){
		return bindPromotionCode;
	}
	/**
	* 绑定邀请码
	*/
	public void setBindPromotionCode(String bindPromotionCode){
		this.bindPromotionCode = bindPromotionCode;
	}
	/**
	* 0-未激活 1-已激活
	* @return Boolean
    */
	public Boolean getActiveState(){
		return activeState;
	}
	/**
	* 0-未激活 1-已激活
	*/
	public void setActiveState(Boolean activeState){
		this.activeState = activeState;
	}
	/**
	* 设备ID
	* @return String
    */
	public String getDeviceId(){
		return deviceId;
	}
	/**
	* 设备ID
	*/
	public void setDeviceId(String deviceId){
		this.deviceId = deviceId;
	}
	/**
	* 矿池等级 id
	* @return Long
    */
	public Long getPoolGradeId(){
		return poolGradeId;
	}
	/**
	* 矿池等级 id
	*/
	public void setPoolGradeId(Long poolGradeId){
		this.poolGradeId = poolGradeId;
	}
	/**
	* 节点等级
	* @return Long
    */
	public Long getNodeGradeId(){
		return nodeGradeId;
	}
	/**
	* 节点等级
	*/
	public void setNodeGradeId(Long nodeGradeId){
		this.nodeGradeId = nodeGradeId;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getNodeType(){
		return nodeType;
	}
	/**
	* 
	*/
	public void setNodeType(Integer nodeType){
		this.nodeType = nodeType;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("aliNo:").append(getAliNo()).append(";");
		sb.append("qrCodeUrl:").append(getQrCodeUrl()).append(";");
		sb.append("appealSuccessTimes:").append(getAppealSuccessTimes()).append(";");
		sb.append("appealTimes:").append(getAppealTimes()).append(";");
		sb.append("applicationTime:").append(getApplicationTime()).append(";");
		sb.append("avatar:").append(getAvatar()).append(";");
		sb.append("bank:").append(getBank()).append(";");
		sb.append("branch:").append(getBranch()).append(";");
		sb.append("cardNo:").append(getCardNo()).append(";");
		sb.append("certifiedBusinessApplyTime:").append(getCertifiedBusinessApplyTime()).append(";");
		sb.append("certifiedBusinessCheckTime:").append(getCertifiedBusinessCheckTime()).append(";");
		sb.append("certifiedBusinessStatus:").append(getCertifiedBusinessStatus()).append(";");
		sb.append("channelId:").append(getChannelId()).append(";");
		sb.append("email:").append(getEmail()).append(";");
		sb.append("firstLevel:").append(getFirstLevel()).append(";");
		sb.append("googleDate:").append(getGoogleDate()).append(";");
		sb.append("googleKey:").append(getGoogleKey()).append(";");
		sb.append("googleState:").append(getGoogleState()).append(";");
		sb.append("idNumber:").append(getIdNumber()).append(";");
		sb.append("inviterId:").append(getInviterId()).append(";");
		sb.append("isChannel:").append(getIsChannel()).append(";");
		sb.append("jyPassword:").append(getJyPassword()).append(";");
		sb.append("lastLoginTime:").append(getLastLoginTime()).append(";");
		sb.append("city:").append(getCity()).append(";");
		sb.append("country:").append(getCountry()).append(";");
		sb.append("district:").append(getDistrict()).append(";");
		sb.append("province:").append(getProvince()).append(";");
		sb.append("loginCount:").append(getLoginCount()).append(";");
		sb.append("loginLock:").append(getLoginLock()).append(";");
		sb.append("margin:").append(getMargin()).append(";");
		sb.append("memberLevel:").append(getMemberLevel()).append(";");
		sb.append("mobilePhone:").append(getMobilePhone()).append(";");
		sb.append("password:").append(getPassword()).append(";");
		sb.append("promotionCode:").append(getPromotionCode()).append(";");
		sb.append("publishAdvertise:").append(getPublishAdvertise()).append(";");
		sb.append("realName:").append(getRealName()).append(";");
		sb.append("realNameStatus:").append(getRealNameStatus()).append(";");
		sb.append("registrationTime:").append(getRegistrationTime()).append(";");
		sb.append("salt:").append(getSalt()).append(";");
		sb.append("secondLevel:").append(getSecondLevel()).append(";");
		sb.append("signInAbility:").append(getSignInAbility()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("thirdLevel:").append(getThirdLevel()).append(";");
		sb.append("token:").append(getToken()).append(";");
		sb.append("tokenExpireSecond:").append(getTokenExpireSecond()).append(";");
		sb.append("tokenExpireTime:").append(getTokenExpireTime()).append(";");
		sb.append("transactionStatus:").append(getTransactionStatus()).append(";");
		sb.append("transactionTime:").append(getTransactionTime()).append(";");
		sb.append("transactions:").append(getTransactions()).append(";");
		sb.append("username:").append(getUsername()).append(";");
		sb.append("qrWeCodeUrl:").append(getQrWeCodeUrl()).append(";");
		sb.append("wechat:").append(getWechat()).append(";");
		sb.append("local:").append(getLocal()).append(";");
		sb.append("integration:").append(getIntegration()).append(";");
		sb.append("memberGradeId:").append(getMemberGradeId()).append(";");
		sb.append("kycStatus:").append(getKycStatus()).append(";");
		sb.append("generalizeTotal:").append(getGeneralizeTotal()).append(";");
		sb.append("inviterParentId:").append(getInviterParentId()).append(";");
		sb.append("ifNode:").append(getIfNode()).append(";");
		sb.append("userType:").append(getUserType()).append(";");
		sb.append("platType:").append(getPlatType()).append(";");
		sb.append("nodeId:").append(getNodeId()).append(";");
		sb.append("bankCountry:").append(getBankCountry()).append(";");
		sb.append("bankCountryEn:").append(getBankCountryEn()).append(";");
		sb.append("epayNo:").append(getEpayNo()).append(";");
		sb.append("epayQrCodeUrl:").append(getEpayQrCodeUrl()).append(";");
		sb.append("bankCode:").append(getBankCode()).append(";");
		sb.append("bankProxyCode:").append(getBankProxyCode()).append(";");
		sb.append("bankAddress:").append(getBankAddress()).append(";");
		sb.append("payeeMobile:").append(getPayeeMobile()).append(";");
		sb.append("payeeAddress:").append(getPayeeAddress()).append(";");
		sb.append("payRemark:").append(getPayRemark()).append(";");
		sb.append("payeeName:").append(getPayeeName()).append(";");
		sb.append("ifFixMemberGrade:").append(getIfFixMemberGrade()).append(";");
		sb.append("bindPromotionCode:").append(getBindPromotionCode()).append(";");
		sb.append("activeState:").append(getActiveState()).append(";");
		sb.append("deviceId:").append(getDeviceId()).append(";");
		sb.append("poolGradeId:").append(getPoolGradeId()).append(";");
		sb.append("nodeGradeId:").append(getNodeGradeId()).append(";");
		sb.append("nodeType:").append(getNodeType()).append(";");
		return sb.toString();
	}
}
