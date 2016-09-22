package com.alipay.android.mini.window.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.alipay.android.app.exception.AppErrorException;
import com.alipay.android.mini.widget.s;
import com.alipay.wandoujia.am;
import com.alipay.wandoujia.b;
import com.alipay.wandoujia.bk;
import com.alipay.wandoujia.g;
import com.alipay.wandoujia.i;
import com.alipay.wandoujia.ra;
import com.alipay.wandoujia.rh;
import java.lang.ref.WeakReference;

public final class TransContainer extends Activity
  implements k
{
  private int b;
  private WeakReference c;
  private s d;

  private void b(Intent paramIntent)
  {
    try
    {
      this.b = paramIntent.getIntExtra("CallingPid", 0);
      if (this.b == 0)
        throw new Exception("no biz id");
    }
    catch (AppErrorException localAppErrorException)
    {
      i.a().d(localAppErrorException, "");
      while (true)
      {
        a();
        return;
        b.a().b(this.b).i().a(this);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        i.a().d(localException, "on trans activity create");
        finish();
      }
    }
  }

  public final void a()
  {
    if (isFinishing())
      return;
    runOnUiThread(new ad(this));
  }

  public final void a(Intent paramIntent)
  {
    startActivity(paramIntent);
  }

  public final void a(l paraml, bk parambk, int paramInt)
  {
  }

  public final void a(rh paramrh)
  {
    this.c = new WeakReference(paramrh);
  }

  public final void a(String paramString)
  {
    runOnUiThread(new aj(this, paramString));
  }

  public final void a(String paramString1, String paramString2, String paramString3, ra paramra1, String paramString4, ra paramra2)
  {
    if (isFinishing())
      return;
    runOnUiThread(new af(this, paramString1, paramString2, paramString4, paramString3, paramra2, paramra1));
  }

  public final void b()
  {
    if (this.d != null)
      this.d.dismiss();
  }

  public final void i()
  {
    finish();
  }

  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    super.getWindow().setBackgroundDrawable(null);
    super.getWindow().getDecorView().setBackgroundDrawable(null);
    com.wandoujia.image.c.a.a().a(getApplicationContext(), g.z());
    b(getIntent());
  }

  protected final void onDestroy()
  {
    b();
    super.onDestroy();
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.b != 0) && (this.c != null) && (this.c.get() != null))
    {
      am localam = new am(ra.j);
      ((rh)this.c.get()).a(this, localam);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected final void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    b(paramIntent);
  }

  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putInt("bizId", this.b);
    super.onSaveInstanceState(paramBundle);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.TransContainer
 * JD-Core Version:    0.6.0
 */