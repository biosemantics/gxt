/**
 * Sencha GXT 4.0.0 - Sencha for GWT
 * Copyright (c) 2006-2015, Sencha Inc.
 *
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client;

import com.sencha.gxt.themebuilder.base.client.config.TypeDetails;

/**
 *
 */
public interface ToolIconDetails {
  @TypeDetails(sampleValue = "util.mixColors('#ffffff', '#157FCC', 0.5)", comment = "primary color of icons")
  String primaryColor();

  @TypeDetails(sampleValue = "1", comment = "primary opacity of icons")
  double primaryOpacity();

  @TypeDetails(sampleValue = "util.mixColors('#ffffff', '#157FCC', 0.3)", comment = "icon color when hover")
  String primaryOverColor();

  @TypeDetails(sampleValue = "1", comment = "opacity when hover")
  double primaryOverOpacity();

  @TypeDetails(sampleValue = "util.mixColors('#ffffff', '#157FCC', 0.25)", comment = "icon color when clicked")
  String primaryClickColor();

  @TypeDetails(sampleValue = "1", comment = "icon opacity when clicked")
  double primaryClickOpacity();

  @TypeDetails(sampleValue = "#ff0000", comment = "color used for warning actions, such as exclamation icon")
  String warningColor();

  @TypeDetails(sampleValue = "#00ff00", comment = "color used for allowed actions, such as allowed drop zones with DnD")
  String allowColor();
}
