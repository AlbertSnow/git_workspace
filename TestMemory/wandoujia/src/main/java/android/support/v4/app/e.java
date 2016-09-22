package android.support.v4.app;

import android.os.Build.VERSION;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.PrintWriter;
import java.util.ArrayList;

final class e extends ac
  implements Runnable
{
  private static boolean n;
  h a;
  int b;
  int c;
  int d;
  boolean e;
  String f;
  int g = -1;
  int h;
  CharSequence i;
  int j;
  CharSequence k;
  ArrayList<String> l;
  ArrayList<String> m;
  private s o;
  private h p;
  private boolean q = true;
  private boolean r;

  static
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (boolean bool = true; ; bool = false)
    {
      n = bool;
      return;
    }
  }

  public e(s params)
  {
    this.o = params;
  }

  private int a(boolean paramBoolean)
  {
    if (this.r)
      throw new IllegalStateException("commit already called");
    this.r = true;
    if (this.e);
    for (this.g = this.o.a(this); ; this.g = -1)
    {
      this.o.a(this, paramBoolean);
      return this.g;
    }
  }

  private i a(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2, boolean paramBoolean)
  {
    i locali = new i();
    locali.d = new View(this.o.g);
    int i1 = 0;
    int i2 = 0;
    int i3 = paramSparseArray1.size();
    int i4 = 0;
    if (i1 < i3)
      if (!a(paramSparseArray1.keyAt(i1), locali, paramBoolean, paramSparseArray1, paramSparseArray2))
        break label141;
    label141: for (int i6 = 1; ; i6 = i2)
    {
      i1++;
      i2 = i6;
      break;
      while (i4 < paramSparseArray2.size())
      {
        int i5 = paramSparseArray2.keyAt(i4);
        if ((paramSparseArray1.get(i5) == null) && (a(i5, locali, paramBoolean, paramSparseArray1, paramSparseArray2)))
          i2 = 1;
        i4++;
      }
      if (i2 == 0)
        locali = null;
      return locali;
    }
  }

  private android.support.v4.e.a<String, View> a(i parami, Fragment paramFragment, boolean paramBoolean)
  {
    android.support.v4.e.a locala = new android.support.v4.e.a();
    if (this.l != null)
    {
      b.a(locala, paramFragment.getView());
      if (!paramBoolean)
        break label66;
      locala.a(this.m);
    }
    while (paramBoolean)
    {
      if (paramFragment.mEnterTransitionCallback != null);
      a(parami, locala, false);
      return locala;
      label66: locala = a(this.l, this.m, locala);
    }
    if (paramFragment.mExitTransitionCallback != null);
    b(parami, locala, false);
    return locala;
  }

  private static android.support.v4.e.a<String, View> a(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, android.support.v4.e.a<String, View> parama)
  {
    if (parama.isEmpty())
      return parama;
    android.support.v4.e.a locala = new android.support.v4.e.a();
    int i1 = paramArrayList1.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = (View)parama.get(paramArrayList1.get(i2));
      if (localView == null)
        continue;
      locala.put(paramArrayList2.get(i2), localView);
    }
    return locala;
  }

  private void a(int paramInt1, Fragment paramFragment, String paramString, int paramInt2)
  {
    paramFragment.mFragmentManager = this.o;
    if (paramString != null)
    {
      if ((paramFragment.mTag != null) && (!paramString.equals(paramFragment.mTag)))
        throw new IllegalStateException("Can't change tag of fragment " + paramFragment + ": was " + paramFragment.mTag + " now " + paramString);
      paramFragment.mTag = paramString;
    }
    if (paramInt1 != 0)
    {
      if ((paramFragment.mFragmentId != 0) && (paramFragment.mFragmentId != paramInt1))
        throw new IllegalStateException("Can't change container ID of fragment " + paramFragment + ": was " + paramFragment.mFragmentId + " now " + paramInt1);
      paramFragment.mFragmentId = paramInt1;
      paramFragment.mContainerId = paramInt1;
    }
    h localh = new h();
    localh.c = paramInt2;
    localh.d = paramFragment;
    a(localh);
  }

  private void a(i parami, int paramInt, Object paramObject)
  {
    if (this.o.b != null)
    {
      int i1 = 0;
      if (i1 < this.o.b.size())
      {
        Fragment localFragment = (Fragment)this.o.b.get(i1);
        if ((localFragment.mView != null) && (localFragment.mContainer != null) && (localFragment.mContainerId == paramInt))
        {
          if (!localFragment.mHidden)
            break label122;
          if (!parami.b.contains(localFragment.mView))
          {
            b.a(paramObject, localFragment.mView, true);
            parami.b.add(localFragment.mView);
          }
        }
        while (true)
        {
          i1++;
          break;
          label122: b.a(paramObject, localFragment.mView, false);
          parami.b.remove(localFragment.mView);
        }
      }
    }
  }

  private void a(i parami, android.support.v4.e.a<String, View> parama, boolean paramBoolean)
  {
    int i1;
    int i2;
    label13: String str1;
    String str2;
    if (this.m == null)
    {
      i1 = 0;
      i2 = 0;
      if (i2 >= i1)
        return;
      str1 = (String)this.l.get(i2);
      View localView = (View)parama.get((String)this.m.get(i2));
      if (localView != null)
      {
        str2 = localView.getTransitionName();
        if (!paramBoolean)
          break label100;
        a(parami.a, str1, str2);
      }
    }
    while (true)
    {
      i2++;
      break label13;
      i1 = this.m.size();
      break;
      label100: a(parami.a, str2, str1);
    }
  }

  private static void a(android.support.v4.e.a<String, String> parama, String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null) && (!paramString1.equals(paramString2)));
    for (int i1 = 0; i1 < parama.size(); i1++)
    {
      if (!paramString1.equals(parama.c(i1)))
        continue;
      parama.a(i1, paramString2);
      return;
    }
    parama.put(paramString1, paramString2);
  }

  private static void a(SparseArray<Fragment> paramSparseArray, Fragment paramFragment)
  {
    if (paramFragment != null)
    {
      int i1 = paramFragment.mContainerId;
      if ((i1 != 0) && (!paramFragment.isHidden()) && (paramFragment.isAdded()) && (paramFragment.getView() != null) && (paramSparseArray.get(i1) == null))
        paramSparseArray.put(i1, paramFragment);
    }
  }

  private boolean a(int paramInt, i parami, boolean paramBoolean, SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    ViewGroup localViewGroup = (ViewGroup)this.o.h.a(paramInt);
    if (localViewGroup == null)
      return false;
    Fragment localFragment1 = (Fragment)paramSparseArray2.get(paramInt);
    Fragment localFragment2 = (Fragment)paramSparseArray1.get(paramInt);
    Object localObject2;
    Object localObject3;
    Object localObject5;
    if (localFragment1 == null)
    {
      localObject2 = null;
      if ((localFragment1 == null) || (localFragment2 == null))
      {
        localObject3 = null;
        if (localFragment2 != null)
          break label155;
        localObject5 = null;
        if ((localObject2 != null) || (localObject3 != null) || (localObject5 != null))
          break label186;
        return false;
      }
    }
    else
    {
      if (paramBoolean);
      for (Object localObject1 = localFragment1.getReenterTransition(); ; localObject1 = localFragment1.getEnterTransition())
      {
        localObject2 = b.a(localObject1);
        break;
      }
    }
    if (paramBoolean);
    for (Object localObject8 = localFragment2.getSharedElementReturnTransition(); ; localObject8 = localFragment1.getSharedElementEnterTransition())
    {
      localObject3 = b.a(localObject8);
      break;
    }
    label155: if (paramBoolean);
    for (Object localObject4 = localFragment2.getReturnTransition(); ; localObject4 = localFragment2.getExitTransition())
    {
      localObject5 = b.a(localObject4);
      break;
    }
    label186: ArrayList localArrayList1 = new ArrayList();
    android.support.v4.e.a locala1 = null;
    bn localbn;
    if (localObject3 != null)
    {
      locala1 = a(parami, localFragment2, paramBoolean);
      localArrayList1.add(parami.d);
      localArrayList1.addAll(locala1.values());
      if (!paramBoolean)
        break label723;
      localbn = localFragment2.mEnterTransitionCallback;
      if (localbn != null)
      {
        new ArrayList(locala1.keySet());
        new ArrayList(locala1.values());
      }
    }
    ArrayList localArrayList2 = new ArrayList();
    View localView1 = parami.d;
    if (localObject5 != null)
    {
      View localView5 = localFragment2.getView();
      localObject5 = b.a(localObject5, localView5, localArrayList2, locala1, localView1);
    }
    if ((this.m != null) && (locala1 != null))
    {
      View localView4 = (View)locala1.get(this.m.get(0));
      if (localView4 != null)
      {
        if (localObject5 != null)
          b.a(localObject5, localView4);
        if (localObject3 != null)
          b.a(localObject3, localView4);
      }
    }
    ah localah = new ah(localFragment1);
    if (localObject3 != null)
      localViewGroup.getViewTreeObserver().addOnPreDrawListener(new f(this, localViewGroup, localObject3, localArrayList1, parami, paramBoolean, localFragment1, localFragment2));
    ArrayList localArrayList3 = new ArrayList();
    android.support.v4.e.a locala2 = new android.support.v4.e.a();
    boolean bool;
    label450: Object localObject6;
    Transition localTransition1;
    Transition localTransition2;
    if (paramBoolean)
    {
      bool = localFragment1.getAllowReturnTransitionOverlap();
      localObject6 = (Transition)localObject2;
      localTransition1 = (Transition)localObject5;
      localTransition2 = (Transition)localObject3;
      if ((localObject6 == null) || (localTransition1 == null))
        break label846;
    }
    while (true)
    {
      Object localObject7;
      if (bool)
      {
        TransitionSet localTransitionSet = new TransitionSet();
        if (localObject6 != null)
          localTransitionSet.addTransition((Transition)localObject6);
        if (localTransition1 != null)
          localTransitionSet.addTransition(localTransition1);
        if (localTransition2 != null)
          localTransitionSet.addTransition(localTransition2);
        localObject7 = localTransitionSet;
      }
      while (true)
      {
        if (localObject7 != null)
        {
          View localView2 = parami.d;
          com.tencent.open.yyb.a locala = parami.c;
          android.support.v4.e.a locala3 = parami.a;
          b.a(localObject2, localObject3, localViewGroup, localah, localView2, locala, locala3, localArrayList3, locala2, localArrayList1);
          localViewGroup.getViewTreeObserver().addOnPreDrawListener(new g(this, localViewGroup, parami, paramInt, localObject7));
          b.a(localObject7, parami.d, true);
          a(parami, paramInt, localObject7);
          TransitionManager.beginDelayedTransition(localViewGroup, (Transition)localObject7);
          View localView3 = parami.d;
          ArrayList localArrayList4 = parami.b;
          Transition localTransition3 = (Transition)localObject2;
          Transition localTransition4 = (Transition)localObject5;
          Transition localTransition5 = (Transition)localObject3;
          Transition localTransition6 = (Transition)localObject7;
          if (localTransition6 != null)
            localViewGroup.getViewTreeObserver().addOnPreDrawListener(new ag(localViewGroup, localTransition3, localView3, localArrayList3, localTransition4, localArrayList2, localTransition5, localArrayList1, locala2, localArrayList4, localTransition6));
        }
        if (localObject7 == null)
          break label844;
        return true;
        label723: localbn = localFragment1.mEnterTransitionCallback;
        break;
        bool = localFragment1.getAllowEnterTransitionOverlap();
        break label450;
        if ((localTransition1 != null) && (localObject6 != null))
          localObject6 = new TransitionSet().addTransition(localTransition1).addTransition((Transition)localObject6).setOrdering(1);
        while (true)
        {
          if (localTransition2 == null)
            break label837;
          localObject7 = new TransitionSet();
          if (localObject6 != null)
            ((TransitionSet)localObject7).addTransition((Transition)localObject6);
          ((TransitionSet)localObject7).addTransition(localTransition2);
          break;
          if (localTransition1 != null)
          {
            localObject6 = localTransition1;
            continue;
          }
          if (localObject6 != null)
            continue;
          localObject6 = null;
        }
        label837: localObject7 = localObject6;
      }
      label844: return false;
      label846: bool = true;
    }
  }

  private static void b(i parami, android.support.v4.e.a<String, View> parama, boolean paramBoolean)
  {
    int i1 = parama.size();
    int i2 = 0;
    if (i2 < i1)
    {
      String str1 = (String)parama.b(i2);
      String str2 = ((View)parama.c(i2)).getTransitionName();
      if (paramBoolean)
        a(parami.a, str1, str2);
      while (true)
      {
        i2++;
        break;
        a(parami.a, str2, str1);
      }
    }
  }

  private static void b(SparseArray<Fragment> paramSparseArray, Fragment paramFragment)
  {
    if (paramFragment != null)
    {
      int i1 = paramFragment.mContainerId;
      if (i1 != 0)
        paramSparseArray.put(i1, paramFragment);
    }
  }

  private void b(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    if (!this.o.h.a());
    h localh;
    do
    {
      return;
      localh = this.a;
    }
    while (localh == null);
    switch (localh.c)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      localh = localh.a;
      break;
      b(paramSparseArray2, localh.d);
      continue;
      Fragment localFragment1 = localh.d;
      Fragment localFragment2;
      if (this.o.b != null)
      {
        localFragment2 = localFragment1;
        int i1 = 0;
        if (i1 < this.o.b.size())
        {
          Fragment localFragment3 = (Fragment)this.o.b.get(i1);
          if ((localFragment2 == null) || (localFragment3.mContainerId == localFragment2.mContainerId))
          {
            if (localFragment3 != localFragment2)
              break label180;
            localFragment2 = null;
          }
          while (true)
          {
            i1++;
            break;
            label180: a(paramSparseArray1, localFragment3);
          }
        }
      }
      else
      {
        localFragment2 = localFragment1;
      }
      b(paramSparseArray2, localFragment2);
      continue;
      a(paramSparseArray1, localh.d);
      continue;
      a(paramSparseArray1, localh.d);
      continue;
      b(paramSparseArray2, localh.d);
      continue;
      a(paramSparseArray1, localh.d);
      continue;
      b(paramSparseArray2, localh.d);
    }
  }

  public final int a()
  {
    return a(false);
  }

  public final ac a(int paramInt, Fragment paramFragment)
  {
    a(paramInt, paramFragment, null, 1);
    return this;
  }

  public final ac a(int paramInt, Fragment paramFragment, String paramString)
  {
    a(paramInt, paramFragment, paramString, 1);
    return this;
  }

  public final ac a(Fragment paramFragment)
  {
    h localh = new h();
    localh.c = 3;
    localh.d = paramFragment;
    a(localh);
    return this;
  }

  public final ac a(Fragment paramFragment, String paramString)
  {
    a(0, paramFragment, paramString, 1);
    return this;
  }

  public final ac a(String paramString)
  {
    if (!this.q)
      throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    this.e = true;
    this.f = paramString;
    return this;
  }

  public final i a(boolean paramBoolean, i parami, SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    if (n)
    {
      if (parami != null)
        break label153;
      if ((paramSparseArray1.size() != 0) || (paramSparseArray2.size() != 0))
        parami = a(paramSparseArray1, paramSparseArray2, true);
    }
    label34: a(-1);
    int i1;
    label46: int i2;
    label53: h localh;
    int i4;
    if (parami != null)
    {
      i1 = 0;
      if (parami == null)
        break label237;
      i2 = 0;
      localh = this.p;
      if (localh == null)
        break label562;
      if (parami == null)
        break label246;
      i4 = 0;
      label71: if (parami == null)
        break label256;
    }
    label256: for (int i5 = 0; ; i5 = localh.h)
      switch (localh.c)
      {
      default:
        throw new IllegalArgumentException("Unknown cmd: " + localh.c);
        label153: if (paramBoolean)
          break label34;
        ArrayList localArrayList1 = this.m;
        ArrayList localArrayList2 = this.l;
        if (localArrayList1 == null)
          break label34;
        for (int i7 = 0; i7 < localArrayList1.size(); i7++)
        {
          String str1 = (String)localArrayList1.get(i7);
          String str2 = (String)localArrayList2.get(i7);
          a(parami.a, str1, str2);
        }
        i1 = this.d;
        break label46;
        label237: i2 = this.c;
        break label53;
        label246: i4 = localh.g;
        break label71;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
    Fragment localFragment8 = localh.d;
    localFragment8.mNextAnim = i5;
    this.o.a(localFragment8, s.d(i2), i1);
    while (true)
    {
      localh = localh.b;
      break;
      Fragment localFragment6 = localh.d;
      if (localFragment6 != null)
      {
        localFragment6.mNextAnim = i5;
        this.o.a(localFragment6, s.d(i2), i1);
      }
      if (localh.i == null)
        continue;
      for (int i6 = 0; i6 < localh.i.size(); i6++)
      {
        Fragment localFragment7 = (Fragment)localh.i.get(i6);
        localFragment7.mNextAnim = i4;
        this.o.a(localFragment7, false);
      }
      Fragment localFragment5 = localh.d;
      localFragment5.mNextAnim = i4;
      this.o.a(localFragment5, false);
      continue;
      Fragment localFragment4 = localh.d;
      localFragment4.mNextAnim = i4;
      this.o.c(localFragment4, s.d(i2), i1);
      continue;
      Fragment localFragment3 = localh.d;
      localFragment3.mNextAnim = i5;
      this.o.b(localFragment3, s.d(i2), i1);
      continue;
      Fragment localFragment2 = localh.d;
      localFragment2.mNextAnim = i4;
      this.o.e(localFragment2, s.d(i2), i1);
      continue;
      Fragment localFragment1 = localh.d;
      localFragment1.mNextAnim = i4;
      this.o.d(localFragment1, s.d(i2), i1);
    }
    label562: if (paramBoolean)
    {
      this.o.a(this.o.f, s.d(i2), i1, true);
      parami = null;
    }
    s locals;
    int i3;
    if (this.g >= 0)
    {
      locals = this.o;
      i3 = this.g;
      monitorenter;
    }
    try
    {
      locals.d.set(i3, null);
      if (locals.e == null)
        locals.e = new ArrayList();
      locals.e.add(Integer.valueOf(i3));
      monitorexit;
      this.g = -1;
      return parami;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  final void a(int paramInt)
  {
    if (!this.e);
    while (true)
    {
      return;
      for (h localh = this.a; localh != null; localh = localh.a)
      {
        if (localh.d != null)
        {
          Fragment localFragment2 = localh.d;
          localFragment2.mBackStackNesting = (paramInt + localFragment2.mBackStackNesting);
        }
        if (localh.i == null)
          continue;
        for (int i1 = -1 + localh.i.size(); i1 >= 0; i1--)
        {
          Fragment localFragment1 = (Fragment)localh.i.get(i1);
          localFragment1.mBackStackNesting = (paramInt + localFragment1.mBackStackNesting);
        }
      }
    }
  }

  final void a(h paramh)
  {
    if (this.a == null)
    {
      this.p = paramh;
      this.a = paramh;
    }
    while (true)
    {
      paramh.e = 0;
      paramh.f = 0;
      paramh.g = 0;
      paramh.h = 0;
      this.b = (1 + this.b);
      return;
      paramh.b = this.p;
      this.p.a = paramh;
      this.p = paramh;
    }
  }

  public final void a(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    if (!this.o.h.a());
    h localh;
    do
    {
      return;
      localh = this.a;
    }
    while (localh == null);
    switch (localh.c)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      localh = localh.a;
      break;
      a(paramSparseArray1, localh.d);
      continue;
      if (localh.i != null)
        for (int i1 = -1 + localh.i.size(); i1 >= 0; i1--)
          b(paramSparseArray2, (Fragment)localh.i.get(i1));
      a(paramSparseArray1, localh.d);
      continue;
      b(paramSparseArray2, localh.d);
      continue;
      b(paramSparseArray2, localh.d);
      continue;
      a(paramSparseArray1, localh.d);
      continue;
      b(paramSparseArray2, localh.d);
      continue;
      a(paramSparseArray1, localh.d);
    }
  }

  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mName=");
    paramPrintWriter.print(this.f);
    paramPrintWriter.print(" mIndex=");
    paramPrintWriter.print(this.g);
    paramPrintWriter.print(" mCommitted=");
    paramPrintWriter.println(this.r);
    if (this.c != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTransition=#");
      paramPrintWriter.print(Integer.toHexString(this.c));
      paramPrintWriter.print(" mTransitionStyle=#");
      paramPrintWriter.println(Integer.toHexString(this.d));
    }
    if ((this.h != 0) || (this.i != null))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mBreadCrumbTitleRes=#");
      paramPrintWriter.print(Integer.toHexString(this.h));
      paramPrintWriter.print(" mBreadCrumbTitleText=");
      paramPrintWriter.println(this.i);
    }
    if ((this.j != 0) || (this.k != null))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
      paramPrintWriter.print(Integer.toHexString(this.j));
      paramPrintWriter.print(" mBreadCrumbShortTitleText=");
      paramPrintWriter.println(this.k);
    }
    if (this.a != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      String str1 = paramString + "    ";
      h localh1 = this.a;
      int i1 = 0;
      h localh2 = localh1;
      while (localh2 != null)
      {
        String str2;
        int i2;
        switch (localh2.c)
        {
        default:
          str2 = "cmd=" + localh2.c;
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  Op #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.print(str2);
          paramPrintWriter.print(" ");
          paramPrintWriter.println(localh2.d);
          if ((localh2.e != 0) || (localh2.f != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("enterAnim=#");
            paramPrintWriter.print(Integer.toHexString(localh2.e));
            paramPrintWriter.print(" exitAnim=#");
            paramPrintWriter.println(Integer.toHexString(localh2.f));
          }
          if ((localh2.g != 0) || (localh2.h != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("popEnterAnim=#");
            paramPrintWriter.print(Integer.toHexString(localh2.g));
            paramPrintWriter.print(" popExitAnim=#");
            paramPrintWriter.println(Integer.toHexString(localh2.h));
          }
          if ((localh2.i == null) || (localh2.i.size() <= 0))
            break label683;
          i2 = 0;
          label522: if (i2 >= localh2.i.size())
            break label683;
          paramPrintWriter.print(str1);
          if (localh2.i.size() != 1)
            break;
          paramPrintWriter.print("Removed: ");
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        }
        while (true)
        {
          paramPrintWriter.println(localh2.i.get(i2));
          i2++;
          break label522;
          str2 = "NULL";
          break;
          str2 = "ADD";
          break;
          str2 = "REPLACE";
          break;
          str2 = "REMOVE";
          break;
          str2 = "HIDE";
          break;
          str2 = "SHOW";
          break;
          str2 = "DETACH";
          break;
          str2 = "ATTACH";
          break;
          if (i2 == 0)
            paramPrintWriter.println("Removed:");
          paramPrintWriter.print(str1);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i2);
          paramPrintWriter.print(": ");
        }
        label683: localh2 = localh2.a;
        i1++;
      }
    }
  }

  public final int b()
  {
    return a(true);
  }

  public final ac b(int paramInt, Fragment paramFragment)
  {
    return b(paramInt, paramFragment, null);
  }

  public final ac b(int paramInt, Fragment paramFragment, String paramString)
  {
    if (paramInt == 0)
      throw new IllegalArgumentException("Must use non-zero containerViewId");
    a(paramInt, paramFragment, paramString, 2);
    return this;
  }

  public final ac b(Fragment paramFragment)
  {
    h localh = new h();
    localh.c = 6;
    localh.d = paramFragment;
    a(localh);
    return this;
  }

  public final ac c(Fragment paramFragment)
  {
    h localh = new h();
    localh.c = 7;
    localh.d = paramFragment;
    a(localh);
    return this;
  }

  public final void run()
  {
    if ((this.e) && (this.g < 0))
      throw new IllegalStateException("addToBackStack() called after commit()");
    a(1);
    SparseArray localSparseArray1;
    SparseArray localSparseArray2;
    if (n)
    {
      localSparseArray1 = new SparseArray();
      localSparseArray2 = new SparseArray();
      b(localSparseArray1, localSparseArray2);
    }
    for (i locali = a(localSparseArray1, localSparseArray2, false); ; locali = null)
    {
      int i1;
      label73: int i2;
      label80: h localh;
      int i3;
      if (locali != null)
      {
        i1 = 0;
        if (locali == null)
          break label190;
        i2 = 0;
        localh = this.a;
        if (localh == null)
          break label601;
        if (locali == null)
          break label199;
        i3 = 0;
        label98: if (locali == null)
          break label209;
      }
      label190: label199: label209: for (int i4 = 0; ; i4 = localh.f)
        switch (localh.c)
        {
        default:
          throw new IllegalArgumentException("Unknown cmd: " + localh.c);
          i1 = this.d;
          break label73;
          i2 = this.c;
          break label80;
          i3 = localh.e;
          break label98;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        }
      Fragment localFragment9 = localh.d;
      localFragment9.mNextAnim = i3;
      this.o.a(localFragment9, false);
      while (true)
      {
        localh = localh.a;
        break;
        Fragment localFragment6 = localh.d;
        Fragment localFragment7;
        if (this.o.b != null)
        {
          int i5 = 0;
          localFragment7 = localFragment6;
          if (i5 < this.o.b.size())
          {
            Fragment localFragment8 = (Fragment)this.o.b.get(i5);
            if ((localFragment7 == null) || (localFragment8.mContainerId == localFragment7.mContainerId))
            {
              if (localFragment8 != localFragment7)
                break label349;
              localh.d = null;
              localFragment7 = null;
            }
            while (true)
            {
              i5++;
              break;
              label349: if (localh.i == null)
                localh.i = new ArrayList();
              localh.i.add(localFragment8);
              localFragment8.mNextAnim = i4;
              if (this.e)
                localFragment8.mBackStackNesting = (1 + localFragment8.mBackStackNesting);
              this.o.a(localFragment8, i2, i1);
            }
          }
        }
        else
        {
          localFragment7 = localFragment6;
        }
        if (localFragment7 == null)
          continue;
        localFragment7.mNextAnim = i3;
        this.o.a(localFragment7, false);
        continue;
        Fragment localFragment5 = localh.d;
        localFragment5.mNextAnim = i4;
        this.o.a(localFragment5, i2, i1);
        continue;
        Fragment localFragment4 = localh.d;
        localFragment4.mNextAnim = i4;
        this.o.b(localFragment4, i2, i1);
        continue;
        Fragment localFragment3 = localh.d;
        localFragment3.mNextAnim = i3;
        this.o.c(localFragment3, i2, i1);
        continue;
        Fragment localFragment2 = localh.d;
        localFragment2.mNextAnim = i4;
        this.o.d(localFragment2, i2, i1);
        continue;
        Fragment localFragment1 = localh.d;
        localFragment1.mNextAnim = i3;
        this.o.e(localFragment1, i2, i1);
      }
      label601: this.o.a(this.o.f, i2, i1, true);
      if (this.e)
      {
        s locals = this.o;
        if (locals.c == null)
          locals.c = new ArrayList();
        locals.c.add(this);
        locals.i();
      }
      return;
    }
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.g >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.g);
    }
    if (this.f != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.f);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.e
 * JD-Core Version:    0.6.0
 */