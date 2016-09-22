package com.unionpay.mpay.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Spinner;
import com.unionpay.mpay.a.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class c extends m
{
  private static ArrayList<String> h;
  private Spinner e = null;
  private ArrayAdapter<String> f = null;
  private int g = 0;
  private AdapterView.OnItemSelectedListener i = new j(this);

  static
  {
    ArrayList localArrayList = new ArrayList(8);
    localArrayList.add("01");
    localArrayList.add("02");
    localArrayList.add("03");
    localArrayList.add("04");
    localArrayList.add("05");
    localArrayList.add("06");
    localArrayList.add("07");
    localArrayList.add("99");
    h = localArrayList;
  }

  public c(Context paramContext, JSONObject paramJSONObject)
  {
    super(paramContext, paramJSONObject);
    RelativeLayout localRelativeLayout = this.d;
    this.e = new Spinner(this.a);
    Context localContext = this.a;
    ArrayList localArrayList = new ArrayList(8);
    localArrayList.add(com.unionpay.mpay.b.c.ab.t);
    localArrayList.add(com.unionpay.mpay.b.c.ab.u);
    localArrayList.add(com.unionpay.mpay.b.c.ab.v);
    localArrayList.add(com.unionpay.mpay.b.c.ab.w);
    localArrayList.add(com.unionpay.mpay.b.c.ab.x);
    localArrayList.add(com.unionpay.mpay.b.c.ab.y);
    localArrayList.add(com.unionpay.mpay.b.c.ab.z);
    localArrayList.add(com.unionpay.mpay.b.c.ab.A);
    this.f = new ArrayAdapter(localContext, j, localArrayList);
    if (this.b);
    while (true)
    {
      this.f.setDropDownViewResource(j);
      this.e.setAdapter(this.f);
      Drawable localDrawable = com.unionpay.mpay.c.c.a(this.a).a(2015, -1, -1);
      this.e.setBackgroundDrawable(localDrawable);
      this.e.setOnItemSelectedListener(this.i);
      if (this.b)
      {
        this.e.setEnabled(false);
        this.e.setClickable(false);
        this.e.setFocusable(false);
      }
      int k = b(m());
      this.e.setSelection(k);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, a.t);
      localLayoutParams.addRule(11, -1);
      localLayoutParams.addRule(15, -1);
      localRelativeLayout.addView(this.e, localLayoutParams);
      return;
      j = 17367049;
    }
  }

  private static int b(String paramString)
  {
    int j = 0;
    if (paramString != null)
    {
      int k = paramString.length();
      j = 0;
      if (k != 2);
    }
    for (int m = 0; ; m++)
    {
      int n = h.size();
      j = 0;
      if (m < n)
      {
        if (!((String)h.get(m)).equalsIgnoreCase(paramString))
          continue;
        j = m;
      }
      return j;
    }
  }

  public final boolean a()
  {
    return true;
  }

  public final String b()
  {
    String str = "";
    if ((this.g >= 0) && (this.g <= h.size()))
      str = (String)h.get(this.g);
    return str;
  }

  public final boolean c()
  {
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.c
 * JD-Core Version:    0.6.0
 */