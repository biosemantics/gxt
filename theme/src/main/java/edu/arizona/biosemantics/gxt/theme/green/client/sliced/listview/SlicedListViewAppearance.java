/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.sliced.listview;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import edu.arizona.biosemantics.gxt.theme.green.client.base.listview.Css3ListViewAppearance;

public class SlicedListViewAppearance<M> extends Css3ListViewAppearance<M> {

  public interface SlicedListViewResources extends Css3ListViewResources {
    
    @Source("SlicedListView.css")
    SlicedListViewStyle css();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Source("item.png")
    ImageResource itemBackground();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Source("itemselected.png")
    ImageResource itemSelectedBackground();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Source("itemover.png")
    ImageResource itemOverBackground();
  }

  public interface SlicedListViewStyle extends Css3ListViewStyle {

  }

  public SlicedListViewAppearance() {
    super(GWT.<SlicedListViewResources>create(SlicedListViewResources.class));
  }
}
