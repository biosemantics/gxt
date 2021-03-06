/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.base.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.sencha.gxt.core.client.dom.XElement;
import com.sencha.gxt.core.client.resources.StyleInjectorHelper;
import edu.arizona.biosemantics.gxt.theme.green.client.ThemeDetails;
import com.sencha.gxt.widget.core.client.DatePicker.DatePickerAppearance;
import com.sencha.gxt.widget.core.client.DatePicker.DatePickerMessages;
import com.sencha.gxt.widget.core.client.DatePicker.DateState;

import java.util.List;

/**
 *
 */
public class Css3DatePickerAppearance implements DatePickerAppearance {

  public interface Css3DatePickerResources extends ClientBundle {
    @Source("Css3DatePicker.css")
    Css3DatePickerStyle style();

    ThemeDetails theme();

    ImageResource downIcon();

    ImageResource leftButton();

    @ImageOptions(repeatStyle = RepeatStyle.None)
    @Source("leftButton.png")
    ImageResource leftIcon();

    ImageResource rightButton();

    @ImageOptions(repeatStyle = RepeatStyle.None)
    @Source("rightButton.png")
    ImageResource rightIcon();
  }

  public interface Css3DatePickerStyle extends CssResource {
    String columnHeader();

    String columnHeaderInner();

    String date();

    String dateAnchor();

    String dateActive();

    String dateDisabled();

    String dateNext();

    String dateOver();

    String datePicker();

    String datePrevious();

    String dateSelected();

    String dateToday();

    String leftYearIcon();

    String middle();

    String month();

    String monthPickerItem();

    String monthPickerItemInner();

    String monthSep();

    String monthSelected();

    String year();

    String yearButton();

    String monthButtons();

    String monthLeft();

    String monthRight();

    String monthButton();

    String monthButtonText();

    String monthLeftButton();

    String monthRightButton();

    String rightYearIcon();

    String daysWrap();

    String bottom();

    String header();

    String monthPicker();

    String downIcon();

    String cancel();

    String ok();
  }

  private final Css3DatePickerResources resources;
  private final Css3DatePickerStyle style;

  public Css3DatePickerAppearance() {
    this(GWT.<Css3DatePickerResources>create(Css3DatePickerResources.class));
  }

