package com.google.android.gms.internal;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.zzg;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@zzhb
class zzec
{
  final AdRequestParcel zzqH;
  final String zzpS;
  final int zzAC;

  zzec(zzea paramzzea)
  {
    this(paramzzea.zzei(), paramzzea.getAdUnitId(), paramzzea.getNetworkType());
  }

  zzec(AdRequestParcel paramAdRequestParcel, String paramString, int paramInt)
  {
    this.zzqH = paramAdRequestParcel;
    this.zzpS = paramString;
    this.zzAC = paramInt;
  }

  zzec(String paramString)
    throws IOException
  {
    String[] arrayOfString = paramString.split("");
    if (arrayOfString.length != 3)
      throw new IOException("Incorrect field count for QueueSeed.");
    Parcel localParcel = Parcel.obtain();
    try
    {
      byte[] arrayOfByte1 = Base64.decode(arrayOfString[0], 0);
      this.zzpS = new String(arrayOfByte1, "UTF-8");
      this.zzAC = Integer.parseInt(arrayOfString[1]);
      byte[] arrayOfByte2 = Base64.decode(arrayOfString[2], 0);
      localParcel.unmarshall(arrayOfByte2, 0, arrayOfByte2.length);
      localParcel.setDataPosition(0);
      this.zzqH = AdRequestParcel.CREATOR.zzb(localParcel);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new IOException("Malformed QueueSeed encoding.");
    }
    finally
    {
      localParcel.recycle();
    }
  }

  String zzem()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      byte[] arrayOfByte1 = this.zzpS.getBytes("UTF-8");
      String str1 = Base64.encodeToString(arrayOfByte1, 0);
      String str2 = Integer.toString(this.zzAC);
      this.zzqH.writeToParcel(localParcel, 0);
      byte[] arrayOfByte2 = localParcel.marshall();
      String str3 = Base64.encodeToString(arrayOfByte2, 0);
      String str4 = str1 + "" + str2 + "" + str3;
      return str4;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      zzin.e("QueueSeed encode failed because UTF-8 is not available.");
    }
    finally
    {
      localParcel.recycle();
    }
    return "";
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzec
 * JD-Core Version:    0.6.0
 */