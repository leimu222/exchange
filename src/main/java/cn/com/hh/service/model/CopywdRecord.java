package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [copywd服务实现]
 */
public class CopywdRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String address;
	/**
     * 预计到账数量
     */
	private java.math.BigDecimal arrivedAmount;
	/**
     * 
     */
	private Integer canAutoWithdraw;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private java.util.Date dealTime;
	/**
     * 手续费
     */
	private java.math.BigDecimal fee;
	/**
     * 
     */
	private Integer isAuto;
	/**
     * 
     */
	private Long memberId;
	/**
     * 
     */
	private String remark;
	/**
     * 
     */
	private Integer status;
	/**
     * 申请总数量
     */
	private java.math.BigDecimal totalAmount;
	/**
     * 
     */
	private String transactionNumber;
	/**
     * 
     */
	private Long adminId;
	/**
     * 
     */
	private String coinId;
	/**
     * 0未提现，1提现成功，2提现异常
     */
	private Integer withdrawType;
	/**
     * 
     */
	private String txHash;
	/**
     * 
     */
	private Long recordId;
	
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
	public String getAddress(){
		return address;
	}
	/**
	* 
	*/
	public void setAddress(String address){
		this.address = address;
	}
	/**
	* 预计到账数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getArrivedAmount(){
		return arrivedAmount;
	}
	/**
	* 预计到账数量
	*/
	public void setArrivedAmount(java.math.BigDecimal arrivedAmount){
		this.arrivedAmount = arrivedAmount;
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
	* @return java.util.Date
    */
	public java.util.Date getDealTime(){
		return dealTime;
	}
	/**
	* 
	*/
	public void setDealTime(java.util.Date dealTime){
		this.dealTime = dealTime;
	}
	/**
	* 手续费
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFee(){
		return fee;
	}
	/**
	* 手续费
	*/
	public void setFee(java.math.BigDecimal fee){
		this.fee = fee;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getIsAuto(){
		return isAuto;
	}
	/**
	* 
	*/
	public void setIsAuto(Integer isAuto){
		this.isAuto = isAuto;
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
	* 申请总数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTotalAmount(){
		return totalAmount;
	}
	/**
	* 申请总数量
	*/
	public void setTotalAmount(java.math.BigDecimal totalAmount){
		this.totalAmount = totalAmount;
	}
	/**
	* 
	* @return String
    */
	public String getTransactionNumber(){
		return transactionNumber;
	}
	/**
	* 
	*/
	public void setTransactionNumber(String transactionNumber){
		this.transactionNumber = transactionNumber;
	}
	/**
	* 
	* @return Long
    */
	public Long getAdminId(){
		return adminId;
	}
	/**
	* 
	*/
	public void setAdminId(Long adminId){
		this.adminId = adminId;
	}
	/**
	* 
	* @return String
    */
	public String getCoinId(){
		return coinId;
	}
	/**
	* 
	*/
	public void setCoinId(String coinId){
		this.coinId = coinId;
	}
	/**
	* 0未提现，1提现成功，2提现异常
	* @return Integer
    */
	public Integer getWithdrawType(){
		return withdrawType;
	}
	/**
	* 0未提现，1提现成功，2提现异常
	*/
	public void setWithdrawType(Integer withdrawType){
		this.withdrawType = withdrawType;
	}
	/**
	* 
	* @return String
    */
	public String getTxHash(){
		return txHash;
	}
	/**
	* 
	*/
	public void setTxHash(String txHash){
		this.txHash = txHash;
	}
	/**
	* 
	* @return Long
    */
	public Long getRecordId(){
		return recordId;
	}
	/**
	* 
	*/
	public void setRecordId(Long recordId){
		this.recordId = recordId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("address:").append(getAddress()).append(";");
		sb.append("arrivedAmount:").append(getArrivedAmount()).append(";");
		sb.append("canAutoWithdraw:").append(getCanAutoWithdraw()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("dealTime:").append(getDealTime()).append(";");
		sb.append("fee:").append(getFee()).append(";");
		sb.append("isAuto:").append(getIsAuto()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("totalAmount:").append(getTotalAmount()).append(";");
		sb.append("transactionNumber:").append(getTransactionNumber()).append(";");
		sb.append("adminId:").append(getAdminId()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("withdrawType:").append(getWithdrawType()).append(";");
		sb.append("txHash:").append(getTxHash()).append(";");
		sb.append("recordId:").append(getRecordId()).append(";");
		return sb.toString();
	}
}