  public Css3DatePickerAppearance(Css3DatePickerResources resources) {
    this.resources = resources;
    this.style = resources.style();

    StyleInjectorHelper.ensureInjected(style, true);
  }


  
  public String dateSelector() {
    return "." + style.date();
  }

  
  public String daySelector() {
    return "." + style.dateAnchor();
  }

  
  public NodeList<Element> getDateCells(XElement parent) {
    return parent.select("." + style.date());
  }

  
  public boolean isDisabled(Element cell) {
    return cell.<XElement>cast().hasClassName(style.dateDisabled());
  }

  
  public String leftMonthSelector() {
    return "." + style.monthLeftButton();
  }

  
  public String leftYearSelector() {
    return "." + style.leftYearIcon();
  }

  
  public String monthButtonSelector() {
    return "." + style.monthButton();
  }

  
  public String monthPickerCancelSelector() {
    return "." + style.cancel();
  }

  
  public String monthPickerMonthSelector() {
    return "." + style.month();
  }

  
  public String monthPickerOkSelector() {
    return "." + style.ok();
  }

  
  public String monthPickerYearSelector() {
    return "." + style.year();
  }


  
  public void onMonthSelected(Element cell, boolean select) {
    cell.<XElement>cast().setClassName(style.monthSelected(), select);
  }



  
  public void onUpdateDateStyle(Element cell, DateState type, boolean add) {

    String cls = "";

    switch (type) {
      case ACTIVE:
        cls = style.dateActive();
        break;
      case DISABLED:
        cls = style.dateDisabled();
        break;
      case NEXT:
        cls = style.dateNext();
        break;
      case PREVIOUS:
        cls = style.datePrevious();
        break;
      case OVER:
        cls = style.dateOver();
        break;
      case SELECTED:
        cls = style.dateSelected();
        break;
      case TODAY:
        cls = style.dateToday();
        break;
    }

    XElement elem = cell.cast();
    elem.setClassName(cls, add);
  }

  

  
  public void render(SafeHtmlBuilder sb) {
    sb.appendHtmlConstant("<div class=" + style.datePicker() + ">");

    sb.appendHtmlConstant("<table width=100% cellpadding=0 cellspacing=0 class=" + style.header() + "><tr>");
    sb.appendHtmlConstant("<td class=" + style.monthLeft() + "><div class=" + style.monthLeftButton() + "></div></td>");
    sb.appendHtmlConstant("<td class=" + style.middle() + " align=center>");

    sb.appendHtmlConstant("<table cellpadding=0 cellspacing=0 class=" + style.monthButton() + "><tr>");
    sb.appendHtmlConstant("<td class=" + style.monthButtonText() + "></td><td><div class=" + style.downIcon()
        + ">&nbsp;</div></td></tr></table>");

    sb.appendHtmlConstant("</td>");
    sb.appendHtmlConstant("<td class=" + style.monthRight() + "><div class=" + style.monthRightButton()
        + "></div></td></tr></table>");

    sb.appendHtmlConstant("<div role=grid><table width=100% cellpadding=0 cellspacing=0 class=" + style.daysWrap()
        + "><thead><tr>");
    for (int i = 0; i < 7; i++) {
      sb.appendHtmlConstant("<th class=" + style.columnHeader() + "><span class=" + style.columnHeaderInner() + ">" + i + "</span></th>");
    }
    sb.appendHtmlConstant("</tr></thead>");

    sb.appendHtmlConstant("<tbody>");
    for (int i = 0; i < 6; i++) {
      sb.appendHtmlConstant("<tr>");
      for (int j = 0; j < 7; j++) {
        sb.appendHtmlConstant("<td class=" + style.date() + "><a href=# class=" + style.dateAnchor()
            + "></a></td>");
      }
      sb.appendHtmlConstant("</tr>");
    }
    sb.appendHtmlConstant("</tbody></table></div>");

    sb.appendHtmlConstant("<table width=100% cellpadding=0 cellspacing=0><tr><td class=" + style.bottom()
        + " align=center></td></tr></table>");

    sb.appendHtmlConstant("</div>");

  }

  
  public void renderMonthPicker(SafeHtmlBuilder sb, DatePickerMessages messages, String[] monthNames) {
    sb.appendHtmlConstant("<div class=" + style.monthPicker() + "><table border=0 cellspacing=0>");

    for (int i = 0; i < 6; i++) {
      sb.appendHtmlConstant("<tr><td class='" + style.monthPickerItem() + " " + style.month() + "'><a class=" + style.monthPickerItemInner() + " href=#>");
      sb.appendHtmlConstant(monthNames[i]);
      sb.appendHtmlConstant("</a></td>");
      sb.appendHtmlConstant("<td class='" + style.monthPickerItem() + " " + style.month() + " " + style.monthSep() + "'><a class=" + style.monthPickerItemInner() + " href=#>");
      sb.appendHtmlConstant(monthNames[i + 6]);
      sb.appendHtmlConstant("</a></td>");
      if (i == 0) {
        sb.appendHtmlConstant("<td class=" + style.yearButton() + " align=center>");
        sb.appendHtmlConstant("<div class=" + style.leftYearIcon() + "></div>");
        sb.appendHtmlConstant("</td><td class='" + style.yearButton() + "' align=center>");
        sb.appendHtmlConstant("<div class=" + style.rightYearIcon() + "></div>");
        sb.appendHtmlConstant("</td></tr>");
      } else {
        sb.appendHtmlConstant("<td class='" + style.monthPickerItem() + " " + style.year()
            + "'><a class=" + style.monthPickerItemInner() + " href='#'></a></td><td class='" + style.monthPickerItem() + " " + style.year()
            + "'><a class=" + style.monthPickerItemInner() + " href='#'></a></td></tr>");
      }
    }


    sb.appendHtmlConstant("<tr class=" + style.monthButtons() + "><td colspan='4'>");
    sb.appendHtmlConstant("<div class=" + style.ok() + "></div>");
    sb.appendHtmlConstant("<div class=" + style.cancel() + "></div>");
    sb.appendHtmlConstant("</td></tr></table></div>");
  }

  
  public String rightMonthSelector() {
    return "." + style.monthRightButton();
  }

  
  public String rightYearSelector() {
    return "." + style.rightYearIcon();
  }

  
  public String todayButtonSelector() {
    return "." + style.bottom();
  }

  
  public void onMonthPickerSize(XElement monthPicker, int width, int height) {
    int lb = resources.theme().datePicker().border().left();
    int rb = resources.theme().datePicker().border().right();
    int borderOffset = lb + rb;

    height = height + borderOffset;

    monthPicker.setTop(-resources.theme().datePicker().border().top());
    monthPicker.setLeft(-lb);
    monthPicker.setSize(width + borderOffset, height);
    monthPicker.getFirstChildElement().getFirstChildElement().<XElement>cast().setSize(width, height, true);
  }
  
//hong 618
  public void onMonthButtonTextChange(XElement parent, String text) {
    parent.selectNode("." + style.monthButtonText()).setInnerHTML(text);
  }


public void onMonthButtonHtmlChange(XElement parent, SafeHtml html) {
	 parent.selectNode("." + style.monthButtonText()).setInnerHTML(html.asString());
}

//hong 618
public void onTextChange(Element cell, String text) {
  cell.getFirstChildElement().setInnerHTML(text);
}


public void onHtmlChange(Element cell, SafeHtml html) {
	cell.getFirstChildElement().setInnerHTML(html.asString());
	
}

/*public void onUpdateDayOfWeeks(XElement parent, List<String> values) {
  NodeList<Element> elems = parent.select("." + style.columnHeaderInner());
  for (int i = 0; i < elems.getLength(); i++) {
    elems.getItem(i).setInnerHTML(values.get(i));
  }
}*/


public void onUpdateDayOfWeeks(XElement parent, List<SafeHtml> days) {
	NodeList<Element> elems = parent.select("." + style.columnHeaderInner());
	  for (int i = 0; i < elems.getLength(); i++) {
	    elems.getItem(i).setInnerHTML((days.get(i)).asString());
	  }
	
}
}
