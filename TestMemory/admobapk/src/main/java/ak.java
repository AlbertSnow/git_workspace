import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.BackStackState;
import android.support.v4.app.FragmentManagerState;
import android.support.v4.app.FragmentState;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ak extends aj
  implements ds
{
  private static Interpolator A;
  public static boolean a = false;
  private static boolean k;
  private static Field r;
  private static Interpolator z;
  public ArrayList b;
  ArrayList c;
  ArrayList d;
  ArrayList e;
  ArrayList f;
  int g = 0;
  ai h;
  ag i;
  String j;
  private ArrayList l;
  private Runnable[] m;
  private boolean n;
  private ArrayList o;
  private ArrayList p;
  private z q;
  private boolean s;
  private boolean t;
  private boolean u;
  private boolean v;
  private Bundle w = null;
  private SparseArray x = null;
  private Runnable y = new al(this);

  static
  {
    int i1 = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i1 >= 11)
      bool = true;
    k = bool;
    r = null;
    z = new DecelerateInterpolator(2.5F);
    A = new DecelerateInterpolator(1.5F);
    new AccelerateInterpolator(2.5F);
    new AccelerateInterpolator(1.5F);
  }

  public static int a(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return 0;
    case 4097:
      return 8194;
    case 8194:
      return 4097;
    case 4099:
    }
    return 4099;
  }

  private static Animation a(float paramFloat1, float paramFloat2)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat1, paramFloat2);
    localAlphaAnimation.setInterpolator(A);
    localAlphaAnimation.setDuration(220L);
    return localAlphaAnimation;
  }

  private static Animation a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    localScaleAnimation.setInterpolator(z);
    localScaleAnimation.setDuration(220L);
    localAnimationSet.addAnimation(localScaleAnimation);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat3, paramFloat4);
    localAlphaAnimation.setInterpolator(A);
    localAlphaAnimation.setDuration(220L);
    localAnimationSet.addAnimation(localAlphaAnimation);
    return localAnimationSet;
  }

  private Animation a(z paramz, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    z.i();
    if (paramz.I != 0)
    {
      Animation localAnimation = AnimationUtils.loadAnimation(this.h.b, paramz.I);
      if (localAnimation != null)
        return localAnimation;
    }
    if (paramInt1 == 0)
      return null;
    int i1 = -1;
    switch (paramInt1)
    {
    default:
    case 4097:
    case 8194:
    case 4099:
    }
    while (i1 < 0)
    {
      return null;
      if (paramBoolean)
      {
        i1 = 1;
        continue;
      }
      i1 = 2;
      continue;
      if (paramBoolean)
      {
        i1 = 3;
        continue;
      }
      i1 = 4;
      continue;
      if (paramBoolean)
      {
        i1 = 5;
        continue;
      }
      i1 = 6;
    }
    switch (i1)
    {
    default:
      if ((paramInt2 == 0) && (this.h.e()))
        paramInt2 = this.h.f();
      if (paramInt2 != 0)
        break;
      return null;
    case 1:
      return a(1.125F, 1.0F, 0.0F, 1.0F);
    case 2:
      return a(1.0F, 0.975F, 1.0F, 0.0F);
    case 3:
      return a(0.975F, 1.0F, 0.0F, 1.0F);
    case 4:
      return a(1.0F, 1.075F, 1.0F, 0.0F);
    case 5:
      return a(0.0F, 1.0F);
    case 6:
      return a(1.0F, 0.0F);
    }
    return null;
  }

  private z a(Bundle paramBundle, String paramString)
  {
    int i1 = paramBundle.getInt(paramString, -1);
    z localz;
    if (i1 == -1)
      localz = null;
    do
    {
      return localz;
      if (i1 >= this.b.size())
        a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i1));
      localz = (z)this.b.get(i1);
    }
    while (localz != null);
    a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i1));
    return localz;
  }

  private void a(int paramInt, o paramo)
  {
    monitorenter;
    try
    {
      if (this.e == null)
        this.e = new ArrayList();
      int i1 = this.e.size();
      if (paramInt < i1)
        this.e.set(paramInt, paramo);
      while (true)
      {
        return;
        while (i1 < paramInt)
        {
          this.e.add(null);
          if (this.f == null)
            this.f = new ArrayList();
          this.f.add(Integer.valueOf(i1));
          i1++;
        }
        this.e.add(paramo);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private final void a(RuntimeException paramRuntimeException)
  {
    Log.e("FragmentManager", paramRuntimeException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    PrintWriter localPrintWriter = new PrintWriter(new da("FragmentManager"));
    if (this.h != null);
    while (true)
    {
      try
      {
        this.h.a("  ", null, localPrintWriter, new String[0]);
        throw paramRuntimeException;
      }
      catch (Exception localException2)
      {
        Log.e("FragmentManager", "Failed dumping state", localException2);
        continue;
      }
      try
      {
        a("  ", null, localPrintWriter, new String[0]);
      }
      catch (Exception localException1)
      {
        Log.e("FragmentManager", "Failed dumping state", localException1);
      }
    }
  }

  private void a(z paramz)
  {
    a(paramz, this.g, 0, 0, false);
  }

  static boolean a(View paramView, Animation paramAnimation)
  {
    int i1 = Build.VERSION.SDK_INT;
    int i2 = 0;
    int i4;
    if (i1 >= 19)
    {
      int i3 = dt.a.a(paramView);
      i2 = 0;
      if (i3 == 0)
      {
        boolean bool = dt.a.b(paramView);
        i2 = 0;
        if (bool)
        {
          if (!(paramAnimation instanceof AlphaAnimation))
            break label69;
          i4 = 1;
        }
      }
    }
    while (true)
    {
      i2 = 0;
      if (i4 != 0)
        i2 = 1;
      return i2;
      label69: if ((paramAnimation instanceof AnimationSet))
      {
        List localList = ((AnimationSet)paramAnimation).getAnimations();
        for (int i5 = 0; ; i5++)
        {
          if (i5 >= localList.size())
            break label127;
          if (!(localList.get(i5) instanceof AlphaAnimation))
            continue;
          i4 = 1;
          break;
        }
      }
      label127: i4 = 0;
    }
  }

  private z b(int paramInt)
  {
    z localz;
    if (this.c != null)
      for (int i2 = -1 + this.c.size(); i2 >= 0; i2--)
      {
        localz = (z)this.c.get(i2);
        if ((localz != null) && (localz.y == paramInt))
          return localz;
      }
    if (this.b != null)
      for (int i1 = -1 + this.b.size(); ; i1--)
      {
        if (i1 < 0)
          break label107;
        localz = (z)this.b.get(i1);
        if ((localz != null) && (localz.y == paramInt))
          break;
      }
    label107: return null;
  }

  private static void b(View paramView, Animation paramAnimation)
  {
    if ((paramView == null) || (paramAnimation == null));
    do
      return;
    while (!a(paramView, paramAnimation));
    try
    {
      if (r == null)
      {
        Field localField = Animation.class.getDeclaredField("mListener");
        r = localField;
        localField.setAccessible(true);
      }
      localAnimationListener = (Animation.AnimationListener)r.get(paramAnimation);
      paramAnimation.setAnimationListener(new ao(paramView, paramAnimation, localAnimationListener));
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      while (true)
      {
        Log.e("FragmentManager", "No field with the name mListener is found in Animation class", localNoSuchFieldException);
        localAnimationListener = null;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
      {
        Log.e("FragmentManager", "Cannot access Animation's mListener field", localIllegalAccessException);
        Animation.AnimationListener localAnimationListener = null;
      }
    }
  }

  private void b(z paramz)
  {
    if (paramz.L == null)
      return;
    if (this.x == null)
      this.x = new SparseArray();
    while (true)
    {
      paramz.L.saveHierarchyState(this.x);
      if (this.x.size() <= 0)
        break;
      paramz.g = this.x;
      this.x = null;
      return;
      this.x.clear();
    }
  }

  private void l()
  {
    if (this.b == null)
      return;
    int i1 = 0;
    label10: z localz;
    if (i1 < this.b.size())
    {
      localz = (z)this.b.get(i1);
      if ((localz != null) && (localz.M))
      {
        if (!this.n)
          break label62;
        this.v = true;
      }
    }
    while (true)
    {
      i1++;
      break label10;
      break;
      label62: localz.M = false;
      a(localz, this.g, 0, 0, false);
    }
  }

  private final void m()
  {
    if (this.t)
      throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    if (this.j != null)
      throw new IllegalStateException("Can not perform this action inside of " + this.j);
  }

  public final int a(o paramo)
  {
    monitorenter;
    try
    {
      if ((this.f == null) || (this.f.size() <= 0))
      {
        if (this.e == null)
          this.e = new ArrayList();
        int i1 = this.e.size();
        this.e.add(paramo);
        return i1;
      }
      int i2 = ((Integer)this.f.remove(-1 + this.f.size())).intValue();
      this.e.set(i2, paramo);
      return i2;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString))
      return null;
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, ar.a);
    if (str1 == null);
    for (String str2 = localTypedArray.getString(0); ; str2 = str1)
    {
      int i1 = localTypedArray.getResourceId(1, -1);
      String str3 = localTypedArray.getString(2);
      localTypedArray.recycle();
      if (!z.b(this.h.b, str2))
        return null;
      if (paramView != null);
      for (int i2 = paramView.getId(); (i2 == -1) && (i1 == -1) && (str3 == null); i2 = 0)
        throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
      z localz1;
      int i3;
      label239: z localz2;
      if (i1 != -1)
      {
        localz1 = b(i1);
        if ((localz1 == null) && (str3 != null))
          localz1 = a(str3);
        if ((localz1 == null) && (i2 != -1))
          localz1 = b(i2);
        if (localz1 != null)
          break label382;
        z localz3 = z.a(paramContext, str2);
        localz3.q = true;
        if (i1 == 0)
          break label375;
        i3 = i1;
        localz3.y = i3;
        localz3.z = i2;
        localz3.A = str3;
        localz3.r = true;
        localz3.u = this;
        localz3.v = this.h;
        localz3.a(paramAttributeSet, localz3.f);
        a(localz3, true);
        localz2 = localz3;
        label304: if ((this.g > 0) || (!localz2.q))
          break label501;
        a(localz2, 1, 0, 0, false);
      }
      while (true)
      {
        if (localz2.K != null)
          break label510;
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
        localz1 = null;
        break;
        label375: i3 = i2;
        break label239;
        label382: if (localz1.r)
          throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(i1) + ", tag " + str3 + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + str2);
        localz1.r = true;
        if (!localz1.E)
          localz1.a(paramAttributeSet, localz1.f);
        localz2 = localz1;
        break label304;
        label501: a(localz2);
      }
      label510: if (i1 != 0)
        localz2.K.setId(i1);
      if (localz2.K.getTag() == null)
        localz2.K.setTag(str3);
      return localz2.K;
    }
  }

  public final au a()
  {
    return new o(this);
  }

  public final z a(String paramString)
  {
    z localz;
    if ((this.c != null) && (paramString != null))
      for (int i2 = -1 + this.c.size(); i2 >= 0; i2--)
      {
        localz = (z)this.c.get(i2);
        if ((localz != null) && (paramString.equals(localz.A)))
          return localz;
      }
    if ((this.b != null) && (paramString != null))
      for (int i1 = -1 + this.b.size(); ; i1--)
      {
        if (i1 < 0)
          break label121;
        localz = (z)this.b.get(i1);
        if ((localz != null) && (paramString.equals(localz.A)))
          break;
      }
    label121: return null;
  }

  public final void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
      throw new IllegalArgumentException("Bad id: " + paramInt1);
    a(new am(this, paramInt1, 1), false);
  }

  final void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if ((this.h == null) && (paramInt1 != 0))
      throw new IllegalStateException("No host");
    if ((!paramBoolean) && (this.g == paramInt1));
    do
    {
      return;
      this.g = paramInt1;
    }
    while (this.b == null);
    int i1 = 0;
    boolean bool1 = false;
    label54: z localz;
    if (i1 < this.b.size())
    {
      localz = (z)this.b.get(i1);
      if (localz == null)
        break label170;
      a(localz, paramInt1, paramInt2, paramInt3, false);
      if (localz.O == null)
        break label170;
    }
    label170: for (boolean bool2 = bool1 | localz.O.a(); ; bool2 = bool1)
    {
      i1++;
      bool1 = bool2;
      break label54;
      if (!bool1)
        l();
      if ((!this.s) || (this.h == null) || (this.g != 5))
        break;
      this.h.d();
      this.s = false;
      return;
    }
  }

  final void a(int paramInt, boolean paramBoolean)
  {
    a(paramInt, 0, 0, false);
  }

  public final void a(ai paramai, ag paramag, z paramz)
  {
    if (this.h != null)
      throw new IllegalStateException("Already attached");
    this.h = paramai;
    this.i = paramag;
    this.q = paramz;
  }

  public final void a(Configuration paramConfiguration)
  {
    if (this.c != null)
      for (int i1 = 0; i1 < this.c.size(); i1++)
      {
        z localz = (z)this.c.get(i1);
        if (localz == null)
          continue;
        localz.onConfigurationChanged(paramConfiguration);
        if (localz.w == null)
          continue;
        localz.w.a(paramConfiguration);
      }
  }

  final void a(Parcelable paramParcelable, List paramList)
  {
    int i1 = 0;
    if (paramParcelable == null);
    while (true)
    {
      return;
      FragmentManagerState localFragmentManagerState = (FragmentManagerState)paramParcelable;
      if (localFragmentManagerState.a == null)
        continue;
      if (paramList != null)
        for (int i5 = 0; i5 < paramList.size(); i5++)
        {
          z localz5 = (z)paramList.get(i5);
          FragmentState localFragmentState2 = localFragmentManagerState.a[localz5.h];
          localFragmentState2.k = localz5;
          localz5.g = null;
          localz5.t = 0;
          localz5.r = false;
          localz5.n = false;
          localz5.k = null;
          if (localFragmentState2.j == null)
            continue;
          localFragmentState2.j.setClassLoader(this.h.b.getClassLoader());
          localz5.g = localFragmentState2.j.getSparseParcelableArray("android:view_state");
          localz5.f = localFragmentState2.j;
        }
      this.b = new ArrayList(localFragmentManagerState.a.length);
      if (this.o != null)
        this.o.clear();
      int i2 = 0;
      if (i2 < localFragmentManagerState.a.length)
      {
        FragmentState localFragmentState1 = localFragmentManagerState.a[i2];
        ai localai;
        z localz3;
        z localz4;
        if (localFragmentState1 != null)
        {
          localai = this.h;
          localz3 = this.q;
          if (localFragmentState1.k != null)
          {
            localz4 = localFragmentState1.k;
            label247: this.b.add(localz4);
            localFragmentState1.k = null;
          }
        }
        while (true)
        {
          i2++;
          break;
          Context localContext = localai.b;
          if (localFragmentState1.i != null)
            localFragmentState1.i.setClassLoader(localContext.getClassLoader());
          localFragmentState1.k = z.a(localContext, localFragmentState1.a, localFragmentState1.i);
          if (localFragmentState1.j != null)
          {
            localFragmentState1.j.setClassLoader(localContext.getClassLoader());
            localFragmentState1.k.f = localFragmentState1.j;
          }
          localFragmentState1.k.a(localFragmentState1.b, localz3);
          localFragmentState1.k.q = localFragmentState1.c;
          localFragmentState1.k.s = true;
          localFragmentState1.k.y = localFragmentState1.d;
          localFragmentState1.k.z = localFragmentState1.e;
          localFragmentState1.k.A = localFragmentState1.f;
          localFragmentState1.k.D = localFragmentState1.g;
          localFragmentState1.k.C = localFragmentState1.h;
          localFragmentState1.k.u = localai.d;
          localz4 = localFragmentState1.k;
          break label247;
          this.b.add(null);
          if (this.o == null)
            this.o = new ArrayList();
          this.o.add(Integer.valueOf(i2));
        }
      }
      if (paramList != null)
      {
        int i4 = 0;
        if (i4 < paramList.size())
        {
          z localz2 = (z)paramList.get(i4);
          if (localz2.l >= 0)
            if (localz2.l >= this.b.size())
              break label603;
          for (localz2.k = ((z)this.b.get(localz2.l)); ; localz2.k = null)
          {
            i4++;
            break;
            label603: Log.w("FragmentManager", "Re-attaching retained fragment " + localz2 + " target no longer exists: " + localz2.l);
          }
        }
      }
      if (localFragmentManagerState.b != null)
      {
        this.c = new ArrayList(localFragmentManagerState.b.length);
        for (int i3 = 0; i3 < localFragmentManagerState.b.length; i3++)
        {
          z localz1 = (z)this.b.get(localFragmentManagerState.b[i3]);
          if (localz1 == null)
            a(new IllegalStateException("No instantiated fragment for index #" + localFragmentManagerState.b[i3]));
          localz1.n = true;
          if (this.c.contains(localz1))
            throw new IllegalStateException("Already added!");
          this.c.add(localz1);
        }
      }
      this.c = null;
      if (localFragmentManagerState.c == null)
        break;
      this.d = new ArrayList(localFragmentManagerState.c.length);
      while (i1 < localFragmentManagerState.c.length)
      {
        o localo = localFragmentManagerState.c[i1].a(this);
        this.d.add(localo);
        if (localo.g >= 0)
          a(localo.g, localo);
        i1++;
      }
    }
    this.d = null;
  }

  // ERROR //
  public final void a(Runnable paramRunnable, boolean paramBoolean)
  {
    // Byte code:
    //   0: iload_2
    //   1: ifne +7 -> 8
    //   4: aload_0
    //   5: invokespecial 641	ak:m	()V
    //   8: aload_0
    //   9: monitorenter
    //   10: aload_0
    //   11: getfield 643	ak:u	Z
    //   14: ifne +10 -> 24
    //   17: aload_0
    //   18: getfield 133	ak:h	Lai;
    //   21: ifnonnull +19 -> 40
    //   24: new 173	java/lang/IllegalStateException
    //   27: dup
    //   28: ldc_w 645
    //   31: invokespecial 194	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   34: athrow
    //   35: astore_3
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_3
    //   39: athrow
    //   40: aload_0
    //   41: getfield 647	ak:l	Ljava/util/ArrayList;
    //   44: ifnonnull +14 -> 58
    //   47: aload_0
    //   48: new 168	java/util/ArrayList
    //   51: dup
    //   52: invokespecial 205	java/util/ArrayList:<init>	()V
    //   55: putfield 647	ak:l	Ljava/util/ArrayList;
    //   58: aload_0
    //   59: getfield 647	ak:l	Ljava/util/ArrayList;
    //   62: aload_1
    //   63: invokevirtual 213	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   66: pop
    //   67: aload_0
    //   68: getfield 647	ak:l	Ljava/util/ArrayList;
    //   71: invokevirtual 171	java/util/ArrayList:size	()I
    //   74: iconst_1
    //   75: if_icmpne +32 -> 107
    //   78: aload_0
    //   79: getfield 133	ak:h	Lai;
    //   82: getfield 650	ai:c	Landroid/os/Handler;
    //   85: aload_0
    //   86: getfield 89	ak:y	Ljava/lang/Runnable;
    //   89: invokevirtual 656	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   92: aload_0
    //   93: getfield 133	ak:h	Lai;
    //   96: getfield 650	ai:c	Landroid/os/Handler;
    //   99: aload_0
    //   100: getfield 89	ak:y	Ljava/lang/Runnable;
    //   103: invokevirtual 660	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   106: pop
    //   107: aload_0
    //   108: monitorexit
    //   109: return
    //
    // Exception table:
    //   from	to	target	type
    //   10	24	35	finally
    //   24	35	35	finally
    //   36	38	35	finally
    //   40	58	35	finally
    //   58	107	35	finally
    //   107	109	35	finally
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i1 = 0;
    String str = paramString + "    ";
    if (this.b != null)
    {
      int i11 = this.b.size();
      if (i11 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
        paramPrintWriter.println(":");
        for (int i12 = 0; i12 < i11; i12++)
        {
          z localz3 = (z)this.b.get(i12);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i12);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localz3);
          if (localz3 == null)
            continue;
          localz3.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        }
      }
    }
    if (this.c != null)
    {
      int i9 = this.c.size();
      if (i9 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Added Fragments:");
        for (int i10 = 0; i10 < i9; i10++)
        {
          z localz2 = (z)this.c.get(i10);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i10);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localz2.toString());
        }
      }
    }
    if (this.p != null)
    {
      int i7 = this.p.size();
      if (i7 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        for (int i8 = 0; i8 < i7; i8++)
        {
          z localz1 = (z)this.p.get(i8);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i8);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localz1.toString());
        }
      }
    }
    if (this.d != null)
    {
      int i5 = this.d.size();
      if (i5 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        for (int i6 = 0; i6 < i5; i6++)
        {
          o localo2 = (o)this.d.get(i6);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i6);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localo2.toString());
          localo2.a(str, paramPrintWriter);
        }
      }
    }
    monitorenter;
    try
    {
      if (this.e != null)
      {
        int i3 = this.e.size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Back Stack Indices:");
          for (int i4 = 0; i4 < i3; i4++)
          {
            o localo1 = (o)this.e.get(i4);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i4);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(localo1);
          }
        }
      }
      if ((this.f != null) && (this.f.size() > 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mAvailBackStackIndices: ");
        paramPrintWriter.println(Arrays.toString(this.f.toArray()));
      }
      monitorexit;
      if (this.l != null)
      {
        int i2 = this.l.size();
        if (i2 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Pending Actions:");
          while (i1 < i2)
          {
            Runnable localRunnable = (Runnable)this.l.get(i1);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i1);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(localRunnable);
            i1++;
          }
        }
      }
    }
    finally
    {
      monitorexit;
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mHost=");
    paramPrintWriter.println(this.h);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mContainer=");
    paramPrintWriter.println(this.i);
    if (this.q != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mParent=");
      paramPrintWriter.println(this.q);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    paramPrintWriter.print(this.g);
    paramPrintWriter.print(" mStateSaved=");
    paramPrintWriter.print(this.t);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.u);
    if (this.s)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNeedMenuInvalidate=");
      paramPrintWriter.println(this.s);
    }
    if (this.j != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNoTransactionsBecause=");
      paramPrintWriter.println(this.j);
    }
    if ((this.o != null) && (this.o.size() > 0))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mAvailIndices: ");
      paramPrintWriter.println(Arrays.toString(this.o.toArray()));
    }
  }

  public final void a(z paramz, int paramInt1, int paramInt2)
  {
    int i1;
    int i2;
    if (paramz.t > 0)
    {
      i1 = 1;
      if (i1 != 0)
        break label86;
      i2 = 1;
      label18: if ((!paramz.C) || (i2 != 0))
      {
        if (this.c != null)
          this.c.remove(paramz);
        paramz.n = false;
        paramz.o = true;
        if (i2 == 0)
          break label92;
      }
    }
    label86: label92: for (int i3 = 0; ; i3 = 1)
    {
      a(paramz, i3, paramInt1, paramInt2, false);
      return;
      i1 = 0;
      break;
      i2 = 0;
      break label18;
    }
  }

  final void a(z paramz, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (((!paramz.n) || (paramz.C)) && (paramInt1 > 1))
      paramInt1 = 1;
    if ((paramz.o) && (paramInt1 > paramz.c))
      paramInt1 = paramz.c;
    if ((paramz.M) && (paramz.c < 4) && (paramInt1 > 3))
      paramInt1 = 3;
    label387: label399: ViewGroup localViewGroup;
    if (paramz.c < paramInt1)
    {
      if ((paramz.q) && (!paramz.r))
        return;
      if (paramz.d != null)
      {
        paramz.d = null;
        a(paramz, paramz.e, 0, 0, true);
      }
      switch (paramz.c)
      {
      default:
        paramz.c = paramInt1;
        return;
      case 0:
        if (paramz.f != null)
        {
          paramz.f.setClassLoader(this.h.b.getClassLoader());
          paramz.g = paramz.f.getSparseParcelableArray("android:view_state");
          paramz.k = a(paramz.f, "android:target_state");
          if (paramz.k != null)
            paramz.m = paramz.f.getInt("android:target_req_state", 0);
          paramz.N = paramz.f.getBoolean("android:user_visible_hint", true);
          if (!paramz.N)
          {
            paramz.M = true;
            if (paramInt1 > 3)
              paramInt1 = 3;
          }
        }
        paramz.v = this.h;
        paramz.x = this.q;
        ak localak;
        if (this.q != null)
        {
          localak = this.q.w;
          paramz.u = localak;
          paramz.H = false;
          paramz.H = true;
          if (paramz.v != null)
            break label387;
        }
        for (Activity localActivity = null; ; localActivity = paramz.v.a)
        {
          if (localActivity != null)
          {
            paramz.H = false;
            paramz.a(localActivity);
          }
          if (paramz.H)
            break label399;
          throw new cs("Fragment " + paramz + " did not call through to super.onAttach()");
          localak = this.h.d;
          break;
        }
        if (!paramz.E)
        {
          Bundle localBundle2 = paramz.f;
          if (paramz.w != null)
            paramz.w.noteStateNotSaved();
          paramz.H = false;
          paramz.a(localBundle2);
          if (!paramz.H)
            throw new cs("Fragment " + paramz + " did not call through to super.onCreate()");
          if (localBundle2 != null)
          {
            Parcelable localParcelable = localBundle2.getParcelable("android:support:fragments");
            if (localParcelable != null)
            {
              if (paramz.w == null)
                paramz.l();
              paramz.w.a(localParcelable, null);
              paramz.w.e();
            }
          }
        }
        paramz.E = false;
        if (!paramz.q)
          break;
        paramz.K = paramz.a(paramz.b(paramz.f), null, paramz.f);
        if (paramz.K != null)
        {
          paramz.L = paramz.K;
          if (Build.VERSION.SDK_INT >= 11)
          {
            dt.a(paramz.K, false);
            if (paramz.B)
              paramz.K.setVisibility(8);
            z.j();
          }
        }
      case 1:
        StringBuilder localStringBuilder;
        while (true)
        {
          if (paramInt1 <= 1)
            break label1131;
          if (paramz.q)
            break label938;
          if (paramz.z == 0)
            break label2096;
          localViewGroup = (ViewGroup)this.i.a(paramz.z);
          if ((localViewGroup != null) || (paramz.s))
            break label802;
          localStringBuilder = new StringBuilder("No view found for id 0x").append(Integer.toHexString(paramz.z)).append(" (");
          if (paramz.v != null)
            break label756;
          throw new IllegalStateException("Fragment " + paramz + " not attached to Activity");
          paramz.K = bg.a(paramz.K);
          break;
          paramz.L = null;
        }
        label756: a(new IllegalArgumentException(paramz.v.b.getResources().getResourceName(paramz.z) + ") for fragment " + paramz));
      case 2:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      label802: paramz.J = localViewGroup;
      paramz.K = paramz.a(paramz.b(paramz.f), localViewGroup, paramz.f);
      if (paramz.K != null)
      {
        paramz.L = paramz.K;
        if (Build.VERSION.SDK_INT >= 11)
        {
          dt.a(paramz.K, false);
          if (localViewGroup != null)
          {
            Animation localAnimation2 = a(paramz, paramInt2, true, paramInt3);
            if (localAnimation2 != null)
            {
              b(paramz.K, localAnimation2);
              paramz.K.startAnimation(localAnimation2);
            }
            localViewGroup.addView(paramz.K);
          }
          if (paramz.B)
            paramz.K.setVisibility(8);
          z.j();
        }
      }
      while (true)
      {
        label938: Bundle localBundle1 = paramz.f;
        if (paramz.w != null)
          paramz.w.noteStateNotSaved();
        paramz.H = false;
        paramz.c(localBundle1);
        if (paramz.H)
          break label1029;
        throw new cs("Fragment " + paramz + " did not call through to super.onActivityCreated()");
        paramz.K = bg.a(paramz.K);
        break;
        paramz.L = null;
      }
      label1029: if (paramz.w != null)
        paramz.w.f();
      if (paramz.K != null)
      {
        if (paramz.g != null)
        {
          paramz.L.restoreHierarchyState(paramz.g);
          paramz.g = null;
        }
        paramz.H = false;
        paramz.H = true;
        if (!paramz.H)
          throw new cs("Fragment " + paramz + " did not call through to super.onViewStateRestored()");
      }
      paramz.f = null;
      label1131: if (paramInt1 > 3)
      {
        if (paramz.w != null)
        {
          paramz.w.noteStateNotSaved();
          paramz.w.c();
        }
        paramz.H = false;
        paramz.c();
        if (!paramz.H)
          throw new cs("Fragment " + paramz + " did not call through to super.onStart()");
        if (paramz.w != null)
          paramz.w.g();
        if (paramz.O != null)
          paramz.O.f();
      }
      if (paramInt1 <= 4)
        break;
      paramz.p = true;
      if (paramz.w != null)
      {
        paramz.w.noteStateNotSaved();
        paramz.w.c();
      }
      paramz.H = false;
      paramz.H = true;
      if (!paramz.H)
        throw new cs("Fragment " + paramz + " did not call through to super.onResume()");
      if (paramz.w != null)
      {
        paramz.w.h();
        paramz.w.c();
      }
      paramz.f = null;
      paramz.g = null;
      break;
      if (paramz.c <= paramInt1)
        break;
      switch (paramz.c)
      {
      default:
        break;
      case 1:
      case 5:
      case 4:
      case 3:
      case 2:
        label1399: 
        do
        {
          if (paramInt1 > 0)
            break;
          if ((this.u) && (paramz.d != null))
          {
            View localView = paramz.d;
            paramz.d = null;
            localView.clearAnimation();
          }
          if (paramz.d == null)
            break label1825;
          paramz.e = paramInt1;
          paramInt1 = 1;
          break;
          if (paramInt1 < 5)
          {
            if (paramz.w != null)
              paramz.w.a(4, false);
            paramz.H = false;
            paramz.H = true;
            if (!paramz.H)
              throw new cs("Fragment " + paramz + " did not call through to super.onPause()");
            paramz.p = false;
          }
          if (paramInt1 < 4)
          {
            if (paramz.w != null)
              paramz.w.i();
            paramz.H = false;
            paramz.d();
            if (!paramz.H)
              throw new cs("Fragment " + paramz + " did not call through to super.onStop()");
          }
          if (paramInt1 >= 3)
            continue;
          paramz.m();
        }
        while (paramInt1 >= 2);
        if ((paramz.K != null) && (this.h.b()) && (paramz.g == null))
          b(paramz);
        if (paramz.w != null)
          paramz.w.a(1, false);
        paramz.H = false;
        paramz.e();
        if (!paramz.H)
          throw new cs("Fragment " + paramz + " did not call through to super.onDestroyView()");
        if (paramz.O != null)
          paramz.O.e();
        if ((paramz.K != null) && (paramz.J != null))
          if ((this.g <= 0) || (this.u))
            break label2090;
        label1825: label2090: for (Animation localAnimation1 = a(paramz, paramInt2, false, paramInt3); ; localAnimation1 = null)
        {
          if (localAnimation1 != null)
          {
            paramz.d = paramz.K;
            paramz.e = paramInt1;
            localAnimation1.setAnimationListener(new an(this, paramz.K, localAnimation1, paramz));
            paramz.K.startAnimation(localAnimation1);
          }
          paramz.J.removeView(paramz.K);
          paramz.J = null;
          paramz.K = null;
          paramz.L = null;
          break label1399;
          if (!paramz.E)
            paramz.n();
          paramz.H = false;
          paramz.d_();
          if (!paramz.H)
            throw new cs("Fragment " + paramz + " did not call through to super.onDetach()");
          if (paramBoolean)
            break;
          if (!paramz.E)
          {
            if (paramz.h < 0)
              break;
            this.b.set(paramz.h, null);
            if (this.o == null)
              this.o = new ArrayList();
            this.o.add(Integer.valueOf(paramz.h));
            this.h.a(paramz.i);
            paramz.h = -1;
            paramz.i = null;
            paramz.n = false;
            paramz.o = false;
            paramz.p = false;
            paramz.q = false;
            paramz.r = false;
            paramz.s = false;
            paramz.t = 0;
            paramz.u = null;
            paramz.w = null;
            paramz.v = null;
            paramz.y = 0;
            paramz.z = 0;
            paramz.A = null;
            paramz.B = false;
            paramz.C = false;
            paramz.E = false;
            paramz.O = null;
            paramz.P = false;
            paramz.Q = false;
            break;
          }
          paramz.v = null;
          paramz.x = null;
          paramz.u = null;
          paramz.w = null;
          break;
        }
        label2096: localViewGroup = null;
      }
    }
  }

  public final void a(z paramz, boolean paramBoolean)
  {
    if (this.c == null)
      this.c = new ArrayList();
    if (paramz.h < 0)
    {
      if ((this.o != null) && (this.o.size() > 0))
        break label127;
      if (this.b == null)
        this.b = new ArrayList();
      paramz.a(this.b.size(), this.q);
      this.b.add(paramz);
    }
    while (!paramz.C)
    {
      if (this.c.contains(paramz))
      {
        throw new IllegalStateException("Fragment already added: " + paramz);
        label127: paramz.a(((Integer)this.o.remove(-1 + this.o.size())).intValue(), this.q);
        this.b.set(paramz.h, paramz);
        continue;
      }
      this.c.add(paramz);
      paramz.n = true;
      paramz.o = false;
      if (!paramBoolean)
        break;
      a(paramz);
    }
  }

  public final boolean a(Menu paramMenu)
  {
    int i2;
    int i1;
    z localz;
    if (this.c != null)
    {
      i2 = 0;
      i1 = 0;
      if (i2 >= this.c.size())
        break label84;
      localz = (z)this.c.get(i2);
      if (localz != null)
        if ((localz.B) || (localz.w == null))
          break label86;
    }
    label84: label86: for (boolean bool = false | localz.w.a(paramMenu); ; bool = false)
    {
      if (bool)
        i1 = 1;
      i2++;
      break;
      i1 = 0;
      return i1;
    }
  }

  public final boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    ArrayList localArrayList1 = null;
    int i3;
    int i1;
    z localz2;
    if (this.c != null)
    {
      i3 = 0;
      i1 = 0;
      if (i3 >= this.c.size())
        break label120;
      localz2 = (z)this.c.get(i3);
      if (localz2 != null)
        if ((localz2.B) || (localz2.w == null))
          break label190;
    }
    label190: for (boolean bool = false | localz2.w.a(paramMenu, paramMenuInflater); ; bool = false)
    {
      if (bool)
      {
        i1 = 1;
        if (localArrayList1 == null)
          localArrayList1 = new ArrayList();
        localArrayList1.add(localz2);
      }
      int i4 = i1;
      i3++;
      i1 = i4;
      break;
      i1 = 0;
      label120: ArrayList localArrayList2 = this.p;
      int i2 = 0;
      if (localArrayList2 != null)
        while (i2 < this.p.size())
        {
          z localz1 = (z)this.p.get(i2);
          if ((localArrayList1 == null) || (!localArrayList1.contains(localz1)))
            z.k();
          i2++;
        }
      this.p = localArrayList1;
      return i1;
    }
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    ArrayList localArrayList = this.c;
    int i1 = 0;
    if (localArrayList != null);
    for (int i2 = 0; ; i2++)
    {
      int i3 = this.c.size();
      i1 = 0;
      if (i2 < i3)
      {
        z localz = (z)this.c.get(i2);
        if (localz == null)
          continue;
        if ((localz.B) || (localz.w == null) || (!localz.w.a(paramMenuItem)))
          break label91;
      }
      label91: for (int i4 = 1; i4 != 0; i4 = 0)
      {
        i1 = 1;
        return i1;
      }
    }
  }

  final boolean a(String paramString, int paramInt1, int paramInt2)
  {
    if (this.d == null);
    int i1;
    do
      while (true)
      {
        return false;
        if ((paramInt1 < 0) && ((paramInt2 & 0x1) == 0))
        {
          int i7 = -1 + this.d.size();
          if (i7 < 0)
            continue;
          o localo4 = (o)this.d.remove(i7);
          SparseArray localSparseArray3 = new SparseArray();
          SparseArray localSparseArray4 = new SparseArray();
          localo4.a(localSparseArray3, localSparseArray4);
          localo4.a(true, null, localSparseArray3, localSparseArray4);
          return true;
        }
        i1 = -1;
        if (paramInt1 < 0)
          break;
        for (int i6 = -1 + this.d.size(); i6 >= 0; i6--)
        {
          o localo3 = (o)this.d.get(i6);
          if ((paramInt1 >= 0) && (paramInt1 == localo3.g))
            break;
        }
        if (i6 < 0)
          continue;
        if ((paramInt2 & 0x1) != 0)
        {
          i6--;
          while (i6 >= 0)
          {
            o localo2 = (o)this.d.get(i6);
            if ((paramInt1 < 0) || (paramInt1 != localo2.g))
              break;
            i6--;
          }
        }
        i1 = i6;
      }
    while (i1 == -1 + this.d.size());
    ArrayList localArrayList = new ArrayList();
    for (int i2 = -1 + this.d.size(); i2 > i1; i2--)
      localArrayList.add(this.d.remove(i2));
    int i3 = -1 + localArrayList.size();
    SparseArray localSparseArray1 = new SparseArray();
    SparseArray localSparseArray2 = new SparseArray();
    for (int i4 = 0; i4 <= i3; i4++)
      ((o)localArrayList.get(i4)).a(localSparseArray1, localSparseArray2);
    Object localObject = null;
    int i5 = 0;
    label330: o localo1;
    if (i5 <= i3)
    {
      localo1 = (o)localArrayList.get(i5);
      if (i5 != i3)
        break label384;
    }
    label384: for (boolean bool = true; ; bool = false)
    {
      t localt = localo1.a(bool, (t)localObject, localSparseArray1, localSparseArray2);
      i5++;
      localObject = localt;
      break label330;
      break;
    }
  }

  public final void b(Menu paramMenu)
  {
    if (this.c != null)
      for (int i1 = 0; i1 < this.c.size(); i1++)
      {
        z localz = (z)this.c.get(i1);
        if ((localz == null) || (localz.B) || (localz.w == null))
          continue;
        localz.w.b(paramMenu);
      }
  }

  public final void b(z paramz, int paramInt1, int paramInt2)
  {
    if (!paramz.B)
    {
      paramz.B = true;
      if (paramz.K != null)
      {
        Animation localAnimation = a(paramz, paramInt1, false, paramInt2);
        if (localAnimation != null)
        {
          b(paramz.K, localAnimation);
          paramz.K.startAnimation(localAnimation);
        }
        paramz.K.setVisibility(8);
      }
      if (paramz.n);
      z.g();
    }
  }

  public final boolean b()
  {
    m();
    c();
    return a(null, -1, 0);
  }

  public final boolean b(MenuItem paramMenuItem)
  {
    ArrayList localArrayList = this.c;
    int i1 = 0;
    if (localArrayList != null);
    for (int i2 = 0; ; i2++)
    {
      int i3 = this.c.size();
      i1 = 0;
      if (i2 < i3)
      {
        z localz = (z)this.c.get(i2);
        if (localz == null)
          continue;
        if ((localz.B) || (localz.w == null) || (!localz.w.b(paramMenuItem)))
          break label91;
      }
      label91: for (int i4 = 1; i4 != 0; i4 = 0)
      {
        i1 = 1;
        return i1;
      }
    }
  }

  public final void c(z paramz, int paramInt1, int paramInt2)
  {
    if (paramz.B)
    {
      paramz.B = false;
      if (paramz.K != null)
      {
        Animation localAnimation = a(paramz, paramInt1, true, paramInt2);
        if (localAnimation != null)
        {
          b(paramz.K, localAnimation);
          paramz.K.startAnimation(localAnimation);
        }
        paramz.K.setVisibility(0);
      }
      if (paramz.n);
      z.g();
    }
  }

  public final boolean c()
  {
    if (this.n)
      throw new IllegalStateException("Recursive entry to executePendingTransactions");
    if (Looper.myLooper() != this.h.c.getLooper())
      throw new IllegalStateException("Must be called from main thread of process");
    int i1 = 0;
    while (true)
    {
      monitorenter;
      boolean bool;
      try
      {
        if ((this.l == null) || (this.l.size() == 0))
        {
          monitorexit;
          if (!this.v)
            break;
          int i2 = 0;
          bool = false;
          while (i2 < this.b.size())
          {
            z localz = (z)this.b.get(i2);
            if ((localz != null) && (localz.O != null))
              bool |= localz.O.a();
            i2++;
          }
        }
        int i3 = this.l.size();
        if ((this.m == null) || (this.m.length < i3))
          this.m = new Runnable[i3];
        this.l.toArray(this.m);
        this.l.clear();
        this.h.c.removeCallbacks(this.y);
        monitorexit;
        this.n = true;
        for (int i4 = 0; i4 < i3; i4++)
        {
          this.m[i4].run();
          this.m[i4] = null;
        }
      }
      finally
      {
        monitorexit;
      }
      this.n = false;
      i1 = 1;
      continue;
      if (bool)
        break;
      this.v = false;
      l();
    }
    return i1;
  }

  final Parcelable d()
  {
    c();
    if (k)
      this.t = true;
    if ((this.b == null) || (this.b.size() <= 0))
      return null;
    int i1 = this.b.size();
    FragmentState[] arrayOfFragmentState = new FragmentState[i1];
    int i2 = 0;
    int i3 = 0;
    label54: z localz1;
    FragmentState localFragmentState;
    Bundle localBundle1;
    label211: int i8;
    if (i2 < i1)
    {
      localz1 = (z)this.b.get(i2);
      if (localz1 == null)
        break label752;
      if (localz1.h < 0)
        a(new IllegalStateException("Failure saving state: active " + localz1 + " has cleared index: " + localz1.h));
      localFragmentState = new FragmentState(localz1);
      arrayOfFragmentState[i2] = localFragmentState;
      if ((localz1.c > 0) && (localFragmentState.j == null))
      {
        if (this.w == null)
          this.w = new Bundle();
        localz1.e(this.w);
        if (this.w.isEmpty())
          break label746;
        localBundle1 = this.w;
        this.w = null;
        if (localz1.K != null)
          b(localz1);
        if (localz1.g != null)
        {
          if (localBundle1 == null)
            localBundle1 = new Bundle();
          localBundle1.putSparseParcelableArray("android:view_state", localz1.g);
        }
        if (!localz1.N)
        {
          if (localBundle1 == null)
            localBundle1 = new Bundle();
          localBundle1.putBoolean("android:user_visible_hint", localz1.N);
        }
        localFragmentState.j = localBundle1;
        if (localz1.k == null)
          break label501;
        if (localz1.k.h < 0)
          a(new IllegalStateException("Failure saving state: " + localz1 + " has target not in fragment manager: " + localz1.k));
        if (localFragmentState.j == null)
          localFragmentState.j = new Bundle();
        Bundle localBundle2 = localFragmentState.j;
        z localz2 = localz1.k;
        if (localz2.h < 0)
          a(new IllegalStateException("Fragment " + localz2 + " is not currently in the FragmentManager"));
        localBundle2.putInt("android:target_state", localz2.h);
        if (localz1.m == 0)
          break label501;
        localFragmentState.j.putInt("android:target_req_state", localz1.m);
        i8 = 1;
      }
    }
    while (true)
    {
      i2++;
      i3 = i8;
      break label54;
      localFragmentState.j = localz1.f;
      label501: i8 = 1;
      continue;
      if (i3 == 0)
        break;
      if (this.c != null)
      {
        int i6 = this.c.size();
        if (i6 > 0)
        {
          arrayOfInt = new int[i6];
          for (int i7 = 0; i7 < i6; i7++)
          {
            arrayOfInt[i7] = ((z)this.c.get(i7)).h;
            if (arrayOfInt[i7] >= 0)
              continue;
            a(new IllegalStateException("Failure saving state: active " + this.c.get(i7) + " has cleared index: " + arrayOfInt[i7]));
          }
        }
      }
      int[] arrayOfInt = null;
      ArrayList localArrayList = this.d;
      BackStackState[] arrayOfBackStackState = null;
      if (localArrayList != null)
      {
        int i4 = this.d.size();
        arrayOfBackStackState = null;
        if (i4 > 0)
        {
          arrayOfBackStackState = new BackStackState[i4];
          for (int i5 = 0; i5 < i4; i5++)
            arrayOfBackStackState[i5] = new BackStackState((o)this.d.get(i5));
        }
      }
      FragmentManagerState localFragmentManagerState = new FragmentManagerState();
      localFragmentManagerState.a = arrayOfFragmentState;
      localFragmentManagerState.b = arrayOfInt;
      localFragmentManagerState.c = arrayOfBackStackState;
      return localFragmentManagerState;
      label746: localBundle1 = null;
      break label211;
      label752: i8 = i3;
    }
  }

  public final void d(z paramz, int paramInt1, int paramInt2)
  {
    if (!paramz.C)
    {
      paramz.C = true;
      if (paramz.n)
      {
        if (this.c != null)
          this.c.remove(paramz);
        paramz.n = false;
        a(paramz, 1, paramInt1, paramInt2, false);
      }
    }
  }

  public final void e()
  {
    this.t = false;
    a(1, false);
  }

  public final void e(z paramz, int paramInt1, int paramInt2)
  {
    if (paramz.C)
    {
      paramz.C = false;
      if (!paramz.n)
      {
        if (this.c == null)
          this.c = new ArrayList();
        if (this.c.contains(paramz))
          throw new IllegalStateException("Fragment already added: " + paramz);
        this.c.add(paramz);
        paramz.n = true;
        a(paramz, this.g, paramInt1, paramInt2, false);
      }
    }
  }

  public final void f()
  {
    this.t = false;
    a(2, false);
  }

  public final void g()
  {
    this.t = false;
    a(4, false);
  }

  public final void h()
  {
    this.t = false;
    a(5, false);
  }

  public final void i()
  {
    this.t = true;
    a(3, false);
  }

  public final void j()
  {
    this.u = true;
    c();
    a(0, false);
    this.h = null;
    this.i = null;
    this.q = null;
  }

  public final void k()
  {
    if (this.c != null)
      for (int i1 = 0; i1 < this.c.size(); i1++)
      {
        z localz = (z)this.c.get(i1);
        if (localz == null)
          continue;
        localz.onLowMemory();
        if (localz.w == null)
          continue;
        localz.w.k();
      }
  }

  public final void noteStateNotSaved()
  {
    this.t = false;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    if (this.q != null)
      cz.a(this.q, localStringBuilder);
    while (true)
    {
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
      cz.a(this.h, localStringBuilder);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ak
 * JD-Core Version:    0.6.0
 */