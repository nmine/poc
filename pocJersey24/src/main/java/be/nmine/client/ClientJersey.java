//package be.nmine.client;
//
//import javax.ws.rs.client.Client;
//import javax.ws.rs.client.ClientBuilder;
//
//import org.glassfish.jersey.client.ClientConfig;
//
//public class ClientJersey {
//	public static void main(String[] args) {
//		ClientConfig clientConfig = new ClientConfig();
//		clientConfig.register(MyClientResponseFilter.class);
//		clientConfig.register(new AnotherClientFilter());
//		Client client = ClientBuilder.newClient(clientConfig);
//	}
//}
