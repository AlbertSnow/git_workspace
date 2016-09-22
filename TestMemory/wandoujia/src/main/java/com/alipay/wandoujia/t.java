package com.alipay.wandoujia;

import android.os.Build;
import android.support.v4.app.b;
import com.wandoujia.clean.b.a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class t
{
  private r a;
  private JSONObject b;
  private JSONObject c;
  private WeakReference d = null;
  private md e;
  private boolean f = true;

  public t(r paramr, JSONObject paramJSONObject, md parammd)
  {
    this(paramr, paramJSONObject, null, null, parammd);
  }

  public t(r paramr, JSONObject paramJSONObject1, JSONObject paramJSONObject2, a parama, md parammd)
  {
    this.a = paramr;
    this.b = paramJSONObject1;
    this.c = paramJSONObject2;
    this.d = new WeakReference(parama);
    this.e = parammd;
  }

  public final String a()
  {
    return this.a.a();
  }

  public final JSONObject a(String paramString)
  {
    JSONObject localJSONObject1 = new JSONObject();
    while (true)
    {
      JSONObject localJSONObject2;
      try
      {
        localJSONObject2 = new JSONObject();
        localJSONObject2.put("device", Build.MODEL);
        if (this.e != md.a)
          continue;
        JSONObject localJSONObject3 = new JSONObject();
        localJSONObject2.put("params", localJSONObject3);
        localJSONObject2.put("namespace", this.a.b());
        localJSONObject2.put("api_name", this.a.c());
        localJSONObject2.put("api_version", this.a.d());
        this.b = b.a(this.b, this.c);
        localJSONObject3.put("req_data", b.c(paramString, this.b.toString()));
        localJSONObject1.put("data", localJSONObject2);
        return localJSONObject1;
        JSONObject localJSONObject4 = new JSONObject();
        localJSONObject2 = b.a(localJSONObject2, this.c);
        localJSONObject2.put("namespace", this.a.b());
        localJSONObject2.put("api_name", "com.alipay.quickpay");
        localJSONObject2.put("api_version", this.a.d());
        if (this.b != null)
          continue;
        this.b = new JSONObject();
        this.b.put("action", localJSONObject4);
        String[] arrayOfString = this.a.c().split("/");
        localJSONObject4.put("method", arrayOfString[2]);
        localJSONObject4.put("type", arrayOfString[1]);
        if (this.f)
        {
          JSONObject localJSONObject5 = new JSONObject();
          localJSONObject5.put("req_data", b.c(paramString, this.b.toString()));
          localJSONObject2.put("params", localJSONObject5);
          continue;
        }
      }
      catch (Exception localException)
      {
        b.b(localException);
        return localJSONObject1;
      }
      localJSONObject2.put("params", this.b);
    }
  }

  public final void a(a parama)
  {
    this.d = new WeakReference(parama);
  }

  public final void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public final a b()
  {
    return (a)this.d.get();
  }

  public final boolean c()
  {
    return this.f;
  }

  public final md d()
  {
    return this.e;
  }

  public final r e()
  {
    return this.a;
  }

  public final String toString()
  {
    return this.a.toString() + ", requestData = " + b.a(this.b, this.c) + ", timeStamp = 0";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.t
 * JD-Core Version:    0.6.0
 */