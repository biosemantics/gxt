/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.sliced.tabs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.sencha.gxt.core.client.XTemplates;
import com.sencha.gxt.core.client.dom.XElement;
import com.sencha.gxt.widget.core.client.TabPanel.TabPanelBottomAppearance;

/**
 *
 */
public class SlicedTabPanelBottomAppearance extends SlicedTabPanelAppearance implements TabPanelBottomAppearance {

  public interface SlicedTabPanelBottomTemplate extends XTemplates {
    @XTemplate(source = "SlicedTabPanelBottom.html")
    SafeHtml render(SlicedTabPanelBottomStyle style);
  }

  public interface SlicedTabPanelBottomResources extends SlicedTabPanelResources {
    @Source("SlicedTabPanelBottom.css")
    
    SlicedTabPanelBottomStyle style();

    
    @Source("inactive-bottom-tab-l.png")
    ImageResource tabLeft();


    
    @Source("bottom-tab-l.png")
    ImageResource tabLeftOver();

    
    @Source("bottom-tab-l.png")
    ImageResource tabLeftActive();

    
    @Source("inactive-bottom-tab-r.png")
    ImageResource tabRight();

    
    @Source("bottom-tab-r.png")
    ImageResource tabRightOver();

    
    @Source("bottom-tab-r.png")
    ImageResource tabRightActive();

    
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Source("inactive-bottom-tab-bg.png")
    ImageResource tabCenter();

    
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Source("bottom-tab-bg.png")
    ImageResource tabCenterOver();

    
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Source("bottom-tab-bg.png")
    ImageResource tabCenterActive();


    
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Source("bottom-tab-strip-bg.png")
    ImageResource tabStripBackground();
  }

  public interface SlicedTabPanelBottomStyle extends SlicedTabPanelStyle {
  }

  private final SlicedTabPanelBottomTemplate template = GWT.create(SlicedTabPanelBottomTemplate.class);
  private final SlicedTabPanelBottomStyle style;

  public SlicedTabPanelBottomAppearance() {
    this(GWT.<SlicedTabPanelBottomResources>create(SlicedTabPanelBottomResources.class));
  }

  public SlicedTabPanelBottomAppearance(SlicedTabPanelBottomResources resources) {
    super(resources);
    this.style = resources.style();
  }

  
  public XElement getBar(XElement parent) {
    return parent.getLastChild().cast();
  }

  
  public void render(SafeHtmlBuilder builder) {
    builder.append(template.render((SlicedTabPanelBottomStyle) style));
  }
}
