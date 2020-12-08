package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [website服务实现]
 */
public class WebsiteInformation  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String addressIcon;
	/**
     * 
     */
	private String contact;
	/**
     * 
     */
	private String copyright;
	/**
     * 
     */
	private String description;
	/**
     * 
     */
	private String keywords;
	/**
     * 
     */
	private String logo;
	/**
     * 
     */
	private String name;
	/**
     * 
     */
	private String otherInformation;
	/**
     * 
     */
	private String postcode;
	/**
     * 
     */
	private String url;
	
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
	public String getAddressIcon(){
		return addressIcon;
	}
	/**
	* 
	*/
	public void setAddressIcon(String addressIcon){
		this.addressIcon = addressIcon;
	}
	/**
	* 
	* @return String
    */
	public String getContact(){
		return contact;
	}
	/**
	* 
	*/
	public void setContact(String contact){
		this.contact = contact;
	}
	/**
	* 
	* @return String
    */
	public String getCopyright(){
		return copyright;
	}
	/**
	* 
	*/
	public void setCopyright(String copyright){
		this.copyright = copyright;
	}
	/**
	* 
	* @return String
    */
	public String getDescription(){
		return description;
	}
	/**
	* 
	*/
	public void setDescription(String description){
		this.description = description;
	}
	/**
	* 
	* @return String
    */
	public String getKeywords(){
		return keywords;
	}
	/**
	* 
	*/
	public void setKeywords(String keywords){
		this.keywords = keywords;
	}
	/**
	* 
	* @return String
    */
	public String getLogo(){
		return logo;
	}
	/**
	* 
	*/
	public void setLogo(String logo){
		this.logo = logo;
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
	public String getOtherInformation(){
		return otherInformation;
	}
	/**
	* 
	*/
	public void setOtherInformation(String otherInformation){
		this.otherInformation = otherInformation;
	}
	/**
	* 
	* @return String
    */
	public String getPostcode(){
		return postcode;
	}
	/**
	* 
	*/
	public void setPostcode(String postcode){
		this.postcode = postcode;
	}
	/**
	* 
	* @return String
    */
	public String getUrl(){
		return url;
	}
	/**
	* 
	*/
	public void setUrl(String url){
		this.url = url;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("addressIcon:").append(getAddressIcon()).append(";");
		sb.append("contact:").append(getContact()).append(";");
		sb.append("copyright:").append(getCopyright()).append(";");
		sb.append("description:").append(getDescription()).append(";");
		sb.append("keywords:").append(getKeywords()).append(";");
		sb.append("logo:").append(getLogo()).append(";");
		sb.append("name:").append(getName()).append(";");
		sb.append("otherInformation:").append(getOtherInformation()).append(";");
		sb.append("postcode:").append(getPostcode()).append(";");
		sb.append("url:").append(getUrl()).append(";");
		return sb.toString();
	}
}
