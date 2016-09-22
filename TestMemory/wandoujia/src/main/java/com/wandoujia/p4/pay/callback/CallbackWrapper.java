package com.wandoujia.p4.pay.callback;

import android.app.Activity;
import android.content.Intent;

public class CallbackWrapper
{
  private static final String TAG = CallbackWrapper.class.getSimpleName();

  public static void invoke(Activity paramActivity, int paramInt, CallbackWrapper.Type paramType, CallbackWrapper.Status paramStatus, String paramString1, String paramString2)
  {
    if (paramActivity == null)
      return;
    Intent localIntent = new Intent();
    localIntent.putExtra("wdj_paysdk_flag", "wandoujia_paysdk");
    localIntent.putExtra("type", paramType.toString());
    localIntent.putExtra("status", paramStatus.toString());
    localIntent.putExtra("message", paramString1);
    localIntent.putExtra("data", paramString2);
    paramActivity.setResult(paramInt, localIntent);
    paramActivity.finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.callback.CallbackWrapper
 * JD-Core Version:    0.6.0
 */