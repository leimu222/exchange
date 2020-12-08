package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [option服务实现]
 */
public class OptionConfig  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 配置key
     */
	private String configKey;
	/**
     * 配置value
     */
	private String configValue;
	/**
     * 配置描述信息
     */
	private String description;
	
	// setter and getter
	/**
	* 配置key
	* @return String
    */
	public String getConfigKey(){
		return configKey;
	}
	/**
	* 配置key
	*/
	public void setConfigKey(String configKey){
		this.configKey = configKey;
	}
	/**
	* 配置value
	* @return String
    */
	public String getConfigValue(){
		return configValue;
	}
	/**
	* 配置value
	*/
	public void setConfigValue(String configValue){
		this.configValue = configValue;
	}
	/**
	* 配置描述信息
	* @return String
    */
	public String getDescription(){
		return description;
	}
	/**
	* 配置描述信息
	*/
	public void setDescription(String description){
		this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("configKey:").append(getConfigKey()).append(";");
		sb.append("configValue:").append(getConfigValue()).append(";");
		sb.append("description:").append(getDescription()).append(";");
		return sb.toString();
	}
}
