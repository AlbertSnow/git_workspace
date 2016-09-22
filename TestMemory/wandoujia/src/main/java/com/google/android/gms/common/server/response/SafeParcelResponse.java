package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.b;
import android.support.v4.app.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.internal.t;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SafeParcelResponse extends FastJsonResponse
  implements SafeParcelable
{
  public static final f CREATOR = new f();
  private final int a;
  private final Parcel b;
  private final FieldMappingDictionary c;
  private final String d;
  private int e;
  private int f;

  SafeParcelResponse(int paramInt, Parcel paramParcel, FieldMappingDictionary paramFieldMappingDictionary)
  {
    this.a = paramInt;
    this.b = ((Parcel)d.a(paramParcel));
    this.c = paramFieldMappingDictionary;
    if (this.c == null);
    for (this.d = null; ; this.d = this.c.c())
    {
      this.e = 2;
      return;
    }
  }

  private static HashMap<String, String> a(Bundle paramBundle)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, paramBundle.getString(str));
    }
    return localHashMap;
  }

  private static void a(StringBuilder paramStringBuilder, int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Unknown type = " + paramInt);
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
      paramStringBuilder.append(paramObject);
      return;
    case 7:
      paramStringBuilder.append("\"").append(t.a(paramObject.toString())).append("\"");
      return;
    case 8:
      paramStringBuilder.append("\"").append(b.b((byte[])paramObject)).append("\"");
      return;
    case 9:
      paramStringBuilder.append("\"").append(b.c((byte[])paramObject));
      paramStringBuilder.append("\"");
      return;
    case 10:
      b.a(paramStringBuilder, (HashMap)paramObject);
      return;
    case 11:
    }
    throw new IllegalArgumentException("Method does not accept concrete type.");
  }

  private void a(StringBuilder paramStringBuilder, FastJsonResponse.Field<?, ?> paramField, Parcel paramParcel, int paramInt)
  {
    int i = 0;
    if (paramField.e())
    {
      paramStringBuilder.append("[");
      int i11;
      int i12;
      int[] arrayOfInt;
      int i8;
      int i9;
      Object localObject;
      switch (paramField.d())
      {
      default:
        throw new IllegalStateException("Unknown field type out.");
      case 0:
        i11 = b.a(paramParcel, paramInt);
        i12 = paramParcel.dataPosition();
        arrayOfInt = null;
        if (i11 != 0)
          break;
      case 1:
        while (true)
        {
          int i13 = arrayOfInt.length;
          while (true)
            if (i < i13)
            {
              if (i != 0)
                paramStringBuilder.append(",");
              paramStringBuilder.append(Integer.toString(arrayOfInt[i]));
              i++;
              continue;
              arrayOfInt = paramParcel.createIntArray();
              paramParcel.setDataPosition(i11 + i12);
              break;
              i8 = b.a(paramParcel, paramInt);
              i9 = paramParcel.dataPosition();
              localObject = null;
              if (i8 != 0)
                break label213;
              b.a(paramStringBuilder, localObject);
            }
        }
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      }
      while (true)
      {
        paramStringBuilder.append("]");
        return;
        label213: int i10 = paramParcel.readInt();
        localObject = new BigInteger[i10];
        while (i < i10)
        {
          localObject[i] = new BigInteger(paramParcel.createByteArray());
          i++;
        }
        paramParcel.setDataPosition(i8 + i9);
        break;
        int i6 = b.a(paramParcel, paramInt);
        int i7 = paramParcel.dataPosition();
        long[] arrayOfLong = null;
        if (i6 == 0);
        while (true)
        {
          b.a(paramStringBuilder, arrayOfLong);
          break;
          arrayOfLong = paramParcel.createLongArray();
          paramParcel.setDataPosition(i6 + i7);
        }
        int i4 = b.a(paramParcel, paramInt);
        int i5 = paramParcel.dataPosition();
        float[] arrayOfFloat = null;
        if (i4 == 0);
        while (true)
        {
          b.a(paramStringBuilder, arrayOfFloat);
          break;
          arrayOfFloat = paramParcel.createFloatArray();
          paramParcel.setDataPosition(i4 + i5);
        }
        int i2 = b.a(paramParcel, paramInt);
        int i3 = paramParcel.dataPosition();
        double[] arrayOfDouble = null;
        if (i2 == 0);
        while (true)
        {
          b.a(paramStringBuilder, arrayOfDouble);
          break;
          arrayOfDouble = paramParcel.createDoubleArray();
          paramParcel.setDataPosition(i2 + i3);
        }
        b.a(paramStringBuilder, b.n(paramParcel, paramInt));
        continue;
        int n = b.a(paramParcel, paramInt);
        int i1 = paramParcel.dataPosition();
        boolean[] arrayOfBoolean = null;
        if (n == 0);
        while (true)
        {
          b.a(paramStringBuilder, arrayOfBoolean);
          break;
          arrayOfBoolean = paramParcel.createBooleanArray();
          paramParcel.setDataPosition(n + i1);
        }
        b.a(paramStringBuilder, b.o(paramParcel, paramInt));
        continue;
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
        Parcel[] arrayOfParcel = b.q(paramParcel, paramInt);
        int k = arrayOfParcel.length;
        for (int m = 0; m < k; m++)
        {
          if (m > 0)
            paramStringBuilder.append(",");
          arrayOfParcel[m].setDataPosition(0);
          a(paramStringBuilder, paramField.l(), arrayOfParcel[m]);
        }
      }
    }
    switch (paramField.d())
    {
    default:
      throw new IllegalStateException("Unknown field type out");
    case 0:
      paramStringBuilder.append(b.d(paramParcel, paramInt));
      return;
    case 1:
      paramStringBuilder.append(b.f(paramParcel, paramInt));
      return;
    case 2:
      paramStringBuilder.append(b.e(paramParcel, paramInt));
      return;
    case 3:
      paramStringBuilder.append(b.g(paramParcel, paramInt));
      return;
    case 4:
      paramStringBuilder.append(b.h(paramParcel, paramInt));
      return;
    case 5:
      paramStringBuilder.append(b.i(paramParcel, paramInt));
      return;
    case 6:
      paramStringBuilder.append(b.c(paramParcel, paramInt));
      return;
    case 7:
      String str2 = b.j(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(t.a(str2)).append("\"");
      return;
    case 8:
      byte[] arrayOfByte2 = b.m(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(b.b(arrayOfByte2)).append("\"");
      return;
    case 9:
      byte[] arrayOfByte1 = b.m(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(b.c(arrayOfByte1));
      paramStringBuilder.append("\"");
      return;
    case 10:
      Bundle localBundle = b.l(paramParcel, paramInt);
      Set localSet = localBundle.keySet();
      localSet.size();
      paramStringBuilder.append("{");
      Iterator localIterator = localSet.iterator();
      for (int j = 1; localIterator.hasNext(); j = 0)
      {
        String str1 = (String)localIterator.next();
        if (j == 0)
          paramStringBuilder.append(",");
        paramStringBuilder.append("\"").append(str1).append("\"");
        paramStringBuilder.append(":");
        paramStringBuilder.append("\"").append(t.a(localBundle.getString(str1))).append("\"");
      }
      paramStringBuilder.append("}");
      return;
    case 11:
    }
    Parcel localParcel = b.p(paramParcel, paramInt);
    localParcel.setDataPosition(0);
    a(paramStringBuilder, paramField.l(), localParcel);
  }

  private static void a(StringBuilder paramStringBuilder, FastJsonResponse.Field<?, ?> paramField, Object paramObject)
  {
    if (paramField.c())
    {
      ArrayList localArrayList = (ArrayList)paramObject;
      paramStringBuilder.append("[");
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
      {
        if (j != 0)
          paramStringBuilder.append(",");
        a(paramStringBuilder, paramField.b(), localArrayList.get(j));
      }
      paramStringBuilder.append("]");
      return;
    }
    a(paramStringBuilder, paramField.b(), paramObject);
  }

  private void a(StringBuilder paramStringBuilder, Map<String, FastJsonResponse.Field<?, ?>> paramMap, Parcel paramParcel)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry2 = (Map.Entry)localIterator.next();
      localHashMap.put(Integer.valueOf(((FastJsonResponse.Field)localEntry2.getValue()).g()), localEntry2);
    }
    paramStringBuilder.append('{');
    int i = b.a(paramParcel);
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      Map.Entry localEntry1 = (Map.Entry)localHashMap.get(Integer.valueOf(0xFFFF & k));
      if (localEntry1 == null)
        continue;
      if (j != 0)
        paramStringBuilder.append(",");
      String str = (String)localEntry1.getKey();
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localEntry1.getValue();
      paramStringBuilder.append("\"").append(str).append("\":");
      if (localField.j())
        switch (localField.d())
        {
        default:
          throw new IllegalArgumentException("Unknown field out type = " + localField.d());
        case 0:
          a(paramStringBuilder, localField, a(localField, Integer.valueOf(b.d(paramParcel, k))));
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        }
      while (true)
      {
        j = 1;
        break;
        a(paramStringBuilder, localField, a(localField, b.f(paramParcel, k)));
        continue;
        a(paramStringBuilder, localField, a(localField, Long.valueOf(b.e(paramParcel, k))));
        continue;
        a(paramStringBuilder, localField, a(localField, Float.valueOf(b.g(paramParcel, k))));
        continue;
        a(paramStringBuilder, localField, a(localField, Double.valueOf(b.h(paramParcel, k))));
        continue;
        a(paramStringBuilder, localField, a(localField, b.i(paramParcel, k)));
        continue;
        a(paramStringBuilder, localField, a(localField, Boolean.valueOf(b.c(paramParcel, k))));
        continue;
        a(paramStringBuilder, localField, a(localField, b.j(paramParcel, k)));
        continue;
        a(paramStringBuilder, localField, a(localField, b.m(paramParcel, k)));
        continue;
        a(paramStringBuilder, localField, a(localField, a(b.l(paramParcel, k))));
        continue;
        throw new IllegalArgumentException("Method does not accept concrete type.");
        a(paramStringBuilder, localField, paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new zza.zza("Overread allowed size end=" + i, paramParcel);
    paramStringBuilder.append('}');
  }

  public final Map<String, FastJsonResponse.Field<?, ?>> a()
  {
    if (this.c == null)
      return null;
    return this.c.a(this.d);
  }

  protected final Object b()
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }

  protected final boolean c()
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }

  public final int d()
  {
    return this.a;
  }

  public int describeContents()
  {
    return 0;
  }

  public final Parcel e()
  {
    switch (this.e)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      return this.b;
      this.f = b.b(this.b);
      b.r(this.b, this.f);
      this.e = 2;
    }
  }

  final FieldMappingDictionary f()
  {
    return this.c;
  }

  public String toString()
  {
    d.a(this.c, "Cannot convert to JSON on client side.");
    Parcel localParcel = e();
    localParcel.setDataPosition(0);
    StringBuilder localStringBuilder = new StringBuilder(100);
    a(localStringBuilder, this.c.a(this.d), localParcel);
    return localStringBuilder.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.server.response.SafeParcelResponse
 * JD-Core Version:    0.6.0
 */