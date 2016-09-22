package com.alipay.wandoujia;

import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  private u a;
  private JSONObject b;
  private WeakReference c;
  private boolean d = false;
  private JSONObject e;
  private long f;

  protected f(a parama)
  {
    this.c = new WeakReference(parama);
    this.e = new JSONObject();
  }

  protected final t a()
  {
    u localu = this.a;
    t localt = null;
    JSONObject localJSONObject1;
    if (localu != null)
    {
      localJSONObject1 = this.a.c();
      if ((this.b == null) || (!this.d))
        break label152;
    }
    label152: for (JSONObject localJSONObject2 = this.b; ; localJSONObject2 = null)
    {
      com.wandoujia.clean.b.a locala = ((a)this.c.get()).m$24af20d5();
      ac localac = ac.e();
      if (localJSONObject2 == null);
      while (true)
      {
        try
        {
          localJSONObject3 = new JSONObject();
          if (localac == null)
            continue;
        }
        catch (JSONException localJSONException2)
        {
          try
          {
            localJSONObject3.put("tid", localac.a());
            localt = new t(this.a.a, localJSONObject3, localJSONObject1, locala, this.a.j());
            localt.a(this.a.b());
            return localt;
            localJSONException2 = localJSONException2;
            localJSONObject3 = localJSONObject2;
            continue;
          }
          catch (JSONException localJSONException1)
          {
            continue;
          }
        }
        JSONObject localJSONObject3 = localJSONObject2;
      }
    }
  }

  protected final void a(ae paramae)
  {
    if (((paramae instanceof ai)) && (((ai)paramae).e()))
      c();
    b(paramae);
  }

  public final void a(JSONObject paramJSONObject)
  {
    this.b = paramJSONObject;
  }

  protected final void b()
  {
    c();
  }

  protected final void b(ae paramae)
  {
    this.a = paramae.b();
    this.d = (paramae instanceof ai);
    this.b = null;
  }

  protected final void c()
  {
    this.a = null;
    this.b = null;
    ((a)this.c.get()).m$24af20d5().d();
  }

  public final JSONObject d()
  {
    return this.e;
  }

  public final u e()
  {
    return this.a;
  }

  public final void f()
  {
    this.f = System.currentTimeMillis();
  }

  public final long g()
  {
    return this.f;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.f
 * JD-Core Version:    0.6.0
 */