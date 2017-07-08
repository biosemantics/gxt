/**
 * Sencha GXT 4.0.0 - Sencha for GWT
 * Copyright (c) 2006-2015, Sencha Inc.
 *
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client;

import com.sencha.gxt.themebuilder.base.client.config.DetailTemplate;

/**
 *
 */
public interface BorderDetails extends EdgeDetails {
  String style();
  String color();

  @Override
  @DetailTemplate("{top}px {right}px {bottom}px {left}px")
  public String toString();
}
