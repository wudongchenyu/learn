package pers.wdcy.mystart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MystartProperties.class)
public class MystartConfiguration {

	private MyManager myManager;
	
	@Autowired
	private MystartProperties properties;

    @Bean
    @ConditionalOnMissingBean(MyManager.class)
    MyManager manager() {
        myManager = new MyManager(properties);
        return myManager;
    }

}
