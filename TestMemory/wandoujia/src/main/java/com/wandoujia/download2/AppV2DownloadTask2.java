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
import com.wandoujia.net.HttpException.Type;
import com.wandoujia.net.TrackInfo;
import com.wandoujia.net.a;
import com.wandoujia.net.h;
import java.io.File;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

final class AppV2DownloadTask2 extends i
{
  private static final String h = e.class.getSimpleName();
  private static byte[] p = { 45, 96, 32, 92, 78, 10, 15, 93, 119, 86, 54, 111, 116, 56, 42, 84 };
  private static final int q = 1000 + HttpException.Type.INVALID_URL.ordinal();
  private static final int r = 1001 + HttpException.Type.INVALID_URL.ordinal();
  private String i;
  private String j;
  private String k;
  private String l;
  private String m;
  private long n;
  private k o;
  private AppV2DownloadTask2.DownloadStep s = AppV2DownloadTask2.DownloadStep.PRE_DOWNLOAD_URL;
  private List<TrackInfo> t = null;

  AppV2DownloadTask2(DownloadRequestParam paramDownloadRequestParam, String paramString, a parama, k paramk)
  {
    super(paramDownloadRequestParam, paramString, parama);
    this.i = paramDownloadRequestParam.b;
    this.k = paramDownloadRequestParam.c;
    this.l = paramDownloadRequestParam.d;
    this.o = paramk;
    this.m = paramDownloadRequestParam.g;
  }

  private AsyncHttpRequest o()
  {
    return new AsyncHttpRequest(Uri.parse(this.j));
  }

  private void p()
  {
    this.s = AppV2DownloadTask2.DownloadStep.ORIGINAL_URL;
    AsyncHttpRequest localAsyncHttpRequest = new AsyncHttpRequest(Uri.parse(this.i), AsyncHttpRequest.Method.GET);
    if (!TextUtils.isEmpty(this.l))
      localAsyncHttpRequest.a(this.l);
    if (!TextUtils.isEmpty(this.k))
      localAsyncHttpRequest.b(this.k);
    this.g = this.b.a(localAsyncHttpRequest, new File(this.c.a.e));
    this.l = null;
    this.k = null;
    String str = h;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.i;
    arrayOfObject[1] = this.c.a.e;
    arrayOfObject[2] = Long.valueOf(this.g);
    Log.d(str, "task started url = %s, file_path = %s, requestid = %d", arrayOfObject);
  }

