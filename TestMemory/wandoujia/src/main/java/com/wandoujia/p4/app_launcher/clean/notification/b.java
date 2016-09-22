package com.wandoujia.p4.app_launcher.clean.notification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.jupiter.notification.e;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
{
  private static final int a = "app_launcher_clean".hashCode();

  private static CharSequence a(String paramString, int paramInt, String[] paramArrayOfString)
  {
    Object localObject;
    if (TextUtils.isEmpty(paramString))
      localObject = "";
    while (true)
    {
      return localObject;
      localObject = new SpannableString(paramString);
      ForegroundColorSpan localForegroundColorSpan = new ForegroundColorSpan(paramInt);
      for (int i = 0; i <= 0; i++)
      {
        Matcher localMatcher = Pattern.compile(paramArrayOfString[0]).matcher(paramString);
        if (!localMatcher.find())
          continue;
        ((SpannableString)localObject).setSpan(localForegroundColorSpan, localMatcher.start(), localMatcher.end(), 33);
      }
    }
  }

  public static void a(int paramInt)
  {
    String str1 = GlobalConfig.getAppContext().getString(2131624347);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    String str2 = String.format(str1, arrayOfObject);
    int i = GlobalConfig.getAppContext().getResources().getColor(2131361893);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = (paramInt + "%");
    CharSequence localCharSequence = a(str2, i, arrayOfString);
    String str3 = GlobalConfig.getAppContext().getString(2131624343);
    Intent localIntent = new Intent(GlobalConfig.getAppContext(), CleanNotificationService.class);
    localIntent.setAction("CLEAN_MEMORY");
    PendingIntent localPendingIntent = PendingIntent.getService(GlobalConfig.getAppContext(), a, localIntent, 134217728);
    ViewLogPackage.Builder localBuilder = new ViewLogPackage.Builder().action(ViewLogPackage.Action.REDIRECT).module("app_launcher").element(ViewLogPackage.Element.NOTIFICATION).name("push_low_raw");
    TaskEvent.Builder localBuilder1 = new TaskEvent.Builder().action(TaskEvent.Action.PUSH).view_log_package(localBuilder.build()).status(TaskEvent.Status.END);
    ExtraPackage.Builder localBuilder2 = new ExtraPackage.Builder();
    v.b().a(localBuilder1, localBuilder2);
    try
    {
      e.a().a(a, localCharSequence, localCharSequence, str3, localPendingIntent);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.clean.notification.b
 * JD-Core Version:    0.6.0
 */