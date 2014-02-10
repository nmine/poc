package be.nmine.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

//public class HelloPlace extends ActivityPlace<HelloActivity>
public class RightContentPlace extends Place
{
	private String helloName;
	
	public RightContentPlace(String token)
	{
		this.helloName = token;
	}

	public String getHelloName()
	{
		return helloName;
	}

	public static class Tokenizer implements PlaceTokenizer<RightContentPlace>
	{

		@Override
		public String getToken(RightContentPlace place)
		{
			return place.getHelloName();
		}

		@Override
		public RightContentPlace getPlace(String token)
		{
			return new RightContentPlace(token);
		}

	}
}
