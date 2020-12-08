package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public class ContractDoubleExchangeConfig  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Long id;
	/**
     * 交易所英文名称
     */
	private String name;
	/**
     * 交易所中文名称
     */
	private String cnName;
	/**
     * 合约请求根路径
     */
	private String apiUrl;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * api绑定说明
     */
	private String content;
	
	// setter and getter
	/**
	* 主键
	* @return Long
    */
	public Long getId(){
		return id;
	}
	/**
	* 主键
	*/
	public void setId(Long id){
		this.id = id;
	}
	/**
	* 交易所英文名称
	* @return String
    */
	public String getName(){
		return name;
	}
	/**
	* 交易所英文名称
	*/
	public void setName(String name){
		this.name = name;
	}
	/**
	* 交易所中文名称
	* @return String
    */
	public String getCnName(){
		return cnName;
	}
	/**
	* 交易所中文名称
	*/
	public void setCnName(String cnName){
		this.cnName = cnName;
	}
	/**
	* 合约请求根路径
	* @return String
    */
	public String getApiUrl(){
		return apiUrl;
	}
	/**
	* 合约请求根路径
	*/
	public void setApiUrl(String apiUrl){
		this.apiUrl = apiUrl;
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
	* api绑定说明
	* @return String
    */
	public String getContent(){
		return content;
	}
	/**
	* api绑定说明
	*/
	public void setContent(String content){
		this.content = content;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("name:").append(getName()).append(";");
		sb.append("cnName:").append(getCnName()).append(";");
		sb.append("apiUrl:").append(getApiUrl()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("content:").append(getContent()).append(";");
		return sb.toString();
	}
}
