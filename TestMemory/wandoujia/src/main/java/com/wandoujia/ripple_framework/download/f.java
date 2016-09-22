package com.wandoujia.ripple_framework.download;

import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f
{
  private List<ContentTypeEnum.ContentType> a;
  private List<DownloadInfo.Status> b;
  private Boolean c;

  public final f a()
  {
    this.c = Boolean.valueOf(true);
    return this;
  }

  public final f a(ContentTypeEnum.ContentType[] paramArrayOfContentType)
  {
    this.a = new ArrayList();
    Collections.addAll(this.a, paramArrayOfContentType);
    return this;
  }

  public final f a(DownloadInfo.Status[] paramArrayOfStatus)
  {
    if ((paramArrayOfStatus != null) && (paramArrayOfStatus.length >= 0))
    {
      this.b = new ArrayList();
      Collections.addAll(this.b, paramArrayOfStatus);
    }
    return this;
  }

  public final e b()
  {
    return new e(this, 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.f
 * JD-Core Version:    0.6.0
 */