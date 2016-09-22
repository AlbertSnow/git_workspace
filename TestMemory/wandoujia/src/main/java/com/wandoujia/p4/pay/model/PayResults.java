package com.wandoujia.p4.pay.model;

public enum PayResults
{
  private static final int INVALID_ID;

  static
  {
    Purchase_Fail = new PayResults.3("Purchase_Fail", 2);
    In_Recharge = new PayResults.4("In_Recharge", 3);
    Recharge_Success = new PayResults.5("Recharge_Success", 4);
    Recharge_Fail = new PayResults.6("Recharge_Fail", 5);
    PayResults[] arrayOfPayResults = new PayResults[6];
    arrayOfPayResults[0] = In_Purchase;
    arrayOfPayResults[1] = Purchase_Success;
    arrayOfPayResults[2] = Purchase_Fail;
    arrayOfPayResults[3] = In_Recharge;
    arrayOfPayResults[4] = Recharge_Success;
    arrayOfPayResults[5] = Recharge_Fail;
    $VALUES = arrayOfPayResults;
  }

  public abstract int iconId();

  public abstract int titleId();

  public abstract boolean withContact();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.PayResults
 * JD-Core Version:    0.6.0
 */