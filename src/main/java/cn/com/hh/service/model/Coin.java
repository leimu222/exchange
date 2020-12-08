package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [coin服务实现]
 */
public class Coin  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private String name;
	/**
     * 
     */
	private Integer canAutoWithdraw;
	/**
     * 
     */
	private Integer canRecharge;
	/**
     * 
     */
	private Integer canTransfer;
	/**
     * 
     */
	private Integer canWithdraw;
	/**
     * 人民币汇率
     */
	private java.math.BigDecimal cnyRate;
	/**
     * 
     */
	private String coldWalletAddress;
	/**
     * 
     */
	private Integer enableRpc;
	/**
     * 
     */
	private Boolean hasLegal;
	/**
     * 是否为平台币
     */
	private Integer isPlatformCoin;
	/**
     * 主充值地址
     */
	private String masterAddress;
	/**
     * 单日最大提币量
     */
	private java.math.BigDecimal maxDailyWithdrawRate;
	/**
     * 
     */
	private Double maxTxFee;
	/**
     * 最大提币数量
     */
	private java.math.BigDecimal maxWithdrawAmount;
	/**
     * 最小充币数量
     */
	private java.math.BigDecimal minRechargeAmount;
	/**
     * 
     */
	private Double minTxFee;
	/**
     * 最小提币数量
     */
	private java.math.BigDecimal minWithdrawAmount;
	/**
     * 矿工费
     */
	private java.math.BigDecimal minerFee;
	/**
     * 
     */
	private String nameCn;
	/**
     * 美元汇率
     */
	private java.math.BigDecimal sgdRate;
	/**
     * 
     */
	private Integer sort;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private String unit;
	/**
     * 美元汇率
     */
	private java.math.BigDecimal usdRate;
	/**
     * 提币精度
     */
	private Integer withdrawScale;
	/**
     * 自动提现阈值
     */
	private java.math.BigDecimal withdrawThreshold;
	/**
     * 币种图标
     */
	private String img;
	/**
     * 合约地址，针对erc20的币
     */
	private String contractAddress;
	/**
     * 0未知，1BTC，2ETH
     */
	private Integer chainType;
	/**
     * 是否使用地址池地址，0不使用，1使用
     */
	private Integer enablePool;
	/**
     * 币种所属区域  0-主区 1-解封区
     */
	private Boolean coinArea;
	/**
     * 币种日发行量
     */
	private java.math.BigDecimal dayIssuedAmount;
	/**
     * 挖矿最小持币数量
     */
	private java.math.BigDecimal minHoldBalance;
	/**
     * 
     */
	private String capitalPoolAddress;
	/**
     * 
     */
	private String capitalPoolPrivateKey;
	
	// setter and getter
	/**
	* 
	* @return String
    */
	public String getName(){
		return name;
	}
	/**
	* 
	*/
	public void setName(String name){
		this.name = name;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getCanAutoWithdraw(){
		return canAutoWithdraw;
	}
	/**
	* 
	*/
	public void setCanAutoWithdraw(Integer canAutoWithdraw){
		this.canAutoWithdraw = canAutoWithdraw;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getCanRecharge(){
		return canRecharge;
	}
	/**
	* 
	*/
	public void setCanRecharge(Integer canRecharge){
		this.canRecharge = canRecharge;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getCanTransfer(){
		return canTransfer;
	}
	/**
	* 
	*/
	public void setCanTransfer(Integer canTransfer){
		this.canTransfer = canTransfer;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getCanWithdraw(){
		return canWithdraw;
	}
	/**
	* 
	*/
	public void setCanWithdraw(Integer canWithdraw){
		this.canWithdraw = canWithdraw;
	}
	/**
	* 人民币汇率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getCnyRate(){
		return cnyRate;
	}
	/**
	* 人民币汇率
	*/
	public void setCnyRate(java.math.BigDecimal cnyRate){
		this.cnyRate = cnyRate;
	}
	/**
	* 
	* @return String
    */
	public String getColdWalletAddress(){
		return coldWalletAddress;
	}
	/**
	* 
	*/
	public void setColdWalletAddress(String coldWalletAddress){
		this.coldWalletAddress = coldWalletAddress;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getEnableRpc(){
		return enableRpc;
	}
	/**
	* 
	*/
	public void setEnableRpc(Integer enableRpc){
		this.enableRpc = enableRpc;
	}
	/**
	* 
	* @return Boolean
    */
	public Boolean getHasLegal(){
		return hasLegal;
	}
	/**
	* 
	*/
	public void setHasLegal(Boolean hasLegal){
		this.hasLegal = hasLegal;
	}
	/**
	* 是否为平台币
	* @return Integer
    */
	public Integer getIsPlatformCoin(){
		return isPlatformCoin;
	}
	/**
	* 是否为平台币
	*/
	public void setIsPlatformCoin(Integer isPlatformCoin){
		this.isPlatformCoin = isPlatformCoin;
	}
	/**
	* 主充值地址
	* @return String
    */
	public String getMasterAddress(){
		return masterAddress;
	}
	/**
	* 主充值地址
	*/
	public void setMasterAddress(String masterAddress){
		this.masterAddress = masterAddress;
	}
	/**
	* 单日最大提币量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMaxDailyWithdrawRate(){
		return maxDailyWithdrawRate;
	}
	/**
	* 单日最大提币量
	*/
	public void setMaxDailyWithdrawRate(java.math.BigDecimal maxDailyWithdrawRate){
		this.maxDailyWithdrawRate = maxDailyWithdrawRate;
	}
	/**
	* 
	* @return Double
    */
	public Double getMaxTxFee(){
		return maxTxFee;
	}
	/**
	* 
	*/
	public void setMaxTxFee(Double maxTxFee){
		this.maxTxFee = maxTxFee;
	}
	/**
	* 最大提币数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMaxWithdrawAmount(){
		return maxWithdrawAmount;
	}
	/**
	* 最大提币数量
	*/
	public void setMaxWithdrawAmount(java.math.BigDecimal maxWithdrawAmount){
		this.maxWithdrawAmount = maxWithdrawAmount;
	}
	/**
	* 最小充币数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMinRechargeAmount(){
		return minRechargeAmount;
	}
	/**
	* 最小充币数量
	*/
	public void setMinRechargeAmount(java.math.BigDecimal minRechargeAmount){
		this.minRechargeAmount = minRechargeAmount;
	}
	/**
	* 
	* @return Double
    */
	public Double getMinTxFee(){
		return minTxFee;
	}
	/**
	* 
	*/
	public void setMinTxFee(Double minTxFee){
		this.minTxFee = minTxFee;
	}
	/**
	* 最小提币数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMinWithdrawAmount(){
		return minWithdrawAmount;
	}
	/**
	* 最小提币数量
	*/
	public void setMinWithdrawAmount(java.math.BigDecimal minWithdrawAmount){
		this.minWithdrawAmount = minWithdrawAmount;
	}
	/**
	* 矿工费
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMinerFee(){
		return minerFee;
	}
	/**
	* 矿工费
	*/
	public void setMinerFee(java.math.BigDecimal minerFee){
		this.minerFee = minerFee;
	}
	/**
	* 
	* @return String
    */
	public String getNameCn(){
		return nameCn;
	}
	/**
	* 
	*/
	public void setNameCn(String nameCn){
		this.nameCn = nameCn;
	}
	/**
	* 美元汇率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getSgdRate(){
		return sgdRate;
	}
	/**
	* 美元汇率
	*/
	public void setSgdRate(java.math.BigDecimal sgdRate){
		this.sgdRate = sgdRate;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getSort(){
		return sort;
	}
	/**
	* 
	*/
	public void setSort(Integer sort){
		this.sort = sort;
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
	* @return String
    */
	public String getUnit(){
		return unit;
	}
	/**
	* 
	*/
	public void setUnit(String unit){
		this.unit = unit;
	}
	/**
	* 美元汇率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getUsdRate(){
		return usdRate;
	}
	/**
	* 美元汇率
	*/
	public void setUsdRate(java.math.BigDecimal usdRate){
		this.usdRate = usdRate;
	}
	/**
	* 提币精度
	* @return Integer
    */
	public Integer getWithdrawScale(){
		return withdrawScale;
	}
	/**
	* 提币精度
	*/
	public void setWithdrawScale(Integer withdrawScale){
		this.withdrawScale = withdrawScale;
	}
	/**
	* 自动提现阈值
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getWithdrawThreshold(){
		return withdrawThreshold;
	}
	/**
	* 自动提现阈值
	*/
	public void setWithdrawThreshold(java.math.BigDecimal withdrawThreshold){
		this.withdrawThreshold = withdrawThreshold;
	}
	/**
	* 币种图标
	* @return String
    */
	public String getImg(){
		return img;
	}
	/**
	* 币种图标
	*/
	public void setImg(String img){
		this.img = img;
	}
	/**
	* 合约地址，针对erc20的币
	* @return String
    */
	public String getContractAddress(){
		return contractAddress;
	}
	/**
	* 合约地址，针对erc20的币
	*/
	public void setContractAddress(String contractAddress){
		this.contractAddress = contractAddress;
	}
	/**
	* 0未知，1BTC，2ETH
	* @return Integer
    */
	public Integer getChainType(){
		return chainType;
	}
	/**
	* 0未知，1BTC，2ETH
	*/
	public void setChainType(Integer chainType){
		this.chainType = chainType;
	}
	/**
	* 是否使用地址池地址，0不使用，1使用
	* @return Integer
    */
	public Integer getEnablePool(){
		return enablePool;
	}
	/**
	* 是否使用地址池地址，0不使用，1使用
	*/
	public void setEnablePool(Integer enablePool){
		this.enablePool = enablePool;
	}
	/**
	* 币种所属区域  0-主区 1-解封区
	* @return Boolean
    */
	public Boolean getCoinArea(){
		return coinArea;
	}
	/**
	* 币种所属区域  0-主区 1-解封区
	*/
	public void setCoinArea(Boolean coinArea){
		this.coinArea = coinArea;
	}
	/**
	* 币种日发行量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDayIssuedAmount(){
		return dayIssuedAmount;
	}
	/**
	* 币种日发行量
	*/
	public void setDayIssuedAmount(java.math.BigDecimal dayIssuedAmount){
		this.dayIssuedAmount = dayIssuedAmount;
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
	* 
	* @return String
    */
	public String getCapitalPoolAddress(){
		return capitalPoolAddress;
	}
	/**
	* 
	*/
	public void setCapitalPoolAddress(String capitalPoolAddress){
		this.capitalPoolAddress = capitalPoolAddress;
	}
	/**
	* 
	* @return String
    */
	public String getCapitalPoolPrivateKey(){
		return capitalPoolPrivateKey;
	}
	/**
	* 
	*/
	public void setCapitalPoolPrivateKey(String capitalPoolPrivateKey){
		this.capitalPoolPrivateKey = capitalPoolPrivateKey;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name:").append(getName()).append(";");
		sb.append("canAutoWithdraw:").append(getCanAutoWithdraw()).append(";");
		sb.append("canRecharge:").append(getCanRecharge()).append(";");
		sb.append("canTransfer:").append(getCanTransfer()).append(";");
		sb.append("canWithdraw:").append(getCanWithdraw()).append(";");
		sb.append("cnyRate:").append(getCnyRate()).append(";");
		sb.append("coldWalletAddress:").append(getColdWalletAddress()).append(";");
		sb.append("enableRpc:").append(getEnableRpc()).append(";");
		sb.append("hasLegal:").append(getHasLegal()).append(";");
		sb.append("isPlatformCoin:").append(getIsPlatformCoin()).append(";");
		sb.append("masterAddress:").append(getMasterAddress()).append(";");
		sb.append("maxDailyWithdrawRate:").append(getMaxDailyWithdrawRate()).append(";");
		sb.append("maxTxFee:").append(getMaxTxFee()).append(";");
		sb.append("maxWithdrawAmount:").append(getMaxWithdrawAmount()).append(";");
		sb.append("minRechargeAmount:").append(getMinRechargeAmount()).append(";");
		sb.append("minTxFee:").append(getMinTxFee()).append(";");
		sb.append("minWithdrawAmount:").append(getMinWithdrawAmount()).append(";");
		sb.append("minerFee:").append(getMinerFee()).append(";");
		sb.append("nameCn:").append(getNameCn()).append(";");
		sb.append("sgdRate:").append(getSgdRate()).append(";");
		sb.append("sort:").append(getSort()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("unit:").append(getUnit()).append(";");
		sb.append("usdRate:").append(getUsdRate()).append(";");
		sb.append("withdrawScale:").append(getWithdrawScale()).append(";");
		sb.append("withdrawThreshold:").append(getWithdrawThreshold()).append(";");
		sb.append("img:").append(getImg()).append(";");
		sb.append("contractAddress:").append(getContractAddress()).append(";");
		sb.append("chainType:").append(getChainType()).append(";");
		sb.append("enablePool:").append(getEnablePool()).append(";");
		sb.append("coinArea:").append(getCoinArea()).append(";");
		sb.append("dayIssuedAmount:").append(getDayIssuedAmount()).append(";");
		sb.append("minHoldBalance:").append(getMinHoldBalance()).append(";");
		sb.append("capitalPoolAddress:").append(getCapitalPoolAddress()).append(";");
		sb.append("capitalPoolPrivateKey:").append(getCapitalPoolPrivateKey()).append(";");
		return sb.toString();
	}
}
