package com.unipay.unipay_sdk;

import android.view.View;
import android.view.View.OnClickListener;
import com.unipay.beans.GameBaseBean;
import com.unipay.beans.PayValueBean;
import com.unipay.tools.a;
import java.text.Format;
import java.util.Date;

final class l
  implements View.OnClickListener
{
  l(MainActivity paramMainActivity, GameBaseBean paramGameBaseBean)
  {
  }

  public final void onClick(View paramView)
  {
    String str = this.b.a.format(new Date());
    StringBuffer localStringBuffer = new StringBuffer(str);
    for (int i = 0; i < 36 - str.length(); i++)
      localStringBuffer.append('0');
    PayValueBean localPayValueBean = new PayValueBean("130201102727", "金币40", "0.1", localStringBuffer.toString());
    a.f();
    UniPay.a().a(this.b, this.a, localPayValueBean, UniPay.payType.VAC, MainActivity.a(this.b));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.unipay_sdk.l
 * JD-Core Version:    0.6.0
 */