package be.nmine.pocjsni.client.utils;

public class JsniUtils {

    public static native void disableAllElementsFromParent(String id, boolean disable) /*-{
		$wnd.$('#' + id).find('select, input, button')
				.attr('disabled', disable);
		$wnd.$('#' + id).find('a').removeAttr('href');
		$('a').click(function(e) {
			e.preventDefault();
		});
		$('a').addClass('disable_link');
    }-*/;

    public static native void disableAllElementsFromParent(boolean disable, String... ids) /*-{
		$wnd.$('#' + ids[0]).find('select, input, button').attr('disabled',
				disable);
    }-*/;

    public static native void disableAllDatesElementsFromParent(String id) /*-{
		$wnd.$(id).find('.addon-icon').hide();
    }-*/;

    public static native void addToolTip(String id, String text) /*-{
		$wnd.$('#' + id).tooltip({
			'trigger' : 'hover',
			'placement' : 'bottom',
			'title' : 'text'
		});
		$wnd.$('#' + id).click(function() {
			$wnd.$('#' + id).tooltip('hide');
		});
		$wnd.$('#' + id).keydown(function() {
			$wnd.$('#' + id).tooltip('hide');
		});
		$wnd.$('#' + id).hover(function() {
			$wnd.$('#' + id).tooltip('enable');
		});
    }-*/;

    public static native void enablePdfLink(String className, boolean enable) /*-{
		if (enable) {
			$wnd.$('.' + className)
					.find('.PDFAnchorActive, .PDFAnchorInactive').removeClass(
							'PDFAnchorInactive').addClass('PDFAnchorActive');
		} else {
			$wnd.$('.' + className)
					.find('.PDFAnchorActive, .PDFAnchorInactive').removeClass(
							'PDFAnchorActive').addClass('PDFAnchorInactive');
		}
    }-*/;

    // adding Bootstrap tooltip, enable by default, hide on click and onKeyDown
    public static native void enableErrorStylesOnCKEditors(String className, boolean enable) /*-{
		if (enable) {
			$wnd.$('.' + className).find('.cke').addClass(
					'errorBootstrapValueBox');
		} else {
			$wnd.$('.' + className).find('.cke').removeClass(
					'errorBootstrapValueBox');
		}
    }-*/;

    public static native void disableToolTip(String id) /*-{
		$wnd.$('#' + id).tooltip('disable');
    }-*/;

}
