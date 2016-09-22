package com.wandoujia.jupiter.library.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v4.view.ViewPager;
import android.support.v7.app.f;
import android.view.View;
import android.widget.TextView;
import com.nineoldandroids.animation.ArgbEvaluator;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.event.DownloadEvent;
import com.wandoujia.ripple_framework.event.DownloadEvent.Type;
import com.wandoujia.ripple_framework.i;

public final class c extends com.wandoujia.ripple_framework.view.slidingtab.e
  implements TransitionTab, e
{
  private DownloadTabView b;
  private int c;
  private int d;

  public c(String paramString)
  {
    super(paramString);
  }

  private void d()
  {
    if (this.b == null)
      return;
    this.b.setNumber(((DownloadManager)i.k().a("download")).e());
  }

  public final View a(Context paramContext, int paramInt, ViewPager paramViewPager, f paramf)
  {
    if (this.b == null)
      this.b = DownloadTabView.a(paramContext);
    this.b.setOnClickListener(new d(paramViewPager, paramInt));
    d();
    return this.b;
  }

  public final void a()
  {
    ((de.greenrobot.event.c)i.k().a("event_bus")).a(this);
  }

  public final void a(TransitionTab.State paramState)
  {
    if (this.b == null)
      return;
    this.c = this.b.getNumberView().getCurrentTextColor();
    if (this.b.isSelected());
    for (int i = paramState.getNumColorList().getColorForState(new int[] { 16842913 }, this.c); ; i = paramState.getNumColorList().getDefaultColor())
    {
      this.d = i;
      return;
    }
  }

  public final void a(TransitionTab.State paramState, float paramFloat)
  {
    if (this.b == null)
      return;
    this.b.getNumberView().setTextColor(((Integer)a.evaluate(paramFloat, Integer.valueOf(this.c), Integer.valueOf(this.d))).intValue());
    DownloadTabView localDownloadTabView = this.b;
    if (paramState == TransitionTab.State.DARK);
    while (true)
    {
      localDownloadTabView.a(paramFloat);
      return;
      paramFloat = 1.0F - paramFloat;
    }
  }

  public final void b()
  {
    ((de.greenrobot.event.c)i.k().a("event_bus")).c(this);
  }

  public final void b(TransitionTab.State paramState)
  {
    if (this.b == null)
      return;
    this.b.getNumberView().setTextColor(paramState.getNumColorList());
  }

  public final void onEvent(DownloadEvent paramDownloadEvent)
  {
    if ((paramDownloadEvent.a != DownloadEvent.Type.DOWNLOAD_INFO_LOADED) && (paramDownloadEvent.a != DownloadEvent.Type.DOWNLOAD_STATE_CHANGE))
      return;
    d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.view.c
 * JD-Core Version:    0.6.0
 */