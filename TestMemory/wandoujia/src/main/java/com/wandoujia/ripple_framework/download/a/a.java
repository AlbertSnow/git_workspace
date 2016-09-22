package com.wandoujia.ripple_framework.download.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.wandoujia.ripple_framework.Config;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import java.util.List;

public class a
{
  private static final String a = a.class.getSimpleName();
  private final Context b;
  private HandlerThread c;
  private Handler d;
  private final q e;
  private final Handler f = new Handler(Looper.getMainLooper());
  private final de.greenrobot.event.c g;

  public a(Context paramContext, de.greenrobot.event.c paramc)
  {
    this.e = new q(paramContext);
    this.c = new HandlerThread(a);
    this.c.start();
    this.d = new Handler(this.c.getLooper());
    this.b = paramContext;
    this.g = paramc;
    if (!Config.q())
      this.d.post(new b(this));
  }

  public final void a(int paramInt, p paramp)
  {
    this.d.post(new c(this, paramInt, paramp));
  }

  public final void a(DownloadInfo paramDownloadInfo, o paramo)
  {
    this.d.post(new f(this, paramDownloadInfo, paramo));
  }

  public final void a(p paramp)
  {
    this.d.post(new k(this, paramp));
  }

  public final void a(List<DownloadInfo> paramList, o paramo)
  {
    this.d.post(new h(this, paramList, paramo));
  }

  public final void b(DownloadInfo paramDownloadInfo, o paramo)
  {
    this.d.post(new g(this, paramDownloadInfo, paramo));
  }

  public final void b(p paramp)
  {
    this.d.post(new m(this, paramp));
  }

  public final void c(DownloadInfo paramDownloadInfo, o paramo)
  {
    this.d.post(new i(this, paramDownloadInfo, paramo));
  }

  public final void d(DownloadInfo paramDownloadInfo, o paramo)
  {
    this.d.post(new j(this, paramDownloadInfo, paramo));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.a.a
 * JD-Core Version:    0.6.0
 */