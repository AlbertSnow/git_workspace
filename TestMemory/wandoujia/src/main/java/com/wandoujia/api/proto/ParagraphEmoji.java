package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ParagraphEmoji extends Message
{
  public static final List<Emoji> DEFAULT_EMOJI;
  public static final Integer DEFAULT_INDEX = Integer.valueOf(0);
  public static final Integer DEFAULT_TOTAL_COUNT = Integer.valueOf(0);

  @ProtoField(label=Message.Label.REPEATED, tag=3)
  public final List<Emoji> emoji;

  @ProtoField(tag=1, type=Message.Datatype.INT32)
  public final Integer index;

  @ProtoField(tag=2, type=Message.Datatype.INT32)
  public final Integer total_count;

  static
  {
    DEFAULT_EMOJI = Collections.emptyList();
  }

  private ParagraphEmoji(ParagraphEmoji.Builder paramBuilder)
  {
    super(paramBuilder);
    this.index = paramBuilder.index;
    this.total_count = paramBuilder.total_count;
    this.emoji = immutableCopyOf(paramBuilder.emoji);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ParagraphEmoji localParagraphEmoji;
    do
    {
      return true;
      if (!(paramObject instanceof ParagraphEmoji))
        return false;
      localParagraphEmoji = (ParagraphEmoji)paramObject;
    }
    while ((equals(this.index, localParagraphEmoji.index)) && (equals(this.total_count, localParagraphEmoji.total_count)) && (equals(this.emoji, localParagraphEmoji.emoji)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int n;
    if (i == 0)
    {
      if (this.index == null)
        break label92;
      j = this.index.hashCode();
      int k = j * 37;
      Integer localInteger = this.total_count;
      int m = 0;
      if (localInteger != null)
        m = this.total_count.hashCode();
      n = 37 * (k + m);
      if (this.emoji == null)
        break label97;
    }
    label92: label97: for (int i1 = this.emoji.hashCode(); ; i1 = 1)
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
 * Qualified Name:     com.wandoujia.api.proto.ParagraphEmoji
 * JD-Core Version:    0.6.0
 */