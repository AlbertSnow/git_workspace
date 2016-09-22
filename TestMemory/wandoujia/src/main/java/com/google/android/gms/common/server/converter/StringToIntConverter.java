package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class StringToIntConverter
  implements SafeParcelable, a<String, Integer>
{
  public static final b CREATOR = new b();
  private final int a;
  private final HashMap<String, Integer> b;
  private final HashMap<Integer, String> c;

  public StringToIntConverter()
  {
    this.a = 1;
    this.b = new HashMap();
    this.c = new HashMap();
  }

  StringToIntConverter(int paramInt, ArrayList<StringToIntConverter.Entry> paramArrayList)
  {
    this.a = paramInt;
    this.b = new HashMap();
    this.c = new HashMap();
    a(paramArrayList);
  }

  private void a(ArrayList<StringToIntConverter.Entry> paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      StringToIntConverter.Entry localEntry = (StringToIntConverter.Entry)localIterator.next();
      String str = localEntry.b;
      int i = localEntry.c;
      this.b.put(str, Integer.valueOf(i));
      this.c.put(Integer.valueOf(i), str);
    }
  }

  final int a()
  {
    return this.a;
  }

  final ArrayList<StringToIntConverter.Entry> b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new StringToIntConverter.Entry(str, ((Integer)this.b.get(str)).intValue()));
    }
    return localArrayList;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.server.converter.StringToIntConverter
 * JD-Core Version:    0.6.0
 */