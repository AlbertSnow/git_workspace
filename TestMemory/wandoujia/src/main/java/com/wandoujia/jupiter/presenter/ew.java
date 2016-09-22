package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.wandoujia.api.proto.PublisherTimeDetail;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Calendar;
import java.util.TimeZone;

public final class ew extends c
{
  private static final String[] a = JupiterApplication.e().getResources().getStringArray(2131230750);

  protected final void a(Model paramModel)
  {
    Calendar localCalendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    localCalendar.setTimeInMillis(paramModel.J().create_time.longValue());
    TextView localTextView1 = (TextView)h().b(2131492998).a();
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = a[localCalendar.get(2)];
    localTextView1.setText(String.format("%s月 ", arrayOfObject1));
    TextView localTextView2 = (TextView)h().b(2131492972).a();
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(localCalendar.get(5));
    localTextView2.setText(String.format(" %d", arrayOfObject2));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ew
 * JD-Core Version:    0.6.0
 */