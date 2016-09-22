package com.alipay.android.mini.window.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.d;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.alipay.android.app.exception.AppErrorException;
import com.alipay.android.mini.widget.j;
import com.alipay.android.mini.widget.s;
import com.alipay.wandoujia.aj;
import com.alipay.wandoujia.am;
import com.alipay.wandoujia.bk;
import com.alipay.wandoujia.g;
import com.alipay.wandoujia.ra;
import com.alipay.wandoujia.rh;
import java.lang.ref.WeakReference;

public class MiniPayActivity extends Activity
  implements k
{
  private WeakReference b;
  private s c;
  private int d = 0;

  private void b(Intent paramIntent)
  {
    this.d = paramIntent.getIntExtra("CallingPid", 0);
    try
    {
      if (this.d == 0)
        throw new AppErrorException(getClass(), "no biz id");
    }
    catch (AppErrorException localAppErrorException)
    {
      android.support.v4.app.b.b(localAppErrorException);
      finish();
      return;
    }
    com.alipay.wandoujia.b.a().b(this.d).i().a(this);
  }

  public void a()
  {
    android.support.v4.app.b.h();
    if (isFinishing())
      return;
    runOnUiThread(new bf(this));
  }

  public void a(Intent paramIntent)
  {
    startActivity(paramIntent);
  }

  public void a(l paraml, bk parambk, int paramInt)
  {
    if (!super.isFinishing())
    {
      ViewGroup localViewGroup = (ViewGroup)findViewById(d.a("mini_layout"));
      localViewGroup.setVisibility(8);
      paraml.a(this, localViewGroup);
      if ((paramInt != 6) && (paramInt != 10) && (paramInt != -10))
      {
        localViewGroup.setVisibility(0);
        if (paramInt != 9)
          break label81;
        getWindow().setLayout(-1, -1);
      }
    }
    while (true)
    {
      b();
      return;
      label81: getWindow().setLayout(-1, -2);
    }
  }

  public void a(rh paramrh)
  {
    this.b = new WeakReference(paramrh);
  }

  public void a(String paramString)
  {
    runOnUiThread(new bg(this, this, paramString));
  }

  public void a(String paramString1, String paramString2, String paramString3, ra paramra1, String paramString4, ra paramra2)
  {
    if (isFinishing())
      return;
    runOnUiThread(new bc(this, paramString1, paramString2, paramString4, paramString3, paramra2, paramra1));
  }

  public void b()
  {
    if (this.c != null)
    {
      this.c.dismiss();
      this.c = null;
    }
  }

  public void i()
  {
    finish();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    super.getWindow().setBackgroundDrawable(null);
    super.getWindow().getDecorView().setBackgroundResource(0);
    super.getWindow().setLayout(-1, -1);
    com.wandoujia.image.c.a.a().a(getApplicationContext(), g.z());
    View localView = getWindow().getDecorView();
    localView.setBackgroundColor(0);
    localView.setContentDescription(" mini pay activity decorView");
    super.getWindow().getAttributes().gravity = 1;
    super.setContentView(d.f("mini_layout"));
    if (paramBundle != null)
    {
      j localj = new j(this);
      localj.a(d.g("mini_error_title_default"));
      localj.a("系统异常，该交易失效，请重新下单。");
      localj.a(new bb(this));
      localj.a();
      return;
    }
    b(getIntent());
  }

  protected void onDestroy()
  {
    b();
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.d != 0) && (this.b != null) && (this.b.get() != null))
    {
      am localam = new am(ra.j);
      ((rh)this.b.get()).a(this, localam);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    b(paramIntent);
  }

  protected void onResume()
  {
    b();
    super.onResume();
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putInt("bizId", this.d);
    super.onSaveInstanceState(paramBundle);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.MiniPayActivity
 * JD-Core Version:    0.6.0
 */