package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class Dialog extends Message
{
  public static final String DEFAULT_MESSAGE = "";
  public static final String DEFAULT_NEGATIVE = "";
  public static final String DEFAULT_POSITIVE = "";
  public static final String DEFAULT_TITLE = "";

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String message;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String negative;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String positive;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String title;

  private Dialog(Dialog.Builder paramBuilder)
  {
    super(paramBuilder);
    this.title = paramBuilder.title;
    this.message = paramBuilder.message;
    this.positive = paramBuilder.positive;
    this.negative = paramBuilder.negative;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Dialog localDialog;
    do
    {
      return true;
      if (!(paramObject instanceof Dialog))
        return false;
      localDialog = (Dialog)paramObject;
    }
    while ((equals(this.title, localDialog.title)) && (equals(this.message, localDialog.message)) && (equals(this.positive, localDialog.positive)) && (equals(this.negative, localDialog.negative)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int n;
    if (i == 0)
    {
      if (this.title == null)
        break label116;
      j = this.title.hashCode();
      int k = j * 37;
      if (this.message == null)
        break label121;
      m = this.message.hashCode();
      n = 37 * (m + k);
      if (this.positive == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.positive.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      String str = this.negative;
      int i3 = 0;
      if (str != null)
        i3 = this.negative.hashCode();
      i = i2 + i3;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Dialog
 * JD-Core Version:    0.6.0
 */