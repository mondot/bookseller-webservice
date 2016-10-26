package client.control;

public class eBayAPI {

	protected static String getOffersByKeyword(String keyword) throws Exception {

		HttpURLConnectionExample http = new HttpURLConnectionExample();

		String correctedKeyword = keyword.replaceAll(" ", "%20");
		String searchIndexXml = http.sendGet("http://svcs.sandbox.ebay.com/services/search/FindingService/v1?SECURITY-APPNAME=AaltoUni-ws-SBX-3e6eb0ea5-11d466dd&OPERATION-NAME=findItemsByKeywords&keywords="+correctedKeyword);
		String offer = XmlParser.getValueFromTagNameAndStringXml("currentPrice", searchIndexXml);
		System.out.println("The offer is " + offer);

		return offer;
	}
}