package com.neemre.btcdcli4j.examples.client;

import java.util.Properties;

import org.apache.http.impl.client.CloseableHttpClient;

import com.neemre.btcdcli4j.examples.util.ResourceUtils;

/**A list of examples demonstrating the use of <i>bitcoind</i>'s mining RPCs (via the JSON-RPC 
 * API).*/
public class MiningApi {

	public static void main(String[] args) throws Exception {
		CloseableHttpClient httpProvider = ResourceUtils.getHttpProvider();
		Properties nodeConfig = ResourceUtils.getNodeConfig();
		ApiCalls supportedCalls = new ApiCalls(httpProvider, nodeConfig);
		
		supportedCalls.getGenerate();
		supportedCalls.getMiningInfo();
		supportedCalls.setGenerate(false);
		supportedCalls.setGenerate(false, 7);
	}
}