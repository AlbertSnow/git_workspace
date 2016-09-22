package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost
  implements TabHost.OnTabChangeListener
{
  private final ArrayList<ab> a = new ArrayList();
  private int b;
  private TabHost.OnTabChangeListener c;
  private ab d;
  private boolean e;

  public FragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842995 }, 0, 0);
    this.b = localTypedArray.getResourceId(0, 0);
    localTypedArray.recycle();
    super.setOnTabChangedListener(this);
  }

  private ac a(String paramString, ac paramac)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2;
    if (i < this.a.size())
    {
      localObject2 = (ab)this.a.get(i);
      if (!ab.b((ab)localObject2).equals(paramString))
        break label203;
    }
    while (true)
    {
      i++;
      localObject1 = localObject2;
      break;
      if (localObject1 == null)
        throw new IllegalStateException("No tab known for tag " + paramString);
      if (this.d != localObject1)
      {
        if (paramac == null)
          paramac = null.a();
        if ((this.d != null) && (ab.a(this.d) != null))
          paramac.b(ab.a(this.d));
        if (localObject1 != null)
        {
          if (ab.a(localObject1) != null)
            break label190;
          ab.a(localObject1, Fragment.instantiate(null, ab.c(localObject1).getName(), ab.d(localObject1)));
          paramac.a(this.b, ab.a(localObject1), ab.b(localObject1));
        }
      }
      while (true)
      {
        this.d = localObject1;
        return paramac;
        label190: paramac.c(ab.a(localObject1));
      }
      label203: localObject2 = localObject1;
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    String str = getCurrentTabTag();
    int i = 0;
    ac localac1 = null;
    if (i < this.a.size())
    {
      ab localab = (ab)this.a.get(i);
      ab.a(localab, null.a(ab.b(localab)));
      if ((ab.a(localab) != null) && (!ab.a(localab).isDetached()))
      {
        if (!ab.b(localab).equals(str))
          break label95;
        this.d = localab;
      }
      while (true)
      {
        i++;
        break;
        label95: if (localac1 == null)
          localac1 = null.a();
        localac1.b(ab.a(localab));
      }
    }
    this.e = true;
    ac localac2 = a(str, localac1);
    if (localac2 != null)
    {
      localac2.a();
      null.b();
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.e = false;
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    FragmentTabHost.SavedState localSavedState = (FragmentTabHost.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    setCurrentTabByTag(localSavedState.a);
  }

  protected Parcelable onSaveInstanceState()
  {
    FragmentTabHost.SavedState localSavedState = new FragmentTabHost.SavedState(super.onSaveInstanceState());
    localSavedState.a = getCurrentTabTag();
    return localSavedState;
  }

  public void onTabChanged(String paramString)
  {
    if (this.e)
    {
      ac localac = a(paramString, null);
      if (localac != null)
        localac.a();
    }
    if (this.c != null)
      this.c.onTabChanged(paramString);
  }

  public void setOnTabChangedListener(TabHost.OnTabChangeListener paramOnTabChangeListener)
  {
    this.c = paramOnTabChangeListener;
  }

  @Deprecated
  public void setup()
  {
    throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.FragmentTabHost
 * JD-Core Version:    0.6.0
 */