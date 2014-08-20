/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.base.tools;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.widget.core.client.button.Tools;

/**
 */
public class Css3Tools extends Tools {

  public interface Css3ToolResources extends ToolResources, ClientBundle {

    @Source("com/sencha/gxt/theme/base/client/tool/BaseTools.css")
    ToolStyle style();

    @Override
    ImageResource closeIcon();

    @Override
    ImageResource closeOverIcon();

    @Override
    ImageResource collapseIcon();

    @Override
    ImageResource collapseOverIcon();

    @Override
    ImageResource doubleDownIcon();

    @Override
    ImageResource doubleDownOverIcon();

    @Override
    ImageResource doubleLeftIcon();

    @Override
    ImageResource doubleLeftOverIcon();

    @Override
    ImageResource doubleRightIcon();

    @Override
    ImageResource doubleRightOverIcon();

    @Override
    ImageResource doubleUpIcon();

    @Override
    ImageResource doubleUpOverIcon();

    @Override
    ImageResource downIcon();

    @Override
    ImageResource downOverIcon();

    @Override
    ImageResource expandIcon();

    @Override
    ImageResource expandOverIcon();

    @Override
    ImageResource gearIcon();

    @Override
    ImageResource gearOverIcon();

    @Override
    ImageResource leftIcon();

    @Override
    ImageResource leftOverIcon();

    @Override
    ImageResource maximizeIcon();

    @Override
    ImageResource maximizeOverIcon();

    @Override
    ImageResource minimizeIcon();

    @Override
    ImageResource minimizeOverIcon();

    @Override
    ImageResource minusIcon();

    @Override
    ImageResource minusOverIcon();

    @Override
    ImageResource pinIcon();

    @Override
    ImageResource pinOverIcon();

    @Override
    ImageResource unpinIcon();

    @Override
    ImageResource unpinOverIcon();

    @Override
    ImageResource plusIcon();

    @Override
    ImageResource plusOverIcon();

    @Override
    ImageResource printIcon();

    @Override
    ImageResource printOverIcon();

    @Override
    ImageResource questionIcon();

    @Override
    ImageResource questionOverIcon();

    @Override
    ImageResource refreshIcon();

    @Override
    ImageResource refreshOverIcon();

    @Override
    ImageResource restoreIcon();

    @Override
    ImageResource restoreOverIcon();

    @Override
    ImageResource rightIcon();

    @Override
    ImageResource rightOverIcon();

    @Override
    ImageResource saveIcon();

    @Override
    ImageResource saveOverIcon();

    @Override
    ImageResource searchIcon();

    @Override
    ImageResource searchOverIcon();

    @Override
    ImageResource upIcon();

    @Override
    ImageResource upOverIcon();
  }

  public Css3Tools() {
    super(GWT.<Css3ToolResources>create(Css3ToolResources.class));
  }
}
