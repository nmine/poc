package be.nmine.pocjsni.client.views.widget;

import java.util.logging.Logger;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.TextArea;

public class RichTextEditor extends Composite {

    private static final Logger LOG = Logger.getLogger(RichTextEditor.class.getName());

    protected final String textAreaId = "rich-editor-" + Math.random();

    protected EditorJso editor;

    protected ViewUiBinder uiBinder = GWT.create(ViewUiBinder.class);

    @UiField
    TextArea textArea;

    public interface ViewUiBinder extends UiBinder<HTMLPanel, RichTextEditor> {
    }

    public RichTextEditor() {
	initWidget(uiBinder.createAndBindUi(this));
	textArea.getElement().setId(textAreaId);
    }

    @Override
    protected void onLoad() {
	LOG.info("onLoad()");
	if (editor == null) {
	    EditorConfigJso config = EditorConfigJso.create();
	    config.setLanguage(LocaleInfo.getCurrentLocale().getLocaleName());
	    config.setToolbar();
	    editor = EditorJso.create(textAreaId, config);
	}
	super.onLoad();
    }

    @Override
    protected void onUnload() {
	LOG.info("onUnload()");
	if (editor != null) {
	    editor.destroy();
	    editor = null;
	}
	super.onUnload();
    }

    public static native void disableAllDatesElementsFromParent(String id) /*-{
		$wnd.$(id).hide();
    }-*/;

    public String getData() {
	return editor.getData();
    }

    public String setData(String content) {
	if (!(editor == null)) {
	    return editor.setData(content);
	} else {
	    return null;
	}
    }

    public void setReadOnly(boolean enable) {
	if (editor == null) {
	} else {
	    editor.setReadOnly(enable);
	}
    }

    static class EditorJso extends JavaScriptObject {

	protected EditorJso() {
	}

	public final static native EditorJso create(String textAreaId, EditorConfigJso config) /*-{
			return $wnd.CKEDITOR.replace(textAreaId, config);
	}-*/;

	public final native String getData() /*-{
			return this.getData();
	}-*/;

	public final native String setData(String content) /*-{
			return this.setData(content);
	}-*/;

	public final native String destroy() /*-{
			return this.destroy();
	}-*/;

	public final native String setReadOnly(boolean isReadOnly) /*-{
			return this.setReadOnly(isReadOnly);
	}-*/;

    }

    static class EditorConfigJso extends JavaScriptObject {

	protected EditorConfigJso() {
	}

	public final static native EditorConfigJso create() /*-{
			return {};
	}-*/;

	public final native void setLanguage(String language) /*-{
			this.language = language;
	}-*/;

	public final native void setPasteFromWordRemoveFontStyles(boolean value) /*-{
			this.pasteFromWordRemoveFontStyles = value;
	}-*/;

	public final native void setToolbar() /*-{
			this.toolbar = 'MyToolbar';

			this.toolbar_MyToolbar = [
					{
						name : 'clipboard',
						items : [ 'Cut', 'Copy', 'Paste' ]
					},
					{
						name : 'editing',
						items : [ 'Find', 'Replace', 'SelectAll', 'Scayt' ]
					},

					'/',
					{
						name : 'basicstyles',
						items : [ 'Bold', 'Italic', 'Underline', "Superscript" ]
					},
					{
						name : 'paragraph',
						items : [ 'NumberedList', 'BulletedList', '-',
								'Outdent', 'Indent', '-', 'JustifyLeft',
								'JustifyCenter', 'JustifyRight' ]
					}, {
						name : 'tools',
						items : [ 'Maximize', '-', 'About' ]
					} ];

	}-*/;
    }

    public TextArea getTextArea() {
	return textArea;
    }

}
