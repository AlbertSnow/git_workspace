package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.e.l;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FragmentActivity extends Activity
{
  static final String FRAGMENTS_TAG = "android:support:fragments";
  private static final int HONEYCOMB = 11;
  static final int MSG_REALLY_STOPPED = 1;
  static final int MSG_RESUME_PENDING = 2;
  private static final String TAG = "FragmentActivity";
  l<String, am> mAllLoaderManagers;
  boolean mCheckedForLoaderManager;
  final p mContainer = new n(this);
  boolean mCreated;
  final s mFragments = new s();
  final Handler mHandler = new m(this);
  am mLoaderManager;
  boolean mLoadersStarted;
  boolean mOptionsMenuInvalidated;
  boolean mReallyStopped;
  boolean mResumed;
  boolean mRetaining;
  boolean mStopped;

  private void dumpViewHierarchy(String paramString, PrintWriter paramPrintWriter, View paramView)
  {
    paramPrintWriter.print(paramString);
    if (paramView == null)
      paramPrintWriter.println("null");
    while (true)
    {
      return;
      paramPrintWriter.println(viewToString(paramView));
      if (!(paramView instanceof ViewGroup))
        continue;
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i = localViewGroup.getChildCount();
      if (i <= 0)
        continue;
      String str = paramString + "  ";
      for (int j = 0; j < i; j++)
        dumpViewHierarchy(str, paramPrintWriter, localViewGroup.getChildAt(j));
    }
  }

  private static String viewToString(View paramView)
  {
    char c1 = 'F';
    char c2 = '.';
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(paramView.getClass().getName());
    localStringBuilder.append('{');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(paramView)));
    localStringBuilder.append(' ');
    switch (paramView.getVisibility())
    {
    default:
      localStringBuilder.append(c2);
    case 0:
    case 4:
    case 8:
    }
    while (true)
    {
      char c3;
      label108: char c4;
      label126: char c5;
      label143: char c6;
      label161: char c7;
      label179: char c8;
      label197: char c9;
      label215: label236: char c10;
      label253: int i;
      Resources localResources;
      if (paramView.isFocusable())
      {
        c3 = c1;
        localStringBuilder.append(c3);
        if (!paramView.isEnabled())
          break label533;
        c4 = 'E';
        localStringBuilder.append(c4);
        if (!paramView.willNotDraw())
          break label539;
        c5 = c2;
        localStringBuilder.append(c5);
        if (!paramView.isHorizontalScrollBarEnabled())
          break label546;
        c6 = 'H';
        localStringBuilder.append(c6);
        if (!paramView.isVerticalScrollBarEnabled())
          break label552;
        c7 = 'V';
        localStringBuilder.append(c7);
        if (!paramView.isClickable())
          break label558;
        c8 = 'C';
        localStringBuilder.append(c8);
        if (!paramView.isLongClickable())
          break label564;
        c9 = 'L';
        localStringBuilder.append(c9);
        localStringBuilder.append(' ');
        if (!paramView.isFocused())
          break label570;
        localStringBuilder.append(c1);
        if (!paramView.isSelected())
          break label575;
        c10 = 'S';
        localStringBuilder.append(c10);
        if (paramView.isPressed())
          c2 = 'P';
        localStringBuilder.append(c2);
        localStringBuilder.append(' ');
        localStringBuilder.append(paramView.getLeft());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getTop());
        localStringBuilder.append('-');
        localStringBuilder.append(paramView.getRight());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getBottom());
        i = paramView.getId();
        if (i != -1)
        {
          localStringBuilder.append(" #");
          localStringBuilder.append(Integer.toHexString(i));
          localResources = paramView.getResources();
          if ((i != 0) && (localResources != null))
            switch (0xFF000000 & i)
            {
            default:
            case 2130706432:
            case 16777216:
            }
        }
      }
      try
      {
        String str1 = localResources.getResourcePackageName(i);
        while (true)
        {
          String str2 = localResources.getResourceTypeName(i);
          String str3 = localResources.getResourceEntryName(i);
          localStringBuilder.append(" ");
          localStringBuilder.append(str1);
          localStringBuilder.append(":");
          localStringBuilder.append(str2);
          localStringBuilder.append("/");
          localStringBuilder.append(str3);
          label485: localStringBuilder.append("}");
          return localStringBuilder.toString();
          localStringBuilder.append('V');
          break;
          localStringBuilder.append('I');
          break;
          localStringBuilder.append('G');
          break;
          c3 = c2;
          break label108;
          label533: c4 = c2;
          break label126;
          label539: c5 = 'D';
          break label143;
          label546: c6 = c2;
          break label161;
          label552: c7 = c2;
          break label179;
          label558: c8 = c2;
          break label197;
          label564: c9 = c2;
          break label215;
          label570: c1 = c2;
          break label236;
          label575: c10 = c2;
          break label253;
          str1 = "app";
          continue;
          str1 = "android";
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        break label485;
      }
    }
  }

  void doReallyStop(boolean paramBoolean)
  {
    if (!this.mReallyStopped)
    {
      this.mReallyStopped = true;
      this.mRetaining = paramBoolean;
      this.mHandler.removeMessages(1);
      onReallyStop();
    }
  }

  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    String str = paramString + "  ";
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.mCreated);
    paramPrintWriter.print("mResumed=");
    paramPrintWriter.print(this.mResumed);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.mStopped);
    paramPrintWriter.print(" mReallyStopped=");
    paramPrintWriter.println(this.mReallyStopped);
    paramPrintWriter.print(str);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(this.mLoadersStarted);
    if (this.mLoaderManager != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this.mLoaderManager)));
      paramPrintWriter.println(":");
      this.mLoaderManager.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    this.mFragments.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("View Hierarchy:");
    dumpViewHierarchy(paramString + "  ", paramPrintWriter, getWindow().getDecorView());
  }

  public Object getLastCustomNonConfigurationInstance()
  {
    o localo = (o)getLastNonConfigurationInstance();
    if (localo != null)
      return localo.a;
    return null;
  }

  am getLoaderManager(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.mAllLoaderManagers == null)
      this.mAllLoaderManagers = new l();
    am localam = (am)this.mAllLoaderManagers.get(paramString);
    if (localam == null)
    {
      if (paramBoolean2)
      {
        localam = new am(paramString, this, paramBoolean1);
        this.mAllLoaderManagers.put(paramString, localam);
      }
      return localam;
    }
    localam.d = this;
    return localam;
  }

  public q getSupportFragmentManager()
  {
    return this.mFragments;
  }

  public ak getSupportLoaderManager()
  {
    if (this.mLoaderManager != null)
      return this.mLoaderManager;
    this.mCheckedForLoaderManager = true;
    this.mLoaderManager = getLoaderManager("(root)", this.mLoadersStarted, true);
    return this.mLoaderManager;
  }

  void invalidateSupportFragment(String paramString)
  {
    if (this.mAllLoaderManagers != null)
    {
      am localam = (am)this.mAllLoaderManagers.get(paramString);
      if ((localam != null) && (!localam.f))
      {
        localam.g();
        this.mAllLoaderManagers.remove(paramString);
      }
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.mFragments.i = false;
    int i = paramInt1 >> 16;
    if (i != 0)
    {
      int j = i - 1;
      if ((this.mFragments.a == null) || (j < 0) || (j >= this.mFragments.a.size()))
      {
        new StringBuilder("Activity result fragment index out of range: 0x").append(Integer.toHexString(paramInt1));
        return;
      }
      Fragment localFragment = (Fragment)this.mFragments.a.get(j);
      if (localFragment == null)
      {
        new StringBuilder("Activity result no fragment exists for index: 0x").append(Integer.toHexString(paramInt1));
        return;
      }
      localFragment.onActivityResult(0xFFFF & paramInt1, paramInt2, paramIntent);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public void onAttachFragment(Fragment paramFragment)
  {
  }

  public void onBackPressed()
  {
    if (!this.mFragments.d())
      supportFinishAfterTransition();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.mFragments.a(paramConfiguration);
  }

  protected void onCreate(Bundle paramBundle)
  {
    this.mFragments.a(this, this.mContainer, null);
    if (getLayoutInflater().getFactory() == null)
      getLayoutInflater().setFactory(this);
    super.onCreate(paramBundle);
    o localo = (o)getLastNonConfigurationInstance();
    if (localo != null)
      this.mAllLoaderManagers = localo.c;
    Parcelable localParcelable;
    s locals;
    if (paramBundle != null)
    {
      localParcelable = paramBundle.getParcelable("android:support:fragments");
      locals = this.mFragments;
      if (localo == null)
        break label99;
    }
    label99: for (ArrayList localArrayList = localo.b; ; localArrayList = null)
    {
      locals.a(localParcelable, localArrayList);
      this.mFragments.k();
      return;
    }
  }

  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      boolean bool = super.onCreatePanelMenu(paramInt, paramMenu) | this.mFragments.a(paramMenu, getMenuInflater());
      if (Build.VERSION.SDK_INT >= 11)
        return bool;
      return true;
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }

  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView;
    if (!"fragment".equals(paramString))
      localView = super.onCreateView(paramString, paramContext, paramAttributeSet);
    do
    {
      return localView;
      localView = this.mFragments.a(null, paramString, paramContext, paramAttributeSet);
    }
    while (localView != null);
    return super.onCreateView(paramString, paramContext, paramAttributeSet);
  }

  protected void onDestroy()
  {
    super.onDestroy();
    doReallyStop(false);
    this.mFragments.p();
    if (this.mLoaderManager != null)
      this.mLoaderManager.g();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 5) && (paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      onBackPressed();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onLowMemory()
  {
    super.onLowMemory();
    this.mFragments.q();
  }

  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem))
      return true;
    switch (paramInt)
    {
    default:
      return false;
    case 0:
      return this.mFragments.a(paramMenuItem);
    case 6:
    }
    return this.mFragments.b(paramMenuItem);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.mFragments.i = false;
  }

  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      super.onPanelClosed(paramInt, paramMenu);
      return;
      this.mFragments.b(paramMenu);
    }
  }

  protected void onPause()
  {
    super.onPause();
    this.mResumed = false;
    if (this.mHandler.hasMessages(2))
    {
      this.mHandler.removeMessages(2);
      onResumeFragments();
    }
    this.mFragments.c(4);
  }

  protected void onPostResume()
  {
    super.onPostResume();
    this.mHandler.removeMessages(2);
    onResumeFragments();
    this.mFragments.h();
  }

  protected boolean onPrepareOptionsPanel(View paramView, Menu paramMenu)
  {
    return super.onPreparePanel(0, paramView, paramMenu);
  }

  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) && (paramMenu != null))
    {
      if (this.mOptionsMenuInvalidated)
      {
        this.mOptionsMenuInvalidated = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
      return onPrepareOptionsPanel(paramView, paramMenu) | this.mFragments.a(paramMenu);
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }

  void onReallyStop()
  {
    if (this.mLoadersStarted)
    {
      this.mLoadersStarted = false;
      if (this.mLoaderManager != null)
      {
        if (this.mRetaining)
          break label42;
        this.mLoaderManager.c();
      }
    }
    while (true)
    {
      this.mFragments.c(2);
      return;
      label42: this.mLoaderManager.d();
    }
  }

  protected void onResume()
  {
    super.onResume();
    this.mHandler.sendEmptyMessage(2);
    this.mResumed = true;
    this.mFragments.h();
  }

  protected void onResumeFragments()
  {
    this.mFragments.n();
  }

  public Object onRetainCustomNonConfigurationInstance()
  {
    return null;
  }

  public final Object onRetainNonConfigurationInstance()
  {
    int i = 0;
    if (this.mStopped)
      doReallyStop(true);
    Object localObject = onRetainCustomNonConfigurationInstance();
    s locals = this.mFragments;
    ArrayList localArrayList;
    if (locals.a != null)
    {
      int n = 0;
      localArrayList = null;
      if (n < locals.a.size())
      {
        Fragment localFragment = (Fragment)locals.a.get(n);
        if ((localFragment != null) && (localFragment.mRetainInstance))
        {
          if (localArrayList == null)
            localArrayList = new ArrayList();
          localArrayList.add(localFragment);
          localFragment.mRetaining = true;
          if (localFragment.mTarget == null)
            break label135;
        }
        label135: for (int i1 = localFragment.mTarget.mIndex; ; i1 = -1)
        {
          localFragment.mTargetIndex = i1;
          n++;
          break;
        }
      }
    }
    else
    {
      localArrayList = null;
    }
    int j;
    if (this.mAllLoaderManagers != null)
    {
      int k = this.mAllLoaderManagers.size();
      am[] arrayOfam = new am[k];
      for (int m = k - 1; m >= 0; m--)
        arrayOfam[m] = ((am)this.mAllLoaderManagers.c(m));
      j = 0;
      if (i < k)
      {
        am localam = arrayOfam[i];
        if (localam.f)
          j = 1;
        while (true)
        {
          i++;
          break;
          localam.g();
          this.mAllLoaderManagers.remove(localam.c);
        }
      }
    }
    else
    {
      j = 0;
    }
    if ((localArrayList == null) && (j == 0) && (localObject == null))
      return null;
    o localo = new o();
    localo.a = localObject;
    localo.b = localArrayList;
    localo.c = this.mAllLoaderManagers;
    return localo;
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Parcelable localParcelable = this.mFragments.j();
    if (localParcelable != null)
      paramBundle.putParcelable("android:support:fragments", localParcelable);
  }

  protected void onStart()
  {
    super.onStart();
    this.mStopped = false;
    this.mReallyStopped = false;
    this.mHandler.removeMessages(1);
    if (!this.mCreated)
    {
      this.mCreated = true;
      this.mFragments.l();
    }
    this.mFragments.i = false;
    this.mFragments.h();
    if (!this.mLoadersStarted)
    {
      this.mLoadersStarted = true;
      if (this.mLoaderManager == null)
        break label147;
      this.mLoaderManager.b();
    }
    while (true)
    {
      this.mCheckedForLoaderManager = true;
      this.mFragments.m();
      if (this.mAllLoaderManagers == null)
        break;
      int i = this.mAllLoaderManagers.size();
      am[] arrayOfam = new am[i];
      int j = i - 1;
      while (true)
        if (j >= 0)
        {
          arrayOfam[j] = ((am)this.mAllLoaderManagers.c(j));
          j--;
          continue;
          label147: if (this.mCheckedForLoaderManager)
            break;
          this.mLoaderManager = getLoaderManager("(root)", this.mLoadersStarted, false);
          if ((this.mLoaderManager == null) || (this.mLoaderManager.e))
            break;
          this.mLoaderManager.b();
          break;
        }
      for (int k = 0; k < i; k++)
      {
        am localam = arrayOfam[k];
        if (localam.f)
        {
          localam.f = false;
          for (int m = -1 + localam.a.a(); m >= 0; m--)
          {
            an localan = (an)localam.a.e(m);
            if (localan.h)
            {
              localan.h = false;
              if ((localan.g != localan.i) && (!localan.g))
                localan.b();
            }
            if ((!localan.g) || (!localan.d) || (localan.j))
              continue;
            localan.b(localan.c, localan.f);
          }
        }
        localam.f();
      }
    }
  }

  protected void onStop()
  {
    super.onStop();
    this.mStopped = true;
    this.mHandler.sendEmptyMessage(1);
    this.mFragments.o();
  }

  public void setEnterSharedElementCallback(bn parambn)
  {
    a.a(this, parambn);
  }

  public void setExitSharedElementCallback(bn parambn)
  {
    a.b(this, parambn);
  }

  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if ((paramInt != -1) && ((0xFFFF0000 & paramInt) != 0))
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    super.startActivityForResult(paramIntent, paramInt);
  }

  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    if (paramInt == -1)
    {
      super.startActivityForResult(paramIntent, -1);
      return;
    }
    if ((0xFFFF0000 & paramInt) != 0)
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    super.startActivityForResult(paramIntent, (1 + paramFragment.mIndex << 16) + (0xFFFF & paramInt));
  }

  public void supportFinishAfterTransition()
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      finishAfterTransition();
      return;
    }
    finish();
  }

  public void supportInvalidateOptionsMenu()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      invalidateOptionsMenu();
      return;
    }
    this.mOptionsMenuInvalidated = true;
  }

  public void supportPostponeEnterTransition()
  {
    if (Build.VERSION.SDK_INT >= 21)
      postponeEnterTransition();
  }

  public void supportStartPostponedEnterTransition()
  {
    if (Build.VERSION.SDK_INT >= 21)
      startPostponedEnterTransition();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.FragmentActivity
 * JD-Core Version:    0.6.0
 */