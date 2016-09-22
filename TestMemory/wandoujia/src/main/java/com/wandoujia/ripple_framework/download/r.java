package com.wandoujia.ripple_framework.download;

import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.download2.DownloadRequestParam.Type;
import com.wandoujia.logv3.model.packages.DownloadPackage.VerifyType;
import com.wandoujia.logv3.model.packages.UrlPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;

public final class r
{
  private DownloadRequestParam.Type a;
  private DownloadPackage.VerifyType b = DownloadPackage.VerifyType.NONE;
  private String c;
  private String d;
  private String e;
  private String f;
  private boolean g = true;
  private String h;
  private String i;
  private String j;
  private String k;
  private int l;
  private ContentTypeEnum.ContentType m;
  private String n;
  private String o;
  private String p;
  private String q;
  private long r;
  private boolean s = true;
  private boolean t;
  private boolean u;
  private ViewLogPackage v;

  public final r a()
  {
    this.g = false;
    return this;
  }

  public final r a(int paramInt)
  {
    this.l = paramInt;
    return this;
  }

  public final r a(long paramLong)
  {
    this.r = paramLong;
    return this;
  }

  public final r a(ContentTypeEnum.ContentType paramContentType)
  {
    this.m = paramContentType;
    return this;
  }

  public final r a(DownloadRequestParam.Type paramType)
  {
    this.a = paramType;
    return this;
  }

  public final r a(DownloadPackage.VerifyType paramVerifyType)
  {
    this.b = paramVerifyType;
    return this;
  }

  public final r a(ViewLogPackage paramViewLogPackage)
  {
    this.v = paramViewLogPackage;
    return this;
  }

  public final r a(String paramString)
  {
    this.c = paramString;
    return this;
  }

  public final r a(boolean paramBoolean)
  {
    this.s = paramBoolean;
    return this;
  }

  public final q b()
  {
    return new q(this);
  }

  public final r b(long paramLong)
  {
    this.q = String.valueOf(paramLong);
    return this;
  }

  public final r b(String paramString)
  {
    this.d = paramString;
    return this;
  }

  public final r b(boolean paramBoolean)
  {
    this.t = paramBoolean;
    return this;
  }

  public final r c(boolean paramBoolean)
  {
    this.u = paramBoolean;
    return this;
  }

  public final void c(String paramString)
  {
    this.e = paramString;
  }

  public final r d(String paramString)
  {
    this.f = paramString;
    return this;
  }

  public final r e(String paramString)
  {
    this.h = paramString;
    return this;
  }

  public final r f(String paramString)
  {
    this.i = paramString;
    return this;
  }

  public final r g(String paramString)
  {
    this.j = paramString;
    return this;
  }

  public final r h(String paramString)
  {
    this.k = paramString;
    return this;
  }

  public final r i(String paramString)
  {
    this.n = paramString;
    return this;
  }

  public final r j(String paramString)
  {
    this.o = paramString;
    return this;
  }

  public final r k(String paramString)
  {
    this.p = paramString;
    return this;
  }

  public final r l(String paramString)
  {
    new ViewLogPackage.Builder().url_package(new UrlPackage.Builder().url(paramString).build());
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.r
 * JD-Core Version:    0.6.0
 */