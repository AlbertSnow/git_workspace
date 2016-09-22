package com.wandoujia.ripple_framework.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.squareup.wire.Wire;
import com.wandoujia.api.proto.Entity;
import java.io.IOException;

final class f
  implements Parcelable.Creator<Model>
{
  private static Model a(Parcel paramParcel)
  {
    byte[] arrayOfByte = paramParcel.createByteArray();
    try
    {
      Model localModel = new Model((Entity)new Wire(new Class[0]).parseFrom(arrayOfByte, Entity.class));
      Model.a(localModel, (LocalSceneInfo)paramParcel.readParcelable(LocalSceneInfo.class.getClassLoader()));
      return localModel;
    }
    catch (IOException localIOException)
    {
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.model.f
 * JD-Core Version:    0.6.0
 */