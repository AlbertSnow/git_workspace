package com.wandoujia.jupiter.imageviewer.views;

import android.support.v4.view.ck;

final class b
  implements ck
{
  b(GalleryViewPager paramGalleryViewPager)
  {
  }

  public final void a(int paramInt)
  {
    GalleryViewPager.a(this.a);
    if (GalleryViewPager.b(this.a) != null)
      GalleryViewPager.b(this.a).a(paramInt);
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (GalleryViewPager.b(this.a) != null)
      GalleryViewPager.b(this.a).a(paramInt1, paramFloat, paramInt2);
  }

  public final void b(int paramInt)
  {
    if (paramInt == 0)
      GalleryViewPager.a(this.a);
    if (GalleryViewPager.b(this.a) != null)
      GalleryViewPager.b(this.a).b(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.imageviewer.views.b
 * JD-Core Version:    0.6.0
 */