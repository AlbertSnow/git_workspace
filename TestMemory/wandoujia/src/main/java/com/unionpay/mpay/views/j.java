package com.unionpay.mpay.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Environment;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.utils.UPPayEngine;
import com.unionpay.mpay.utils.e;
import com.unionpay.mpay.utils.n;
import com.unionpay.mpay.utils.n.a;
import com.unionpay.mpay.widgets.k;
import com.unionpay.uppay.PayActivityEx;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j extends b
  implements n.a
{
  public List<com.unionpay.pboctransaction.model.b> l = null;
  private ProgressBar m = null;
  private String n = null;
  private int o = 0;
  private volatile int p = 0;
  private List<com.unionpay.pboctransaction.model.b> q = null;

  public j(Context paramContext)
  {
    super(paramContext);
    this.f = 1;
    d();
    Activity localActivity = (Activity)paramContext;
    boolean bool1 = com.tencent.open.yyb.a.a(localActivity.getIntent(), this.a);
    this.a.Z = new com.unionpay.pboc.engine.b(this.d, new ah(this), "00".equalsIgnoreCase(this.a.x.c));
    this.e.a();
    boolean bool2 = this.a.x.c.equalsIgnoreCase("00");
    boolean bool3 = false;
    if (!bool2)
      bool3 = true;
    int i = this.e.initJNIEnv(localActivity, bool3, this.a.x.d);
    if ((bool1) && (i != 0) && (i != -1))
    {
      this.o = 1;
      this.e.a(i);
      this.e.c(this.a.a);
      this.e.a(this);
    }
    do
    {
      return;
      if (i != -1)
        continue;
      b(7, null);
      return;
    }
    while (bool1);
    b(5, null);
  }

  private void a(String paramString1, String paramString2, String paramString3)
  {
    af localaf = new af(this, paramString3);
    ag localag = new ag(this);
    if (paramString1.equalsIgnoreCase("01"));
    for (int i = 0; i != 0; i = 1)
    {
      this.b.a(localaf, localag);
      this.b.a(com.unionpay.mpay.b.c.ab.I, paramString2, com.unionpay.mpay.b.c.ab.J, com.unionpay.mpay.b.c.ab.K);
      return;
    }
    this.b.a(localaf, localag);
    this.b.a(com.unionpay.mpay.b.c.ab.E, paramString2, com.unionpay.mpay.b.c.ab.J, com.unionpay.mpay.b.c.ab.K);
  }

  private void b(int paramInt, String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
      this.a.x.e = paramString;
    this.m.setVisibility(4);
    a(d(paramInt), true);
  }

  private final void n()
  {
    monitorenter;
    while (true)
    {
      try
      {
        new StringBuilder("showContentView() +++").append(this.p);
        int i = this.p;
        if (i != 2)
          return;
        if ("1".equalsIgnoreCase(this.a.W))
        {
          this.a.h = this.q;
          if ((!"0".equalsIgnoreCase(this.a.W)) || ((this.a.h != null) && (this.a.h.size() > 0)))
            break label329;
          String str = this.a.Y;
          if ("fail".length() <= 0)
            continue;
          this.a.x.e = "fail";
          this.m.setVisibility(4);
          a(str, true);
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      if ("0".equalsIgnoreCase(this.a.W))
        this.a.h = this.l;
      while (true)
      {
        int j = this.a.X;
        Iterator localIterator = this.a.h.iterator();
        while (localIterator.hasNext())
        {
          com.unionpay.pboctransaction.model.b localb = (com.unionpay.pboctransaction.model.b)localIterator.next();
          if ((localb.d() == 0) || ((j & localb.d()) != 0))
            continue;
          localIterator.remove();
        }
        break;
        if ((this.l != null) && (this.l.size() > 0))
          this.a.h.addAll(this.l);
        if ((this.q == null) || (this.q.size() <= 0))
          continue;
        this.a.h.addAll(this.q);
      }
      label329: e(2);
    }
  }

  public final void a(int paramInt, byte[] paramArrayOfByte)
  {
    h();
    if (paramInt != 0)
      b(paramInt, null);
    if (paramArrayOfByte != null)
    {
      boolean bool = "mounted".equals(Environment.getExternalStorageState());
      int i = 0;
      if (bool)
        i = 1;
      if (i != 0)
        break label50;
      b(9, null);
    }
    label50: 
    do
      return;
    while (android.support.v4.app.b.e(paramArrayOfByte) != true);
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setDataAndType(Uri.fromFile(new File(Environment.getExternalStorageDirectory() + File.separator + "UPPay" + File.separator + "UPPayPluginEx.apk")), "application/vnd.android.package-archive");
    ((PayActivityEx)this.d).startActivityForResult(localIntent, 100);
  }

  public final void a(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      c(2);
      return;
    }
    switch (this.o)
    {
    default:
    case 1:
    }
    while (true)
    {
      this.o = 0;
      return;
      String str1 = e.a(paramJSONObject, "secret");
      e.a(paramJSONObject, "sec_sign");
      this.e.b(str1);
      JSONObject localJSONObject = e.b(paramJSONObject, "upgrade_info");
      this.n = e.a(localJSONObject, "type");
      String str2 = e.a(localJSONObject, "desc");
      String str3 = e.a(localJSONObject, "url");
      if (this.n.equalsIgnoreCase("02"))
      {
        a(this.n, str2, str3);
        continue;
      }
      this.a.f = e.a(paramJSONObject, "title");
      this.a.e = e.b(paramJSONObject, "init_button");
      this.a.c = e.c(paramJSONObject, "order");
      this.a.d = e.b(paramJSONObject, "risk_info");
      List localList = e.d(paramJSONObject, "cards");
      if (localList.size() > 0)
        this.q = new ArrayList(localList.size());
      for (int i = 0; i < localList.size(); i++)
      {
        com.unionpay.pboctransaction.model.a locala = new com.unionpay.pboctransaction.model.a(e.a((JSONArray)localList.get(i), 0), e.a((JSONArray)localList.get(i), 1), e.a((JSONArray)localList.get(i), 2), 0);
        this.q.add(locala);
      }
      this.a.j = e.a(paramJSONObject, "bank_url");
      this.a.k = e.c(paramJSONObject, "input_info");
      this.a.m = e.b(paramJSONObject, "account_info");
      this.a.n = e.b(paramJSONObject, "other_card_info");
      this.a.l = e.a(paramJSONObject, "user_id");
      this.a.W = e.a(paramJSONObject, "trade_privilege");
      this.a.Y = e.a(paramJSONObject, "upcard_msg");
      this.a.X = 0;
      String str4 = e.a(paramJSONObject, "upcard_support_type");
      if ((!"1".equalsIgnoreCase(this.a.W)) && (str4 != null) && (str4.length() > 0))
        this.a.X = Integer.parseInt(str4, 2);
      this.e.a(e.a(paramJSONObject, "sid"));
      String str5 = e.a(paramJSONObject, "uid");
      SharedPreferences.Editor localEditor = this.d.getSharedPreferences("UnionPayPluginEx.pref", 3).edit();
      localEditor.putString("uid", str5);
      localEditor.commit();
      if (!this.n.equalsIgnoreCase("00"))
      {
        a(this.n, str2, str3);
        continue;
      }
      m();
    }
  }

  public final void b(String paramString)
  {
    this.b.a(com.unionpay.mpay.b.c.ab.B);
    new Thread(new n(paramString, this)).start();
  }

  public final void c()
  {
  }

  public final void c(int paramInt)
  {
    new StringBuilder().append(toString()).append("doErrHappended() +++");
    b(paramInt, "fail");
    new StringBuilder().append(toString()).append("doErrHappended() ---");
  }

  protected final void d()
  {
    super.d();
    this.j.setBackgroundColor(-1);
    setBackgroundDrawable(this.c.a(3008, -1, -1));
    int i = com.unionpay.mpay.a.a.B / 2;
    ImageView localImageView = new ImageView(getContext());
    localImageView.setImageDrawable(this.c.a(1032, i, -1));
    localImageView.setId(localImageView.hashCode());
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(i, -2);
    localLayoutParams1.addRule(14);
    localLayoutParams1.leftMargin = com.unionpay.mpay.a.a.h;
    localLayoutParams1.topMargin = (int)(0.3F * com.unionpay.mpay.a.a.n);
    addView(localImageView, localLayoutParams1);
    this.m = new ProgressBar(getContext(), null, 16843399);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.addRule(14, -1);
    localLayoutParams2.addRule(3, localImageView.getId());
    localLayoutParams2.topMargin = (3 * com.unionpay.mpay.a.a.c);
    addView(this.m, localLayoutParams2);
    LinearLayout localLinearLayout = new LinearLayout(this.d);
    localLinearLayout.setOrientation(1);
    RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams3.addRule(14, -1);
    localLayoutParams3.addRule(12, -1);
    localLayoutParams3.bottomMargin = com.unionpay.mpay.a.a.a;
    addView(localLinearLayout, localLayoutParams3);
    TextView localTextView1 = new TextView(this.d);
    localTextView1.setText(com.unionpay.mpay.b.c.ab.a);
    localTextView1.setTextColor(-1);
    localTextView1.setTextSize(14.0F);
    localTextView1.setGravity(1);
    new LinearLayout.LayoutParams(-2, -2).gravity = 14;
    localLinearLayout.addView(localTextView1, localLayoutParams3);
    TextView localTextView2 = new TextView(getContext());
    localTextView2.setText(com.unionpay.mpay.b.c.ab.b);
    localTextView2.setTextColor(-1);
    localTextView2.setTextSize(16.0F);
    localTextView2.setGravity(1);
    new LinearLayout.LayoutParams(-2, -2).gravity = 14;
    localLinearLayout.addView(localTextView2, localLayoutParams3);
  }

  public final void m()
  {
    if (this.n.equalsIgnoreCase("02"))
    {
      i();
      return;
    }
    this.p = (1 + this.p);
    n();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.j
 * JD-Core Version:    0.6.0
 */