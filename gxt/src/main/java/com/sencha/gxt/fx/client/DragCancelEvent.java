/**
 * Sencha GXT 4.0.0 - Sencha for GWT
 * Copyright (c) 2006-2015, Sencha Inc.
 *
 * licensing@sencha.com
 * http://www.sencha.com/products/gxt/license/
 *
 * ================================================================================
 * Open Source License
 * ================================================================================
 * This version of Sencha GXT is licensed under the terms of the Open Source GPL v3
 * license. You may use this license only if you are prepared to distribute and
 * share the source code of your application under the GPL v3 license:
 * http://www.gnu.org/licenses/gpl.html
 *
 * If you are NOT prepared to distribute and share the source code of your
 * application under the GPL v3 license, other commercial and oem licenses
 * are available for an alternate download of Sencha GXT.
 *
 * Please see the Sencha GXT Licensing page at:
 * http://www.sencha.com/products/gxt/license/
 *
 * For clarification or additional options, please contact:
 * licensing@sencha.com
 * ================================================================================
 *
 *
 * ================================================================================
 * Disclaimer
 * ================================================================================
 * THIS SOFTWARE IS DISTRIBUTED "AS-IS" WITHOUT ANY WARRANTIES, CONDITIONS AND
 * REPRESENTATIONS WHETHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES AND CONDITIONS OF MERCHANTABILITY, MERCHANTABLE QUALITY,
 * FITNESS FOR A PARTICULAR PURPOSE, DURABILITY, NON-INFRINGEMENT, PERFORMANCE AND
 * THOSE ARISING BY STATUTE OR FROM CUSTOM OR USAGE OF TRADE OR COURSE OF DEALING.
 * ================================================================================
 */
package com.sencha.gxt.fx.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.fx.client.DragCancelEvent.DragCancelHandler;

/**
 * Represents the after layout event.
 */
public class DragCancelEvent extends GwtEvent<DragCancelHandler> {

  /**
   * Handler type.
   */
  private static Type<DragCancelHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<DragCancelHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<DragCancelHandler>();
    }
    return TYPE;
  }

  private Widget target;
  private Element startElement;

  public DragCancelEvent(Widget target, Element startElement) {
    this.target = target;
    this.startElement = startElement;
  }

  @Override
  public Type<DragCancelHandler> getAssociatedType() {
    return TYPE;
  }

  public Draggable getSource() {
    return (Draggable) super.getSource();
  }

  public Element getStartElement() {
    return startElement;
  }

  public Widget getTarget() {
    return target;
  }

  @Override
  protected void dispatch(DragCancelHandler handler) {
    handler.onDragCancel(this);
  }
  
  /**
   * Handler for {@link DragCancelEvent} events.
   */
  public interface DragCancelHandler extends EventHandler {

    void onDragCancel(DragCancelEvent event);

  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link DragCancelEvent} events.
   */
  public interface HasDragCancelHandlers {

    /**
     * Adds a {@link DragCancelHandler} handler for {@link DragCancelEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    public HandlerRegistration addDragCancelHandler(DragCancelHandler handler);

  }

}
