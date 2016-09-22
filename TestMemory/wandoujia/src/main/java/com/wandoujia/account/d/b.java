package com.wandoujia.account.d;

import android.view.View;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;

public final class b
{
  private static final ExtraPackage.Builder a = new ExtraPackage.Builder();

  public static void a()
  {
  }

  public static void a(View paramView, String paramString1, ViewLogPackage.Element paramElement, ViewLogPackage.Action paramAction, String paramString2)
  {
    v.b().a(paramView, paramString1).a(paramView, paramElement, paramAction, paramString2).d(paramView);
  }

  public static void a(TaskEvent.Action paramAction, TaskEvent.Result paramResult)
  {
    a(paramAction, paramResult, "");
  }

  public static void a(TaskEvent.Action paramAction, TaskEvent.Result paramResult, String paramString)
  {
    a(new TaskEvent.Builder().action(paramAction).status(TaskEvent.Status.START).result(paramResult).result_info(paramString));
  }

  private static void a(TaskEvent.Builder paramBuilder)
  {
    ExtraPackage.Builder localBuilder = a;
    v.b().a(paramBuilder, localBuilder);
  }

  public static void a(String paramString1, ViewLogPackage.Action paramAction, String paramString2, Long paramLong)
  {
    ViewLogPackage.Builder localBuilder = new ViewLogPackage.Builder();
    localBuilder.module(paramString1).action(paramAction).name(paramString2).value(paramLong);
    TaskEvent.Builder localBuilder1 = new TaskEvent.Builder();
    localBuilder1.action(TaskEvent.Action.VIEW_EVENT).view_log_package(localBuilder.build());
    ExtraPackage.Builder localBuilder2 = new ExtraPackage.Builder();
    v.b().a(localBuilder1, localBuilder2);
  }

  public static void b(TaskEvent.Action paramAction, TaskEvent.Result paramResult, String paramString)
  {
    a(new TaskEvent.Builder().action(paramAction).status(TaskEvent.Status.END).result(paramResult).result_info(paramString));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.d.b
 * JD-Core Version:    0.6.0
 */