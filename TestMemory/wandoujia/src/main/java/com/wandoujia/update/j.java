package com.wandoujia.update;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v4.app.b;
import com.wandoujia.base.log.Log;
import com.wandoujia.gson.c;
import com.wandoujia.net.AsyncHttpRequest;
import com.wandoujia.net.AsyncHttpRequest.Method;
import com.wandoujia.net.g;
import com.wandoujia.update.protocol.CheckUpdateProtocol;
import com.wandoujia.update.protocol.EventReportProtocol;
import com.wandoujia.update.protocol.EventReportProtocol.EventStatus;
import com.wandoujia.update.protocol.EventReportProtocol.EventType;
import com.wandoujia.update.protocol.UpdateInfo;
import java.io.File;
import java.util.concurrent.TimeUnit;

public final class j
{
  private Context a;
  private CheckUpdateProtocol b;
  private p c;
  private r d;
  private long e;
  private File f;
  private UpdateInfo g;
  private boolean h = false;
  private com.wandoujia.net.a i;
  private long j = -1L;
  private long k = -1L;
  private g l = new l(this);

  public j(Context paramContext)
  {
    this.a = paramContext;
    b.A(this.a);
    this.i = new com.wandoujia.net.a(paramContext, this.l);
  }

  public final void a(CheckUpdateProtocol paramCheckUpdateProtocol, p paramp)
  {
    Log.d(j.class.getSimpleName(), String.format("check update", new Object[0]), new Object[0]);
    long l1 = b.P();
    if (l1 <= 0L)
    {
      l1 = System.currentTimeMillis();
      b.b(l1);
    }
    paramCheckUpdateProtocol.installedDays = TimeUnit.MILLISECONDS.convert(System.currentTimeMillis() - l1, TimeUnit.DAYS);
    ConnectivityManager localConnectivityManager = (ConnectivityManager)this.a.getSystemService("connectivity");
    if (localConnectivityManager != null)
    {
      NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
      if ((localNetworkInfo != null) && (localNetworkInfo.isConnected()))
      {
        paramCheckUpdateProtocol.netType = localNetworkInfo.getTypeName();
        paramCheckUpdateProtocol.netSubtype = localNetworkInfo.getSubtypeName();
      }
    }
    this.b = paramCheckUpdateProtocol;
    this.c = paramp;
    AsyncHttpRequest localAsyncHttpRequest = new AsyncHttpRequest(Uri.parse("https://upgrade.wandoujia.com/upgrade"), AsyncHttpRequest.Method.POST);
    com.wandoujia.net.a.a locala = new com.wandoujia.net.a.a(new c().a(paramCheckUpdateProtocol, new k().getType()));
    locala.a("application/json");
    localAsyncHttpRequest.a(locala);
    this.j = this.i.a(localAsyncHttpRequest);
  }

  public final void a(EventReportProtocol.EventType paramEventType, EventReportProtocol.EventStatus paramEventStatus, String paramString1, String paramString2)
  {
    EventReportProtocol localEventReportProtocol = new EventReportProtocol();
    localEventReportProtocol.udid = this.b.udid;
    localEventReportProtocol.appName = this.b.appName;
    localEventReportProtocol.versionName = this.b.versionName;
    localEventReportProtocol.versionCode = this.b.versionCode;
    localEventReportProtocol.source = this.b.source;
    localEventReportProtocol.rom = this.b.rom;
    localEventReportProtocol.romVersion = this.b.romVersion;
    localEventReportProtocol.eventType = paramEventType;
    localEventReportProtocol.eventStatus = paramEventStatus;
    localEventReportProtocol.eventDateTime = System.currentTimeMillis();
    if (this.g != null)
      localEventReportProtocol.ekey = this.g.getEkey();
    if (paramEventType == EventReportProtocol.EventType.DOWNLOAD_COMPLETE)
      localEventReportProtocol.downloadTimeMS = (System.currentTimeMillis() - this.e);
    localEventReportProtocol.errorType = paramString1;
    localEventReportProtocol.errorInfo = paramString2;
    AsyncHttpRequest localAsyncHttpRequest = new AsyncHttpRequest(Uri.parse("https://upgrade.wandoujia.com/event"), AsyncHttpRequest.Method.POST);
    com.wandoujia.net.a.a locala = new com.wandoujia.net.a.a(new c().a(localEventReportProtocol, new m().getType()));
    locala.a("application/json");
    localAsyncHttpRequest.a(locala);
    this.i.a(localAsyncHttpRequest);
  }

  public final boolean a(UpdateInfo paramUpdateInfo, r paramr, boolean paramBoolean)
  {
    if ((paramUpdateInfo == null) || (!paramUpdateInfo.isValid()) || (!paramUpdateInfo.hasNewVersion()))
      return false;
    this.g = paramUpdateInfo;
    this.h = paramBoolean;
    this.e = System.currentTimeMillis();
    this.d = paramr;
    Context localContext = this.a;
    String str = paramUpdateInfo.getMd5();
    File localFile1 = b.B(localContext);
    if (localFile1 == null);
    for (File localFile2 = null; ; localFile2 = new File(localFile1, str + ".apk"))
    {
      this.f = localFile2;
      if (this.f != null)
        break;
      this.d.a(false);
      return true;
    }
    new o(this).execute(new Void[0]);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.j
 * JD-Core Version:    0.6.0
 */