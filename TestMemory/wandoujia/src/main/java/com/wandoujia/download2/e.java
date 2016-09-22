package com.wandoujia.download2;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.AsyncTaskUtils;
import com.wandoujia.logv3.model.packages.DownloadPackage.VerifyType;
import com.wandoujia.net.AsyncHttpRequest;
import com.wandoujia.net.AsyncHttpRequest.Method;
import com.wandoujia.net.TrackInfo;
import com.wandoujia.net.a;
import com.wandoujia.net.h;
import java.io.File;
import java.util.List;

class e extends i
{
  private static final String h = e.class.getSimpleName();
  private long i;
  private List<TrackInfo> j = null;

  e(DownloadRequestParam paramDownloadRequestParam, String paramString, a parama)
  {
    super(paramDownloadRequestParam, paramString, parama);
  }

  final void a()
  {
    this.d = this.b.a(this.g).i();
  }

  final void b()
  {
    h localh = this.b.a(this.g);
    if ((this.c.e == 0L) || (this.c.e > localh.i()))
    {
      this.i = 0L;
      if (!localh.c())
        break label87;
      this.c.e = localh.i();
    }
    label87: 
    do
    {
      return;
      this.i += localh.i() - this.c.e;
      break;
      this.c.d = localh.j();
      this.c.e = localh.i();
    }
    while (this.c.d <= 0L);
    this.c.c = (int)(100L * this.c.e / this.c.d);
  }

  final void c()
  {
    this.j = super.h();
    this.b.a(this.g);
    if ((this.c.a.f == DownloadPackage.VerifyType.MD5) && (!TextUtils.isEmpty(this.c.a.g)))
    {
      AsyncTaskUtils.runAsyncTask(new f(this), new Void[0]);
      return;
    }
    this.c.b = DownloadInfo2.State.SUCCEED;
    this.c.c = 100;
    String str = h;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(this.g);
    Log.d(str, "onRequestComplete requestid= %d", arrayOfObject);
  }

  final void d()
  {
    this.j = super.h();
    h localh = this.b.a(this.g);
    this.c.g = localh.h();
    this.c.b = DownloadInfo2.State.FAILED;
    String str = h;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(this.g);
    arrayOfObject[1] = this.c.g.getMessage();
    Log.d(str, "onRequestError requestid = %d, errormsg = %s", arrayOfObject);
  }

  final void e()
  {
    if ((GlobalConfig.isDebug()) && (l().a()))
      throw new IllegalStateException("InnerDownloadInfo state exception");
    this.c.b = DownloadInfo2.State.RUNNING;
    this.e = SystemClock.uptimeMillis();
    AsyncHttpRequest localAsyncHttpRequest = new AsyncHttpRequest(Uri.parse(this.c.a.b), AsyncHttpRequest.Method.GET);
    localAsyncHttpRequest.a(this.c.a.d);
    localAsyncHttpRequest.b(this.c.a.c);
    this.g = this.b.a(localAsyncHttpRequest, new File(this.c.a.e));
    String str = h;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.c.a.b;
    arrayOfObject[1] = this.c.a.e;
    arrayOfObject[2] = Long.valueOf(this.g);
    Log.d(str, "task started url = %s, file_path = %s, requestid = %d", arrayOfObject);
  }

  final void f()
  {
    this.b.b(this.g);
    this.c.b = DownloadInfo2.State.CANCELED;
    String str = h;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.c.a.b;
    arrayOfObject[1] = Long.valueOf(this.g);
    Log.d(str, "task stoped url = %s, requestid = %d", arrayOfObject);
  }

  final void g()
  {
    this.c.f = this.f.a(this.i);
    this.i = 0L;
  }

  final List<TrackInfo> h()
  {
    if (this.j == null)
      this.j = super.h();
    return this.j;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.e
 * JD-Core Version:    0.6.0
 */