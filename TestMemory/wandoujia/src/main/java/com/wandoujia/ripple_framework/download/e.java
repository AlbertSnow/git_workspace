package com.wandoujia.ripple_framework.download;

import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import java.util.List;

public class e
{
  private final List<ContentTypeEnum.ContentType> a;
  private final List<DownloadInfo.Status> b;
  private final Boolean c;

  static
  {
    e.class.getSimpleName();
  }

  private e(f paramf)
  {
    this.a = f.a(paramf);
    this.b = f.b(paramf);
    this.c = f.c(paramf);
  }

  public static f a()
  {
    return new f();
  }

  public final List<ContentTypeEnum.ContentType> b()
  {
    return this.a;
  }

  public final List<DownloadInfo.Status> c()
  {
    return this.b;
  }

  public final Boolean d()
  {
    return this.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.e
 * JD-Core Version:    0.6.0
 */