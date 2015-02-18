package com.webserv.soap.first;

import javax.jws.WebService;

/**
 * The implementation of the JAX-WS Web Service.
 */
@WebService(serviceName = "FirstSOAPService", portName = "FirstSOAPService", name = "FirstSOAPService")
public class FirstSOAPServiceImpl implements FirstSOAPService {

	@Override
	public String sum(int a, int b) {
		return "Sum of " + a + " and " + b + " is " + (a + b);
	}
}
