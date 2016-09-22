package com.wandoujia.p4.app_launcher.b;

import android.widget.TextView;
import com.wandoujia.base.utils.AsyncTaskUtils;
import com.wandoujia.p4.app_launcher.clean.e;
import com.wandoujia.p4.app_launcher.clean.widget.CleanWidget;
import com.wandoujia.p4.app_launcher.clean.widget.a;
import com.wandoujia.p4.app_launcher.clean.widget.b;
import com.wandoujia.p4.app_launcher.clean.widget.i;

final class o
{
  private a a;
  private e b;
  private b c;
  private i d;
  private boolean e = false;
  private long f;

  private void b(CleanWidget paramCleanWidget)
  {
    if (this.e)
      return;
    this.e = true;
    this.a.a(0);
    paramCleanWidget.setEnabled(false);
    paramCleanWidget.getStatusText().setText(2131625346);
    AsyncTaskUtils.runAsyncTask(new s(this, paramCleanWidget), new Void[0]);
  }

  public final void a(CleanWidget paramCleanWidget)
  {
    this.a = new a(paramCleanWidget.getCircleProgressBar(), paramCleanWidget.getProgressText(), paramCleanWidget.getProgressImg());
    this.b = new p(this, paramCleanWidget);
    paramCleanWidget.setOnClickListener(new r(this, this.f, paramCleanWidget));
    b(paramCleanWidget);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.o
 * JD-Core Version:    0.6.0
 */