package com.wandoujia.ripple_framework.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class LocalSceneInfo
  implements Parcelable, Serializable
{
  public static final Parcelable.Creator<LocalSceneInfo> CREATOR = new e();
  private static final long serialVersionUID = -3732023198789317287L;
  private boolean closed = false;
  private long closedTime = 0L;
  private boolean notifyCancelled = false;
  private long notifySuggestionId = 0L;

  public LocalSceneInfo()
  {
  }

  protected LocalSceneInfo(Parcel paramParcel)
  {
    boolean bool2;
    if (paramParcel.readByte() != 0)
    {
      bool2 = bool1;
      this.closed = bool2;
      this.closedTime = paramParcel.readLong();
      this.notifySuggestionId = paramParcel.readLong();
      if (paramParcel.readByte() == 0)
        break label74;
    }
    while (true)
    {
      this.notifyCancelled = bool1;
      return;
      bool2 = false;
      break;
      label74: bool1 = false;
    }
  }

  public LocalSceneInfo clone()
  {
    LocalSceneInfo localLocalSceneInfo = new LocalSceneInfo();
    localLocalSceneInfo.setClosed(this.closed);
    localLocalSceneInfo.setClosedTime(this.closedTime);
    localLocalSceneInfo.setNotifySuggestionId(this.notifySuggestionId);
    localLocalSceneInfo.setNotifyCancelled(this.notifyCancelled);
    return localLocalSceneInfo;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    LocalSceneInfo localLocalSceneInfo;
    do
    {
      return true;
      if (!(paramObject instanceof LocalSceneInfo))
        return false;
      localLocalSceneInfo = (LocalSceneInfo)paramObject;
    }
    while ((this.closed == localLocalSceneInfo.closed) && (this.closedTime == localLocalSceneInfo.closedTime) && (this.notifySuggestionId == localLocalSceneInfo.notifySuggestionId) && (this.notifyCancelled == this.notifyCancelled));
    return false;
  }

  public long getClosedTime()
  {
    return this.closedTime;
  }

  public long getNotifySuggestionId()
  {
    return this.notifySuggestionId;
  }

  public boolean isClosed()
  {
    return this.closed;
  }

  public boolean isNotifyCancelled()
  {
    return this.notifyCancelled;
  }

  public void setClosed(boolean paramBoolean)
  {
    this.closed = paramBoolean;
  }

  public void setClosedTime(long paramLong)
  {
    this.closedTime = paramLong;
  }

  public void setNotifyCancelled(boolean paramBoolean)
  {
    this.notifyCancelled = paramBoolean;
  }

  public void setNotifySuggestionId(long paramLong)
  {
    this.notifySuggestionId = paramLong;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    int j;
    if (this.closed)
    {
      j = i;
      paramParcel.writeByte((byte)j);
      paramParcel.writeLong(this.closedTime);
      paramParcel.writeLong(this.notifySuggestionId);
      if (!this.notifyCancelled)
        break label55;
    }
    while (true)
    {
      paramParcel.writeByte((byte)i);
      return;
      j = 0;
      break;
      label55: i = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.model.LocalSceneInfo
 * JD-Core Version:    0.6.0
 */