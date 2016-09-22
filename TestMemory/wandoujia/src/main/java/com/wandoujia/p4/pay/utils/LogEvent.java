package com.wandoujia.p4.pay.utils;

import android.content.Context;
import com.wandoujia.p4.pay.model.User;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.storage.LocalStorage;
import java.util.HashMap;

public class LogEvent
{
  private static final String APPKEY = "appkey";
  private static final String BUTTON = "button";
  public static final String BUTTON_NO = "no";
  public static final String BUTTON_YES = "yes";
  private static final String CLICK_TIME = "click_time";
  public static final String CREATED_MODEL = "created_model";
  public static final String CREATED_NETWORK_TYPE = "created_net_type";
  public static final String CREATED_SDK_INT = "created_sdk_int";
  public static final String CREATED_VERSION_CODE = "created_vc";
  private static final String CREATE_TIME = "create_time";
  private static final String DEFAULT_MONEY = "default_money";
  private static final String DEFAULT_PAYMETHOD = "default_paymethod";
  private static final String DO_LOGIN_TIME = "do_login_time";
  private static final String DO_PAY_TIME = "do_pay_time";
  public static final String EVENT_CLICK = "paysdk.click";
  public static final String EVENT_CRASH = "paysdk.application.crash";
  public static final String EVENT_CREATE_SUCCESS = "paysdk.order.create_success";
  public static final String EVENT_DO_LOGIN = "paysdk.user.dologin";
  public static final String EVENT_DO_PAY = "paysdk.order.dopay";
  public static final String EVENT_PAYRESULT = "paysdk.order.result";
  public static final String EVENT_USER_LOGIN_FAIL = "paysdk.user.login_fail";
  public static final String EVENT_USER_LOGIN_SUCCESS = "paysdk.user.login_success";
  public static final String EVENT_USER_REGISTER_FAIL = "paysdk.user.register_fail";
  public static final String EVENT_USER_REGISTER_SUCCESS = "paysdk.user.register_success";
  public static final String EVENT_USER_TOKEN_FIAL = "paysdk.user.token_fail";
  private static final String FINISH_PAY_TIME = "finish_pay_time";
  private static final String LINK_OID = "link_oid";
  private static final String MONEY = "money";
  private static final String OID = "oid";
  private static final String ORDER_MONEY = "order_money";
  private static final String PAGE = "page";
  public static final String PAGE_CANCEL_PAY = "cancel_pay";
  public static final String PAGE_RECHARGE_NOT_ENOUGHT = "recharge_not_enought";
  public static final String PAGE_SMS_PAY_CHECK = "sms_pay_check";
  public static final String PAGE_WDB_PAY = "wdb_pay";
  private static final String PAYMETHOD = "paymethod";
  private static final String PAYSDK_LOG_PROFILE_NAME = "paysdk";
  private static final String SDK_VERSION = "sdk_version";
  private static final String TAG = "LogEvent";
  private static final String UID = "uid";
  private static boolean needSetCrashHandler = true;

  public static void click(String paramString1, String paramString2)
  {
    LocalStorage localLocalStorage = LocalStorage.getCurrentConfig();
    HashMap localHashMap = new HashMap();
    WandouOrder localWandouOrder = localLocalStorage.getOrder();
    User localUser = localLocalStorage.getUser();
    localHashMap.put("appkey", localLocalStorage.getAppId());
    localHashMap.put("sdk_version", localLocalStorage.getSdkVersion());
    localHashMap.put("page", paramString1);
    localHashMap.put("button", paramString2);
    if (localUser != null)
      localHashMap.put("uid", localUser.getUid().toString());
    if ((localWandouOrder != null) && (localWandouOrder.getOrderId() != null))
      localHashMap.put("oid", localWandouOrder.getOrderId().toString());
    localHashMap.put("click_time", Util.dateTime());
    ExternUtil.onEventRealTime("paysdk.click", localHashMap);
    SLog.i("LogEvent", "paysdk.click" + localHashMap.toString());
  }

  public static void crash(HashMap<String, String> paramHashMap)
  {
    LocalStorage localLocalStorage = LocalStorage.getCurrentConfig();
    paramHashMap.put("appkey", localLocalStorage.getAppId());
    paramHashMap.put("sdk_version", localLocalStorage.getSdkVersion());
    User localUser = localLocalStorage.getUser();
    if (localUser != null)
      paramHashMap.put("uid", localUser.getUid().toString());
    ExternUtil.onEventRealTime("paysdk.application.crash", paramHashMap);
    SLog.i("LogEvent", "paysdk.application.crash" + paramHashMap.toString());
  }

  public static void createOrder()
  {
    LocalStorage localLocalStorage = LocalStorage.getCurrentConfig();
    localLocalStorage.setOrderCreateTime();
    HashMap localHashMap = new HashMap();
    WandouOrder localWandouOrder = localLocalStorage.getOrder();
    User localUser = localLocalStorage.getUser();
    localHashMap.put("appkey", localLocalStorage.getAppId());
    localHashMap.put("sdk_version", localLocalStorage.getSdkVersion());
    localHashMap.put("uid", localUser.getUid().toString());
    localHashMap.put("oid", localWandouOrder.getOrderId().toString());
    Long localLong = localLocalStorage.getLinkOrderId();
    if (localLong != null)
      localHashMap.put("link_oid", localLong.toString());
    localHashMap.put("default_paymethod", localLocalStorage.getPayMethodList().split(",")[0]);
    localHashMap.put("default_money", localLocalStorage.getDefaultMoney().toString());
    localHashMap.put("order_money", localLocalStorage.getOrder().getMoneyInFen().toString());
    localHashMap.put("create_time", localLocalStorage.getOrderCreateTime().toString());
    ExternUtil.onEventRealTime("paysdk.order.create_success", localHashMap);
    SLog.i("LogEvent", "paysdk.order.create_success" + localHashMap.toString());
  }

