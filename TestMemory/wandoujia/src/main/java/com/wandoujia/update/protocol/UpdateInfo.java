package com.wandoujia.update.protocol;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.wandoujia.gson.a.a;
import java.io.Serializable;

public class UpdateInfo
  implements Parcelable, Serializable
{
  public static final Parcelable.Creator<UpdateInfo> CREATOR = new b();
  protected static final String UPDATE_YES = "yes";
  private static final long serialVersionUID = -8441016036442930385L;

  @a(a="apk_size")
  protected long apkSize = -1L;

  @a(a="download_url")
  protected String downloadUrl = "";

  @a(a="ekey")
  protected String ekey = "";

  @a(a="md5")
  protected String md5 = "";

  @a(a="priority")
  protected String priority = UpdateInfo.SelfUpdatePriority.WEAK.toString();

  @a(a="update")
  protected String update = "";

  @a(a="update_log")
  protected String updateLog = "";

  @a(a="update_sub_title")
  protected String updateSubTitle = "";

  @a(a="update_title")
  protected String updateTitle = "";

  @a(a="version")
  protected String version = "";

  public UpdateInfo()
  {
  }

  private UpdateInfo(Parcel paramParcel)
  {
    readFromParcel(paramParcel);
  }

  public int describeContents()
  {
    return 0;
  }

  public long getApkSize()
  {
    return this.apkSize;
  }

  public String getDownloadUrl()
  {
    return this.downloadUrl;
  }

  public String getEkey()
  {
    return this.ekey;
  }

  public String getMd5()
  {
    return this.md5;
  }

  public UpdateInfo.SelfUpdatePriority getPriority()
  {
    return UpdateInfo.SelfUpdatePriority.valueOf(this.priority);
  }

  public String getUpdateLog()
  {
    return this.updateLog;
  }

  public String getUpdateSubTitle()
  {
    return this.updateSubTitle;
  }

  public String getUpdateTitle()
  {
    return this.updateTitle;
  }

  public String getVersion()
  {
    return this.version;
  }

  public boolean hasNewVersion()
  {
    return "yes".equalsIgnoreCase(this.update);
  }

  public boolean isValid()
  {
    if (!hasNewVersion());
    do
      return true;
    while ((!TextUtils.isEmpty(this.updateLog)) && (!TextUtils.isEmpty(this.updateTitle)) && (!TextUtils.isEmpty(this.updateSubTitle)) && (!TextUtils.isEmpty(this.version)) && (!TextUtils.isEmpty(this.downloadUrl)) && (!TextUtils.isEmpty(this.md5)) && (this.apkSize > 0L));
    return false;
  }

  public void readFromParcel(Parcel paramParcel)
  {
    this.update = paramParcel.readString();
    this.priority = paramParcel.readString();
    this.version = paramParcel.readString();
    this.apkSize = paramParcel.readLong();
    this.md5 = paramParcel.readString();
    this.updateTitle = paramParcel.readString();
    this.updateSubTitle = paramParcel.readString();
    this.updateLog = paramParcel.readString();
    this.downloadUrl = paramParcel.readString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.update);
    paramParcel.writeString(this.priority);
    paramParcel.writeString(this.version);
    paramParcel.writeLong(this.apkSize);
    paramParcel.writeString(this.md5);
    paramParcel.writeString(this.updateTitle);
    paramParcel.writeString(this.updateSubTitle);
    paramParcel.writeString(this.updateLog);
    paramParcel.writeString(this.downloadUrl);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.protocol.UpdateInfo
 * JD-Core Version:    0.6.0
 */