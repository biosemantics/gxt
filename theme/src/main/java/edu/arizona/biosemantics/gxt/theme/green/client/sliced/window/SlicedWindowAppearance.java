/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.sliced.window;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import edu.arizona.biosemantics.gxt.theme.green.client.sliced.panel.SlicedFramedPanelAppearance;
import com.sencha.gxt.widget.core.client.Header.HeaderAppearance;
import com.sencha.gxt.widget.core.client.Window.WindowAppearance;

public class SlicedWindowAppearance extends SlicedFramedPanelAppearance implements WindowAppearance {

  public interface SlicedWindowResources extends SlicedFramePanelResources {
    
    @Source("SlicedWindow.css")
    SlicedWindowStyle style();
  }
  public interface SlicedWindowStyle extends FramedPanelStyle {
    String ghost();
  }

  public interface SlicedWindowDivFrameResources extends SlicedFramedPanelDivFrameResources {
    @Source({"edu/arizona/biosemantics/gxt/theme/green/client/sliced/panel/SlicedFramedPanelDivFrame.css"})
    
    SlicedWindowNestedDivFrameStyle style();

    
    @Source("window-background.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource background();

    @Source("window-tl.png")
    
    ImageResource topLeftBorder();

    @Source("window-tc.png")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    
    ImageResource topBorder();

    @Source("window-tr.png")
    
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource topRightBorder();

    @Source("window-l.png")
    @ImageOptions(repeatStyle = RepeatStyle.Vertical)
    
    ImageResource leftBorder();

    @Source("window-r.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    
    ImageResource rightBorder();

    @Source("window-bl.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    
    ImageResource bottomLeftBorder();

    @Source("window-bc.png")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    
    ImageResource bottomBorder();

    @Source("window-br.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    
    ImageResource bottomRightBorder();
  }
  public interface SlicedWindowNestedDivFrameStyle extends SlicedFramePanelNestedDivFrameStyle {

  }
  private final SlicedWindowResources res;

  public SlicedWindowAppearance() {
    this(GWT.<SlicedWindowResources>create(SlicedWindowResources.class),
            GWT.<SlicedWindowDivFrameResources>create(SlicedWindowDivFrameResources.class));
  }
  public SlicedWindowAppearance(SlicedWindowResources slicedWindowResources, SlicedWindowDivFrameResources frameResources) {
    super(slicedWindowResources, frameResources);
    this.res = slicedWindowResources;
  }

  
  public HeaderAppearance getHeaderAppearance() {
    return new SlicedWindowHeaderAppearance();
  }

  
  public String ghostClass() {
    return res.style().ghost();
  }
}
