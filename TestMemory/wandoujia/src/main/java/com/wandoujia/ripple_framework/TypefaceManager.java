package com.wandoujia.ripple_framework;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;
import java.util.Map;

public final class TypefaceManager
{
  private static Map<TypefaceManager.FONT, Typeface> a;
  private Context b;

  public TypefaceManager(Context paramContext, o paramo)
  {
    this.b = paramContext;
    a = new HashMap();
  }

  public static void a()
  {
    a.clear();
  }

  public final Typeface a(TypefaceManager.FONT paramFONT)
  {
    Typeface localTypeface = (Typeface)a.get(paramFONT);
    if (localTypeface == null);
    try
    {
      localTypeface = o.a(this.b, paramFONT);
      a.put(paramFONT, localTypeface);
      return localTypeface;
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.TypefaceManager
 * JD-Core Version:    0.6.0
 */