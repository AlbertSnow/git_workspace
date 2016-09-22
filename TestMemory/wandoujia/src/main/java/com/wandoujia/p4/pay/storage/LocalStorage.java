package com.wandoujia.p4.pay.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.wandoujia.account.a;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.p4.pay.model.PayMethod;
import com.wandoujia.p4.pay.model.RechargeMoney;
import com.wandoujia.p4.pay.model.User;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.utils.LogEvent;
import com.wandoujia.p4.pay.utils.SLog;
import com.wandoujia.p4.pay.utils.Util;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LocalStorage
{
  public static final String APP_ID = "appkey";
  private static final String INSTANTIATION_EXCEPTION_MESSAGE_APPID_NULL = "Invalid appId in LocalStorage.";
  private static final String INSTANTIATION_EXCEPTION_MESSAGE_CONTEXT_NULL = "Context should not be null in LocalStorage-init.";
  private static final String INSTANTIATION_EXCEPTION_MESSAGE_SECRETKEY_NULL = "Invalid secretKey in LocalStorage.";
  public static final String KEY_ALIPAY_ACCOUNT = "account_alipay";
  public static final String KEY_BALANCE = "account_balance";
  public static final String KEY_BONUSCOUNT = "account_bonusCount";
  public static final String KEY_BONUSMONEY = "account_bonusMoney";
  private static final String KEY_CHOSED_MONEY = "chosed_money";
  public static final String KEY_CONFIG = "sdk_config";
  public static final String KEY_CONFIRM_LOGIN = "confirm_login";
  private static final String KEY_CREATE_TIME = "create_time";
  private static final String KEY_CURRENT_ORDER = "cur_order";
  private static final String KEY_CURRENT_USR = "cur_user";
  private static final String KEY_CUR_PAYMETHOD = "cur_paymethod";
  private static final String KEY_DEFAULT_MONEY = "default";
  private static final String KEY_DOWNLOAD_VERSION = "download_version";
  private static final String KEY_DO_PAY_TIME = "do_pay_time";
  private static final String KEY_FINISH = "finish";
  public static final String KEY_LAST_RECHARGE = "last_recharge";
  private static final String KEY_LINK_ORDER_ID = "link_order_id";
  public static final String KEY_MAX_BONUS = "max_bonus";
  private static final String KEY_NEED_PASSWORD = "need_password";
  private static final String KEY_NEED_RECHARGE_MONEY = "need_recharge_money";
  public static final String KEY_NICK = "nick";
  private static final String KEY_ORDER_ID_PREFIX = "order_id_prefix";
  private static final String KEY_PAYMENT_FEEDBACK_CATEGORY = "PAYMENT_FEEDBACK_CATEGORY";
  private static final String KEY_PAYMENT_FEEDBACK_CHILDREN_CATEGORY = "PAYMENT_FEEDBACK_CHILDREN_CATEGORY";
  private static final String KEY_PAYMETHOD = "pay_method";
  public static final String KEY_PENDING_RECHARGE = "pending_recharge";
  private static final String KEY_RECHARGE_MONEY_LIST = "recharge_money_list";
  public static final String KEY_USERNAME = "username";
  private static final String KEY_USER_EXTERNAL_STORAGE_FOR_CACHE = "USER_EXTERNAL_STORAGE_FOR_CACHE";
  private static final String KEY_WDJ_AUTH = "wdj_auth";
  public static final String MANDATORY_LOGIN_KEY = "need_login";
  private static final String PAYSDK_CONFIG_PREFERENCE_PREFIX = "Wandoujia-PaySdk-";
  public static final String RECHARGE_APP_KEY_ID = "100000225";
  private static final String RECHARGE_SECRET_KEY = "9e45e1d5cfcd2ad21f86c1b43a12b3d8";
  public static final String SECRET_KEY = "secretkey";
  private static final boolean SHOULD_COMMIT;
  private static final String TAG = LocalStorage.class.getSimpleName();
  private static Object lock = new Object();
  private static LocalStorage sInstance;
  private String appId;
  private Context applicationContext;
  private String secretKey;
  private SharedPreferences sharedPreferences;

  static
  {
    if (Integer.parseInt(Build.VERSION.SDK) < 9);
    for (boolean bool = true; ; bool = false)
    {
      SHOULD_COMMIT = bool;
      return;
    }
  }

  private LocalStorage(Context paramContext, String paramString)
  {
    if (paramContext == null)
      throw new IllegalArgumentException("Context should not be null in LocalStorage-init.");
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("Invalid appId in LocalStorage.");
    this.sharedPreferences = paramContext.getApplicationContext().getSharedPreferences("Wandoujia-PaySdk-" + paramString, 0);
    this.appId = paramString;
    put("appkey", paramString);
    this.applicationContext = paramContext.getApplicationContext();
  }

  public static LocalStorage getCurrentConfig()
  {
    if (sInstance == null)
      throw new IllegalArgumentException("getCurrentConfig sInstance is null");
    return sInstance;
  }

  public static LocalStorage getInstance(Context paramContext, String paramString)
  {
    monitorenter;
    try
    {
      SLog.d(TAG, "LocalStorage init, id: " + paramString);
      LocalStorage localLocalStorage2;
      if (TextUtils.isEmpty(paramString))
        localLocalStorage2 = getCurrentConfig();
      for (LocalStorage localLocalStorage1 = localLocalStorage2; ; localLocalStorage1 = sInstance)
      {
        return localLocalStorage1;
        if ((sInstance != null) && (sInstance.appId.equals(paramString)))
          continue;
        sInstance = new LocalStorage(paramContext, paramString);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static LocalStorage getInstance(String paramString)
  {
    return getInstance(sInstance.applicationContext, paramString);
  }

  public static void init(Context paramContext)
  {
    init(paramContext, "100000225", "9e45e1d5cfcd2ad21f86c1b43a12b3d8");
  }

  public static void init(Context paramContext, String paramString)
  {
    getInstance(paramContext, paramString);
  }

  public static void init(Context paramContext, String paramString1, String paramString2)
  {
    getInstance(paramContext, paramString1).setSecretKey(paramString2);
    LogEvent.init(paramContext);
  }

  public boolean doesExternalStorageForCacheExist()
  {
    return this.sharedPreferences.contains("USER_EXTERNAL_STORAGE_FOR_CACHE");
  }

  public String get(String paramString)
  {
    return this.sharedPreferences.getString(paramString, "");
  }

  public String getAppId()
  {
    return this.appId;
  }

  public Context getApplicationContext()
  {
    return this.applicationContext;
  }

  public String getAuth()
  {
    return a.i();
  }

  public Long getBalance()
  {
    String str = get(getOrder().getOrderId() + "account_balance");
    try
    {
      Long localLong = Long.valueOf(str);
      return localLong;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      SLog.w(TAG, "Invalid balance.");
    }
    return Long.valueOf(0L);
  }

  public Long getBonusMoney()
  {
    String str = get(getOrder().getOrderId() + "account_bonusMoney");
    if (TextUtils.isEmpty(str))
      return Long.valueOf(0L);
    return Long.valueOf(str);
  }

  public Long getChoseMoney()
  {
    String str = get(getOrder().getOrderId() + "chosed_money");
    Long localLong1 = Long.valueOf(0L);
    try
    {
      Long localLong2 = Long.valueOf(str);
      return localLong2;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      SLog.w(TAG, "Invalid chosed money.");
    }
    return localLong1;
  }

  public String getCurPayMethod()
  {
    return get(getOrder().getOrderId() + "cur_paymethod");
  }

  public Long getDefaultMoney()
  {
    String str = get(getOrder().getOrderId() + "default");
    if (TextUtils.isEmpty(str))
      return Long.valueOf(0L);
    return Long.valueOf(str);
  }

  public String getDoPayTime(String paramString)
  {
    String str = get(getOrder().getOrderId() + "do_pay_time" + paramString);
    if (TextUtils.isEmpty(str))
      str = null;
    return str;
  }

  public String getDownloadVersion()
  {
    String str = get("download_version");
    if (TextUtils.isEmpty(str))
      str = getSdkVersion();
    return str;
  }

  public String getFeedbackCategoryList()
  {
    return get("PAYMENT_FEEDBACK_CATEGORY");
  }

  public String getFeedbackChildrenCategoryList()
  {
    return get("PAYMENT_FEEDBACK_CHILDREN_CATEGORY");
  }

  public boolean getFinish()
  {
    if (getOrder() == null);
    do
      return false;
    while (TextUtils.isEmpty(get(getOrder().getOrderId() + "finish")));
    return true;
  }

  public Long getLinkOrderId()
  {
    String str = get(getOrder().getOrderId() + "link_order_id");
    if (TextUtils.isEmpty(str))
      return null;
    return Long.valueOf(str);
  }

  public boolean getNeedPassword()
  {
    return !TextUtils.isEmpty(get(getOrder().getOrderId() + "need_password"));
  }

  public Long getNeedRechargeMoney()
  {
    String str = get(getOrder().getOrderId() + "need_recharge_money");
    Long localLong1 = Long.valueOf(0L);
    try
    {
      Long localLong2 = Long.valueOf(str);
      return localLong2;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      SLog.w(TAG, "Invalid chosed money.");
    }
    return localLong1;
  }

  public WandouOrder getOrder()
  {
    String str = get("cur_order");
    WandouOrder localWandouOrder = new WandouOrder("", "", Long.valueOf(1L));
    if (!TextUtils.isEmpty(str))
      try
      {
        localWandouOrder.fromJSONString(str);
        return localWandouOrder;
      }
      catch (JSONException localJSONException)
      {
      }
    return null;
  }

  public String getOrderCreateTime()
  {
    String str = get(getOrder().getOrderId() + "create_time");
    if (TextUtils.isEmpty(str))
      str = null;
    return str;
  }

  public String getOrderIdPrefix()
  {
    return get(getOrder().getOrderId() + "order_id_prefix");
  }

  public String getPayMethodList()
  {
    String str = "";
    if ((getOrder() != null) && (getOrder().getOrderId() != null))
      str = getOrder().getOrderId().toString();
    return get(str + "pay_method");
  }

  public List<RechargeMoney> getRechargeMoneyList(PayMethod paramPayMethod)
  {
    String str = get(getOrder().getOrderId() + "recharge_money_list");
    if (TextUtils.isEmpty(str));
    while (true)
    {
      return null;
      ArrayList localArrayList = new ArrayList();
      try
      {
        JSONArray localJSONArray = new JSONObject(str).optJSONArray(paramPayMethod.name());
        if ((localJSONArray == null) || (localJSONArray.length() == 0))
          continue;
        for (int i = 0; i < localJSONArray.length(); i++)
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(i);
          RechargeMoney localRechargeMoney = new RechargeMoney();
          localRechargeMoney.check = Boolean.valueOf(localJSONObject.getBoolean("check"));
          localRechargeMoney.title = localJSONObject.getString("title");
          localRechargeMoney.money = Long.valueOf(localJSONObject.getLong("money"));
          localRechargeMoney.bonusMoney = Long.valueOf(localJSONObject.getLong("bonusMoney"));
          localArrayList.add(localRechargeMoney);
        }
        return localArrayList;
      }
      catch (JSONException localJSONException)
      {
      }
    }
    return null;
  }

  public WandouOrder getRechargeOrder(Long paramLong)
  {
    WandouOrder localWandouOrder = getOrder();
    localWandouOrder.setDesc(localWandouOrder.getDesc() + "-recharge(" + localWandouOrder.getMoneyInFen() + ":" + paramLong + ")");
    localWandouOrder.setMoneyInFen(paramLong);
    localWandouOrder.setOrderId(getLinkOrderId());
    return localWandouOrder;
  }

  public String getSdkVersion()
  {
    return "3.0.9";
  }

  public String getSecretKey()
  {
    if (TextUtils.isEmpty(this.secretKey))
    {
      this.secretKey = get("secretkey");
      new StringBuilder("Load Secret-Key from SP: ").append(this.secretKey);
    }
    return this.secretKey;
  }

  public boolean getUseExternalStorageForCache()
  {
    return this.sharedPreferences.getBoolean("USER_EXTERNAL_STORAGE_FOR_CACHE", false);
  }

  public User getUser()
  {
    User localUser = new User();
    localUser.setNick(a.l());
    try
    {
      localUser.setUid(Long.valueOf(a.t()).longValue());
      label28: localUser.setToken(a.i());
      localUser.setUsername(a.c());
      return localUser;
    }
    catch (Exception localException)
    {
      break label28;
    }
  }

  public void put(String paramString1, String paramString2)
  {
    put(paramString1, paramString2, false);
  }

  public void put(String paramString1, String paramString2, boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = this.sharedPreferences.edit();
    localEditor.putString(paramString1, paramString2);
    if ((paramBoolean) || (SHOULD_COMMIT))
    {
      localEditor.commit();
      return;
    }
    localEditor.apply();
  }

  public void setBalance(Long paramLong)
  {
    WandouOrder localWandouOrder = getOrder();
    put(localWandouOrder.getOrderId() + "account_balance", paramLong.toString());
  }

  public void setBonusMoney(Long paramLong)
  {
    put(getOrder().getOrderId() + "account_bonusMoney", paramLong.toString());
  }

  public void setChoseMoney(Long paramLong)
  {
    put(getOrder().getOrderId() + "chosed_money", paramLong.toString());
  }

  public void setCurPayMethod(String paramString)
  {
    put(getOrder().getOrderId() + "cur_paymethod", paramString);
  }

  public void setDefaultMoney(Long paramLong)
  {
    put(getOrder().getOrderId() + "default", paramLong.toString());
  }

  public void setDoPayTime(String paramString)
  {
    put(getOrder().getOrderId() + "do_pay_time" + paramString, Util.dateTime());
  }

  public void setDownloadVersion(String paramString)
  {
    put("download_version", paramString);
  }

  public void setFeedbackCategoryList(String paramString)
  {
    put("PAYMENT_FEEDBACK_CATEGORY", paramString);
  }

  public void setFeedbackChildrenCategoryList(String paramString)
  {
    put("PAYMENT_FEEDBACK_CHILDREN_CATEGORY", paramString);
  }

  public void setFinish(boolean paramBoolean)
  {
    if (paramBoolean)
      put(getOrder().getOrderId() + "finish", "true");
  }

  public void setLinkOrderId(Long paramLong)
  {
    put(getOrder().getOrderId() + "link_order_id", paramLong.toString());
  }

  public void setNeedPassword(boolean paramBoolean)
  {
    if (paramBoolean)
      put(getOrder().getOrderId() + "need_password", "true");
  }

  public void setNeedRechargeMoney(Long paramLong)
  {
    put(getOrder().getOrderId() + "need_recharge_money", paramLong.toString());
  }

  public void setOrder(WandouOrder paramWandouOrder)
  {
    put("cur_order", paramWandouOrder.toJSONString());
  }

  public void setOrderCreateTime()
  {
    put(getOrder().getOrderId() + "create_time", Util.dateTime());
  }

  public void setOrderIdPrefix(String paramString)
  {
    put(getOrder().getOrderId() + "order_id_prefix", paramString);
  }

  public void setPayMethodList(String paramString)
  {
    String[] arrayOfString = paramString.split(",");
    ArrayList localArrayList = new ArrayList();
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str3 = arrayOfString[j];
      if (PayMethod.getByName(str3) == null)
        continue;
      localArrayList.add(str3);
    }
    String str1 = TextUtils.join(",", localArrayList);
    String str2 = "";
    if ((getOrder() != null) && (getOrder().getOrderId() != null))
      str2 = getOrder().getOrderId().toString();
    put(str2 + "pay_method", str1);
  }

  public void setRechargeMoneyListResult(String paramString)
  {
    put(getOrder().getOrderId() + "recharge_money_list", paramString);
  }

  public void setSecretKey(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("Invalid secretKey in LocalStorage.");
    this.secretKey = paramString;
    put("secretkey", paramString);
  }

  public void setUseExternalStorageForCache(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = this.sharedPreferences.edit();
    localEditor.putBoolean("USER_EXTERNAL_STORAGE_FOR_CACHE", paramBoolean);
    SharePrefSubmitor.submit(localEditor);
  }

  public void setUser(User paramUser, String paramString)
  {
    if (paramUser == null);
    for (String str = null; ; str = paramUser.toString())
    {
      put("cur_user", str);
      put("wdj_auth", paramString);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.storage.LocalStorage
 * JD-Core Version:    0.6.0
 */