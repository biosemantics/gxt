/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.base.info;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.sencha.gxt.core.client.XTemplates;
import edu.arizona.biosemantics.gxt.theme.green.client.ThemeDetails;
import com.sencha.gxt.widget.core.client.info.DefaultInfoConfig.DefaultInfoConfigAppearance;

public class Css3DefaultInfoConfigAppearance implements DefaultInfoConfigAppearance {
  interface Style extends CssResource {
    String header();
    String message();
  }
  interface Resources extends ClientBundle {
    Style infoConfig();
    ThemeDetails theme();
  }
  interface Template extends XTemplates {
    @XTemplate("<div class='{style.header}'>{title}</div><div class='{style.message}'>{message}</div>")
    SafeHtml render(Style style, SafeHtml title, SafeHtml message);
  }

  private Template template;
  private Style style;

  public Css3DefaultInfoConfigAppearance() {
    template = GWT.create(Template.class);
    Resources res = GWT.create(Resources.class);
    style = res.infoConfig();
    style.ensureInjected();
  }

  
  public void render(SafeHtmlBuilder sb, SafeHtml title, SafeHtml message) {
    sb.append(template.render(style, title, message));
  }
}
