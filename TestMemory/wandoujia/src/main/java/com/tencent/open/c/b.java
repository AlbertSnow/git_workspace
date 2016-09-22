package com.tencent.open.c;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.reflect.Method;

public class b extends WebView
{
  public b(Context paramContext)
  {
    super(paramContext);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    WebSettings localWebSettings = getSettings();
    if (localWebSettings == null);
    while (true)
    {
      return;
      Class localClass = localWebSettings.getClass();
      try
      {
        Method localMethod = localClass.getMethod("removeJavascriptInterface", new Class[] { String.class });
        if (localMethod == null)
          continue;
        localMethod.invoke(this, new Object[] { "searchBoxJavaBridge_" });
        return;
      }
      catch (Exception localException)
      {
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.c.b
 * JD-Core Version:    0.6.0
 */