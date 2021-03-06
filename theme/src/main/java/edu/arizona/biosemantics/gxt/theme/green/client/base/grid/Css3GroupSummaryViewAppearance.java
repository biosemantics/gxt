/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.base.grid;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.resources.client.CssResource.Import;
import com.sencha.gxt.core.client.dom.XElement;
import com.sencha.gxt.widget.core.client.grid.GridView.GridStateStyles;
import com.sencha.gxt.widget.core.client.grid.GroupSummaryView.GroupSummaryViewAppearance;
import com.sencha.gxt.widget.core.client.grid.GroupSummaryView.GroupSummaryViewStyle;

public class Css3GroupSummaryViewAppearance extends Css3GroupingViewAppearance implements GroupSummaryViewAppearance {

  public interface Css3GroupSummaryResources extends Css3GroupingViewResources {
    
    @Import(GridStateStyles.class)
    @Source({"Css3GroupingView.css", "Css3GroupSummaryView.css"})
    Css3GroupSummaryStyles style();
  }

  public interface Css3GroupSummaryStyles extends Css3GroupingViewStyle, GroupSummaryViewStyle {
    String hideSummaries();
  }

  public Css3GroupSummaryViewAppearance() {
    super(GWT.<Css3GroupSummaryResources>create(Css3GroupSummaryResources.class));
  }

  
  public void toggleSummaries(XElement parent, boolean visible) {
    parent.setClassName(style().hideSummaries(), !visible);
  }

  
  public NodeList<Element> getSummaries(XElement table) {
    return table.select("." + style().summaryRow());
  }

  
  public int getGroupIndex(XElement group) {
    return group.getParentElement().<XElement>cast().indexOf(group) / 3;
  }

  
  public Css3GroupSummaryStyles style() {
    return (Css3GroupSummaryStyles) super.style();
  }
}
