/**
 * Sencha GXT 4.0.0 - Sencha for GWT
 * Copyright(c) 2006-2015, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client;

import com.sencha.gxt.themebuilder.base.client.config.TypeDetails;

public interface BorderLayoutDetails {
  @TypeDetails(sampleValue = "#DFEAF2", comment = "background for the borderlayoutcontainer, visible in margins and collapsed regions")
  String panelBackgroundColor();

  @TypeDetails(sampleValue = "util.border('solid', '#DFEAF2', 1)", comment = "border styling for a non-mini collapsed region")
  BorderDetails collapsePanelBorder();

  @TypeDetails(sampleValue = "#157FCC", comment = "background color for the collapsed panels")
  String collapsePanelBackgroundColor();
}
