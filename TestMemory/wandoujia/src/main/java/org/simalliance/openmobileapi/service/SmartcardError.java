package org.simalliance.openmobileapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.lang.reflect.Constructor;

public class SmartcardError
  implements Parcelable
{
  public static final Parcelable.Creator<SmartcardError> CREATOR = new SmartcardError.1();
  private String mClazz;
  private String mMessage;

  public SmartcardError()
  {
    this.mClazz = "";
    this.mMessage = "";
  }

  private SmartcardError(Parcel paramParcel)
  {
    this.mClazz = paramParcel.readString();
    this.mMessage = paramParcel.readString();
  }

  public SmartcardError(String paramString1, String paramString2)
  {
    if (paramString1 == null)
      paramString1 = "";
    this.mClazz = paramString1;
    if (paramString2 == null)
      paramString2 = "";
    this.mMessage = paramString2;
  }

  public void clear()
  {
    this.mClazz = "";
    this.mMessage = "";
  }

  public Exception createException()
  {
    try
    {
      if (this.mClazz.length() == 0)
        return null;
      if (this.mMessage.length() == 0)
        return (Exception)Class.forName(this.mClazz).newInstance();
      Constructor localConstructor = Class.forName(this.mClazz).getConstructor(new Class[] { String.class });
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.mMessage;
      Exception localException2 = (Exception)localConstructor.newInstance(arrayOfObject);
      return localException2;
    }
    catch (Exception localException1)
    {
    }
    return null;
  }

  public int describeContents()
  {
    return 0;
  }

  public void readFromParcel(Parcel paramParcel)
  {
    this.mClazz = paramParcel.readString();
    this.mMessage = paramParcel.readString();
  }

  public void setError(Class paramClass, String paramString)
  {
    if (paramClass == null);
    for (String str = ""; ; str = paramClass.getName())
    {
      this.mClazz = str;
      if (paramString == null)
        paramString = "";
      this.mMessage = paramString;
      return;
    }
  }

  public void throwException()
  {
    Exception localException = createException();
    if (localException == null)
      return;
    if ((localException instanceof CardException))
      throw ((CardException)localException);
    if ((localException instanceof RuntimeException))
      throw ((RuntimeException)localException);
    throw new RuntimeException(localException);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.mClazz);
    paramParcel.writeString(this.mMessage);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     org.simalliance.openmobileapi.service.SmartcardError
 * JD-Core Version:    0.6.0
 */