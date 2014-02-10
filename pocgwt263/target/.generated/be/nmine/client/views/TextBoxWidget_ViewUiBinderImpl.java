package be.nmine.client.views;

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

public class TextBoxWidget_ViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, be.nmine.client.views.TextBoxWidget>, be.nmine.client.views.TextBoxWidget.ViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div class='container'> <form class='form-horizontal'> <legend> <span id='{0}'></span> </legend> <legend> <span id='{1}'></span> </legend> <span id='{2}'></span> <span id='{3}'></span> <span id='{4}'></span> <span id='{5}'></span> <span id='{6}'></span> <a href='#'>test lien</a> <a href='#'>test lien</a> <a href='#'>test lien</a> <a href='#'>test lien</a> </form> </div>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final be.nmine.client.views.TextBoxWidget owner) {


    return new Widgets(owner).get_htmlPanelDepositInfo();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final be.nmine.client.views.TextBoxWidget owner;


    public Widgets(final be.nmine.client.views.TextBoxWidget owner) {
      this.owner = owner;
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5(), get_domId6());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private be.nmine.client.views.TextBoxWidget_ViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private be.nmine.client.views.TextBoxWidget_ViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final be.nmine.client.views.TextBoxWidget_ViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (be.nmine.client.views.TextBoxWidget_ViewUiBinderImpl_GenBundle) GWT.create(be.nmine.client.views.TextBoxWidget_ViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for htmlPanelDepositInfo called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_htmlPanelDepositInfo() {
      return build_htmlPanelDepositInfo();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_htmlPanelDepositInfo() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel htmlPanelDepositInfo = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord12 = UiBinderUtil.attachToDom(htmlPanelDepositInfo.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();
      get_domId3Element().get();
      get_domId4Element().get();
      get_domId5Element().get();
      get_domId6Element().get();

      // Detach section.
      attachRecord12.detach();
      htmlPanelDepositInfo.addAndReplaceElement(get_f_InlineLabel1(), get_domId0Element().get());
      htmlPanelDepositInfo.addAndReplaceElement(get_f_InlineLabel2(), get_domId1Element().get());
      htmlPanelDepositInfo.addAndReplaceElement(get_textBox1(), get_domId2Element().get());
      htmlPanelDepositInfo.addAndReplaceElement(get_textBox2(), get_domId3Element().get());
      htmlPanelDepositInfo.addAndReplaceElement(get_textBox3(), get_domId4Element().get());
      htmlPanelDepositInfo.addAndReplaceElement(get_textBox4(), get_domId5Element().get());
      htmlPanelDepositInfo.addAndReplaceElement(get_textBox5(), get_domId6Element().get());

      owner.htmlPanelDepositInfo = htmlPanelDepositInfo;

      return htmlPanelDepositInfo;
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
     * Getter for f_InlineLabel1 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel1() {
      return build_f_InlineLabel1();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel1 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel1.setText("legend");


      return f_InlineLabel1;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.


      return domId0Element;
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
     * Getter for f_InlineLabel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel2() {
      return build_f_InlineLabel2();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel2 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel2.setText("label");


      return f_InlineLabel2;
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
     * Getter for textBox1 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private be.nmine.client.views.widget.BootstrapTextBox get_textBox1() {
      return build_textBox1();
    }
    private be.nmine.client.views.widget.BootstrapTextBox build_textBox1() {
      // Creation section.
      final be.nmine.client.views.widget.BootstrapTextBox textBox1 = new be.nmine.client.views.widget.BootstrapTextBox("test");
      // Setup section.
      textBox1.setTextToolTip("lorem ipsum");


      owner.textBox1 = textBox1;

      return textBox1;
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
     * Getter for textBox2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private be.nmine.client.views.widget.BootstrapTextBox get_textBox2() {
      return build_textBox2();
    }
    private be.nmine.client.views.widget.BootstrapTextBox build_textBox2() {
      // Creation section.
      final be.nmine.client.views.widget.BootstrapTextBox textBox2 = new be.nmine.client.views.widget.BootstrapTextBox("label");
      // Setup section.


      owner.textBox2 = textBox2;

      return textBox2;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId3Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId3Element() {
      return domId3Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId3Element() {
      // Creation section.
      domId3Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId3());
      // Setup section.


      return domId3Element;
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
     * Getter for textBox3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private be.nmine.client.views.widget.BootstrapTextBox get_textBox3() {
      return build_textBox3();
    }
    private be.nmine.client.views.widget.BootstrapTextBox build_textBox3() {
      // Creation section.
      final be.nmine.client.views.widget.BootstrapTextBox textBox3 = new be.nmine.client.views.widget.BootstrapTextBox("label");
      // Setup section.


      owner.textBox3 = textBox3;

      return textBox3;
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

    /**
     * Getter for domId5 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId5;
    private java.lang.String get_domId5() {
      return domId5;
    }
    private java.lang.String build_domId5() {
      // Creation section.
      domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId5;
    }

    /**
     * Getter for textBox4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private be.nmine.client.views.widget.BootstrapTextBox get_textBox4() {
      return build_textBox4();
    }
    private be.nmine.client.views.widget.BootstrapTextBox build_textBox4() {
      // Creation section.
      final be.nmine.client.views.widget.BootstrapTextBox textBox4 = new be.nmine.client.views.widget.BootstrapTextBox("label");
      // Setup section.


      owner.textBox4 = textBox4;

      return textBox4;
    }

    /**
     * Getter for domId5Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId5Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId5Element() {
      return domId5Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId5Element() {
      // Creation section.
      domId5Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId5());
      // Setup section.


      return domId5Element;
    }

    /**
     * Getter for domId6 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId6;
    private java.lang.String get_domId6() {
      return domId6;
    }
    private java.lang.String build_domId6() {
      // Creation section.
      domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId6;
    }

    /**
     * Getter for textBox5 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private be.nmine.client.views.widget.BootstrapTextBox get_textBox5() {
      return build_textBox5();
    }
    private be.nmine.client.views.widget.BootstrapTextBox build_textBox5() {
      // Creation section.
      final be.nmine.client.views.widget.BootstrapTextBox textBox5 = new be.nmine.client.views.widget.BootstrapTextBox("label");
      // Setup section.


      owner.textBox5 = textBox5;

      return textBox5;
    }

    /**
     * Getter for domId6Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId6Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId6Element() {
      return domId6Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId6Element() {
      // Creation section.
      domId6Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId6());
      // Setup section.


      return domId6Element;
    }
  }
}
