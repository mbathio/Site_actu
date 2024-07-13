package myathentique;
import jakarta.xml.ws.Endpoint;


public class server {

	public static void main(String[] args) {
		String url;
		// TODO Auto-generated method stub
		String url="http://localhost:1234/";
		Endpoint.publish(url, new Authentification());
		
	}

}