  final void a()
  {
    switch (c.a[this.s.ordinal()])
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
    if ((this.s == AppV2DownloadTask2.DownloadStep.ORIGINAL_URL) || (this.s == AppV2DownloadTask2.DownloadStep.BACKUP_URL))
    {
      if ((this.c.e != 0L) && (this.c.e <= localh.i()))
        break label83;
      this.n = 0L;
      if (!localh.c())
        break label107;
      this.c.e = localh.i();
    }
    label83: label107: 
    do
    {
      return;
      this.n += localh.i() - this.c.e;
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
    JSONObject localJSONObject2;
    int i2;
    switch (c.a[this.s.ordinal()])
    {
    default:
      String str1 = h;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.i;
      Log.d(str1, "download success url = %s", arrayOfObject1);
      this.c.b = DownloadInfo2.State.SUCCEED;
      return;
    case 2:
      String str8;
      try
      {
        str8 = localh.g();
        if (TextUtils.isEmpty(str8))
          throw new IllegalArgumentException("real download server result is empty");
      }
      catch (Exception localException2)
      {
        String str6 = h;
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = localException2.getMessage();
        Log.d(str6, "download server result exception errormsg = %s", arrayOfObject5);
        this.c.b = DownloadInfo2.State.FAILED;
        this.c.g = localException2;
        String str7 = h;
        Object[] arrayOfObject6 = new Object[1];
        arrayOfObject6[0] = Long.valueOf(this.g);
        Log.d(str7, "download server exception requestId = %d", arrayOfObject6);
        TaskEvent.Builder localBuilder5 = new TaskEvent.Builder().action(TaskEvent.Action.DOWNLOAD).status(TaskEvent.Status.PENDING).result(TaskEvent.Result.FAIL).error_detail(localException2.getMessage());
        ExtraPackage.Builder localBuilder6 = new ExtraPackage.Builder().download_package(new DownloadPackage.Builder().url(this.c.a.b).build());
        v.b().a(localBuilder5, localBuilder6);
        return;
      }
      localJSONObject2 = new JSONObject(str8);
      if (this.c.a.h.containsKey("ignore_compatible"))
        break;
      if ((localJSONObject2.has("compatible")) && (!localJSONObject2.isNull("compatible")))
      {
        if (localJSONObject2.getInt("compatible") == 0)
          break label1316;
        i2 = 1;
      }
      break;
    case 3:
    case 1:
    case 4:
    }
    int i1;
    while (true)
    {
      if ((localJSONObject2.has("incompatibleDetail")) && (!localJSONObject2.isNull("incompatibleDetail")));
      for (String str11 = localJSONObject2.getString("incompatibleDetail"); ; str11 = null)
      {
        if (i1 == 0)
        {
          if (TextUtils.isEmpty(str11))
            str11 = "no detail";
          throw new HttpException(q, str11);
        }
        if (localJSONObject2.has("url"));
        for (String str9 = localJSONObject2.getString("url"); ; str9 = null)
        {
          if (localJSONObject2.has("md5"));
          for (String str10 = localJSONObject2.getString("md5"); ; str10 = null)
          {
            if (localJSONObject2.has("cookies"))
              this.l = localJSONObject2.getString("cookies");
            if (localJSONObject2.has("referUrl"))
              this.k = localJSONObject2.getString("referUrl");
            if (localJSONObject2.has("retryUrl"))
              this.j = localJSONObject2.getString("retryUrl");
            if ((TextUtils.isEmpty(str9)) || (TextUtils.isEmpty(str10)))
              throw new HttpException(r, "real download server invalid json");
            this.i = str9;
            this.m = str10;
            if ((FileUtil.exists(this.c.a.e)) && (this.c.a.f == DownloadPackage.VerifyType.MD5) && (!TextUtils.isEmpty(this.c.a.g)))
            {
              this.s = AppV2DownloadTask2.DownloadStep.VERIFY;
              AsyncTaskUtils.runAsyncTask(new d(this), new Void[0]);
              return;
            }
            p();
            return;
            String str4;
            try
            {
              str4 = localh.g();
              if (TextUtils.isEmpty(str4))
                throw new IllegalArgumentException("result is empty");
            }
            catch (Exception localException1)
            {
              String str2 = h;
              Object[] arrayOfObject2 = new Object[1];
              arrayOfObject2[0] = localException1.getMessage();
              Log.d(str2, "apk server result exception errormsg = %s", arrayOfObject2);
              this.c.b = DownloadInfo2.State.FAILED;
              String str3 = h;
              Object[] arrayOfObject3 = new Object[1];
              arrayOfObject3[0] = Long.valueOf(this.g);
              Log.d(str3, "request apk server exception requestId = %d", arrayOfObject3);
              TaskEvent.Builder localBuilder1 = new TaskEvent.Builder().action(TaskEvent.Action.DOWNLOAD).status(TaskEvent.Status.READY).result(TaskEvent.Result.FAIL).error_detail(localException1.getMessage());
              ExtraPackage.Builder localBuilder2 = new ExtraPackage.Builder().download_package(new DownloadPackage.Builder().url(this.c.a.b).build());
              v.b().a(localBuilder1, localBuilder2);
              return;
            }
            JSONObject localJSONObject1 = new JSONObject(new String(CipherUtil.decrypt(Base64.decode(URLDecoder.decode(str4, "UTF-8"), 2), p), "UTF-8"));
            if (localJSONObject1.has("downloadURL"))
            {
              JSONArray localJSONArray = localJSONObject1.getJSONArray("downloadURL");
              if ((localJSONArray != null) && (localJSONArray.length() > 0))
              {
                this.i = localJSONArray.getString(0);
                this.g = this.b.a(new AsyncHttpRequest(Uri.parse(this.i)), new File(this.c.a.e));
                this.s = AppV2DownloadTask2.DownloadStep.BACKUP_URL;
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
            this.t = super.h();
            if ((this.c.a.f == DownloadPackage.VerifyType.MD5) && (!TextUtils.isEmpty(this.m)))
            {
              AsyncTaskUtils.runAsyncTask(new d(this), new Void[0]);
              return;
            }
            this.c.c = 100;
            break;
            this.t = super.h();
            this.m = Uri.parse(this.i).getQueryParameter("md5");
            if ((this.c.a.f == DownloadPackage.VerifyType.MD5) && (!TextUtils.isEmpty(this.m)))
            {
              AsyncTaskUtils.runAsyncTask(new d(this), new Void[0]);
              return;
            }
            this.c.c = 100;
            break;
          }
        }
      }
      i1 = 1;
    }
    while (true)
    {
      i1 = i2;
      break;
      label1316: i2 = 0;
    }
  }

  final void d()
  {
    h localh = this.b.a(this.g);
    this.c.b = DownloadInfo2.State.FAILED;
    this.t = super.h();
    String str1 = h;
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = Integer.valueOf(this.s.ordinal());
    arrayOfObject1[1] = Long.valueOf(this.g);
    arrayOfObject1[2] = this.i;
    arrayOfObject1[3] = localh.h().getMessage();
    Log.d(str1, "download app failed step = %d requestId = %d url = %s errormsg = %s", arrayOfObject1);
    switch (c.a[this.s.ordinal()])
    {
    default:
      return;
    case 1:
      this.c.g = localh.h();
      try
      {
        AsyncHttpRequest localAsyncHttpRequest = o();
        this.g = this.b.a(localAsyncHttpRequest);
        this.s = AppV2DownloadTask2.DownloadStep.GET_URL;
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
    case 3:
      TaskEvent.Builder localBuilder3 = new TaskEvent.Builder().action(TaskEvent.Action.DOWNLOAD).status(TaskEvent.Status.READY).result(TaskEvent.Result.FAIL).error_detail(localh.h().getMessage());
      ExtraPackage.Builder localBuilder4 = new ExtraPackage.Builder().download_package(new DownloadPackage.Builder().url(this.i).build());
      v.b().a(localBuilder3, localBuilder4);
      return;
    case 2:
    }
    this.c.g = localh.h();
    TaskEvent.Builder localBuilder1 = new TaskEvent.Builder().action(TaskEvent.Action.DOWNLOAD).status(TaskEvent.Status.PENDING).result(TaskEvent.Result.FAIL).error_detail(this.c.g.getMessage());
    ExtraPackage.Builder localBuilder2 = new ExtraPackage.Builder().download_package(new DownloadPackage.Builder().url(this.c.a.b).build());
    v.b().a(localBuilder1, localBuilder2);
  }

  final void e()
  {
    if ((GlobalConfig.isDebug()) && (l().a()))
      throw new IllegalStateException("InnerDownloadInfo state exception");
    this.s = AppV2DownloadTask2.DownloadStep.PRE_DOWNLOAD_URL;
    AsyncHttpRequest localAsyncHttpRequest = new AsyncHttpRequest(Uri.parse(this.i), AsyncHttpRequest.Method.GET);
    this.e = SystemClock.uptimeMillis();
    this.c.b = DownloadInfo2.State.RUNNING;
    localAsyncHttpRequest.a(this.l);
    localAsyncHttpRequest.b(this.k);
    localAsyncHttpRequest.a("Accept", "application/json;charset=utf-8");
    this.g = this.b.a(localAsyncHttpRequest);
    this.l = null;
    this.k = null;
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
    if ((this.s == AppV2DownloadTask2.DownloadStep.ORIGINAL_URL) || (this.s == AppV2DownloadTask2.DownloadStep.BACKUP_URL))
    {
      this.c.f = this.f.a(this.n);
      this.n = 0L;
    }
  }

  final List<TrackInfo> h()
  {
    if ((this.s == AppV2DownloadTask2.DownloadStep.ORIGINAL_URL) || (this.s == AppV2DownloadTask2.DownloadStep.BACKUP_URL))
    {
      if (this.t == null)
        this.t = super.h();
      return this.t;
    }
    return Collections.emptyList();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.AppV2DownloadTask2
 * JD-Core Version:    0.6.0
 */