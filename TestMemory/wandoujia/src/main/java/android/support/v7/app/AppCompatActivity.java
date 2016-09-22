package android.support.v7.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ao;
import android.support.v4.app.bo;
import android.support.v4.app.bp;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class AppCompatActivity extends FragmentActivity
  implements bp, k
{
  private l a;

  private boolean b()
  {
    Intent localIntent = ao.a(this);
    if (localIntent != null)
    {
      if (ao.a(this, localIntent))
      {
        bo localbo = bo.a(this);
        localbo.a(this);
        localbo.a();
        try
        {
          if (Build.VERSION.SDK_INT >= 16)
          {
            finishAffinity();
            break label73;
          }
          finish();
        }
        catch (IllegalStateException localIllegalStateException)
        {
          finish();
        }
      }
      else
      {
        ao.b(this, localIntent);
      }
    }
    else
      return false;
    label73: return true;
  }

  private l c()
  {
    if (this.a == null)
      this.a = l.a(this, this);
    return this.a;
  }

  public final Intent a()
  {
    return ao.a(this);
  }

  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    c().b(paramView, paramLayoutParams);
  }

  public MenuInflater getMenuInflater()
  {
    return c().b();
  }

  public void invalidateOptionsMenu()
  {
    c().g();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    c().d();
  }

  public void onContentChanged()
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    c().j();
    super.onCreate(paramBundle);
    c().a(paramBundle);
  }

  protected void onDestroy()
  {
    super.onDestroy();
    c().h();
  }

  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem))
      return true;
    ActionBar localActionBar = c().a();
    if ((paramMenuItem.getItemId() == 16908332) && (localActionBar != null) && ((0x4 & localActionBar.a()) != 0))
      return b();
    return false;
  }

  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    c().c();
  }

  protected void onPostResume()
  {
    super.onPostResume();
    c().f();
  }

  protected void onStop()
  {
    super.onStop();
    c().e();
  }

  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    c().a(paramCharSequence);
  }

  public void setContentView(int paramInt)
  {
    c().a(paramInt);
  }

  public void setContentView(View paramView)
  {
    c().a(paramView);
  }

  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    c().a(paramView, paramLayoutParams);
  }

  public void supportInvalidateOptionsMenu()
  {
    c().g();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.AppCompatActivity
 * JD-Core Version:    0.6.0
 */