package be.nmine.client.views.event;

import com.google.gwt.event.shared.GwtEvent;

public class ChangeColorEvent extends GwtEvent<ChangeColorEventHandler> {
	public static final Type<ChangeColorEventHandler> TYPE = new Type<ChangeColorEventHandler>();

	@Override
	public Type<ChangeColorEventHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<ChangeColorEventHandler> getType() {
		return TYPE;
	}

	private String color;

	public ChangeColorEvent(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	protected void dispatch(ChangeColorEventHandler handler) {
		handler.onChangeColor(this);
	}
}
