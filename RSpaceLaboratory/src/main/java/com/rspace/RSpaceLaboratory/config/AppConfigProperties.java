package com.rspace.RSpaceLaboratory.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@ConfigurationProperties
@PropertySource(value= {"classpath:application.properties"})
public class AppConfigProperties {
	

	private String rspaceHostName;
	private String rspaceGetSamplesUrl;
	private String rspaceApiKey;
	
	public String getRspaceGetSamplesUrl() {
		return rspaceGetSamplesUrl;
	}
	public void setRspaceGetSamplesUrl(String rspaceGetSamplesUrl) {
		this.rspaceGetSamplesUrl = rspaceGetSamplesUrl;
	}

	public String getRspaceHostName() {
		return rspaceHostName;
	}
	public void setRspaceHostName(String rspaceHostName) {
		this.rspaceHostName = rspaceHostName;
	}
	
	public String getRspaceApiKey() {
		return rspaceApiKey;
	}
	public void setRspaceApiKey(String rspaceApiKey) {
		this.rspaceApiKey = rspaceApiKey;
	}
	@Override
	public String toString() {
		return "AppConfigProperties [rspaceHostName=" + rspaceHostName + ", rspaceGetSamplesUrl=" + rspaceGetSamplesUrl
				+ ", rspaceApiKey=" + rspaceApiKey + "]";
	}
	
	
	
	
	
	
}
