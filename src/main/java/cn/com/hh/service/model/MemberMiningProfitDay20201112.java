package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberMiningProfitDay20201112  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 会员编码
     */
	private Long memberId;
	/**
     * 币种
     */
	private String coin;
	/**
     * 持币数量
     */
	private java.math.BigDecimal holdBalance;
	/**
     * 持币收益
     */
	private java.math.BigDecimal holdProfit;
	/**
     * 推广收益
     */
	private java.math.BigDecimal promotionProfit;
	/**
     * 持币算力
     */
	private java.math.BigDecimal holdComputingPower;
	/**
     * 推广算力
     */
	private java.math.BigDecimal promotionComputingPower;
	/**
     * 日释放总量，
     */
	private java.math.BigDecimal dayReleaseAmount;
	/**
     * 持币释放比例
     */
	private java.math.BigDecimal holdReleaseRate;
	/**
     * 推广释放比例
     */
	private java.math.BigDecimal promotionReleaseRate;
	/**
     * 持币排序
     */
	private Integer holdSort;
	/**
     * 持币收益率 （持币收益/持币数量）
     */
	private java.math.BigDecimal holdRate;
	/**
     * 是否是最佳持币 0-否 1-是
     */
	private Boolean ifBestHold;
	/**
     * 
     */
	private java.util.Date createTime;
	
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
	* 会员编码
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 会员编码
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 币种
	* @return String
    */
	public String getCoin(){
		return coin;
	}
	/**
	* 币种
	*/
	public void setCoin(String coin){
		this.coin = coin;
	}
	/**
	* 持币数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getHoldBalance(){
		return holdBalance;
	}
	/**
	* 持币数量
	*/
	public void setHoldBalance(java.math.BigDecimal holdBalance){
		this.holdBalance = holdBalance;
	}
	/**
	* 持币收益
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getHoldProfit(){
		return holdProfit;
	}
	/**
	* 持币收益
	*/
	public void setHoldProfit(java.math.BigDecimal holdProfit){
		this.holdProfit = holdProfit;
	}
	/**
	* 推广收益
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPromotionProfit(){
		return promotionProfit;
	}
	/**
	* 推广收益
	*/
	public void setPromotionProfit(java.math.BigDecimal promotionProfit){
		this.promotionProfit = promotionProfit;
	}
	/**
	* 持币算力
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getHoldComputingPower(){
		return holdComputingPower;
	}
	/**
	* 持币算力
	*/
	public void setHoldComputingPower(java.math.BigDecimal holdComputingPower){
		this.holdComputingPower = holdComputingPower;
	}
	/**
	* 推广算力
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPromotionComputingPower(){
		return promotionComputingPower;
	}
	/**
	* 推广算力
	*/
	public void setPromotionComputingPower(java.math.BigDecimal promotionComputingPower){
		this.promotionComputingPower = promotionComputingPower;
	}
	/**
	* 日释放总量，
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDayReleaseAmount(){
		return dayReleaseAmount;
	}
	/**
	* 日释放总量，
	*/
	public void setDayReleaseAmount(java.math.BigDecimal dayReleaseAmount){
		this.dayReleaseAmount = dayReleaseAmount;
	}
	/**
	* 持币释放比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getHoldReleaseRate(){
		return holdReleaseRate;
	}
	/**
	* 持币释放比例
	*/
	public void setHoldReleaseRate(java.math.BigDecimal holdReleaseRate){
		this.holdReleaseRate = holdReleaseRate;
	}
	/**
	* 推广释放比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPromotionReleaseRate(){
		return promotionReleaseRate;
	}
	/**
	* 推广释放比例
	*/
	public void setPromotionReleaseRate(java.math.BigDecimal promotionReleaseRate){
		this.promotionReleaseRate = promotionReleaseRate;
	}
	/**
	* 持币排序
	* @return Integer
    */
	public Integer getHoldSort(){
		return holdSort;
	}
	/**
	* 持币排序
	*/
	public void setHoldSort(Integer holdSort){
		this.holdSort = holdSort;
	}
	/**
	* 持币收益率 （持币收益/持币数量）
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getHoldRate(){
		return holdRate;
	}
	/**
	* 持币收益率 （持币收益/持币数量）
	*/
	public void setHoldRate(java.math.BigDecimal holdRate){
		this.holdRate = holdRate;
	}
	/**
	* 是否是最佳持币 0-否 1-是
	* @return Boolean
    */
	public Boolean getIfBestHold(){
		return ifBestHold;
	}
	/**
	* 是否是最佳持币 0-否 1-是
	*/
	public void setIfBestHold(Boolean ifBestHold){
		this.ifBestHold = ifBestHold;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("coin:").append(getCoin()).append(";");
		sb.append("holdBalance:").append(getHoldBalance()).append(";");
		sb.append("holdProfit:").append(getHoldProfit()).append(";");
		sb.append("promotionProfit:").append(getPromotionProfit()).append(";");
		sb.append("holdComputingPower:").append(getHoldComputingPower()).append(";");
		sb.append("promotionComputingPower:").append(getPromotionComputingPower()).append(";");
		sb.append("dayReleaseAmount:").append(getDayReleaseAmount()).append(";");
		sb.append("holdReleaseRate:").append(getHoldReleaseRate()).append(";");
		sb.append("promotionReleaseRate:").append(getPromotionReleaseRate()).append(";");
		sb.append("holdSort:").append(getHoldSort()).append(";");
		sb.append("holdRate:").append(getHoldRate()).append(";");
		sb.append("ifBestHold:").append(getIfBestHold()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		return sb.toString();
	}
}
