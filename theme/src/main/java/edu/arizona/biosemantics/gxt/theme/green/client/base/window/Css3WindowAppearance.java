/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.base.window;

import com.google.gwt.core.client.GWT;
import edu.arizona.biosemantics.gxt.theme.green.client.base.panel.Css3FramedPanelAppearance;
import com.sencha.gxt.widget.core.client.Window.WindowAppearance;

public class Css3WindowAppearance extends Css3FramedPanelAppearance implements WindowAppearance {

  public interface Css3WindowResources extends Css3FramedPanelResources {
    
    @Source("Css3Window.css")
    Css3WindowStyle style();
  }
  
  public interface Css3WindowStyle extends Css3FramedPanelStyle {
    String ghost();
  }
  private final Css3WindowResources resources;
  
  private final Css3WindowStyle style;

  public Css3WindowAppearance() {
    this(GWT.<Css3WindowResources> create(Css3WindowResources.class),
        GWT.<FramedPanelTemplate> create(FramedPanelTemplate.class));
  }

  public Css3WindowAppearance(Css3WindowResources resources, FramedPanelTemplate template) {
    super(resources, template);
    this.resources = resources;
    this.style = this.resources.style();
  }

  
  public String ghostClass() {
    return style.ghost();
  }

}
