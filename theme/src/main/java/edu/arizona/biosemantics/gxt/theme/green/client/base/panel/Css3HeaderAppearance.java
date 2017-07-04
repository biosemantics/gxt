/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.base.panel;


import com.google.gwt.core.client.GWT;
import com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance;
import edu.arizona.biosemantics.gxt.theme.green.client.ThemeDetails;

/**
 */
public class Css3HeaderAppearance extends HeaderDefaultAppearance {

  public interface Css3HeaderStyle extends HeaderStyle {
    
    String header();

    
    String headerBar();

    
    String headerHasIcon();

    
    String headerIcon();

    
    String headerText();
  }

  public interface Css3HeaderResources extends HeaderResources {

    
    @Source({"com/sencha/gxt/theme/base/client/widget/Header.css", "Css3Header.css"})
    Css3HeaderStyle style();
    
    ThemeDetails theme();
  }
  
  public Css3HeaderAppearance() {
    this(GWT.<Css3HeaderResources>create(Css3HeaderResources.class));
  }

  public Css3HeaderAppearance(Css3HeaderResources resources) {
    super(resources);
  }
}
