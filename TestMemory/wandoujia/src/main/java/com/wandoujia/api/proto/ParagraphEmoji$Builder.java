package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class ParagraphEmoji$Builder extends Message.Builder<ParagraphEmoji>
{
  public List<Emoji> emoji;
  public Integer index;
  public Integer total_count;

  public ParagraphEmoji$Builder()
  {
  }

  public ParagraphEmoji$Builder(ParagraphEmoji paramParagraphEmoji)
  {
    super(paramParagraphEmoji);
    if (paramParagraphEmoji == null)
      return;
    this.index = paramParagraphEmoji.index;
    this.total_count = paramParagraphEmoji.total_count;
    this.emoji = ParagraphEmoji.access$000(paramParagraphEmoji.emoji);
  }

  public final ParagraphEmoji build()
  {
    return new ParagraphEmoji(this, null);
  }

  public final Builder emoji(List<Emoji> paramList)
  {
    this.emoji = checkForNulls(paramList);
    return this;
  }

  public final Builder index(Integer paramInteger)
  {
    this.index = paramInteger;
    return this;
  }

  public final Builder total_count(Integer paramInteger)
  {
    this.total_count = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ParagraphEmoji.Builder
 * JD-Core Version:    0.6.0
 */