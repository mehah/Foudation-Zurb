package foundation.zurb.com;

import greencode.jscript.DOMHandle;
import greencode.jscript.Node;
import greencode.jscript.Window;

import com.jQuery.JQuery;

public class Foundation extends JQuery {

	public Foundation(Node e, Window window) {
		super(e, window);
	}

	public Foundation(Node e) {
		super(e);
	}

	public Foundation(JQuery j, Window window) {
		super(j, window);
	}

	public Foundation(JQuery j) {
		super(j);
	}

	public Foundation(String selector, Window window) {
		super(selector, window);
	}

	public Foundation(String selector) {
		super(selector);
	}

	public Foundation foundation() {
		DOMHandle.execCommand(this, "foundation");		
		return this;
	}
	
	public Foundation foundation(String arg0) {
		DOMHandle.execCommand(this, "foundation", arg0);		
		return this;
	}
	
	public Foundation foundation(String arg0, String arg1) {
		DOMHandle.execCommand(this, "foundation", arg0, arg1);		
		return this;
	}
}
