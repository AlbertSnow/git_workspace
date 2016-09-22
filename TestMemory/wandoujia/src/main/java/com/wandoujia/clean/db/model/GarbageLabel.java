package com.wandoujia.clean.db.model;

import java.io.Serializable;

public class GarbageLabel
  implements Serializable
{
  private static final long serialVersionUID = 8432404006240705167L;
  public int id;
  public String name;
  public int orderType;
  public int rank;

  public GarbageLabel(int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    this.id = paramInt1;
    this.name = paramString;
    this.rank = paramInt2;
    this.orderType = paramInt3;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    GarbageLabel localGarbageLabel;
    do
    {
      return true;
      if (!(paramObject instanceof GarbageLabel))
        return false;
      localGarbageLabel = (GarbageLabel)paramObject;
    }
    while (this.id == localGarbageLabel.id);
    return false;
  }

  public int hashCode()
  {
    return this.id;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.db.model.GarbageLabel
 * JD-Core Version:    0.6.0
 */