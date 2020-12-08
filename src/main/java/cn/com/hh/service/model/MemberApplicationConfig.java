package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public class MemberApplicationConfig  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private Integer promotionOn;
	/**
     * 
     */
	private Integer rechargeCoinOn;
	/**
     * 
     */
	private Integer transactionOn;
	/**
     * 
     */
	private Integer withdrawCoinOn;
	
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
	* @return Integer
    */
	public Integer getPromotionOn(){
		return promotionOn;
	}
	/**
	* 
	*/
	public void setPromotionOn(Integer promotionOn){
		this.promotionOn = promotionOn;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getRechargeCoinOn(){
		return rechargeCoinOn;
	}
	/**
	* 
	*/
	public void setRechargeCoinOn(Integer rechargeCoinOn){
		this.rechargeCoinOn = rechargeCoinOn;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getTransactionOn(){
		return transactionOn;
	}
	/**
	* 
	*/
	public void setTransactionOn(Integer transactionOn){
		this.transactionOn = transactionOn;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getWithdrawCoinOn(){
		return withdrawCoinOn;
	}
	/**
	* 
	*/
	public void setWithdrawCoinOn(Integer withdrawCoinOn){
		this.withdrawCoinOn = withdrawCoinOn;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("promotionOn:").append(getPromotionOn()).append(";");
		sb.append("rechargeCoinOn:").append(getRechargeCoinOn()).append(";");
		sb.append("transactionOn:").append(getTransactionOn()).append(";");
		sb.append("withdrawCoinOn:").append(getWithdrawCoinOn()).append(";");
		return sb.toString();
	}
}
