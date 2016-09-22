package com.unionpay.mpay.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.v4.app.i;
import android.telephony.TelephonyManager;
import com.unionpay.uppay.PayActivityEx;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;

public final class UPPayEngine
  implements Handler.Callback, com.unionpay.pboctransaction.d, Runnable
{
  private com.unionpay.mpay.net.d a = null;
  private String b = null;
  private Context c = null;
  private Handler d = null;
  private UPPayEngine.a e = null;
  private com.unionpay.uppay.b f = null;
  private int g = 0;

  public UPPayEngine(Context paramContext)
  {
    this.c = paramContext;
    this.d = new Handler(this);
  }

  private native String accountVerifyMessage(int paramInt, String paramString);

  private native String actEntrustMessage(int paramInt, String paramString);

  private native String banksMessage(int paramInt);

  private native String commonMessage(int paramInt, String paramString1, String paramString2);

  private native String decryptResponse(int paramInt, String paramString);

  private native String encryptMessage(int paramInt, String paramString);

  private native String entrustInitMessage(int paramInt, String paramString1, String paramString2, String paramString3);

  private native String followRulesMessage(int paramInt, String paramString);

  private native String getServerUrl(int paramInt);

  private native String getUserInfo(int paramInt, String paramString);

  private native String getloginrules(int paramInt);

  private native String initMessage(int paramInt, String paramString);

  private void j(String paramString)
  {
    new Thread(this, paramString).start();
  }

  private native String openRuleMessage(int paramInt, String paramString1, String paramString2);

  private native String openupgradeMessage(int paramInt, String paramString);

  private native String payingMessage(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4);

  private native String queryMessage(int paramInt, String paramString1, String paramString2);

  private native String retrieveInitializeKey(int paramInt);

  private native String ruleMessage(int paramInt, String paramString);

  private native void setSessionKey(int paramInt, String paramString);

  private native String smsCodeMessage(int paramInt, String paramString1, String paramString2);

  private native String unBoundMessage(int paramInt, String paramString);

  private native boolean verifySign(int paramInt, String paramString1, String paramString2);

  public final void a()
  {
    int i;
    if (this.f.x.c.equalsIgnoreCase("01"))
      i = 1;
    while (true)
    {
      this.a = new com.unionpay.mpay.net.d(getServerUrl(i));
      return;
      if (this.f.x.c.equalsIgnoreCase("02"))
      {
        i = 2;
        continue;
      }
      if (this.f.x.c.equalsIgnoreCase("98"))
      {
        i = 98;
        continue;
      }
      boolean bool = this.f.x.c.equalsIgnoreCase("99");
      i = 0;
      if (!bool)
        continue;
      i = 99;
    }
  }

  public final void a(int paramInt)
  {
    this.g = paramInt;
  }

  public final void a(UPPayEngine.a parama)
  {
    this.e = parama;
  }

  public final void a(com.unionpay.uppay.b paramb)
  {
    if ((this.f == null) || (this.f != paramb))
      this.f = paramb;
  }

  public final void a(String paramString)
  {
    this.b = paramString;
  }

  public final void a(String paramString1, String paramString2)
  {
    String str = openRuleMessage(this.g, paramString1, paramString2);
    new StringBuilder().append(decryptResponse(this.g, str));
    this.a.a(str);
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("sid", this.b);
    this.a.a(localHashMap);
    j("openRule");
  }

  public final void a(String paramString1, String paramString2, int paramInt)
  {
    String str = commonMessage(this.g, paramString1, paramString2);
    this.a.a(str);
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("sid", this.b);
    this.a.a(localHashMap);
    if (paramInt <= 0)
    {
      j(paramString1);
      return;
    }
    Message localMessage = this.d.obtainMessage(1, paramString1);
    this.d.sendMessageDelayed(localMessage, paramInt * 1000);
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    String str = payingMessage(this.g, paramString1, paramString2, paramString3, paramString4);
    this.a.a(str);
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("sid", this.b);
    this.a.a(localHashMap);
    j("pay");
  }

  public final int b()
  {
    return this.g;
  }

  public final void b(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, 0);
  }

  public final boolean b(String paramString)
  {
    setSessionKey(this.g, paramString);
    return true;
  }

  public final void c()
  {
    String str = getloginrules(this.g);
    this.a.a(str);
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("sid", this.b);
    this.a.a(localHashMap);
    j("getloginrules");
  }

  public final void c(String paramString)
  {
    int i = this.g;
    Context localContext = this.c;
    com.unionpay.uppay.b localb1 = this.f;
    if ((localb1.x != null) && ((localb1.x.a == 2) || (localb1.x.a == 3)));
    for (String str1 = "2"; ; str1 = "1")
    {
      String str2 = this.f.b;
      Object[] arrayOfObject = new Object[12];
      arrayOfObject[0] = paramString;
      com.unionpay.uppay.b localb2 = (com.unionpay.uppay.b)((PayActivityEx)localContext).a(null);
      String str3;
      if (localb2.x.a == 3)
        str3 = localb2.x.g;
      label386: 
      while (true)
      {
        arrayOfObject[1] = str3;
        arrayOfObject[2] = Locale.getDefault().toString();
        arrayOfObject[3] = android.support.v4.app.b.k(localContext);
        arrayOfObject[4] = (com.unionpay.mpay.a.a.B + "*" + com.unionpay.mpay.a.a.n).trim();
        arrayOfObject[5] = "android";
        arrayOfObject[6] = Build.VERSION.RELEASE.trim();
        String str4 = Build.MODEL.trim();
        if (str4 != null)
          str4.replace(" ", "");
        arrayOfObject[7] = str4;
        arrayOfObject[8] = str1;
        arrayOfObject[9] = str2;
        arrayOfObject[10] = i.a(localContext);
        arrayOfObject[11] = android.support.v4.app.b.l(localContext);
        String str5 = initMessage(i, String.format("\"tn\":\"%s\",\"user\":\"%s\",\"locale\":\"%s\",\"terminal_version\":\"%s\",\"terminal_resolution\":\"%s\",\"os_name\":\"%s\",\"os_version\":\"%s\",\"device_model\":\"%s\",\"terminal_type\":\"%s\",\"appId\":\"%s\", \"uid\":\"%s\",\"mac\":\"%s\"", arrayOfObject));
        this.a.a(str5);
        HashMap localHashMap = new HashMap(1);
        localHashMap.put("secret", retrieveInitializeKey(this.g));
        this.a.a(localHashMap);
        j("init");
        return;
        int j;
        if (new File("/system/bin/su").exists())
        {
          j = 1;
          label331: if (j == 0)
            break label370;
        }
        label370: for (str3 = android.support.v4.app.b.l(localContext); ; str3 = ((TelephonyManager)localContext.getSystemService("phone")).getDeviceId())
        {
          if ((str3 != null) && (str3.length() != 0))
            break label386;
          str3 = i.a(localContext);
          break;
          j = 0;
          break label331;
        }
      }
    }
  }

  public final void d(String paramString)
  {
    String str = ruleMessage(this.g, paramString);
    this.a.a(str);
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("sid", this.b);
    this.a.a(localHashMap);
    j("rule");
  }

  public final void e(String paramString)
  {
    String str = followRulesMessage(this.g, paramString);
    this.a.a(str);
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("sid", this.b);
    this.a.a(localHashMap);
    j("followRule");
  }

  public final void f(String paramString)
  {
    String str = openupgradeMessage(this.g, paramString);
    this.a.a(str);
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("sid", this.b);
    this.a.a(localHashMap);
    j("openupgrade");
  }

  public final native void freeNativeData(int paramInt);

  public final void g(String paramString)
  {
    String str = unBoundMessage(this.g, paramString);
    this.a.a(str);
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("sid", this.b);
    this.a.a(localHashMap);
    j("unbindcard");
  }

  public final void h(String paramString)
  {
    String str = getUserInfo(this.g, paramString);
    this.a.a(str);
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("sid", this.b);
    this.a.a(localHashMap);
    j("getuserinfo");
  }

  public final boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 0)
    {
      a locala = (a)paramMessage.obj;
      int i = locala.a;
      String str = null;
      if (i == 0)
        str = decryptResponse(this.g, locala.b);
      if (this.e != null)
      {
        this.e.a(locala.a, str);
        new StringBuilder("UPPayEngine:").append(this.e.toString());
      }
    }
    do
    {
      return true;
      if (paramMessage.what != 1)
        continue;
      j((String)paramMessage.obj);
      return true;
    }
    while ((paramMessage.what != 2) || (this.e == null));
    this.e.a(paramMessage.arg1, null);
    return true;
  }

  public final String i(String paramString)
  {
    String str1 = encryptMessage(this.g, paramString);
    this.a.a(str1);
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("sid", this.b);
    this.a.a(localHashMap);
    com.unionpay.mpay.net.c localc = new com.unionpay.mpay.net.c(this.a);
    int i = localc.a();
    String str2 = localc.c();
    if (i == 0)
      return decryptResponse(this.g, str2);
    Message localMessage = this.d.obtainMessage(2);
    localMessage.arg1 = i;
    this.d.sendMessage(localMessage);
    return null;
  }

  public final native int initJNIEnv(Activity paramActivity, boolean paramBoolean1, boolean paramBoolean2);

  public final void run()
  {
    this.a.c().put("magic_number", "20131120");
    com.unionpay.mpay.net.c localc = new com.unionpay.mpay.net.c(this.a);
    a locala = new a(localc.a(), localc.c());
    Message localMessage = this.d.obtainMessage();
    localMessage.what = 0;
    localMessage.obj = locala;
    this.d.sendMessage(localMessage);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.utils.UPPayEngine
 * JD-Core Version:    0.6.0
 */