/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package edu.arizona.biosemantics.gxt.theme.green.client.base.field;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.widget.core.client.form.StoreFilterField.StoreFilterFieldAppearance;

/**
 *
 */
public class Css3StoreFilterFieldAppearance extends Css3TriggerFieldAppearance implements StoreFilterFieldAppearance {
  public interface Css3StoreFilterFieldResources extends Css3TriggerFieldResources {
    
    @Source({"Css3ValueBaseField.css", "Css3TextField.css", "Css3TriggerField.css", "Css3StoreFilterField.css"})
    Css3StoreFilterFieldStyle style();

    
    @Source("clearTrigger.png")
    ImageResource triggerArrow();

    
    @Source("clearTriggerOver.png")
    ImageResource triggerArrowOver();

    
    @Source("clearTriggerClick.png")
    ImageResource triggerArrowClick();
  }

  public interface Css3StoreFilterFieldStyle extends Css3TriggerFieldStyle {

  }

  public Css3StoreFilterFieldAppearance() {
    this(GWT.<Css3StoreFilterFieldResources>create(Css3StoreFilterFieldResources.class));
  }

  public Css3StoreFilterFieldAppearance(Css3StoreFilterFieldResources resources) {
    super(resources);
  }
}
