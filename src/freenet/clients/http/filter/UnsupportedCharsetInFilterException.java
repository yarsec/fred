package freenet.clients.http.filter;

import freenet.l10n.NodeL10n;
import freenet.support.HTMLNode;

public class UnsupportedCharsetInFilterException extends
		UnsafeContentTypeException {

	final String charset;
	
	public UnsupportedCharsetInFilterException(String string) {
		charset = string;
	}

	@Override
	public String getExplanation() {
		return l10n("explanation");
	}

	@Override
	public String getHTMLEncodedTitle() {
		return l10n("title", "charset", charset);
	}

	@Override
	public HTMLNode getHTMLExplanation() {
		return new HTMLNode("div", l10n("explanation"));
	}

	@Override
	public String getRawTitle() {
		return l10n("title", "charset", charset);
	}
	
	public String l10n(String message) {
		return NodeL10n.getBase().getString("UnsupportedCharsetInFilterException."+message);
	}

	public String l10n(String message, String key, String value) {
		return NodeL10n.getBase().getString("UnsupportedCharsetInFilterException."+message, key, value);
	}

}
