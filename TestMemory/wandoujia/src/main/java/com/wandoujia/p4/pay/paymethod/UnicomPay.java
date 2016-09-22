package com.wandoujia.p4.pay.paymethod;

import android.app.Activity;
import android.os.Handler;
import com.unipay.beans.GameBaseBean;
import com.unipay.beans.PayValueBean;
import com.unipay.unipay_sdk.UniPay;
import com.unipay.unipay_sdk.UniPay.payType;
import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.utils.SLog;
import org.json.JSONException;
import org.json.JSONObject;

public class UnicomPay
{
  private static String appId;
  private static String channel;
  private static String company;
  private static String cpCode = "90107922164";
  private static String cpId = "86008955";
  private static String game;
  private static String payKey;
  private static String telephone;
  private PayCallBack callBack;
  private Handler mHandler = new UnicomPay.1(this);

  static
  {
    appId = "9010792216420140226175549009300";
    payKey = "263d532e490446067500";
    company = "豌豆荚";
    telephone = "4006528705";
    game = "豌豆荚";
    channel = "00018692";
  }

  public void pay(Activity paramActivity, WandouOrder paramWandouOrder, String paramString, PayCallBack paramPayCallBack)
  {
    this.callBack = paramPayCallBack;
    GameBaseBean localGameBaseBean = new GameBaseBean(appId, cpCode, cpId, company, telephone, game, paramString, channel);
    try
    {
      SLog.i("UnicomPay", paramWandouOrder.getRehargeInfo());
      JSONObject localJSONObject = new JSONObject(paramWandouOrder.getRehargeInfo());
      PayValueBean localPayValueBean = new PayValueBean(localJSONObject.getString("feeId"), localJSONObject.getString("feeName"), localJSONObject.getLong("fee") / 100L, localJSONObject.getString("orderId"));
      UniPay.a().a(paramActivity, localGameBaseBean, localPayValueBean, UniPay.payType.VAC, this.mHandler);
      return;
    }
    catch (JSONException localJSONException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.paymethod.UnicomPay
 * JD-Core Version:    0.6.0
 */