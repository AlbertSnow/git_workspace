package com.wandoujia.p4.pay.fragment;

import android.widget.TextView;
import com.android.volley.k;
import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.model.PayMethod;
import com.wandoujia.p4.pay.model.RechargePaySet;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.paymethod.Alipay;
import com.wandoujia.p4.pay.paymethod.ShenzhouPay;
import com.wandoujia.p4.pay.paymethod.TelecomPay;
import com.wandoujia.p4.pay.paymethod.UnionPay;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.LogEvent;
import com.wandoujia.p4.pay.utils.SLog;
import org.json.JSONException;
import org.json.JSONObject;

class PayFragment$3$1$1
  implements k<RechargePaySet>
{
  public void onResponse(RechargePaySet paramRechargePaySet)
  {
    this.val$order.setRechargeInfo(paramRechargePaySet.rechargeInfo);
    SLog.i("rechargeInfo", paramRechargePaySet.rechargeInfo);
    LogEvent.doPay(this.this$2.val$payMethod.name(), Long.valueOf(this.this$2.val$money.longValue()));
    if (PayMethod.ALIPAY.equals(this.this$2.val$payMethod))
    {
      SLog.i("order", this.val$order.toJSONString());
      this.val$order.setRechargeInfo(PayFragment.access$300(this.this$2.this$1.this$0).getOrderIdPrefix() + PayFragment.access$300(this.this$2.this$1.this$0).getLinkOrderId());
      new Alipay().pay(this.this$2.this$1.this$0.getActivity(), this.val$order, 100);
    }
    do
    {
      return;
      if (PayMethod.UNIONPAY.equals(this.this$2.val$payMethod))
        try
        {
          JSONObject localJSONObject = new JSONObject(paramRechargePaySet.rechargeInfo);
          SLog.d("payid", localJSONObject.getString("unionPayId"));
          new UnionPay().pay(this.this$2.this$1.this$0.getActivity(), localJSONObject.getString("unionPayId"), 200);
          return;
        }
        catch (JSONException localJSONException)
        {
          SLog.e("pay", localJSONException);
          return;
        }
      if (PayMethod.SHENZHOUPAY.equals(this.this$2.val$payMethod))
      {
        String str3 = PayFragment.access$700(this.this$2.this$1.this$0).getText().toString();
        String str4 = PayFragment.access$800(this.this$2.this$1.this$0).getText().toString();
        SLog.d(PayFragment.access$900(), "ShenZhou Pay... TODO..." + this.this$2.val$money + str3 + str4);
        WandouOrder localWandouOrder = PayFragment.access$300(this.this$2.this$1.this$0).getRechargeOrder(this.this$2.val$money);
        new ShenzhouPay().pay(PayFragment.access$600(this.this$2.this$1.this$0), localWandouOrder, "1", (int)(this.this$2.val$money.longValue() / 100L), str3, str4, new PayFragment.3.1.1.1(this, localWandouOrder));
        return;
      }
      if (!PayMethod.TELECOM.equals(this.this$2.val$payMethod))
        continue;
      new TelecomPay().pay(this.this$2.this$1.this$0.getActivity(), this.val$order, PayFragment.access$1400(this.this$2.this$1.this$0));
      return;
    }
    while (!PayMethod.UNICOM.equals(this.this$2.val$payMethod));
    String str1 = PayFragment.access$600(this.this$2.this$1.this$0).showMoney(PayFragment.access$300(this.this$2.this$1.this$0).getChoseMoney().longValue());
    String str2 = PayFragment.access$600(this.this$2.this$1.this$0).showMoney(2L * PayFragment.access$300(this.this$2.this$1.this$0).getChoseMoney().longValue());
    PayFragment.access$1500(this.this$2.this$1.this$0, "sms_pay_check", "确认使用话费支付", "支付 " + str2 + "元购买" + str1 + "豌豆币", new PayFragment.3.1.1.2(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.3.1.1
 * JD-Core Version:    0.6.0
 */