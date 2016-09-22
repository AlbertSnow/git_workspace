package com.alipay.android.mini.window.sdk;

import android.content.Context;
import android.content.Intent;
import com.alipay.android.app.pay.PayTask.OnPayListener;

final class ba
  implements PayTask.OnPayListener
{
  ba(MiniLaucherActivity paramMiniLaucherActivity)
  {
  }

  public final void onPayFailed(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = new Intent("com.alipay.android.app.pay.ACTION_PAY_FAILED");
    localIntent.putExtra("resultStatus", paramString1);
    localIntent.putExtra("memo", paramString2);
    localIntent.putExtra("result", paramString3);
    this.a.setResult(0, localIntent);
    MiniLaucherActivity.a(this.a);
    this.a.finish();
  }

  public final void onPaySuccess(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = new Intent("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
    localIntent.putExtra("resultStatus", paramString1);
    localIntent.putExtra("memo", paramString2);
    localIntent.putExtra("result", paramString3);
    this.a.setResult(-1, localIntent);
    MiniLaucherActivity.a(this.a);
    this.a.finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.ba
 * JD-Core Version:    0.6.0
 */