package com.genesys.provisioning.events;

import java.util.Map;

@FunctionalInterface
public interface AsyncCallback {
	public void response(Map<String, Object> data);
}