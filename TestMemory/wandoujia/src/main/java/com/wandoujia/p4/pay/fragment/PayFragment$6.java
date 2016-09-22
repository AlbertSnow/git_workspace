package com.wandoujia.p4.pay.fragment;

import android.text.TextUtils;
import android.widget.TextView;
import com.android.volley.k;
import org.json.JSONObject;

class PayFragment$6
  implements k<JSONObject>
{
  public void onResponse(JSONObject paramJSONObject)
  {
    String str = paramJSONObject.optString("message");
    if (!TextUtils.isEmpty(str))
      PayFragment.access$2300(this.this$0).setText(str);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.6
 * JD-Core Version:    0.6.0
 */