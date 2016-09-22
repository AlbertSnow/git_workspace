package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Build.VERSION;
import java.util.HashMap;
import java.util.Map;

class o
{
  private static Map<String, String> a = new HashMap();

  // ERROR //
  static void a()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 2
    //   5: monitorexit
    //   6: return
    //   7: astore_0
    //   8: ldc 2
    //   10: monitorexit
    //   11: aload_0
    //   12: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   3	6	7	finally
    //   8	11	7	finally
  }

  static void a(Context paramContext, String paramString)
  {
    String str = Uri.parse("http://hostname/?" + paramString).getQueryParameter("conv");
    SharedPreferences.Editor localEditor;
    if ((str != null) && (str.length() > 0))
    {
      a.put(str, paramString);
      localEditor = paramContext.getSharedPreferences("gtm_click_referrers", 0).edit();
      localEditor.putString(str, paramString);
      if (Build.VERSION.SDK_INT >= 9)
        localEditor.apply();
    }
    else
    {
      return;
    }
    new Thread(new af(localEditor)).start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.o
 * JD-Core Version:    0.6.0
 */