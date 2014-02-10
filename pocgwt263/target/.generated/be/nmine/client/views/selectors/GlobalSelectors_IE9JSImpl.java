package be.nmine.client.views.selectors;

import com.google.gwt.query.client.impl.*;
import com.google.gwt.query.client.js.*;
import com.google.gwt.query.client.Selectors.*;
import com.google.gwt.query.client.*;
import com.google.gwt.core.client.*;
import com.google.gwt.dom.client.*;

public class GlobalSelectors_IE9JSImpl extends com.google.gwt.query.client.impl.SelectorEngine implements be.nmine.client.views.selectors.GlobalSelectors {
  public final com.google.gwt.query.client.GQuery getAllInputElements() {
    return GQuery.$(JsNodeArray.create(((Element)root).getElementsByTagName("input")));
  }
  public DeferredSelector[] getAllSelectors() {return ds;}
  private final DeferredSelector[] ds = new DeferredSelector[] {
    new DeferredSelector() {
      public String getSelector() { return "input"; }
      public NodeList<Element> runSelector(Node ctx) { return getAllInputElements().get();}
    },
  };
}
