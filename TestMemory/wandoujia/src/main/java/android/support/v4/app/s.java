package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.e.d;
import android.support.v4.view.aa;
import android.support.v4.view.bg;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class s extends q
  implements aa
{
  private static boolean k;
  private static Interpolator y;
  private static Interpolator z;
  ArrayList<Fragment> a;
  ArrayList<Fragment> b;
  ArrayList<e> c;
  ArrayList<e> d;
  ArrayList<Integer> e;
  int f = 0;
  FragmentActivity g;
  p h;
  boolean i;
  String j;
  private ArrayList<Runnable> l;
  private Runnable[] m;
  private boolean n;
  private ArrayList<Integer> o;
  private ArrayList<Fragment> p;
  private ArrayList<r> q;
  private Fragment r;
  private boolean s;
  private boolean t;
  private boolean u;
  private Bundle v = null;
  private SparseArray<Parcelable> w = null;
  private Runnable x = new t(this);

  static
  {
    if (Build.VERSION.SDK_INT >= 11);
    for (boolean bool = true; ; bool = false)
    {
      k = bool;
      y = new DecelerateInterpolator(2.5F);
      z = new DecelerateInterpolator(1.5F);
      new AccelerateInterpolator(2.5F);
      new AccelerateInterpolator(1.5F);
      return;
    }
  }

  private static Animation a(float paramFloat1, float paramFloat2)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat1, paramFloat2);
    localAlphaAnimation.setInterpolator(z);
    localAlphaAnimation.setDuration(220L);
    return localAlphaAnimation;
  }

  private static Animation a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    localScaleAnimation.setInterpolator(y);
    localScaleAnimation.setDuration(220L);
    localAnimationSet.addAnimation(localScaleAnimation);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat3, paramFloat4);
    localAlphaAnimation.setInterpolator(z);
    localAlphaAnimation.setDuration(220L);
    localAnimationSet.addAnimation(localAlphaAnimation);
    return localAnimationSet;
  }

  private Animation a(Fragment paramFragment, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    Animation localAnimation = paramFragment.onCreateAnimation(paramInt1, paramBoolean, paramFragment.mNextAnim);
    if (localAnimation != null);
    do
    {
      return localAnimation;
      if (paramFragment.mNextAnim == 0)
        break;
      localAnimation = AnimationUtils.loadAnimation(this.g, paramFragment.mNextAnim);
    }
    while (localAnimation != null);
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
      if ((paramInt2 == 0) && (this.g.getWindow() != null))
        paramInt2 = this.g.getWindow().getAttributes().windowAnimations;
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

  private void a(int paramInt, e parame)
  {
    monitorenter;
    try
    {
      if (this.d == null)
        this.d = new ArrayList();
      int i1 = this.d.size();
      if (paramInt < i1)
        this.d.set(paramInt, parame);
      while (true)
      {
        return;
        while (i1 < paramInt)
        {
          this.d.add(null);
          if (this.e == null)
            this.e = new ArrayList();
          this.e.add(Integer.valueOf(i1));
          i1++;
        }
        this.d.add(parame);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private void a(RuntimeException paramRuntimeException)
  {
    paramRuntimeException.getMessage();
    PrintWriter localPrintWriter = new PrintWriter(new d());
    if (this.g != null);
    try
    {
      this.g.dump("  ", null, localPrintWriter, new String[0]);
      while (true)
      {
        label42: throw paramRuntimeException;
        try
        {
          a("  ", null, localPrintWriter, new String[0]);
        }
        catch (Exception localException1)
        {
        }
      }
    }
    catch (Exception localException2)
    {
      break label42;
    }
  }

  private void c(Fragment paramFragment)
  {
    a(paramFragment, this.f, 0, 0, false);
  }

  public static int d(int paramInt)
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

  private void d(Fragment paramFragment)
  {
    if (paramFragment.mInnerView == null)
      return;
    if (this.w == null)
      this.w = new SparseArray();
    while (true)
    {
      paramFragment.mInnerView.saveHierarchyState(this.w);
      if (this.w.size() <= 0)
        break;
      paramFragment.mSavedViewState = this.w;
      this.w = null;
      return;
      this.w.clear();
    }
  }

  private Bundle e(Fragment paramFragment)
  {
    if (this.v == null)
      this.v = new Bundle();
    paramFragment.performSaveInstanceState(this.v);
    Bundle localBundle;
    if (!this.v.isEmpty())
    {
      localBundle = this.v;
      this.v = null;
    }
    while (true)
    {
      if (paramFragment.mView != null)
        d(paramFragment);
      if (paramFragment.mSavedViewState != null)
      {
        if (localBundle == null)
          localBundle = new Bundle();
        localBundle.putSparseParcelableArray("android:view_state", paramFragment.mSavedViewState);
      }
      if (!paramFragment.mUserVisibleHint)
      {
        if (localBundle == null)
          localBundle = new Bundle();
        localBundle.putBoolean("android:user_visible_hint", paramFragment.mUserVisibleHint);
      }
      return localBundle;
      localBundle = null;
    }
  }

  private void r()
  {
    if (this.i)
      throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    if (this.j != null)
      throw new IllegalStateException("Can not perform this action inside of " + this.j);
  }

  public final int a(e parame)
  {
    monitorenter;
    try
    {
      if ((this.e == null) || (this.e.size() <= 0))
      {
        if (this.d == null)
          this.d = new ArrayList();
        int i1 = this.d.size();
        this.d.add(parame);
        return i1;
      }
      int i2 = ((Integer)this.e.remove(-1 + this.e.size())).intValue();
      this.d.set(i2, parame);
      return i2;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final Fragment.SavedState a(Fragment paramFragment)
  {
    if (paramFragment.mIndex < 0)
      a(new IllegalStateException("Fragment " + paramFragment + " is not currently in the FragmentManager"));
    int i1 = paramFragment.mState;
    Fragment.SavedState localSavedState = null;
    if (i1 > 0)
    {
      Bundle localBundle = e(paramFragment);
      localSavedState = null;
      if (localBundle != null)
        localSavedState = new Fragment.SavedState(localBundle);
    }
    return localSavedState;
  }

  public final Fragment a(int paramInt)
  {
    Fragment localFragment;
    if (this.b != null)
      for (int i2 = -1 + this.b.size(); i2 >= 0; i2--)
      {
        localFragment = (Fragment)this.b.get(i2);
        if ((localFragment != null) && (localFragment.mFragmentId == paramInt))
          return localFragment;
      }
    if (this.a != null)
      for (int i1 = -1 + this.a.size(); ; i1--)
      {
        if (i1 < 0)
          break label107;
        localFragment = (Fragment)this.a.get(i1);
        if ((localFragment != null) && (localFragment.mFragmentId == paramInt))
          break;
      }
    label107: return null;
  }

  public final Fragment a(Bundle paramBundle, String paramString)
  {
    int i1 = paramBundle.getInt(paramString, -1);
    Fragment localFragment;
    if (i1 == -1)
      localFragment = null;
    do
    {
      return localFragment;
      if (i1 >= this.a.size())
        a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i1));
      localFragment = (Fragment)this.a.get(i1);
    }
    while (localFragment != null);
    a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i1));
    return localFragment;
  }

  public final Fragment a(String paramString)
  {
    Fragment localFragment;
    if ((this.b != null) && (paramString != null))
      for (int i2 = -1 + this.b.size(); i2 >= 0; i2--)
      {
        localFragment = (Fragment)this.b.get(i2);
        if ((localFragment != null) && (paramString.equals(localFragment.mTag)))
          return localFragment;
      }
    if ((this.a != null) && (paramString != null))
      for (int i1 = -1 + this.a.size(); ; i1--)
      {
        if (i1 < 0)
          break label121;
        localFragment = (Fragment)this.a.get(i1);
        if ((localFragment != null) && (paramString.equals(localFragment.mTag)))
          break;
      }
    label121: return null;
  }

  public final ac a()
  {
    return new e(this);
  }

  public final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString))
      return null;
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, x.a);
    if (str1 == null);
    for (String str2 = localTypedArray.getString(0); ; str2 = str1)
    {
      int i1 = localTypedArray.getResourceId(1, -1);
      String str3 = localTypedArray.getString(2);
      localTypedArray.recycle();
      if (!Fragment.isSupportFragmentClass(this.g, str2))
        return null;
      if (paramView != null);
      for (int i2 = paramView.getId(); (i2 == -1) && (i1 == -1) && (str3 == null); i2 = 0)
        throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
      Fragment localFragment1;
      int i3;
      label236: Fragment localFragment2;
      if (i1 != -1)
      {
        localFragment1 = a(i1);
        if ((localFragment1 == null) && (str3 != null))
          localFragment1 = a(str3);
        if ((localFragment1 == null) && (i2 != -1))
          localFragment1 = a(i2);
        if (localFragment1 != null)
          break label374;
        Fragment localFragment3 = Fragment.instantiate(paramContext, str2);
        localFragment3.mFromLayout = true;
        if (i1 == 0)
          break label367;
        i3 = i1;
        localFragment3.mFragmentId = i3;
        localFragment3.mContainerId = i2;
        localFragment3.mTag = str3;
        localFragment3.mInLayout = true;
        localFragment3.mFragmentManager = this;
        localFragment3.onInflate(this.g, paramAttributeSet, localFragment3.mSavedFragmentState);
        a(localFragment3, true);
        localFragment2 = localFragment3;
        label296: if ((this.f > 0) || (!localFragment2.mFromLayout))
          break label497;
        a(localFragment2, 1, 0, 0, false);
      }
      while (true)
      {
        if (localFragment2.mView != null)
          break label506;
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
        localFragment1 = null;
        break;
        label367: i3 = i2;
        break label236;
        label374: if (localFragment1.mInLayout)
          throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(i1) + ", tag " + str3 + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + str2);
        localFragment1.mInLayout = true;
        if (!localFragment1.mRetaining)
          localFragment1.onInflate(this.g, paramAttributeSet, localFragment1.mSavedFragmentState);
        localFragment2 = localFragment1;
        break label296;
        label497: c(localFragment2);
      }
      label506: if (i1 != 0)
        localFragment2.mView.setId(i1);
      if (localFragment2.mView.getTag() == null)
        localFragment2.mView.setTag(str3);
      return localFragment2.mView;
    }
  }

  final void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if ((this.g == null) && (paramInt1 != 0))
      throw new IllegalStateException("No activity");
    if ((!paramBoolean) && (this.f == paramInt1));
    do
    {
      return;
      this.f = paramInt1;
    }
    while (this.a == null);
    int i1 = 0;
    boolean bool1 = false;
    label54: Fragment localFragment;
    if (i1 < this.a.size())
    {
      localFragment = (Fragment)this.a.get(i1);
      if (localFragment == null)
        break label170;
      a(localFragment, paramInt1, paramInt2, paramInt3, false);
      if (localFragment.mLoaderManager == null)
        break label170;
    }
    label170: for (boolean bool2 = bool1 | localFragment.mLoaderManager.a(); ; bool2 = bool1)
    {
      i1++;
      bool1 = bool2;
      break label54;
      if (!bool1)
        g();
      if ((!this.s) || (this.g == null) || (this.f != 5))
        break;
      this.g.supportInvalidateOptionsMenu();
      this.s = false;
      return;
    }
  }

  public final void a(Configuration paramConfiguration)
  {
    if (this.b != null)
      for (int i1 = 0; i1 < this.b.size(); i1++)
      {
        Fragment localFragment = (Fragment)this.b.get(i1);
        if (localFragment == null)
          continue;
        localFragment.performConfigurationChanged(paramConfiguration);
      }
  }

  public final void a(Bundle paramBundle, String paramString, Fragment paramFragment)
  {
    if (paramFragment.mIndex < 0)
      a(new IllegalStateException("Fragment " + paramFragment + " is not currently in the FragmentManager"));
    paramBundle.putInt(paramString, paramFragment.mIndex);
  }

  final void a(Parcelable paramParcelable, ArrayList<Fragment> paramArrayList)
  {
    int i1 = 0;
    if (paramParcelable == null);
    while (true)
    {
      return;
      FragmentManagerState localFragmentManagerState = (FragmentManagerState)paramParcelable;
      if (localFragmentManagerState.a == null)
        continue;
      if (paramArrayList != null)
        for (int i5 = 0; i5 < paramArrayList.size(); i5++)
        {
          Fragment localFragment5 = (Fragment)paramArrayList.get(i5);
          FragmentState localFragmentState2 = localFragmentManagerState.a[localFragment5.mIndex];
          localFragmentState2.k = localFragment5;
          localFragment5.mSavedViewState = null;
          localFragment5.mBackStackNesting = 0;
          localFragment5.mInLayout = false;
          localFragment5.mAdded = false;
          localFragment5.mTarget = null;
          if (localFragmentState2.j == null)
            continue;
          localFragmentState2.j.setClassLoader(this.g.getClassLoader());
          localFragment5.mSavedViewState = localFragmentState2.j.getSparseParcelableArray("android:view_state");
          localFragment5.mSavedFragmentState = localFragmentState2.j;
        }
      this.a = new ArrayList(localFragmentManagerState.a.length);
      if (this.o != null)
        this.o.clear();
      int i2 = 0;
      if (i2 < localFragmentManagerState.a.length)
      {
        FragmentState localFragmentState1 = localFragmentManagerState.a[i2];
        FragmentActivity localFragmentActivity;
        Fragment localFragment3;
        Fragment localFragment4;
        if (localFragmentState1 != null)
        {
          localFragmentActivity = this.g;
          localFragment3 = this.r;
          if (localFragmentState1.k != null)
          {
            localFragment4 = localFragmentState1.k;
            label240: this.a.add(localFragment4);
            localFragmentState1.k = null;
          }
        }
        while (true)
        {
          i2++;
          break;
          if (localFragmentState1.i != null)
            localFragmentState1.i.setClassLoader(localFragmentActivity.getClassLoader());
          localFragmentState1.k = Fragment.instantiate(localFragmentActivity, localFragmentState1.a, localFragmentState1.i);
          if (localFragmentState1.j != null)
          {
            localFragmentState1.j.setClassLoader(localFragmentActivity.getClassLoader());
            localFragmentState1.k.mSavedFragmentState = localFragmentState1.j;
          }
          localFragmentState1.k.setIndex(localFragmentState1.b, localFragment3);
          localFragmentState1.k.mFromLayout = localFragmentState1.c;
          localFragmentState1.k.mRestored = true;
          localFragmentState1.k.mFragmentId = localFragmentState1.d;
          localFragmentState1.k.mContainerId = localFragmentState1.e;
          localFragmentState1.k.mTag = localFragmentState1.f;
          localFragmentState1.k.mRetainInstance = localFragmentState1.g;
          localFragmentState1.k.mDetached = localFragmentState1.h;
          localFragmentState1.k.mFragmentManager = localFragmentActivity.mFragments;
          localFragment4 = localFragmentState1.k;
          break label240;
          this.a.add(null);
          if (this.o == null)
            this.o = new ArrayList();
          this.o.add(Integer.valueOf(i2));
        }
      }
      if (paramArrayList != null)
      {
        int i4 = 0;
        if (i4 < paramArrayList.size())
        {
          Fragment localFragment2 = (Fragment)paramArrayList.get(i4);
          if (localFragment2.mTargetIndex >= 0)
            if (localFragment2.mTargetIndex >= this.a.size())
              break label581;
          for (localFragment2.mTarget = ((Fragment)this.a.get(localFragment2.mTargetIndex)); ; localFragment2.mTarget = null)
          {
            i4++;
            break;
            label581: new StringBuilder("Re-attaching retained fragment ").append(localFragment2).append(" target no longer exists: ").append(localFragment2.mTargetIndex);
          }
        }
      }
      if (localFragmentManagerState.b != null)
      {
        this.b = new ArrayList(localFragmentManagerState.b.length);
        for (int i3 = 0; i3 < localFragmentManagerState.b.length; i3++)
        {
          Fragment localFragment1 = (Fragment)this.a.get(localFragmentManagerState.b[i3]);
          if (localFragment1 == null)
            a(new IllegalStateException("No instantiated fragment for index #" + localFragmentManagerState.b[i3]));
          localFragment1.mAdded = true;
          if (this.b.contains(localFragment1))
            throw new IllegalStateException("Already added!");
          this.b.add(localFragment1);
        }
      }
      this.b = null;
      if (localFragmentManagerState.c == null)
        break;
      this.c = new ArrayList(localFragmentManagerState.c.length);
      while (i1 < localFragmentManagerState.c.length)
      {
        e locale = localFragmentManagerState.c[i1].a(this);
        this.c.add(locale);
        if (locale.g >= 0)
          a(locale.g, locale);
        i1++;
      }
    }
    this.c = null;
  }

  public final void a(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    int i1;
    if (!paramFragment.isInBackStack())
    {
      i1 = 1;
      if ((!paramFragment.mDetached) || (i1 != 0))
      {
        if (this.b != null)
          this.b.remove(paramFragment);
        if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible))
          this.s = true;
        paramFragment.mAdded = false;
        paramFragment.mRemoving = true;
        if (i1 == 0)
          break label92;
      }
    }
    label92: for (int i2 = 0; ; i2 = 1)
    {
      a(paramFragment, i2, paramInt1, paramInt2, false);
      return;
      i1 = 0;
      break;
    }
  }

  final void a(Fragment paramFragment, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (((!paramFragment.mAdded) || (paramFragment.mDetached)) && (paramInt1 > 1))
      paramInt1 = 1;
    if ((paramFragment.mRemoving) && (paramInt1 > paramFragment.mState))
      paramInt1 = paramFragment.mState;
    if ((paramFragment.mDeferStart) && (paramFragment.mState < 4) && (paramInt1 > 3))
      paramInt1 = 3;
    label454: label482: ViewGroup localViewGroup;
    if (paramFragment.mState < paramInt1)
    {
      if ((paramFragment.mFromLayout) && (!paramFragment.mInLayout))
        return;
      if (paramFragment.mAnimatingAway != null)
      {
        paramFragment.mAnimatingAway = null;
        a(paramFragment, paramFragment.mStateAfterAnimating, 0, 0, true);
      }
      switch (paramFragment.mState)
      {
      default:
        paramFragment.mState = paramInt1;
        return;
      case 0:
        if (paramFragment.mSavedFragmentState != null)
        {
          paramFragment.mSavedFragmentState.setClassLoader(this.g.getClassLoader());
          paramFragment.mSavedViewState = paramFragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
          paramFragment.mTarget = a(paramFragment.mSavedFragmentState, "android:target_state");
          if (paramFragment.mTarget != null)
            paramFragment.mTargetRequestCode = paramFragment.mSavedFragmentState.getInt("android:target_req_state", 0);
          paramFragment.mUserVisibleHint = paramFragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
          if (!paramFragment.mUserVisibleHint)
          {
            paramFragment.mDeferStart = true;
            if (paramInt1 > 3)
              paramInt1 = 3;
          }
        }
        paramFragment.mActivity = this.g;
        paramFragment.mParentFragment = this.r;
        if (this.r != null);
        for (s locals = this.r.mChildFragmentManager; ; locals = this.g.mFragments)
        {
          paramFragment.mFragmentManager = locals;
          paramFragment.mCalled = false;
          paramFragment.onAttach(this.g);
          if (paramFragment.mCalled)
            break;
          throw new SuperNotCalledException("Fragment " + paramFragment + " did not call through to super.onAttach()");
        }
        if (paramFragment.mParentFragment == null)
          this.g.onAttachFragment(paramFragment);
        if (!paramFragment.mRetaining)
          paramFragment.performCreate(paramFragment.mSavedFragmentState);
        paramFragment.mRetaining = false;
        if (!paramFragment.mFromLayout)
          break;
        paramFragment.mView = paramFragment.performCreateView(paramFragment.getLayoutInflater(paramFragment.mSavedFragmentState), null, paramFragment.mSavedFragmentState);
        if (paramFragment.mView != null)
        {
          paramFragment.mInnerView = paramFragment.mView;
          if (Build.VERSION.SDK_INT >= 11)
          {
            bg.z(paramFragment.mView);
            if (paramFragment.mHidden)
              paramFragment.mView.setVisibility(8);
            paramFragment.onViewCreated(paramFragment.mView, paramFragment.mSavedFragmentState);
          }
        }
      case 1:
        if (paramInt1 > 1)
          if (!paramFragment.mFromLayout)
          {
            if (paramFragment.mContainerId == 0)
              break label1279;
            localViewGroup = (ViewGroup)this.h.a(paramFragment.mContainerId);
            if ((localViewGroup == null) && (!paramFragment.mRestored))
              a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(paramFragment.mContainerId) + " (" + paramFragment.getResources().getResourceName(paramFragment.mContainerId) + ") for fragment " + paramFragment));
          }
      case 2:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      paramFragment.mContainer = localViewGroup;
      paramFragment.mView = paramFragment.performCreateView(paramFragment.getLayoutInflater(paramFragment.mSavedFragmentState), localViewGroup, paramFragment.mSavedFragmentState);
      if (paramFragment.mView != null)
      {
        paramFragment.mInnerView = paramFragment.mView;
        if (Build.VERSION.SDK_INT >= 11)
        {
          bg.z(paramFragment.mView);
          label653: if (localViewGroup != null)
          {
            Animation localAnimation2 = a(paramFragment, paramInt2, true, paramInt3);
            if (localAnimation2 != null)
              paramFragment.mView.startAnimation(localAnimation2);
            localViewGroup.addView(paramFragment.mView);
          }
          if (paramFragment.mHidden)
            paramFragment.mView.setVisibility(8);
          paramFragment.onViewCreated(paramFragment.mView, paramFragment.mSavedFragmentState);
        }
      }
      while (true)
      {
        paramFragment.performActivityCreated(paramFragment.mSavedFragmentState);
        if (paramFragment.mView != null)
          paramFragment.restoreViewState(paramFragment.mSavedFragmentState);
        paramFragment.mSavedFragmentState = null;
        if (paramInt1 > 3)
          paramFragment.performStart();
        if (paramInt1 <= 4)
          break;
        paramFragment.mResumed = true;
        paramFragment.performResume();
        paramFragment.mSavedFragmentState = null;
        paramFragment.mSavedViewState = null;
        break;
        paramFragment.mView = ar.a(paramFragment.mView);
        break label454;
        paramFragment.mInnerView = null;
        break label482;
        paramFragment.mView = ar.a(paramFragment.mView);
        break label653;
        paramFragment.mInnerView = null;
      }
      if (paramFragment.mState <= paramInt1)
        break;
      switch (paramFragment.mState)
      {
      default:
        break;
      case 1:
      case 5:
      case 4:
      case 3:
      case 2:
        label879: 
        do
        {
          if (paramInt1 > 0)
            break;
          if ((this.t) && (paramFragment.mAnimatingAway != null))
          {
            View localView = paramFragment.mAnimatingAway;
            paramFragment.mAnimatingAway = null;
            localView.clearAnimation();
          }
          if (paramFragment.mAnimatingAway == null)
            break label1109;
          paramFragment.mStateAfterAnimating = paramInt1;
          paramInt1 = 1;
          break;
          if (paramInt1 < 5)
          {
            paramFragment.performPause();
            paramFragment.mResumed = false;
          }
          if (paramInt1 < 4)
            paramFragment.performStop();
          if (paramInt1 >= 3)
            continue;
          paramFragment.performReallyStop();
        }
        while (paramInt1 >= 2);
        if ((paramFragment.mView != null) && (!this.g.isFinishing()) && (paramFragment.mSavedViewState == null))
          d(paramFragment);
        paramFragment.performDestroyView();
        if ((paramFragment.mView != null) && (paramFragment.mContainer != null))
          if ((this.f <= 0) || (this.t))
            break label1273;
        label1109: label1273: for (Animation localAnimation1 = a(paramFragment, paramInt2, false, paramInt3); ; localAnimation1 = null)
        {
          if (localAnimation1 != null)
          {
            paramFragment.mAnimatingAway = paramFragment.mView;
            paramFragment.mStateAfterAnimating = paramInt1;
            localAnimation1.setAnimationListener(new w(this, paramFragment));
            paramFragment.mView.startAnimation(localAnimation1);
          }
          paramFragment.mContainer.removeView(paramFragment.mView);
          paramFragment.mContainer = null;
          paramFragment.mView = null;
          paramFragment.mInnerView = null;
          break label879;
          if (!paramFragment.mRetaining)
            paramFragment.performDestroy();
          paramFragment.mCalled = false;
          paramFragment.onDetach();
          if (!paramFragment.mCalled)
            throw new SuperNotCalledException("Fragment " + paramFragment + " did not call through to super.onDetach()");
          if (paramBoolean)
            break;
          if (!paramFragment.mRetaining)
          {
            if (paramFragment.mIndex < 0)
              break;
            this.a.set(paramFragment.mIndex, null);
            if (this.o == null)
              this.o = new ArrayList();
            this.o.add(Integer.valueOf(paramFragment.mIndex));
            this.g.invalidateSupportFragment(paramFragment.mWho);
            paramFragment.initState();
            break;
          }
          paramFragment.mActivity = null;
          paramFragment.mParentFragment = null;
          paramFragment.mFragmentManager = null;
          paramFragment.mChildFragmentManager = null;
          break;
        }
        label1279: localViewGroup = null;
      }
    }
  }

  public final void a(Fragment paramFragment, boolean paramBoolean)
  {
    if (this.b == null)
      this.b = new ArrayList();
    if (paramFragment.mIndex < 0)
    {
      if ((this.o != null) && (this.o.size() > 0))
        break label127;
      if (this.a == null)
        this.a = new ArrayList();
      paramFragment.setIndex(this.a.size(), this.r);
      this.a.add(paramFragment);
    }
    while (!paramFragment.mDetached)
    {
      if (this.b.contains(paramFragment))
      {
        throw new IllegalStateException("Fragment already added: " + paramFragment);
        label127: paramFragment.setIndex(((Integer)this.o.remove(-1 + this.o.size())).intValue(), this.r);
        this.a.set(paramFragment.mIndex, paramFragment);
        continue;
      }
      this.b.add(paramFragment);
      paramFragment.mAdded = true;
      paramFragment.mRemoving = false;
      if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible))
        this.s = true;
      if (!paramBoolean)
        break;
      c(paramFragment);
    }
  }

  public final void a(FragmentActivity paramFragmentActivity, p paramp, Fragment paramFragment)
  {
    if (this.g != null)
      throw new IllegalStateException("Already attached");
    this.g = paramFragmentActivity;
    this.h = paramp;
    this.r = paramFragment;
  }

  public final void a(r paramr)
  {
    if (this.q == null)
      this.q = new ArrayList();
    this.q.add(paramr);
  }

  // ERROR //
  public final void a(Runnable paramRunnable, boolean paramBoolean)
  {
    // Byte code:
    //   0: iload_2
    //   1: ifne +7 -> 8
    //   4: aload_0
    //   5: invokespecial 813	android/support/v4/app/s:r	()V
    //   8: aload_0
    //   9: monitorenter
    //   10: aload_0
    //   11: getfield 753	android/support/v4/app/s:t	Z
    //   14: ifne +10 -> 24
    //   17: aload_0
    //   18: getfield 135	android/support/v4/app/s:g	Landroid/support/v4/app/FragmentActivity;
    //   21: ifnonnull +19 -> 40
    //   24: new 279	java/lang/IllegalStateException
    //   27: dup
    //   28: ldc_w 815
    //   31: invokespecial 284	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   34: athrow
    //   35: astore_3
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_3
    //   39: athrow
    //   40: aload_0
    //   41: getfield 817	android/support/v4/app/s:l	Ljava/util/ArrayList;
    //   44: ifnonnull +14 -> 58
    //   47: aload_0
    //   48: new 170	java/util/ArrayList
    //   51: dup
    //   52: invokespecial 171	java/util/ArrayList:<init>	()V
    //   55: putfield 817	android/support/v4/app/s:l	Ljava/util/ArrayList;
    //   58: aload_0
    //   59: getfield 817	android/support/v4/app/s:l	Ljava/util/ArrayList;
    //   62: aload_1
    //   63: invokevirtual 183	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   66: pop
    //   67: aload_0
    //   68: getfield 817	android/support/v4/app/s:l	Ljava/util/ArrayList;
    //   71: invokevirtual 175	java/util/ArrayList:size	()I
    //   74: iconst_1
    //   75: if_icmpne +32 -> 107
    //   78: aload_0
    //   79: getfield 135	android/support/v4/app/s:g	Landroid/support/v4/app/FragmentActivity;
    //   82: getfield 821	android/support/v4/app/FragmentActivity:mHandler	Landroid/os/Handler;
    //   85: aload_0
    //   86: getfield 89	android/support/v4/app/s:x	Ljava/lang/Runnable;
    //   89: invokevirtual 827	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   92: aload_0
    //   93: getfield 135	android/support/v4/app/s:g	Landroid/support/v4/app/FragmentActivity;
    //   96: getfield 821	android/support/v4/app/FragmentActivity:mHandler	Landroid/os/Handler;
    //   99: aload_0
    //   100: getfield 89	android/support/v4/app/s:x	Ljava/lang/Runnable;
    //   103: invokevirtual 831	android/os/Handler:post	(Ljava/lang/Runnable;)Z
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
    if (this.a != null)
    {
      int i11 = this.a.size();
      if (i11 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
        paramPrintWriter.println(":");
        for (int i12 = 0; i12 < i11; i12++)
        {
          Fragment localFragment3 = (Fragment)this.a.get(i12);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i12);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localFragment3);
          if (localFragment3 == null)
            continue;
          localFragment3.dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        }
      }
    }
    if (this.b != null)
    {
      int i9 = this.b.size();
      if (i9 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Added Fragments:");
        for (int i10 = 0; i10 < i9; i10++)
        {
          Fragment localFragment2 = (Fragment)this.b.get(i10);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i10);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localFragment2.toString());
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
          Fragment localFragment1 = (Fragment)this.p.get(i8);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i8);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localFragment1.toString());
        }
      }
    }
    if (this.c != null)
    {
      int i5 = this.c.size();
      if (i5 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        for (int i6 = 0; i6 < i5; i6++)
        {
          e locale2 = (e)this.c.get(i6);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i6);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(locale2.toString());
          locale2.a(str, paramPrintWriter);
        }
      }
    }
    monitorenter;
    try
    {
      if (this.d != null)
      {
        int i3 = this.d.size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Back Stack Indices:");
          for (int i4 = 0; i4 < i3; i4++)
          {
            e locale1 = (e)this.d.get(i4);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i4);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(locale1);
          }
        }
      }
      if ((this.e != null) && (this.e.size() > 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mAvailBackStackIndices: ");
        paramPrintWriter.println(Arrays.toString(this.e.toArray()));
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
    paramPrintWriter.print("  mActivity=");
    paramPrintWriter.println(this.g);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mContainer=");
    paramPrintWriter.println(this.h);
    if (this.r != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mParent=");
      paramPrintWriter.println(this.r);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    paramPrintWriter.print(this.f);
    paramPrintWriter.print(" mStateSaved=");
    paramPrintWriter.print(this.i);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.t);
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

  final boolean a(int paramInt1, int paramInt2)
  {
    if (this.c == null);
    int i1;
    do
      while (true)
      {
        return false;
        if ((paramInt1 < 0) && ((paramInt2 & 0x1) == 0))
        {
          int i7 = -1 + this.c.size();
          if (i7 < 0)
            continue;
          e locale4 = (e)this.c.remove(i7);
          SparseArray localSparseArray3 = new SparseArray();
          SparseArray localSparseArray4 = new SparseArray();
          locale4.a(localSparseArray3, localSparseArray4);
          locale4.a(true, null, localSparseArray3, localSparseArray4);
          i();
          return true;
        }
        i1 = -1;
        if (paramInt1 < 0)
          break;
        for (int i6 = -1 + this.c.size(); i6 >= 0; i6--)
        {
          e locale3 = (e)this.c.get(i6);
          if ((paramInt1 >= 0) && (paramInt1 == locale3.g))
            break;
        }
        if (i6 < 0)
          continue;
        if ((paramInt2 & 0x1) != 0)
        {
          i6--;
          while (i6 >= 0)
          {
            e locale2 = (e)this.c.get(i6);
            if ((paramInt1 < 0) || (paramInt1 != locale2.g))
              break;
            i6--;
          }
        }
        i1 = i6;
      }
    while (i1 == -1 + this.c.size());
    ArrayList localArrayList = new ArrayList();
    for (int i2 = -1 + this.c.size(); i2 > i1; i2--)
      localArrayList.add(this.c.remove(i2));
    int i3 = -1 + localArrayList.size();
    SparseArray localSparseArray1 = new SparseArray();
    SparseArray localSparseArray2 = new SparseArray();
    for (int i4 = 0; i4 <= i3; i4++)
      ((e)localArrayList.get(i4)).a(localSparseArray1, localSparseArray2);
    Object localObject = null;
    int i5 = 0;
    label330: e locale1;
    if (i5 <= i3)
    {
      locale1 = (e)localArrayList.get(i5);
      if (i5 != i3)
        break label384;
    }
    label384: for (boolean bool = true; ; bool = false)
    {
      i locali = locale1.a(bool, (i)localObject, localSparseArray1, localSparseArray2);
      i5++;
      localObject = locali;
      break label330;
      break;
    }
  }

  public final boolean a(Menu paramMenu)
  {
    if (this.b != null)
    {
      int i2 = 0;
      i1 = 0;
      while (i2 < this.b.size())
      {
        Fragment localFragment = (Fragment)this.b.get(i2);
        if ((localFragment != null) && (localFragment.performPrepareOptionsMenu(paramMenu)))
          i1 = 1;
        i2++;
      }
    }
    int i1 = 0;
    return i1;
  }

  public final boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    ArrayList localArrayList1 = null;
    if (this.b != null)
    {
      int i3 = 0;
      int i4;
      for (i1 = 0; i3 < this.b.size(); i1 = i4)
      {
        Fragment localFragment2 = (Fragment)this.b.get(i3);
        if ((localFragment2 != null) && (localFragment2.performCreateOptionsMenu(paramMenu, paramMenuInflater)))
        {
          i1 = 1;
          if (localArrayList1 == null)
            localArrayList1 = new ArrayList();
          localArrayList1.add(localFragment2);
        }
        i4 = i1;
        i3++;
      }
    }
    int i1 = 0;
    ArrayList localArrayList2 = this.p;
    int i2 = 0;
    if (localArrayList2 != null)
      while (i2 < this.p.size())
      {
        Fragment localFragment1 = (Fragment)this.p.get(i2);
        if ((localArrayList1 == null) || (!localArrayList1.contains(localFragment1)))
          localFragment1.onDestroyOptionsMenu();
        i2++;
      }
    this.p = localArrayList1;
    return i1;
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    ArrayList localArrayList = this.b;
    int i1 = 0;
    if (localArrayList != null);
    for (int i2 = 0; ; i2++)
    {
      int i3 = this.b.size();
      i1 = 0;
      if (i2 < i3)
      {
        Fragment localFragment = (Fragment)this.b.get(i2);
        if ((localFragment == null) || (!localFragment.performOptionsItemSelected(paramMenuItem)))
          continue;
        i1 = 1;
      }
      return i1;
    }
  }

  public final void b(int paramInt)
  {
    if (paramInt < 0)
      throw new IllegalArgumentException("Bad id: " + paramInt);
    a(new v(this, paramInt), false);
  }

  public final void b(Fragment paramFragment)
  {
    if (paramFragment.mDeferStart)
    {
      if (this.n)
        this.u = true;
    }
    else
      return;
    paramFragment.mDeferStart = false;
    a(paramFragment, this.f, 0, 0, false);
  }

  public final void b(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (!paramFragment.mHidden)
    {
      paramFragment.mHidden = true;
      if (paramFragment.mView != null)
      {
        Animation localAnimation = a(paramFragment, paramInt1, false, paramInt2);
        if (localAnimation != null)
          paramFragment.mView.startAnimation(localAnimation);
        paramFragment.mView.setVisibility(8);
      }
      if ((paramFragment.mAdded) && (paramFragment.mHasMenu) && (paramFragment.mMenuVisible))
        this.s = true;
      paramFragment.onHiddenChanged(true);
    }
  }

  public final void b(r paramr)
  {
    if (this.q != null)
      this.q.remove(paramr);
  }

  public final void b(Menu paramMenu)
  {
    if (this.b != null)
      for (int i1 = 0; i1 < this.b.size(); i1++)
      {
        Fragment localFragment = (Fragment)this.b.get(i1);
        if (localFragment == null)
          continue;
        localFragment.performOptionsMenuClosed(paramMenu);
      }
  }

  public final boolean b()
  {
    return h();
  }

  public final boolean b(MenuItem paramMenuItem)
  {
    ArrayList localArrayList = this.b;
    int i1 = 0;
    if (localArrayList != null);
    for (int i2 = 0; ; i2++)
    {
      int i3 = this.b.size();
      i1 = 0;
      if (i2 < i3)
      {
        Fragment localFragment = (Fragment)this.b.get(i2);
        if ((localFragment == null) || (!localFragment.performContextItemSelected(paramMenuItem)))
          continue;
        i1 = 1;
      }
      return i1;
    }
  }

  public final void c()
  {
    a(new u(this), false);
  }

  final void c(int paramInt)
  {
    a(paramInt, 0, 0, false);
  }

  public final void c(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (paramFragment.mHidden)
    {
      paramFragment.mHidden = false;
      if (paramFragment.mView != null)
      {
        Animation localAnimation = a(paramFragment, paramInt1, true, paramInt2);
        if (localAnimation != null)
          paramFragment.mView.startAnimation(localAnimation);
        paramFragment.mView.setVisibility(0);
      }
      if ((paramFragment.mAdded) && (paramFragment.mHasMenu) && (paramFragment.mMenuVisible))
        this.s = true;
      paramFragment.onHiddenChanged(false);
    }
  }

  public final void d(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (!paramFragment.mDetached)
    {
      paramFragment.mDetached = true;
      if (paramFragment.mAdded)
      {
        if (this.b != null)
          this.b.remove(paramFragment);
        if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible))
          this.s = true;
        paramFragment.mAdded = false;
        a(paramFragment, 1, paramInt1, paramInt2, false);
      }
    }
  }

  public final boolean d()
  {
    r();
    h();
    return a(-1, 0);
  }

  public final int e()
  {
    if (this.c != null)
      return this.c.size();
    return 0;
  }

  public final void e(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (paramFragment.mDetached)
    {
      paramFragment.mDetached = false;
      if (!paramFragment.mAdded)
      {
        if (this.b == null)
          this.b = new ArrayList();
        if (this.b.contains(paramFragment))
          throw new IllegalStateException("Fragment already added: " + paramFragment);
        this.b.add(paramFragment);
        paramFragment.mAdded = true;
        if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible))
          this.s = true;
        a(paramFragment, this.f, paramInt1, paramInt2, false);
      }
    }
  }

  public final List<Fragment> f()
  {
    return this.a;
  }

  final void g()
  {
    if (this.a == null);
    while (true)
    {
      return;
      for (int i1 = 0; i1 < this.a.size(); i1++)
      {
        Fragment localFragment = (Fragment)this.a.get(i1);
        if (localFragment == null)
          continue;
        b(localFragment);
      }
    }
  }

  public final boolean h()
  {
    if (this.n)
      throw new IllegalStateException("Recursive entry to executePendingTransactions");
    if (Looper.myLooper() != this.g.mHandler.getLooper())
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
          if (!this.u)
            break;
          int i2 = 0;
          bool = false;
          while (i2 < this.a.size())
          {
            Fragment localFragment = (Fragment)this.a.get(i2);
            if ((localFragment != null) && (localFragment.mLoaderManager != null))
              bool |= localFragment.mLoaderManager.a();
            i2++;
          }
        }
        int i3 = this.l.size();
        if ((this.m == null) || (this.m.length < i3))
          this.m = new Runnable[i3];
        this.l.toArray(this.m);
        this.l.clear();
        this.g.mHandler.removeCallbacks(this.x);
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
      this.u = false;
      g();
    }
    return i1;
  }

  final void i()
  {
    if (this.q != null)
      for (int i1 = 0; i1 < this.q.size(); i1++)
        ((r)this.q.get(i1)).onBackStackChanged();
  }

  final Parcelable j()
  {
    h();
    if (k)
      this.i = true;
    if ((this.a == null) || (this.a.size() <= 0))
      return null;
    int i1 = this.a.size();
    FragmentState[] arrayOfFragmentState = new FragmentState[i1];
    int i2 = 0;
    int i3 = 0;
    label54: Fragment localFragment;
    FragmentState localFragmentState;
    int i8;
    if (i2 < i1)
    {
      localFragment = (Fragment)this.a.get(i2);
      if (localFragment == null)
        break label565;
      if (localFragment.mIndex < 0)
        a(new IllegalStateException("Failure saving state: active " + localFragment + " has cleared index: " + localFragment.mIndex));
      localFragmentState = new FragmentState(localFragment);
      arrayOfFragmentState[i2] = localFragmentState;
      if ((localFragment.mState > 0) && (localFragmentState.j == null))
      {
        localFragmentState.j = e(localFragment);
        if (localFragment.mTarget == null)
          break label320;
        if (localFragment.mTarget.mIndex < 0)
          a(new IllegalStateException("Failure saving state: " + localFragment + " has target not in fragment manager: " + localFragment.mTarget));
        if (localFragmentState.j == null)
          localFragmentState.j = new Bundle();
        a(localFragmentState.j, "android:target_state", localFragment.mTarget);
        if (localFragment.mTargetRequestCode == 0)
          break label320;
        localFragmentState.j.putInt("android:target_req_state", localFragment.mTargetRequestCode);
        i8 = 1;
      }
    }
    while (true)
    {
      i2++;
      i3 = i8;
      break label54;
      localFragmentState.j = localFragment.mSavedFragmentState;
      label320: i8 = 1;
      continue;
      if (i3 == 0)
        break;
      if (this.b != null)
      {
        int i6 = this.b.size();
        if (i6 > 0)
        {
          arrayOfInt = new int[i6];
          for (int i7 = 0; i7 < i6; i7++)
          {
            arrayOfInt[i7] = ((Fragment)this.b.get(i7)).mIndex;
            if (arrayOfInt[i7] >= 0)
              continue;
            a(new IllegalStateException("Failure saving state: active " + this.b.get(i7) + " has cleared index: " + arrayOfInt[i7]));
          }
        }
      }
      int[] arrayOfInt = null;
      ArrayList localArrayList = this.c;
      BackStackState[] arrayOfBackStackState = null;
      if (localArrayList != null)
      {
        int i4 = this.c.size();
        arrayOfBackStackState = null;
        if (i4 > 0)
        {
          arrayOfBackStackState = new BackStackState[i4];
          for (int i5 = 0; i5 < i4; i5++)
            arrayOfBackStackState[i5] = new BackStackState((e)this.c.get(i5));
        }
      }
      FragmentManagerState localFragmentManagerState = new FragmentManagerState();
      localFragmentManagerState.a = arrayOfFragmentState;
      localFragmentManagerState.b = arrayOfInt;
      localFragmentManagerState.c = arrayOfBackStackState;
      return localFragmentManagerState;
      label565: i8 = i3;
    }
  }

  public final void k()
  {
    this.i = false;
    c(1);
  }

  public final void l()
  {
    this.i = false;
    c(2);
  }

  public final void m()
  {
    this.i = false;
    c(4);
  }

  public final void n()
  {
    this.i = false;
    c(5);
  }

  public final void o()
  {
    this.i = true;
    c(3);
  }

  public final void p()
  {
    this.t = true;
    h();
    c(0);
    this.g = null;
    this.h = null;
    this.r = null;
  }

  public final void q()
  {
    if (this.b != null)
      for (int i1 = 0; i1 < this.b.size(); i1++)
      {
        Fragment localFragment = (Fragment)this.b.get(i1);
        if (localFragment == null)
          continue;
        localFragment.performLowMemory();
      }
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    if (this.r != null)
      b.a(this.r, localStringBuilder);
    while (true)
    {
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
      b.a(this.g, localStringBuilder);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.s
 * JD-Core Version:    0.6.0
 */