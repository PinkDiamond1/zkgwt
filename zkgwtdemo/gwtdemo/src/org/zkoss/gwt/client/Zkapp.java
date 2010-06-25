/**
 * 
 */
package org.zkoss.gwt.client;

import org.zkoss.gwt.client.zkex.grid.Detail;
import org.zkoss.gwt.client.zkex.grid.Group;
import org.zkoss.gwt.client.zkex.layout.Columnchildren;
import org.zkoss.gwt.client.zkex.layout.Columnlayout;
import org.zkoss.gwt.client.zul.grid.Column;
import org.zkoss.gwt.client.zul.grid.Columns;
import org.zkoss.gwt.client.zul.grid.Grid;
import org.zkoss.gwt.client.zul.grid.Row;
import org.zkoss.gwt.client.zul.grid.Rows;
import org.zkoss.gwt.client.zul.inp.Bandbox;
import org.zkoss.gwt.client.zul.inp.Bandpopup;
import org.zkoss.gwt.client.zul.inp.Textbox;
import org.zkoss.gwt.client.zul.layout.Borderlayout;
import org.zkoss.gwt.client.zul.layout.Center;
import org.zkoss.gwt.client.zul.layout.North;
import org.zkoss.gwt.client.zul.layout.South;
import org.zkoss.gwt.client.zul.menu.Menu;
import org.zkoss.gwt.client.zul.menu.Menubar;
import org.zkoss.gwt.client.zul.menu.Menuitem;
import org.zkoss.gwt.client.zul.menu.Menupopup;
import org.zkoss.gwt.client.zul.menu.Menuseparator;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wgt.Cell;
import org.zkoss.gwt.client.zul.wgt.Div;
import org.zkoss.gwt.client.zul.wgt.Image;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wgt.Toolbar;
import org.zkoss.gwt.client.zul.wnd.Panel;
import org.zkoss.gwt.client.zul.wnd.Panelchildren;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author Peter
 *
 */
public class Zkapp implements EntryPoint {

	
	private VerticalPanel panel = new VerticalPanel();
		
		
	@Override
	public void onModuleLoad() {

		panel.add(genWidget());
		
		RootPanel.get().add(panel);		
	}
	
