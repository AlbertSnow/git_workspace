package com.wandoujia.update;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import com.wandoujia.base.log.Log;
import com.wandoujia.update.aidl.IUpdateCallback;
import com.wandoujia.update.aidl.IUpdateRemoteService;
import com.wandoujia.update.aidl.UpdateParams;
import com.wandoujia.update.protocol.CheckUpdateProtocol;
import com.wandoujia.update.protocol.UpdateInfo;
import com.wandoujia.update.toolkit.SelfUpdateResult;
import com.wandoujia.update.toolkit.g;

public class LocalUpdateService extends Service
{
  private static final String a = LocalUpdateService.class.getName();
  private final IBinder b = new a(this);
  private e c;
  private IUpdateCallback d = new c(this);
  private LocalUpdateService.UpdateParams e;
  private UpdateInfo f;
  private String g;
  private d h;
  private Handler i = new b(this, 0);

  private boolean a(String paramString1, String paramString2)
  {
    int j;
    if (this.c != null)
      j = 1;
    while (true)
    {
      return j;
      this.c = new e(this);
      Intent localIntent = new Intent();
      localIntent.setClassName(paramString1, paramString2);
      try
      {
        getApplicationContext().startService(localIntent);
        boolean bool = getApplicationContext().bindService(localIntent, this.c, 0);
        j = bool;
        if (j != 0)
          continue;
        this.c = null;
        return j;
      }
      catch (Exception localException)
      {
        while (true)
          j = 0;
      }
    }
  }

  private boolean i()
  {
    try
    {
      this.c.a.a(this.d, new UpdateParams(this.e));
      return true;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public final d a()
  {
    return this.h;
  }

  protected void a(Message paramMessage)
  {
    int j = 1;
    if (this.h == null)
      return;
    switch (paramMessage.what)
    {
    default:
      return;
    case 1:
      UpdateInfo localUpdateInfo = (UpdateInfo)paramMessage.obj;
      g.a(new SelfUpdateResult(localUpdateInfo, null));
      this.h.a(localUpdateInfo);
      return;
    case 2:
      this.h.b();
      return;
    case 3:
      this.h.a(paramMessage.arg1);
      return;
    case 4:
      g.a(new SelfUpdateResult(this.f, this.g));
      this.h.a(this.f, this.g);
      return;
    case 5:
    }
    d locald = this.h;
    if (paramMessage.arg1 == j);
    while (true)
    {
      locald.a(j);
      return;
      int k = 0;
    }
  }

  public final void a(d paramd)
  {
    this.h = paramd;
  }

  public final UpdateInfo b()
  {
    return this.f;
  }

  public final void b(d paramd)
  {
    if (paramd == this.h)
      this.h = null;
  }

  public final String c()
  {
    return this.g;
  }

  public final boolean d()
  {
    if ((this.c == null) || (this.c.a == null))
    {
      Log.w(a, "not bound", new Object[0]);
      return false;
    }
    this.e.updateDelayMs = 0L;
    i();
    return true;
  }

  public final boolean e()
  {
    Log.d(a, "forceDownloadInstaller()", new Object[0]);
    if ((this.c == null) || (this.c.a == null))
    {
      Log.w(a, "not bound", new Object[0]);
      return false;
    }
    if ((this.e == null) || (this.f == null))
    {
      Log.w(a, "new version is unavailable", new Object[0]);
      return false;
    }
    UpdateParams localUpdateParams = new UpdateParams(this.e);
    localUpdateParams.downloadInstallerOnlyOnWifi = false;
    try
    {
      this.c.a.a(this.f, localUpdateParams);
      label105: return true;
    }
    catch (RemoteException localRemoteException)
    {
      break label105;
    }
  }

  public final void f()
  {
    Log.d(a, "install()", new Object[0]);
    android.support.v4.app.d.a(getApplicationContext(), this.g);
    if ((this.c == null) || (this.c.a == null))
    {
      Log.w(a, "not bound", new Object[0]);
      return;
    }
    try
    {
      this.c.a.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public IBinder onBind(Intent paramIntent)
  {
    return this.b;
  }

  public void onDestroy()
  {
    if ((this.c != null) && (this.c.a != null));
    try
    {
      this.c.a.b();
      label29: if (this.c != null)
      {
        getApplicationContext().unbindService(this.c);
        this.c = null;
      }
      super.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      break label29;
    }
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    Log.i("LocalService", "Received start id " + paramInt2 + ": " + paramIntent, new Object[0]);
    StringBuilder localStringBuilder1 = new StringBuilder("updateParams is null = ");
    boolean bool1;
    boolean bool2;
    if (this.e == null)
    {
      bool1 = true;
      Log.i("LocalService", bool1, new Object[0]);
      StringBuilder localStringBuilder2 = new StringBuilder("intent is null = ");
      if (paramIntent != null)
        break label123;
      bool2 = true;
      label92: Log.i("LocalService", bool2, new Object[0]);
      if (paramIntent != null)
        break label129;
    }
    while (true)
    {
      return 1;
      bool1 = false;
      break;
      label123: bool2 = false;
      break label92;
      try
      {
        label129: LocalUpdateService.UpdateParams localUpdateParams = (LocalUpdateService.UpdateParams)new com.wandoujia.gson.c().a(paramIntent.getExtras().getString("UPDATE_PARAMS"), LocalUpdateService.UpdateParams.class);
        if ((localUpdateParams == null) || (!localUpdateParams.checkUpdateProtocol.isValid()))
          continue;
        this.e = localUpdateParams;
        if ((this.c == null) && (this.e != null))
          a(getApplicationContext().getPackageName(), RemoteUpdateService.class.getName());
        return 3;
      }
      catch (Exception localException)
      {
      }
    }
    return 1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.LocalUpdateService
 * JD-Core Version:    0.6.0
 */