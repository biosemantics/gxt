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

    
    ImageResource closeIcon();

    
    ImageResource closeOverIcon();

    
    ImageResource collapseIcon();

    
    ImageResource collapseOverIcon();

    
    ImageResource doubleDownIcon();

    
    ImageResource doubleDownOverIcon();

    
    ImageResource doubleLeftIcon();

    
    ImageResource doubleLeftOverIcon();

    
    ImageResource doubleRightIcon();

    
    ImageResource doubleRightOverIcon();

    
    ImageResource doubleUpIcon();

    
    ImageResource doubleUpOverIcon();

    
    ImageResource downIcon();

    
    ImageResource downOverIcon();

    
    ImageResource expandIcon();

    
    ImageResource expandOverIcon();

    
    ImageResource gearIcon();

    
    ImageResource gearOverIcon();

    
    ImageResource leftIcon();

    
    ImageResource leftOverIcon();

    
    ImageResource maximizeIcon();

    
    ImageResource maximizeOverIcon();

    
    ImageResource minimizeIcon();

    
    ImageResource minimizeOverIcon();

    
    ImageResource minusIcon();

    
    ImageResource minusOverIcon();

    
    ImageResource pinIcon();

    
    ImageResource pinOverIcon();

    
    ImageResource unpinIcon();

    
    ImageResource unpinOverIcon();

    
    ImageResource plusIcon();

    
    ImageResource plusOverIcon();

    
    ImageResource printIcon();

    
    ImageResource printOverIcon();

    
    ImageResource questionIcon();

    
    ImageResource questionOverIcon();

    
    ImageResource refreshIcon();

    
    ImageResource refreshOverIcon();

    
    ImageResource restoreIcon();

    
    ImageResource restoreOverIcon();

    
    ImageResource rightIcon();

    
    ImageResource rightOverIcon();

    
    ImageResource saveIcon();

    
    ImageResource saveOverIcon();

    
    ImageResource searchIcon();

    
    ImageResource searchOverIcon();

    
    ImageResource upIcon();

    
    ImageResource upOverIcon();
  }

  public Css3Tools() {
    super(GWT.<Css3ToolResources>create(Css3ToolResources.class));
  }
}
