package com.wandoujia.p4.pay.utils;

import android.text.TextUtils;
import com.wandoujia.p4.model.PayParams;
import com.wandoujia.p4.pay.httpapi.GetPayParamsDelegate;
import com.wandoujia.rpc.http.callback.Callback;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;

public class PaymentUtil
{
  public static void getBonus(Callback<PayParams, ExecutionException> paramCallback)
  {
    boolean bool = TextUtils.isEmpty(com.wandoujia.account.a.i());
    Object localObject = null;
    if (!bool);
    try
    {
      String str = GetPayParamsDelegate.getBonusContent(com.wandoujia.account.a.i(), com.wandoujia.account.a.t());
      localObject = str;
      if (localObject != null)
        com.wandoujia.p4.a.b().executeAsync(new GetPayParamsDelegate("https://pay.wandoujia.com/pay/bonus/query?", localObject), paramCallback);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        localObject = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.utils.PaymentUtil
 * JD-Core Version:    0.6.0
 */