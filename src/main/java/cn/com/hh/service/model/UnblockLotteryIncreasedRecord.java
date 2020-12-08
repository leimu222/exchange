package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public class UnblockLotteryIncreasedRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 增加原因 0 交易满10轮增加 1 后台手动增加 2购买
     */
	private Integer lotteryAddType;
	/**
     * 
     */
	private Long memberId;
	/**
     * 
     */
	private java.util.Date updateTime;
	/**
     * 增加之前次数
     */
	private Long beforeCount;
	/**
     * 增加之后次数
     */
	private Long afterCount;
	/**
     * 增加次数
     */
	private Long addCount;
	/**
     * 
     */
	private Long time;
	
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
	* 增加原因 0 交易满10轮增加 1 后台手动增加 2购买
	* @return Integer
    */
	public Integer getLotteryAddType(){
		return lotteryAddType;
	}
	/**
	* 增加原因 0 交易满10轮增加 1 后台手动增加 2购买
	*/
	public void setLotteryAddType(Integer lotteryAddType){
		this.lotteryAddType = lotteryAddType;
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
	* @return java.util.Date
    */
	public java.util.Date getUpdateTime(){
		return updateTime;
	}
	/**
	* 
	*/
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}
	/**
	* 增加之前次数
	* @return Long
    */
	public Long getBeforeCount(){
		return beforeCount;
	}
	/**
	* 增加之前次数
	*/
	public void setBeforeCount(Long beforeCount){
		this.beforeCount = beforeCount;
	}
	/**
	* 增加之后次数
	* @return Long
    */
	public Long getAfterCount(){
		return afterCount;
	}
	/**
	* 增加之后次数
	*/
	public void setAfterCount(Long afterCount){
		this.afterCount = afterCount;
	}
	/**
	* 增加次数
	* @return Long
    */
	public Long getAddCount(){
		return addCount;
	}
	/**
	* 增加次数
	*/
	public void setAddCount(Long addCount){
		this.addCount = addCount;
	}
	/**
	* 
	* @return Long
    */
	public Long getTime(){
		return time;
	}
	/**
	* 
	*/
	public void setTime(Long time){
		this.time = time;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("lotteryAddType:").append(getLotteryAddType()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		sb.append("beforeCount:").append(getBeforeCount()).append(";");
		sb.append("afterCount:").append(getAfterCount()).append(";");
		sb.append("addCount:").append(getAddCount()).append(";");
		sb.append("time:").append(getTime()).append(";");
		return sb.toString();
	}
}
