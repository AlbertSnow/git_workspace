package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FieldMappingDictionary$Entry
  implements SafeParcelable
{
  public static final e CREATOR = new e();
  final int a;
  final String b;
  final ArrayList<FieldMappingDictionary.FieldMapPair> c;

  FieldMappingDictionary$Entry(int paramInt, String paramString, ArrayList<FieldMappingDictionary.FieldMapPair> paramArrayList)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramArrayList;
  }

  FieldMappingDictionary$Entry(String paramString, Map<String, FastJsonResponse.Field<?, ?>> paramMap)
  {
    this.a = 1;
    this.b = paramString;
    this.c = a(paramMap);
  }

  private static ArrayList<FieldMappingDictionary.FieldMapPair> a(Map<String, FastJsonResponse.Field<?, ?>> paramMap)
  {
    if (paramMap == null)
      return null;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new FieldMappingDictionary.FieldMapPair(str, (FastJsonResponse.Field)paramMap.get(str)));
    }
    return localArrayList;
  }

  final HashMap<String, FastJsonResponse.Field<?, ?>> a()
  {
    HashMap localHashMap = new HashMap();
    int i = this.c.size();
    for (int j = 0; j < i; j++)
    {
      FieldMappingDictionary.FieldMapPair localFieldMapPair = (FieldMappingDictionary.FieldMapPair)this.c.get(j);
      localHashMap.put(localFieldMapPair.b, localFieldMapPair.c);
    }
    return localHashMap;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.server.response.FieldMappingDictionary.Entry
 * JD-Core Version:    0.6.0
 */