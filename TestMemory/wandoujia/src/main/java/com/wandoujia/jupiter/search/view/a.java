package com.wandoujia.jupiter.search.view;

import android.content.Context;
import android.widget.TextView;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.j;
import com.wandoujia.jupiter.p;
import com.wandoujia.jupiter.search.model.SearchTypeForHint;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

public final class a
{
  private Context a;
  private TextView b;
  private int c = 0;
  private boolean d;
  private Timer e;
  private boolean f;
  private String g;

  public a(Context paramContext, TextView paramTextView, boolean paramBoolean)
  {
    this.a = paramContext;
    this.b = paramTextView;
    this.f = paramBoolean;
  }

  private void a(Collection<String> paramCollection)
  {
    if (CollectionUtils.isEmpty(paramCollection))
      a(d(), false);
    String[] arrayOfString;
    do
    {
      return;
      arrayOfString = (String[])paramCollection.toArray(new String[paramCollection.size()]);
    }
    while ((arrayOfString == null) || (arrayOfString.length == 0));
    if (arrayOfString.length > 1);
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
        break label112;
      c localc = new c(this, arrayOfString);
      if (this.e != null)
        break;
      this.e = new Timer();
      this.e.schedule(new d(localc), 0L, 3000L);
      return;
    }
    label112: a(arrayOfString[0], true);
  }

  private String d()
  {
    try
    {
      String str = this.a.getString(2131625353);
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  public final void a(SearchTypeForHint paramSearchTypeForHint)
  {
    a(j.a().i().a(paramSearchTypeForHint));
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramSearchTypeForHint.getPattern());
    String str = String.format("http://apis.wandoujia.com/five/v1/search/hint?format=proto&pattern=%d", arrayOfObject);
    HashMap localHashMap = new HashMap();
    localHashMap.put("timestamp", Long.toString(System.currentTimeMillis()));
    p localp = new p(str, localHashMap);
    localp.a(new String[] { "timestamp" });
    localp.a(new b(this, paramSearchTypeForHint));
    localp.i();
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    this.d = paramBoolean;
    this.b.setHint(paramString);
  }

  public final boolean a()
  {
    return this.d;
  }

  public final String b()
  {
    return this.g;
  }

  public final void c()
  {
    if (this.e != null)
    {
      this.e.cancel();
      this.e = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.view.a
 * JD-Core Version:    0.6.0
 */