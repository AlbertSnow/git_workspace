package org.simalliance.openmobileapi.service;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class SmartcardError$1
  implements Parcelable.Creator<SmartcardError>
{
  public final SmartcardError createFromParcel(Parcel paramParcel)
  {
    return new SmartcardError(paramParcel, null);
  }

  public final SmartcardError[] newArray(int paramInt)
  {
    return new SmartcardError[paramInt];
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     org.simalliance.openmobileapi.service.SmartcardError.1
 * JD-Core Version:    0.6.0
 */