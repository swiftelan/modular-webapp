package com.swiftelan.modular.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

public class IndexAction extends AbstractActionBean {

	@DefaultHandler
	public Resolution execute() {
		return new ForwardResolution("/WEB-INF/index.jsp");
	}

}
