package com.swiftelan.modular.tag;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class ResourcesTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		Collection<String> cssFiles = new LinkedList<>();
		cssFiles.add("/bootstrap/css/bootstrap.min.css");
		PageContext context = (PageContext) getJspContext();
		for (String css : cssFiles) {
			getJspContext().getOut().write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
			getJspContext().getOut().write(context.getRequest().getServletContext().getContextPath());
			getJspContext().getOut().write(css);
			getJspContext().getOut().write("\">");
		}
		
		Collection<String> jsFiles = new LinkedList<>();
		jsFiles.add("/jquery-2.0.3.min.js");
		jsFiles.add("/bootstrap/js/bootstrap.min.js");
		
		for (String js : jsFiles) {
			getJspContext().getOut().write("<script type=\"text/javascript\" src=\"");
			getJspContext().getOut().write(context.getRequest().getServletContext().getContextPath());
			getJspContext().getOut().write(js);
			getJspContext().getOut().write("\"></script>");
		}
	}
}
