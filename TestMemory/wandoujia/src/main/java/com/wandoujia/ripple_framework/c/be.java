package com.wandoujia.ripple_framework.c;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.DownloadUrl;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.string;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.installer.install.InstallTaskInfo;
import com.wandoujia.ripple_framework.installer.install.InstallTaskInfo.EventType;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class be extends c
  implements com.wandoujia.ripple_framework.installer.a.a
{
  private static final int a = R.id.progress_bar;
  private static final int g = R.id.progress_bar_speed;
  private static final int h = R.id.progress_bar_status;
  private static final int i = R.id.progress_bar_size;
  private final int j;
  private Model k;
  private String l;
  private boolean m;

  public be()
  {
    this(0);
  }

  public be(int paramInt)
  {
    this.j = paramInt;
    this.m = false;
  }

  private static CharSequence a(String paramString, int paramInt)
  {
    SpannableString localSpannableString = new SpannableString(paramString);
    localSpannableString.setSpan(new ForegroundColorSpan(paramInt), 0, paramString.length(), 17);
    return localSpannableString;
  }

  private void a(boolean paramBoolean)
  {
    if (this.k != null)
      this.k.n();
    if (paramBoolean)
    {
      d().b().b(g).f(0).b(i).f(0).b(a).f(0).b(h).f(0).b(this.j).f(4);
      return;
    }
    d().b().b(g).f(4).b(i).f(4).b(a).f(4).b(h).f(4).b(this.j).f(0);
  }

  private void a(boolean paramBoolean, InstallTaskInfo paramInstallTaskInfo)
  {
    if (paramBoolean)
    {
      d().b().b(g).f(0).b(i).f(0).b(a).f(0).b(h).f(4);
      int n;
      if ((paramInstallTaskInfo != null) && ((paramInstallTaskInfo.b() != InstallTaskInfo.EventType.DOWNLOADING) || (paramInstallTaskInfo.c() != 0.0F)))
      {
        n = (int)paramInstallTaskInfo.c();
        if (paramInstallTaskInfo.b() != InstallTaskInfo.EventType.DOWNLOADING)
          break label192;
        d().b().b(a).c(0).d(n);
      }
      while (paramInstallTaskInfo.b() == InstallTaskInfo.EventType.DOWNLOAD_PAUSED)
      {
        d().b().b(g).a(a(i.k().g().getString(R.string.paused), i.k().g().getResources().getColor(R.color.list_header_label_text_color)));
        d().b().b(i).a("");
        return;
        label192: if (paramInstallTaskInfo.b() != InstallTaskInfo.EventType.DOWNLOAD_PAUSED)
          continue;
        d().b().b(a).c(n).d(0);
      }
      com.wandoujia.nirvana.framework.ui.a.a locala2 = d().b().b(g);
      long l1 = paramInstallTaskInfo.d();
      String str1;
      com.wandoujia.nirvana.framework.ui.a.a locala3;
      long l3;
      long l4;
      if ((float)l1 < 1024.0F)
      {
        Context localContext4 = i.k().g();
        int i3 = R.string.byte_per_s;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Long.valueOf(l1);
        str1 = localContext4.getString(i3, arrayOfObject3);
        locala2.a(str1);
        locala3 = d().b().b(i);
        l3 = paramInstallTaskInfo.f();
        l4 = paramInstallTaskInfo.e();
        if (l4 > 0L)
          break label458;
      }
      label458: for (String str2 = ""; ; str2 = TextUtil.formatSizeInfo(l3) + "/" + TextUtil.formatSizeInfo(l4))
      {
        locala3.a(str2);
        return;
        long l2 = ()((float)l1 / 1024.0F);
        if ((float)l2 < 1024.0F)
        {
          Context localContext3 = i.k().g();
          int i2 = R.string.KB_per_s;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Long.valueOf(l2);
          str1 = localContext3.getString(i2, arrayOfObject2);
          break;
        }
        Context localContext2 = i.k().g();
        int i1 = R.string.MB_per_s;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Float.valueOf((float)l2 / 1024.0F);
        str1 = localContext2.getString(i1, arrayOfObject1);
        break;
      }
    }
    com.wandoujia.nirvana.framework.ui.a.a locala1 = d().b().b(g).f(4).b(i).f(4).b(a).f(4).b(h).f(0);
    Context localContext1;
    if (paramInstallTaskInfo != null)
      localContext1 = i.k().g().getApplicationContext();
    Object localObject;
    switch (bf.a[paramInstallTaskInfo.b().ordinal()])
    {
    case 2:
    default:
      localObject = "";
    case 5:
    case 4:
    case 1:
    case 6:
    case 7:
    case 8:
    case 3:
    }
    while (true)
    {
      locala1.a((CharSequence)localObject);
      return;
      localObject = localContext1.getString(R.string.status_pending);
      continue;
      if (paramInstallTaskInfo.c() == 0.0F)
      {
        localObject = localContext1.getString(R.string.status_pending);
        continue;
      }
      localObject = localContext1.getString(R.string.status_downloading);
      continue;
      localObject = localContext1.getString(R.string.paused);
      continue;
      localObject = a(localContext1.getString(R.string.status_failed), localContext1.getResources().getColor(R.color.warning_color_normal));
      continue;
      localObject = localContext1.getString(R.string.status_canceled);
      continue;
      localObject = localContext1.getString(R.string.status_success);
      continue;
      localObject = localContext1.getString(R.string.unzipping);
    }
  }

  public final void a()
  {
    super.a();
    a(false);
    a(false, null);
    if (this.m)
    {
      this.m = false;
      ((AppTaskManager)i.k().a("app_task")).b(this.l, this);
    }
    this.k = null;
  }

  protected final void a(Model paramModel)
  {
    paramModel.F();
    String str1;
    if (!CollectionUtils.isEmpty(paramModel.F().apk))
      str1 = paramModel.F().package_name;
    while (true)
    {
      if ((str1 != null) && (!str1.equals(this.l)))
        a();
      this.k = paramModel;
      this.l = str1;
      if (!this.m)
      {
        this.m = true;
        ((AppTaskManager)i.k().a("app_task")).a(this.l, this);
      }
      String str2;
      if (!CollectionUtils.isEmpty(this.k.F().apk))
        str2 = ((ApkDetail)this.k.F().apk.get(0)).download_url.url;
      while (true)
      {
        if (str2 != null)
        {
          onEvent(((AppTaskManager)i.k().a("app_task")).b(this.k));
          return;
          if (CollectionUtils.isEmpty(paramModel.z()))
            break label285;
          str1 = ((Model)paramModel.z().get(0)).F().package_name;
          break;
          if ((!CollectionUtils.isEmpty(this.k.z())) && (!CollectionUtils.isEmpty(((Model)this.k.z().get(0)).F().apk)))
          {
            str2 = ((ApkDetail)((Model)this.k.z().get(0)).F().apk.get(0)).download_url.url;
            continue;
          }
        }
        else
        {
          a(false);
          return;
        }
        str2 = null;
      }
      label285: str1 = null;
    }
  }

  public final void onEvent(InstallTaskInfo paramInstallTaskInfo)
  {
    if (paramInstallTaskInfo == null);
    do
      return;
    while ((paramInstallTaskInfo.a() != null) && (!paramInstallTaskInfo.a().equals(this.k.F().package_name)));
    InstallTaskInfo.EventType localEventType1 = paramInstallTaskInfo.b();
    int i1;
    int n;
    if (paramInstallTaskInfo != null)
    {
      InstallTaskInfo.EventType localEventType2 = paramInstallTaskInfo.b();
      if ((localEventType2 == InstallTaskInfo.EventType.DOWNLOADING) || (localEventType2 == InstallTaskInfo.EventType.DOWNLOAD_PENDING) || (localEventType2 == InstallTaskInfo.EventType.DOWNLOAD_PAUSED) || (localEventType2 == InstallTaskInfo.EventType.UNZIPPING))
      {
        i1 = 1;
        if (i1 == 0)
          break label149;
        n = 1;
        label89: if (n == 0)
          break label154;
        a(true);
        switch (bf.a[localEventType1.ordinal()])
        {
        default:
        case 1:
        case 2:
        case 3:
        case 4:
        }
      }
    }
    label149: label154: 
    do
    {
      a(false, paramInstallTaskInfo);
      return;
      i1 = 0;
      break;
      n = 0;
      break label89;
      a(false);
      return;
      a(true, paramInstallTaskInfo);
      return;
    }
    while (paramInstallTaskInfo.c() == 0.0F);
    a(true, paramInstallTaskInfo);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.be
 * JD-Core Version:    0.6.0
 */