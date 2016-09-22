package com.wandoujia.p4.pay.model;

public enum PayMethod
{
  static
  {
    SHENZHOUPAY = new PayMethod.3("SHENZHOUPAY", 2);
    UNICOM = new PayMethod.4("UNICOM", 3);
    TELECOM = new PayMethod.5("TELECOM", 4);
    PayMethod[] arrayOfPayMethod = new PayMethod[5];
    arrayOfPayMethod[0] = ALIPAY;
    arrayOfPayMethod[1] = UNIONPAY;
    arrayOfPayMethod[2] = SHENZHOUPAY;
    arrayOfPayMethod[3] = UNICOM;
    arrayOfPayMethod[4] = TELECOM;
    $VALUES = arrayOfPayMethod;
  }

  public static PayMethod getByName(String paramString)
  {
    for (PayMethod localPayMethod : values())
      if (localPayMethod.name().equals(paramString))
        return localPayMethod;
    return null;
  }

  public static PayMethod getByTitle(String paramString)
  {
    for (PayMethod localPayMethod : values())
      if (localPayMethod.title().equals(paramString))
        return localPayMethod;
    return null;
  }

  public abstract String describe();

  public abstract String title();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.PayMethod
 * JD-Core Version:    0.6.0
 */