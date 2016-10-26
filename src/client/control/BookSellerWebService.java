package client.control;

import client.view.BookResults;

public class BookSellerWebService {

	public static void searchBook(String keyword) throws Exception {
		String[] results = GoodreadsAPI.getInformationsByKeyword(keyword);
		System.out.println("Title: " + results[0] + " Average Rating: " + results[1] + " Description: " + results[2]);
		BookResults frame = new BookResults(results);
		frame.setVisible(true);
	}
}
