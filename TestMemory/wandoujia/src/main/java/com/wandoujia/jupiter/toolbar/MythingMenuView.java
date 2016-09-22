package com.wandoujia.jupiter.toolbar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.nineoldandroids.animation.ValueAnimator;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.p4.app.upgrade.a;
import com.wandoujia.ripple_framework.download.DownloadInfo.Status;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.e;
import com.wandoujia.ripple_framework.download.f;
import com.wandoujia.ripple_framework.event.DownloadEvent;
import com.wandoujia.ripple_framework.event.DownloadEvent.Type;
import de.greenrobot.event.c;
import java.util.List;

public class MythingMenuView extends TextView
{
  private int a;
  private com.wandoujia.p4.app.upgrade.k b;
  private Paint c;
  private Bitmap d;
  private ValueAnimator e;
  private int f;
  private int g;
  private Rect h;
  private boolean i = false;

  public MythingMenuView(Context paramContext)
  {
    super(paramContext);
    a();
  }

  public MythingMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  public MythingMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }

  private static int a(DownloadManager paramDownloadManager, DownloadInfo.Status[] paramArrayOfStatus)
  {
    return paramDownloadManager.a(e.a().a(paramArrayOfStatus).a().b()).size();
  }

  private void a()
  {
    setTextSize(1, 11.0F);
    setTextColor(getResources().getColor(2131362046));
    setTypeface(null, 1);
    setGravity(17);
    setOnClickListener(new j(this));
    Context localContext = getContext();
    this.c = new Paint();
    this.d = BitmapFactory.decodeResource(getResources(), 2130838138);
    this.f = ((android.support.v4.app.i.a(48.0F, getContext()) - this.d.getWidth()) / 2);
    this.h = new Rect(0, 0, android.support.v4.app.i.a(48.0F, localContext), android.support.v4.app.i.a(32.0F, localContext));
    this.e = ValueAnimator.ofFloat(new float[] { 1.0F });
    this.e.setDuration(2000L);
    this.e.setRepeatCount(-1);
    this.e.setInterpolator(new DecelerateInterpolator());
    this.e.addUpdateListener(new k(this));
  }

  private void b()
  {
    if (!com.wandoujia.jupiter.j.a().l())
    {
      JupiterApplication.a().postDelayed(new m(this), 200L);
      return;
    }
    DownloadManager localDownloadManager = (DownloadManager)com.wandoujia.ripple_framework.i.k().a("download");
    if (localDownloadManager.e() > 0)
    {
      DownloadInfo.Status[] arrayOfStatus1 = new DownloadInfo.Status[1];
      arrayOfStatus1[0] = DownloadInfo.Status.DOWNLOADING;
      if (a(localDownloadManager, arrayOfStatus1) > 0)
        this.i = true;
    }
    do
    {
      setBackgroundResource(2130838140);
      setText(null);
      while (true)
      {
        if ((!this.e.isRunning()) && (this.i))
          this.e.start();
        if (this.i)
          break;
        this.e.cancel();
        return;
        DownloadInfo.Status[] arrayOfStatus2 = new DownloadInfo.Status[1];
        arrayOfStatus2[0] = DownloadInfo.Status.FAILED;
        if (a(localDownloadManager, arrayOfStatus2) > 0)
        {
          this.i = false;
          setBackgroundResource(2130838139);
          setText(null);
          continue;
        }
        this.i = false;
        setBackgroundResource(2130838141);
        setText(null);
      }
      this.i = false;
    }
    while (this.a <= 0);
    setBackgroundResource(2130838142);
    if (this.a > 99);
    for (int j = 99; ; j = this.a)
    {
      setText(Integer.toString(j));
      break;
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.d == null)
      this.d = BitmapFactory.decodeResource(getResources(), 2130838138);
    List localList = ((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).i();
    localList.removeAll(((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).k());
    this.a = localList.size();
    b();
    ((c)com.wandoujia.ripple_framework.i.k().a("event_bus")).a(this);
    this.b = new l(this);
    a.a(this.b);
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ((c)com.wandoujia.ripple_framework.i.k().a("event_bus")).c(this);
    this.d.recycle();
    this.d = null;
    this.e.cancel();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.i) && (this.d != null))
    {
      paramCanvas.save();
      paramCanvas.clipRect(this.h);
      paramCanvas.drawBitmap(this.d, this.f, this.g, this.c);
      paramCanvas.restore();
    }
  }

  public void onEvent(DownloadEvent paramDownloadEvent)
  {
    if ((paramDownloadEvent.a != DownloadEvent.Type.DOWNLOAD_INFO_LOADED) && (paramDownloadEvent.a != DownloadEvent.Type.DOWNLOAD_STATE_CHANGE))
      return;
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.toolbar.MythingMenuView
 * JD-Core Version:    0.6.0
 */