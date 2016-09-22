package com.wandoujia.p4.pay.model;

import android.text.TextUtils;
import com.wandoujia.p4.pay.utils.ExternUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class RecordItemInfo
{
  public static final String DATE_FORMAT_POINT = "yyyy.MM.dd";
  public static final String FULL_DATE_FORMAT_DASH = "yyyy-MM-dd HH:mm:ss";
  public static final int TYPE_BOTH = 2;
  public static final int TYPE_ORDER = 1;
  public static final int TYPE_RECHARGE;
  public String amount;
  public String channel;
  public String dateString;
  public String gameName;
  public String itemName;
  public String orderInGame;
  public String price;
  public String status;
  public String wandouOrder;

  static String formatDate(String paramString1, String paramString2)
  {
    try
    {
      String str = new SimpleDateFormat(paramString2, Locale.CHINA).format(new Date(Long.parseLong(paramString1)));
      return str;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return "";
  }

  public static List<RecordItemInfo> getRecordList(int paramInt, String paramString)
  {
    int i = 0;
    ArrayList localArrayList = new ArrayList();
    RecordItemInfo.PurchaseRecordResponse localPurchaseRecordResponse = (RecordItemInfo.PurchaseRecordResponse)ExternUtil.fromJson(paramString, RecordItemInfo.PurchaseRecordResponse.class);
    if ((localPurchaseRecordResponse != null) && (!TextUtils.isEmpty(localPurchaseRecordResponse.result)))
    {
      String str1 = localPurchaseRecordResponse.result;
      if (paramInt == 0)
      {
        RecordItemInfo.RechargeItem[] arrayOfRechargeItem = (RecordItemInfo.RechargeItem[])ExternUtil.fromJson(str1, [Lcom.wandoujia.p4.pay.model.RecordItemInfo.RechargeItem.class);
        if ((arrayOfRechargeItem != null) && (arrayOfRechargeItem.length > 0))
        {
          int k = arrayOfRechargeItem.length;
          while (i < k)
          {
            RecordItemInfo.RechargeItem localRechargeItem = arrayOfRechargeItem[i];
            if ((localRechargeItem != null) && (localRechargeItem.payOrder != null) && (!TextUtils.isEmpty(localRechargeItem.payOrder.money)))
            {
              RecordItemInfo localRecordItemInfo2 = new RecordItemInfo();
              localRecordItemInfo2.gameName = "豌豆币";
              localRecordItemInfo2.itemName = "充值";
              String str2 = localRechargeItem.payOrder.money;
              localRecordItemInfo2.price = str2;
              localRecordItemInfo2.amount = str2;
              localRecordItemInfo2.status = RecordItemInfo.TradeStatus.getStatusString(localRechargeItem.payOrder.tradeStatus, paramInt);
              localRecordItemInfo2.dateString = formatDate(localRechargeItem.payOrder.modification, "yyyy-MM-dd HH:mm:ss");
              localRecordItemInfo2.channel = RecordItemInfo.ChargeType.getChannelString(localRechargeItem.payOrder.chargeType);
              localRecordItemInfo2.wandouOrder = localRechargeItem.id;
              localArrayList.add(localRecordItemInfo2);
            }
            i++;
          }
        }
      }
      else
      {
        RecordItemInfo.OrderItem[] arrayOfOrderItem = (RecordItemInfo.OrderItem[])ExternUtil.fromJson(str1, [Lcom.wandoujia.p4.pay.model.RecordItemInfo.OrderItem.class);
        if ((arrayOfOrderItem != null) && (arrayOfOrderItem.length > 0))
        {
          int j = arrayOfOrderItem.length;
          while (i < j)
          {
            RecordItemInfo.OrderItem localOrderItem = arrayOfOrderItem[i];
            if ((localOrderItem != null) && (localOrderItem.money != null))
            {
              RecordItemInfo localRecordItemInfo1 = new RecordItemInfo();
              localRecordItemInfo1.gameName = localOrderItem.orderName;
              localRecordItemInfo1.itemName = localOrderItem.orderDesc;
              localRecordItemInfo1.price = localOrderItem.money;
              localRecordItemInfo1.status = RecordItemInfo.TradeStatus.getStatusString(localOrderItem.tradeStatus, paramInt);
              localRecordItemInfo1.dateString = formatDate(localOrderItem.modification, "yyyy-MM-dd HH:mm:ss");
              localRecordItemInfo1.channel = RecordItemInfo.ChargeType.getChannelString(localOrderItem.chargeType);
              localRecordItemInfo1.wandouOrder = localOrderItem.id;
              localRecordItemInfo1.orderInGame = localOrderItem.out_trade_no;
              localArrayList.add(localRecordItemInfo1);
            }
            i++;
          }
        }
      }
    }
    return localArrayList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.RecordItemInfo
 * JD-Core Version:    0.6.0
 */