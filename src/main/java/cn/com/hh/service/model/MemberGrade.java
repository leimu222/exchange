package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberGrade  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String gradeName;
	/**
     * 
     */
	private String gradeCode;
	/**
     * 提币数量
     */
	private java.math.BigDecimal withdrawCoinAmount;
	/**
     * 
     */
	private Integer dayWithdrawCount;
	/**
     * 
     */
	private Integer gradeBound;
	/**
     * 
     */
	private java.math.BigDecimal exchangeFeeRate;
	/**
     * 直推人数
     */
	private Long directNumber;
	/**
     * 伞下人数
     */
	private Long teamNumber;
	/**
     * 返佣比例
     */
	private java.math.BigDecimal commissionRate;
	/**
     * 定投数量（USDT）
     */
	private java.math.BigDecimal fixInvestAmount;
	/**
     * 一代奖金比例
     */
	private java.math.BigDecimal oneGenerationRate;
	/**
     * 二代奖金比例
     */
	private java.math.BigDecimal twoGenerationRate;
	/**
     * 三代奖金比例
     */
	private java.math.BigDecimal threeGenerationRate;
	/**
     * 四代奖金比例
     */
	private java.math.BigDecimal fourGenerationRate;
	/**
     * 五代奖金比例
     */
	private java.math.BigDecimal fiveGenerationRate;
	/**
     * 六代奖金比例
     */
	private java.math.BigDecimal sixGenerationRate;
	/**
     * 七代奖金比例
     */
	private java.math.BigDecimal sevenGenerationRate;
	/**
     * 八代奖金比例
     */
	private java.math.BigDecimal eightGenerationRate;
	/**
     * 九代奖金比例
     */
	private java.math.BigDecimal nineGenerationRate;
	/**
     * 十代奖金比例
     */
	private java.math.BigDecimal tenGenerationRate;
	/**
     * 团队投资额
     */
	private java.math.BigDecimal teamInvestAmount;
	/**
     * 手续费返佣比例
     */
	private java.math.BigDecimal feeCommissionRate;
	/**
     * 升级时伞下同级数量要求
     */
	private Integer peersNeed;
	
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
	public String getGradeName(){
		return gradeName;
	}
	/**
	* 
	*/
	public void setGradeName(String gradeName){
		this.gradeName = gradeName;
	}
	/**
	* 
	* @return String
    */
	public String getGradeCode(){
		return gradeCode;
	}
	/**
	* 
	*/
	public void setGradeCode(String gradeCode){
		this.gradeCode = gradeCode;
	}
	/**
	* 提币数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getWithdrawCoinAmount(){
		return withdrawCoinAmount;
	}
	/**
	* 提币数量
	*/
	public void setWithdrawCoinAmount(java.math.BigDecimal withdrawCoinAmount){
		this.withdrawCoinAmount = withdrawCoinAmount;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getDayWithdrawCount(){
		return dayWithdrawCount;
	}
	/**
	* 
	*/
	public void setDayWithdrawCount(Integer dayWithdrawCount){
		this.dayWithdrawCount = dayWithdrawCount;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getGradeBound(){
		return gradeBound;
	}
	/**
	* 
	*/
	public void setGradeBound(Integer gradeBound){
		this.gradeBound = gradeBound;
	}
	/**
	* 
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getExchangeFeeRate(){
		return exchangeFeeRate;
	}
	/**
	* 
	*/
	public void setExchangeFeeRate(java.math.BigDecimal exchangeFeeRate){
		this.exchangeFeeRate = exchangeFeeRate;
	}
	/**
	* 直推人数
	* @return Long
    */
	public Long getDirectNumber(){
		return directNumber;
	}
	/**
	* 直推人数
	*/
	public void setDirectNumber(Long directNumber){
		this.directNumber = directNumber;
	}
	/**
	* 伞下人数
	* @return Long
    */
	public Long getTeamNumber(){
		return teamNumber;
	}
	/**
	* 伞下人数
	*/
	public void setTeamNumber(Long teamNumber){
		this.teamNumber = teamNumber;
	}
	/**
	* 返佣比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getCommissionRate(){
		return commissionRate;
	}
	/**
	* 返佣比例
	*/
	public void setCommissionRate(java.math.BigDecimal commissionRate){
		this.commissionRate = commissionRate;
	}
	/**
	* 定投数量（USDT）
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFixInvestAmount(){
		return fixInvestAmount;
	}
	/**
	* 定投数量（USDT）
	*/
	public void setFixInvestAmount(java.math.BigDecimal fixInvestAmount){
		this.fixInvestAmount = fixInvestAmount;
	}
	/**
	* 一代奖金比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getOneGenerationRate(){
		return oneGenerationRate;
	}
	/**
	* 一代奖金比例
	*/
	public void setOneGenerationRate(java.math.BigDecimal oneGenerationRate){
		this.oneGenerationRate = oneGenerationRate;
	}
	/**
	* 二代奖金比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTwoGenerationRate(){
		return twoGenerationRate;
	}
	/**
	* 二代奖金比例
	*/
	public void setTwoGenerationRate(java.math.BigDecimal twoGenerationRate){
		this.twoGenerationRate = twoGenerationRate;
	}
	/**
	* 三代奖金比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getThreeGenerationRate(){
		return threeGenerationRate;
	}
	/**
	* 三代奖金比例
	*/
	public void setThreeGenerationRate(java.math.BigDecimal threeGenerationRate){
		this.threeGenerationRate = threeGenerationRate;
	}
	/**
	* 四代奖金比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFourGenerationRate(){
		return fourGenerationRate;
	}
	/**
	* 四代奖金比例
	*/
	public void setFourGenerationRate(java.math.BigDecimal fourGenerationRate){
		this.fourGenerationRate = fourGenerationRate;
	}
	/**
	* 五代奖金比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFiveGenerationRate(){
		return fiveGenerationRate;
	}
	/**
	* 五代奖金比例
	*/
	public void setFiveGenerationRate(java.math.BigDecimal fiveGenerationRate){
		this.fiveGenerationRate = fiveGenerationRate;
	}
	/**
	* 六代奖金比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getSixGenerationRate(){
		return sixGenerationRate;
	}
	/**
	* 六代奖金比例
	*/
	public void setSixGenerationRate(java.math.BigDecimal sixGenerationRate){
		this.sixGenerationRate = sixGenerationRate;
	}
	/**
	* 七代奖金比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getSevenGenerationRate(){
		return sevenGenerationRate;
	}
	/**
	* 七代奖金比例
	*/
	public void setSevenGenerationRate(java.math.BigDecimal sevenGenerationRate){
		this.sevenGenerationRate = sevenGenerationRate;
	}
	/**
	* 八代奖金比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getEightGenerationRate(){
		return eightGenerationRate;
	}
	/**
	* 八代奖金比例
	*/
	public void setEightGenerationRate(java.math.BigDecimal eightGenerationRate){
		this.eightGenerationRate = eightGenerationRate;
	}
	/**
	* 九代奖金比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getNineGenerationRate(){
		return nineGenerationRate;
	}
	/**
	* 九代奖金比例
	*/
	public void setNineGenerationRate(java.math.BigDecimal nineGenerationRate){
		this.nineGenerationRate = nineGenerationRate;
	}
	/**
	* 十代奖金比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTenGenerationRate(){
		return tenGenerationRate;
	}
	/**
	* 十代奖金比例
	*/
	public void setTenGenerationRate(java.math.BigDecimal tenGenerationRate){
		this.tenGenerationRate = tenGenerationRate;
	}
	/**
	* 团队投资额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTeamInvestAmount(){
		return teamInvestAmount;
	}
	/**
	* 团队投资额
	*/
	public void setTeamInvestAmount(java.math.BigDecimal teamInvestAmount){
		this.teamInvestAmount = teamInvestAmount;
	}
	/**
	* 手续费返佣比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFeeCommissionRate(){
		return feeCommissionRate;
	}
	/**
	* 手续费返佣比例
	*/
	public void setFeeCommissionRate(java.math.BigDecimal feeCommissionRate){
		this.feeCommissionRate = feeCommissionRate;
	}
	/**
	* 升级时伞下同级数量要求
	* @return Integer
    */
	public Integer getPeersNeed(){
		return peersNeed;
	}
	/**
	* 升级时伞下同级数量要求
	*/
	public void setPeersNeed(Integer peersNeed){
		this.peersNeed = peersNeed;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("gradeName:").append(getGradeName()).append(";");
		sb.append("gradeCode:").append(getGradeCode()).append(";");
		sb.append("withdrawCoinAmount:").append(getWithdrawCoinAmount()).append(";");
		sb.append("dayWithdrawCount:").append(getDayWithdrawCount()).append(";");
		sb.append("gradeBound:").append(getGradeBound()).append(";");
		sb.append("exchangeFeeRate:").append(getExchangeFeeRate()).append(";");
		sb.append("directNumber:").append(getDirectNumber()).append(";");
		sb.append("teamNumber:").append(getTeamNumber()).append(";");
		sb.append("commissionRate:").append(getCommissionRate()).append(";");
		sb.append("fixInvestAmount:").append(getFixInvestAmount()).append(";");
		sb.append("oneGenerationRate:").append(getOneGenerationRate()).append(";");
		sb.append("twoGenerationRate:").append(getTwoGenerationRate()).append(";");
		sb.append("threeGenerationRate:").append(getThreeGenerationRate()).append(";");
		sb.append("fourGenerationRate:").append(getFourGenerationRate()).append(";");
		sb.append("fiveGenerationRate:").append(getFiveGenerationRate()).append(";");
		sb.append("sixGenerationRate:").append(getSixGenerationRate()).append(";");
		sb.append("sevenGenerationRate:").append(getSevenGenerationRate()).append(";");
		sb.append("eightGenerationRate:").append(getEightGenerationRate()).append(";");
		sb.append("nineGenerationRate:").append(getNineGenerationRate()).append(";");
		sb.append("tenGenerationRate:").append(getTenGenerationRate()).append(";");
		sb.append("teamInvestAmount:").append(getTeamInvestAmount()).append(";");
		sb.append("feeCommissionRate:").append(getFeeCommissionRate()).append(";");
		sb.append("peersNeed:").append(getPeersNeed()).append(";");
		return sb.toString();
	}
}
