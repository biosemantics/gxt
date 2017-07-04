/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.sliced.button;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.sencha.gxt.theme.base.client.button.ButtonTableFrameResources;
import com.sencha.gxt.theme.base.client.frame.TableFrame.TableFrameStyle;

/**
 *
 */
public interface SlicedButtonCellTableFrameResources extends SlicedToolBarButtonCellTableFrameResources, ButtonTableFrameResources {
  public interface TableFrameStyleSliced extends TableFrameStyle {
  }

  
  @Source({"com/sencha/gxt/theme/base/client/frame/TableFrame.css", "SlicedButtonTableFrame.css", "SlicedToolBarButtonTableFrame.css"})
  TableFrameStyleSliced style();

  
  @Source("button-background.png")
  @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
  ImageResource background();

  
  @Source("button-over-background.png")
  @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
  ImageResource backgroundOverBorder();

  
  @Source("button-pressed-background.png")
  @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
  ImageResource backgroundPressedBorder();

  
  @Source("button-tl.png")
  ImageResource topLeftBorder();

  
  @Source("button-over-tl.png")
  ImageResource topLeftOverBorder();

  
  @Source("button-pressed-tl.png")
  ImageResource topLeftPressedBorder();

  
  @Source("button-tc.png")
  @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
  ImageResource topBorder();

  
  @Source("button-over-tc.png")
  @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
  ImageResource topOverBorder();

  
  @Source("button-pressed-tc.png")
  @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
  ImageResource topPressedBorder();

  
  @Source("button-tr.png")
  ImageResource topRightBorder();

  
  @Source("button-over-tr.png")
  ImageResource topRightOverBorder();

  
  @Source("button-pressed-tr.png")
  ImageResource topRightPressedBorder();

  
  @Source("button-l.png")
  @ImageOptions(repeatStyle = RepeatStyle.Vertical)
  ImageResource leftBorder();

  
  @Source("button-over-l.png")
  @ImageOptions(repeatStyle = RepeatStyle.Vertical)
  ImageResource leftOverBorder();

  
  @Source("button-pressed-l.png")
  @ImageOptions(repeatStyle = RepeatStyle.Vertical)
  ImageResource leftPressedBorder();

  
  @Source("button-r.png")
  @ImageOptions(repeatStyle = RepeatStyle.Vertical)
  ImageResource rightBorder();

  
  @Source("button-over-r.png")
  @ImageOptions(repeatStyle = RepeatStyle.Vertical)
  ImageResource rightOverBorder();

  
  @Source("button-pressed-r.png")
  @ImageOptions(repeatStyle = RepeatStyle.Vertical)
  ImageResource rightPressedBorder();

  
  @Source("button-bl.png")
  ImageResource bottomLeftBorder();

  
  @Source("button-over-bl.png")
  ImageResource bottomLeftOverBorder();

  
  @Source("button-pressed-bl.png")
  ImageResource bottomLeftPressedBorder();


  
  @Source("button-bc.png")
  @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
  ImageResource bottomBorder();

  
  @Source("button-over-bc.png")
  @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
  ImageResource bottomOverBorder();

  
  @Source("button-pressed-bc.png")
  @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
  ImageResource bottomPressedBorder();

  
  @Source("button-br.png")
  ImageResource bottomRightBorder();

  
  @Source("button-over-br.png")
  ImageResource bottomRightOverBorder();

  
  @Source("button-pressed-br.png")
  ImageResource bottomRightPressedBorder();
}
