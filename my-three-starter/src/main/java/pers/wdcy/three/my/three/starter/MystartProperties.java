package pers.wdcy.three.my.three.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "mystart")
public class MystartProperties {
	
	private String id;
	
	private String name;
	
	private boolean active;

}
