package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class ResidualMemoryPackage extends Message
{
  public static final Long DEFAULT_RESIDUAL_MEMORY_SIZE = Long.valueOf(0L);
  public static final Long DEFAULT_RESIDUAL_SDSIZE1 = Long.valueOf(0L);
  public static final Long DEFAULT_RESIDUAL_SDSIZE2 = Long.valueOf(0L);

  @ProtoField(tag=1, type=Message.Datatype.INT64)
  public final Long residual_memory_size;

  @ProtoField(tag=2, type=Message.Datatype.INT64)
  public final Long residual_sdsize1;

  @ProtoField(tag=3, type=Message.Datatype.INT64)
  public final Long residual_sdsize2;

  private ResidualMemoryPackage(ResidualMemoryPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.residual_memory_size = paramBuilder.residual_memory_size;
    this.residual_sdsize1 = paramBuilder.residual_sdsize1;
    this.residual_sdsize2 = paramBuilder.residual_sdsize2;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ResidualMemoryPackage localResidualMemoryPackage;
    do
    {
      return true;
      if (!(paramObject instanceof ResidualMemoryPackage))
        return false;
      localResidualMemoryPackage = (ResidualMemoryPackage)paramObject;
    }
    while ((equals(this.residual_memory_size, localResidualMemoryPackage.residual_memory_size)) && (equals(this.residual_sdsize1, localResidualMemoryPackage.residual_sdsize1)) && (equals(this.residual_sdsize2, localResidualMemoryPackage.residual_sdsize2)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.residual_memory_size == null)
        break label90;
      j = this.residual_memory_size.hashCode();
      k = j * 37;
      if (this.residual_sdsize1 == null)
        break label95;
    }
    label90: label95: for (int m = this.residual_sdsize1.hashCode(); ; m = 0)
    {
      int n = 37 * (m + k);
      Long localLong = this.residual_sdsize2;
      int i1 = 0;
      if (localLong != null)
        i1 = this.residual_sdsize2.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ResidualMemoryPackage
 * JD-Core Version:    0.6.0
 */