  public static void doLogin()
  {
    LocalStorage localLocalStorage = LocalStorage.getCurrentConfig();
    HashMap localHashMap = new HashMap();
    localHashMap.put("appkey", localLocalStorage.getAppId());
    localHashMap.put("sdk_version", localLocalStorage.getSdkVersion());
    localHashMap.put("do_login_time", Util.dateTime());
    User localUser = localLocalStorage.getUser();
    if (localUser != null)
      localHashMap.put("uid", localUser.getUid().toString());
    ExternUtil.onEventRealTime("paysdk.user.dologin", localHashMap);
    SLog.i("LogEvent", "paysdk.user.dologin" + localHashMap.toString());
  }

  public static void doLoginSuccess(String paramString1, String paramString2)
  {
    LocalStorage localLocalStorage = LocalStorage.getCurrentConfig();
    HashMap localHashMap = new HashMap();
    localHashMap.put("appkey", localLocalStorage.getAppId());
    localHashMap.put("sdk_version", localLocalStorage.getSdkVersion());
    localHashMap.put("uid", localLocalStorage.getUser().getUid().toString());
    localHashMap.put("token", paramString2);
    ExternUtil.onEventRealTime(paramString1, localHashMap);
    SLog.i("LogEvent", paramString1 + localHashMap.toString());
  }

  public static void doLoingFail(String paramString1, String paramString2)
  {
    LocalStorage localLocalStorage = LocalStorage.getCurrentConfig();
    HashMap localHashMap = new HashMap();
    localHashMap.put("appkey", localLocalStorage.getAppId());
    localHashMap.put("sdk_version", localLocalStorage.getSdkVersion());
    localHashMap.put("reason", paramString2);
    ExternUtil.onEventRealTime(paramString1, localHashMap);
    SLog.i("LogEvent", paramString1 + localHashMap.toString());
  }

  public static void doPay(String paramString, Long paramLong)
  {
    LocalStorage localLocalStorage = LocalStorage.getCurrentConfig();
    localLocalStorage.setDoPayTime(paramString);
    HashMap localHashMap = new HashMap();
    WandouOrder localWandouOrder = localLocalStorage.getOrder();
    User localUser = localLocalStorage.getUser();
    localHashMap.put("appkey", localLocalStorage.getAppId());
    localHashMap.put("sdk_version", localLocalStorage.getSdkVersion());
    localHashMap.put("uid", localUser.getUid().toString());
    localHashMap.put("oid", localWandouOrder.getOrderId().toString());
    Long localLong = localLocalStorage.getLinkOrderId();
    if (localLong != null)
      localHashMap.put("link_oid", localLong.toString());
    localHashMap.put("default_paymethod", localLocalStorage.getPayMethodList().split(",")[0]);
    localHashMap.put("paymethod", paramString);
    localHashMap.put("money", paramLong.toString());
    localHashMap.put("create_time", localLocalStorage.getOrderCreateTime().toString());
    localHashMap.put("do_pay_time", localLocalStorage.getDoPayTime(paramString).toString());
    localHashMap.put("order_money", localLocalStorage.getOrder().getMoneyInFen().toString());
    localHashMap.put("default_money", localLocalStorage.getDefaultMoney().toString());
    ExternUtil.onEventRealTime("paysdk.order.dopay", localHashMap);
    SLog.i("LogEvent", "paysdk.order.dopay" + localHashMap.toString());
  }

  public static void finishPay(String paramString, Long paramLong)
  {
    LocalStorage localLocalStorage = LocalStorage.getCurrentConfig();
    HashMap localHashMap = new HashMap();
    WandouOrder localWandouOrder = localLocalStorage.getOrder();
    User localUser = localLocalStorage.getUser();
    localHashMap.put("appkey", localLocalStorage.getAppId());
    localHashMap.put("sdk_version", localLocalStorage.getSdkVersion());
    localHashMap.put("uid", localUser.getUid().toString());
    localHashMap.put("oid", localWandouOrder.getOrderId().toString());
    Long localLong = localLocalStorage.getLinkOrderId();
    if (localLong != null)
      localHashMap.put("link_oid", localLong.toString());
    localHashMap.put("default_paymethod", localLocalStorage.getPayMethodList().split(",")[0]);
    localHashMap.put("paymethod", paramString);
    localHashMap.put("default_money", localLocalStorage.getDefaultMoney().toString());
    localHashMap.put("order_money", localLocalStorage.getOrder().getMoneyInFen().toString());
    localHashMap.put("money", paramLong.toString());
    localHashMap.put("create_time", localLocalStorage.getOrderCreateTime().toString());
    localHashMap.put("do_pay_time", localLocalStorage.getDoPayTime(paramString).toString());
    localHashMap.put("finish_pay_time", Util.dateTime());
    ExternUtil.onEventRealTime("paysdk.order.result", localHashMap);
    SLog.i("LogEvent", "paysdk.order.result" + localHashMap.toString());
  }

  public static void init(Context paramContext)
  {
    paramContext.getApplicationContext();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.utils.LogEvent
 * JD-Core Version:    0.6.0
 */