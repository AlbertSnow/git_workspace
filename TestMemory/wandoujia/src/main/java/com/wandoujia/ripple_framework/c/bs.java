package com.wandoujia.ripple_framework.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.d;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.ImageUtil;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.dimen;
import com.wandoujia.ripple_framework.R.drawable;
import com.wandoujia.ripple_framework.R.string;
import com.wandoujia.ripple_framework.event.DownloadEvent;
import com.wandoujia.ripple_framework.event.DownloadEvent.Type;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.installer.a.a;
import com.wandoujia.ripple_framework.installer.install.InstallTaskInfo;
import com.wandoujia.ripple_framework.installer.install.InstallTaskInfo.EventType;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.UpgradeUtils;
import com.wandoujia.ripple_framework.view.StatefulButton;
import java.util.List;

public class bs extends c
  implements a
{
  protected boolean a = false;
  protected Model g;
  protected InstallTaskInfo.EventType h;
  private boolean i = true;
  private int j;
  private Paint k;
  private Paint l;
  private Bitmap m;
  private int n;
  private boolean o;
  private float p;
  private StatefulButton q;
  private String r;
  private Runnable s = new bv(this);

  public bs()
  {
  }

  public bs(StatefulButton paramStatefulButton)
  {
    this.q = paramStatefulButton;
  }

  private Bitmap a(int paramInt1, int paramInt2)
  {
    if ((this.m == null) || (this.o))
    {
      if (this.m != null)
        this.m.recycle();
      this.m = ImageUtil.creatBitmapSafty(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    }
    Canvas localCanvas = new Canvas(this.m);
    if (this.l == null)
    {
      LinearGradient localLinearGradient = new LinearGradient(0.0F, 0.0F, 0.0F, paramInt2, Color.parseColor("#EEEEEE"), Color.parseColor("#EEEEEE"), Shader.TileMode.CLAMP);
      this.l = new Paint();
      this.l.setColor(Color.parseColor("#EEEEEE"));
      this.l.setShader(localLinearGradient);
      this.l.setAntiAlias(true);
    }
    localCanvas.drawRoundRect(new RectF(0.0F, 0.0F, paramInt1, paramInt2), this.n, this.n, this.l);
    return this.m;
  }

  private void a(InstallTaskInfo paramInstallTaskInfo)
  {
    if (paramInstallTaskInfo == null)
      return;
    this.h = paramInstallTaskInfo.b();
    if ((this.h == InstallTaskInfo.EventType.DOWNLOAD_CANCELED) && (((AppManager)i.k().a("app")).h(this.r)) && (UpgradeUtils.b(this.r) == null))
      this.h = InstallTaskInfo.EventType.INSTALLED;
    int i1 = R.color.white_no_transparency;
    int i2 = R.color.card_button_color_selector;
    int i4;
    Object localObject;
    boolean bool;
    switch (by.a[this.h.ordinal()])
    {
    default:
      int i17 = R.color.card_button_color_selector;
      String str13 = this.q.getContext().getResources().getString(R.string.install);
      i4 = i17;
      localObject = str13;
      bool = true;
    case 1:
    case 5:
    case 3:
    case 7:
    case 8:
    case 6:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 2:
    case 4:
    case 15:
    case 16:
    }
    while (true)
    {
      this.q.setBackgroundResource(i1);
      this.q.setText((CharSequence)localObject);
      this.q.setTextColor(this.q.getContext().getResources().getColorStateList(i4));
      this.q.setEnabled(bool);
      switch (by.a[this.h.ordinal()])
      {
      default:
        return;
      case 1:
      case 3:
      case 4:
      case 5:
        a(paramInstallTaskInfo.c() / 100.0F);
        return;
        String str12 = this.q.getContext().getResources().getString(R.string.pause);
        i1 = R.drawable.jupiter_button_bg_installed;
        i4 = R.color.grey_20;
        localObject = str12;
        bool = true;
        continue;
        int i16 = R.color.grey_20;
        i1 = R.drawable.jupiter_button_bg_installed;
        String str11 = this.q.getContext().getResources().getString(R.string.action_continue);
        i4 = i16;
        localObject = str11;
        bool = true;
        continue;
        i1 = R.drawable.jupiter_button_bg_installed;
        int i15 = R.color.grey_20;
        String str10 = this.q.getContext().getResources().getString(R.string.app_state_download_error);
        i4 = i15;
        localObject = str10;
        bool = true;
        continue;
        String str9 = this.q.getContext().getResources().getString(R.string.installing);
        i1 = R.drawable.jupiter_button_bg_installing;
        i4 = i2;
        localObject = str9;
        bool = false;
        continue;
        if (this.m != null)
        {
          this.m.recycle();
          this.m = null;
        }
        this.k = null;
        this.p = 0.0F;
        a(0.0F);
        int i13;
        if (this.q.b())
          i13 = R.color.green_primary;
        for (int i14 = R.drawable.jupiter_button_bg_light; ; i14 = R.drawable.jupiter_button_bg)
        {
          if (UpgradeUtils.b(this.r) == null)
            break label571;
          String str8 = this.q.getContext().getResources().getString(R.string.upgrade);
          i4 = i13;
          bool = true;
          i1 = i14;
          localObject = str8;
          break;
          i13 = R.color.card_button_color_selector;
        }
        label571: String str7 = this.q.getContext().getResources().getString(R.string.install);
        i4 = i13;
        bool = true;
        i1 = i14;
        localObject = str7;
        continue;
        int i11;
        if (this.q.b())
          i11 = R.color.green_primary;
        for (int i12 = R.drawable.jupiter_button_bg_light; ; i12 = R.drawable.jupiter_button_bg)
        {
          String str6 = this.q.getContext().getResources().getString(R.string.upgrade);
          i4 = i11;
          bool = true;
          i1 = i12;
          localObject = str6;
          break;
          i11 = R.color.card_button_color_selector;
        }
        AppManager.a();
        if (AppManager.c(this.r) == null)
        {
          String str5 = this.q.getContext().getResources().getString(R.string.installed);
          int i9 = R.drawable.jupiter_button_bg_installing;
          int i10 = R.color.text_color_white;
          i1 = i9;
          i4 = i10;
          localObject = str5;
          bool = false;
          continue;
        }
        String str4 = this.q.getContext().getResources().getString(R.string.open);
        i1 = R.drawable.jupiter_button_bg_installed;
        i4 = R.color.grey_20;
        localObject = str4;
        bool = true;
        continue;
        int i7 = R.drawable.jupiter_button_bg_installed;
        int i8 = R.color.card_button_color_selector;
        String str3 = this.q.getResources().getString(R.string.unzipping);
        i1 = i7;
        i4 = i8;
        localObject = str3;
        bool = false;
        continue;
        String str2 = this.q.getResources().getString(R.string.packet_waiting);
        int i5 = R.drawable.jupiter_button_bg_installed;
        int i6 = R.color.grey_20;
        i1 = i5;
        i4 = i6;
        localObject = str2;
        bool = false;
        continue;
        String str1 = this.q.getResources().getString(R.string.install);
        int i3 = R.color.card_button_color_selector;
        i1 = R.drawable.jupiter_button_bg;
        i4 = i3;
        localObject = str1;
        bool = true;
      case 2:
      case 6:
      }
    }
    if (this.a)
    {
      this.q.setVisibility(8);
      return;
    }
    this.q.setVisibility(0);
    return;
    this.m = null;
  }

  private void b()
  {
    if ((this.g.F() != null) && (!CollectionUtils.isEmpty(this.g.F().apk)) && (this.g.F().apk.get(0) != null))
      onEvent(((AppTaskManager)i.k().a("app_task")).b(this.g));
  }

  public void a()
  {
    super.a();
    ((AppTaskManager)i.k().a("app_task")).b(this.r, this);
    ((de.greenrobot.event.c)i.k().a("event_bus")).c(this);
    this.g = null;
    this.r = null;
    this.p = 0.0F;
    this.k = null;
    this.l = null;
    this.m = null;
  }

  public final void a(float paramFloat)
  {
    if (!this.i)
      return;
    this.p = paramFloat;
    if (paramFloat == 0.0F)
    {
      this.q.removeCallbacks(this.s);
      return;
    }
    int i1 = this.q.getWidth();
    int i2 = this.q.getHeight();
    if ((i1 > 0) && (i2 > 0))
    {
      if ((paramFloat < paramFloat) || (paramFloat == 0.0F) || (this.m == null))
        this.m = a(i1, i2);
      for (this.o = true; ; this.o = false)
      {
        do
        {
          Canvas localCanvas = new Canvas(this.m);
          if (this.k == null)
          {
            this.k = new Paint();
            this.k.setAntiAlias(true);
            this.k.setColor(this.j);
          }
          localCanvas.drawRoundRect(new RectF(0.0F, 0.0F, paramFloat * i1, i2), this.n, this.n, this.k);
          Bitmap localBitmap = this.m;
          BitmapDrawable localBitmapDrawable = new BitmapDrawable(this.q.getContext().getResources(), localBitmap);
          d.a(this.q, localBitmapDrawable);
          return;
        }
        while ((paramFloat * i1 <= 2 * this.n) || (!this.o));
        this.m = a(i1, i2);
      }
    }
    this.q.post(this.s);
  }

  protected void a(Context paramContext)
  {
  }

  public void a(Model paramModel)
  {
    if (this.q == null)
      this.q = ((StatefulButton)e());
    while ((paramModel == null) || (paramModel.F() == null))
    {
      return;
      if (this.g == null)
        continue;
      a();
    }
    this.g = paramModel;
    this.j = this.q.getContext().getResources().getColor(R.color.green_primary);
    this.q.getBackground();
    this.n = this.q.getContext().getResources().getDimensionPixelOffset(R.dimen.round_button_radius);
    this.h = InstallTaskInfo.EventType.INIT;
    this.p = 0.0F;
    this.r = paramModel.F().package_name;
    b();
    ((de.greenrobot.event.c)i.k().a("event_bus")).a(this);
    ((AppTaskManager)i.k().a("app_task")).a(this.r, this);
    this.q.setOnClickListener(new bt(this, paramModel, paramModel));
  }

  public final void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public void onEvent(DownloadEvent paramDownloadEvent)
  {
    if (paramDownloadEvent.a == DownloadEvent.Type.DOWNLOAD_INFO_LOADED)
      b();
  }

  public void onEvent(InstallTaskInfo paramInstallTaskInfo)
  {
    if (Looper.getMainLooper() == Looper.myLooper())
    {
      a(paramInstallTaskInfo);
      return;
    }
    new Handler(Looper.getMainLooper()).post(new bu(this, paramInstallTaskInfo));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bs
 * JD-Core Version:    0.6.0
 */