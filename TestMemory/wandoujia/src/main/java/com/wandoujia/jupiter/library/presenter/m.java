package com.wandoujia.jupiter.library.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.Spinner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class m extends c
{
  private static int a = 0;

  protected final void a(Model paramModel)
  {
    Spinner localSpinner = (Spinner)h().b(2131493692).a();
    o localo = new o(0);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = Arrays.asList(e().getContext().getResources().getStringArray(2131230748)).iterator();
    while (localIterator.hasNext())
      localArrayList.add(new p((String)localIterator.next()));
    localo.a(localArrayList);
    localSpinner.setOnMenuSelectListener(new n());
    localSpinner.setAdapter(localo);
    localSpinner.a(a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.presenter.m
 * JD-Core Version:    0.6.0
 */