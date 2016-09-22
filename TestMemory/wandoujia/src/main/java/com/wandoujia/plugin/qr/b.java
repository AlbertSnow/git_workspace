package com.wandoujia.plugin.qr;

import android.content.SharedPreferences;
import com.wandoujia.plugin.bridge.a;
import java.util.concurrent.Executors;

public final class b
{
  static
  {
    Executors.newSingleThreadExecutor();
  }

  public static boolean a()
  {
    return a.c().a().getBoolean("AUTO_FOCUS", true);
  }

  public static boolean b()
  {
    return a.c().a().getBoolean("FRONT_LIGHT", false);
  }

  public static boolean c()
  {
    return a.c().a().getBoolean("DECODE_1D", false);
  }

  public static boolean d()
  {
    return a.c().a().getBoolean("DECODE_QR", false);
  }

  public static boolean e()
  {
    return a.c().a().getBoolean("DECODE_DATA_MATRIX", false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.plugin.qr.b
 * JD-Core Version:    0.6.0
 */