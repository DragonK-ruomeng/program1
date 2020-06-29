package com.dragonk.JT.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
@ConfigurationProperties(prefix="redis")
@Data
public class RedisController {
	  private String host;
	  private Integer port;
	 
	
  @RequestMapping("/getRedis")
  public String getRedis() {
	  
	return host+","+port; 
  }
}
