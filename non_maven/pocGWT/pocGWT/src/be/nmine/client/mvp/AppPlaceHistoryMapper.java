package be.nmine.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

import be.nmine.client.place.FooterPlace;
import be.nmine.client.place.HeaderPlace;
import be.nmine.client.place.LeftContentPlace;
import be.nmine.client.place.RightContentPlace;

/**
 * PlaceHistoryMapper interface is used to attach all places which the
 * PlaceHistoryHandler should be aware of. This is done via the @WithTokenizers
 * annotation or by extending PlaceHistoryMapperWithFactory and creating a
 * separate TokenizerFactory.
 */
@WithTokenizers( { LeftContentPlace.Tokenizer.class,RightContentPlace.Tokenizer.class, HeaderPlace.Tokenizer.class, FooterPlace.Tokenizer.class })
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {
}
