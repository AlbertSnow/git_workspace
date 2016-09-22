package com.wandoujia.p4.account.manager;

import android.content.Context;
import android.content.Intent;
import android.util.AndroidRuntimeException;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.constants.AccountParamConstants.FinishType;
import com.wandoujia.account.listener.e;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.p4.account.activity.AccountModifyProfileActivity;
import com.wandoujia.p4.account.activity.PhoenixAccountActivity;

public class AccountUtil
{
  public static void a(Context paramContext, AccountParams paramAccountParams)
  {
    boolean bool1 = true;
    if (paramContext == null)
      return;
    paramAccountParams.t();
    boolean bool2;
    if (!OemUtil.isOem())
    {
      bool2 = bool1;
      paramAccountParams.b(bool2);
      if (OemUtil.isOem())
        break label54;
    }
    while (true)
    {
      paramAccountParams.c(bool1);
      android.support.v4.app.b.a(paramContext, d.a().d(), paramAccountParams, PhoenixAccountActivity.class);
      return;
      bool2 = false;
      break;
      label54: bool1 = false;
    }
  }

  public static void a(Context paramContext, AccountParams paramAccountParams, e parame)
  {
    d.a().d().a(parame);
    a(paramContext, paramAccountParams);
  }

  public static void a(AccountParams paramAccountParams, AccountParamConstants.FinishType paramFinishType, Context paramContext)
  {
    if ((paramAccountParams != null) && (paramAccountParams.h()))
    {
      if ((paramFinishType != AccountParamConstants.FinishType.LOGIN) && (paramFinishType != AccountParamConstants.FinishType.QQ_LOGIN) && (paramFinishType != AccountParamConstants.FinishType.SINA_LOGIN) && (paramFinishType != AccountParamConstants.FinishType.RENREN_LOGIN))
        break label125;
      com.wandoujia.p4.subscribe.config.a.b();
      if (paramAccountParams.g())
      {
        Intent localIntent2 = new Intent("pheonix.intent.action.ACCOUNT_FINISH");
        localIntent2.putExtra("showGuide", true);
        paramContext.sendBroadcast(localIntent2);
      }
    }
    while (true)
    {
      if ((paramFinishType == AccountParamConstants.FinishType.EMAIL_REGISTER) || (paramFinishType == AccountParamConstants.FinishType.TEL_REGISTER))
        com.wandoujia.account.a.e(true);
      if (paramAccountParams != null)
      {
        Intent localIntent1 = new Intent("pheonix.intent.action.ACCOUNT_FINISH");
        localIntent1.putExtra("source", paramAccountParams.m());
        paramContext.sendBroadcast(localIntent1);
      }
      return;
      label125: if ((paramFinishType != AccountParamConstants.FinishType.EMAIL_REGISTER) && (paramFinishType != AccountParamConstants.FinishType.TEL_REGISTER))
        continue;
      if (paramAccountParams.g())
      {
        Intent localIntent3 = new Intent("pheonix.intent.action.ACCOUNT_FINISH");
        localIntent3.putExtra("showGuide", true);
        paramContext.sendBroadcast(localIntent3);
      }
      com.wandoujia.p4.subscribe.config.a.b();
      Intent localIntent4 = new Intent(paramContext, AccountModifyProfileActivity.class);
      try
      {
        paramContext.startActivity(localIntent4);
      }
      catch (AndroidRuntimeException localAndroidRuntimeException)
      {
        localIntent4.setFlags(268435456);
        paramContext.startActivity(localIntent4);
      }
    }
  }

  private static native String getAccountSourceNative(Context paramContext);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.manager.AccountUtil
 * JD-Core Version:    0.6.0
 */