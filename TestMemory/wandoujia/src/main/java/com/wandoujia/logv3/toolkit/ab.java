package com.wandoujia.logv3.toolkit;

import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.UrlPackage.Vertical;
import com.wandoujia.logv3.model.packages.ViewLogPackage.IndexPackage;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public final class ab
{
  private String a;
  private ak b;
  private String c;
  private List<BasicNameValuePair> d;
  private UrlPackage.Vertical e;
  private al f;
  private ViewLogPackage.IndexPackage g;
  private ExtraPackage.Builder h;
  private ab i;
  private List<ab> j = new ArrayList();

  public ab()
  {
    this(null, null);
  }

  public ab(String paramString, ab paramab)
  {
    this.a = paramString;
    this.i = paramab;
    this.j = new ArrayList();
  }

  public final List<ab> a()
  {
    return this.j;
  }

  public final void a(ExtraPackage.Builder paramBuilder)
  {
    this.h = paramBuilder;
  }

  public final void a(UrlPackage.Vertical paramVertical)
  {
    this.e = paramVertical;
  }

  public final void a(ViewLogPackage.IndexPackage paramIndexPackage)
  {
    this.g = paramIndexPackage;
  }

  public final void a(ab paramab)
  {
    this.j.add(paramab);
  }

  public final void a(ak paramak)
  {
    this.b = paramak;
  }

  public final void a(al paramal)
  {
    this.f = paramal;
  }

  public final void a(String paramString)
  {
    this.c = paramString;
  }

  public final void a(List<BasicNameValuePair> paramList)
  {
    this.d = paramList;
  }

  public final String b()
  {
    return this.a;
  }

  public final ak c()
  {
    return this.b;
  }

  public final String d()
  {
    return this.c;
  }

  public final List<BasicNameValuePair> e()
  {
    return this.d;
  }

  public final ab f()
  {
    return this.i;
  }

  public final al g()
  {
    return this.f;
  }

  public final ExtraPackage.Builder h()
  {
    return this.h;
  }

  public final ViewLogPackage.IndexPackage i()
  {
    return this.g;
  }

  public final UrlPackage.Vertical j()
  {
    return this.e;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.ab
 * JD-Core Version:    0.6.0
 */