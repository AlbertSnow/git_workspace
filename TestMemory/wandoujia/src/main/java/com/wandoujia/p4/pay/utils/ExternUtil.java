package com.wandoujia.p4.pay.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.AccountParams.Page;
import com.wandoujia.account.a;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.gson.c;
import com.wandoujia.p4.account.manager.AccountUtil;
import com.wandoujia.p4.account.manager.d;
import com.wandoujia.udid.UDIDUtil;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExternUtil
{
  private static final c gson;
  private static final ExecutorService pool = Executors.newSingleThreadExecutor();

  static
  {
    gson = new c();
  }

  public static <T> T fromJson(String paramString, Type paramType)
  {
    return gson.a(paramString, paramType);
  }

  public static String getUDID(Context paramContext)
  {
    return UDIDUtil.a(paramContext);
  }

  public static String getWDJAuth()
  {
    return a.i();
  }

  public static String getWDJEmail()
  {
    return a.q();
  }

  public static String getWDJNickName()
  {
    return a.l();
  }

  public static String getWDJUid()
  {
    return a.t();
  }

  public static String getWDJUserName()
  {
    return a.c();
  }

  public static void login(Activity paramActivity, String paramString)
  {
    AccountParams localAccountParams = new AccountParams("recharge");
    localAccountParams.a(AccountParams.Page.LOG_IN);
    localAccountParams.n();
    localAccountParams.a(false);
    AccountUtil.a(paramActivity, localAccountParams);
  }

  public static void logout(Context paramContext, String paramString)
  {
    d.a().c();
  }

  public static void onEventRealTime(String paramString, HashMap<String, String> paramHashMap)
  {
  }

  @TargetApi(9)
  public static void submit(SharedPreferences.Editor paramEditor)
  {
    if (SystemUtil.aboveApiLevel(9))
    {
      paramEditor.apply();
      return;
    }
    pool.execute(new ExternUtil.1(paramEditor));
  }

  public static String toJson(Object paramObject)
  {
    return gson.a(paramObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.utils.ExternUtil
 * JD-Core Version:    0.6.0
 */