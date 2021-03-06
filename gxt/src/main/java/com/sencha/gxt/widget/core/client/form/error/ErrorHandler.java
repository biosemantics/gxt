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
package com.sencha.gxt.widget.core.client.form.error;

import java.util.List;

import com.google.gwt.editor.client.EditorError;

/**
 * Defines the interface for objects that can display a field's error.
 * 
 * <p />
 * See the following concrete implementations:
 * <ul>
 * <li>{@link SideErrorHandler}</li>
 * <li>{@link ToolTipErrorHandler}</li>
 * <li>{@link TitleErrorHandler}</li>
 * <li>{@link ElementErrorHandler}</li>
 * </ul>
 */
public interface ErrorHandler {

  /**
   * Clears the errors from the field.
   */
  void clearInvalid();

  /**
   * Assigns errors to be displayed on the field.
   * 
   * @param errors the errors to display to the user
   */
  void markInvalid(List<EditorError> errors);

  /**
   * Called to indicate that the instance will no longer be used, and should clean itself up. The 
   * {@link #clearInvalid()} method should be called prior to this to clean up any leftover errors.
   */
  void release();
}
