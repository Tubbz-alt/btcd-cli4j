package com.neemre.btcdcli4j.examples.api;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;

import org.apache.http.impl.client.CloseableHttpClient;

import com.neemre.btcdcli4j.core.domain.Output;
import com.neemre.btcdcli4j.core.domain.OutputOverview;
import com.neemre.btcdcli4j.core.domain.enums.SigHashTypes;
import com.neemre.btcdcli4j.examples.util.ResourceUtils;

/**A list of examples demonstrating the use of <i>bitcoind</i>'s 'Raw Transaction API' commands 
 * currently supported by btcd-cli4j. Calling any of the methods below will cause a short overview 
 * (<i>i.e.</i> of the results of the operation) to be written to {@code stdout}.*/
public class RawTransactionApi {

	public static void main(String[] args) throws Exception {
		CloseableHttpClient httpProvider = ResourceUtils.getHttpProvider();
		Properties nodeConfig = ResourceUtils.getNodeConfig();
		ApiCalls supportedCalls = new ApiCalls(httpProvider, nodeConfig);
		
		supportedCalls.createRawTransaction(Arrays.asList(new OutputOverview[]{ 
				new OutputOverview("c61706760cbae899d8ef130c6d6405ce67c163340c7f78a5388c1adb44e271a7", 0)}), 
				new HashMap<String, BigDecimal>(){{
					put("mkedpaeZELrF36mjpNmEdmLznN7YKKHVSV", new BigDecimal("0.299"));
					put("mh2GwDCi8rhm319vRLyLyDTPgmnFLprwb7", new BigDecimal("1.900"));}});
		supportedCalls.decodeRawTransaction("01000000019851e46f856eaa07c129e37d8ebfbc4e99f764e4623dd344dabf67"
				+ "18e2d66f650000000000ffffffff02580f0200000000001976a914af7d3ceab273e95a623b45fa511345836ddc"
				+ "cf8488acd8470300000000001976a9140ebec5470aec62ac2731ac536f4860768e31983288ac00000000");
		supportedCalls.decodeScript("5321021a971b74e19dbfa8d72fba6900bb49f6301cc8b7f86d1a5dd59397d3bdce887821"
				+ "0385fdc5e1adec9636cb1930e653da92024d3d26834306b6785a0b206995ccb7c121028d60b26dfdb6c92dac52"
				+ "958106b0477a661f3eb562bde36448e37231e252e9a3410450fed2184797eef3ce649df3adccb19adc02916c3d" 
				+ "565cb02c50b2aaabd9394eb2bd024692b57602c95a86a9c3dabbbaa163db340cbd58506c11ec9bf757c88854ae");
		supportedCalls.getRawTransaction("c6332a3b5624bb0dea70ba47d89ad150df443bf65b725a1e91b52753b20f7ca1");
		supportedCalls.getRawTransaction("c6332a3b5624bb0dea70ba47d89ad150df443bf65b725a1e91b52753b20f7ca1", 1);
		supportedCalls.sendRawTransaction("0100000001a771e244db1a8c38a5787f0c3463c167ce05646d0c13efd899e8ba0c"
				+ "760617c6000000006a473044022059dd8deaa2a448c2ad9e30a56f66d1f01c1faa4edc8e49dfd0351f62110924"
				+ "870220174b0e6ce04a109b39b8a51f1265211bf9bea00d562537bfc217914f8b7208d601210264d2aa10dbe504"
				+ "8d323ebc16bd42fe33dd6b91850fcf277aa9d0bf6d5fa7879bffffffff02802b530b000000001976a9141083bf"
				+ "c4f51e3556a7908dde8a7d32e827e1212d88ace03cc801000000001976a914384c891aeb1caee8c44039031a2d"
				+ "874228e5b4cd88ac00000000");
		supportedCalls.sendRawTransaction("01000000019851e46f856eaa07c129e37d8ebfbc4e99f764e4623dd344dabf6718"
				+ "e2d66f65000000006a473044022011fdc063358b8d85700a81b4b16077f88256706e4fa0740ea09756b950d02d"
				+ "c802205166f7234f2cc1e395930944751513253dc4458d8b636bd4b96b510d5ff96fd201210264d2aa10dbe504"
				+ "8d323ebc16bd42fe33dd6b91850fcf277aa9d0bf6d5fa7879bffffffff0300ef1c0d000000001976a9141083bf"
				+ "c4f51e3556a7908dde8a7d32e827e1212d88ac580f0200000000001976a914af7d3ceab273e95a623b45fa5113"
				+ "45836ddccf8488acd8470300000000001976a9140ebec5470aec62ac2731ac536f4860768e31983288ac000000"
				+ "00", true);
		supportedCalls.signRawTransaction("01000000019851e46f856eaa07c129e37d8ebfbc4e99f764e4623dd344dabf6718"
				+ "e2d66f650000000000ffffffff0300ef1c0d000000001976a9141083bfc4f51e3556a7908dde8a7d32e827e121"
				+ "2d88ac580f0200000000001976a914af7d3ceab273e95a623b45fa511345836ddccf8488acd847030000000000"
				+ "1976a9140ebec5470aec62ac2731ac536f4860768e31983288ac00000000");
		supportedCalls.signRawTransaction("01000000019851e46f856eaa07c129e37d8ebfbc4e99f764e4623dd344dabf6718"
				+ "e2d66f650000000000ffffffff0300ef1c0d000000001976a9141083bfc4f51e3556a7908dde8a7d32e827e121"
				+ "2d88ac580f0200000000001976a914af7d3ceab273e95a623b45fa511345836ddccf8488acd847030000000000"
				+ "1976a9140ebec5470aec62ac2731ac536f4860768e31983288ac00000000",
				Arrays.asList(new Output[]{new Output("656fd6e21867bfda44d33d62e464f7994ebcbf8e7de329c107aa6e8"
						+ "56fe45198", 0, "76a9141083bfc4f51e3556a7908dde8a7d32e827e1212d88ac", null)}));
		supportedCalls.signRawTransaction("01000000019851e46f856eaa07c129e37d8ebfbc4e99f764e4623dd344dabf6718"
				+ "e2d66f650000000000ffffffff0300ef1c0d000000001976a9141083bfc4f51e3556a7908dde8a7d32e827e121"
				+ "2d88ac580f0200000000001976a914af7d3ceab273e95a623b45fa511345836ddccf8488acd847030000000000"
				+ "1976a9140ebec5470aec62ac2731ac536f4860768e31983288ac00000000",
				Arrays.asList(new Output[]{new Output("656fd6e21867bfda44d33d62e464f7994ebcbf8e7de329c107aa6e8"
						+ "56fe45198", 0, "76a9141083bfc4f51e3556a7908dde8a7d32e827e1212d88ac", null)}),
				Arrays.asList(new String[]{"cNbvKQrwsEtwriHYK9ji1k7BZqggD3ZezXfkWJZFNp6PmSTfWEkT"}));
		supportedCalls.signRawTransaction("01000000019851e46f856eaa07c129e37d8ebfbc4e99f764e4623dd344dabf6718"
				+ "e2d66f650000000000ffffffff0300ef1c0d000000001976a9141083bfc4f51e3556a7908dde8a7d32e827e121"
				+ "2d88ac580f0200000000001976a914af7d3ceab273e95a623b45fa511345836ddccf8488acd847030000000000"
				+ "1976a9140ebec5470aec62ac2731ac536f4860768e31983288ac00000000",
				Arrays.asList(new Output[]{new Output("656fd6e21867bfda44d33d62e464f7994ebcbf8e7de329c107aa6e8"
						+ "56fe45198", 0, "76a9141083bfc4f51e3556a7908dde8a7d32e827e1212d88ac", null)}),
				Arrays.asList(new String[]{"cNbvKQrwsEtwriHYK9ji1k7BZqggD3ZezXfkWJZFNp6PmSTfWEkT"}), 
				SigHashTypes.NONE.getName());
	}
}