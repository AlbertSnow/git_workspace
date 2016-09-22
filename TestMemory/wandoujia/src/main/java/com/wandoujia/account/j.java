package com.wandoujia.account;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.text.TextUtils;
import com.wandoujia.account.constants.AccountParamConstants.FinishType;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.fragment.c;
import java.util.HashMap;

public final class j
{
  private boolean a = true;
  private String b;
  private Activity c;
  private Context d;
  private boolean e;
  private boolean f;
  private AccountParams g;

  public j(Context paramContext)
  {
    this.d = paramContext.getApplicationContext();
  }

  private static void a(int paramInt1, int paramInt2, boolean paramBoolean, String paramString)
  {
    String str1;
    if (paramInt1 == 0)
    {
      str1 = "account_normal_login";
      if (!paramBoolean)
        break label92;
    }
    label92: for (String str2 = "success"; ; str2 = "failed")
    {
      if (paramInt1 != 0)
        break label99;
      HashMap localHashMap1 = new HashMap();
      localHashMap1.put("account_login_type", str1);
      localHashMap1.put("account_login_status", str2);
      localHashMap1.put("account_login_src", paramString);
      com.wandoujia.account.d.b.a();
      return;
      if (paramInt2 == 2)
      {
        str1 = "tel";
        break;
      }
      if (paramInt2 == 0)
      {
        str1 = "email";
        break;
      }
      str1 = "sms";
      break;
    }
    label99: HashMap localHashMap2 = new HashMap();
    localHashMap2.put("account_register_type", str1);
    localHashMap2.put("account_register_status", str2);
    localHashMap2.put("account_register_src", paramString);
    com.wandoujia.account.d.b.a();
  }

  public final j a(AccountParams paramAccountParams, Activity paramActivity)
  {
    this.g = paramAccountParams;
    this.c = paramActivity;
    return this;
  }

  public final j a(String paramString, boolean paramBoolean)
  {
    this.a = paramBoolean;
    this.b = paramString;
    this.e = android.support.v4.app.b.o(this.d);
    this.f = TextUtils.isEmpty(this.b);
    return this;
  }

  public final void a()
  {
    if (this.c != null)
      this.c.runOnUiThread(new k(this));
  }

  public final void a(Activity paramActivity)
  {
    if (paramActivity == null)
      return;
    a(0, 3, true, this.g.m());
  }

  public final void a(Context paramContext, Boolean paramBoolean, boolean paramBoolean1)
  {
    if (this.a)
      if ((this.e) && (!this.f))
        a(1, 2, true, this.g.m());
    while (true)
    {
      if ((!paramBoolean1) || (this.g.a() != null));
      try
      {
        this.g.a().send();
        while (true)
        {
          label58: if (this.c != null)
          {
            this.c.setResult(0);
            this.c.finish();
          }
          return;
          a(1, 1, true, this.g.m());
          break;
          a(1, 0, true, this.g.m());
          break;
          if (paramContext == null)
            continue;
          if (!paramBoolean.booleanValue())
          {
            if (this.a)
            {
              if (!(this.c instanceof c))
                continue;
              ((c)this.c).a(this.d, AccountParamConstants.FinishType.TEL_REGISTER, this.g);
              continue;
            }
            if (!(this.c instanceof c))
              continue;
            ((c)this.c).a(this.d, AccountParamConstants.FinishType.EMAIL_REGISTER, this.g);
            continue;
          }
          if (!(this.c instanceof c))
            continue;
          ((c)this.c).a(this.d, AccountParamConstants.FinishType.LOGIN, this.g);
        }
      }
      catch (PendingIntent.CanceledException localCanceledException)
      {
        break label58;
      }
    }
  }

  public final void a(WandouResponse paramWandouResponse)
  {
    if (this.a)
    {
      if ((this.e) && (!this.f))
      {
        a(1, 2, false, this.g.m());
        return;
      }
      String str = paramWandouResponse.getMsg();
      if (paramWandouResponse.getError() == 1000001)
        str = "can't found sms";
      HashMap localHashMap = new HashMap();
      localHashMap.put("account_register_type", "sms");
      localHashMap.put("account_register_status", "failed");
      localHashMap.put("account_register_failed_reason", str);
      com.wandoujia.account.d.b.a();
      a(1, 1, false, this.g.m());
      return;
    }
    a(1, 0, false, this.g.m());
  }

  public final void b()
  {
    if (this.c != null)
      this.c.runOnUiThread(new l(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.j
 * JD-Core Version:    0.6.0
 */