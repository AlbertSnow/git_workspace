package com.unionpay.mpay_2.upview;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.unionpay.mpay.utils.e;
import com.unionpay.mpay.widgets.UPPinWidget;
import com.unionpay.mpay.widgets.ad;
import com.unionpay.mpay.widgets.ae;
import com.unionpay.mpay.widgets.af;
import com.unionpay.mpay.widgets.b;
import com.unionpay.mpay.widgets.h;
import com.unionpay.mpay.widgets.l;
import com.unionpay.mpay.widgets.m;
import com.unionpay.mpay.widgets.n;
import com.unionpay.mpay.widgets.n.a;
import com.unionpay.mpay.widgets.q;
import com.unionpay.mpay.widgets.r;
import com.unionpay.mpay.widgets.s;
import com.unionpay.mpay.widgets.u;
import com.unionpay.mpay.widgets.u.a;
import com.unionpay.mpay.widgets.y;
import com.unionpay.mpay.widgets.z;
import com.unionpay.mpay.widgets.z.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends LinearLayout
  implements n.a, u.a, z.a
{
  private Context a = null;
  private ArrayList<m> b = null;
  private int c = 0;
  private a.b d = null;

  public a(Context paramContext, JSONArray paramJSONArray, int paramInt, a.b paramb, String paramString, boolean paramBoolean)
  {
    super(paramContext);
    this.a = paramContext;
    this.c = paramInt;
    this.d = paramb;
    setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    setOrientation(1);
    a(paramJSONArray, paramString, paramBoolean);
  }

  public a(Context paramContext, JSONArray paramJSONArray, a.b paramb)
  {
    this(paramContext, paramJSONArray, -1, paramb, null, true);
  }

  private static m a(List<m> paramList, String paramString)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      if (localm.j().equalsIgnoreCase(paramString))
        return localm;
    }
    return null;
  }

  public final c a(boolean paramBoolean)
  {
    c localc = new c("");
    m localm2;
    if (this.b != null)
    {
      Iterator localIterator = this.b.iterator();
      if (localIterator.hasNext())
      {
        localm2 = (m)localIterator.next();
        if (localm2.c())
          break label100;
        String str3 = com.unionpay.mpay.b.c.ab.P;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localm2.l();
        localc.a(-1, String.format(str3, arrayOfObject2));
      }
    }
    while (true)
    {
      if (localc.a())
        break label146;
      return localc;
      label100: if (localm2.a())
        break;
      String str2 = com.unionpay.mpay.b.c.ab.Q;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localm2.l();
      localc.a(-1, String.format(str2, arrayOfObject1));
    }
    label146: StringBuffer localStringBuffer = new StringBuffer();
    if (this.b != null)
      for (int i = 0; i < this.b.size(); i++)
      {
        m localm1 = (m)this.b.get(i);
        if (((localm1 instanceof q)) || (((localm1 instanceof UPPinWidget)) && (!paramBoolean)))
          continue;
        localStringBuffer.append(",");
        localStringBuffer.append(((m)this.b.get(i)).q());
      }
    String str1 = localStringBuffer.toString();
    if (str1.length() > 1)
      str1 = str1.substring(1);
    localc.a(0, str1);
    return localc;
  }

  public final void a()
  {
    m localm = a(this.b, "pan");
    if (localm != null)
    {
      s locals = (s)localm;
      locals.r();
      locals.s();
    }
  }

  public final void a(h paramh, String paramString)
  {
    boolean bool;
    if (this.d != null)
    {
      if ((paramString != null) && (paramString.length() > 0))
        break label31;
      bool = true;
    }
    while (true)
    {
      this.d.a(bool);
      return;
      label31: if (this.b != null)
      {
        Iterator localIterator = this.b.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            m localm = (m)localIterator.next();
            if ((!(localm instanceof n)) || (((n)localm).a(paramh)) || (((n)localm).c()))
              continue;
            bool = true;
            break;
          }
      }
      bool = false;
    }
  }

  public final void a(m paramm)
  {
    boolean bool = paramm instanceof z;
    if ((this.d == null) || (!bool))
      return;
    d();
    c localc = new c("");
    m localm1 = a(this.b, "mobile");
    m localm2 = a(this.b, "pan");
    m localm3 = a(this.b, "card");
    String str1 = "";
    if (localm2 != null)
    {
      if (localm2.c())
        break label139;
      String str9 = com.unionpay.mpay.b.c.ab.P;
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = localm2.l();
      localc.a(-1, String.format(str9, arrayOfObject4));
    }
    while (!localc.a())
    {
      this.d.a(localc);
      return;
      label139: if (!localm2.a())
      {
        String str8 = com.unionpay.mpay.b.c.ab.Q;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = localm2.l();
        localc.a(-1, String.format(str8, arrayOfObject3));
        continue;
      }
      str1 = str1 + localm2.q();
    }
    if (localm1 != null)
    {
      if (localm1.c())
        break label283;
      String str7 = com.unionpay.mpay.b.c.ab.P;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localm1.l();
      localc.a(-1, String.format(str7, arrayOfObject2));
    }
    while (!localc.a())
    {
      this.d.a(localc);
      return;
      label283: if (!localm1.a())
      {
        String str6 = com.unionpay.mpay.b.c.ab.Q;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localm1.l();
        localc.a(-1, String.format(str6, arrayOfObject1));
        continue;
      }
      StringBuilder localStringBuilder2 = new StringBuilder().append(str1);
      if (str1.length() == 0);
      for (String str4 = ""; ; str4 = ",")
      {
        String str5 = str4;
        str1 = str5 + localm1.q();
        break;
      }
    }
    StringBuilder localStringBuilder1;
    if ((localm3 != null) && (localm3.q().length() > 0))
    {
      localStringBuilder1 = new StringBuilder().append(str1);
      if (str1.length() != 0)
        break label502;
    }
    label502: for (String str2 = ""; ; str2 = ",")
    {
      String str3 = str2;
      str1 = str3 + localm3.q();
      localc.a(0, str1);
      this.d.a(localc);
      return;
    }
  }

  public final void a(String paramString)
  {
    if (this.d != null)
      this.d.b(paramString);
  }

  public final void a(JSONArray paramJSONArray, String paramString, boolean paramBoolean)
  {
    if ((paramJSONArray == null) || (paramJSONArray.length() <= 0))
      return;
    if (this.b == null)
      this.b = new ArrayList(1);
    while (true)
    {
      removeAllViews();
      int i = com.unionpay.mpay.a.a.e;
      int j = com.unionpay.mpay.a.a.B - 4 * com.unionpay.mpay.a.a.e;
      int k = 0;
      Object localObject1 = null;
      Object localObject2 = null;
      label60: if (k >= paramJSONArray.length())
        break;
      try
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(k);
        Context localContext = this.a;
        String str = e.a(localJSONObject, "type");
        if ("pan".equalsIgnoreCase(str));
        label693: for (Object localObject4 = new s(localContext, j, localJSONObject); ; localObject4 = null)
          try
          {
            while (true)
            {
              label117: LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
              try
              {
                localLayoutParams.topMargin = i;
                if (k == -1 + paramJSONArray.length())
                  localLayoutParams.bottomMargin = i;
                localObject1 = localObject4;
                localObject3 = localLayoutParams;
                if (localObject1 != null)
                {
                  if (!(localObject1 instanceof UPPinWidget))
                    break label631;
                  ((UPPinWidget)localObject1).a(this.c);
                  ((UPPinWidget)localObject1).a(paramString);
                  ((UPPinWidget)localObject1).b(paramBoolean);
                }
                while (true)
                {
                  if ((localObject1 instanceof n))
                    ((n)localObject1).a(this);
                  addView(localObject1, (ViewGroup.LayoutParams)localObject3);
                  this.b.add(localObject1);
                  k++;
                  localObject2 = localObject3;
                  break label60;
                  this.b.clear();
                  break;
                  if ("mobile".equalsIgnoreCase(str))
                  {
                    localObject4 = new u(localContext, j, localJSONObject);
                    break label117;
                  }
                  if ("sms".equalsIgnoreCase(str))
                  {
                    localObject4 = new z(localContext, j, localJSONObject, 0);
                    break label117;
                  }
                  if ("cvn2".equalsIgnoreCase(str))
                  {
                    localObject4 = new com.unionpay.mpay.widgets.a(localContext, j, localJSONObject);
                    break label117;
                  }
                  if ("expire".equalsIgnoreCase(str))
                  {
                    localObject4 = new af(localContext, j, localJSONObject);
                    break label117;
                  }
                  if ("pwd".equalsIgnoreCase(str))
                  {
                    localObject4 = new UPPinWidget(localContext, j, localJSONObject);
                    break label117;
                  }
                  if ("text".equalsIgnoreCase(str))
                  {
                    localObject4 = new ad(localContext, j, localJSONObject);
                    break label117;
                  }
                  if ("string".equalsIgnoreCase(str))
                  {
                    localObject4 = new q(localContext, localJSONObject);
                    break label117;
                  }
                  if ("cert_id".equalsIgnoreCase(str))
                  {
                    localObject4 = new b(localContext, j, localJSONObject);
                    break label117;
                  }
                  if ("cert_type".equalsIgnoreCase(str))
                  {
                    localObject4 = new com.unionpay.mpay.widgets.c(localContext, localJSONObject);
                    break label117;
                  }
                  if ("name".equalsIgnoreCase(str))
                  {
                    localObject4 = new r(localContext, j, localJSONObject);
                    break label117;
                  }
                  if ("hidden".equalsIgnoreCase(str))
                  {
                    localObject4 = new l(localContext, localJSONObject);
                    break label117;
                  }
                  if ("user_name".equalsIgnoreCase(str))
                  {
                    localObject4 = new ae(localContext, j, localJSONObject);
                    break label117;
                  }
                  if (!"password".equalsIgnoreCase(str))
                    break label693;
                  localObject4 = new y(localContext, j, localJSONObject);
                  break label117;
                  label631: if ((localObject1 instanceof z))
                  {
                    ((z)localObject1).a(this);
                    continue;
                  }
                  if (!(localObject1 instanceof u))
                    continue;
                  ((u)localObject1).a(this);
                }
              }
              catch (JSONException localJSONException2)
              {
                localObject2 = localLayoutParams;
                localObject1 = localObject4;
              }
            }
          }
          catch (JSONException localJSONException3)
          {
            localObject1 = localObject4;
          }
      }
      catch (JSONException localJSONException1)
      {
        while (true)
          Object localObject3 = localObject2;
      }
    }
  }

  public final c b()
  {
    c localc = new c("");
    m localm = a(this.b, "pin");
    if (localm != null)
    {
      if (localm.c())
        break label75;
      String str2 = com.unionpay.mpay.b.c.ab.P;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localm.l();
      localc.a(-1, String.format(str2, arrayOfObject2));
    }
    while (!localc.a())
    {
      return localc;
      label75: if (localm.a())
        continue;
      String str1 = com.unionpay.mpay.b.c.ab.Q;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localm.l();
      localc.a(-1, String.format(str1, arrayOfObject1));
    }
    localc.a = localm.b();
    return localc;
  }

  public final String b(String paramString)
  {
    m localm = a(this.b, paramString);
    String str = "";
    if (localm != null)
      str = localm.q();
    new StringBuilder(" name:").append(paramString).append(", value:").append(str);
    return str;
  }

  public final c c()
  {
    return a(true);
  }

  public final boolean d()
  {
    if (this.b != null)
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        m localm = (m)localIterator.next();
        if ((!(localm instanceof UPPinWidget)) || (!((UPPinWidget)localm).f()))
          continue;
        ((UPPinWidget)localm).g();
      }
    }
    for (int i = 1; ; i = 0)
    {
      ((InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
      return i;
    }
  }

  public final void e()
  {
    m localm = a(this.b, "sms");
    if (localm != null)
      ((z)localm).d();
  }

  public final boolean f()
  {
    if (this.b != null)
    {
      Iterator localIterator = this.b.iterator();
      m localm;
      do
      {
        if (!localIterator.hasNext())
          break;
        localm = (m)localIterator.next();
      }
      while ((!(localm instanceof n)) || (((n)localm).c()));
    }
    for (int i = 1; i == 0; i = 0)
      return true;
    return false;
  }

  public final void g()
  {
    if ((this.b == null) || (this.b.size() <= 0));
    while (true)
    {
      return;
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        m localm = (m)localIterator.next();
        if ((!(localm instanceof UPPinWidget)) && (!(localm instanceof com.unionpay.mpay.widgets.a)) && (!(localm instanceof af)) && (!(localm instanceof y)))
          continue;
        ((n)localm).t();
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay_2.upview.a
 * JD-Core Version:    0.6.0
 */