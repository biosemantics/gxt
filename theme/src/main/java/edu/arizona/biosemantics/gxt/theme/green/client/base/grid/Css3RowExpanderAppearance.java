/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.base.grid;

import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.Import;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.sencha.gxt.core.client.dom.XElement;
import com.sencha.gxt.core.client.resources.StyleInjectorHelper;
import edu.arizona.biosemantics.gxt.theme.green.client.ThemeDetails;
import com.sencha.gxt.widget.core.client.grid.GridView.GridStateStyles;
import com.sencha.gxt.widget.core.client.grid.RowExpander.RowExpanderAppearance;

/**
 *
 */
public class Css3RowExpanderAppearance<M> implements RowExpanderAppearance<M> {

  public interface Css3RowExpanderResources extends ClientBundle {
    @Import(GridStateStyles.class)
    @Source({"Css3RowExpander.css"})
    Css3RowExpanderStyle style();

    ThemeDetails theme();

    ImageResource expand();

    ImageResource collapse();
  }

  public interface Css3RowExpanderStyle extends CssResource {
    String rowCollapsed();

    String rowExpanded();

    String rowExpander();

    String hasExpander();

    String cell();
  }

  private final Css3RowExpanderStyle style;

  public Css3RowExpanderAppearance() {
    this(GWT.<Css3RowExpanderResources>create(Css3RowExpanderResources.class));
  }

  public Css3RowExpanderAppearance(Css3RowExpanderResources resources) {
    this.style = resources.style();

    StyleInjectorHelper.ensureInjected(style, true);
  }

  
  public void finishInit(XElement gridParent) {
    gridParent.addClassName(style.hasExpander());
  }

  
  public String getCellClassName() {
    return style.cell();
  }

  
  public String getRowStyles(M model, int rowIndex) {
    return style.rowCollapsed();
  }

  
  public boolean isExpanded(XElement row) {
    return row.hasClassName(style.rowExpanded());
  }

  
  public void onExpand(XElement row, boolean expand) {
    if (expand) {
      row.replaceClassName(style.rowCollapsed(), style.rowExpanded());
    } else {
      row.replaceClassName(style.rowExpanded(), style.rowCollapsed());
    }
  }

  
  public void renderExpander(Context context, M value, SafeHtmlBuilder sb) {
    sb.appendHtmlConstant("<div class='" + style.rowExpander() + "'>&nbsp;</div>");
  }

  
  public boolean isExpandElement(XElement target) {
    return target.hasClassName(style.rowExpander());
  }
}
