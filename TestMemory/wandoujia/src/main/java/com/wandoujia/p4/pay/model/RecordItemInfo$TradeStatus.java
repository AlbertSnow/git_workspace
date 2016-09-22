package com.wandoujia.p4.pay.model;

 enum RecordItemInfo$TradeStatus
{
  static
  {
    FINISH = new TradeStatus("FINISH", 2);
    SERVERFINISH = new TradeStatus("SERVERFINISH", 3);
    ERROR = new TradeStatus("ERROR", 4);
    TradeStatus[] arrayOfTradeStatus = new TradeStatus[5];
    arrayOfTradeStatus[0] = CREATE;
    arrayOfTradeStatus[1] = PROCESS;
    arrayOfTradeStatus[2] = FINISH;
    arrayOfTradeStatus[3] = SERVERFINISH;
    arrayOfTradeStatus[4] = ERROR;
    $VALUES = arrayOfTradeStatus;
  }

  static String getStatusString(String paramString, int paramInt)
  {
    String str1 = "支付";
    if (paramInt == 0)
      str1 = "充值";
    String str2;
    if (SERVERFINISH.toString().equals(paramString))
      str2 = "成功";
    while (true)
    {
      return str1 + str2;
      if ((CREATE.toString().equals(paramString)) || (PROCESS.equals(paramString)) || (FINISH.equals(paramString)))
      {
        str2 = "中";
        continue;
      }
      if (ERROR.toString().equals(paramString))
      {
        str2 = "失败";
        continue;
      }
      str2 = "状态未知";
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.RecordItemInfo.TradeStatus
 * JD-Core Version:    0.6.0
 */