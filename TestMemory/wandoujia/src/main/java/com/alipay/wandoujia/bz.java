package com.alipay.wandoujia;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;

public final class bz
{
  private static int a = 0;

  public static sh a(sf paramsf)
  {
    if (paramsf != null);
    switch (a()[paramsf.ordinal()])
    {
    default:
      return null;
    case 1:
      return new av();
    case 2:
      return new bf();
    case 3:
      return new co();
    case 4:
      return new bs();
    case 5:
      return new ba();
    case 6:
      return new bm();
    case 7:
      return new ch();
    case 8:
      return new bb();
    case 9:
      return new bq();
    case 10:
      return new ay();
    case 11:
      return new cj();
    case 12:
    case 13:
      return new cl();
    case 14:
      return new cc();
    case 15:
      return new br();
    case 16:
      return new ck();
    case 17:
      return new bv();
    case 18:
      return new aw();
    case 21:
      return new ca();
    case 20:
      return new bt();
    case 19:
    }
    return new bg();
  }

  public static sh a(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
      return null;
    sf localsf = sf.a(paramJSONObject.optString("type"));
    String str = paramJSONObject.optString("content");
    if ((localsf == sf.u) && (TextUtils.equals("title", str)))
      localsf = sf.t;
    return a(localsf);
  }

  public static void a(View paramView)
  {
    if (paramView == null);
    do
      return;
    while (paramView.getId() != -1);
    paramView.setId(a);
    a = 1 + a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.bz
 * JD-Core Version:    0.6.0
 */