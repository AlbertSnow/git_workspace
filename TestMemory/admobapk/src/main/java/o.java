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
import java.util.Map;

public final class o extends au
  implements Runnable
{
  private static boolean n;
  public s a;
  public int b;
  public int c;
  public int d;
  public boolean e;
  public String f;
  public int g = -1;
  public int h;
  public CharSequence i;
  public int j;
  public CharSequence k;
  public ArrayList l;
  public ArrayList m;
  private ak o;
  private s p;
  private boolean q;

  static
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (boolean bool = true; ; bool = false)
    {
      n = bool;
      return;
    }
  }

  public o(ak paramak)
  {
    this.o = paramak;
  }

  private int a(boolean paramBoolean)
  {
    if (this.q)
      throw new IllegalStateException("commit already called");
    this.q = true;
    if (this.e);
    for (this.g = this.o.a(this); ; this.g = -1)
    {
      this.o.a(this, paramBoolean);
      return this.g;
    }
  }

  static cw a(ArrayList paramArrayList1, ArrayList paramArrayList2, cw paramcw)
  {
    if (paramcw.isEmpty())
      return paramcw;
    cw localcw = new cw();
    int i1 = paramArrayList1.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = (View)paramcw.get(paramArrayList1.get(i2));
      if (localView == null)
        continue;
      localcw.put(paramArrayList2.get(i2), localView);
    }
    return localcw;
  }

  private final cw a(t paramt, z paramz, boolean paramBoolean)
  {
    cw localcw = new cw();
    if (this.l != null)
    {
      av.a(localcw, paramz.K);
      if (!paramBoolean)
        break label59;
      db.a(localcw, this.m);
    }
    while (paramBoolean)
    {
      a(paramt, localcw, false);
      return localcw;
      label59: localcw = a(this.l, this.m, localcw);
    }
    b(paramt, localcw, false);
    return localcw;
  }

  private static Object a(Object paramObject, z paramz, ArrayList paramArrayList, cw paramcw, View paramView)
  {
    if (paramObject != null)
    {
      View localView = paramz.K;
      if (paramObject != null)
      {
        av.a(paramArrayList, localView);
        if (paramcw != null)
          paramArrayList.removeAll(paramcw.values());
        if (!paramArrayList.isEmpty())
          break label46;
        paramObject = null;
      }
    }
    return paramObject;
    label46: paramArrayList.add(paramView);
    av.b((Transition)paramObject, paramArrayList);
    return paramObject;
  }

  private final t a(SparseArray paramSparseArray1, SparseArray paramSparseArray2, boolean paramBoolean)
  {
    t localt = new t(this);
    localt.d = new View(this.o.h.b);
    int i1 = 0;
    int i2 = 0;
    int i3 = paramSparseArray1.size();
    int i4 = 0;
    if (i1 < i3)
      if (!a(paramSparseArray1.keyAt(i1), localt, paramBoolean, paramSparseArray1, paramSparseArray2))
        break label145;
    label145: for (int i6 = 1; ; i6 = i2)
    {
      i1++;
      i2 = i6;
      break;
      while (i4 < paramSparseArray2.size())
      {
        int i5 = paramSparseArray2.keyAt(i4);
        if ((paramSparseArray1.get(i5) == null) && (a(i5, localt, paramBoolean, paramSparseArray1, paramSparseArray2)))
          i2 = 1;
        i4++;
      }
      if (i2 == 0)
        localt = null;
      return localt;
    }
  }

  private static void a(SparseArray paramSparseArray, z paramz)
  {
    int i1;
    if (paramz != null)
    {
      i1 = paramz.z;
      if ((i1 != 0) && (!paramz.B))
        if ((paramz.v == null) || (!paramz.n))
          break label62;
    }
    label62: for (int i2 = 1; ; i2 = 0)
    {
      if ((i2 != 0) && (paramz.K != null) && (paramSparseArray.get(i1) == null))
        paramSparseArray.put(i1, paramz);
      return;
    }
  }

  private static void a(cw paramcw, String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null));
    for (int i1 = 0; i1 < paramcw.size(); i1++)
    {
      if (!paramString1.equals(paramcw.c(i1)))
        continue;
      paramcw.a(i1, paramString2);
      return;
    }
    paramcw.put(paramString1, paramString2);
  }

  static void a(z paramz1, z paramz2, boolean paramBoolean, cw paramcw)
  {
    if (paramBoolean)
      return;
  }

  private final boolean a(int paramInt, t paramt, boolean paramBoolean, SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    ViewGroup localViewGroup = (ViewGroup)this.o.i.a(paramInt);
    if (localViewGroup == null)
      return false;
    z localz1 = (z)paramSparseArray2.get(paramInt);
    z localz2 = (z)paramSparseArray1.get(paramInt);
    Object localObject2;
    TransitionSet localTransitionSet1;
    label66: Object localObject4;
    ArrayList localArrayList1;
    cw localcw4;
    cw localcw1;
    TransitionSet localTransitionSet2;
    if (localz1 == null)
    {
      localObject2 = null;
      if ((localz1 != null) && (localz2 != null))
        break label173;
      localTransitionSet1 = null;
      if (localz2 != null)
        break label256;
      localObject4 = null;
      localArrayList1 = new ArrayList();
      if (localTransitionSet1 == null)
        break label823;
      localcw4 = a(paramt, localz2, paramBoolean);
      if (!localcw4.isEmpty())
        break label300;
      localcw1 = null;
      localTransitionSet2 = null;
    }
    while (true)
    {
      if ((localObject2 == null) && (localTransitionSet2 == null) && (localObject4 == null))
      {
        return false;
        Object localObject1;
        if (paramBoolean)
          if (localz1.S == z.b)
            localObject1 = null;
        while (true)
        {
          localObject2 = av.a(localObject1);
          break;
          localObject1 = localz1.S;
          continue;
          localObject1 = null;
        }
        label173: Object localObject7;
        if (paramBoolean)
          if (localz2.T == z.b)
            localObject7 = null;
        while (true)
        {
          if (localObject7 != null)
            break label218;
          localTransitionSet1 = null;
          break;
          localObject7 = localz2.T;
          continue;
          localObject7 = null;
        }
        label218: Transition localTransition9 = (Transition)localObject7;
        if (localTransition9 == null)
        {
          localTransitionSet1 = null;
          break label66;
        }
        localTransitionSet1 = new TransitionSet();
        localTransitionSet1.addTransition(localTransition9);
        break label66;
        label256: Object localObject3;
        if (paramBoolean)
          if (localz2.R == z.b)
            localObject3 = null;
        while (true)
        {
          localObject4 = av.a(localObject3);
          break;
          localObject3 = localz2.R;
          continue;
          localObject3 = null;
        }
        label300: if (paramBoolean);
        while (true)
        {
          localViewGroup.getViewTreeObserver().addOnPreDrawListener(new q(this, localViewGroup, localTransitionSet1, localArrayList1, paramt, paramBoolean, localz1, localz2));
          localcw1 = localcw4;
          localTransitionSet2 = localTransitionSet1;
          break;
        }
      }
      ArrayList localArrayList2 = new ArrayList();
      View localView1 = paramt.d;
      Object localObject5 = a(localObject4, localz2, localArrayList2, localcw1, localView1);
      if ((this.m != null) && (localcw1 != null))
      {
        Object localObject6 = this.m.get(0);
        View localView4 = (View)localcw1.get(localObject6);
        if (localView4 != null)
        {
          if (localObject5 != null)
            av.a(localObject5, localView4);
          if (localTransitionSet2 != null)
            av.a(localTransitionSet2, localView4);
        }
      }
      p localp = new p(this, localz1);
      ArrayList localArrayList3 = new ArrayList();
      cw localcw2 = new cw();
      if (localz1 != null);
      Transition localTransition1 = (Transition)localObject2;
      Transition localTransition2 = (Transition)localObject5;
      Transition localTransition3 = (Transition)localTransitionSet2;
      if ((localTransition1 != null) && (localTransition2 != null));
      TransitionSet localTransitionSet3 = new TransitionSet();
      if (localTransition1 != null)
        localTransitionSet3.addTransition(localTransition1);
      if (localTransition2 != null)
        localTransitionSet3.addTransition(localTransition2);
      if (localTransition3 != null)
        localTransitionSet3.addTransition(localTransition3);
      if (localTransitionSet3 != null)
      {
        View localView2 = paramt.d;
        ba localba = paramt.c;
        cw localcw3 = paramt.a;
        if ((localObject2 != null) || (localTransitionSet2 != null))
        {
          Transition localTransition4 = (Transition)localObject2;
          if (localTransition4 != null)
            localTransition4.addTarget(localView2);
          if (localTransitionSet2 != null)
            av.a(localTransitionSet2, localView2, localcw1, localArrayList1);
          localViewGroup.getViewTreeObserver().addOnPreDrawListener(new ax(localViewGroup, localTransition4, localView2, localp, localcw3, localcw2, localArrayList3));
          if (localTransition4 != null)
            localTransition4.setEpicenterCallback(new ay(localba));
        }
        localViewGroup.getViewTreeObserver().addOnPreDrawListener(new r(this, localViewGroup, paramt, paramInt, localTransitionSet3));
        av.a(localTransitionSet3, paramt.d, true);
        a(paramt, paramInt, localTransitionSet3);
        TransitionManager.beginDelayedTransition(localViewGroup, (Transition)localTransitionSet3);
        View localView3 = paramt.d;
        ArrayList localArrayList4 = paramt.b;
        Transition localTransition5 = (Transition)localObject2;
        Transition localTransition6 = (Transition)localObject5;
        Transition localTransition7 = (Transition)localTransitionSet2;
        Transition localTransition8 = (Transition)localTransitionSet3;
        if (localTransition8 != null)
          localViewGroup.getViewTreeObserver().addOnPreDrawListener(new az(localViewGroup, localTransition5, localArrayList3, localTransition6, localArrayList2, localTransition7, localArrayList1, localcw2, localArrayList4, localTransition8, localView3));
      }
      return localTransitionSet3 != null;
      label823: localTransitionSet2 = localTransitionSet1;
      localcw1 = null;
    }
  }

  private final void b(SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    if (!this.o.i.a());
    s locals;
    do
    {
      return;
      locals = this.a;
    }
    while (locals == null);
    switch (locals.c)
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
      locals = locals.a;
      break;
      b(paramSparseArray2, locals.d);
      continue;
      z localz1 = locals.d;
      z localz2;
      if (this.o.c != null)
      {
        localz2 = localz1;
        int i1 = 0;
        if (i1 < this.o.c.size())
        {
          z localz3 = (z)this.o.c.get(i1);
          if ((localz2 == null) || (localz3.z == localz2.z))
          {
            if (localz3 != localz2)
              break label176;
            localz2 = null;
          }
          while (true)
          {
            i1++;
            break;
            label176: a(paramSparseArray1, localz3);
          }
        }
      }
      else
      {
        localz2 = localz1;
      }
      b(paramSparseArray2, localz2);
      continue;
      a(paramSparseArray1, locals.d);
      continue;
      a(paramSparseArray1, locals.d);
      continue;
      b(paramSparseArray2, locals.d);
      continue;
      a(paramSparseArray1, locals.d);
      continue;
      b(paramSparseArray2, locals.d);
    }
  }

  private static void b(SparseArray paramSparseArray, z paramz)
  {
    if (paramz != null)
    {
      int i1 = paramz.z;
      if (i1 != 0)
        paramSparseArray.put(i1, paramz);
    }
  }

  static void b(t paramt, cw paramcw, boolean paramBoolean)
  {
    int i1 = paramcw.size();
    int i2 = 0;
    if (i2 < i1)
    {
      String str1 = (String)paramcw.b(i2);
      String str2 = ((View)paramcw.c(i2)).getTransitionName();
      if (paramBoolean)
        a(paramt.a, str1, str2);
      while (true)
      {
        i2++;
        break;
        a(paramt.a, str2, str1);
      }
    }
  }

  public final int a()
  {
    return a(false);
  }

  public final au a(z paramz)
  {
    s locals = new s();
    locals.c = 3;
    locals.d = paramz;
    a(locals);
    return this;
  }

  public final au a(z paramz, String paramString)
  {
    paramz.u = this.o;
    if (paramString != null)
    {
      if ((paramz.A != null) && (!paramString.equals(paramz.A)))
        throw new IllegalStateException("Can't change tag of fragment " + paramz + ": was " + paramz.A + " now " + paramString);
      paramz.A = paramString;
    }
    s locals = new s();
    locals.c = 1;
    locals.d = paramz;
    a(locals);
    return this;
  }

  public final t a(boolean paramBoolean, t paramt, SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    if (n)
    {
      if (paramt != null)
        break label157;
      if ((paramSparseArray1.size() != 0) || (paramSparseArray2.size() != 0))
        paramt = a(paramSparseArray1, paramSparseArray2, true);
    }
    label38: a(-1);
    int i1;
    label50: int i2;
    label57: s locals;
    int i4;
    if (paramt != null)
    {
      i1 = 0;
      if (paramt == null)
        break label241;
      i2 = 0;
      locals = this.p;
      if (locals == null)
        break label566;
      if (paramt == null)
        break label250;
      i4 = 0;
      label75: if (paramt == null)
        break label260;
    }
    label260: for (int i5 = 0; ; i5 = locals.h)
      switch (locals.c)
      {
      default:
        throw new IllegalArgumentException("Unknown cmd: " + locals.c);
        label157: if (paramBoolean)
          break label38;
        ArrayList localArrayList1 = this.m;
        ArrayList localArrayList2 = this.l;
        if (localArrayList1 == null)
          break label38;
        for (int i7 = 0; i7 < localArrayList1.size(); i7++)
        {
          String str1 = (String)localArrayList1.get(i7);
          String str2 = (String)localArrayList2.get(i7);
          a(paramt.a, str1, str2);
        }
        i1 = this.d;
        break label50;
        label241: i2 = this.c;
        break label57;
        label250: i4 = locals.g;
        break label75;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
    z localz8 = locals.d;
    localz8.I = i5;
    this.o.a(localz8, ak.a(i2), i1);
    while (true)
    {
      locals = locals.b;
      break;
      z localz6 = locals.d;
      if (localz6 != null)
      {
        localz6.I = i5;
        this.o.a(localz6, ak.a(i2), i1);
      }
      if (locals.i == null)
        continue;
      for (int i6 = 0; i6 < locals.i.size(); i6++)
      {
        z localz7 = (z)locals.i.get(i6);
        localz7.I = i4;
        this.o.a(localz7, false);
      }
      z localz5 = locals.d;
      localz5.I = i4;
      this.o.a(localz5, false);
      continue;
      z localz4 = locals.d;
      localz4.I = i4;
      this.o.c(localz4, ak.a(i2), i1);
      continue;
      z localz3 = locals.d;
      localz3.I = i5;
      this.o.b(localz3, ak.a(i2), i1);
      continue;
      z localz2 = locals.d;
      localz2.I = i4;
      this.o.e(localz2, ak.a(i2), i1);
      continue;
      z localz1 = locals.d;
      localz1.I = i4;
      this.o.d(localz1, ak.a(i2), i1);
    }
    label566: if (paramBoolean)
    {
      this.o.a(this.o.g, ak.a(i2), i1, true);
      paramt = null;
    }
    ak localak;
    int i3;
    if (this.g >= 0)
    {
      localak = this.o;
      i3 = this.g;
      monitorenter;
    }
    try
    {
      localak.e.set(i3, null);
      if (localak.f == null)
        localak.f = new ArrayList();
      localak.f.add(Integer.valueOf(i3));
      monitorexit;
      this.g = -1;
      return paramt;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(int paramInt)
  {
    if (!this.e);
    while (true)
    {
      return;
      for (s locals = this.a; locals != null; locals = locals.a)
      {
        if (locals.d != null)
        {
          z localz2 = locals.d;
          localz2.t = (paramInt + localz2.t);
        }
        if (locals.i == null)
          continue;
        for (int i1 = -1 + locals.i.size(); i1 >= 0; i1--)
        {
          z localz1 = (z)locals.i.get(i1);
          localz1.t = (paramInt + localz1.t);
        }
      }
    }
  }

  public final void a(SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    if (!this.o.i.a());
    s locals;
    do
    {
      return;
      locals = this.a;
    }
    while (locals == null);
    switch (locals.c)
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
      locals = locals.a;
      break;
      a(paramSparseArray1, locals.d);
      continue;
      if (locals.i != null)
        for (int i1 = -1 + locals.i.size(); i1 >= 0; i1--)
          b(paramSparseArray2, (z)locals.i.get(i1));
      a(paramSparseArray1, locals.d);
      continue;
      b(paramSparseArray2, locals.d);
      continue;
      b(paramSparseArray2, locals.d);
      continue;
      a(paramSparseArray1, locals.d);
      continue;
      b(paramSparseArray2, locals.d);
      continue;
      a(paramSparseArray1, locals.d);
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
    paramPrintWriter.println(this.q);
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
      s locals1 = this.a;
      int i1 = 0;
      s locals2 = locals1;
      while (locals2 != null)
      {
        String str2;
        int i2;
        switch (locals2.c)
        {
        default:
          str2 = "cmd=" + locals2.c;
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  Op #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.print(str2);
          paramPrintWriter.print(" ");
          paramPrintWriter.println(locals2.d);
          if ((locals2.e != 0) || (locals2.f != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("enterAnim=#");
            paramPrintWriter.print(Integer.toHexString(locals2.e));
            paramPrintWriter.print(" exitAnim=#");
            paramPrintWriter.println(Integer.toHexString(locals2.f));
          }
          if ((locals2.g != 0) || (locals2.h != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("popEnterAnim=#");
            paramPrintWriter.print(Integer.toHexString(locals2.g));
            paramPrintWriter.print(" popExitAnim=#");
            paramPrintWriter.println(Integer.toHexString(locals2.h));
          }
          if ((locals2.i == null) || (locals2.i.size() <= 0))
            break label683;
          i2 = 0;
          label522: if (i2 >= locals2.i.size())
            break label683;
          paramPrintWriter.print(str1);
          if (locals2.i.size() != 1)
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
          paramPrintWriter.println(locals2.i.get(i2));
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
        label683: locals2 = locals2.a;
        i1++;
      }
    }
  }

  public final void a(s params)
  {
    if (this.a == null)
    {
      this.p = params;
      this.a = params;
    }
    while (true)
    {
      params.e = 0;
      params.f = 0;
      params.g = 0;
      params.h = 0;
      this.b = (1 + this.b);
      return;
      params.b = this.p;
      this.p.a = params;
      this.p = params;
    }
  }

  final void a(t paramt, int paramInt, Object paramObject)
  {
    if (this.o.c != null)
    {
      int i1 = 0;
      if (i1 < this.o.c.size())
      {
        z localz = (z)this.o.c.get(i1);
        if ((localz.K != null) && (localz.J != null) && (localz.z == paramInt))
        {
          if (!localz.B)
            break label122;
          if (!paramt.b.contains(localz.K))
          {
            av.a(paramObject, localz.K, true);
            paramt.b.add(localz.K);
          }
        }
        while (true)
        {
          i1++;
          break;
          label122: av.a(paramObject, localz.K, false);
          paramt.b.remove(localz.K);
        }
      }
    }
  }

  final void a(t paramt, cw paramcw, boolean paramBoolean)
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
      View localView = (View)paramcw.get((String)this.m.get(i2));
      if (localView != null)
      {
        str2 = localView.getTransitionName();
        if (!paramBoolean)
          break label100;
        a(paramt.a, str1, str2);
      }
    }
    while (true)
    {
      i2++;
      break label13;
      i1 = this.m.size();
      break;
      label100: a(paramt.a, str2, str1);
    }
  }

  public final int b()
  {
    return a(true);
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
    for (t localt = a(localSparseArray1, localSparseArray2, false); ; localt = null)
    {
      int i1;
      label79: int i2;
      label87: s locals;
      int i3;
      if (localt != null)
      {
        i1 = 0;
        if (localt == null)
          break label198;
        i2 = 0;
        locals = this.a;
        if (locals == null)
          break label616;
        if (localt == null)
          break label207;
        i3 = 0;
        label106: if (localt == null)
          break label217;
      }
      label198: label207: label217: for (int i4 = 0; ; i4 = locals.f)
        switch (locals.c)
        {
        default:
          throw new IllegalArgumentException("Unknown cmd: " + locals.c);
          i1 = this.d;
          break label79;
          i2 = this.c;
          break label87;
          i3 = locals.e;
          break label106;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        }
      z localz9 = locals.d;
      localz9.I = i3;
      this.o.a(localz9, false);
      while (true)
      {
        locals = locals.a;
        break;
        z localz6 = locals.d;
        int i5 = localz6.z;
        z localz7;
        if (this.o.c != null)
        {
          int i6 = 0;
          localz7 = localz6;
          if (i6 < this.o.c.size())
          {
            z localz8 = (z)this.o.c.get(i6);
            if (localz8.z == i5)
            {
              if (localz8 != localz7)
                break label360;
              locals.d = null;
              localz7 = null;
            }
            while (true)
            {
              i6++;
              break;
              label360: if (locals.i == null)
                locals.i = new ArrayList();
              locals.i.add(localz8);
              localz8.I = i4;
              if (this.e)
                localz8.t = (1 + localz8.t);
              this.o.a(localz8, i2, i1);
            }
          }
        }
        else
        {
          localz7 = localz6;
        }
        if (localz7 == null)
          continue;
        localz7.I = i3;
        this.o.a(localz7, false);
        continue;
        z localz5 = locals.d;
        localz5.I = i4;
        this.o.a(localz5, i2, i1);
        continue;
        z localz4 = locals.d;
        localz4.I = i4;
        this.o.b(localz4, i2, i1);
        continue;
        z localz3 = locals.d;
        localz3.I = i3;
        this.o.c(localz3, i2, i1);
        continue;
        z localz2 = locals.d;
        localz2.I = i4;
        this.o.d(localz2, i2, i1);
        continue;
        z localz1 = locals.d;
        localz1.I = i3;
        this.o.e(localz1, i2, i1);
      }
      label616: this.o.a(this.o.g, i2, i1, true);
      if (this.e)
      {
        ak localak = this.o;
        if (localak.d == null)
          localak.d = new ArrayList();
        localak.d.add(this);
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

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     o
 * JD-Core Version:    0.6.0
 */