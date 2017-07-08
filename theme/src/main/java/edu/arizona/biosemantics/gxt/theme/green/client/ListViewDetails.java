/**
 * Sencha GXT 4.0.0 - Sencha for GWT
 * Copyright (c) 2006-2015, Sencha Inc.
 *
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client;

import com.sencha.gxt.themebuilder.base.client.config.Optional;
import com.sencha.gxt.themebuilder.base.client.config.TypeDetails;

public interface ListViewDetails {

  public interface ItemDetails {

    @TypeDetails(sampleValue = "'#ffffff'", comment = "item background color for non-gradient supporting browsers")
    String backgroundColor();

    @Optional(defaultValue = "#000000", comment = "item text color")
    String color();

    @TypeDetails(sampleValue = "util.solidGradientString('#ffffff')", comment = "")
    String gradient();

    @TypeDetails(sampleValue = "util.border('none')", comment = "")
    BorderDetails border();

    @TypeDetails(sampleValue = "util.padding(0, 4)", comment = "")
    EdgeDetails padding();
  }

  @TypeDetails(sampleValue = "util.fontStyle('sans-serif', 'medium')", comment = "listview text styling")
  FontDetails text();
  @TypeDetails(sampleValue = "'normal'", comment = "height of text in listview")
  String lineHeight();

  @TypeDetails(sampleValue = "'#ffffff'", comment = "listview background color")
  String backgroundColor();

  @TypeDetails(sampleValue = "util.border('solid', '#444444', 1)", comment = "listview body border")
  BorderDetails border();

  ItemDetails item();
  ItemDetails overItem();
  ItemDetails selectedItem();

}
