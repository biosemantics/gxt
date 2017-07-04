/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.sliced.panel;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.sencha.gxt.core.client.dom.XElement;
import com.sencha.gxt.theme.base.client.panel.FramedPanelBaseAppearance;
import edu.arizona.biosemantics.gxt.theme.green.client.ThemeDetails;
import com.sencha.gxt.widget.core.client.Header.HeaderAppearance;

public class SlicedFramedPanelAppearance extends FramedPanelBaseAppearance {
  public interface FramedPanelStyle extends ContentPanelStyle {

  }

  public interface SlicedFramePanelResources extends ContentPanelResources {
    @Source("SlicedFramedPanel.css")
    
    FramedPanelStyle style();

    ThemeDetails theme();
  }

  public interface SlicedFramedPanelDivFrameResources extends SlicedFramedPanelFrame.Resources {
    ThemeDetails theme();

    @Source("SlicedFramedPanelDivFrame.css")
    
    SlicedFramePanelNestedDivFrameStyle style();

    @Source("framedpanel-background.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource background();

    @Source("framedpanel-tl.png")
    
    ImageResource topLeftBorder();

    @Source("framedpanel-tc.png")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    
    ImageResource topBorder();

    @Source("framedpanel-tr.png")
    
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource topRightBorder();

    @Source("framedpanel-l.png")
    @ImageOptions(repeatStyle = RepeatStyle.Vertical)
    
    ImageResource leftBorder();

    @Source("framedpanel-r.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    
    ImageResource rightBorder();

    @Source("framedpanel-bl.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    
    ImageResource bottomLeftBorder();

    @Source("framedpanel-bc.png")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    
    ImageResource bottomBorder();

    @Source("framedpanel-br.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    
    ImageResource bottomRightBorder();

  }
  public interface SlicedFramePanelNestedDivFrameStyle extends SlicedFramedPanelFrame.Style {

  }

  private final SlicedFramePanelResources resources;
  public SlicedFramedPanelAppearance() {
    this(GWT.<SlicedFramePanelResources>create(SlicedFramePanelResources.class),
            GWT.<SlicedFramedPanelDivFrameResources>create(SlicedFramedPanelDivFrameResources.class));
  }

  public SlicedFramedPanelAppearance(SlicedFramePanelResources res, SlicedFramedPanelDivFrameResources frameResources) {
    super(res, GWT.<FramedPanelTemplate> create(FramedPanelTemplate.class), new SlicedFramedPanelFrame(frameResources));
    this.resources = res;
  }

  
  public HeaderAppearance getHeaderAppearance() {
    return new SlicedHeaderAppearance();
  }


  
  public int getFrameHeight(XElement parent) {
    return resources.theme().framedPanel().border().top() + resources.theme().framedPanel().border().bottom();
  }

  
  public int getFrameWidth(XElement parent) {
    return resources.theme().framedPanel().border().left() + resources.theme().framedPanel().border().right();
  }
}
