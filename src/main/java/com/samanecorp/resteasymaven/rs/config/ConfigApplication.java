package com.samanecorp.resteasymaven.rs.config;



import com.samanecorp.resteasymaven.rs.web.UserController;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/rest")
public class ConfigApplication extends Application {

	Set<Object> singletons = new HashSet<>();
	
	public ConfigApplication() {
		this.singletons.add(new UserController());
	}

	@Override
	public Set<Object> getSingletons() {
		return super.getSingletons();
	}
}