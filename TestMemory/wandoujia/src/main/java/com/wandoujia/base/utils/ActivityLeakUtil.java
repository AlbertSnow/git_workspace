package com.wandoujia.base.utils;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

public class ActivityLeakUtil
{
  public static void fixInputMethodManagerLeak(Context paramContext)
  {
    if (paramContext == null);
    while (true)
    {
      return;
      InputMethodManager localInputMethodManager = (InputMethodManager)paramContext.getSystemService("input_method");
      if (localInputMethodManager == null)
        continue;
      String[] arrayOfString = { "mCurRootView", "mServedView", "mNextServedView" };
      int i = 0;
      if (i >= 3)
        continue;
      String str = arrayOfString[i];
      try
      {
        Field localField = localInputMethodManager.getClass().getDeclaredField(str);
        if (!localField.isAccessible())
          localField.setAccessible(true);
        Object localObject = localField.get(localInputMethodManager);
        if ((localObject != null) && ((localObject instanceof View)))
        {
          if (((View)localObject).getContext() != paramContext)
            continue;
          localField.set(localInputMethodManager, null);
        }
        label116: i++;
      }
      catch (Throwable localThrowable)
      {
        break label116;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.ActivityLeakUtil
 * JD-Core Version:    0.6.0
 */