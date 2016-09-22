package com.wandoujia.ripple_framework.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.ripple_framework.view.Anchor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DetailInfo
  implements Parcelable
{
  public static final Parcelable.Creator<DetailInfo> CREATOR = new b();
  private Anchor a;
  private String b;
  private int c;
  private long d;
  private int e;
  private a<Model> f;
  private int g;

  private DetailInfo(Parcel paramParcel)
  {
    this.b = paramParcel.readString();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readLong();
    this.e = paramParcel.readInt();
    if (paramParcel.readInt() > 0)
      this.a = ((Anchor)paramParcel.readParcelable(Anchor.class.getClassLoader()));
  }

  public DetailInfo(String paramString, View paramView, long paramLong, int paramInt)
  {
    this.b = paramString;
    this.c = 0;
    this.d = paramLong;
    this.e = paramInt;
    if (paramView != null)
      this.a = new Anchor(paramView);
  }

  private static int a(List<Model> paramList, long paramLong)
  {
    for (int i = 0; i < paramList.size(); i++)
      if (((Model)paramList.get(i)).e() == paramLong)
        return i;
    return -1;
  }

  public static DetailInfo a(h paramh, Bundle paramBundle)
  {
    DetailInfo localDetailInfo = (DetailInfo)paramBundle.getParcelable("detail");
    a locala = paramh.findList(localDetailInfo.b);
    if (locala != null)
      localDetailInfo.a(locala.c());
    return localDetailInfo;
  }

  private static Model a(Model paramModel, List<Model> paramList, Set<ContentTypeEnum.ContentType> paramSet)
  {
    if (paramSet.contains(paramModel.f()));
    while (true)
    {
      if (paramModel != null)
        paramList.add(paramModel);
      return paramModel;
      paramModel = null;
    }
  }

  private Set<ContentTypeEnum.ContentType> a(Model paramModel)
  {
    HashSet localHashSet = new HashSet();
    if ((0x40 & this.e) != 0)
      localHashSet.add(paramModel.f());
    if ((0x2 & this.e) != 0)
      localHashSet.add(ContentTypeEnum.ContentType.APP);
    if ((0x4 & this.e) != 0)
      localHashSet.add(ContentTypeEnum.ContentType.FEED);
    return localHashSet;
  }

  private void b(List<Model> paramList)
  {
    if (this.c < 0);
    Model localModel1;
    while (true)
    {
      return;
      localModel1 = (Model)paramList.get(this.c);
      if ((0x100 & this.e) == 0)
        break;
      if (localModel1.e() != this.d)
        continue;
      this.f = new i(localModel1, this.b);
      this.g = 0;
      return;
    }
    ArrayList localArrayList = new ArrayList();
    Set localSet = a(localModel1);
    int i = 0x8 & this.e;
    int j = 0;
    if (i != 0)
      j = 1;
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
    {
      Model localModel2 = (Model)localIterator1.next();
      a(localModel2, localArrayList, localSet);
      if (j == 0)
        continue;
      Iterator localIterator2 = localModel2.B().iterator();
      while (localIterator2.hasNext())
        a((Model)localIterator2.next(), localArrayList, localSet);
    }
    this.f = new i(localArrayList, this.b);
    this.g = a(localArrayList, this.d);
  }

  public final void a(List<Model> paramList)
  {
    this.f = null;
    this.g = -1;
    if (this.c >= paramList.size());
    label139: label214: label609: label612: 
    while (true)
    {
      return;
      if ((0x1 & this.e) != 0)
      {
        if ((this.c < 0) || (((Model)paramList.get(this.c)).e() != this.d))
          continue;
        this.f = new i(((Model)paramList.get(this.c)).m(), this.b);
        this.g = 0;
        return;
      }
      if ((0x10 & this.e) != 0)
      {
        if (this.c < 0)
          continue;
        List localList = ((Model)paramList.get(this.c)).z();
        int i1 = 0;
        if (i1 < localList.size())
          if (((Model)localList.get(i1)).e() == this.d)
          {
            if ((0x200 & this.e) == 0)
              break label214;
            this.f = new i(localList, this.b);
          }
        for (this.g = i1; ; this.g = 0)
        {
          i1++;
          break label139;
          break;
          this.f = new i((Model)localList.get(i1), this.b);
        }
      }
      int i;
      int j;
      if ((0x20 & this.e) != 0)
      {
        i = this.c;
        if (i >= 0)
          break label609;
        i = a(paramList, this.d);
        if (i >= 0)
          j = i;
      }
      while (true)
      {
        if ((j < 0) || (j >= paramList.size()))
          break label612;
        Model localModel = (Model)paramList.get(j);
        if (localModel.e() != this.d)
          break;
        if ((0x100 & this.e) != 0)
        {
          this.f = new i(localModel, this.b);
          this.g = 0;
          return;
          int n = 0;
          while (true)
          {
            if (n >= paramList.size())
              break label609;
            j = a(((Model)paramList.get(n)).B(), this.d);
            if (j >= 0)
            {
              paramList = ((Model)paramList.get(n)).B();
              break;
            }
            n++;
            i = j;
          }
        }
        Set localSet = a(localModel);
        ArrayList localArrayList = new ArrayList();
        for (int k = j - 1; (k >= 0) && (((Model)paramList.get(k)).c() == localModel.c()); k--)
          a((Model)paramList.get(k), localArrayList, localSet);
        Collections.reverse(localArrayList);
        this.g = localArrayList.size();
        localArrayList.add(localModel);
        for (int m = j + 1; (m < paramList.size()) && (((Model)paramList.get(m)).c() == localModel.c()); m++)
          a((Model)paramList.get(m), localArrayList, localSet);
        this.f = new i(localArrayList, this.b);
        return;
        b(paramList);
        return;
        j = i;
      }
    }
  }

  public final boolean a()
  {
    if ((this.f == null) || (this.f.c() == null))
      return false;
    if ((this.g < 0) || (this.g >= this.f.c().size()))
      return false;
    if ((this.f.a(this.g) == null) || (((Model)this.f.a(this.g)).f() == null))
      return false;
    switch (c.a[((Model)this.f.a(this.g)).f().ordinal()])
    {
    default:
      return false;
    case 1:
    case 2:
    }
    return true;
  }

  public final List<Model> b()
  {
    return this.f.c();
  }

  public final int c()
  {
    return this.g;
  }

  public final Anchor d()
  {
    return this.a;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeLong(this.d);
    paramParcel.writeInt(this.e);
    if (this.a != null)
    {
      paramParcel.writeInt(1);
      paramParcel.writeParcelable(this.a, paramInt);
      return;
    }
    paramParcel.writeInt(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.model.DetailInfo
 * JD-Core Version:    0.6.0
 */