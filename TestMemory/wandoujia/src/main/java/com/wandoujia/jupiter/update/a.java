package com.wandoujia.jupiter.update;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.update.LocalUpdateService;
import com.wandoujia.update.d;
import com.wandoujia.update.protocol.UpdateInfo;
import com.wandoujia.update.protocol.UpdateInfo.SelfUpdatePriority;
import com.wandoujia.update.toolkit.SelfUpdateResult;
import com.wandoujia.update.toolkit.g;
import de.greenrobot.event.c;

public final class a
  implements d
{
  private ServiceConnection a;
  private LocalUpdateService b;

  private void c()
  {
    Context localContext = JupiterApplication.e();
    if (this.b != null)
    {
      this.b.b(this);
      if ((this.a != null) && (localContext != null))
        localContext.unbindService(this.a);
      this.a = null;
      this.b = null;
    }
  }

  public final void a()
  {
    if ("12022".equals(android.support.v4.app.b.P("NEED_EXTREME_UPDATE_KEY")))
    {
      ((c)i.k().a("event_bus")).d(g.a());
      return;
    }
    new Handler(Looper.getMainLooper()).postDelayed(new b(this), 10000L);
  }

  public final void a(int paramInt)
  {
  }

  public final void a(UpdateInfo paramUpdateInfo)
  {
    if (!paramUpdateInfo.hasNewVersion())
      c();
  }

  public final void a(UpdateInfo paramUpdateInfo, String paramString)
  {
    ((c)i.k().a("event_bus")).d(new SelfUpdateResult(paramUpdateInfo, paramString));
    if (paramUpdateInfo.getPriority() == UpdateInfo.SelfUpdatePriority.EXTREME)
      android.support.v4.app.b.k("NEED_EXTREME_UPDATE_KEY", "12022");
    c();
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      SelfUpdateResult localSelfUpdateResult = g.a();
      ((c)i.k().a("event_bus")).d(localSelfUpdateResult);
      if (localSelfUpdateResult.updateInfo.getPriority() == UpdateInfo.SelfUpdatePriority.EXTREME)
        android.support.v4.app.b.k("NEED_EXTREME_UPDATE_KEY", "12022");
    }
    c();
  }

  public final void b()
  {
    c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.update.a
 * JD-Core Version:    0.6.0
 */