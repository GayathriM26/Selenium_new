package Week1.day1;

public class ApiClient {

	public void sendRequest(String requestBody)
	{
	System.out.println("The message"+ requestBody);	
	}
	public void sendRequest(String requestBody, String endpoint)
	{
		System.out.println("The message"+requestBody + "The Endpoint" +endpoint);
	}
	public void sendRequest(String requestBody, String endpoint, Boolean requestStatus)
	{
		System.out.println("The message"+requestBody + "The Endpoint" +endpoint + "The Request Status"+ requestStatus);
	}
	public static void main(String [] args)
	{
		ApiClient ap=new ApiClient();
		ap.sendRequest("www.google.com");
		ap.sendRequest("www.gmail.com", "http");
		ap.sendRequest("gmail.com","https", true);
	}
		
	}


