package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [coin服务实现]
 */
public class CoinIssued  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 币种简称
     */
	private String name;
	/**
     * 发行人地址。关联member表mobile_phone字段即可
     */
	private String address;
	/**
     * 币种名称
     */
	private String fullName;
	/**
     * 发行价格（USDT）
     */
	private java.math.BigDecimal issuePrice;
	/**
     * 发行总量
     */
	private java.math.BigDecimal totalIssuance;
	/**
     * 发行周期（单位：月）
     */
	private Integer issuanceCycle;
	/**
     * 发行方
     */
	private String issuer;
	/**
     * 官方网站
     */
	private String officialWebsite;
	/**
     * 白皮书链接
     */
	private String whitePaperLink;
	/**
     * 联系方式
     */
	private String contractInformation;
	/**
     * 发行宣言
     */
	private String releaseDeclaration;
	/**
     * 挖矿最小持币数量
     */
	private java.math.BigDecimal minHoldBalance;
	/**
     * 审核状态 0-待审核 1-审核通过 2-审核不通过
     */
	private Boolean status;
	/**
     * 审核结果描述
     */
	private String auditRemark;
	/**
     * 审核时间
     */
	private java.util.Date auditTime;
	/**
     * 申请时间
     */
	private java.util.Date createTime;
	/**
     * 创世发行状态 0-等待创世 1-创世中 2-创世成功 3-创世失败
     */
	private Boolean genesisStatus;
	/**
     * 创世发行量
     */
	private java.math.BigDecimal genesisCirculation;
	/**
     * 打新数量（用于BHT平台打新额度）
     */
	private java.math.BigDecimal makeNewAmount;
	/**
     * 挖矿方案
     */
	private String miningPlan;
	/**
     * 当前进度
     */
	private Integer creationCurrentProgress;
	/**
     * 需要达成进度
     */
	private Integer creationTotalProgress;
	
	// setter and getter
	/**
	* 币种简称
	* @return String
    */
	public String getName(){
		return name;
	}
	/**
	* 币种简称
	*/
	public void setName(String name){
		this.name = name;
	}
	/**
	* 发行人地址。关联member表mobile_phone字段即可
	* @return String
    */
	public String getAddress(){
		return address;
	}
	/**
	* 发行人地址。关联member表mobile_phone字段即可
	*/
	public void setAddress(String address){
		this.address = address;
	}
	/**
	* 币种名称
	* @return String
    */
	public String getFullName(){
		return fullName;
	}
	/**
	* 币种名称
	*/
	public void setFullName(String fullName){
		this.fullName = fullName;
	}
	/**
	* 发行价格（USDT）
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getIssuePrice(){
		return issuePrice;
	}
	/**
	* 发行价格（USDT）
	*/
	public void setIssuePrice(java.math.BigDecimal issuePrice){
		this.issuePrice = issuePrice;
	}
	/**
	* 发行总量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTotalIssuance(){
		return totalIssuance;
	}
	/**
	* 发行总量
	*/
	public void setTotalIssuance(java.math.BigDecimal totalIssuance){
		this.totalIssuance = totalIssuance;
	}
	/**
	* 发行周期（单位：月）
	* @return Integer
    */
	public Integer getIssuanceCycle(){
		return issuanceCycle;
	}
	/**
	* 发行周期（单位：月）
	*/
	public void setIssuanceCycle(Integer issuanceCycle){
		this.issuanceCycle = issuanceCycle;
	}
	/**
	* 发行方
	* @return String
    */
	public String getIssuer(){
		return issuer;
	}
	/**
	* 发行方
	*/
	public void setIssuer(String issuer){
		this.issuer = issuer;
	}
	/**
	* 官方网站
	* @return String
    */
	public String getOfficialWebsite(){
		return officialWebsite;
	}
	/**
	* 官方网站
	*/
	public void setOfficialWebsite(String officialWebsite){
		this.officialWebsite = officialWebsite;
	}
	/**
	* 白皮书链接
	* @return String
    */
	public String getWhitePaperLink(){
		return whitePaperLink;
	}
	/**
	* 白皮书链接
	*/
	public void setWhitePaperLink(String whitePaperLink){
		this.whitePaperLink = whitePaperLink;
	}
	/**
	* 联系方式
	* @return String
    */
	public String getContractInformation(){
		return contractInformation;
	}
	/**
	* 联系方式
	*/
	public void setContractInformation(String contractInformation){
		this.contractInformation = contractInformation;
	}
	/**
	* 发行宣言
	* @return String
    */
	public String getReleaseDeclaration(){
		return releaseDeclaration;
	}
	/**
	* 发行宣言
	*/
	public void setReleaseDeclaration(String releaseDeclaration){
		this.releaseDeclaration = releaseDeclaration;
	}
	/**
	* 挖矿最小持币数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMinHoldBalance(){
		return minHoldBalance;
	}
	/**
	* 挖矿最小持币数量
	*/
	public void setMinHoldBalance(java.math.BigDecimal minHoldBalance){
		this.minHoldBalance = minHoldBalance;
	}
	/**
	* 审核状态 0-待审核 1-审核通过 2-审核不通过
	* @return Boolean
    */
	public Boolean getStatus(){
		return status;
	}
	/**
	* 审核状态 0-待审核 1-审核通过 2-审核不通过
	*/
	public void setStatus(Boolean status){
		this.status = status;
	}
	/**
	* 审核结果描述
	* @return String
    */
	public String getAuditRemark(){
		return auditRemark;
	}
	/**
	* 审核结果描述
	*/
	public void setAuditRemark(String auditRemark){
		this.auditRemark = auditRemark;
	}
	/**
	* 审核时间
	* @return java.util.Date
    */
	public java.util.Date getAuditTime(){
		return auditTime;
	}
	/**
	* 审核时间
	*/
	public void setAuditTime(java.util.Date auditTime){
		this.auditTime = auditTime;
	}
	/**
	* 申请时间
	* @return java.util.Date
    */
	public java.util.Date getCreateTime(){
		return createTime;
	}
	/**
	* 申请时间
	*/
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	/**
	* 创世发行状态 0-等待创世 1-创世中 2-创世成功 3-创世失败
	* @return Boolean
    */
	public Boolean getGenesisStatus(){
		return genesisStatus;
	}
	/**
	* 创世发行状态 0-等待创世 1-创世中 2-创世成功 3-创世失败
	*/
	public void setGenesisStatus(Boolean genesisStatus){
		this.genesisStatus = genesisStatus;
	}
	/**
	* 创世发行量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getGenesisCirculation(){
		return genesisCirculation;
	}
	/**
	* 创世发行量
	*/
	public void setGenesisCirculation(java.math.BigDecimal genesisCirculation){
		this.genesisCirculation = genesisCirculation;
	}
	/**
	* 打新数量（用于BHT平台打新额度）
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMakeNewAmount(){
		return makeNewAmount;
	}
	/**
	* 打新数量（用于BHT平台打新额度）
	*/
	public void setMakeNewAmount(java.math.BigDecimal makeNewAmount){
		this.makeNewAmount = makeNewAmount;
	}
	/**
	* 挖矿方案
	* @return String
    */
	public String getMiningPlan(){
		return miningPlan;
	}
	/**
	* 挖矿方案
	*/
	public void setMiningPlan(String miningPlan){
		this.miningPlan = miningPlan;
	}
	/**
	* 当前进度
	* @return Integer
    */
	public Integer getCreationCurrentProgress(){
		return creationCurrentProgress;
	}
	/**
	* 当前进度
	*/
	public void setCreationCurrentProgress(Integer creationCurrentProgress){
		this.creationCurrentProgress = creationCurrentProgress;
	}
	/**
	* 需要达成进度
	* @return Integer
    */
	public Integer getCreationTotalProgress(){
		return creationTotalProgress;
	}
	/**
	* 需要达成进度
	*/
	public void setCreationTotalProgress(Integer creationTotalProgress){
		this.creationTotalProgress = creationTotalProgress;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name:").append(getName()).append(";");
		sb.append("address:").append(getAddress()).append(";");
		sb.append("fullName:").append(getFullName()).append(";");
		sb.append("issuePrice:").append(getIssuePrice()).append(";");
		sb.append("totalIssuance:").append(getTotalIssuance()).append(";");
		sb.append("issuanceCycle:").append(getIssuanceCycle()).append(";");
		sb.append("issuer:").append(getIssuer()).append(";");
		sb.append("officialWebsite:").append(getOfficialWebsite()).append(";");
		sb.append("whitePaperLink:").append(getWhitePaperLink()).append(";");
		sb.append("contractInformation:").append(getContractInformation()).append(";");
		sb.append("releaseDeclaration:").append(getReleaseDeclaration()).append(";");
		sb.append("minHoldBalance:").append(getMinHoldBalance()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("auditRemark:").append(getAuditRemark()).append(";");
		sb.append("auditTime:").append(getAuditTime()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("genesisStatus:").append(getGenesisStatus()).append(";");
		sb.append("genesisCirculation:").append(getGenesisCirculation()).append(";");
		sb.append("makeNewAmount:").append(getMakeNewAmount()).append(";");
		sb.append("miningPlan:").append(getMiningPlan()).append(";");
		sb.append("creationCurrentProgress:").append(getCreationCurrentProgress()).append(";");
		sb.append("creationTotalProgress:").append(getCreationTotalProgress()).append(";");
		return sb.toString();
	}
}
