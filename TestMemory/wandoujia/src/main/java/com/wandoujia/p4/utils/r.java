package com.wandoujia.p4.utils;

import android.content.Context;
import android.content.Intent;

public class r
{
  static
  {
    r.class.getSimpleName();
  }

  public static void a(Context paramContext, String paramString)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.SEND");
      localIntent.setType("text/plain");
      localIntent.putExtra("android.intent.extra.SUBJECT", paramContext.getString(2131625038));
      localIntent.putExtra("android.intent.extra.TEXT", paramString);
      localIntent.addFlags(268435456);
      paramContext.startActivity(Intent.createChooser(localIntent, paramContext.getString(2131625038)));
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.r
 * JD-Core Version:    0.6.0
 */