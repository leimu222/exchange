package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [otc服务实现]
 */
public class OtcPayTypes  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Integer id;
	/**
     * 支付名称
     */
	private String name;
	/**
     * 支付英文名
     */
	private String nameEn;
	/**
     * logo图片url
     */
	private String imgUrl;
	/**
     * 0不可用，1可用
     */
	private Integer status;
	
	// setter and getter
	/**
	* 主键
	* @return Integer
    */
	public Integer getId(){
		return id;
	}
	/**
	* 主键
	*/
	public void setId(Integer id){
		this.id = id;
	}
	/**
	* 支付名称
	* @return String
    */
	public String getName(){
		return name;
	}
	/**
	* 支付名称
	*/
	public void setName(String name){
		this.name = name;
	}
	/**
	* 支付英文名
	* @return String
    */
	public String getNameEn(){
		return nameEn;
	}
	/**
	* 支付英文名
	*/
	public void setNameEn(String nameEn){
		this.nameEn = nameEn;
	}
	/**
	* logo图片url
	* @return String
    */
	public String getImgUrl(){
		return imgUrl;
	}
	/**
	* logo图片url
	*/
	public void setImgUrl(String imgUrl){
		this.imgUrl = imgUrl;
	}
	/**
	* 0不可用，1可用
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 0不可用，1可用
	*/
	public void setStatus(Integer status){
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("name:").append(getName()).append(";");
		sb.append("nameEn:").append(getNameEn()).append(";");
		sb.append("imgUrl:").append(getImgUrl()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		return sb.toString();
	}
}
