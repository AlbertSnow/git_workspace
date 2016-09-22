package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.o;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class ImageManager
{
  private static final Object a = new Object();
  private static HashSet<Uri> b = new HashSet();
  private final Context c;
  private final Handler d;
  private final ExecutorService e;
  private final a f;
  private final o g;
  private final Map<d, ImageManager.ImageReceiver> h;
  private final Map<Uri, ImageManager.ImageReceiver> i;
  private final Map<Uri, Long> j;
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager
 * JD-Core Version:    0.6.0
 */