/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.base.button;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.sencha.gxt.core.client.XTemplates;
import com.sencha.gxt.core.client.XTemplates.XTemplate;
import com.sencha.gxt.core.client.dom.XElement;
import com.sencha.gxt.core.client.resources.StyleInjectorHelper;
import com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance.ButtonGroupStyle;
import edu.arizona.biosemantics.gxt.theme.green.client.ThemeDetails;
import com.sencha.gxt.widget.core.client.button.ButtonGroup.ButtonGroupAppearance;

public class Css3ButtonGroupAppearance implements ButtonGroupAppearance {

  public interface Css3ButtonGroupResources extends ClientBundle {
    @Source("Css3ButtonGroup.css")
    Css3ButtonGroupStyle style();

    ThemeDetails theme();
  }

  public interface Css3ButtonGroupStyle extends CssResource {
    String group();

    String body();

    String header();
  }

  public interface Css3ButtonGroupTemplate extends XTemplates {
    @XTemplate("<div class='{style.group}'><div class='{style.header}'></div><div class='{style.body}'></div></div>")
    SafeHtml render(Css3ButtonGroupStyle style);
  }

  private final Css3ButtonGroupResources resources;
  private final Css3ButtonGroupStyle style;
  private final Css3ButtonGroupTemplate template;

  public Css3ButtonGroupAppearance() {
    this(GWT.<Css3ButtonGroupResources> create(Css3ButtonGroupResources.class));
  }

  public Css3ButtonGroupAppearance(Css3ButtonGroupResources resources) {
    this.resources = resources;
    style = resources.style();
    template = GWT.create(Css3ButtonGroupTemplate.class);

    StyleInjectorHelper.ensureInjected(resources.style(), true);
  }

  
  public void render(SafeHtmlBuilder sb) {
    sb.append(template.render(style));
  }

  //hong 618
  public void updateText(XElement parent, String text) {
    getHeaderElement(parent).setInnerText(text);
  }
  
  //hong 618: this replaces updateText
  
  public void setHeading(XElement parent, SafeHtml html) {
	  getHeaderElement(parent).setInnerSafeHtml(html);  	
  }
  
  
  public void onHideHeader(XElement parent, boolean hide) {
    getHeaderElement(parent).setVisible(!hide);
  }

  
  public XElement getHeaderElement(XElement parent) {
    return parent.getFirstChildElement().cast();
  }

  
  public XElement getContentElem(XElement parent) {
    return parent.selectNode("." + style.body());
  }

  
  public int getFrameHeight(XElement parent) {
    return resources.theme().buttonGroup().borderRadius() * 2;
  }

  
  public int getFrameWidth(XElement parent) {
    return resources.theme().buttonGroup().borderRadius() * 2;
  }



}
