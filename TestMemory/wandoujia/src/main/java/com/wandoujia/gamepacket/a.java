package com.wandoujia.gamepacket;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public final class a extends Dialog
  implements DialogInterface
{
  private Context a;
  private TextView b;
  private TextView c;
  private Button d;
  private Button e;
  private FrameLayout f;

  private a(Context paramContext)
  {
    super(paramContext, R.style.GamePacketDialog);
    WindowManager.LayoutParams localLayoutParams;
    Context localContext;
    if ((!(paramContext instanceof Activity)) && ((paramContext instanceof ContextThemeWrapper)))
    {
      ContextThemeWrapper localContextThemeWrapper = (ContextThemeWrapper)paramContext;
      if ((localContextThemeWrapper.getBaseContext() instanceof Activity))
      {
        this.a = localContextThemeWrapper.getBaseContext();
        setContentView(R.layout.game_packet_dialog);
        localLayoutParams = new WindowManager.LayoutParams();
        localLayoutParams.copyFrom(getWindow().getAttributes());
        localContext = this.a;
        if (a(localContext).getWidth() <= a(localContext).getHeight())
          break label227;
      }
    }
    label227: for (int i = 90 * a(localContext).getHeight() / 100; ; i = 90 * a(localContext).getWidth() / 100)
    {
      localLayoutParams.width = i;
      getWindow().setAttributes(localLayoutParams);
      setCancelable(true);
      setCanceledOnTouchOutside(true);
      this.b = ((TextView)findViewById(R.id.dialog_title));
      this.c = ((TextView)findViewById(R.id.dialog_message));
      this.d = ((Button)findViewById(R.id.dialog_negativeButton));
      this.e = ((Button)findViewById(R.id.dialog_positiveButton));
      this.f = ((FrameLayout)findViewById(R.id.dialog_custom));
      return;
      this.a = paramContext;
      break;
      this.a = paramContext;
      break;
    }
  }

  private static Display a(Context paramContext)
  {
    return ((Activity)paramContext).getWindow().getWindowManager().getDefaultDisplay();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.a
 * JD-Core Version:    0.6.0
 */