package com.wandoujia.p4.pay.paymethod;

import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.model.WandouOrder;

public class GameCardPay
{
  public void pay(PayImpl paramPayImpl, WandouOrder paramWandouOrder, String paramString1, String paramString2, String paramString3, String paramString4, PayCallBack paramPayCallBack)
  {
    paramPayImpl.gameCardPay(paramWandouOrder, paramString4, paramString1, paramString2, paramString3, new GameCardPay.1(this, paramPayCallBack), new GameCardPay.2(this, paramPayCallBack));
  }

  public void queryStatus(PayImpl paramPayImpl, WandouOrder paramWandouOrder, PayCallBack paramPayCallBack)
  {
    new ShenzhouPay().queryStatus(paramPayImpl, paramWandouOrder, paramPayCallBack);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.paymethod.GameCardPay
 * JD-Core Version:    0.6.0
 */