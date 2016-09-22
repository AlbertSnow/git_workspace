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
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public final class ac extends w
{
  final Handler a = new ad(this);
  final ah b = new ah(new ae(this));
  boolean c;
  boolean d;
  private boolean e;
  private boolean f;
  private boolean g;
  private boolean h;

  private static String a(View paramView)
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

  private final void a(String paramString, PrintWriter paramPrintWriter, View paramView)
  {
    paramPrintWriter.print(paramString);
    if (paramView == null)
      paramPrintWriter.println("null");
    while (true)
    {
      return;
      paramPrintWriter.println(a(paramView));
      if (!(paramView instanceof ViewGroup))
        continue;
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i = localViewGroup.getChildCount();
      if (i <= 0)
        continue;
      String str = paramString + "  ";
      for (int j = 0; j < i; j++)
        a(str, paramPrintWriter, localViewGroup.getChildAt(j));
    }
  }

  final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.b.a.d.a(paramView, paramString, paramContext, paramAttributeSet);
  }

  protected final void a()
  {
    this.b.a.d.h();
  }

  public final void a(z paramz, Intent paramIntent, int paramInt)
  {
    if (paramInt == -1)
    {
      super.startActivityForResult(paramIntent, -1);
      return;
    }
    if ((0xFFFF0000 & paramInt) != 0)
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    super.startActivityForResult(paramIntent, (1 + paramz.h << 16) + (0xFFFF & paramInt));
  }

  final void a(boolean paramBoolean)
  {
    ai localai;
    if (!this.g)
    {
      this.g = true;
      this.h = paramBoolean;
      this.a.removeMessages(1);
      ah localah = this.b;
      boolean bool = this.h;
      localai = localah.a;
      localai.f = bool;
      if ((localai.g != null) && (localai.i))
      {
        localai.i = false;
        if (!bool)
          break label97;
        localai.g.d();
      }
    }
    while (true)
    {
      this.b.a.d.a(2, false);
      return;
      label97: localai.g.c();
    }
  }

  public final aj b()
  {
    return this.b.a.d;
  }

  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    String str = paramString + "  ";
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.e);
    paramPrintWriter.print("mResumed=");
    paramPrintWriter.print(this.f);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.c);
    paramPrintWriter.print(" mReallyStopped=");
    paramPrintWriter.println(this.g);
    ai localai = this.b.a;
    paramPrintWriter.print(str);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(localai.i);
    if (localai.g != null)
    {
      paramPrintWriter.print(str);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(localai.g)));
      paramPrintWriter.println(":");
      localai.g.a(str + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    this.b.a.d.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("View Hierarchy:");
    a(paramString + "  ", paramPrintWriter, getWindow().getDecorView());
  }

  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.b.b();
    int i = paramInt1 >> 16;
    if (i != 0)
    {
      int j = i - 1;
      int k = this.b.a();
      if ((k == 0) || (j < 0) || (j >= k))
      {
        Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(paramInt1));
        return;
      }
      z localz = (z)this.b.a(new ArrayList(k)).get(j);
      if (localz == null)
      {
        Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(paramInt1));
        return;
      }
      localz.a(0xFFFF & paramInt1, paramInt2, paramIntent);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public final void onBackPressed()
  {
    if (!this.b.a.d.b())
    {
      if (Build.VERSION.SDK_INT >= 21)
        finishAfterTransition();
    }
    else
      return;
    finish();
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.b.a.d.a(paramConfiguration);
  }

  protected final void onCreate(Bundle paramBundle)
  {
    ah localah1 = this.b;
    localah1.a.d.a(localah1.a, localah1.a, null);
    super.onCreate(paramBundle);
    af localaf = (af)getLastNonConfigurationInstance();
    if (localaf != null)
    {
      ah localah3 = this.b;
      dh localdh = localaf.b;
      localah3.a.e = localdh;
    }
    Parcelable localParcelable;
    ah localah2;
    if (paramBundle != null)
    {
      localParcelable = paramBundle.getParcelable("android:support:fragments");
      localah2 = this.b;
      if (localaf == null)
        break label121;
    }
    label121: for (List localList = localaf.a; ; localList = null)
    {
      localah2.a.d.a(localParcelable, localList);
      this.b.a.d.e();
      return;
    }
  }

  public final boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      boolean bool1 = super.onCreatePanelMenu(paramInt, paramMenu);
      ah localah = this.b;
      MenuInflater localMenuInflater = getMenuInflater();
      boolean bool2 = bool1 | localah.a.d.a(paramMenu, localMenuInflater);
      if (Build.VERSION.SDK_INT >= 11)
        return bool2;
      return true;
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }

  protected final void onDestroy()
  {
    super.onDestroy();
    a(false);
    this.b.a.d.j();
    ai localai = this.b.a;
    if (localai.g != null)
      localai.g.g();
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 5) && (paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      onBackPressed();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public final void onLowMemory()
  {
    super.onLowMemory();
    this.b.a.d.k();
  }

  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem))
      return true;
    switch (paramInt)
    {
    default:
      return false;
    case 0:
      return this.b.a.d.a(paramMenuItem);
    case 6:
    }
    return this.b.a.d.b(paramMenuItem);
  }

  protected final void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.b.b();
  }

  public final void onPanelClosed(int paramInt, Menu paramMenu)
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
      this.b.a.d.b(paramMenu);
    }
  }

  protected final void onPause()
  {
    super.onPause();
    this.f = false;
    if (this.a.hasMessages(2))
    {
      this.a.removeMessages(2);
      this.b.a.d.h();
    }
    this.b.a.d.a(4, false);
  }

  protected final void onPostResume()
  {
    super.onPostResume();
    this.a.removeMessages(2);
    this.b.a.d.h();
    this.b.c();
  }

  public final boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) && (paramMenu != null))
    {
      if (this.d)
      {
        this.d = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
      return super.onPreparePanel(0, paramView, paramMenu) | this.b.a.d.a(paramMenu);
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }

  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i = 0xFF & paramInt >> 8;
    int j;
    int k;
    if (i != 0)
    {
      j = i - 1;
      k = this.b.a();
      if ((k == 0) || (j < 0) || (j >= k))
        Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(paramInt));
    }
    else
    {
      return;
    }
    if ((z)this.b.a(new ArrayList(k)).get(j) == null)
    {
      Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(paramInt));
      return;
    }
    z.h();
  }

  protected final void onResume()
  {
    super.onResume();
    this.a.sendEmptyMessage(2);
    this.f = true;
    this.b.c();
  }

  public final Object onRetainNonConfigurationInstance()
  {
    if (this.c)
      a(true);
    ak localak = this.b.a.d;
    ArrayList localArrayList;
    if (localak.b != null)
    {
      int i = 0;
      localArrayList = null;
      if (i < localak.b.size())
      {
        z localz = (z)localak.b.get(i);
        if ((localz != null) && (localz.D))
        {
          if (localArrayList == null)
            localArrayList = new ArrayList();
          localArrayList.add(localz);
          localz.E = true;
          if (localz.k == null)
            break label130;
        }
        label130: for (int j = localz.k.h; ; j = -1)
        {
          localz.l = j;
          i++;
          break;
        }
      }
    }
    else
    {
      localArrayList = null;
    }
    dh localdh = this.b.a.g();
    if ((localArrayList == null) && (localdh == null))
      return null;
    af localaf = new af();
    localaf.a = localArrayList;
    localaf.b = localdh;
    return localaf;
  }

  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Parcelable localParcelable = this.b.a.d.d();
    if (localParcelable != null)
      paramBundle.putParcelable("android:support:fragments", localParcelable);
  }

  protected final void onStart()
  {
    super.onStart();
    this.c = false;
    this.g = false;
    this.a.removeMessages(1);
    if (!this.e)
    {
      this.e = true;
      this.b.a.d.f();
    }
    this.b.b();
    this.b.c();
    ai localai1 = this.b.a;
    if (!localai1.i)
    {
      localai1.i = true;
      if (localai1.g == null)
        break label179;
      localai1.g.b();
    }
    while (true)
    {
      localai1.h = true;
      this.b.a.d.g();
      ai localai2 = this.b.a;
      if (localai2.e == null)
        break;
      int i = localai2.e.size();
      be[] arrayOfbe = new be[i];
      int j = i - 1;
      while (true)
        if (j >= 0)
        {
          arrayOfbe[j] = ((be)localai2.e.c(j));
          j--;
          continue;
          label179: if (localai1.h)
            break;
          localai1.g = localai1.a("(root)", localai1.i, false);
          if ((localai1.g == null) || (localai1.g.d))
            break;
          localai1.g.b();
          break;
        }
      for (int k = 0; k < i; k++)
      {
        be localbe = arrayOfbe[k];
        if (localbe.e)
        {
          localbe.e = false;
          for (int m = -1 + localbe.b.c; m >= 0; m--)
          {
            bf localbf = (bf)localbe.b.b[m];
            if (!localbf.e)
              continue;
            localbf.e = false;
            if ((localbf.d == localbf.f) || (localbf.d))
              continue;
            localbf.a();
          }
        }
        localbe.f();
      }
    }
  }

  public final void onStateNotSaved()
  {
    this.b.b();
  }

  protected final void onStop()
  {
    super.onStop();
    this.c = true;
    this.a.sendEmptyMessage(1);
    this.b.a.d.i();
  }

  public final void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if ((paramInt != -1) && ((0xFFFF0000 & paramInt) != 0))
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    super.startActivityForResult(paramIntent, paramInt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ac
 * JD-Core Version:    0.6.0
 */