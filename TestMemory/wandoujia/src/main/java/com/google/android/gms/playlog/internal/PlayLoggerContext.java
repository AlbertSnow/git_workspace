package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public class PlayLoggerContext
  implements SafeParcelable
{
  public static final b CREATOR = new b();
  public final int a;
  public final String b;
  public final int c;
  public final int d;
  public final String e;
  public final String f;
  public final boolean g;
  public final String h;
  public final boolean i;

  public PlayLoggerContext(int paramInt1, String paramString1, int paramInt2, int paramInt3, String paramString2, String paramString3, boolean paramBoolean1, String paramString4, boolean paramBoolean2)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramBoolean1;
    this.h = paramString4;
    this.i = paramBoolean2;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    while (true)
    {
      return true;
      if (!(paramObject instanceof PlayLoggerContext))
        break;
      PlayLoggerContext localPlayLoggerContext = (PlayLoggerContext)paramObject;
      if ((this.a != localPlayLoggerContext.a) || (!this.b.equals(localPlayLoggerContext.b)) || (this.c != localPlayLoggerContext.c) || (this.d != localPlayLoggerContext.d) || (!p.a(this.h, localPlayLoggerContext.h)) || (!p.a(this.e, localPlayLoggerContext.e)) || (!p.a(this.f, localPlayLoggerContext.f)) || (this.g != localPlayLoggerContext.g) || (this.i != localPlayLoggerContext.i))
        return false;
    }
    return false;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = this.b;
    arrayOfObject[2] = Integer.valueOf(this.c);
    arrayOfObject[3] = Integer.valueOf(this.d);
    arrayOfObject[4] = this.h;
    arrayOfObject[5] = this.e;
    arrayOfObject[6] = this.f;
    arrayOfObject[7] = Boolean.valueOf(this.g);
    arrayOfObject[8] = Boolean.valueOf(this.i);
    return Arrays.hashCode(arrayOfObject);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PlayLoggerContext[");
    localStringBuilder.append("versionCode=").append(this.a).append(',');
    localStringBuilder.append("package=").append(this.b).append(',');
    localStringBuilder.append("packageVersionCode=").append(this.c).append(',');
    localStringBuilder.append("logSource=").append(this.d).append(',');
    localStringBuilder.append("logSourceName=").append(this.h).append(',');
    localStringBuilder.append("uploadAccount=").append(this.e).append(',');
    localStringBuilder.append("loggingId=").append(this.f).append(',');
    localStringBuilder.append("logAndroidId=").append(this.g).append(',');
    localStringBuilder.append("isAnonymous=").append(this.i);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.playlog.internal.PlayLoggerContext
 * JD-Core Version:    0.6.0
 */