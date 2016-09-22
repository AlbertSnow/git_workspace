package com.wandoujia.p4.pay.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.pay.activity.ActivityControllerInterface;

public class ActivityUtil
{
  static final String KEY_SDK_START_ID = "startId";
  private static final String SDK_INTENT_ACTION = "com.wandoujia.oakenshield";
  static final String SDK_SCHEME_PREFIX = "Wandoujia-PaySdk-";
  static final String SDK_SCHEME_UNIFY = "Wandoujia-PaySdk-Unify";
  private static final String TAG = ActivityUtil.class.getSimpleName();

  public static ActivityControllerInterface getController(FragmentActivity paramFragmentActivity)
  {
    return null;
  }

  public static String getSessionId(Activity paramActivity)
  {
    String str = paramActivity.getIntent().getData().getQueryParameter("startId");
    if ("null".equals(str))
      str = null;
    return str;
  }

  public static String getVolleyMessage(VolleyError paramVolleyError)
  {
    String str = paramVolleyError.getMessage();
    if (TextUtils.isEmpty(str))
    {
      String[] arrayOfString = paramVolleyError.toString().split("\\.");
      str = arrayOfString[(-1 + arrayOfString.length)];
    }
    return str;
  }

  public static void showErrorMessage(Context paramContext, VolleyError paramVolleyError)
  {
    String str = getVolleyMessage(paramVolleyError);
    p.a(paramContext, "网络异常，请检查网络。 错误信息：" + str, p.b).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.utils.ActivityUtil
 * JD-Core Version:    0.6.0
 */