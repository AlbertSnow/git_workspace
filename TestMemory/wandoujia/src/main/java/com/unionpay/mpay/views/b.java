package com.unionpay.mpay.views;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import com.unionpay.mpay.utils.UPPayEngine;
import com.unionpay.mpay.utils.UPPayEngine.a;
import com.unionpay.mpay.widgets.UPPinWidget;
import com.unionpay.mpay.widgets.ac;
import com.unionpay.mpay.widgets.ad;
import com.unionpay.mpay.widgets.ae;
import com.unionpay.mpay.widgets.af;
import com.unionpay.mpay.widgets.g;
import com.unionpay.mpay.widgets.h;
import com.unionpay.mpay.widgets.k;
import com.unionpay.mpay.widgets.l;
import com.unionpay.mpay.widgets.m;
import com.unionpay.mpay.widgets.n.a;
import com.unionpay.mpay.widgets.q;
import com.unionpay.mpay.widgets.r;
import com.unionpay.mpay.widgets.u;
import com.unionpay.uppay.PayActivityEx;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class b extends RelativeLayout
  implements UPPayEngine.a, a, n.a
{
  protected com.unionpay.uppay.b a = null;
  protected k b = null;
  protected com.unionpay.mpay.c.c c = null;
  protected Context d = null;
  protected UPPayEngine e = null;
  protected int f = 0;
  protected boolean g = true;
  protected RelativeLayout h = null;
  protected ViewGroup i = null;
  protected RelativeLayout j = null;
  protected ac k = null;
  private String l = null;
  private String m = null;

  public b(Context paramContext)
  {
    super(paramContext);
    this.d = paramContext;
    this.e = ((UPPayEngine)((PayActivityEx)paramContext).a(UPPayEngine.class.toString()));
    this.a = ((com.unionpay.uppay.b)((PayActivityEx)paramContext).a(null));
    this.b = ((k)((PayActivityEx)paramContext).a(k.class.toString()));
    this.c = com.unionpay.mpay.c.c.a(paramContext);
    setId(8888);
    setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    setBackgroundColor(-1);
    new StringBuilder("UPViewBase:").append(toString());
  }

  private final RelativeLayout m()
  {
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
    if (this.h != null)
    {
      localLayoutParams1.addRule(3, this.h.getId());
      localLayoutParams1.bottomMargin = com.unionpay.mpay.a.a.a;
      localLayoutParams1.addRule(12, -1);
    }
    ScrollView localScrollView = new ScrollView(this.d);
    addView(localScrollView, localLayoutParams1);
    RelativeLayout localRelativeLayout = new RelativeLayout(this.d);
    localRelativeLayout.setBackgroundColor(-66566);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams2.addRule(9, -1);
    localLayoutParams2.addRule(11, -1);
    localScrollView.addView(localRelativeLayout, localLayoutParams2);
    return localRelativeLayout;
  }

  protected void a()
  {
  }

  protected void a(int paramInt)
  {
    int n = 2;
    JSONArray localJSONArray = this.a.c;
    if (localJSONArray == null)
      return;
    if (paramInt == 0)
      if (localJSONArray.length() >= n)
      {
        LinearLayout localLinearLayout2 = android.support.v4.app.b.a(this.d, localJSONArray, 0, n);
        LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        localLayoutParams3.topMargin = com.unionpay.mpay.a.a.c;
        this.i.addView(localLinearLayout2, localLayoutParams3);
      }
    while (true)
    {
      int i1 = this.a.c.length();
      LinearLayout localLinearLayout1 = android.support.v4.app.b.a(this.d, localJSONArray, n, i1);
      if (this.a.d != null)
      {
        g localg = new g(this.d, -4731932);
        LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, com.unionpay.mpay.a.a.A);
        int i2 = com.unionpay.mpay.a.a.b;
        localLayoutParams1.setMargins(i2, i2, i2, i2);
        localLinearLayout1.addView(localg, localLayoutParams1);
        localLinearLayout1.addView(new q(this.d, this.a.d));
      }
      localLinearLayout1.setVisibility(8);
      LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
      if (paramInt == 1)
        localLayoutParams2.topMargin = com.unionpay.mpay.a.a.c;
      this.i.addView(localLinearLayout1, localLayoutParams2);
      this.k = new ac(this.d);
      this.i.addView(this.k);
      this.i.setOnClickListener(new y(this, localLinearLayout1));
      return;
      n = localJSONArray.length();
      break;
      n = 0;
    }
  }

  // ERROR //
  public final void a(int paramInt, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield 54	com/unionpay/mpay/views/b:g	Z
    //   5: new 104	java/lang/StringBuilder
    //   8: dup
    //   9: ldc 216
    //   11: invokespecial 109	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: invokevirtual 112	java/lang/Object:toString	()Ljava/lang/String;
    //   18: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: pop
    //   22: iload_1
    //   23: ifne +158 -> 181
    //   26: aconst_null
    //   27: astore 4
    //   29: aload_2
    //   30: ifnull +10 -> 40
    //   33: aload_2
    //   34: invokevirtual 219	java/lang/String:length	()I
    //   37: ifne +29 -> 66
    //   40: iconst_2
    //   41: istore 5
    //   43: iload 5
    //   45: ifeq +129 -> 174
    //   48: aload_0
    //   49: aload_0
    //   50: getfield 52	com/unionpay/mpay/views/b:m	Ljava/lang/String;
    //   53: invokevirtual 222	com/unionpay/mpay/views/b:a	(Ljava/lang/String;)Z
    //   56: ifne +9 -> 65
    //   59: aload_0
    //   60: iload 5
    //   62: invokevirtual 224	com/unionpay/mpay/views/b:c	(I)V
    //   65: return
    //   66: new 226	org/json/JSONObject
    //   69: dup
    //   70: aload_2
    //   71: invokespecial 227	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   74: astore 6
    //   76: aload_0
    //   77: aload 6
    //   79: ldc 229
    //   81: invokestatic 234	com/unionpay/mpay/utils/e:a	(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   84: putfield 50	com/unionpay/mpay/views/b:l	Ljava/lang/String;
    //   87: aload_0
    //   88: aload 6
    //   90: ldc 236
    //   92: invokestatic 234	com/unionpay/mpay/utils/e:a	(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   95: putfield 52	com/unionpay/mpay/views/b:m	Ljava/lang/String;
    //   98: aload 6
    //   100: ldc 238
    //   102: invokestatic 241	com/unionpay/mpay/utils/e:b	(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    //   105: astore 9
    //   107: aload 9
    //   109: astore 4
    //   111: aload_0
    //   112: getfield 50	com/unionpay/mpay/views/b:l	Ljava/lang/String;
    //   115: ldc 243
    //   117: invokevirtual 246	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   120: istore 11
    //   122: iconst_0
    //   123: istore 5
    //   125: iload 11
    //   127: ifne -84 -> 43
    //   130: aload_0
    //   131: getfield 50	com/unionpay/mpay/views/b:l	Ljava/lang/String;
    //   134: ldc 248
    //   136: invokevirtual 246	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   139: istore 12
    //   141: iload 12
    //   143: ifeq +10 -> 153
    //   146: bipush 17
    //   148: istore 5
    //   150: goto -107 -> 43
    //   153: iconst_3
    //   154: istore 5
    //   156: goto -113 -> 43
    //   159: astore 7
    //   161: aconst_null
    //   162: astore 8
    //   164: aload 8
    //   166: astore 4
    //   168: iconst_2
    //   169: istore 5
    //   171: goto -128 -> 43
    //   174: aload_0
    //   175: aload 4
    //   177: invokevirtual 251	com/unionpay/mpay/views/b:a	(Lorg/json/JSONObject;)V
    //   180: return
    //   181: aload_0
    //   182: iload_1
    //   183: invokevirtual 224	com/unionpay/mpay/views/b:c	(I)V
    //   186: return
    //   187: astore 10
    //   189: aload 4
    //   191: astore 8
    //   193: goto -29 -> 164
    //
    // Exception table:
    //   from	to	target	type
    //   66	107	159	org/json/JSONException
    //   111	122	187	org/json/JSONException
    //   130	141	187	org/json/JSONException
  }

  public final void a(h paramh, String paramString)
  {
  }

  protected final void a(String paramString1, String paramString2)
  {
    this.a.R = paramString2;
    this.a.Q = paramString1;
    e(14);
  }

  protected final void a(String paramString, boolean paramBoolean)
  {
    z localz = new z(this, paramBoolean);
    this.b.a(localz, null);
    this.b.a(com.unionpay.mpay.b.c.ab.E, paramString, com.unionpay.mpay.b.c.ab.C);
  }

  protected boolean a(String paramString)
  {
    return false;
  }

  protected final m b(JSONObject paramJSONObject)
  {
    String str = com.unionpay.mpay.utils.e.a(paramJSONObject, "type");
    int n = com.unionpay.mpay.a.a.B - 4 * com.unionpay.mpay.a.a.e;
    Object localObject;
    if ("pan".equalsIgnoreCase(str))
      localObject = new com.unionpay.mpay.widgets.s(this.d, n, paramJSONObject);
    while (true)
    {
      if ((localObject != null) && ((localObject instanceof com.unionpay.mpay.widgets.n)))
        ((com.unionpay.mpay.widgets.n)localObject).a(this);
      return localObject;
      if ("mobile".equalsIgnoreCase(str))
      {
        localObject = new u(this.d, n, paramJSONObject);
        continue;
      }
      if ("sms".equalsIgnoreCase(str))
      {
        localObject = new com.unionpay.mpay.widgets.z(this.d, n, paramJSONObject);
        continue;
      }
      if ("cvn2".equalsIgnoreCase(str))
      {
        localObject = new com.unionpay.mpay.widgets.a(this.d, n, paramJSONObject);
        continue;
      }
      if ("expire".equalsIgnoreCase(str))
      {
        localObject = new af(this.d, n, paramJSONObject);
        continue;
      }
      if ("pwd".equalsIgnoreCase(str))
      {
        localObject = new UPPinWidget(this.d, this.e.b(), n, paramJSONObject);
        continue;
      }
      if ("text".equalsIgnoreCase(str))
      {
        localObject = new ad(this.d, n, paramJSONObject);
        continue;
      }
      if ("string".equalsIgnoreCase(str))
      {
        localObject = new q(this.d, paramJSONObject);
        continue;
      }
      if ("cert_id".equalsIgnoreCase(str))
      {
        localObject = new com.unionpay.mpay.widgets.b(this.d, n, paramJSONObject);
        continue;
      }
      if ("cert_type".equalsIgnoreCase(str))
      {
        localObject = new com.unionpay.mpay.widgets.c(this.d, paramJSONObject);
        continue;
      }
      if ("name".equalsIgnoreCase(str))
      {
        localObject = new r(this.d, n, paramJSONObject);
        continue;
      }
      if ("hidden".equalsIgnoreCase(str))
      {
        localObject = new l(this.d, paramJSONObject);
        continue;
      }
      if ("user_name".equalsIgnoreCase(str))
      {
        localObject = new ae(this.d, n, paramJSONObject);
        continue;
      }
      boolean bool = "password".equalsIgnoreCase(str);
      localObject = null;
      if (!bool)
        continue;
      localObject = new com.unionpay.mpay.widgets.y(this.d, n, paramJSONObject);
    }
  }

  protected void b()
  {
  }

  protected final void b(int paramInt)
  {
    this.h = e();
    b();
    RelativeLayout localRelativeLayout1 = m();
    LinearLayout localLinearLayout = new LinearLayout(this.d);
    localLinearLayout.setOrientation(1);
    localLinearLayout.setId(localLinearLayout.hashCode());
    localLinearLayout.setBackgroundColor(-1114114);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams1.addRule(10, -1);
    localRelativeLayout1.addView(localLinearLayout, localLayoutParams1);
    this.i = localLinearLayout;
    this.i.setBackgroundColor(-1114114);
    a(paramInt);
    int n = this.i.getId();
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams2.bottomMargin = com.unionpay.mpay.a.a.a;
    localLayoutParams2.addRule(12, -1);
    localLayoutParams2.addRule(3, n);
    RelativeLayout localRelativeLayout2 = new RelativeLayout(this.d);
    int i1 = com.unionpay.mpay.a.a.a;
    localRelativeLayout2.setPadding(i1, 0, i1, 0);
    localRelativeLayout1.addView(localRelativeLayout2, localLayoutParams2);
    this.j = localRelativeLayout2;
    a();
  }

  public void c()
  {
    if (this.g)
      k();
  }

  public void c(int paramInt)
  {
    if ((paramInt == 8) || (paramInt == 17) || (paramInt == 19))
    {
      this.a.x.e = "fail";
      a(d(paramInt), true);
      return;
    }
    a(d(paramInt), false);
  }

  protected final void c(String paramString)
  {
    a(paramString, false);
  }

  protected final String d(int paramInt)
  {
    switch (paramInt)
    {
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    default:
      return com.unionpay.mpay.b.c.ab.N;
    case 2:
      return com.unionpay.mpay.b.c.ab.O;
    case 7:
      return com.unionpay.mpay.b.c.ab.S;
    case 5:
      return com.unionpay.mpay.b.c.ab.T;
    case 6:
      return com.unionpay.mpay.b.c.ab.U;
    case 4:
      return com.unionpay.mpay.b.c.ab.M;
    case 8:
      return com.unionpay.mpay.b.c.ab.V;
    case 9:
      return com.unionpay.mpay.b.c.ab.W;
    case 16:
      return com.unionpay.mpay.b.c.ab.X;
    case 19:
      return com.unionpay.mpay.b.c.ab.Y;
    case 20:
      return com.unionpay.mpay.b.c.ab.Z;
    case 18:
      return com.unionpay.mpay.b.c.ab.aa;
    case 3:
    case 17:
    }
    return this.m;
  }

  protected void d()
  {
    this.j = m();
  }

  protected final RelativeLayout e()
  {
    RelativeLayout localRelativeLayout = new RelativeLayout(getContext());
    localRelativeLayout.setId(localRelativeLayout.hashCode());
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(10, -1);
    addView(localRelativeLayout, localLayoutParams);
    return localRelativeLayout;
  }

  protected final void e(int paramInt)
  {
    PayActivityEx localPayActivityEx = (PayActivityEx)this.d;
    Object localObject = null;
    switch (paramInt)
    {
    case 3:
    case 4:
    case 7:
    case 9:
    default:
    case 2:
    case 6:
    case 8:
    case 5:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    }
    while (true)
    {
      if (localObject != null)
        localPayActivityEx.a((b)localObject);
      return;
      localObject = new ab(this.d);
      continue;
      List localList = this.a.h;
      int n = 0;
      if (localList != null)
      {
        int i1 = this.a.h.size();
        n = 0;
        if (i1 > 0)
          n = ((com.unionpay.pboctransaction.model.b)this.a.h.get(this.a.B)).d();
      }
      if ((g()) || (n == 0))
      {
        localObject = new aj(this.d);
        continue;
      }
      localObject = new com.unionpay.mpay.se.a(this.d);
      continue;
      localObject = new ao(this.d);
      continue;
      localObject = new e(this.d);
      continue;
      localObject = new x(this.d);
      continue;
      localObject = new v(this.d);
      continue;
      localObject = new s(this.d);
      continue;
      localObject = new n(this.d);
      continue;
      localObject = new at(this.d);
    }
  }

  public final int f()
  {
    return this.f;
  }

  protected final boolean g()
  {
    return (this.a.y) || (this.a.h == null) || (this.a.h.size() == 0);
  }

  protected final void h()
  {
    if ((this.b != null) && (this.b.a()))
      this.b.c();
  }

  public final void i()
  {
    com.unionpay.mpay.utils.a.a(this.d, this.a);
  }

  public final void j()
  {
    ((PayActivityEx)this.d).b();
  }

  public final void k()
  {
    ((PayActivityEx)this.d).a();
  }

  protected final boolean l()
  {
    k localk = this.b;
    int n = 0;
    if (localk != null)
    {
      boolean bool = this.b.a();
      n = 0;
      if (bool)
        n = 1;
    }
    return n;
  }

  protected void onAttachedToWindow()
  {
    new StringBuilder().append(toString()).append(" onAttachedToWindow()");
    super.onAttachedToWindow();
    this.e.a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.b
 * JD-Core Version:    0.6.0
 */