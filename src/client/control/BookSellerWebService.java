package client.control;

public class BookSellerWebService {

	public static void searchBook(String keyword) throws Exception {
		String[] response = GoodreadsAPI.getInformationsByKeyword(keyword);
		System.out.println("Title: " + response[0] + " Average Rating: " + response[1] + " Description: " + response[2]);    }
}
