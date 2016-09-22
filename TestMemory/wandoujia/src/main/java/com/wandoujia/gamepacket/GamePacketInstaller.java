package com.wandoujia.gamepacket;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.ExtensionPack;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.base.utils.ThreadPool;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class GamePacketInstaller
{
  private Context a;
  private boolean b = false;
  private UnZipManager c;
  private final Map<String, GamePacketInstaller.InstallStatus> d;
  private final List<m> e;
  private final Map<String, String> f;
  private final Handler g = new Handler(Looper.getMainLooper());
  private final Map<String, Runnable> h;
  private BroadcastReceiver i = new GamePacketInstaller.1(this);

  public GamePacketInstaller(Context paramContext)
  {
    this.a = paramContext;
    d.d(paramContext);
    this.c = new UnZipManager(paramContext);
    this.e = new LinkedList();
    this.d = new ConcurrentHashMap();
    this.h = new ConcurrentHashMap();
    this.f = new HashMap();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    paramContext.registerReceiver(this.i, localIntentFilter);
  }

  private void a(String paramString, Context paramContext, ExtensionPack paramExtensionPack, n paramn)
  {
    long l;
    if (paramExtensionPack != null)
    {
      l = 3L * paramExtensionPack.size.longValue();
      if (FileUtil.getAvailableBytes(e.a) < l)
        break label144;
    }
    label144: for (int j = 1; (j == 0) && ((paramContext instanceof Activity)); j = 0)
    {
      b localb = new b(paramContext).a(paramContext.getString(R.string.gamepacket_unzip_warning_title));
      int k = R.string.gamepacket_unzip_warning_message;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = TextUtil.formatSizeInfo(l);
      localb.b(paramContext.getString(k, arrayOfObject)).b(paramContext.getString(R.string.cancel), new h()).a(paramContext.getString(R.string.gamepacket_unzip_warning_confirm), new g(this, paramString, paramExtensionPack, paramn)).a().show();
      return;
    }
    a(paramString, paramExtensionPack, paramn);
  }

  private void a(String paramString, ExtensionPack paramExtensionPack, n paramn)
  {
    if (paramExtensionPack != null)
    {
      i locali = new i(this, paramString, paramExtensionPack, paramn);
      this.h.put(paramString, locali);
      ThreadPool.execute(locali);
    }
  }

  private void a(String paramString1, String paramString2)
  {
    this.g.post(new f(this, paramString1, paramString2));
  }

  private GamePacketInstaller.InstallStatus d(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
      return (GamePacketInstaller.InstallStatus)this.d.get(paramString);
    return null;
  }

  public final void a()
  {
    this.b = true;
  }

  public final void a(Activity paramActivity, AppDetail paramAppDetail, n paramn)
  {
    if ((paramAppDetail == null) || (CollectionUtils.isEmpty(paramAppDetail.extension_pack)));
    do
    {
      return;
      String str = d.d();
      if (!TextUtils.isEmpty(str))
      {
        Iterator localIterator = paramAppDetail.extension_pack.iterator();
        while (localIterator.hasNext())
        {
          ExtensionPack localExtensionPack = (ExtensionPack)localIterator.next();
          if ((localExtensionPack == null) || (localExtensionPack.supported_cpu_types == null) || (!localExtensionPack.supported_cpu_types.contains(str)))
            continue;
          a(paramAppDetail.package_name, paramActivity, localExtensionPack, paramn);
          return;
        }
      }
      Boolean localBoolean = ((ExtensionPack)paramAppDetail.extension_pack.get(0)).matched;
      if ((localBoolean != null) && (localBoolean.booleanValue()))
      {
        a(paramAppDetail.package_name, paramActivity, (ExtensionPack)paramAppDetail.extension_pack.get(0), paramn);
        return;
      }
      if ((!this.b) || (paramActivity == null) || (paramActivity.getWindow() == null) || (paramActivity.getWindow().getDecorView() == null))
        continue;
      View localView = paramActivity.getWindow().getDecorView().getRootView();
      if ((localView == null) || (!(localView instanceof ViewGroup)))
        continue;
      GpuDetectUtils.a((ViewGroup)localView);
    }
    while (paramActivity == null);
    new s(paramActivity, paramAppDetail.extension_pack, new v(this, paramAppDetail, paramActivity, paramn)).a().show();
  }

  public final void a(m paramm)
  {
    if (Looper.getMainLooper() != Looper.myLooper())
      throw new IllegalStateException("Must not run on UI thread");
    this.e.add(paramm);
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (d(paramString1) == GamePacketInstaller.InstallStatus.INSTALLING);
    label378: label383: 
    while (true)
    {
      return;
      String str1 = (String)this.f.get(paramString1);
      if ((d(paramString1) == GamePacketInstaller.InstallStatus.INSTALL_APK) && (!TextUtils.isEmpty(str1)) && (FileUtil.exists(str1)))
      {
        a(paramString1, (String)this.f.get(paramString1));
        return;
      }
      String str2;
      if (!TextUtils.isEmpty(paramString4))
        if ((paramString4.startsWith("Android/obb/")) || (paramString4.startsWith("Android/data/")))
        {
          str2 = e.a + File.separator + paramString4;
          if (str2.endsWith(File.separator))
            break label378;
        }
      for (String str3 = str2 + File.separator; ; str3 = str2)
      {
        if ((TextUtils.isEmpty(str3)) || (a(paramString1)))
          break label383;
        this.c.a(paramString1, paramString2, str3, new ac(paramString3, ".apk"), new ab(this, paramString1));
        return;
        if (paramString4.startsWith(paramString1 + File.separator))
        {
          str2 = e.b + paramString4;
          break;
        }
        if (paramString4.startsWith("/mnt/sdcard"))
        {
          str2 = e.a + paramString4.substring(11);
          break;
        }
        str2 = e.a + File.separator + paramString4;
        break;
        str2 = e.b + paramString1 + File.separator + paramString4;
        break;
      }
    }
  }

  public final boolean a(String paramString)
  {
    return d(paramString) == GamePacketInstaller.InstallStatus.INSTALLING;
  }

  public final boolean b(String paramString)
  {
    return d(paramString) == GamePacketInstaller.InstallStatus.PENDING;
  }

  public final int c(String paramString)
  {
    return this.c.a(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.GamePacketInstaller
 * JD-Core Version:    0.6.0
 */