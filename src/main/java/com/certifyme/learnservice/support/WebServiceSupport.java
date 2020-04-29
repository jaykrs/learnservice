package com.certifyme.learnservice.support;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class WebServiceSupport {

	/**
	 * Make a web service call to the given endpoint, calling the method and using the params supplied
	 * @param endpoint	wsdl url
	 * @param method	method to call
	 * @param params	Array of params:
	 *  1. Must be in order required to be sent
	 * 	 * @return the response, or null if any exception is thrown.
	 */
	public static String call(String endpoint, String method, Object[] params) {
		
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();

		try {
			Client client = dcf.createClient(endpoint);
			Object[]  returnVals = client.invoke(method, params);
			//extract returned value. getting 1st value as sakai ws calls returns only one value.
			if(returnVals!=null && returnVals.length>0)
				return (String)returnVals[0];
		}
		catch (Exception e) {
			//e.printStackTrace();
			log.error("A connection error occurred: " + e.getClass() + ": " + e.getMessage());
		}
		return null;
	}
	private static Log log = LogFactory.getLog(WebServiceSupport.class);
}