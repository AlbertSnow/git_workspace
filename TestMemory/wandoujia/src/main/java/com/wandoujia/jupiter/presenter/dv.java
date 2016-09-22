package com.wandoujia.jupiter.presenter;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.wandoujia.api.proto.MorphData;
import com.wandoujia.api.proto.MorphDataProperty;
import com.wandoujia.jupiter.media.controller.f;
import com.wandoujia.jupiter.media.view.VideoPlayView;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.model.Model;
import java.util.HashMap;

public final class dv extends com.wandoujia.ripple_framework.c.c
{
  private VideoPlayView a;

  public final void a()
  {
    super.a();
    if (this.a != null)
    {
      this.a.i();
      this.a = null;
    }
  }

  protected final void a(Model paramModel)
  {
    View localView1 = h().a("video_container").a();
    if ((localView1 == null) || (!(localView1 instanceof FrameLayout)));
    FrameLayout localFrameLayout;
    while (true)
    {
      return;
      localFrameLayout = (FrameLayout)localView1;
      HashMap localHashMap = com.wandoujia.jupiter.morph.c.a(paramModel);
      if (!localHashMap.containsKey("video_url"))
        break;
      MorphData localMorphData1 = (MorphData)localHashMap.get("video_url");
      if ((localMorphData1.property != null) && (localMorphData1.property.is_visible != null) && (!localMorphData1.property.is_visible.booleanValue()))
        break;
      localFrameLayout.setVisibility(0);
      View localView2 = h().a("cover").a();
      if (localView2 != null)
        localView2.setVisibility(8);
      if (this.a == null)
        this.a = ((VideoPlayView)LayoutInflater.from(h().l()).inflate(2130903591, null));
      localFrameLayout.removeView(this.a);
      localFrameLayout.addView(this.a);
      new f(this.a);
      this.a.b();
      this.a.setDuration(0);
      this.a.setUrl(localMorphData1.value);
      if (localHashMap.containsKey("video_cover"))
        this.a.setCover(((MorphData)localHashMap.get("video_cover")).value);
      while (localHashMap.containsKey("video_cover"))
      {
        MorphData localMorphData2 = (MorphData)localHashMap.get("video_cover");
        this.a.setCover(localMorphData2.value);
        return;
        if (!localHashMap.containsKey("cover"))
          continue;
        this.a.setCover(((MorphData)localHashMap.get("cover")).value);
      }
    }
    localFrameLayout.setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.dv
 * JD-Core Version:    0.6.0
 */