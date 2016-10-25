package client.control;

public class BookSellerWebService {

	public static void main(String[] args) throws Exception {

		String[] response = GoodreadsAPI.getInformationsByKeyword("jungle%20book");
		System.out.println("Title: " + response[0] + " Average Rating: " + response[1] + " Description: " + response[2]);
	}
}
