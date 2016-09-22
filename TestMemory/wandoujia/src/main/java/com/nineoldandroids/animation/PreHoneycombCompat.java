package com.nineoldandroids.animation;

import android.view.View;
import com.nineoldandroids.util.Property;

final class PreHoneycombCompat
{
  static Property<View, Float> ALPHA = new PreHoneycombCompat.1("alpha");
  static Property<View, Float> PIVOT_X = new PreHoneycombCompat.2("pivotX");
  static Property<View, Float> PIVOT_Y = new PreHoneycombCompat.3("pivotY");
  static Property<View, Float> ROTATION;
  static Property<View, Float> ROTATION_X;
  static Property<View, Float> ROTATION_Y;
  static Property<View, Float> SCALE_X;
  static Property<View, Float> SCALE_Y;
  static Property<View, Integer> SCROLL_X;
  static Property<View, Integer> SCROLL_Y;
  static Property<View, Float> TRANSLATION_X = new PreHoneycombCompat.4("translationX");
  static Property<View, Float> TRANSLATION_Y = new PreHoneycombCompat.5("translationY");
  static Property<View, Float> X;
  static Property<View, Float> Y;

  static
  {
    ROTATION = new PreHoneycombCompat.6("rotation");
    ROTATION_X = new PreHoneycombCompat.7("rotationX");
    ROTATION_Y = new PreHoneycombCompat.8("rotationY");
    SCALE_X = new PreHoneycombCompat.9("scaleX");
    SCALE_Y = new PreHoneycombCompat.10("scaleY");
    SCROLL_X = new PreHoneycombCompat.11("scrollX");
    SCROLL_Y = new PreHoneycombCompat.12("scrollY");
    X = new PreHoneycombCompat.13("x");
    Y = new PreHoneycombCompat.14("y");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nineoldandroids.animation.PreHoneycombCompat
 * JD-Core Version:    0.6.0
 */