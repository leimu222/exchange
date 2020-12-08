package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [option服务实现]
 */
public class OptionCoinNode  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Integer id;
	/**
     * 币种id
     */
	private String coinId;
	/**
     * 节点id
     */
	private String nodeId;
	/**
     * 节点参数是否有效 1：启用，2：禁止
     */
	private Integer enable;
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
	* 币种id
	* @return String
    */
	public String getCoinId(){
		return coinId;
	}
	/**
	* 币种id
	*/
	public void setCoinId(String coinId){
		this.coinId = coinId;
	}
	/**
	* 节点id
	* @return String
    */
	public String getNodeId(){
		return nodeId;
	}
	/**
	* 节点id
	*/
	public void setNodeId(String nodeId){
		this.nodeId = nodeId;
	}
	/**
	* 节点参数是否有效 1：启用，2：禁止
	* @return Integer
    */
	public Integer getEnable(){
		return enable;
	}
	/**
	* 节点参数是否有效 1：启用，2：禁止
	*/
	public void setEnable(Integer enable){
		this.enable = enable;
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
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("nodeId:").append(getNodeId()).append(";");
		sb.append("enable:").append(getEnable()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
