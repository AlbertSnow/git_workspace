package com.wandoujia.net;

import java.util.ArrayList;

public class TaggedList<T> extends ArrayList<T>
{
  private Object tag;

  public <V> V tag()
  {
    return this.tag;
  }

  public <V> void tag(V paramV)
  {
    this.tag = paramV;
  }

  public <V> void tagNull(V paramV)
  {
    if (this.tag == null)
      this.tag = paramV;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.TaggedList
 * JD-Core Version:    0.6.0
 */