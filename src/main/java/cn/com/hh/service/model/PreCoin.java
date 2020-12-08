package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [pre服务实现]
 */
public class PreCoin  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private Integer amount;
	/**
     * 详情链接
     */
	private String link;
	/**
     * 
     */
	private String name;
	/**
     * 
     */
	private String remark;
	/**
     * 
     */
	private String unit;
	/**
     * 
     */
	private Long version;
	/**
     * 
     */
	private Long voteId;
	
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
	public Integer getAmount(){
		return amount;
	}
	/**
	* 
	*/
	public void setAmount(Integer amount){
		this.amount = amount;
	}
	/**
	* 详情链接
	* @return String
    */
	public String getLink(){
		return link;
	}
	/**
	* 详情链接
	*/
	public void setLink(String link){
		this.link = link;
	}
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
	* @return Long
    */
	public Long getVoteId(){
		return voteId;
	}
	/**
	* 
	*/
	public void setVoteId(Long voteId){
		this.voteId = voteId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("link:").append(getLink()).append(";");
		sb.append("name:").append(getName()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("unit:").append(getUnit()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		sb.append("voteId:").append(getVoteId()).append(";");
		return sb.toString();
	}
}