	public Widget genWidget(){
		
		Panel panel_1 = new Panel();
		
		panel_1.setBorder("normal");
		panel_1.setCollapsible(true);
		panel_1.setFramable(true);
		panel_1.setHeight("400px");
		panel_1.setTitle("Chat");
		panel_1.setWidth("500px");
		Toolbar toolbar_11 = new Toolbar();
		panel_1.add(toolbar_11);
		Label label_111= new Label();
		toolbar_11.add(label_111);
		label_111.setValue("Contact:");
		Bandbox bandbox_112 = new Bandbox();
		toolbar_11.add(bandbox_112);
		bandbox_112.setAutodrop(true);
		bandbox_112.setWidth("350px");
		
		Bandpopup bandpopup_1121 = new Bandpopup();
		bandbox_112.add(bandpopup_1121);
		bandpopup_1121.setWidth("320px");
		Grid grid_11211 = new Grid();
		bandpopup_1121.add(grid_11211);
		Columns columns_112111 = new Columns();
		grid_11211.add(columns_112111);
		Column column_1121111 = new Column();
		columns_112111.add(column_1121111);
		column_1121111.setWidth("25px");
		Column column_1121112 = new Column();
		columns_112111.add(column_1121112);
		column_1121112.setLabel("Name");
		Column column_1121113 = new Column();
		columns_112111.add(column_1121113);
		column_1121113.setLabel("Phone");
		Rows rows_112112 = new Rows();
		grid_11211.add(rows_112112);
		Group group_1121121 = new Group();
		rows_112112.add(group_1121121);
		Label label_11211211 = new Label();
		group_1121121.add(label_11211211);
		label_11211211.setValue("Colleague");
		Row row_1121122 = new Row();
		rows_112112.add(row_1121122);
		Detail detail_11211221 = new Detail();
		row_1121122.add(detail_11211221);
		Grid grid_112112211 = new Grid();
		detail_11211221.add(grid_112112211);
		Rows rows_1121122111 = new Rows();
		grid_112112211.add(rows_1121122111);
		Row row_11211221111 = new Row();
		rows_1121122111.add(row_11211221111);
		Cell cell_112112211111 = new Cell();
		row_11211221111.add(cell_112112211111);
		cell_112112211111.setRowspan(2);
		Image image_1121122111111 = new Image();
		cell_112112211111.add(image_1121122111111);
		image_1121122111111.setSrc("/test2/img/icon_users.png");		
		image_1121122111111.setWidth("90%");
		Label label_112112211112 = new Label();
		row_11211221111.add(label_112112211112);
		label_112112211112.setValue("Product");
		Label label_112112211113 = new Label();
		row_11211221111.add(label_112112211113);
		label_112112211113.setValue("ZK");
		Row row_11211221112 = new Row();
		rows_1121122111.add(row_11211221112);
		Label label_112112211121 = new Label();
		row_11211221112.add(label_112112211121);
		label_112112211121.setValue("Habit");
		Label label_112112211122 = new Label();
		row_11211221112.add(label_112112211122);
		label_112112211122.setValue("coding");
		Label label_11211222 = new Label();
		row_1121122.add(label_11211222);
		label_11211222.setValue("Tom");
		Label label_11211223 = new Label();
		row_1121122.add(label_11211223);
		label_11211223.setValue("0001");
		Group group_1121123 = new Group();
		rows_112112.add(group_1121123);
		Label label_11211231 = new Label();
		group_1121123.add(label_11211231);
		label_11211231.setValue("Family");
		Row row_1121124 = new Row();
		rows_112112.add(row_1121124);
		Detail detail_11211241 = new Detail();
		row_1121124.add(detail_11211241);
		Grid grid_112112411 = new Grid();
		detail_11211241.add(grid_112112411);
		Rows rows_1121124111 = new Rows();
		grid_112112411.add(rows_1121124111);
		Row row_11211241111 = new Row();
		rows_1121124111.add(row_11211241111);
		Cell cell_112112411111 = new Cell();
		row_11211241111.add(cell_112112411111);
		cell_112112411111.setRowspan(2);
		Image image_1121124111111 = new Image();
		cell_112112411111.add(image_1121124111111);
		image_1121124111111.setSrc("/test2/img/icon_browser.png");
		image_1121124111111.setWidth("90%");
		Label label_112112411112 = new Label();
		row_11211241111.add(label_112112411112);
		label_112112411112.setValue("Product");
		Label label_112112411113 = new Label();
		row_11211241111.add(label_112112411113);
		label_112112411113.setValue("home");
		Row row_11211241112 = new Row();
		rows_1121124111.add(row_11211241112);
		Label label_112112411121 = new Label();
		row_11211241112.add(label_112112411121);
		label_112112411121.setValue("Habit");
		Label label_112112411122 = new Label();
		row_11211241112.add(label_112112411122);
		label_112112411122.setValue("car");
		Label label_11211242 = new Label();
		row_1121124.add(label_11211242);
		label_11211242.setValue("Father");
		Label label_11211243 = new Label();
		row_1121124.add(label_11211243);
		label_11211243.setValue("8888");
		Row row_1121125 = new Row();
		rows_112112.add(row_1121125);
		Detail detail_11211251 = new Detail();
		row_1121125.add(detail_11211251);
		Grid grid_112112511 = new Grid();
		detail_11211251.add(grid_112112511);
		Rows rows_1121125111 = new Rows();
		grid_112112511.add(rows_1121125111);
		Row row_11211251111 = new Row();
		rows_1121125111.add(row_11211251111);
		Cell cell_112112511111 = new Cell();
		row_11211251111.add(cell_112112511111);
		cell_112112511111.setRowspan(2);
		Image image_1121125111111 = new Image();
		cell_112112511111.add(image_1121125111111);
		image_1121125111111.setSrc("/test2/img/icon_calendar.png");
		image_1121125111111.setWidth("90%");
		Label label_112112511112 = new Label();
		row_11211251111.add(label_112112511112);
		label_112112511112.setValue("Product");
		Label label_112112511113 = new Label();
		row_11211251111.add(label_112112511113);
		label_112112511113.setValue("me");
		Row row_11211251112 = new Row();
		rows_1121125111.add(row_11211251112);
		Label label_112112511121 = new Label();
		row_11211251112.add(label_112112511121);
		label_112112511121.setValue("Habit");
		Label label_112112511122 = new Label();
		row_11211251112.add(label_112112511122);
		label_112112511122.setValue("cooking");
		Label label_11211252 = new Label();
		row_1121125.add(label_11211252);
		label_11211252.setValue("Mother");
		Label label_11211253 = new Label();
		row_1121125.add(label_11211253);
		label_11211253.setValue("8888");
		Panelchildren panelchildren_12 = new Panelchildren();
		panel_1.add(panelchildren_12);
		Columnlayout columnlayout_121 = new Columnlayout();
		panelchildren_12.add(columnlayout_121);
		Columnchildren columnchildren_1211 = new Columnchildren();
		columnlayout_121.add(columnchildren_1211);
		columnchildren_1211.setWidth("100%");
		Panel panel_12111 = new Panel();
		columnchildren_1211.add(panel_12111);
		panel_12111.setHeight("260px");
		Panelchildren panelchildren_121111 = new Panelchildren();
		panel_12111.add(panelchildren_121111);
		Borderlayout borderlayout_1211111 = new Borderlayout();
		panelchildren_121111.add(borderlayout_1211111);
		Center center_12111111 = new Center();
		borderlayout_1211111.add(center_12111111);
		center_12111111.setFlex(true);
		Div div_121111111 = new Div();
		center_12111111.add(div_121111111);
		div_121111111.setStyle("overflow:auto;");
		Label textbox_1211111111 = new Label();
		div_121111111.add(textbox_1211111111);
		textbox_1211111111.setValue("Welcome to ZK GWT");
		South south_12111112 = new South();
		borderlayout_1211111.add(south_12111112);
		south_12111112.setFlex(true);
		south_12111112.setSize("25%");
		south_12111112.setSize("25%");
		south_12111112.setSplittable(true);
		Textbox textbox_121111121 = new Textbox();
		south_12111112.add(textbox_121111121);
		textbox_121111121.setMultiline(true);
		textbox_121111121.setStyle("margin:0px");
		textbox_121111121.setValue("Hi, I am Jumper. (Please press the OK Button)",false);
		textbox_121111121.setWidth("98%");
		Columnchildren columnchildren_1212 = new Columnchildren();
		columnlayout_121.add(columnchildren_1212);
		columnchildren_1212.setWidth("130px");
		Panel panel_12121 = new Panel();
		columnchildren_1212.add(panel_12121);
		panel_12121.setHeight("260px");
		panel_12121.setWidth("100%");
		Panelchildren panelchildren_121211 = new Panelchildren();
		panel_12121.add(panelchildren_121211);
		Borderlayout borderlayout_1212111 = new Borderlayout();
		panelchildren_121211.add(borderlayout_1212111);
		borderlayout_1212111.setStyle("background:transparent");
		borderlayout_1212111.setWidth("100%");
		North north_12121111 = new North();
		borderlayout_1212111.add(north_12121111);
		north_12121111.setBorder("none");
		north_12121111.setSize("120px");
		north_12121111.setSize("120px");
		north_12121111.setStyle("background:transparent");
		Image image_121211111 = new Image();
		north_12121111.add(image_121211111);
		image_121211111.setSrc("/res/img/msn1.gif");
		South south_12121112 = new South();
		borderlayout_1212111.add(south_12121112);
		south_12121112.setBorder("none");
		south_12121112.setSize("120px");
		south_12121112.setSize("120px");
		south_12121112.setStyle("background:transparent");
		Image image_121211121 = new Image();
		south_12121112.add(image_121211121);
		image_121211121.setSrc("/res/img/msn2.gif");
		Toolbar toolbar_13 = new Toolbar();
		panel_1.add(toolbar_13);
		Menubar menubar_131 = new Menubar();
		toolbar_13.add(menubar_131);
		menubar_131.setWidth("200px");
		Menu menu_1311 = new Menu();
		menubar_131.add(menu_1311);
		menu_1311.setImage("/res/img/Centigrade-Widget-Icons/Briefcase-16x16.png");
		menu_1311.setLabel("Project");
		Menupopup menupopup_13111 = new Menupopup();
		menu_1311.add(menupopup_13111);
		Menuitem menuitem_131111 = new Menuitem();
		menupopup_13111.add(menuitem_131111);
		menuitem_131111.setImage("/res/img/Centigrade-Widget-Icons/BriefcaseSpark-16x16.png");
		menuitem_131111.setLabel("New");
		Menuitem menuitem_131112 = new Menuitem();
		menupopup_13111.add(menuitem_131112);
		menuitem_131112.setImage("/res/img/Centigrade-Widget-Icons/BriefcaseOpen-16x16.png");
		menuitem_131112.setLabel("Open");
		Menuitem menuitem_131113 = new Menuitem();
		menupopup_13111.add(menuitem_131113);
		menuitem_131113.setImage("/res/img/Centigrade-Widget-Icons/DisketteBlack-16x16.png");
		menuitem_131113.setLabel("Save");
		Menuseparator menuseparator_131114 = new Menuseparator();
		menupopup_13111.add(menuseparator_131114);
		Menuitem menuitem_131115 = new Menuitem();
		menupopup_13111.add(menuitem_131115);
		menuitem_131115.setImage("/res/img/Centigrade-Widget-Icons/DoorOpen-16x16.png");
		menuitem_131115.setLabel("Exit");
		Menu menu_1312 = new Menu();
		menubar_131.add(menu_1312);
		menu_1312.setImage("/res/img/Centigrade-Widget-Icons/QuestionmarkButton-16x16.png");
		menu_1312.setLabel("Help");
		Menupopup menupopup_13121 = new Menupopup();
		menu_1312.add(menupopup_13121);
		Menuitem menuitem_131211 = new Menuitem();
		menupopup_13121.add(menuitem_131211);
		menuitem_131211.setLabel("Index");
		Menu menu_131212 = new Menu();
		menupopup_13121.add(menu_131212);
		menu_131212.setLabel("About");
		Menupopup menupopup_1312121 = new Menupopup();
		menu_131212.add(menupopup_1312121);
		Menuitem menuitem_13121211 = new Menuitem();
		menupopup_1312121.add(menuitem_13121211);
		menuitem_13121211.setLabel("About ZK");
		Menuitem menuitem_13121212 = new Menuitem();
		menupopup_1312121.add(menuitem_13121212);
		menuitem_13121212.setLabel("About Potix");
		Menu menu_1313 = new Menu();
		menubar_131.add(menu_1313);
		menu_1313.setImage("/res/img/Centigrade-Widget-Icons/Spyglass-16x16.png");
		Menupopup menupopup_13131 = new Menupopup();
		menu_1313.add(menupopup_13131);
		Menuitem menuitem_131311 = new Menuitem();
		menupopup_13131.add(menuitem_131311);
		menuitem_131311.setLabel("Index");
		Toolbar toolbar_14 = new Toolbar();
		panel_1.add(toolbar_14);
		toolbar_14.setAlign("center");
		toolbar_14.setMold("panel");
		Button button_141 = new Button();
		toolbar_14.add(button_141);
		button_141.setLabel("OK");
		button_141.setWidth("65px");
		Button button_142 = new Button();
		toolbar_14.add(button_142);
		button_142.setLabel("Cancel");
		button_142.setWidth("65px");



		
		return panel_1;
	}
}

