package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberNodeInfo  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 节点id,1普通节点，2社区节点
     */
	private Integer id;
	/**
     * 认购金额，单位USDT
     */
	private java.math.BigDecimal price;
	/**
     * 节点名称
     */
	private String name;
	
	// setter and getter
	/**
	* 节点id,1普通节点，2社区节点
	* @return Integer
    */
	public Integer getId(){
		return id;
	}
	/**
	* 节点id,1普通节点，2社区节点
	*/
	public void setId(Integer id){
		this.id = id;
	}
	/**
	* 认购金额，单位USDT
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPrice(){
		return price;
	}
	/**
	* 认购金额，单位USDT
	*/
	public void setPrice(java.math.BigDecimal price){
		this.price = price;
	}
	/**
	* 节点名称
	* @return String
    */
	public String getName(){
		return name;
	}
	/**
	* 节点名称
	*/
	public void setName(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("price:").append(getPrice()).append(";");
		sb.append("name:").append(getName()).append(";");
		return sb.toString();
	}
}
