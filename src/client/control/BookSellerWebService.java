package client.control;

public class BookSellerWebService {

	public static void main(String[] args) throws Exception {

		HttpURLConnectionExample http = new HttpURLConnectionExample();

		System.out.println("Testing 1 - Send Http GET request");
		String xml = http.sendGet("http://www.goodreads.com/search/index.xml?key=uv1J3LcJ7zGuhzCXwaCcUQ&q=jungle%20book");
		System.out.println(xml);

		String titles = XmlParser.getValeuFromTagNameAndStringXml("title", xml);
		System.out.println(titles);
	}
}
