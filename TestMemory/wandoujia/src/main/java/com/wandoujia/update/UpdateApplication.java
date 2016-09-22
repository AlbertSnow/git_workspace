package com.wandoujia.update;

import android.app.Application;
import android.content.Context;
import android.support.v4.app.b;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.update.protocol.CheckUpdateProtocol;
import com.wandoujia.update.toolkit.g;

public abstract class UpdateApplication<T extends LocalUpdateService> extends Application
{
  private static final String a = UpdateApplication.class.getName();
  private LocalUpdateService.UpdateParams b;

  protected abstract LocalUpdateService.UpdateParams b();

  public final LocalUpdateService.UpdateParams i()
  {
    return this.b;
  }

  public void onCreate()
  {
    super.onCreate();
    GlobalConfig.setAppContext(getApplicationContext());
    b.A(getApplicationContext());
    g.a((Class)((java.lang.reflect.ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
    this.b = b();
    if ((this.b == null) || (this.b.checkUpdateProtocol == null) || (!this.b.checkUpdateProtocol.isValid()))
      throw new IllegalArgumentException("invalid parameters!");
    g.a(this.b.notificationIcon);
    String str1 = SystemUtil.getProcessName(getApplicationContext());
    String str2 = getApplicationContext().getPackageName();
    Log.d(a, "processName: " + str1, new Object[0]);
    Log.d(a, "packageName: " + str2, new Object[0]);
    if (!str1.equals(str2))
      return;
    g.a(getApplicationContext(), this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.UpdateApplication
 * JD-Core Version:    0.6.0
 */