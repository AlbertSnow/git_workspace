package com.wandoujia.plugin.qr;

import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.g;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public final class e extends Thread
{
  private final CaptureActivity a;
  private final Map<DecodeHintType, Object> b;
  private Handler c;
  private final CountDownLatch d;

  public e(CaptureActivity paramCaptureActivity, g paramg)
  {
    this.a = paramCaptureActivity;
    this.d = new CountDownLatch(1);
    this.b = new EnumMap(DecodeHintType.class);
    PreferenceManager.getDefaultSharedPreferences(paramCaptureActivity);
    EnumSet localEnumSet = EnumSet.noneOf(BarcodeFormat.class);
    if (b.c())
      localEnumSet.addAll(c.a);
    if (b.d())
      localEnumSet.addAll(c.b);
    if (b.e())
      localEnumSet.addAll(c.c);
    this.b.put(DecodeHintType.POSSIBLE_FORMATS, localEnumSet);
    this.b.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, paramg);
  }

  public final Handler a()
  {
    try
    {
      this.d.await();
      label7: return this.c;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label7;
    }
  }

  public final void run()
  {
    Looper.prepare();
    this.c = new d(this.a, this.b);
    this.d.countDown();
    Looper.loop();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.plugin.qr.e
 * JD-Core Version:    0.6.0
 */