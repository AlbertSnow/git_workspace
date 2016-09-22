package com.wandoujia.plugin.qr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public final class CaptureActivityHandler extends Handler
{
  private final CaptureActivity a;
  private final e b;
  private CaptureActivityHandler.State c;
  private final com.wandoujia.plugin.qr.a.e d;

  static
  {
    CaptureActivityHandler.class.getSimpleName();
  }

  public CaptureActivityHandler(CaptureActivity paramCaptureActivity, com.wandoujia.plugin.qr.a.e parame)
  {
    this.a = paramCaptureActivity;
    this.b = new e(paramCaptureActivity, new h(paramCaptureActivity.a()));
    this.b.start();
    this.c = CaptureActivityHandler.State.SUCCESS;
    this.d = parame;
    parame.b();
    b();
  }

  private void b()
  {
    if (this.c == CaptureActivityHandler.State.SUCCESS)
    {
      this.c = CaptureActivityHandler.State.PREVIEW;
      this.d.a(this.b.a(), R.id.decode);
      this.a.c();
    }
  }

  public final void a()
  {
    this.c = CaptureActivityHandler.State.DONE;
    this.d.c();
    Message.obtain(this.b.a(), R.id.quit).sendToTarget();
    try
    {
      this.b.join(500L);
      label40: removeMessages(R.id.decode_succeeded);
      removeMessages(R.id.decode_failed);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label40;
    }
  }

  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == R.id.restart_preview)
      b();
    do
    {
      return;
      if (paramMessage.what == R.id.decode_succeeded)
      {
        this.c = CaptureActivityHandler.State.SUCCESS;
        Bundle localBundle = paramMessage.getData();
        if (localBundle != null)
          localBundle.getParcelable("barcode_bitmap");
        this.a.a((com.google.zxing.e)paramMessage.obj);
        return;
      }
      if (paramMessage.what == R.id.decode_failed)
      {
        this.c = CaptureActivityHandler.State.PREVIEW;
        this.d.a(this.b.a(), R.id.decode);
        return;
      }
      if (paramMessage.what != R.id.return_scan_result)
        continue;
      this.a.setResult(-1, (Intent)paramMessage.obj);
      this.a.finish();
      return;
    }
    while (paramMessage.what != R.id.launch_product_query);
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse((String)paramMessage.obj));
    localIntent.addFlags(524288);
    this.a.startActivity(localIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.plugin.qr.CaptureActivityHandler
 * JD-Core Version:    0.6.0
 */