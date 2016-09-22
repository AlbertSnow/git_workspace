package com.wandoujia.ripple_framework.model;

import android.text.TextUtils;
import com.android.volley.j;
import com.android.volley.k;
import com.wandoujia.api.proto.HttpResponse;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.nirvana.framework.network.c;
import com.wandoujia.nirvana.framework.network.page.PageList;
import com.wandoujia.nirvana.framework.network.page.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class g extends PageList<HttpResponse, Model>
{
  protected final Map<String, String> b;
  private String c;
  private String d;
  private boolean e;
  private c f;
  private String[] g;

  public g(String paramString, e<Model> parame)
  {
    this(paramString, parame, null);
  }

  public g(String paramString, e<Model> parame, Map<String, String> paramMap)
  {
    super(parame);
    this.d = paramString;
    this.c = paramString;
    this.b = new HashMap();
    this.e = true;
    if (paramMap != null)
    {
      this.b.putAll(paramMap);
      a(this.b);
    }
  }

  private void a(Map<String, String> paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      this.c = (this.c + "#" + (String)localEntry.getKey() + ":" + (String)localEntry.getValue());
    }
  }

  protected com.wandoujia.nirvana.framework.network.b<HttpResponse> a(HttpResponse paramHttpResponse, k<HttpResponse> paramk, j paramj)
  {
    if (paramHttpResponse == null);
    for (String str = this.d; TextUtils.isEmpty(str); str = paramHttpResponse.next_url)
      return null;
    com.wandoujia.ripple_framework.a.b localb = new com.wandoujia.ripple_framework.a.b(str, this.b, HttpResponse.class, paramk, paramj, 0);
    if ((this.e) && (paramHttpResponse == null))
    {
      localb.a(true);
      localb.b(true);
      if (this.f == null)
        this.f = new c();
      localb.a(this.f);
      localb.a(this.g);
      return localb;
    }
    localb.a(false);
    localb.b(false);
    return localb;
  }

  public final String a()
  {
    return this.c;
  }

  public final void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }

  public final void a(String[] paramArrayOfString)
  {
    this.g = paramArrayOfString;
  }

  public final boolean m()
  {
    if (!super.m())
    {
      if (c().size() != 1)
        break label50;
      if (((Model)a(0)).g() != TemplateTypeEnum.TemplateType.END)
        break label45;
    }
    label45: for (int i = 1; i != 0; i = 0)
      return true;
    label50: return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.model.g
 * JD-Core Version:    0.6.0
 */