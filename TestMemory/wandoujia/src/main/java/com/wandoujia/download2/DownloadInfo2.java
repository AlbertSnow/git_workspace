package com.wandoujia.download2;

public final class DownloadInfo2
{
  public final DownloadRequestParam a;
  public DownloadInfo2.State b = DownloadInfo2.State.PENDING;
  public int c;
  public long d = -1L;
  public long e;
  public long f;
  public Exception g;

  public DownloadInfo2(DownloadRequestParam paramDownloadRequestParam)
  {
    this.a = paramDownloadRequestParam;
  }

  public final boolean a()
  {
    return (this.b == DownloadInfo2.State.CANCELED) || (this.b == DownloadInfo2.State.SUCCEED) || (this.b == DownloadInfo2.State.FAILED);
  }

  public final DownloadInfo2 b()
  {
    DownloadInfo2 localDownloadInfo2 = new DownloadInfo2(this.a.a());
    localDownloadInfo2.b = this.b;
    localDownloadInfo2.c = this.c;
    localDownloadInfo2.d = this.d;
    localDownloadInfo2.e = this.e;
    localDownloadInfo2.f = this.f;
    localDownloadInfo2.g = this.g;
    return localDownloadInfo2;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.DownloadInfo2
 * JD-Core Version:    0.6.0
 */