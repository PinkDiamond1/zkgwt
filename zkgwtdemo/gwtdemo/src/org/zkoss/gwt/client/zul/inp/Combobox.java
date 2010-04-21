package org.zkoss.gwt.client.zul.inp;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Combobox extends org.zkoss.gwt.client.zul.inp.ComboWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.inp.Combobox();
	}-*/;

	
	public native void setAutocomplete(boolean autocomplete)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAutocomplete(autocomplete);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/inp//Combobox.js line:[51]
	
	public native boolean isAutocomplete()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isAutocomplete();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/inp//Combobox.js line:[35]
	
	public native void getRepos()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.getRepos();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/inp//Combobox.js line:[56]
	
	public native void validateStrict(String val)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.validateStrict(val);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/inp//Combobox.js line:[95]
}
