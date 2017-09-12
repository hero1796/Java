package ptit.hungvu.springuploadfiles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("ptit.hungvu.springuploadfiles.*")
public class ApplicationContextConfig {

	@Bean(name = "viewResource")
	public InternalResourceViewResolver getViewResource() {
		InternalResourceViewResolver viewResource = new InternalResourceViewResolver();
		viewResource.setPrefix("/WEB-INF/pages/");
		viewResource.setSuffix(".jsp");
		return viewResource;
	}
	
	@Bean(name = "multipartResolver")
	public MultipartResolver getMultipartResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setMaxUploadSize(1 * 1024 * 1024 * 1024);
		return resolver;
	}
}
