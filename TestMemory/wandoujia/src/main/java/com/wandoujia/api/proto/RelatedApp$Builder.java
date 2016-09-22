package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class RelatedApp$Builder extends Message.Builder<RelatedApp>
{
  public String packageName;
  public String title;

  public RelatedApp$Builder()
  {
  }

  public RelatedApp$Builder(RelatedApp paramRelatedApp)
  {
    super(paramRelatedApp);
    if (paramRelatedApp == null)
      return;
    this.packageName = paramRelatedApp.packageName;
    this.title = paramRelatedApp.title;
  }

  public final RelatedApp build()
  {
    return new RelatedApp(this, null);
  }

  public final Builder packageName(String paramString)
  {
    this.packageName = paramString;
    return this;
  }

  public final Builder title(String paramString)
  {
    this.title = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.RelatedApp.Builder
 * JD-Core Version:    0.6.0
 */