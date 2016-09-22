package com.squareup.wire;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

final class UnknownFieldMap
{
  Map<Integer, List<p>> a;

  UnknownFieldMap()
  {
  }

  UnknownFieldMap(UnknownFieldMap paramUnknownFieldMap)
  {
    if (paramUnknownFieldMap.a != null)
      a().putAll(paramUnknownFieldMap.a);
  }

  private Map<Integer, List<p>> a()
  {
    if (this.a == null)
      this.a = new TreeMap();
    return this.a;
  }

  private static <T> void a(Map<Integer, List<p>> paramMap, int paramInt, T paramT, WireType paramWireType)
  {
    List localList = (List)paramMap.get(Integer.valueOf(paramInt));
    ArrayList localArrayList;
    if (localList == null)
    {
      localArrayList = new ArrayList();
      paramMap.put(Integer.valueOf(paramInt), localArrayList);
    }
    for (Object localObject1 = localArrayList; ; localObject1 = localList)
    {
      Object localObject2;
      switch (o.a[paramWireType.ordinal()])
      {
      default:
        throw new IllegalArgumentException("Unsupported wireType = " + paramWireType);
      case 1:
        localObject2 = new t((Long)paramT);
      case 2:
      case 3:
      case 4:
      }
      while ((((List)localObject1).size() > 0) && (((p)((List)localObject1).get(0)).b() != ((p)localObject2).b()))
      {
        throw new IllegalStateException("Wire type differs from previous type for tag");
        localObject2 = new q((Integer)paramT);
        continue;
        localObject2 = new r((Long)paramT);
        continue;
        localObject2 = new s((ByteString)paramT);
      }
      ((List)localObject1).add(localObject2);
      return;
    }
  }

  final void a(int paramInt, ByteString paramByteString)
  {
    a(a(), paramInt, paramByteString, WireType.LENGTH_DELIMITED);
  }

  final void a(int paramInt, Integer paramInteger)
  {
    a(a(), paramInt, paramInteger, WireType.FIXED32);
  }

  final void a(int paramInt, Long paramLong)
  {
    a(a(), paramInt, paramLong, WireType.VARINT);
  }

  final void b(int paramInt, Long paramLong)
  {
    a(a(), paramInt, paramLong, WireType.FIXED64);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.UnknownFieldMap
 * JD-Core Version:    0.6.0
 */