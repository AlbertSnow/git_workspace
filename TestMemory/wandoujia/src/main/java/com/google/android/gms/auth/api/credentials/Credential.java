package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

public class Credential
  implements SafeParcelable
{
  public static final Parcelable.Creator<Credential> CREATOR = new a();
  final int a;
  private final String b;
  private final String c;
  private final String d;
  private final String e;
  private final Uri f;
  private final List<IdToken> g;
  private final String h;
  private final String i;

  Credential(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, List<IdToken> paramList, String paramString5, String paramString6)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = ((String)d.a(paramString3));
    this.e = paramString4;
    this.f = paramUri;
    if (paramList == null);
    for (List localList = Collections.emptyList(); ; localList = Collections.unmodifiableList(paramList))
    {
      this.g = localList;
      this.h = paramString5;
      this.i = paramString6;
      return;
    }
  }

  public final String a()
  {
    return this.b;
  }

  public final String b()
  {
    return this.c;
  }

  public final String c()
  {
    return this.d;
  }

  public final String d()
  {
    return this.e;
  }

  public int describeContents()
  {
    return 0;
  }

  public final Uri e()
  {
    return this.f;
  }

  public final List<IdToken> f()
  {
    return this.g;
  }

  public final String g()
  {
    return this.h;
  }

  public final String h()
  {
    return this.i;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.Credential
 * JD-Core Version:    0.6.0
 */