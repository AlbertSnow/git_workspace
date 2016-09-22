package com.wandoujia.p4.pay.paymethod;

import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.model.WandouOrder;

public class ShenzhouPay
{
  public void pay(PayImpl paramPayImpl, WandouOrder paramWandouOrder, String paramString1, int paramInt, String paramString2, String paramString3, PayCallBack paramPayCallBack)
  {
    paramPayImpl.shenzhouPay(paramWandouOrder, paramString1, paramInt, paramString2, paramString3, new ShenzhouPay.1(this, paramPayCallBack), new ShenzhouPay.2(this, paramPayCallBack));
  }

  public void queryStatus(PayImpl paramPayImpl, WandouOrder paramWandouOrder, PayCallBack paramPayCallBack)
  {
    paramPayImpl.shenzhouStatus(paramWandouOrder, new ShenzhouPay.3(this, paramPayCallBack), new ShenzhouPay.4(this, paramPayCallBack));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.paymethod.ShenzhouPay
 * JD-Core Version:    0.6.0
 */