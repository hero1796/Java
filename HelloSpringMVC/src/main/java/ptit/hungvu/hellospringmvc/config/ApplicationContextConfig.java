package ptit.hungvu.hellospringmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("ptit.hungvu.hellospringmvc.*")
public class ApplicationContextConfig {

	@Bean(name = "viewResolver")
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResource = new InternalResourceViewResolver();
		viewResource.setPrefix("/WEB-INF/pages/");
		viewResource.setSuffix(".jsp");
		return viewResource;
	}
}
