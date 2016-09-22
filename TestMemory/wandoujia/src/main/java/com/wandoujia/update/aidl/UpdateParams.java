package com.wandoujia.update.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.wandoujia.update.LocalUpdateService.UpdateParams;
import com.wandoujia.update.protocol.CheckUpdateProtocol;

public class UpdateParams extends LocalUpdateService.UpdateParams
  implements Parcelable
{
  public static final Parcelable.Creator<UpdateParams> CREATOR = new c();

  private UpdateParams(Parcel paramParcel)
  {
    readFromParcel(paramParcel);
  }

  public UpdateParams(LocalUpdateService.UpdateParams paramUpdateParams)
  {
    this.checkUpdateProtocol = paramUpdateParams.checkUpdateProtocol;
    this.updateDelayMs = paramUpdateParams.updateDelayMs;
    this.updateDurationMs = paramUpdateParams.updateDurationMs;
    this.downloadInstallerOnlyOnWifi = paramUpdateParams.downloadInstallerOnlyOnWifi;
    this.notificationIcon = paramUpdateParams.notificationIcon;
  }

  public int describeContents()
  {
    return 0;
  }

  public void readFromParcel(Parcel paramParcel)
  {
    this.checkUpdateProtocol = ((CheckUpdateProtocol)CheckUpdateProtocol.CREATOR.createFromParcel(paramParcel));
    this.updateDelayMs = paramParcel.readLong();
    this.updateDurationMs = paramParcel.readLong();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.downloadInstallerOnlyOnWifi = bool;
      this.notificationIcon = paramParcel.readInt();
      return;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    this.checkUpdateProtocol.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.updateDelayMs);
    paramParcel.writeLong(this.updateDurationMs);
    if (this.downloadInstallerOnlyOnWifi);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeByte((byte)i);
      paramParcel.writeInt(this.notificationIcon);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.aidl.UpdateParams
 * JD-Core Version:    0.6.0
 */