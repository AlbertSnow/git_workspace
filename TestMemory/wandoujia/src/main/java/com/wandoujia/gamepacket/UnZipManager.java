package com.wandoujia.gamepacket;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.wandoujia.base.utils.FileUtil;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class UnZipManager
{
  private static final ExecutorService a = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
  private final Map<String, UnZipManager.UnZipStatus> b = new ConcurrentHashMap();
  private final Map<String, Integer> c = new ConcurrentHashMap();
  private final Handler d = new Handler(Looper.getMainLooper());
  private final Context e;

  public UnZipManager(Context paramContext)
  {
    this.e = paramContext;
  }

  private void a(String paramString, UnZipManager.UnZipStatus paramUnZipStatus, ab paramab)
  {
    this.b.put(paramString, paramUnZipStatus);
    if (paramab != null)
      this.d.post(new y(paramab, paramUnZipStatus));
  }

  public final int a(String paramString)
  {
    return ((Integer)this.c.get(paramString)).intValue();
  }

  public final void a(String paramString1, String paramString2, String paramString3, ac paramac, ab paramab)
  {
    if (!FileUtil.exists(paramString2))
    {
      a(paramString1, UnZipManager.UnZipStatus.FAILED, paramab);
      return;
    }
    a.execute(new UnZipManager.UnZipTask(this, paramString1, paramString2, paramString3, paramac, paramab));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.UnZipManager
 * JD-Core Version:    0.6.0
 */