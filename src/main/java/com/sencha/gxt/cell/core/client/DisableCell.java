/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.cell.core.client;

import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.dom.client.Element;
import com.sencha.gxt.widget.core.client.cell.CellComponent;

/**
 * Interface for cells that can be "disabled".
 * <p/>
 * When used with {@link CellComponent} the
 * {@link #disable(com.google.gwt.cell.client.Cell.Context, com.google.gwt.dom.client.Element)} and
 * {@link #enable(com.google.gwt.cell.client.Cell.Context, com.google.gwt.dom.client.Element)} will be called when the
 * component is enabled and disabled.
 */
public interface DisableCell {

  void disable(Context context, Element parent);

  void enable(Context context, Element parent);

}
