package Week3Day1Assignments;

public class PolymorphismApiClient {
	public void sendRequest(String endpoint) {
		System.out.println("End point is "+endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("End point is "+endpoint+" & Request Body is "+requestBody+" & Request Status is "+requestStatus);
	}

	public static void main(String[] args) {
		PolymorphismApiClient client= new PolymorphismApiClient();
		client.sendRequest("www.google.com");
		client.sendRequest("www.instagram.com", "instagramAPI", true);
	}
}