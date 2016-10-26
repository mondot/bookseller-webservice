package client.control;

public class GoodreadsAPI {

	protected static String[] getInformationsByKeyword(String keyword) throws Exception {

		HttpURLConnectionExample http = new HttpURLConnectionExample();

		String correctedKeyword = keyword.replaceAll(" ", "%20");
		String searchIndexXml = http.sendGet("http://www.goodreads.com/search/index.xml?key=uv1J3LcJ7zGuhzCXwaCcUQ&q="+correctedKeyword);
		String title = XmlParser.getValueFromTagNameAndStringXml("title", searchIndexXml);
		String averageRating = XmlParser.getValueFromTagNameAndStringXml("average_rating", searchIndexXml);
		System.out.println("The title " + title + " rated "+ averageRating +" have been found.");

		String correctedTitle = title.replaceAll(" ", "%20");
		String descriptionXml = http.sendGet("http://www.goodreads.com/book/title.xml?key=uv1J3LcJ7zGuhzCXwaCcUQ&title="+correctedTitle);
		String description = XmlParser.getValueFromTagNameAndStringXml("description", descriptionXml);

		String[] response = {title, averageRating, description};

		return response;
	}
}
