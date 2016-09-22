package com.wandoujia.download2;

import com.wandoujia.logv3.model.packages.DownloadPackage.VerifyType;
import java.util.HashMap;
import java.util.Map;

public final class DownloadRequestParam
{
  public DownloadRequestParam.Type a;
  public String b;
  public String c;
  public String d;
  public String e;
  public DownloadPackage.VerifyType f = DownloadPackage.VerifyType.NONE;
  public String g;
  public Map<String, String> h = new HashMap();

  public final DownloadRequestParam a()
  {
    DownloadRequestParam localDownloadRequestParam = new DownloadRequestParam();
    localDownloadRequestParam.a = this.a;
    localDownloadRequestParam.b = this.b;
    localDownloadRequestParam.c = this.c;
    localDownloadRequestParam.d = this.d;
    localDownloadRequestParam.e = this.e;
    localDownloadRequestParam.f = this.f;
    localDownloadRequestParam.g = this.g;
    localDownloadRequestParam.h = new HashMap(this.h);
    return localDownloadRequestParam;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.DownloadRequestParam
 * JD-Core Version:    0.6.0
 */