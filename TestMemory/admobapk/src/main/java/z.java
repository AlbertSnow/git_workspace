import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class z
  implements ComponentCallbacks, View.OnCreateContextMenuListener
{
  private static final dh a = new dh();
  static final Object b = new Object();
  public String A;
  boolean B;
  public boolean C;
  public boolean D;
  boolean E;
  boolean F;
  boolean G = true;
  boolean H;
  int I;
  ViewGroup J;
  View K;
  View L;
  boolean M;
  boolean N = true;
  be O;
  boolean P;
  boolean Q;
  Object R = b;
  Object S = b;
  Object T = b;
  cr U = null;
  cr V = null;
  private Object W = null;
  private Object X = null;
  private Object Y = null;
  int c = 0;
  View d;
  int e;
  Bundle f;
  SparseArray g;
  public int h = -1;
  String i;
  public Bundle j;
  z k;
  int l = -1;
  int m;
  boolean n;
  public boolean o;
  boolean p;
  public boolean q;
  boolean r;
  boolean s;
  int t;
  ak u;
  ai v;
  ak w;
  z x;
  public int y;
  public int z;

  public static z a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, null);
  }

  public static z a(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      Class localClass = (Class)a.get(paramString);
      if (localClass == null)
      {
        localClass = paramContext.getClassLoader().loadClass(paramString);
        a.put(paramString, localClass);
      }
      z localz = (z)localClass.newInstance();
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(localz.getClass().getClassLoader());
        localz.j = paramBundle;
      }
      return localz;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new ab("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", localClassNotFoundException);
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new ab("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
    throw new ab("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", localIllegalAccessException);
  }

  static boolean b(Context paramContext, String paramString)
  {
    try
    {
      Class localClass = (Class)a.get(paramString);
      if (localClass == null)
      {
        localClass = paramContext.getClassLoader().loadClass(paramString);
        a.put(paramString, localClass);
      }
      boolean bool = z.class.isAssignableFrom(localClass);
      return bool;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
    }
    return false;
  }

  public static void g()
  {
  }

  public static void h()
  {
  }

  public static Animation i()
  {
    return null;
  }

  public static void j()
  {
  }

  public static void k()
  {
  }

  final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (this.w != null)
      this.w.noteStateNotSaved();
    return null;
  }

  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  final void a(int paramInt, z paramz)
  {
    this.h = paramInt;
    if (paramz != null)
    {
      this.i = (paramz.i + ":" + this.h);
      return;
    }
    this.i = ("android:fragment:" + this.h);
  }

  @Deprecated
  public void a(Activity paramActivity)
  {
    this.H = true;
  }

  public void a(Bundle paramBundle)
  {
    this.H = true;
  }

  public final void a(AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    this.H = true;
    if (this.v == null);
    for (Activity localActivity = null; ; localActivity = this.v.a)
    {
      if (localActivity != null)
      {
        this.H = false;
        this.H = true;
      }
      return;
    }
  }

  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mFragmentId=#");
    paramPrintWriter.print(Integer.toHexString(this.y));
    paramPrintWriter.print(" mContainerId=#");
    paramPrintWriter.print(Integer.toHexString(this.z));
    paramPrintWriter.print(" mTag=");
    paramPrintWriter.println(this.A);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mState=");
    paramPrintWriter.print(this.c);
    paramPrintWriter.print(" mIndex=");
    paramPrintWriter.print(this.h);
    paramPrintWriter.print(" mWho=");
    paramPrintWriter.print(this.i);
    paramPrintWriter.print(" mBackStackNesting=");
    paramPrintWriter.println(this.t);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mAdded=");
    paramPrintWriter.print(this.n);
    paramPrintWriter.print(" mRemoving=");
    paramPrintWriter.print(this.o);
    paramPrintWriter.print(" mResumed=");
    paramPrintWriter.print(this.p);
    paramPrintWriter.print(" mFromLayout=");
    paramPrintWriter.print(this.q);
    paramPrintWriter.print(" mInLayout=");
    paramPrintWriter.println(this.r);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mHidden=");
    paramPrintWriter.print(this.B);
    paramPrintWriter.print(" mDetached=");
    paramPrintWriter.print(this.C);
    paramPrintWriter.print(" mMenuVisible=");
    paramPrintWriter.print(this.G);
    paramPrintWriter.print(" mHasMenu=");
    paramPrintWriter.println(false);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetainInstance=");
    paramPrintWriter.print(this.D);
    paramPrintWriter.print(" mRetaining=");
    paramPrintWriter.print(this.E);
    paramPrintWriter.print(" mUserVisibleHint=");
    paramPrintWriter.println(this.N);
    if (this.u != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mFragmentManager=");
      paramPrintWriter.println(this.u);
    }
    if (this.v != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHost=");
      paramPrintWriter.println(this.v);
    }
    if (this.x != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mParentFragment=");
      paramPrintWriter.println(this.x);
    }
    if (this.j != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mArguments=");
      paramPrintWriter.println(this.j);
    }
    if (this.f != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedFragmentState=");
      paramPrintWriter.println(this.f);
    }
    if (this.g != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewState=");
      paramPrintWriter.println(this.g);
    }
    if (this.k != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTarget=");
      paramPrintWriter.print(this.k);
      paramPrintWriter.print(" mTargetRequestCode=");
      paramPrintWriter.println(this.m);
    }
    if (this.I != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mNextAnim=");
      paramPrintWriter.println(this.I);
    }
    if (this.J != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mContainer=");
      paramPrintWriter.println(this.J);
    }
    if (this.K != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mView=");
      paramPrintWriter.println(this.K);
    }
    if (this.L != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mInnerView=");
      paramPrintWriter.println(this.K);
    }
    if (this.d != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAnimatingAway=");
      paramPrintWriter.println(this.d);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStateAfterAnimating=");
      paramPrintWriter.println(this.e);
    }
    if (this.O != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Loader Manager:");
      this.O.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    if (this.w != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Child " + this.w + ":");
      this.w.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }

  public LayoutInflater b(Bundle paramBundle)
  {
    LayoutInflater localLayoutInflater = this.v.c();
    if (this.w == null)
    {
      l();
      if (this.c < 5)
        break label58;
      this.w.h();
    }
    while (true)
    {
      ak localak = this.w;
      dj.a.a(localLayoutInflater, localak);
      return localLayoutInflater;
      label58: if (this.c >= 4)
      {
        this.w.g();
        continue;
      }
      if (this.c >= 2)
      {
        this.w.f();
        continue;
      }
      if (this.c <= 0)
        continue;
      this.w.e();
    }
  }

  public void c()
  {
    this.H = true;
    if (!this.P)
    {
      this.P = true;
      if (!this.Q)
      {
        this.Q = true;
        this.O = this.v.a(this.i, this.P, false);
      }
      if (this.O != null)
        this.O.b();
    }
  }

  public void c(Bundle paramBundle)
  {
    this.H = true;
  }

  public void d()
  {
    this.H = true;
  }

  public void d(Bundle paramBundle)
  {
  }

  public void d_()
  {
    this.H = true;
  }

  public void e()
  {
    this.H = true;
  }

  final void e(Bundle paramBundle)
  {
    d(paramBundle);
    if (this.w != null)
    {
      Parcelable localParcelable = this.w.d();
      if (localParcelable != null)
        paramBundle.putParcelable("android:support:fragments", localParcelable);
    }
  }

  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }

  public final ac f()
  {
    if (this.v == null)
      return null;
    return (ac)this.v.a;
  }

  public final int hashCode()
  {
    return super.hashCode();
  }

  final void l()
  {
    this.w = new ak();
    this.w.a(this.v, new aa(this), this);
  }

  final void m()
  {
    if (this.w != null)
      this.w.a(2, false);
    if (this.P)
    {
      this.P = false;
      if (!this.Q)
      {
        this.Q = true;
        this.O = this.v.a(this.i, this.P, false);
      }
      if (this.O != null)
      {
        if (!this.v.f)
          break label85;
        this.O.d();
      }
    }
    return;
    label85: this.O.c();
  }

  final void n()
  {
    if (this.w != null)
      this.w.j();
    this.H = false;
    this.H = true;
    if (!this.Q)
    {
      this.Q = true;
      this.O = this.v.a(this.i, this.P, false);
    }
    if (this.O != null)
      this.O.g();
    if (!this.H)
      throw new cs("Fragment " + this + " did not call through to super.onDestroy()");
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    this.H = true;
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    f().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }

  public void onLowMemory()
  {
    this.H = true;
  }

  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if (this.v == null)
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    this.v.a(this, paramIntent, paramInt);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    cz.a(this, localStringBuilder);
    if (this.h >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.h);
    }
    if (this.y != 0)
    {
      localStringBuilder.append(" id=0x");
      localStringBuilder.append(Integer.toHexString(this.y));
    }
    if (this.A != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.A);
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     z
 * JD-Core Version:    0.6.0
 */