package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class StartpageCardPackage$Builder extends Message.Builder<StartpageCardPackage>
{
  public String startpage_card_feed_name;
  public String startpage_card_id;
  public String startpage_card_template;
  public String startpage_sub_card_list;

  public StartpageCardPackage$Builder()
  {
  }

  public StartpageCardPackage$Builder(StartpageCardPackage paramStartpageCardPackage)
  {
    super(paramStartpageCardPackage);
    if (paramStartpageCardPackage == null)
      return;
    this.startpage_card_feed_name = paramStartpageCardPackage.startpage_card_feed_name;
    this.startpage_card_template = paramStartpageCardPackage.startpage_card_template;
    this.startpage_card_id = paramStartpageCardPackage.startpage_card_id;
    this.startpage_sub_card_list = paramStartpageCardPackage.startpage_sub_card_list;
  }

  public final StartpageCardPackage build()
  {
    return new StartpageCardPackage(this, null);
  }

  public final Builder startpage_card_feed_name(String paramString)
  {
    this.startpage_card_feed_name = paramString;
    return this;
  }

  public final Builder startpage_card_id(String paramString)
  {
    this.startpage_card_id = paramString;
    return this;
  }

  public final Builder startpage_card_template(String paramString)
  {
    this.startpage_card_template = paramString;
    return this;
  }

  public final Builder startpage_sub_card_list(String paramString)
  {
    this.startpage_sub_card_list = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.StartpageCardPackage.Builder
 * JD-Core Version:    0.6.0
 */