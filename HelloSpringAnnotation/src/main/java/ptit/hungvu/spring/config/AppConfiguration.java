package ptit.hungvu.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ptit.hungvu.spring.lang.Language;
import ptit.hungvu.spring.lang.impl.Vietnamese;

@Configuration
@ComponentScan({"ptit.hungvu.spring.bean"})
public class AppConfiguration {

	@Bean(name = "language")
	public Language getLanguage() {
		return new Vietnamese();
	}
}
