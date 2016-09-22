package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ParagraphContent extends Message
{
  public static final List<Image> DEFAULT_IMAGE = Collections.emptyList();
  public static final String DEFAULT_TEXT = "";
  public static final String DEFAULT_TEXT_STYLE = "";

  @ProtoField(label=Message.Label.REPEATED, tag=3)
  public final List<Image> image;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String text;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String text_style;

  private ParagraphContent(ParagraphContent.Builder paramBuilder)
  {
    super(paramBuilder);
    this.text_style = paramBuilder.text_style;
    this.text = paramBuilder.text;
    this.image = immutableCopyOf(paramBuilder.image);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ParagraphContent localParagraphContent;
    do
    {
      return true;
      if (!(paramObject instanceof ParagraphContent))
        return false;
      localParagraphContent = (ParagraphContent)paramObject;
    }
    while ((equals(this.text_style, localParagraphContent.text_style)) && (equals(this.text, localParagraphContent.text)) && (equals(this.image, localParagraphContent.image)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int n;
    if (i == 0)
    {
      if (this.text_style == null)
        break label92;
      j = this.text_style.hashCode();
      int k = j * 37;
      String str = this.text;
      int m = 0;
      if (str != null)
        m = this.text.hashCode();
      n = 37 * (k + m);
      if (this.image == null)
        break label97;
    }
    label92: label97: for (int i1 = this.image.hashCode(); ; i1 = 1)
    {
      i = i1 + n;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ParagraphContent
 * JD-Core Version:    0.6.0
 */