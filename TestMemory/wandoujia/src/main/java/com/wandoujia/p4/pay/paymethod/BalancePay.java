package com.wandoujia.p4.pay.paymethod;

import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.model.WandouOrder;

public class BalancePay
{
  private static final String TAG = BalancePay.class.getSimpleName();

  public void pay(PayImpl paramPayImpl, WandouOrder paramWandouOrder, String paramString, Long paramLong, PayCallBack paramPayCallBack)
  {
    paramPayImpl.balancePay(paramWandouOrder, paramString, paramLong, new BalancePay.1(this, paramPayCallBack), new BalancePay.2(this, paramPayCallBack));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.paymethod.BalancePay
 * JD-Core Version:    0.6.0
 */