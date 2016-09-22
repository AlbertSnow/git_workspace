package com.unionpay.mpay.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.unionpay.uppay.PayActivityEx;
import com.unionpay.uppay.b;
import com.unionpay.uppay.c;

public final class a
{
  public int a;
  public String b;

  public a(int paramInt, String paramString)
  {
    this.a = paramInt;
    this.b = paramString;
  }

  public static void a(Context paramContext, b paramb)
  {
    new StringBuilder("reqId=").append(paramb.x.a);
    PayActivityEx localPayActivityEx = (PayActivityEx)paramContext;
    if (paramb.x.e.length() > 0)
    {
      new StringBuilder("result=").append(paramb.x.e);
      switch (paramb.x.a)
      {
      default:
      case 1:
      case 4:
      case 1000:
      case 0:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      if ((paramb.I != null) && (paramb.I.length() > 0) && (paramb.J != null) && (paramb.J.length() > 0))
      {
        boolean bool = paramb.H;
        String str1 = paramb.I;
        String str2 = paramb.J;
        if (bool)
          new Thread(new f(str1, str2)).start();
      }
      localPayActivityEx.finish();
      return;
      String str3 = paramb.x.e;
      String str4;
      label230: Intent localIntent3;
      if (str3.equalsIgnoreCase("fail"))
      {
        str4 = "1";
        int i = paramb.x.a;
        localIntent3 = null;
        switch (i)
        {
        case 2:
        case 3:
        default:
        case 4:
        case 1:
        }
      }
      String str5;
      while (true)
      {
        str5 = paramb.i + str4;
        if (1000 != paramb.x.a)
          break label438;
        Intent localIntent4 = new Intent("android.intent.action.VIEW", Uri.parse(str5));
        localIntent4.addCategory("android.intent.category.BROWSABLE");
        localPayActivityEx.startActivity(localIntent4);
        break;
        if (str3.equalsIgnoreCase("cancel"))
        {
          str4 = "-1";
          break label230;
        }
        str4 = "0";
        break label230;
        Intent localIntent5 = new Intent("com.UCMobile.PluginApp.ActivityState");
        localIntent5.putExtra("ActivityState", "inactive");
        localIntent5.addCategory("android.intent.category.DEFAULT");
        localPayActivityEx.sendBroadcast(localIntent5);
        localIntent3 = new Intent("com.unionpay.uppay.resultURL");
        continue;
        localIntent3 = new Intent(paramb.x.b);
      }
      label438: localIntent3.putExtra("ResultURL", str5);
      localPayActivityEx.sendBroadcast(localIntent3);
      continue;
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("pay_result", paramb.x.e);
      if ((paramb.I != null) && (paramb.I.length() > 0) && (paramb.J != null) && (paramb.J.length() > 0) && (!paramb.H))
      {
        localIntent2.putExtra("notify_url", paramb.I);
        localIntent2.putExtra("notify_msg", paramb.J);
      }
      localPayActivityEx.setResult(-1, localIntent2);
      continue;
      Intent localIntent1 = new Intent();
      localIntent1.putExtra("pay_result", paramb.x.e);
      localIntent1.putExtra("tencentWID", paramb.x.g);
      localIntent1.putExtra("tencentUID", paramb.x.f);
      localIntent1.putExtra("bankInfo", paramb.x.i);
      localIntent1.putExtra("cardType", paramb.x.j);
      localIntent1.putExtra("cardNo", paramb.x.h);
      localPayActivityEx.setResult(-1, localIntent1);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.utils.a
 * JD-Core Version:    0.6.0
 */