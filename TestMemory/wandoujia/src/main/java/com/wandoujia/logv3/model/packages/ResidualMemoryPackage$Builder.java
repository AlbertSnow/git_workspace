package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class ResidualMemoryPackage$Builder extends Message.Builder<ResidualMemoryPackage>
{
  public Long residual_memory_size;
  public Long residual_sdsize1;
  public Long residual_sdsize2;

  public ResidualMemoryPackage$Builder()
  {
  }

  public ResidualMemoryPackage$Builder(ResidualMemoryPackage paramResidualMemoryPackage)
  {
    super(paramResidualMemoryPackage);
    if (paramResidualMemoryPackage == null)
      return;
    this.residual_memory_size = paramResidualMemoryPackage.residual_memory_size;
    this.residual_sdsize1 = paramResidualMemoryPackage.residual_sdsize1;
    this.residual_sdsize2 = paramResidualMemoryPackage.residual_sdsize2;
  }

  public final ResidualMemoryPackage build()
  {
    return new ResidualMemoryPackage(this, null);
  }

  public final Builder residual_memory_size(Long paramLong)
  {
    this.residual_memory_size = paramLong;
    return this;
  }

  public final Builder residual_sdsize1(Long paramLong)
  {
    this.residual_sdsize1 = paramLong;
    return this;
  }

  public final Builder residual_sdsize2(Long paramLong)
  {
    this.residual_sdsize2 = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ResidualMemoryPackage.Builder
 * JD-Core Version:    0.6.0
 */