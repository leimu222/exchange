package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:15:59
  * Description: [about服务实现]
 */
public class AboutUs  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Integer id;
	/**
     * 内容
     */
	private String content;
	/**
     * 时间戳
     */
	private Long sequence;
	
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
	* 内容
	* @return String
    */
	public String getContent(){
		return content;
	}
	/**
	* 内容
	*/
	public void setContent(String content){
		this.content = content;
	}
	/**
	* 时间戳
	* @return Long
    */
	public Long getSequence(){
		return sequence;
	}
	/**
	* 时间戳
	*/
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("content:").append(getContent()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
