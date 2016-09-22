package com.wandoujia.download2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.AsyncTaskUtils;
import com.wandoujia.logv3.model.packages.DownloadPackage.Builder;
import com.wandoujia.logv3.model.packages.DownloadPackage.Status;
import com.wandoujia.logv3.model.packages.DownloadPackage.Type;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.net.HttpException;
import com.wandoujia.net.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class m
{
  private static final String a = m.class.getSimpleName();
  private final String b;
  private final int c;
  private final String d;
  private final Handler e = new Handler(Looper.getMainLooper());
  private List<i> f = new LinkedList();
  private j g;
  private k h;
  private a i;
  private Runnable j = new o(this);

  public m(Context paramContext, String paramString1, j paramj, String paramString2)
  {
    this.d = paramString1;
    this.g = paramj;
    this.b = paramString2;
    this.c = -1;
    a(paramContext);
    String str = a;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString2;
    arrayOfObject[1] = Integer.valueOf(this.c);
    Log.d(str, "init wandoujia download name = %s maxRunningTasks = %d", arrayOfObject);
  }

  public m(Context paramContext, String paramString1, j paramj, String paramString2, k paramk)
  {
    this.d = paramString1;
    this.g = paramj;
    this.h = paramk;
    this.b = paramString2;
    this.c = 3;
    a(paramContext);
    String str = a;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString2;
    arrayOfObject[1] = Integer.valueOf(3);
    Log.d(str, "init wandoujia download name = %s maxRunningTasks = %d", arrayOfObject);
  }

  private void a(Context paramContext)
  {
    this.i = new a(paramContext, new n(this));
  }

  private void a(i parami)
  {
    Iterator localIterator;
    if (parami.l().a())
      localIterator = this.f.iterator();
    while (true)
    {
      i locali;
      if (localIterator.hasNext())
      {
        locali = (i)localIterator.next();
        if (locali.l().b != DownloadInfo2.State.PENDING)
          break label116;
      }
      label116: for (int k = 1; k != 0; k = 0)
      {
        locali.e();
        this.f.remove(parami);
        String str = a;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(this.f.size());
        Log.d(str, "task completed tasks.size = %d", arrayOfObject);
        return;
      }
    }
  }

  private void a(TaskEvent.Status paramStatus, TaskEvent.Result paramResult, i parami)
  {
    DownloadInfo2 localDownloadInfo2 = parami.l();
    TaskEvent.Builder localBuilder = new TaskEvent.Builder();
    DownloadPackage.Builder localBuilder1 = new DownloadPackage.Builder();
    localBuilder.action(TaskEvent.Action.DOWNLOAD).status(paramStatus).result(paramResult);
    DownloadPackage.Builder localBuilder2 = localBuilder1.client_name(this.b);
    DownloadInfo2.State localState = localDownloadInfo2.b;
    DownloadPackage.Status localStatus;
    label107: DownloadPackage.Builder localBuilder3;
    DownloadPackage.Type localType1;
    switch (h.a[localState.ordinal()])
    {
    default:
      localStatus = null;
      localBuilder3 = localBuilder2.status(localStatus).url(localDownloadInfo2.a.b);
      DownloadRequestParam.Type localType = localDownloadInfo2.a.a;
      int k = q.b[localType.ordinal()];
      localType1 = null;
      switch (k)
      {
      case 2:
      default:
      case 3:
      case 4:
      case 1:
      case 5:
      }
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    LinkedList localLinkedList;
    while (true)
    {
      localBuilder3.type(localType1).cookies(localDownloadInfo2.a.d).refer(localDownloadInfo2.a.c).file_path(localDownloadInfo2.a.e).verify_type(localDownloadInfo2.a.f).verify_digest(localDownloadInfo2.a.g);
      localLinkedList = new LinkedList();
      switch (q.a[localDownloadInfo2.b.ordinal()])
      {
      default:
        AsyncTaskUtils.runAsyncTask(new p(localDownloadInfo2, localLinkedList, localBuilder1, localBuilder), new Void[0]);
        return;
        localStatus = DownloadPackage.Status.PENDING;
        break label107;
        localStatus = DownloadPackage.Status.RUNNING;
        break label107;
        localStatus = DownloadPackage.Status.CANCELED;
        break label107;
        localStatus = DownloadPackage.Status.SUCCEED;
        break label107;
        localStatus = DownloadPackage.Status.FAILED;
        break label107;
        localType1 = DownloadPackage.Type.APP;
        continue;
        localType1 = DownloadPackage.Type.COMMON;
        continue;
        localType1 = DownloadPackage.Type.PLAY_EXP;
      case 3:
      case 2:
      case 4:
      }
    }
    if (localDownloadInfo2.g == null)
      throw new IllegalStateException("need exception");
    if ((localDownloadInfo2.g instanceof HttpException))
    {
      HttpException localHttpException = (HttpException)localDownloadInfo2.g;
      localBuilder1.error_code(Integer.valueOf(localHttpException.getType()));
      localBuilder.error_detail(localHttpException.getMessage());
    }
    while (true)
    {
      localBuilder1.total_size(Long.valueOf(localDownloadInfo2.d)).download_size(Long.valueOf(parami.k())).duration(Long.valueOf(parami.j()));
      localLinkedList.addAll(parami.h());
      break;
      localBuilder1.error_code(Integer.valueOf(10000));
      localBuilder.error_detail(localDownloadInfo2.g.getMessage());
    }
  }

  private void b()
  {
    this.e.postDelayed(this.j, 500L);
  }

  private static void c()
  {
    if (Looper.getMainLooper() != Looper.myLooper())
      throw new IllegalThreadStateException("MUST call in UI thread.");
  }

  public final void a(DownloadRequestParam paramDownloadRequestParam)
  {
    c();
    String str1 = a;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramDownloadRequestParam.b;
    Log.d(str1, "add task url = %s", arrayOfObject);
    String str2 = this.d;
    a locala = this.i;
    k localk = this.h;
    Object localObject;
    switch (q.b[paramDownloadRequestParam.a.ordinal()])
    {
    default:
      localObject = null;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (localObject == null)
    {
      throw new IllegalArgumentException("download type not support");
      localObject = new e(paramDownloadRequestParam, str2, locala);
      continue;
      localObject = new AppDownloadTask2(paramDownloadRequestParam, str2, locala);
      continue;
      localObject = new AppV2DownloadTask2(paramDownloadRequestParam, str2, locala, localk);
    }
    if ((this.f.size() < this.c) || (this.c == -1))
      ((i)localObject).e();
    if (this.f.isEmpty())
      b();
    this.f.add(localObject);
    a(TaskEvent.Status.START, null, (i)localObject);
  }

  public final void a(String paramString)
  {
    c();
    Log.d(a, "remove task url = %s", new Object[] { paramString });
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (!locali.n().equals(paramString))
        continue;
      a(TaskEvent.Status.END, TaskEvent.Result.CANCEL, locali);
      if (locali.l().b == DownloadInfo2.State.RUNNING)
        locali.f();
      a(locali);
      return;
    }
    Log.d(a, "no task to remove url = %s", new Object[] { paramString });
  }

  public final void b(String paramString)
  {
    c();
    Log.d(a, "delete cache ", new Object[0]);
    this.i.a(paramString);
  }

  public final DownloadInfo2 c(String paramString)
  {
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (locali.n().equals(paramString))
        return locali.l();
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.m
 * JD-Core Version:    0.6.0
 */