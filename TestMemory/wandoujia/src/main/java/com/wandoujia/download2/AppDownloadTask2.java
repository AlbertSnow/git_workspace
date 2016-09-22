package com.wandoujia.download2;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.AsyncTaskUtils;
import com.wandoujia.base.utils.Base64;
import com.wandoujia.base.utils.CipherUtil;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.logv3.model.packages.DownloadPackage.Builder;
import com.wandoujia.logv3.model.packages.DownloadPackage.VerifyType;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.FeedPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.net.AsyncHttpRequest;
import com.wandoujia.net.AsyncHttpRequest.Method;
import com.wandoujia.net.HttpException;
import com.wandoujia.net.TrackInfo;
import com.wandoujia.net.a;
import com.wandoujia.net.h;
import java.io.File;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class AppDownloadTask2 extends i
{
  private static final String h = e.class.getSimpleName();
  private static byte[] n = { 45, 96, 32, 92, 78, 10, 15, 93, 119, 86, 54, 111, 116, 56, 42, 84 };
  private String i;
  private String j;
  private String k;
  private String l;
  private long m;
  private AppDownloadTask2.DownloadStep o = AppDownloadTask2.DownloadStep.ORIGINAL_URL;
  private List<TrackInfo> p = null;

  AppDownloadTask2(DownloadRequestParam paramDownloadRequestParam, String paramString, a parama)
  {
    super(paramDownloadRequestParam, paramString, parama);
    this.i = paramDownloadRequestParam.b;
    this.j = paramDownloadRequestParam.c;
    this.k = paramDownloadRequestParam.d;
    this.l = paramDownloadRequestParam.g;
  }

  private AsyncHttpRequest o()
  {
    byte[] arrayOfByte = CipherUtil.encrypt(this.i, n);
    String str = "http://portal.wandoujia.com/apkserver/apk-download?url=" + URLEncoder.encode(Base64.encodeToString(arrayOfByte, 2), "UTF-8");
    return new AsyncHttpRequest(Uri.parse(str + "&u=" + this.a));
  }

  private void p()
  {
    this.o = AppDownloadTask2.DownloadStep.ORIGINAL_URL;
    AsyncHttpRequest localAsyncHttpRequest = new AsyncHttpRequest(Uri.parse(this.i), AsyncHttpRequest.Method.GET);
    localAsyncHttpRequest.a(this.k);
    localAsyncHttpRequest.b(this.j);
    this.g = this.b.a(localAsyncHttpRequest, new File(this.c.a.e));
    String str = h;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.i;
    arrayOfObject[1] = this.c.a.e;
    arrayOfObject[2] = Long.valueOf(this.g);
    Log.d(str, "task started url = %s, file_path = %s, requestid = %d", arrayOfObject);
  }

  final void a()
  {
    switch (a.a[this.o.ordinal()])
    {
    default:
      return;
    case 1:
    }
    this.d = this.b.a(this.g).i();
  }

  final void b()
  {
    h localh = this.b.a(this.g);
    if ((this.o == AppDownloadTask2.DownloadStep.ORIGINAL_URL) || (this.o == AppDownloadTask2.DownloadStep.BACKUP_URL))
    {
      if ((this.c.e != 0L) && (this.c.e <= localh.i()))
        break label83;
      this.m = 0L;
      if (!localh.c())
        break label107;
      this.c.e = localh.i();
    }
    label83: label107: 
    do
    {
      return;
      this.m += localh.i() - this.c.e;
      break;
      this.c.d = localh.j();
      this.c.e = localh.i();
    }
    while (this.c.d <= 0L);
    this.c.c = (int)(100L * this.c.e / this.c.d);
  }

  final void c()
  {
    h localh = this.b.a(this.g);
    switch (a.a[this.o.ordinal()])
    {
    default:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      String str1 = h;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.i;
      Log.d(str1, "download success url = %s", arrayOfObject1);
      this.c.b = DownloadInfo2.State.SUCCEED;
      return;
      String str4;
      try
      {
        str4 = localh.g();
        if (TextUtils.isEmpty(str4))
          throw new IllegalArgumentException("result is empty");
      }
      catch (Exception localException)
      {
        String str2 = h;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localException.getMessage();
        Log.d(str2, "apk server result exception errormsg = %s", arrayOfObject2);
        this.c.b = DownloadInfo2.State.FAILED;
        String str3 = h;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Long.valueOf(this.g);
        Log.d(str3, "request apk server exception requestId = %d", arrayOfObject3);
        TaskEvent.Builder localBuilder1 = new TaskEvent.Builder().action(TaskEvent.Action.DOWNLOAD).status(TaskEvent.Status.READY).result(TaskEvent.Result.FAIL).error_detail(localException.getMessage());
        ExtraPackage.Builder localBuilder2 = new ExtraPackage.Builder().download_package(new DownloadPackage.Builder().url(this.c.a.b).build());
        v.b().a(localBuilder1, localBuilder2);
        return;
      }
      JSONObject localJSONObject = new JSONObject(new String(CipherUtil.decrypt(Base64.decode(URLDecoder.decode(str4, "UTF-8"), 2), n), "UTF-8"));
      if (localJSONObject.has("downloadURL"))
      {
        JSONArray localJSONArray = localJSONObject.getJSONArray("downloadURL");
        if ((localJSONArray != null) && (localJSONArray.length() > 0))
        {
          this.i = localJSONArray.getString(0);
          this.g = this.b.a(new AsyncHttpRequest(Uri.parse(this.i)), new File(this.c.a.e));
          this.o = AppDownloadTask2.DownloadStep.BACKUP_URL;
          this.f.a();
          this.c.f = 0L;
          this.c.e = 0L;
          this.c.c = 0;
          this.e = SystemClock.uptimeMillis();
          this.d = 0L;
          String str5 = h;
          Object[] arrayOfObject4 = new Object[2];
          arrayOfObject4[0] = this.i;
          arrayOfObject4[1] = Long.valueOf(this.g);
          Log.d(str5, "start download from backup url = %s, requestId = %d", arrayOfObject4);
          TaskEvent.Builder localBuilder3 = new TaskEvent.Builder().action(TaskEvent.Action.DOWNLOAD).status(TaskEvent.Status.READY).result(TaskEvent.Result.SUCCESS);
          ExtraPackage.Builder localBuilder4 = new ExtraPackage.Builder().download_package(new DownloadPackage.Builder().url(this.c.a.b).build()).feed_package(new FeedPackage.Builder().detail(this.i).build());
          v.b().a(localBuilder3, localBuilder4);
          return;
        }
        throw new IllegalArgumentException("no backup url");
      }
      throw new IllegalArgumentException("parse json failed");
      this.p = super.h();
      if ((this.c.a.f == DownloadPackage.VerifyType.MD5) && (!TextUtils.isEmpty(this.l)))
      {
        AsyncTaskUtils.runAsyncTask(new b(this), new Void[0]);
        return;
      }
      this.c.c = 100;
      continue;
      this.p = super.h();
      this.l = Uri.parse(this.i).getQueryParameter("md5");
      if ((this.c.a.f == DownloadPackage.VerifyType.MD5) && (!TextUtils.isEmpty(this.l)))
      {
        AsyncTaskUtils.runAsyncTask(new b(this), new Void[0]);
        return;
      }
      this.c.c = 100;
    }
  }

  final void d()
  {
    h localh = this.b.a(this.g);
    this.c.b = DownloadInfo2.State.FAILED;
    this.p = super.h();
    String str1 = h;
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = Integer.valueOf(this.o.ordinal());
    arrayOfObject1[1] = Long.valueOf(this.g);
    arrayOfObject1[2] = this.i;
    arrayOfObject1[3] = localh.h().getMessage();
    Log.d(str1, "download app failed step = %d requestId = %d url = %s errormsg = %s", arrayOfObject1);
    switch (a.a[this.o.ordinal()])
    {
    default:
      return;
    case 1:
      this.c.g = localh.h();
      try
      {
        AsyncHttpRequest localAsyncHttpRequest = o();
        this.g = this.b.a(localAsyncHttpRequest);
        this.o = AppDownloadTask2.DownloadStep.GET_URL;
        this.c.b = DownloadInfo2.State.RUNNING;
        String str3 = h;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Long.valueOf(this.g);
        Log.d(str3, "request apk server requestId = %d", arrayOfObject3);
        return;
      }
      catch (Exception localException)
      {
        String str2 = h;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localException.getMessage();
        Log.d(str2, "request apk server exception errormsg = %s", arrayOfObject2);
        return;
      }
    case 2:
    }
    TaskEvent.Builder localBuilder = new TaskEvent.Builder().action(TaskEvent.Action.DOWNLOAD).status(TaskEvent.Status.READY).result(TaskEvent.Result.FAIL).error_detail(localh.h().getMessage());
    ExtraPackage.Builder localBuilder1 = new ExtraPackage.Builder().download_package(new DownloadPackage.Builder().url(this.i).build());
    v.b().a(localBuilder, localBuilder1);
  }

  final void e()
  {
    if ((GlobalConfig.isDebug()) && (l().a()))
      throw new IllegalStateException("InnerDownloadInfo state exception");
    this.e = SystemClock.uptimeMillis();
    this.c.b = DownloadInfo2.State.RUNNING;
    if ((FileUtil.exists(this.c.a.e)) && (this.c.a.f == DownloadPackage.VerifyType.MD5) && (!TextUtils.isEmpty(this.c.a.g)))
    {
      this.o = AppDownloadTask2.DownloadStep.VERIFY;
      AsyncTaskUtils.runAsyncTask(new b(this), new Void[0]);
      return;
    }
    p();
  }

  final void f()
  {
    this.b.b(this.g);
    this.c.b = DownloadInfo2.State.CANCELED;
    String str = h;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.i;
    arrayOfObject[1] = Long.valueOf(this.g);
    Log.d(str, "task started url = %s, requestid = %d", arrayOfObject);
  }

  final void g()
  {
    if ((this.o == AppDownloadTask2.DownloadStep.ORIGINAL_URL) || (this.o == AppDownloadTask2.DownloadStep.BACKUP_URL))
    {
      this.c.f = this.f.a(this.m);
      this.m = 0L;
    }
  }

  final List<TrackInfo> h()
  {
    if ((this.o == AppDownloadTask2.DownloadStep.ORIGINAL_URL) || (this.o == AppDownloadTask2.DownloadStep.BACKUP_URL))
    {
      if (this.p == null)
        this.p = super.h();
      return this.p;
    }
    return Collections.emptyList();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.AppDownloadTask2
 * JD-Core Version:    0.6.0
 */