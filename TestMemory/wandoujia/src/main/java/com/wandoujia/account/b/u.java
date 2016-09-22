package com.wandoujia.account.b;

import android.os.Handler;
import com.wandoujia.account.dto.AccountBean;
import com.wandoujia.account.dto.AccountResponse;
import com.wandoujia.account.dto.DeviceBean;
import com.wandoujia.account.dto.FIELDS;

final class u extends Thread
{
  u(s params)
  {
  }

  public final void run()
  {
    a locala = this.a.a;
    String str = s.a(this.a);
    DeviceBean localDeviceBean = s.b(this.a);
    FIELDS[] arrayOfFIELDS = new FIELDS[1];
    arrayOfFIELDS[0] = FIELDS.BASIC_SOCIAL;
    AccountResponse localAccountResponse = locala.a(str, localDeviceBean, arrayOfFIELDS);
    if ((localAccountResponse != null) && (localAccountResponse.getMember() != null))
    {
      com.wandoujia.account.a.a(localAccountResponse.getMember().getUsername(), a.c(this.a.a));
      a.g(this.a.a).post(new v(this, localAccountResponse));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.b.u
 * JD-Core Version:    0.6.0
 */