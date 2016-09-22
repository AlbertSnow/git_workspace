package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class ParagraphContent$Builder extends Message.Builder<ParagraphContent>
{
  public List<Image> image;
  public String text;
  public String text_style;

  public ParagraphContent$Builder()
  {
  }

  public ParagraphContent$Builder(ParagraphContent paramParagraphContent)
  {
    super(paramParagraphContent);
    if (paramParagraphContent == null)
      return;
    this.text_style = paramParagraphContent.text_style;
    this.text = paramParagraphContent.text;
    this.image = ParagraphContent.access$000(paramParagraphContent.image);
  }

  public final ParagraphContent build()
  {
    return new ParagraphContent(this, null);
  }

  public final Builder image(List<Image> paramList)
  {
    this.image = checkForNulls(paramList);
    return this;
  }

  public final Builder text(String paramString)
  {
    this.text = paramString;
    return this;
  }

  public final Builder text_style(String paramString)
  {
    this.text_style = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ParagraphContent.Builder
 * JD-Core Version:    0.6.0
 */