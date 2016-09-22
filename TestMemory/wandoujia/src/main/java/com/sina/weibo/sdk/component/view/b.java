package com.sina.weibo.sdk.component.view;

import android.os.Handler;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.net.f;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  implements f
{
  b(AttentionComponentView paramAttentionComponentView)
  {
  }

  public final void a(WeiboException paramWeiboException)
  {
    AttentionComponentView.a();
    new StringBuilder("error : ").append(paramWeiboException.getMessage());
    AttentionComponentView.b(this.a);
  }

  public final void a(String paramString)
  {
    AttentionComponentView.a();
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString).optJSONObject("target");
      this.a.getHandler().post(new c(this, localJSONObject));
      return;
    }
    catch (JSONException localJSONException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.view.b
 * JD-Core Version:    0.6.0
 */