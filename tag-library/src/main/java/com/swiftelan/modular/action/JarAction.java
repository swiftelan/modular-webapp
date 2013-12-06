package com.swiftelan.modular.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

public class JarAction extends AbstractActionBean {

	@DefaultHandler
	public Resolution execute() {
		return new ForwardResolution("/jsp-in-jar.jsp");
	}
}
