package com.android.volley.toolbox;

import com.android.volley.ParseError;
import com.android.volley.j;
import com.android.volley.k;
import com.wandoujia.nirvana.framework.network.a.a;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public final class s extends t<JSONObject>
{
  public s(String paramString, k<JSONObject> paramk, j paramj)
  {
    super(paramString, paramk, paramj);
  }

  protected final com.wandoujia.p4.app.detail.model.b<JSONObject> a(a parama)
  {
    try
    {
      com.wandoujia.p4.app.detail.model.b localb = com.wandoujia.p4.app.detail.model.b.a(new JSONObject(new String(parama.a, android.support.v4.app.b.a(parama.b))), android.support.v4.app.b.a(parama));
      return localb;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      return com.wandoujia.p4.app.detail.model.b.a(new ParseError(localUnsupportedEncodingException));
    }
    catch (JSONException localJSONException)
    {
    }
    return com.wandoujia.p4.app.detail.model.b.a(new ParseError(localJSONException));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.toolbox.s
 * JD-Core Version:    0.6.0
 */