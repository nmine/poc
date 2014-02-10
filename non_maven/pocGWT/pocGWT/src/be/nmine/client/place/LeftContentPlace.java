package be.nmine.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

//public class HelloPlace extends ActivityPlace<HelloActivity>
public class LeftContentPlace extends Place
{
	private String helloName;
	
	public LeftContentPlace(String token)
	{
		this.helloName = token;
	}

	public String getHelloName()
	{
		return helloName;
	}

	public static class Tokenizer implements PlaceTokenizer<LeftContentPlace>
	{

		@Override
		public String getToken(LeftContentPlace place)
		{
			return place.getHelloName();
		}

		@Override
		public LeftContentPlace getPlace(String token)
		{
			return new LeftContentPlace(token);
		}

	}
}
