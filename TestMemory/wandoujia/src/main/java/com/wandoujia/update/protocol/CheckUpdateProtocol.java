package com.wandoujia.update.protocol;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.io.Serializable;

public class CheckUpdateProtocol
  implements Parcelable, Serializable
{
  public static final Parcelable.Creator<CheckUpdateProtocol> CREATOR = new a();
  public static final String URL = "https://upgrade.wandoujia.com/upgrade";

  @com.wandoujia.gson.a.a(a="app_name")
  public String appName;

  @com.wandoujia.gson.a.a(a="installage")
  public long installedDays = -1L;

  @com.wandoujia.gson.a.a(a="is_oem")
  public boolean isOem = false;

  @com.wandoujia.gson.a.a(a="language")
  public String language;

  @com.wandoujia.gson.a.a(a="net_subtype")
  public String netSubtype;

  @com.wandoujia.gson.a.a(a="net_type")
  public String netType;

  @com.wandoujia.gson.a.a(a="package_name")
  public String packageName;

  @com.wandoujia.gson.a.a(a="protocol_version")
  public String protocolVersion = "1.0.0.1";

  @com.wandoujia.gson.a.a(a="rom")
  public String rom;

  @com.wandoujia.gson.a.a(a="rom_version")
  public String romVersion;

  @com.wandoujia.gson.a.a(a="source")
  public String source;

  @com.wandoujia.gson.a.a(a="udid")
  public String udid;

  @com.wandoujia.gson.a.a(a="version_code")
  public int versionCode = -1;

  @com.wandoujia.gson.a.a(a="version_name")
  public String versionName;

  public CheckUpdateProtocol()
  {
  }

  private CheckUpdateProtocol(Parcel paramParcel)
  {
    readFromParcel(paramParcel);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean isValid()
  {
    return (!TextUtils.isEmpty(this.protocolVersion)) && (!TextUtils.isEmpty(this.appName)) && (!TextUtils.isEmpty(this.packageName)) && (!TextUtils.isEmpty(this.versionName)) && (this.versionCode != -1) && (!TextUtils.isEmpty(this.language));
  }

  public void readFromParcel(Parcel paramParcel)
  {
    this.appName = paramParcel.readString();
    this.packageName = paramParcel.readString();
    this.versionName = paramParcel.readString();
    this.versionCode = paramParcel.readInt();
    this.source = paramParcel.readString();
    this.udid = paramParcel.readString();
    this.language = paramParcel.readString();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.isOem = bool;
      this.rom = paramParcel.readString();
      this.romVersion = paramParcel.readString();
      this.netType = paramParcel.readString();
      this.netSubtype = paramParcel.readString();
      this.installedDays = paramParcel.readLong();
      return;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.appName);
    paramParcel.writeString(this.packageName);
    paramParcel.writeString(this.versionName);
    paramParcel.writeInt(this.versionCode);
    paramParcel.writeString(this.source);
    paramParcel.writeString(this.udid);
    paramParcel.writeString(this.language);
    if (this.isOem);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeByte((byte)i);
      paramParcel.writeString(this.rom);
      paramParcel.writeString(this.romVersion);
      paramParcel.writeString(this.netType);
      paramParcel.writeString(this.netSubtype);
      paramParcel.writeLong(this.installedDays);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.protocol.CheckUpdateProtocol
 * JD-Core Version:    0.6.0
 */