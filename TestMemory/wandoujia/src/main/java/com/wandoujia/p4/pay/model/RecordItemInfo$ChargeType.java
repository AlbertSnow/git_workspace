package com.wandoujia.p4.pay.model;

public enum RecordItemInfo$ChargeType
{
  static
  {
    ALIPAY = new RecordItemInfo.ChargeType.2("ALIPAY", 1);
    SHENZHOUPAY = new RecordItemInfo.ChargeType.3("SHENZHOUPAY", 2);
    BALANCEPAY = new RecordItemInfo.ChargeType.4("BALANCEPAY", 3);
    CREDITCARD = new RecordItemInfo.ChargeType.5("CREDITCARD", 4);
    DEBITCARD = new RecordItemInfo.ChargeType.6("DEBITCARD", 5);
    GAMECARDPAY = new RecordItemInfo.ChargeType.7("GAMECARDPAY", 6);
    COMPENSATION = new RecordItemInfo.ChargeType.8("COMPENSATION", 7);
    ALIPAYWAP = new RecordItemInfo.ChargeType.9("ALIPAYWAP", 8);
    ALIPAYWEB = new RecordItemInfo.ChargeType.10("ALIPAYWEB", 9);
    BANKPAYWEB = new RecordItemInfo.ChargeType.11("BANKPAYWEB", 10);
    UNIONPAY = new RecordItemInfo.ChargeType.12("UNIONPAY", 11);
    TELECOM = new RecordItemInfo.ChargeType.13("TELECOM", 12);
    UNICOM = new RecordItemInfo.ChargeType.14("UNICOM", 13);
    ChargeType[] arrayOfChargeType = new ChargeType[14];
    arrayOfChargeType[0] = UNKNOW;
    arrayOfChargeType[1] = ALIPAY;
    arrayOfChargeType[2] = SHENZHOUPAY;
    arrayOfChargeType[3] = BALANCEPAY;
    arrayOfChargeType[4] = CREDITCARD;
    arrayOfChargeType[5] = DEBITCARD;
    arrayOfChargeType[6] = GAMECARDPAY;
    arrayOfChargeType[7] = COMPENSATION;
    arrayOfChargeType[8] = ALIPAYWAP;
    arrayOfChargeType[9] = ALIPAYWEB;
    arrayOfChargeType[10] = BANKPAYWEB;
    arrayOfChargeType[11] = UNIONPAY;
    arrayOfChargeType[12] = TELECOM;
    arrayOfChargeType[13] = UNICOM;
    $VALUES = arrayOfChargeType;
  }

  static String getChannelString(String paramString)
  {
    for (ChargeType localChargeType : values())
      if (localChargeType.toString().equals(paramString))
        return localChargeType.channelString();
    return "未知方式";
  }

  abstract String channelString();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.RecordItemInfo.ChargeType
 * JD-Core Version:    0.6.0
 */