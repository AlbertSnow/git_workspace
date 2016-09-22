package com.wandoujia.p4.pay.httpapi;

import com.wandoujia.p4.http.request.h;
import com.wandoujia.p4.model.PayParams;
import com.wandoujia.rpc.http.delegate.GZipHttpDelegate;
import org.json.JSONObject;

public class GetPayParamsDelegate extends GZipHttpDelegate<h, PayParams>
{
  public static final String ACCOUNT_URL = "http://innerpay.wandoujia.com/pay/account/query?";
  private static final String APPKEY_ID = "100000000";
  public static final String BONUS_SURL = "https://pay.wandoujia.com/pay/bonus/query?";
  public static final String BONUS_URL = "http://innerpay.wandoujia.com/pay/account/bonus/query?";
  private static final String SECRET_KEY = "99b4efb45d49338573a00be7a1431511";

  public GetPayParamsDelegate(String paramString1, String paramString2)
  {
    super(new GetPayParamsDelegate.1(paramString1, paramString2), new GetPayParamsDelegate.GetPayParamsProcessor(null));
  }

  public static String getBonusContent(String paramString1, String paramString2)
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("appkey_id", "100000000");
    localJSONObject.put("wdj_auth", paramString1);
    localJSONObject.put("uid", paramString2);
    localJSONObject.put("status", "VALID");
    return localJSONObject.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.httpapi.GetPayParamsDelegate
 * JD-Core Version:    0.6.0
 */