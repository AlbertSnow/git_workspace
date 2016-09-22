package com.wandoujia.ripple_framework.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Environment;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.appmanager.LocalAppInfo.UpgradeInfo;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.FileNameUtil;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.download2.DownloadRequestParam.Type;
import com.wandoujia.download2.j;
import com.wandoujia.net.HttpException.Type;
import com.wandoujia.ripple_framework.Config;
import com.wandoujia.ripple_framework.event.DownloadEvent;
import com.wandoujia.ripple_framework.event.DownloadEvent.Type;
import com.wandoujia.udid.UDIDUtil;
import de.greenrobot.event.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class DownloadManager
{
  private static final String a = DownloadManager.class.getSimpleName();
  private static final int b = 1000 + HttpException.Type.INVALID_URL.ordinal();
  private int c;
  private final c d;
  private final AppManager e;
  private BroadcastReceiver f = new DownloadManager.1(this);
  private final j g = new g(this);
  private com.wandoujia.download2.m h;
  private final String i;
  private final m j;
  private final Context k;
  private final Set<l> l = new HashSet();
  private volatile boolean m;
  private w n;
  private final Queue<DownloadManager.DownloadOperation> o = new LinkedList();
  private v p;

  public DownloadManager(Context paramContext, String paramString, AppManager paramAppManager, c paramc)
  {
    this.k = paramContext;
    this.i = paramString;
    this.j = new m(paramContext, paramAppManager);
    this.n = new w(paramContext, paramc);
    this.e = paramAppManager;
    this.d = paramc;
  }

  private void a(DownloadEvent.Type paramType, DownloadInfo paramDownloadInfo)
  {
    DownloadInfo localDownloadInfo;
    Iterator localIterator;
    if (paramDownloadInfo != null)
    {
      localDownloadInfo = paramDownloadInfo.a();
      this.d.d(new DownloadEvent(paramType, localDownloadInfo));
      localIterator = this.l.iterator();
    }
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      l locall = (l)localIterator.next();
      if (paramType == DownloadEvent.Type.DOWNLOAD_STATE_CHANGE)
      {
        locall.a(localDownloadInfo);
        continue;
        localDownloadInfo = null;
        break;
      }
      if (paramType != DownloadEvent.Type.DOWNLOAD_PROGRESS_CHANGE)
        continue;
      locall.b(localDownloadInfo);
    }
  }

  private boolean a(DownloadInfo paramDownloadInfo, boolean paramBoolean)
  {
    int i1 = 1;
    String str;
    long l1;
    int i2;
    if (!TextUtils.isEmpty(paramDownloadInfo.d.a.e))
    {
      str = paramDownloadInfo.d.a.e;
      l1 = paramDownloadInfo.d.d;
      if (l1 >= 0L)
        break label76;
      i2 = i1;
    }
    while (true)
    {
      if (i2 == 0)
      {
        if (paramBoolean)
          Toast.makeText(this.k, R.string.no_enough_storage_tips, i1).show();
        i1 = 0;
      }
      return i1;
      label76: File localFile = Environment.getDownloadCacheDirectory();
      if (str.startsWith(localFile.getPath()));
      while (true)
      {
        if ((localFile == null) || (FileUtil.getAvailableBytes(localFile.getAbsolutePath()) < l1))
          break label155;
        i2 = i1;
        break;
        localFile = new File(FileNameUtil.getFullPath(str));
        if ((localFile.exists()) || (localFile.mkdirs()))
          continue;
        localFile = null;
      }
      label155: i2 = 0;
    }
  }

  private boolean a(DownloadManager.DownloadOperation.OpType paramOpType, DownloadInfo paramDownloadInfo, DownloadManager.PauseReason paramPauseReason)
  {
    if (this.n.b())
      return false;
    if ((paramOpType != null) && (paramDownloadInfo != null))
      this.o.offer(new DownloadManager.DownloadOperation(paramOpType, paramDownloadInfo, paramPauseReason, 0));
    return true;
  }

  private void b(DownloadInfo paramDownloadInfo, boolean paramBoolean)
  {
    g();
    if (a(DownloadManager.DownloadOperation.OpType.RETRY, paramDownloadInfo, null));
    do
      return;
    while ((!f(paramDownloadInfo)) || (!f()));
    boolean bool = a(paramDownloadInfo, false);
    Object localObject = null;
    if (!bool)
    {
      String str1 = Config.r();
      if ((!TextUtils.isEmpty(str1)) && (paramDownloadInfo.d.a.e.startsWith(str1)))
      {
        Toast.makeText(this.k, R.string.no_enough_storage_tips, 1).show();
        return;
      }
    }
    try
    {
      String str2 = b.c(paramDownloadInfo);
      localObject = str2;
      this.h.b(paramDownloadInfo.d.a.e);
      DownloadInfo localDownloadInfo = this.n.a(paramDownloadInfo, paramBoolean, localObject);
      this.h.a(localDownloadInfo.d.a);
      a(DownloadEvent.Type.DOWNLOAD_STATE_CHANGE, localDownloadInfo);
      this.j.a(paramDownloadInfo);
      return;
    }
    catch (StorageUtil.GenerateSaveFileException localGenerateSaveFileException)
    {
      Toast.makeText(this.k, R.string.media_or_file_error, 1).show();
    }
  }

  private void d(DownloadInfo paramDownloadInfo)
  {
    boolean bool = true;
    if (a(DownloadManager.DownloadOperation.OpType.START, paramDownloadInfo, null));
    label162: String str1;
    label216: String str2;
    while (true)
    {
      return;
      if (this.n.c(paramDownloadInfo.b))
      {
        DownloadInfo localDownloadInfo = this.n.a(paramDownloadInfo.b);
        if ((!b.b(paramDownloadInfo)) || (localDownloadInfo.n == paramDownloadInfo.n))
        {
          if (localDownloadInfo.c.isPaused())
          {
            if (!e(paramDownloadInfo))
              continue;
            Log.d(a, "An existing download is paused, resume it.", new Object[0]);
            b(paramDownloadInfo);
            return;
          }
          if (localDownloadInfo.c.isComplete())
          {
            Log.d(a, "An existing download is complete, retry downloading it.", new Object[0]);
            if (e(paramDownloadInfo))
            {
              b(localDownloadInfo, bool);
              return;
            }
          }
        }
        a(localDownloadInfo);
      }
      if ((f(paramDownloadInfo)) && (a(paramDownloadInfo, bool)))
      {
        if (!bool)
          continue;
        if (!b.b(paramDownloadInfo))
          break;
        str1 = paramDownloadInfo.m;
        switch (j.a[paramDownloadInfo.e.ordinal()])
        {
        case 2:
        default:
          str2 = "common";
        case 3:
        case 1:
        }
      }
    }
    while (true)
    {
      com.wandoujia.ripple_framework.log.a.a(str1, str2, paramDownloadInfo.k, paramDownloadInfo.s);
      if (e(paramDownloadInfo))
        this.h.a(paramDownloadInfo.d.a);
      this.n.a(paramDownloadInfo);
      a(DownloadEvent.Type.DOWNLOAD_STATE_CHANGE, paramDownloadInfo);
      this.j.a(paramDownloadInfo);
      if (this.n.c() <= 1000)
        break;
      this.n.a().a(-1000 + this.n.c(), new i(this));
      return;
      bool = false;
      break label162;
      str2 = "app_upgrade_patch";
      continue;
      if (paramDownloadInfo.d.a.a == DownloadRequestParam.Type.GAME_PACKET)
      {
        str2 = "game_packet";
        continue;
      }
      LocalAppInfo localLocalAppInfo = this.e.f(str1);
      if ((localLocalAppInfo == null) || (!localLocalAppInfo.isUpgradable()) || (localLocalAppInfo.getUpgradeInfo().getVersionCode() != paramDownloadInfo.n))
        break label216;
      str2 = "app_upgrade";
    }
  }

  private boolean e(DownloadInfo paramDownloadInfo)
  {
    return (paramDownloadInfo.j) || (NetworkUtil.isWifiConnected(this.k));
  }

  private boolean f()
  {
    int i1 = 1;
    this.c = NetworkUtil.getNetworkType();
    if (this.c == -1)
    {
      Toast.makeText(this.k, R.string.download_no_network_error, i1).show();
      i1 = 0;
    }
    return i1;
  }

  private boolean f(DownloadInfo paramDownloadInfo)
  {
    if (paramDownloadInfo.d.a == null)
    {
      Log.e(a, "Download Request is null, pls check if lack of params when build this request", new Object[0]);
      if (GlobalConfig.isDebug())
        Toast.makeText(this.k, R.string.illegal_download_params, 1).show();
      return false;
    }
    return true;
  }

  private static void g()
  {
    if (Looper.getMainLooper() != Looper.myLooper())
      throw new IllegalThreadStateException("MUST call in UI thread.");
  }

  public final DownloadInfo a(q paramq)
  {
    if (paramq == null)
    {
      Log.e(a, "DownloadRequest null, quit.", new Object[0]);
      return null;
    }
    DownloadInfo localDownloadInfo1;
    try
    {
      DownloadInfo localDownloadInfo2 = b.a(paramq, this.k);
      localDownloadInfo1 = localDownloadInfo2;
      if (localDownloadInfo1 == null)
      {
        Log.e(a, "DownloadRequest illegal, quit.", new Object[0]);
        return null;
      }
    }
    catch (StorageUtil.GenerateSaveFileException localGenerateSaveFileException)
    {
      while (true)
      {
        Toast.makeText(this.k, R.string.media_or_file_error, 1).show();
        localDownloadInfo1 = null;
      }
      d(localDownloadInfo1);
    }
    return localDownloadInfo1;
  }

  public final DownloadInfo a(String paramString)
  {
    return this.n.a(paramString);
  }

  public final List<DownloadInfo> a(e parame)
  {
    g();
    return this.n.a(parame);
  }

  public final void a()
  {
    g();
    IntentFilter localIntentFilter;
    if (!this.m)
    {
      localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
      this.c = NetworkUtil.getNetworkType();
    }
    try
    {
      this.k.registerReceiver(this.f, localIntentFilter);
      label45: this.h = new com.wandoujia.download2.m(this.k, UDIDUtil.a(this.k), this.g, this.i, new h(this));
      this.n.a(new ag(this));
      this.m = true;
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label45;
    }
  }

  public final void a(DownloadInfo paramDownloadInfo)
  {
    g();
    if (a(DownloadManager.DownloadOperation.OpType.CANCEL, paramDownloadInfo, null))
      return;
    this.h.a(paramDownloadInfo.d.a.b);
    this.h.b(paramDownloadInfo.d.a.e);
    FileUtil.deleteFile(paramDownloadInfo.d.a.e);
    DownloadInfo localDownloadInfo = this.n.a(paramDownloadInfo.b, DownloadInfo.Status.CANCELED);
    if (localDownloadInfo == null)
    {
      this.n.b(paramDownloadInfo);
      return;
    }
    this.n.b(paramDownloadInfo);
    a(DownloadEvent.Type.DOWNLOAD_STATE_CHANGE, localDownloadInfo);
    this.j.a(paramDownloadInfo.a);
  }

  public final void a(DownloadInfo paramDownloadInfo, DownloadManager.PauseReason paramPauseReason)
  {
    g();
    if (a(DownloadManager.DownloadOperation.OpType.PAUSE, paramDownloadInfo, paramPauseReason))
      return;
    this.h.a(paramDownloadInfo.d.a.b);
    DownloadInfo localDownloadInfo = this.n.a(paramDownloadInfo.b, DownloadManager.PauseReason.access$1100(paramPauseReason));
    a(DownloadEvent.Type.DOWNLOAD_STATE_CHANGE, localDownloadInfo);
    this.j.a(localDownloadInfo);
  }

  public final void a(l paraml)
  {
    this.l.add(paraml);
  }

  public final void a(v paramv)
  {
    this.p = paramv;
  }

  public final void a(List<DownloadInfo> paramList)
  {
    g();
    DownloadManager.DownloadOperation.OpType localOpType = DownloadManager.DownloadOperation.OpType.CANCEL;
    if (this.n.b());
    for (int i1 = 0; i1 != 0; i1 = 1)
    {
      return;
      Iterator localIterator1 = paramList.iterator();
      while (localIterator1.hasNext())
      {
        DownloadInfo localDownloadInfo3 = (DownloadInfo)localIterator1.next();
        this.o.offer(new DownloadManager.DownloadOperation(localOpType, localDownloadInfo3, null, 0));
      }
    }
    Iterator localIterator2 = paramList.iterator();
    while (localIterator2.hasNext())
    {
      DownloadInfo localDownloadInfo1 = (DownloadInfo)localIterator2.next();
      this.h.a(localDownloadInfo1.d.a.b);
      this.h.b(localDownloadInfo1.d.a.e);
      FileUtil.deleteFile(localDownloadInfo1.d.a.e);
      DownloadInfo localDownloadInfo2 = this.n.a(localDownloadInfo1.b, DownloadInfo.Status.CANCELED);
      if (localDownloadInfo2 == null)
        continue;
      a(DownloadEvent.Type.DOWNLOAD_STATE_CHANGE, localDownloadInfo2);
      this.j.a(localDownloadInfo1.a);
    }
    this.n.a(paramList);
  }

  @Deprecated
  public final DownloadInfo b(String paramString)
  {
    g();
    return this.n.b(paramString);
  }

  public final v b()
  {
    return this.p;
  }

  public final void b(DownloadInfo paramDownloadInfo)
  {
    g();
    DownloadInfo localDownloadInfo1 = a(paramDownloadInfo.b);
    if ((localDownloadInfo1 == null) || (localDownloadInfo1.c == DownloadInfo.Status.PENDING) || (localDownloadInfo1.c == DownloadInfo.Status.DOWNLOADING));
    do
      return;
    while ((a(DownloadManager.DownloadOperation.OpType.RESUME, paramDownloadInfo, null)) || (!f()));
    this.h.a(paramDownloadInfo.d.a);
    DownloadInfo localDownloadInfo2 = this.n.a(paramDownloadInfo.b, DownloadInfo.Status.PENDING);
    a(DownloadEvent.Type.DOWNLOAD_STATE_CHANGE, localDownloadInfo2);
  }

  public final void b(l paraml)
  {
    this.l.remove(paraml);
  }

  public final w c()
  {
    return this.n;
  }

  public final void c(DownloadInfo paramDownloadInfo)
  {
    b(paramDownloadInfo, false);
  }

  public final List<DownloadInfo> d()
  {
    f localf1 = e.a().a();
    ContentTypeEnum.ContentType[] arrayOfContentType = new ContentTypeEnum.ContentType[2];
    arrayOfContentType[0] = ContentTypeEnum.ContentType.APP;
    arrayOfContentType[1] = ContentTypeEnum.ContentType.PATCH;
    f localf2 = localf1.a(arrayOfContentType);
    DownloadInfo.Status[] arrayOfStatus = new DownloadInfo.Status[1];
    arrayOfStatus[0] = DownloadInfo.Status.SUCCESS;
    List localList = a(localf2.a(arrayOfStatus).b());
    if (CollectionUtils.isEmpty(localList))
      return Collections.EMPTY_LIST;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      DownloadInfo localDownloadInfo = (DownloadInfo)localIterator.next();
      if (AppManager.a().h(localDownloadInfo.b))
        continue;
      localArrayList.add(localDownloadInfo);
    }
    try
    {
      Collections.sort(localArrayList, new k(0));
      label150: return localArrayList;
    }
    catch (Exception localException)
    {
      break label150;
    }
  }

  public final int e()
  {
    g();
    return this.n.d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.DownloadManager
 * JD-Core Version:    0.6.0
 */