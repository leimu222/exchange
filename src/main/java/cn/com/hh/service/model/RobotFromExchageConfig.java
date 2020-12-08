package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [robot服务实现]
 */
public class RobotFromExchageConfig  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 交易所名称
     */
	private String name;
	/**
     * 交易所名称-中文
     */
	private String nameCn;
	/**
     * 
     */
	private String host;
	/**
     * 
     */
	private String baseUrl;
	/**
     * 备注信息
     */
	private String remark;
	
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
	* 交易所名称
	* @return String
    */
	public String getName(){
		return name;
	}
	/**
	* 交易所名称
	*/
	public void setName(String name){
		this.name = name;
	}
	/**
	* 交易所名称-中文
	* @return String
    */
	public String getNameCn(){
		return nameCn;
	}
	/**
	* 交易所名称-中文
	*/
	public void setNameCn(String nameCn){
		this.nameCn = nameCn;
	}
	/**
	* 
	* @return String
    */
	public String getHost(){
		return host;
	}
	/**
	* 
	*/
	public void setHost(String host){
		this.host = host;
	}
	/**
	* 
	* @return String
    */
	public String getBaseUrl(){
		return baseUrl;
	}
	/**
	* 
	*/
	public void setBaseUrl(String baseUrl){
		this.baseUrl = baseUrl;
	}
	/**
	* 备注信息
	* @return String
    */
	public String getRemark(){
		return remark;
	}
	/**
	* 备注信息
	*/
	public void setRemark(String remark){
		this.remark = remark;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("name:").append(getName()).append(";");
		sb.append("nameCn:").append(getNameCn()).append(";");
		sb.append("host:").append(getHost()).append(";");
		sb.append("baseUrl:").append(getBaseUrl()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		return sb.toString();
	}
}
