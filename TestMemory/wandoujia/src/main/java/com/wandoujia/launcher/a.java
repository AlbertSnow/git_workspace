package com.wandoujia.launcher;

import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.launcher_base.view.stateful.view.SuggestionView;
import com.wandoujia.logv3.model.packages.ContentPackage.Builder;
import com.wandoujia.logv3.model.packages.ContentPackage.Type;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;

public final class a extends com.wandoujia.launcher_base.launcher.c.a
{
  private com.wandoujia.launcher_base.view.button.a.a a;
  private String b;
  private int c = -1;
  private boolean d = true;
  private SuggestionView e;
  private com.wandoujia.launcher_base.view.stateful.a.a f;
  private boolean g = true;
  private boolean h = false;

  public a(com.wandoujia.launcher_base.view.button.a.a parama)
  {
    this.a = parama;
  }

  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView != null)
      return paramView;
    this.e = new SuggestionView(paramViewGroup.getContext());
    this.f = new com.wandoujia.launcher_base.view.stateful.a.a();
    this.f.a(this.b, this.c);
    this.f.a(this.d);
    this.f.a(new b(this, this.e));
    return this.e;
  }

  public final a a(String paramString, int paramInt)
  {
    this.b = paramString;
    this.c = paramInt;
    return this;
  }

  public final a a(boolean paramBoolean)
  {
    this.d = paramBoolean;
    return this;
  }

  protected final void a()
  {
    if ((!this.h) && (this.e != null))
    {
      this.h = true;
      SuggestionView localSuggestionView = this.e;
      com.wandoujia.launcher_base.view.button.a.a locala = this.a;
      String str = this.b;
      int i = this.c;
      ContentPackage.Builder localBuilder = new ContentPackage.Builder();
      localBuilder.identity = locala.d();
      localBuilder.title = locala.a();
      localBuilder.type = ContentPackage.Type.APP;
      v.b().a(localSuggestionView, str).a(localSuggestionView, ViewLogPackage.Element.ICON, ViewLogPackage.Action.DOWNLOAD, locala.e()).a(localSuggestionView, localBuilder.build()).a(localSuggestionView, i).c(localSuggestionView);
    }
  }

  public final void a(ViewGroup paramViewGroup)
  {
    super.a(paramViewGroup);
    if ((this.f != null) && (this.e != null))
      this.f.a(this.e, this.a);
  }

  public final a c()
  {
    this.g = false;
    return this;
  }

  public final void d()
  {
    super.d();
    if (this.f != null)
      this.f.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.a
 * JD-Core Version:    0.6.0
 */