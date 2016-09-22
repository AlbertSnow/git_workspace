package com.wandoujia.accessibility.hibernation.view;

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
import android.widget.TextView;
import com.wandoujia.ripple_framework.accessibility.R.id;
import com.wandoujia.ripple_framework.accessibility.R.layout;
import com.wandoujia.ripple_framework.accessibility.R.style;

public final class a extends Dialog
  implements DialogInterface
{
  private Context a;
  private TextView b;
  private TextView c;
  private Button d;
  private Button e;

  private a(Context paramContext)
  {
    super(paramContext, R.style.AccessibilityDialog);
    WindowManager.LayoutParams localLayoutParams;
    Context localContext;
    if ((!(paramContext instanceof Activity)) && ((paramContext instanceof ContextThemeWrapper)))
    {
      ContextThemeWrapper localContextThemeWrapper = (ContextThemeWrapper)paramContext;
      if ((localContextThemeWrapper.getBaseContext() instanceof Activity))
      {
        this.a = localContextThemeWrapper.getBaseContext();
        setContentView(R.layout.accessibility_dialog);
        localLayoutParams = new WindowManager.LayoutParams();
        localLayoutParams.copyFrom(getWindow().getAttributes());
        localContext = this.a;
        if (a(localContext).getWidth() <= a(localContext).getHeight())
          break label221;
      }
    }
    label221: for (int i = 90 * a(localContext).getHeight() / 100; ; i = 90 * a(localContext).getWidth() / 100)
    {
      localLayoutParams.width = i;
      getWindow().setAttributes(localLayoutParams);
      setCancelable(true);
      setCanceledOnTouchOutside(true);
      this.b = ((TextView)findViewById(R.id.dialog_title));
      this.c = ((TextView)findViewById(R.id.dialog_message));
      this.d = ((Button)findViewById(R.id.dialog_negativeButton));
      this.e = ((Button)findViewById(R.id.dialog_positiveButton));
      findViewById(R.id.dialog_custom);
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
 * Qualified Name:     com.wandoujia.accessibility.hibernation.view.a
 * JD-Core Version:    0.6.0
 */