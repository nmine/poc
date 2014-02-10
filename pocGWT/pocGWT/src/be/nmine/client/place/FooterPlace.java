package be.nmine.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class FooterPlace extends Place
{
	private String goodbyeName;
	
	public FooterPlace(String token)
	{
		this.goodbyeName = token;
	}

	public String getGoodbyeName()
	{
		return goodbyeName;
	}

	public static class Tokenizer implements PlaceTokenizer<FooterPlace>
	{
		@Override
		public String getToken(FooterPlace place)
		{
			return place.getGoodbyeName();
		}

		@Override
		public FooterPlace getPlace(String token)
		{
			return new FooterPlace(token);
		}
	}
	
}
