package ptit.hungvu.springinterceptor.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class OldLoginInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("OldLoginInterceptor.preHand-- ");
		System.out.println("Request URL: " + request.getRequestURL());
		System.out.println("Sorry! This URL is no longer used, Redirect to /admin/login");
		response.sendRedirect(request.getContextPath() + "/admin/login");
		return false;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("OldLoginInterceptor.postHand-- ");
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("OldLoginInterceptor.afterCompletion--");
		
	}

}
