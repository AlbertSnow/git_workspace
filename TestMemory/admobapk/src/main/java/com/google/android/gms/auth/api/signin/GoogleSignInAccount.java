package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import anw;
import aod;
import aom;
import aon;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import nl;
import nm;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new nm();
  private static aom m = aon.d();
  private static Comparator n = new nl();
  final int a;
  String b;
  String c;
  String d;
  String e;
  Uri f;
  String g;
  long h;
  String i;
  List j;
  String k;
  String l;

  public GoogleSignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, long paramLong, String paramString6, List paramList, String paramString7, String paramString8)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramUri;
    this.g = paramString5;
    this.h = paramLong;
    this.i = paramString6;
    this.j = paramList;
    this.k = paramString7;
    this.l = paramString8;
  }

  public static GoogleSignInAccount a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    JSONObject localJSONObject = new JSONObject(paramString);
    String str1 = localJSONObject.optString("photoUrl", null);
    boolean bool = TextUtils.isEmpty(str1);
    Uri localUri = null;
    if (!bool)
      localUri = Uri.parse(str1);
    long l1 = Long.parseLong(localJSONObject.getString("expirationTime"));
    HashSet localHashSet = new HashSet();
    JSONArray localJSONArray = localJSONObject.getJSONArray("grantedScopes");
    int i1 = localJSONArray.length();
    for (int i2 = 0; i2 < i1; i2++)
      localHashSet.add(new Scope(localJSONArray.getString(i2)));
    String str2 = localJSONObject.optString("id");
    String str3 = localJSONObject.optString("tokenId", null);
    String str4 = localJSONObject.optString("email", null);
    String str5 = localJSONObject.optString("displayName", null);
    String str6 = localJSONObject.optString("givenName", null);
    String str7 = localJSONObject.optString("familyName", null);
    Long localLong1 = Long.valueOf(l1);
    String str8 = localJSONObject.getString("obfuscatedIdentifier");
    if (localLong1 == null);
    for (Long localLong2 = Long.valueOf(m.a() / 1000L); ; localLong2 = localLong1)
    {
      GoogleSignInAccount localGoogleSignInAccount = new GoogleSignInAccount(3, str2, str3, str4, str5, localUri, null, localLong2.longValue(), anw.a(str8), new ArrayList((Collection)anw.a(localHashSet)), str6, str7);
      localGoogleSignInAccount.g = localJSONObject.optString("serverAuthCode", null);
      return localGoogleSignInAccount;
    }
  }

  private final JSONObject a()
  {
    JSONObject localJSONObject = new JSONObject();
    JSONArray localJSONArray;
    try
    {
      if (this.b != null)
        localJSONObject.put("id", this.b);
      if (this.c != null)
        localJSONObject.put("tokenId", this.c);
      if (this.d != null)
        localJSONObject.put("email", this.d);
      if (this.e != null)
        localJSONObject.put("displayName", this.e);
      if (this.k != null)
        localJSONObject.put("givenName", this.k);
      if (this.l != null)
        localJSONObject.put("familyName", this.l);
      if (this.f != null)
        localJSONObject.put("photoUrl", this.f.toString());
      if (this.g != null)
        localJSONObject.put("serverAuthCode", this.g);
      localJSONObject.put("expirationTime", this.h);
      localJSONObject.put("obfuscatedIdentifier", this.i);
      localJSONArray = new JSONArray();
      Collections.sort(this.j, n);
      Iterator localIterator = this.j.iterator();
      while (localIterator.hasNext())
        localJSONArray.put(((Scope)localIterator.next()).b);
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
    localJSONObject.put("grantedScopes", localJSONArray);
    return localJSONObject;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof GoogleSignInAccount))
      return false;
    return ((GoogleSignInAccount)paramObject).a().toString().equals(a().toString());
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, false);
    aod.a(paramParcel, 3, this.c, false);
    aod.a(paramParcel, 4, this.d, false);
    aod.a(paramParcel, 5, this.e, false);
    aod.a(paramParcel, 6, this.f, paramInt, false);
    aod.a(paramParcel, 7, this.g, false);
    aod.a(paramParcel, 8, this.h);
    aod.a(paramParcel, 9, this.i, false);
    aod.b(paramParcel, 10, this.j, false);
    aod.a(paramParcel, 11, this.k, false);
    aod.a(paramParcel, 12, this.l, false);
    aod.b(paramParcel, i1);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.signin.GoogleSignInAccount
 * JD-Core Version:    0.6.0
 */