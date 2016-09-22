package com.wandoujia.launcher_base.app;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.util.SparseIntArray;
import android.widget.Toast;
import com.wandoujia.appmanager.LocalAppChangedListener.Error;
import com.wandoujia.launcher_base.R.string;
import com.wandoujia.launcher_base.view.a.g;

public final class a
{
  private static final SparseIntArray a;

  static
  {
    SparseIntArray localSparseIntArray = new SparseIntArray();
    a = localSparseIntArray;
    localSparseIntArray.put(LocalAppChangedListener.Error.STORAGE_ERROR.ordinal(), R.string.root_notification_installed_failed_container);
    a.put(LocalAppChangedListener.Error.INCONSISTENT_CERTIFICATES.ordinal(), R.string.root_notification_installed_failed_certi);
    a.put(LocalAppChangedListener.Error.INSUFFICIENT_STORAGE.ordinal(), R.string.root_notification_installed_failed_storage);
  }

  public static void a(Context paramContext, String paramString)
  {
    if (paramContext == null)
      return;
    Toast.makeText(paramContext, paramString + " " + paramContext.getString(R.string.root_toast_installed_success), 0).show();
  }

  public static void a(Context paramContext, String paramString, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    if (paramContext == null)
      return;
    g localg = new g(paramContext);
    localg.a(paramContext.getString(R.string.uninstall_dialog_title));
    localg.b(paramContext.getString(R.string.history_apps_uninstall_dialog_title) + " " + paramString);
    localg.a(paramContext.getString(R.string.confirm), paramOnClickListener1);
    localg.b(paramContext.getString(R.string.cancel), paramOnClickListener2);
    localg.b();
  }

  public static void a(Context paramContext, String paramString, LocalAppChangedListener.Error paramError)
  {
    if (paramContext == null)
      return;
    int i = R.string.root_notification_installed_failed;
    int j = a.get(paramError.ordinal());
    if (j > 0);
    while (true)
    {
      String str = paramContext.getString(j);
      Toast.makeText(paramContext, paramString + " " + str, 0).show();
      return;
      j = i;
    }
  }

  public static void b(Context paramContext, String paramString)
  {
    if (paramContext == null)
      return;
    Toast.makeText(paramContext, paramString + " " + paramContext.getString(R.string.root_uninstall_success), 0).show();
  }

  public static void c(Context paramContext, String paramString)
  {
    if (paramContext == null)
      return;
    Toast.makeText(paramContext, paramString + " " + paramContext.getString(R.string.root_uninstall_failed), 0).show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.app.a
 * JD-Core Version:    0.6.0
 */