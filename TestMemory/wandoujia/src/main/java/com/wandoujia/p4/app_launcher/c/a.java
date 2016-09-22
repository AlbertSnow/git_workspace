package com.wandoujia.p4.app_launcher.c;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.gms.analytics.internal.f;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;

public final class a
{
  private double a = 60.0D;
  private long b;
  private final Object c = new Object();
  private final String d;

  private a(String paramString)
  {
    this.d = paramString;
  }

  public a(String paramString, byte paramByte)
  {
    this(paramString);
  }

  public static long a()
  {
    if (SystemUtil.getTotalExternalMemorySize() != 0L)
      return SystemUtil.getAvailableExternalStorage();
    return SystemUtil.getAvailableInternalStorage();
  }

  public static void a(Context paramContext)
  {
    paramContext.startActivity(new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"));
  }

  public static void a(Context paramContext, String paramString)
  {
    a(paramContext, paramString, new b());
  }

  public static void a(Context paramContext, String paramString, View.OnClickListener paramOnClickListener)
  {
    AlertDialog localAlertDialog = new AlertDialog.Builder(paramContext).show();
    View localView = LayoutInflater.from(paramContext).inflate(2130903218, null);
    String str = String.format(paramContext.getResources().getText(2131624625).toString(), new Object[] { paramString });
    ((TextView)localView.findViewById(2131493413)).setText(str);
    localView.findViewById(2131492885).setOnClickListener(new c(paramOnClickListener, localAlertDialog));
    localView.findViewById(2131493242).setOnClickListener(new d(localAlertDialog));
    localAlertDialog.setOnCancelListener(new e(paramOnClickListener, localView));
    localAlertDialog.setContentView(localView);
    TaskEvent.Builder localBuilder = new TaskEvent.Builder().action(TaskEvent.Action.OPEN).status(TaskEvent.Status.END).result(TaskEvent.Result.SUCCESS);
    localBuilder.view_log_package(new ViewLogPackage.Builder().module("disk_clean").action(ViewLogPackage.Action.POPUP).element(ViewLogPackage.Element.PAGE).name("/apps/app_launcher/pages/fastcleandialog").build());
    ExtraPackage.Builder localBuilder1 = new ExtraPackage.Builder();
    i.k().h().a(localBuilder, localBuilder1);
  }

  public static long b()
  {
    long l = SystemUtil.getTotalExternalMemorySize();
    if (l != 0L)
      return l;
    return SystemUtil.getTotalInternalMemorySize();
  }

  public final boolean c()
  {
    synchronized (this.c)
    {
      long l = System.currentTimeMillis();
      if (this.a < 60.0D)
      {
        double d1 = (l - this.b) / 2000.0D;
        if (d1 > 0.0D)
          this.a = Math.min(60.0D, d1 + this.a);
      }
      this.b = l;
      if (this.a >= 1.0D)
      {
        this.a -= 1.0D;
        return true;
      }
      f.a("Excessive " + this.d + " detected; call ignored.");
      return false;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.c.a
 * JD-Core Version:    0.6.0
 */