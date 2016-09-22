package com.wandoujia.p4.app_launcher.b;

import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import android.widget.Toast;
import com.wandoujia.accessibility.a.c;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.MemoryUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.p4.app_launcher.clean.d;
import com.wandoujia.p4.app_launcher.clean.widget.CircleProgressBar;
import com.wandoujia.p4.app_launcher.clean.widget.CleanWidget;
import com.wandoujia.p4.app_launcher.clean.widget.a;
import com.wandoujia.p4.app_launcher.clean.widget.i;

final class u
  implements i
{
  private boolean a = false;

  u(o paramo, CleanWidget paramCleanWidget)
  {
  }

  public final void a(int paramInt)
  {
    this.b.getCircleProgressBar().setProgress(paramInt);
    long l2;
    if ((paramInt == 100) && (!this.a))
    {
      o.b(this.c).a(4);
      this.b.getStatusText().setText(2131624348);
      d.a(o.c(this.c));
      long l1 = MemoryUtil.getUsedMemory(GlobalConfig.getAppContext());
      l2 = o.d(this.c) - l1;
      if ((l2 > 0L) && (o.d(this.c) != 0L))
        break label112;
      Toast.makeText(GlobalConfig.getAppContext(), 2131624351, 0).show();
    }
    while (true)
    {
      this.a = true;
      return;
      label112: long l3 = 100L * l2 / o.d(this.c);
      if (l3 <= 1L)
      {
        Toast.makeText(GlobalConfig.getAppContext(), 2131624351, 0).show();
        continue;
      }
      c.a(GlobalConfig.getAppContext(), String.valueOf(l2), String.valueOf(l3));
      if (!SystemUtil.aboveApiLevel(16))
        continue;
      new Handler(Looper.getMainLooper()).postDelayed(new v(), 3000L);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.u
 * JD-Core Version:    0.6.0
 */