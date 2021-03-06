/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.sliced.tips;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.sencha.gxt.theme.base.client.frame.NestedDivFrame;
import com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance;
import edu.arizona.biosemantics.gxt.theme.green.client.ThemeDetails;

/**
 *
 */
public class SlicedTipAppearance extends TipDefaultAppearance {

  public interface SlicedTipDivFrameResources extends TipDivFrameResources {


    
    @Source("tip-background.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource background();

    
    @Source("tip-bc.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource bottomBorder();

    
    @Source("tip-bl.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource bottomLeftBorder();

    
    @Source("tip-br.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource bottomRightBorder();

    
    @Source("tip-l.png")
    @ImageOptions(repeatStyle = RepeatStyle.Vertical)
    ImageResource leftBorder();

    
    @Source("tip-r.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource rightBorder();

    
    @Source("tip-tc.png")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource topBorder();

    
    @Source("tip-tl.png")
    ImageResource topLeftBorder();

    
    @Source("tip-tr.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource topRightBorder();
  }

  public interface SlicedTipResources extends TipResources {

    
    @Source("edu/arizona/biosemantics/gxt/theme/green/client/base/tips/anchorBottom.png")
    ImageResource anchorBottom();

    
    @Source("edu/arizona/biosemantics/gxt/theme/green/client/base/tips/anchorLeft.png")
    ImageResource anchorLeft();

    
    @Source("edu/arizona/biosemantics/gxt/theme/green/client/base/tips/anchorRight.png")
    ImageResource anchorRight();

    
    @Source("edu/arizona/biosemantics/gxt/theme/green/client/base/tips/anchorTop.png")
    ImageResource anchorTop();

    
    @Source({"com/sencha/gxt/theme/base/client/tips/TipDefault.css", "SlicedTip.css"})
    SlicedTipStyle style();

    ThemeDetails theme();
  }

  public interface SlicedTipStyle extends TipStyle {

  }

  public SlicedTipAppearance() {
    this(GWT.<SlicedTipResources>create(SlicedTipResources.class));
  }

  public SlicedTipAppearance(SlicedTipResources resources) {
    this(resources, GWT.<TipDefaultTemplate>create(TipDefaultTemplate.class));
  }

  public SlicedTipAppearance(SlicedTipResources resources, TipDefaultTemplate template) {
    super(resources, template);

    frame = new NestedDivFrame(GWT.<SlicedTipDivFrameResources>create(SlicedTipDivFrameResources.class));
  }
}
