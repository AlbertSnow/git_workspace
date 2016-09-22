package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.webkit.WebSettings;

@TargetApi(17)
public class ai extends ak
{
  public final Drawable a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
  {
    if ((!paramBoolean) || (paramFloat <= 0.0F) || (paramFloat > 25.0F))
      return new BitmapDrawable(paramContext.getResources(), paramBitmap);
    try
    {
      Bitmap localBitmap1 = Bitmap.createScaledBitmap(paramBitmap, paramBitmap.getWidth(), paramBitmap.getHeight(), false);
      Bitmap localBitmap2 = Bitmap.createBitmap(localBitmap1);
      RenderScript localRenderScript = RenderScript.create(paramContext);
      ScriptIntrinsicBlur localScriptIntrinsicBlur = ScriptIntrinsicBlur.create(localRenderScript, Element.U8_4(localRenderScript));
      Allocation localAllocation1 = Allocation.createFromBitmap(localRenderScript, localBitmap1);
      Allocation localAllocation2 = Allocation.createFromBitmap(localRenderScript, localBitmap2);
      localScriptIntrinsicBlur.setRadius(paramFloat);
      localScriptIntrinsicBlur.setInput(localAllocation1);
      localScriptIntrinsicBlur.forEach(localAllocation2);
      localAllocation2.copyTo(localBitmap2);
      BitmapDrawable localBitmapDrawable = new BitmapDrawable(paramContext.getResources(), localBitmap2);
      return localBitmapDrawable;
    }
    catch (RuntimeException localRuntimeException)
    {
    }
    return new BitmapDrawable(paramContext.getResources(), paramBitmap);
  }

  public final String a(Context paramContext)
  {
    return WebSettings.getDefaultUserAgent(paramContext);
  }

  public final boolean a(Context paramContext, WebSettings paramWebSettings)
  {
    super.a(paramContext, paramWebSettings);
    paramWebSettings.setMediaPlaybackRequiresUserGesture(false);
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.ai
 * JD-Core Version:    0.6.0
 */