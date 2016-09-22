package com.wandoujia.p4.pay.fragment;

import android.text.TextUtils;
import android.widget.ListView;
import com.wandoujia.base.log.Log;
import com.wandoujia.p4.model.PayParams;
import com.wandoujia.rpc.http.callback.Callback;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONObject;

class MyBonusFragment$1
  implements Callback<PayParams, ExecutionException>
{
  public void onError(ExecutionException paramExecutionException)
  {
    Log.w("Wandou", paramExecutionException);
  }

  public void onSuccess(PayParams paramPayParams)
  {
    while (true)
    {
      String str2;
      try
      {
        Log.w("Wandou", "asyncLoad:  " + paramPayParams.content, new Object[0]);
        JSONObject localJSONObject1 = new JSONObject(paramPayParams.content);
        ArrayList localArrayList = new ArrayList();
        JSONArray localJSONArray = new JSONArray(localJSONObject1.getString("result"));
        int i = 0;
        if (i >= localJSONArray.length())
          continue;
        JSONObject localJSONObject2 = localJSONArray.getJSONObject(i);
        Date localDate = new Date();
        localDate.setTime(localJSONObject2.getLong("expirationTime"));
        String str1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(localDate);
        str2 = this.this$0.getString(2131625125);
        JSONObject localJSONObject3 = localJSONObject2.optJSONObject("payBonusRule");
        if ((localJSONObject3 == null) || (localJSONObject3.optString("title") == null))
          break label382;
        str3 = localJSONObject3.optString("title");
        if (localJSONObject3 != null)
        {
          String str4 = localJSONObject3.optString("description");
          String str5 = localJSONObject3.optString("iconUrl");
          str6 = str4;
          str7 = str5;
          if (TextUtils.isEmpty(str6))
            break label389;
          str8 = "\n" + str6;
          localArrayList.add(MyBonusFragment.access$100(this.this$0, str3, this.this$0.getString(2131625120) + MyBonusFragment.access$000(this.this$0, Long.valueOf(localJSONObject2.getLong("money") - localJSONObject2.getLong("consumedMoney"))) + this.this$0.getString(2131624167), str1 + this.this$0.getString(2131625121) + str8, str7));
          i++;
          continue;
          MyBonusFragment.access$200(this.this$0).setAdapter(new MyBonusFragment.BonusAdapter(this.this$0.getActivity(), localArrayList));
          return;
        }
      }
      catch (Exception localException)
      {
        return;
      }
      String str6 = null;
      String str7 = null;
      continue;
      label382: String str3 = str2;
      continue;
      label389: String str8 = "";
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.MyBonusFragment.1
 * JD-Core Version:    0.6.0
 */