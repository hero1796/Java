package ptit.hungvu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ptit.hungvu.spring.bean.GreetingService;
import ptit.hungvu.spring.bean.MyComponent;
import ptit.hungvu.spring.config.AppConfiguration;
import ptit.hungvu.spring.lang.Language;

public class MainProgram {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		System.out.println("------------------------");
		Language language = (Language) context.getBean("language");
		System.out.println("Bean language : " + language);
		System.out.println("Call language.sayBye() : " + language.getBye());
		System.out.println("------------------------");
		GreetingService service = (GreetingService) context.getBean("greetingService");
		service.sayGreeting();
		System.out.println("------------------------");
		MyComponent component = (MyComponent) context.getBean("myComponent");
		component.showAppInfo();
	}
}
