package com.wandoujia.plugin.qr;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.Window;
import android.widget.TextView;
import com.wandoujia.plugin.bridge.BasePluginActivity;
import java.io.IOException;

public class CaptureActivity extends BasePluginActivity
  implements SurfaceHolder.Callback
{
  private CaptureActivityHandler a;
  private ViewfinderView b;
  private com.wandoujia.plugin.qr.a.e c;
  private boolean d;
  private InactivityTimer e;
  private MediaPlayer f;
  private boolean g;
  private boolean h;
  private TextView i;
  private final MediaPlayer.OnCompletionListener j = new a();

  private void a(Intent paramIntent)
  {
    if ((paramIntent != null) && ("connection".equals(paramIntent.getStringExtra("source"))))
      this.i.setText(R.string.scan_hint_connect);
  }

  private void a(SurfaceHolder paramSurfaceHolder)
  {
    try
    {
      this.c.a(paramSurfaceHolder);
      if (this.a == null)
        this.a = new CaptureActivityHandler(this, this.c);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public final ViewfinderView a()
  {
    return this.b;
  }

  public final void a(com.google.zxing.e parame)
  {
    this.e.a();
    if ((this.g) && (this.f != null))
      this.f.start();
    if (this.h)
      ((Vibrator)getSystemService("vibrator")).vibrate(200L);
    if (parame == null);
    for (String str = ""; ; str = parame.a())
    {
      setResult(-1, new Intent(str));
      finish();
      return;
    }
  }

  public final Handler b()
  {
    return this.a;
  }

  public final void c()
  {
    this.b.invalidate();
  }

  public final com.wandoujia.plugin.qr.a.e d()
  {
    return this.c;
  }

  public void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    super.onCreate(paramBundle);
    setContentView(R.layout.aa_capture);
    this.c = new com.wandoujia.plugin.qr.a.e(getApplicationContext());
    this.b = ((ViewfinderView)findViewById(R.id.viewfinder_view));
    findViewById(R.id.scan_result);
    this.i = ((TextView)findViewById(R.id.scan_hint));
    this.b.setCameraManager(this.c);
    this.d = false;
    this.e = new InactivityTimer(this);
    a(getIntent());
  }

  protected void onDestroy()
  {
    this.e.b();
    super.onDestroy();
  }

  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 16908332:
    }
    while (true)
    {
      return super.onMenuItemSelected(paramInt, paramMenuItem);
      finish();
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
  }

  protected void onPause()
  {
    super.onPause();
    if (this.a != null)
    {
      this.a.a();
      this.a = null;
    }
    this.c.a();
  }

  protected void onResume()
  {
    super.onResume();
    SurfaceHolder localSurfaceHolder = ((SurfaceView)findViewById(R.id.preview_view)).getHolder();
    if (this.d)
      a(localSurfaceHolder);
    while (true)
    {
      this.g = true;
      if ((this.g) && (this.f == null))
      {
        setVolumeControlStream(3);
        this.f = MediaPlayer.create(this, R.raw.beep);
        if (this.f != null)
        {
          this.f.setAudioStreamType(3);
          this.f.setOnCompletionListener(this.j);
          this.f.setVolume(0.1F, 0.1F);
        }
      }
      this.h = true;
      return;
      localSurfaceHolder.addCallback(this);
      localSurfaceHolder.setType(3);
    }
  }

  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    if (!this.d)
    {
      this.d = true;
      a(paramSurfaceHolder);
    }
  }

  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    this.d = false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.plugin.qr.CaptureActivity
 * JD-Core Version:    0.6.0
 */