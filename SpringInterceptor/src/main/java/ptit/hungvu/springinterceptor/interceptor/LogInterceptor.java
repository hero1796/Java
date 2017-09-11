package ptit.hungvu.springinterceptor.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LogInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		long startTime = System.currentTimeMillis();
		System.out.println("LogInterceptor.preHand--");
		System.out.println("Request url : " + request.getRequestURL());
		System.out.println("Start time : " + System.currentTimeMillis());
		request.setAttribute("startTime", startTime);
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("LogInterception.postHand--");
		System.out.println("Request url : " + request.getRequestURL());
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("LogInterception.afterCompletion--");

		long startTime = (Long) request.getAttribute("startTime");
		long endTime = System.currentTimeMillis();
		System.out.println("Request url: " + request.getRequestURL());
		System.out.println("End Time: " + endTime);
		System.out.println("Time Taken: " + (endTime - startTime));
		System.out.println("\n\n\n\n");
	}
}
