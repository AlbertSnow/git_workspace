package com.wandoujia.p4.community.views.a;

import android.app.AlertDialog.Builder;
import android.content.Context;
import com.wandoujia.mvc.Action;
import java.util.Map;
import java.util.Set;

public final class a
{
  private Context a;

  public a(Context paramContext)
  {
    this.a = paramContext;
  }

  public final void a(Map<String, Action> paramMap)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a);
    String[] arrayOfString = (String[])paramMap.keySet().toArray(new String[paramMap.keySet().size()]);
    localBuilder.setItems(arrayOfString, new b(arrayOfString, paramMap));
    localBuilder.show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.a.a
 * JD-Core Version:    0.6.0
 */