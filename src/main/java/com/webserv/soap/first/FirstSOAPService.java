package com.webserv.soap.first;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * A simple example of how to setup a JAX-WS Web Service.
 */

@WebService
 public interface FirstSOAPService {

	/**
	 * Return sum
	 *
	 * @return sum
	 */
	@WebMethod
	public String sum(int a, int b);
}