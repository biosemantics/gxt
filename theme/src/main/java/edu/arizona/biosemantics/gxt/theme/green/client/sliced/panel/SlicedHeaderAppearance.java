/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.sliced.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import edu.arizona.biosemantics.gxt.theme.green.client.base.panel.Css3HeaderAppearance;

/**
 *
 */
public class SlicedHeaderAppearance extends Css3HeaderAppearance {

  public interface SlicedHeaderResources extends Css3HeaderResources {
    @Source({"com/sencha/gxt/theme/base/client/widget/Header.css",
            "edu/arizona/biosemantics/gxt/theme/green/client/base/panel/Css3Header.css",
            "SlicedHeader.css"})
    
    SlicedHeaderStyle style();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Source("panel-background.png")
    ImageResource headerBackground();
  }

  public interface SlicedHeaderStyle extends Css3HeaderStyle {
  }

  public SlicedHeaderAppearance() {
    this(GWT.<SlicedHeaderResources>create(SlicedHeaderResources.class));
  }

  public SlicedHeaderAppearance(SlicedHeaderResources resources) {
    super(resources);
  }

}
