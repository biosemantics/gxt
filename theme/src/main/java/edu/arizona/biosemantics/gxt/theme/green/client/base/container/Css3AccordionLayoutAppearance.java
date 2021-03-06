/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.base.container;

import com.google.gwt.core.shared.GWT;
import edu.arizona.biosemantics.gxt.theme.green.client.base.panel.Css3ContentPanelAppearance;
import edu.arizona.biosemantics.gxt.theme.green.client.base.panel.Css3HeaderAppearance;
import edu.arizona.biosemantics.gxt.theme.green.client.base.panel.Css3HeaderAppearance.Css3HeaderResources;
import edu.arizona.biosemantics.gxt.theme.green.client.base.panel.Css3HeaderAppearance.Css3HeaderStyle;
import com.sencha.gxt.widget.core.client.Header.HeaderAppearance;
import com.sencha.gxt.widget.core.client.button.ToolButton;
import com.sencha.gxt.widget.core.client.button.IconButton.IconConfig;
import com.sencha.gxt.widget.core.client.container.AccordionLayoutContainer.AccordionLayoutAppearance;

public class Css3AccordionLayoutAppearance extends Css3ContentPanelAppearance implements AccordionLayoutAppearance {

  public interface Css3AccordionResources extends Css3ContentPanelResources {
    
    @Source({"Css3AccordionLayout.css"})
    Css3AccordionStyle style();
  }
  
  public interface Css3AccordionStyle extends Css3ContentPanelStyle {
    
  }
  
  public interface Css3AccordionHeaderStyle extends Css3HeaderStyle {

  }

  public interface Css3AccordionHeaderResources extends Css3HeaderResources {
    
    @Source({"com/sencha/gxt/theme/base/client/widget/Header.css", "Css3AccordionLayoutHeader.css"})
    Css3AccordionHeaderStyle style();
  }
  
  public Css3AccordionLayoutAppearance() {
    super(GWT.<Css3AccordionResources>create(Css3AccordionResources.class));
  }
  
  
  public HeaderAppearance getHeaderAppearance() {
    return new Css3HeaderAppearance(GWT.<Css3AccordionHeaderResources>create(Css3AccordionHeaderResources.class));
  }
  
  
  public IconConfig collapseIcon() {
    return ToolButton.MINUS;
  }

  
  public IconConfig expandIcon() {
    return ToolButton.PLUS;
  }
}
