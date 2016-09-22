package com.wandoujia.clean.reporter;

import android.os.Environment;
import java.util.ArrayList;

final class a
  implements Runnable
{
  public final void run()
  {
    PeriodReporter.a(Environment.getExternalStorageDirectory(), new ArrayList());
    PeriodReporter.b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.reporter.a
 * JD-Core Version:    0.6.0
 */