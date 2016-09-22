package com.wandoujia.p4.pay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.android.volley.VolleyError;
import com.android.volley.j;
import com.android.volley.k;
import com.wandoujia.p4.pay.activity.PayActivity;
import com.wandoujia.p4.pay.activity.RechargeActivity;
import com.wandoujia.p4.pay.callback.CallbackWrapper.Status;
import com.wandoujia.p4.pay.httpapi.PayHttp;
import com.wandoujia.p4.pay.model.CallBack;
import com.wandoujia.p4.pay.model.OrderResult;
import com.wandoujia.p4.pay.model.RechargePaySet;
import com.wandoujia.p4.pay.model.User;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.ExternUtil;
import com.wandoujia.p4.pay.utils.HttpUtil;
import com.wandoujia.p4.pay.utils.MD5;
import com.wandoujia.p4.pay.utils.Rsa;
import com.wandoujia.p4.pay.utils.SLog;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class PayImpl
{
  public static final String ALIPAY_FAST_CALLBACK_URL;
  private static final String EXCEPTION_INVALID_ORDER = "Error! Invalid order.";
  public static final String EXCEPTION_MESSAGE_NETWORK_ERROR = "网络异常，请检查网络。";
  public static final String ILLEGAL_SIGNTYPE_FORMAT = "ILLEGAL_SIGNTYPE_FORMAT";
  public static final String ILLEGAL_SIGN_EMPTY = "ILLEGAL_SIGNTYPE_FORMAT";
  public static final String KEY_APP_ID = "appId";
  public static final String KEY_DESCRIPTION = "order_desc";
  public static final String KEY_OUT_TRADE_NO = "order_outtrade_no";
  public static final String KEY_PRICE = "order_price";
  public static final String KEY_UID = "uid";
  public static final String KEY_WDJ_AUTH = "wdj_auth";
  private static final String LIST_RECHARGE_METHODS;
  public static final String ORDER_QUERY_ALL_URL;
  public static final String RECHARGE_RECORDS_QUERY_ALL_URL;
  private static final String TAG = "PayImpl";
  public static final String UNICOM_CALLBACK_URL;
  public static final String WDJ_PUBLICK_EY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCd95FnJFhPinpNiE/h4VA6bU1rzRa5+a25BxsnFX8TzquWxqDCoe4xG6QKXMXuKvV57tTRpzRo2jeto40eHKClzEgjx9lTYVb2RFHHFWio/YGTfnqIPTVpi7d7uHY+0FZ0lYL5LlW4E2+CQMxFOPRwfqGzMjs1SDlH7lVrLEVy6QIDAQAB";
  private static String balancePayUrl;
  private static String basePath;
  private static String campaignListUrl;
  private static String createOneUrl;
  private static String gameCardPayUrl;
  private static Object lock;
  private static String promptUrl;
  private static String queryOrderUrl;
  private static String rechargePayUrl;
  public static String rechargeResultUrl;
  public static String resultUrl;
  public static PayImpl sInstance;
  private static String shenzhouPayStatusUrl;
  private static String shenzhouPayUrl;
  public static String tokenUrl = "https://pay.wandoujia.com/api/uid/token";
  private static String unicomPayUrl;
  private static String unionPayUrl;
  private static String updateUrl;
  private String action = "None";
  private Context appContext;
  private LocalStorage localStorage;
  private PayImpl.PayCoolDown payCoolDown = new PayImpl.PayCoolDown();
  private PayHttp payHttp;
  private CallbackWrapper.Status payStatus = CallbackWrapper.Status.CANCEL;

  static
  {
    basePath = "https://pay.wandoujia.com";
    createOneUrl = basePath + "/pay/order/createandquery";
    balancePayUrl = basePath + "/pay/order/balancePay";
    rechargePayUrl = basePath + "/pay/order/chargeandpay";
    campaignListUrl = basePath + "/pay/campaign/list";
    queryOrderUrl = basePath + "/pay/order/query";
    shenzhouPayUrl = basePath + "/pay/order/shenzhoupay";
    shenzhouPayStatusUrl = basePath + "/pay/order/shenzhouPayStatusNotify";
    gameCardPayUrl = basePath + "/pay/order/gamecardpay";
    promptUrl = basePath + "/pay/campaign/prompts";
    updateUrl = basePath + "/pay/config/versionquery";
    resultUrl = basePath + "/pay/order/querychargeandpayorderstatus";
    rechargeResultUrl = basePath + "/pay/order/rechargeorderstatus";
    unionPayUrl = basePath + "/pay/order/unionpay/create";
    unicomPayUrl = basePath + "/pay/order/unicom/create";
    UNICOM_CALLBACK_URL = basePath.replaceAll("https://pay", "http://innerpay") + "/pay/callback/unicomnotify";
    ALIPAY_FAST_CALLBACK_URL = basePath.replaceAll("https://pay", "http://innerpay") + "/pay/callback/alipayshortcutnotify";
    ORDER_QUERY_ALL_URL = basePath + "/pay/order/queryAll";
    RECHARGE_RECORDS_QUERY_ALL_URL = basePath + "/pay/payRecord/queryAll";
    LIST_RECHARGE_METHODS = basePath + "/pay/recharge/paymethods";
    lock = new Object();
  }

  private PayImpl(Context paramContext)
  {
    this.payHttp = new PayHttp(paramContext);
    this.appContext = paramContext.getApplicationContext();
  }

  public static CallbackWrapper.Status getFinishStatus()
  {
    return sInstance.payStatus;
  }

  private String getImei()
  {
    return ((TelephonyManager)this.appContext.getSystemService("phone")).getDeviceId();
  }

  private String getImsi()
  {
    return ((TelephonyManager)this.appContext.getSystemService("phone")).getSubscriberId();
  }

  public static PayImpl getInstance(Context paramContext)
  {
    return getInstance(paramContext, null);
  }

  public static PayImpl getInstance(Context paramContext, String paramString)
  {
    if (sInstance == null);
    synchronized (lock)
    {
      if (sInstance == null)
        sInstance = new PayImpl(paramContext);
      sInstance.localStorage = LocalStorage.getInstance(paramContext, paramString);
      return sInstance;
    }
  }

  private String getMac()
  {
    return ((WifiManager)this.appContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
  }

  private void getOrderResult(String paramString, k<JSONObject> paramk, j paramj)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("appkey_id", this.localStorage.getAppId());
      localJSONObject.put("uid", this.localStorage.getUser().getUid());
      if (resultUrl.equals(paramString))
      {
        localJSONObject.put("orderId", this.localStorage.getOrder().getOrderId());
        localJSONObject.put("chargeOrderId", this.localStorage.getLinkOrderId());
      }
      while (true)
      {
        this.payHttp.getWithMD5(paramString, localJSONObject, paramk, paramj);
        return;
        localJSONObject.put("chargeOrderId", this.localStorage.getOrder().getOrderId());
      }
    }
    catch (JSONException localJSONException)
    {
      SLog.e("getOrderResult", localJSONException);
    }
  }

  public static String post(String paramString1, String paramString2, String paramString3)
  {
    if ((paramString3 == null) || (paramString3.length() == 0))
      throw new Exception("post secretkey is null!");
    String str1 = MD5.sign(paramString2, paramString3);
    HashMap localHashMap = new HashMap();
    localHashMap.put("content", paramString2);
    localHashMap.put("signType", "MD5");
    localHashMap.put("sign", str1);
    localHashMap.put("version", LocalStorage.getCurrentConfig().getSdkVersion());
    long l = System.currentTimeMillis();
    String str2 = HttpUtil.post(paramString1, localHashMap, null);
    SLog.i("post", "https cost time:" + (System.currentTimeMillis() - l) + "ms");
    Map localMap = PayImpl.JsonUtil.json2map(str2);
    String str3 = (String)localMap.get("content");
    String str4 = (String)localMap.get("signType");
    String str5 = (String)localMap.get("sign");
    if ((str5 != null) && (str5.length() > 0))
    {
      if (!str4.toLowerCase(Locale.US).equals("rsa"))
        throw new Exception("ILLEGAL_SIGNTYPE_FORMAT");
      if (!Rsa.doCheck(str3, str5, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCd95FnJFhPinpNiE/h4VA6bU1rzRa5+a25BxsnFX8TzquWxqDCoe4xG6QKXMXuKvV57tTRpzRo2jeto40eHKClzEgjx9lTYVb2RFHHFWio/YGTfnqIPTVpi7d7uHY+0FZ0lYL5LlW4E2+CQMxFOPRwfqGzMjs1SDlH7lVrLEVy6QIDAQAB"))
        throw new Exception("ILLEGAL_SIGNTYPE_FORMAT");
      JSONObject localJSONObject2 = new JSONObject(str3);
      if (!localJSONObject2.getString("resultStatus").equals("SUCCESS"))
      {
        SLog.i("post", "NotSuccess:" + localJSONObject2.getString("resultStatus") + "," + paramString1);
        throw new Exception(str3);
      }
    }
    else
    {
      JSONObject localJSONObject1 = new JSONObject(str2);
      if (!localJSONObject1.getString("resultStatus").equals("SUCCESS"))
        throw new Exception(localJSONObject1.getString("resultStatus"));
      str3 = str2;
    }
    return str3;
  }

  public static void setFinishStatus(CallbackWrapper.Status paramStatus)
  {
    sInstance.payStatus = paramStatus;
  }

  public void balancePay(WandouOrder paramWandouOrder, String paramString, Long paramLong, k<JSONObject> paramk, j paramj)
  {
    JSONObject localJSONObject1 = new JSONObject();
    try
    {
      localJSONObject1.put("appkey_id", this.localStorage.getAppId());
      localJSONObject1.put("orderId", paramWandouOrder.getOrderId());
      localJSONObject1.put("orderName", paramWandouOrder.getName());
      localJSONObject1.put("orderDesc", paramWandouOrder.getDesc());
      localJSONObject1.put("out_trade_no", paramWandouOrder.getOut_trade_no());
      localJSONObject1.put("money", paramWandouOrder.getMoneyInFen());
      localJSONObject1.put("udid", ExternUtil.getUDID(this.appContext));
      localJSONObject1.put("imsi", getImsi());
      localJSONObject1.put("imei", getImei());
      localJSONObject1.put("mac", getMac());
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("username", this.localStorage.getUser().getUsername());
      localJSONObject2.put("cookie", "wdj_auth=" + this.localStorage.getAuth());
      localJSONObject2.put("password", Rsa.encrypt(paramString, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCd95FnJFhPinpNiE/h4VA6bU1rzRa5+a25BxsnFX8TzquWxqDCoe4xG6QKXMXuKvV57tTRpzRo2jeto40eHKClzEgjx9lTYVb2RFHHFWio/YGTfnqIPTVpi7d7uHY+0FZ0lYL5LlW4E2+CQMxFOPRwfqGzMjs1SDlH7lVrLEVy6QIDAQAB"));
      localJSONObject1.put("payAccountInfo", localJSONObject2.toString());
      localJSONObject1.put("bonusMoney", paramLong);
      this.payHttp.getWithMD5(balancePayUrl, localJSONObject1, new PayImpl.2(this, paramk), paramj);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (paramj == null);
      paramj.onErrorResponse(new VolleyError(localJSONException));
    }
  }

  public void createOrder(WandouOrder paramWandouOrder, k<JSONObject> paramk, j paramj)
  {
    SLog.w("createOrder", paramWandouOrder.toJSONString());
    this.localStorage.setOrder(paramWandouOrder);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("appkey_id", this.localStorage.getAppId());
      localJSONObject.put("uid", this.localStorage.getUser().getUid());
      localJSONObject.put("wdj_auth", this.localStorage.getAuth());
      localJSONObject.put("orderName", paramWandouOrder.getName());
      localJSONObject.put("orderDesc", paramWandouOrder.getDesc());
      localJSONObject.put("out_trade_no", paramWandouOrder.getOut_trade_no());
      localJSONObject.put("money", paramWandouOrder.getMoneyInFen());
      localJSONObject.put("imsi", getImsi());
      localJSONObject.put("imei", getImei());
      localJSONObject.put("mac", getMac());
      localJSONObject.put("udid", ExternUtil.getUDID(this.appContext));
      this.payHttp.getWithMD5(createOneUrl, localJSONObject, new PayImpl.1(this, paramk), paramj);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (paramj == null);
      paramj.onErrorResponse(new VolleyError(localJSONException));
    }
  }

  public void createOrder(WandouOrder paramWandouOrder, CallBack<String> paramCallBack)
  {
    createOrder(paramWandouOrder, new PayImpl.5(this, paramCallBack), new PayImpl.6(this, paramCallBack));
  }

  public void gameCardPay(WandouOrder paramWandouOrder, String paramString1, String paramString2, String paramString3, String paramString4, k<JSONObject> paramk, j paramj)
  {
    try
    {
      JSONObject localJSONObject1 = new JSONObject();
      localJSONObject1.put("appkey_id", this.localStorage.getAppId());
      localJSONObject1.put("orderId", paramWandouOrder.getOrderId());
      localJSONObject1.put("uid", this.localStorage.getUser().getUid());
      localJSONObject1.put("wdj_auth", this.localStorage.getAuth());
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("cardMoney", paramString1);
      localJSONObject2.put("password", paramString3);
      localJSONObject2.put("sn", paramString2);
      localJSONObject2.put("cardTypeCombine", paramString4);
      localJSONObject2.put("password", Rsa.encrypt(localJSONObject2.getString("password"), "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCd95FnJFhPinpNiE/h4VA6bU1rzRa5+a25BxsnFX8TzquWxqDCoe4xG6QKXMXuKvV57tTRpzRo2jeto40eHKClzEgjx9lTYVb2RFHHFWio/YGTfnqIPTVpi7d7uHY+0FZ0lYL5LlW4E2+CQMxFOPRwfqGzMjs1SDlH7lVrLEVy6QIDAQAB"));
      localJSONObject1.put("cardInfo", localJSONObject2);
      this.payHttp.getWithMD5(gameCardPayUrl, localJSONObject1, paramk, paramj);
      return;
    }
    catch (JSONException localJSONException)
    {
      SLog.e("shenzhouPay", localJSONException);
    }
  }

  public void getPromptText(String paramString, k<JSONObject> paramk, j paramj)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("pos", paramString);
    localHashMap.put("udid", ExternUtil.getUDID(this.appContext));
    if ((this.localStorage.getUser() != null) && (this.localStorage.getUser().getUid() != null))
      localHashMap.put("uid", this.localStorage.getUser().getUid().toString());
    localHashMap.put("sdk_version", this.localStorage.getSdkVersion());
    this.payHttp.getJSON(promptUrl, localHashMap, paramk, paramj);
  }

  public void getToken(k<String> paramk, j paramj)
  {
    this.payHttp.addCookie("wdj_auth", this.localStorage.getAuth(), ".wandoujia.com");
    this.payHttp.getString(tokenUrl, null, paramk, paramj);
  }

  public void getUnicomPayInfo(CallBack<JSONObject> paramCallBack)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("uid", this.localStorage.getUser().getUid());
      localJSONObject.put("wdj_auth", this.localStorage.getAuth());
      localJSONObject.put("appkey_id", this.localStorage.getAppId());
      localJSONObject.put("orderId", this.localStorage.getOrder().getOrderId());
      localJSONObject.put("imsi", getImsi());
      localJSONObject.put("imei", getImei());
      localJSONObject.put("mac", getMac());
      localJSONObject.put("wdj_auth", this.localStorage.getAuth());
      this.payHttp.getWithMD5(unicomPayUrl, localJSONObject, new PayImpl.11(this, paramCallBack), new PayImpl.12(this, paramCallBack));
      return;
    }
    catch (JSONException localJSONException)
    {
      do
        SLog.e("PayImpl", localJSONException);
      while (paramCallBack == null);
      paramCallBack.onError(1, localJSONException.toString());
    }
  }

  public void getUnionPayTN(CallBack<String> paramCallBack)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("uid", this.localStorage.getUser().getUid());
      localJSONObject.put("wdj_auth", this.localStorage.getAuth());
      localJSONObject.put("appkey_id", this.localStorage.getAppId());
      localJSONObject.put("orderId", this.localStorage.getOrder().getOrderId());
      this.payHttp.getWithMD5(unionPayUrl, localJSONObject, new PayImpl.13(this, paramCallBack), new PayImpl.14(this, paramCallBack));
      return;
    }
    catch (JSONException localJSONException)
    {
      do
        SLog.e("PayImpl", localJSONException);
      while (paramCallBack == null);
      paramCallBack.onError(1, localJSONException.toString());
    }
  }

  public void getUpdate(k<JSONObject> paramk, j paramj)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("resource", "paysdk_apk");
      localJSONObject.put("appkey_id", this.localStorage.getAppId());
      localJSONObject.put("version", this.localStorage.getDownloadVersion());
      User localUser = this.localStorage.getUser();
      if (localUser != null)
        localJSONObject.put("uid", localUser.getUid());
      localJSONObject.put("udid", ExternUtil.getUDID(this.localStorage.getApplicationContext()));
      String str = this.localStorage.getApplicationContext().getApplicationInfo().packageName;
      localJSONObject.put("packageName", str);
      try
      {
        localJSONObject.put("packageVersion", this.localStorage.getApplicationContext().getPackageManager().getPackageInfo(str, 0).versionName);
        localJSONObject.put("p4", "true");
        this.payHttp.getWithMD5(updateUrl, localJSONObject, paramk, paramj);
        return;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        while (true)
          SLog.e("PayImpl", localNameNotFoundException);
      }
    }
    catch (JSONException localJSONException)
    {
      SLog.e("getUpdate", localJSONException);
    }
  }

  public void listRechargeMethods(String paramString1, String paramString2, String paramString3, CallBack<String> paramCallBack)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("appkey_id", paramString1);
      localJSONObject.put("uid", paramString2);
      localJSONObject.put("wdj_auth", paramString3);
      localJSONObject.put("imsi", getImsi());
      localJSONObject.put("imei", getImei());
      localJSONObject.put("mac", getMac());
      this.payHttp.getWithMD5(LIST_RECHARGE_METHODS, localJSONObject, new PayImpl.7(this, paramCallBack), new PayImpl.8(this, paramCallBack));
      return;
    }
    catch (JSONException localJSONException)
    {
      SLog.w("listRechargeMethods", localJSONException.toString());
      paramCallBack.onError(1, localJSONException.toString());
    }
  }

  public boolean needRecharge()
  {
    WandouOrder localWandouOrder = this.localStorage.getOrder();
    Long localLong = this.localStorage.getBalance();
    StringBuilder localStringBuilder = new StringBuilder();
    if (localLong.longValue() + this.localStorage.getBonusMoney().longValue() < localWandouOrder.getMoneyInFen().longValue());
    for (boolean bool = true; ; bool = false)
    {
      SLog.i("needRecharge", bool + localLong + " >" + localWandouOrder.getMoneyInFen());
      if (localLong.longValue() + this.localStorage.getBonusMoney().longValue() >= localWandouOrder.getMoneyInFen().longValue())
        break;
      return true;
    }
    return false;
  }

  public void pay(Activity paramActivity, String paramString, Map<String, String> paramMap)
  {
    if (this.payCoolDown.inCD("pay"))
      return;
    if ((paramMap == null) || (paramMap.isEmpty()))
      throw new IllegalArgumentException("Error! Invalid order.");
    this.localStorage = LocalStorage.getInstance(paramString);
    Intent localIntent = new Intent(paramActivity, PayActivity.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("order_desc", (String)paramMap.get("order_desc"));
    localBundle.putString("order_price", (String)paramMap.get("order_price"));
    localBundle.putString("order_outtrade_no", (String)paramMap.get("order_outtrade_no"));
    localIntent.putExtras(localBundle);
    paramActivity.startActivity(localIntent);
  }

  public void pay(Activity paramActivity, Map<String, String> paramMap)
  {
    pay(paramActivity, null, paramMap);
  }

  public void queryCampaignList(k<JSONObject> paramk, j paramj)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("appkey_id", this.localStorage.getAppId());
      localJSONObject.put("uid", this.localStorage.getUser().getUid());
      localJSONObject.put("wdj_auth", this.localStorage.getAuth());
      localJSONObject.put("orderId", this.localStorage.getOrder().getOrderId());
      localJSONObject.put("imsi", getImsi());
      localJSONObject.put("imei", getImei());
      localJSONObject.put("mac", getMac());
      this.payHttp.getWithMD5(campaignListUrl, localJSONObject, new PayImpl.4(this, paramk), paramj);
      return;
    }
    catch (JSONException localJSONException)
    {
      SLog.e("queryCampaignList", localJSONException);
    }
  }

  public void queryOrder(WandouOrder paramWandouOrder, k<JSONObject> paramk, j paramj)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("appkey_id", this.localStorage.getAppId());
      localJSONObject.put("order_no", paramWandouOrder.getOrderId());
      this.payHttp.getWithMD5(queryOrderUrl, localJSONObject, paramk, paramj);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        SLog.e("queryOrder", localJSONException);
    }
  }

  public void queryOrderResult(String paramString, CallBack<OrderResult> paramCallBack)
  {
    getOrderResult(paramString, new PayImpl.9(this, paramCallBack), new PayImpl.10(this, paramCallBack));
  }

  public void recharge(Activity paramActivity, String paramString)
  {
    if (this.payCoolDown.inCD("recharge"))
      return;
    Intent localIntent = new Intent(paramActivity, RechargeActivity.class);
    localIntent.putExtra("appId", paramString);
    paramActivity.startActivity(localIntent);
  }

  public void rechargePay(String paramString, Long paramLong, k<RechargePaySet> paramk, j paramj)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("appkey_id", this.localStorage.getAppId());
      localJSONObject.put("uid", this.localStorage.getUser().getUid());
      localJSONObject.put("wdj_auth", this.localStorage.getAuth());
      localJSONObject.put("orderId", this.localStorage.getOrder().getOrderId());
      localJSONObject.put("chargeType", paramString);
      localJSONObject.put("chargeMoney", paramLong);
      localJSONObject.put("bonusMoney", this.localStorage.getBonusMoney());
      localJSONObject.put("imei", getImei());
      localJSONObject.put("imsi", getImsi());
      localJSONObject.put("mac", getMac());
      localJSONObject.put("udid", ExternUtil.getUDID(this.appContext));
      this.payHttp.getWithMD5(rechargePayUrl, localJSONObject, new PayImpl.3(this, paramk), paramj);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (paramj == null);
      paramj.onErrorResponse(new VolleyError(localJSONException));
    }
  }

  public void shenzhouPay(WandouOrder paramWandouOrder, String paramString1, int paramInt, String paramString2, String paramString3, k<JSONObject> paramk, j paramj)
  {
    try
    {
      JSONObject localJSONObject1 = new JSONObject();
      localJSONObject1.put("cardMoney", String.valueOf(paramInt));
      localJSONObject1.put("sn", paramString2);
      localJSONObject1.put("cardTypeCombine", paramString1);
      localJSONObject1.put("password", Rsa.encrypt(paramString3, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCd95FnJFhPinpNiE/h4VA6bU1rzRa5+a25BxsnFX8TzquWxqDCoe4xG6QKXMXuKvV57tTRpzRo2jeto40eHKClzEgjx9lTYVb2RFHHFWio/YGTfnqIPTVpi7d7uHY+0FZ0lYL5LlW4E2+CQMxFOPRwfqGzMjs1SDlH7lVrLEVy6QIDAQAB"));
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("cardInfo", localJSONObject1.toString());
      JSONObject localJSONObject3 = new JSONObject();
      localJSONObject3.put("username", this.localStorage.getUser().getUsername());
      localJSONObject3.put("cookie", "wdj_auth=" + this.localStorage.getAuth());
      localJSONObject2.put("payAccountInfo", localJSONObject3.toString());
      localJSONObject2.put("appkey_id", this.localStorage.getAppId());
      localJSONObject2.put("orderId", paramWandouOrder.getOrderId());
      this.payHttp.getWithMD5(shenzhouPayUrl, localJSONObject2, paramk, paramj);
      return;
    }
    catch (JSONException localJSONException)
    {
      SLog.e("shenzhouPay", localJSONException);
    }
  }

  public void shenzhouStatus(WandouOrder paramWandouOrder, k<JSONObject> paramk, j paramj)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("orderId", paramWandouOrder.getOrderId());
      localJSONObject.put("appkey_id", this.localStorage.getAppId());
      this.payHttp.getWithMD5(shenzhouPayStatusUrl, localJSONObject, paramk, paramj);
      return;
    }
    catch (JSONException localJSONException)
    {
      SLog.e("shenzhouPay", localJSONException);
    }
  }

  public String showMoney(long paramLong)
  {
    BigDecimal localBigDecimal = new BigDecimal("100");
    return new BigDecimal(paramLong).divide(localBigDecimal).toPlainString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.PayImpl
 * JD-Core Version:    0.6.0
 */