/**
 * Sencha GXT 4.0.0 - Sencha for GWT
 * Copyright(c) 2006-2015, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client;

import com.sencha.gxt.themebuilder.base.client.config.TypeDetails;

public interface AccordionLayoutDetails extends PanelDetails {

  @Override
  @TypeDetails(sampleValue = "#ffffff", comment = "background color for the panel body")
  String backgroundColor();
  
  @Override
  @TypeDetails(sampleValue = "util.padding(0)", comment = "entire panel padding")
  EdgeDetails padding();

  @Override
  @TypeDetails(sampleValue = "util.padding(10)", comment = "header padding")
  EdgeDetails headerPadding();

  @TypeDetails(sampleValue = "util.margin(0)", comment = "header bar margin")
  EdgeDetails headerBarMargin();

  @TypeDetails(sampleValue = "util.padding(10)", comment = "panel padding")
  EdgeDetails panelPadding();

  @TypeDetails(sampleValue = "util.padding(5)", comment = "padding applied only to the first panel")
  EdgeDetails firstPanelPadding();

  @Override
  @TypeDetails(sampleValue = "#ccffff", comment = "background color to fill behind the header gradient")
  String headerBackgroundColor();

  @Override
  @TypeDetails(sampleValue = "#ccffff, #ccffff", comment = "header gradient string")
  String headerGradient();

  @Override
  @TypeDetails(sampleValue = "util.border('solid', '#000000', 1)", comment = "border around the contentpanel")
  BorderDetails border();

  @Override
  @TypeDetails(sampleValue = "util.fontStyle('sans-serif','medium')", comment = "panel heading text style")
  FontDetails font();
}
