package android.support.v7.widget;

import java.util.Arrays;
import java.util.List;

final class df
{
  int a;
  boolean b;
  int[] d;
  List<StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> e;

  static void a()
  {
    if (null.d != null)
      Arrays.fill(null.d, -1);
    null.e = null;
  }

  static void a(int paramInt)
  {
    if (null.d == null)
    {
      null.d = new int[1 + Math.max(paramInt, 10)];
      Arrays.fill(null.d, -1);
    }
    do
      return;
    while (paramInt < null.d.length);
    int[] arrayOfInt = null.d;
    int i = null.d.length;
    while (i <= paramInt)
      i *= 2;
    null.d = new int[i];
    System.arraycopy(arrayOfInt, 0, null.d, 0, arrayOfInt.length);
    Arrays.fill(null.d, arrayOfInt.length, null.d.length, -1);
  }

  static void a(int paramInt1, int paramInt2)
  {
    if ((null.d == null) || (paramInt1 >= null.d.length));
    do
    {
      return;
      a(paramInt1 + paramInt2);
      System.arraycopy(null.d, paramInt1 + paramInt2, null.d, paramInt1, null.d.length - paramInt1 - paramInt2);
      Arrays.fill(null.d, null.d.length - paramInt2, null.d.length, -1);
    }
    while (null.e == null);
    int i = paramInt1 + paramInt2;
    int j = -1 + null.e.size();
    label90: StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem;
    if (j >= 0)
    {
      localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)null.e.get(j);
      if (localFullSpanItem.a >= paramInt1)
      {
        if (localFullSpanItem.a >= i)
          break label144;
        null.e.remove(j);
      }
    }
    while (true)
    {
      j--;
      break label90;
      break;
      label144: localFullSpanItem.a -= paramInt2;
    }
  }

  static void b(int paramInt1, int paramInt2)
  {
    if ((null.d == null) || (paramInt1 >= null.d.length));
    while (true)
    {
      return;
      a(paramInt1 + paramInt2);
      System.arraycopy(null.d, paramInt1, null.d, paramInt1 + paramInt2, null.d.length - paramInt1 - paramInt2);
      Arrays.fill(null.d, paramInt1, paramInt1 + paramInt2, -1);
      if (null.e == null)
        continue;
      for (int i = -1 + null.e.size(); i >= 0; i--)
      {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)null.e.get(i);
        if (localFullSpanItem.a < paramInt1)
          continue;
        localFullSpanItem.a = (paramInt2 + localFullSpanItem.a);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.df
 * JD-Core Version:    0.6.0
 */