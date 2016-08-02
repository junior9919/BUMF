/**
 * 
 */
package com.halo.bumf.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import com.halo.bumf.mvc.controllers.ControllerConstants;
import com.halo.bumf.mvc.services.ServiceConstants;
import com.halo.spring.utils.SpringUtils;

/**
 * 
 * @author zyl
 * @date 2016年8月2日 下午8:26:49
 * @version
 * @since
 */
public class CheckLoginFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		if (null == SpringUtils.getFromServletContext(ServiceConstants.SESSION_ID_USER)) {
			HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
			httpResponse.sendRedirect(ControllerConstants.URL_FTL_LOGIN);
			return;
		}
		filterChain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

}
