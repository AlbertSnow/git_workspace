package com.wandoujia.p4.feedback.model;

import java.io.Serializable;

public class PhoneInfo
  implements Serializable
{
  private String cpuFamily;
  private long features;
  private String gpuRenderer;
  private String gpuVendor;
  private int sdk;

  public String getCpuFamily()
  {
    return this.cpuFamily;
  }

  public long getFeatures()
  {
    return this.features;
  }

  public String getGpuRenderer()
  {
    return this.gpuRenderer;
  }

  public String getGpuVendor()
  {
    return this.gpuVendor;
  }

  public int getSdk()
  {
    return this.sdk;
  }

  public void setCpuFamily(String paramString)
  {
    this.cpuFamily = paramString;
  }

  public void setFeatures(long paramLong)
  {
    this.features = paramLong;
  }

  public void setGpuRenderer(String paramString)
  {
    this.gpuRenderer = paramString;
  }

  public void setGpuVendor(String paramString)
  {
    this.gpuVendor = paramString;
  }

  public void setSdk(int paramInt)
  {
    this.sdk = paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.model.PhoneInfo
 * JD-Core Version:    0.6.0
 */