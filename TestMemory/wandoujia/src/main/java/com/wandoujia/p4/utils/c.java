package com.wandoujia.p4.utils;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask.Status;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.at;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.e;
import com.google.zxing.oned.i;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.p4.fragment.l;
import com.wandoujia.push2.LogHelper;
import com.wandoujia.ripple_framework.view.a.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c
  implements com.google.zxing.d
{
  private Map<DecodeHintType, ?> a;
  private com.google.zxing.d[] b;

  public static View a(Context paramContext, int paramInt)
  {
    View localView = LayoutInflater.from(paramContext).inflate(paramInt, null);
    com.wandoujia.nirvana.framework.ui.c.b.a(localView, paramInt);
    return localView;
  }

  private static View a(ViewPager paramViewPager)
  {
    at localat = paramViewPager.getAdapter();
    if ((localat != null) && ((localat instanceof l)))
    {
      Fragment localFragment = ((l)localat).b(paramViewPager.getCurrentItem());
      if (localFragment == null)
        return null;
      return localFragment.getView();
    }
    int i = paramViewPager.getScrollX();
    int j = i + paramViewPager.getWidth();
    for (int k = 0; k < paramViewPager.getChildCount(); k++)
    {
      View localView = paramViewPager.getChildAt(k);
      int m = localView.getLeft();
      int n = localView.getRight();
      if ((m >= i) && (n <= j))
        return localView;
    }
    return null;
  }

  public static View a(ViewGroup paramViewGroup, int paramInt)
  {
    View localView = LayoutInflater.from(paramViewGroup.getContext()).inflate(paramInt, paramViewGroup, false);
    com.wandoujia.nirvana.framework.ui.c.b.a(localView, paramInt);
    return localView;
  }

  public static void a(Activity paramActivity)
  {
    a(paramActivity.findViewById(16908290), true);
  }

  public static void a(Context paramContext)
  {
    com.wandoujia.p4.a.d().post(new t(paramContext));
  }

  public static void a(Context paramContext, int paramInt1, int paramInt2)
  {
    com.wandoujia.p4.a.d().post(new v(paramContext, paramInt1, paramInt2));
  }

  public static void a(View paramView, String paramString)
  {
    Context localContext = paramView.getContext();
    if (((localContext instanceof Activity)) && (android.support.v4.app.b.a((Activity)localContext)))
      new com.wandoujia.phoenix2.av.view.a().a(paramView, new d(localContext, paramString));
  }

  private static void a(View paramView, boolean paramBoolean)
  {
    AsyncImageView localAsyncImageView;
    if ((paramView instanceof AsyncImageView))
    {
      localAsyncImageView = (AsyncImageView)paramView;
      if ((paramBoolean) && (localAsyncImageView.getStatus() != AsyncTask.Status.FINISHED))
        localAsyncImageView.b();
    }
    while (true)
    {
      return;
      if (localAsyncImageView.getStatus() == AsyncTask.Status.FINISHED)
        continue;
      localAsyncImageView.a();
      return;
      if (!(paramView instanceof ViewGroup))
        break;
      ViewGroup localViewGroup = (ViewGroup)paramView;
      for (int i = 0; i < localViewGroup.getChildCount(); i++)
        a(localViewGroup.getChildAt(i), paramBoolean);
    }
  }

  public static void a(AbsListView paramAbsListView)
  {
    if (paramAbsListView == null)
      return;
    paramAbsListView.setTag(2131492914, Boolean.valueOf(true));
  }

  public static void a(CharSequence paramCharSequence, int paramInt)
  {
    com.wandoujia.p4.a.d().post(new u(paramCharSequence, paramInt));
  }

  private e b(com.google.zxing.b paramb)
  {
    if (this.b != null)
    {
      com.google.zxing.d[] arrayOfd = this.b;
      int i = arrayOfd.length;
      int j = 0;
      while (j < i)
      {
        com.google.zxing.d locald = arrayOfd[j];
        try
        {
          e locale = locald.a(paramb, this.a);
          return locale;
        }
        catch (ReaderException localReaderException)
        {
          j++;
        }
      }
    }
    throw NotFoundException.getNotFoundInstance();
  }

  public static void b(Activity paramActivity)
  {
    a(paramActivity.findViewById(16908290), false);
  }

  public static boolean b(Context paramContext)
  {
    if (!(paramContext instanceof Activity))
      return false;
    View localView1 = ((Activity)paramContext).getWindow().getDecorView();
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(localView1);
    while (true)
    {
      ViewGroup localViewGroup;
      if (!localLinkedList.isEmpty())
      {
        View localView2 = (View)localLinkedList.remove(0);
        if ((localView2 instanceof AbsListView))
        {
          if (localView2.getVisibility() != 0)
            continue;
          Object localObject = localView2.getTag(2131492914);
          if ((!(localObject instanceof Boolean)) || (!((Boolean)localObject).booleanValue()))
            continue;
          AbsListView localAbsListView = (AbsListView)localView2;
          if (localAbsListView.getFirstVisiblePosition() == 0)
          {
            View localView4 = localAbsListView.getChildAt(0);
            if ((localView4 == null) || (localView4.getTop() == localAbsListView.getPaddingTop()))
              break;
          }
          if (SystemUtil.aboveApiLevel(8))
          {
            localAbsListView.smoothScrollBy(0, 0);
            if (Math.abs(0 + localAbsListView.getFirstVisiblePosition()) <= 5)
              localAbsListView.smoothScrollToPosition(0);
          }
          while (true)
          {
            return true;
            localAbsListView.setSelection(0);
            continue;
            localAbsListView.setSelection(0);
          }
        }
        if (!(localView2 instanceof ViewGroup))
          continue;
        localViewGroup = (ViewGroup)localView2;
        if ((localViewGroup instanceof ViewPager))
        {
          View localView3 = a((ViewPager)localViewGroup);
          if (localView3 == null)
            continue;
          localLinkedList.add(localView3);
          continue;
        }
      }
      else
      {
        break;
      }
      for (int i = 0; i < localViewGroup.getChildCount(); i++)
        localLinkedList.add(localViewGroup.getChildAt(i));
    }
  }

  public static void c(Activity paramActivity)
  {
    new h(paramActivity).a(2131624899).b(2131624898).a(2131624897, new w()).b(2131624330, null).a().show();
  }

  public final e a(com.google.zxing.b paramb)
  {
    if (this.b == null)
      a(null);
    return b(paramb);
  }

  public final e a(com.google.zxing.b paramb, Map<DecodeHintType, ?> paramMap)
  {
    a(paramMap);
    return b(paramb);
  }

  public final void a()
  {
    if (this.b != null)
    {
      com.google.zxing.d[] arrayOfd = this.b;
      int i = arrayOfd.length;
      for (int j = 0; j < i; j++)
        arrayOfd[j].a();
    }
  }

  public final void a(Map<DecodeHintType, ?> paramMap)
  {
    this.a = paramMap;
    int i;
    if ((paramMap != null) && (paramMap.containsKey(DecodeHintType.TRY_HARDER)))
    {
      i = 1;
      if (paramMap != null)
        break label524;
    }
    label524: for (Collection localCollection = null; ; localCollection = (Collection)paramMap.get(DecodeHintType.POSSIBLE_FORMATS))
    {
      ArrayList localArrayList = new ArrayList();
      if (localCollection != null)
      {
        int j;
        if ((!localCollection.contains(BarcodeFormat.UPC_A)) && (!localCollection.contains(BarcodeFormat.UPC_E)) && (!localCollection.contains(BarcodeFormat.EAN_13)) && (!localCollection.contains(BarcodeFormat.EAN_8)) && (!localCollection.contains(BarcodeFormat.CODABAR)) && (!localCollection.contains(BarcodeFormat.CODE_39)) && (!localCollection.contains(BarcodeFormat.CODE_93)) && (!localCollection.contains(BarcodeFormat.CODE_128)) && (!localCollection.contains(BarcodeFormat.ITF)) && (!localCollection.contains(BarcodeFormat.RSS_14)))
        {
          boolean bool = localCollection.contains(BarcodeFormat.RSS_EXPANDED);
          j = 0;
          if (!bool);
        }
        else
        {
          j = 1;
        }
        if ((j != 0) && (i == 0))
          localArrayList.add(new i(paramMap));
        if (localCollection.contains(BarcodeFormat.QR_CODE))
          localArrayList.add(new com.google.zxing.qrcode.a());
        if (localCollection.contains(BarcodeFormat.DATA_MATRIX))
          localArrayList.add(new com.google.zxing.datamatrix.a());
        if (localCollection.contains(BarcodeFormat.AZTEC))
          localArrayList.add(new LogHelper());
        if (localCollection.contains(BarcodeFormat.PDF_417))
          localArrayList.add(new com.google.android.gms.common.data.b());
        if (localCollection.contains(BarcodeFormat.MAXICODE))
          localArrayList.add(new com.google.zxing.a.a());
        if ((j != 0) && (i != 0))
          localArrayList.add(new i(paramMap));
      }
      if (localArrayList.isEmpty())
      {
        if (i == 0)
          localArrayList.add(new i(paramMap));
        localArrayList.add(new com.google.zxing.qrcode.a());
        localArrayList.add(new com.google.zxing.datamatrix.a());
        localArrayList.add(new LogHelper());
        localArrayList.add(new com.google.android.gms.common.data.b());
        localArrayList.add(new com.google.zxing.a.a());
        if (i != 0)
          localArrayList.add(new i(paramMap));
      }
      this.b = ((com.google.zxing.d[])localArrayList.toArray(new com.google.zxing.d[localArrayList.size()]));
      return;
      i = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.c
 * JD-Core Version:    0.6.0
 */