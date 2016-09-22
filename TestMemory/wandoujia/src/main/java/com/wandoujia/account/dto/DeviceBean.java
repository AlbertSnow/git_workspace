package com.wandoujia.account.dto;

import java.io.Serializable;
import org.codehaus.jackson.map.annotate.JsonFilter;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown=true)
@org.codehaus.jackson.annotate.JsonIgnoreProperties(ignoreUnknown=true)
@JsonFilter("device_bean_filter")
public class DeviceBean
  implements Serializable, Comparable
{
  private static final long serialVersionUID = -8786615140413191568L;
  private String brand;
  private Long id;
  private String model;
  private PhoneInfo phoneInfo;
  private String sdk;
  private String source;
  private String udid;
  private String versionCode;
  private String versionName;

  public DeviceBean()
  {
  }

  public DeviceBean(Long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this.id = paramLong;
    this.udid = paramString1;
    this.model = paramString2;
    this.sdk = paramString3;
    this.brand = paramString4;
    this.versionName = paramString5;
    this.versionCode = paramString6;
    this.source = paramString7;
  }

  public int compareTo(Object paramObject)
  {
    Long localLong1 = this.id;
    if (localLong1 == null)
    {
      Long localLong2 = Long.valueOf(0L);
      Long localLong3 = ((DeviceBean)paramObject).getId();
      if (localLong3 == null)
        localLong3 = Long.valueOf(0L);
      return (int)(localLong2.longValue() - localLong3.longValue());
    }
    if (((DeviceBean)paramObject).getId() == null)
      return (int)localLong1.longValue();
    return this.id.compareTo(((DeviceBean)paramObject).getId());
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    DeviceBean localDeviceBean;
    do
      while (true)
      {
        return true;
        if (paramObject == null)
          return false;
        if (getClass() != paramObject.getClass())
          return false;
        localDeviceBean = (DeviceBean)paramObject;
        if (this.brand == null)
        {
          if (localDeviceBean.brand != null)
            return false;
        }
        else if (!this.brand.equals(localDeviceBean.brand))
          return false;
        if (this.model == null)
        {
          if (localDeviceBean.model != null)
            return false;
        }
        else if (!this.model.equals(localDeviceBean.model))
          return false;
        if (this.sdk == null)
        {
          if (localDeviceBean.sdk != null)
            return false;
        }
        else if (!this.sdk.equals(localDeviceBean.sdk))
          return false;
        if (this.udid == null)
        {
          if (localDeviceBean.udid != null)
            return false;
        }
        else if (!this.udid.equals(localDeviceBean.udid))
          return false;
        if (this.versionCode == null)
        {
          if (localDeviceBean.versionCode != null)
            return false;
        }
        else if (!this.versionCode.equals(localDeviceBean.versionCode))
          return false;
        if (this.versionName != null)
          break;
        if (localDeviceBean.versionName != null)
          return false;
      }
    while (this.versionName.equals(localDeviceBean.versionName));
    return false;
  }

  public String getBrand()
  {
    return this.brand;
  }

  public Long getId()
  {
    return this.id;
  }

  public String getModel()
  {
    return this.model;
  }

  public PhoneInfo getPhoneInfo()
  {
    return this.phoneInfo;
  }

  public String getSdk()
  {
    return this.sdk;
  }

  public String getSource()
  {
    return this.source;
  }

  public String getUdid()
  {
    return this.udid;
  }

  public String getVersionCode()
  {
    return this.versionCode;
  }

  public String getVersionName()
  {
    return this.versionName;
  }

  public int hashCode()
  {
    int i;
    int k;
    label26: int n;
    label44: int i2;
    label64: int i4;
    label84: int i5;
    int i6;
    if (this.brand == null)
    {
      i = 0;
      int j = 31 * (i + 31);
      if (this.model != null)
        break label125;
      k = 0;
      int m = 31 * (k + j);
      if (this.sdk != null)
        break label136;
      n = 0;
      int i1 = 31 * (n + m);
      if (this.udid != null)
        break label148;
      i2 = 0;
      int i3 = 31 * (i2 + i1);
      if (this.versionCode != null)
        break label160;
      i4 = 0;
      i5 = 31 * (i4 + i3);
      String str = this.versionName;
      i6 = 0;
      if (str != null)
        break label172;
    }
    while (true)
    {
      return i5 + i6;
      i = this.brand.hashCode();
      break;
      label125: k = this.model.hashCode();
      break label26;
      label136: n = this.sdk.hashCode();
      break label44;
      label148: i2 = this.udid.hashCode();
      break label64;
      label160: i4 = this.versionCode.hashCode();
      break label84;
      label172: i6 = this.versionName.hashCode();
    }
  }

  public void setBrand(String paramString)
  {
    this.brand = paramString;
  }

  public void setId(Long paramLong)
  {
    this.id = paramLong;
  }

  public void setModel(String paramString)
  {
    this.model = paramString;
  }

  public void setPhoneInfo(PhoneInfo paramPhoneInfo)
  {
    this.phoneInfo = paramPhoneInfo;
  }

  public void setSdk(String paramString)
  {
    this.sdk = paramString;
  }

  public void setSource(String paramString)
  {
    this.source = paramString;
  }

  public void setUdid(String paramString)
  {
    this.udid = paramString;
  }

  public void setVersionCode(String paramString)
  {
    this.versionCode = paramString;
  }

  public void setVersionName(String paramString)
  {
    this.versionName = paramString;
  }

  public String toString()
  {
    return "DeviceBean [udid=" + this.udid + ", model=" + this.model + ", sdk=" + this.sdk + ", brand=" + this.brand + ", versionName=" + this.versionName + ", versionCode=" + this.versionCode + ", source=" + this.source + ", phoneInfo=" + this.phoneInfo + "]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.dto.DeviceBean
 * JD-Core Version:    0.6.0
 */