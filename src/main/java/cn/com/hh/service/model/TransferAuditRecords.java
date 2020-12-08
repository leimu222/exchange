package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [transfer服务实现]
 */
public class TransferAuditRecords  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 互转审核记录表id
     */
	private Long id;
	/**
     * 会员id
     */
	private Long memberId;
	/**
     * 币币账户id
     */
	private Long memberWalletId;
	/**
     * 法币账户id
     */
	private Long otcWalletId;
	/**
     * 合约账户id
     */
	private Long contractWalletId;
	/**
     * 资金变动类型
     */
	private Integer type;
	/**
     * 资金变动类型文本描述 
     */
	private String typeDesc;
	/**
     * 划转类型 0-币币转法币 1-法币转币币 2-币币转合约 3-合约转币币
     */
	private Integer transferType;
	/**
     * 划转金额
     */
	private java.math.BigDecimal amount;
	/**
     * 划转币种
     */
	private String symbol;
	/**
     * 状态 0-待审核 1-已通过 2-未通过
     */
	private Integer status;
	/**
     * 操作时间戳
     */
	private Long sequence;
	
	// setter and getter
	/**
	* 互转审核记录表id
	* @return Long
    */
	public Long getId(){
		return id;
	}
	/**
	* 互转审核记录表id
	*/
	public void setId(Long id){
		this.id = id;
	}
	/**
	* 会员id
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 会员id
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 币币账户id
	* @return Long
    */
	public Long getMemberWalletId(){
		return memberWalletId;
	}
	/**
	* 币币账户id
	*/
	public void setMemberWalletId(Long memberWalletId){
		this.memberWalletId = memberWalletId;
	}
	/**
	* 法币账户id
	* @return Long
    */
	public Long getOtcWalletId(){
		return otcWalletId;
	}
	/**
	* 法币账户id
	*/
	public void setOtcWalletId(Long otcWalletId){
		this.otcWalletId = otcWalletId;
	}
	/**
	* 合约账户id
	* @return Long
    */
	public Long getContractWalletId(){
		return contractWalletId;
	}
	/**
	* 合约账户id
	*/
	public void setContractWalletId(Long contractWalletId){
		this.contractWalletId = contractWalletId;
	}
	/**
	* 资金变动类型
	* @return Integer
    */
	public Integer getType(){
		return type;
	}
	/**
	* 资金变动类型
	*/
	public void setType(Integer type){
		this.type = type;
	}
	/**
	* 资金变动类型文本描述 
	* @return String
    */
	public String getTypeDesc(){
		return typeDesc;
	}
	/**
	* 资金变动类型文本描述 
	*/
	public void setTypeDesc(String typeDesc){
		this.typeDesc = typeDesc;
	}
	/**
	* 划转类型 0-币币转法币 1-法币转币币 2-币币转合约 3-合约转币币
	* @return Integer
    */
	public Integer getTransferType(){
		return transferType;
	}
	/**
	* 划转类型 0-币币转法币 1-法币转币币 2-币币转合约 3-合约转币币
	*/
	public void setTransferType(Integer transferType){
		this.transferType = transferType;
	}
	/**
	* 划转金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 划转金额
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 划转币种
	* @return String
    */
	public String getSymbol(){
		return symbol;
	}
	/**
	* 划转币种
	*/
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	/**
	* 状态 0-待审核 1-已通过 2-未通过
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 状态 0-待审核 1-已通过 2-未通过
	*/
	public void setStatus(Integer status){
		this.status = status;
	}
	/**
	* 操作时间戳
	* @return Long
    */
	public Long getSequence(){
		return sequence;
	}
	/**
	* 操作时间戳
	*/
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("memberWalletId:").append(getMemberWalletId()).append(";");
		sb.append("otcWalletId:").append(getOtcWalletId()).append(";");
		sb.append("contractWalletId:").append(getContractWalletId()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("typeDesc:").append(getTypeDesc()).append(";");
		sb.append("transferType:").append(getTransferType()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("symbol:").append(getSymbol()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
