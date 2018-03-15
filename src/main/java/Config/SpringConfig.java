package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import service.TestBean;

@Configuration
public class SpringConfig {

	
	@Bean
	public TestBean getTestBean(){
		return new TestBean("as sveikinu tave pasauli - SEL");
		
	}
}
