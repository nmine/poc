package be.nmine.client.views.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class AbstractBootstrapValueBox_ViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, be.nmine.client.views.widget.AbstractBootstrapValueBox>, be.nmine.client.views.widget.AbstractBootstrapValueBox.ViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div class='control-group' id='{0}'> <label class='control-label'> <span id='{1}'></span> </label> <div class='controls'> <span id='{2}'></span> <span class='help-inline hidden' id='{3}'> <span id='{4}'></span> </span> </div> </div>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final be.nmine.client.views.widget.AbstractBootstrapValueBox owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final be.nmine.client.views.widget.AbstractBootstrapValueBox owner;


    public Widgets(final be.nmine.client.views.widget.AbstractBootstrapValueBox owner) {
      this.owner = owner;
      build_valueboxLabel();  // no getter call detected but must bind to ui:field. Type: IMPORTED, precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private be.nmine.client.views.widget.AbstractBootstrapValueBox_ViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private be.nmine.client.views.widget.AbstractBootstrapValueBox_ViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final be.nmine.client.views.widget.AbstractBootstrapValueBox_ViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (be.nmine.client.views.widget.AbstractBootstrapValueBox_ViewUiBinderImpl_GenBundle) GWT.create(be.nmine.client.views.widget.AbstractBootstrapValueBox_ViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for valueboxLabel called 0 times. Type: IMPORTED. Build precedence: 1.
     */
    private java.lang.String get_valueboxLabel() {
      return build_valueboxLabel();
    }
    private java.lang.String build_valueboxLabel() {
      // Creation section.
      final java.lang.String valueboxLabel = owner.valueboxLabel;
      assert valueboxLabel != null : "UiField valueboxLabel with 'provided = true' was null";
      // Setup section.


      return valueboxLabel;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord13 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_valueboxDiv();
      get_domId1Element().get();
      get_domId2Element().get();
      get_valueboxErrorField();
      get_domId4Element().get();

      // Detach section.
      attachRecord13.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineHTML2(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_valuebox(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_valueboxErrorFieldLabel(), get_domId4Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for valueboxDiv called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.DivElement get_valueboxDiv() {
      return build_valueboxDiv();
    }
    private com.google.gwt.dom.client.DivElement build_valueboxDiv() {
      // Creation section.
      final com.google.gwt.dom.client.DivElement valueboxDiv = new com.google.gwt.uibinder.client.LazyDomElement(get_domId0()).get().cast();
      // Setup section.


      owner.valueboxDiv = valueboxDiv;

      return valueboxDiv;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId0;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId1;
    }

    /**
     * Getter for f_InlineHTML2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineHTML get_f_InlineHTML2() {
      return build_f_InlineHTML2();
    }
    private com.google.gwt.user.client.ui.InlineHTML build_f_InlineHTML2() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineHTML f_InlineHTML2 = (com.google.gwt.user.client.ui.InlineHTML) GWT.create(com.google.gwt.user.client.ui.InlineHTML.class);
      // Setup section.
      f_InlineHTML2.setText("test");


      return f_InlineHTML2;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.


      return domId1Element;
    }

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId2;
    }

    /**
     * Getter for valuebox called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Widget get_valuebox() {
      return build_valuebox();
    }
    private com.google.gwt.user.client.ui.Widget build_valuebox() {
      // Creation section.
      final com.google.gwt.user.client.ui.Widget valuebox = owner.valuebox;
      assert valuebox != null : "UiField valuebox with 'provided = true' was null";
      // Setup section.


      return valuebox;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId2Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId2Element() {
      return domId2Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId2Element() {
      // Creation section.
      domId2Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId2());
      // Setup section.


      return domId2Element;
    }

    /**
     * Getter for valueboxErrorField called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.SpanElement get_valueboxErrorField() {
      return build_valueboxErrorField();
    }
    private com.google.gwt.dom.client.SpanElement build_valueboxErrorField() {
      // Creation section.
      final com.google.gwt.dom.client.SpanElement valueboxErrorField = new com.google.gwt.uibinder.client.LazyDomElement(get_domId3()).get().cast();
      // Setup section.


      owner.valueboxErrorField = valueboxErrorField;

      return valueboxErrorField;
    }

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId3;
    private java.lang.String get_domId3() {
      return domId3;
    }
    private java.lang.String build_domId3() {
      // Creation section.
      domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId3;
    }

    /**
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId4;
    private java.lang.String get_domId4() {
      return domId4;
    }
    private java.lang.String build_domId4() {
      // Creation section.
      domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId4;
    }

    /**
     * Getter for valueboxErrorFieldLabel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_valueboxErrorFieldLabel() {
      return build_valueboxErrorFieldLabel();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_valueboxErrorFieldLabel() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel valueboxErrorFieldLabel = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.


      owner.valueboxErrorFieldLabel = valueboxErrorFieldLabel;

      return valueboxErrorFieldLabel;
    }

    /**
     * Getter for domId4Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId4Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId4Element() {
      return domId4Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId4Element() {
      // Creation section.
      domId4Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId4());
      // Setup section.


      return domId4Element;
    }
  }
}
