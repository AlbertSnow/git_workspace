package android.support.v4.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public abstract class bn
{
  private static int b = 1048576;
  private Matrix a;

  public static View a(Context paramContext, Parcelable paramParcelable)
  {
    ImageView localImageView1;
    if ((paramParcelable instanceof Bundle))
    {
      Bundle localBundle = (Bundle)paramParcelable;
      Bitmap localBitmap2 = (Bitmap)localBundle.getParcelable("sharedElement:snapshot:bitmap");
      if (localBitmap2 == null)
        return null;
      ImageView localImageView2 = new ImageView(paramContext);
      localImageView2.setImageBitmap(localBitmap2);
      localImageView2.setScaleType(ImageView.ScaleType.valueOf(localBundle.getString("sharedElement:snapshot:imageScaleType")));
      if (localImageView2.getScaleType() == ImageView.ScaleType.MATRIX)
      {
        float[] arrayOfFloat = localBundle.getFloatArray("sharedElement:snapshot:imageMatrix");
        Matrix localMatrix = new Matrix();
        localMatrix.setValues(arrayOfFloat);
        localImageView2.setImageMatrix(localMatrix);
      }
      localImageView1 = localImageView2;
    }
    while (true)
    {
      return localImageView1;
      if ((paramParcelable instanceof Bitmap))
      {
        Bitmap localBitmap1 = (Bitmap)paramParcelable;
        localImageView1 = new ImageView(paramContext);
        localImageView1.setImageBitmap(localBitmap1);
        continue;
      }
      localImageView1 = null;
    }
  }

  public final Parcelable a(View paramView, Matrix paramMatrix, RectF paramRectF)
  {
    Drawable localDrawable1;
    int n;
    int i1;
    Object localObject;
    Bundle localBundle1;
    if ((paramView instanceof ImageView))
    {
      ImageView localImageView = (ImageView)paramView;
      localDrawable1 = localImageView.getDrawable();
      Drawable localDrawable2 = localImageView.getBackground();
      if ((localDrawable1 != null) && (localDrawable2 == null))
      {
        n = localDrawable1.getIntrinsicWidth();
        i1 = localDrawable1.getIntrinsicHeight();
        if ((n <= 0) || (i1 <= 0))
        {
          localObject = null;
          if (localObject == null)
            break label304;
          Bundle localBundle2 = new Bundle();
          localBundle2.putParcelable("sharedElement:snapshot:bitmap", (Parcelable)localObject);
          localBundle2.putString("sharedElement:snapshot:imageScaleType", localImageView.getScaleType().toString());
          if (localImageView.getScaleType() == ImageView.ScaleType.MATRIX)
          {
            Matrix localMatrix = localImageView.getImageMatrix();
            float[] arrayOfFloat = new float[9];
            localMatrix.getValues(arrayOfFloat);
            localBundle2.putFloatArray("sharedElement:snapshot:imageMatrix", arrayOfFloat);
          }
          localBundle1 = localBundle2;
        }
      }
    }
    label304: int i;
    int j;
    do
    {
      do
      {
        return localBundle1;
        float f2 = Math.min(1.0F, b / (n * i1));
        if (((localDrawable1 instanceof BitmapDrawable)) && (f2 == 1.0F))
        {
          localObject = ((BitmapDrawable)localDrawable1).getBitmap();
          break;
        }
        int i2 = (int)(f2 * n);
        int i3 = (int)(f2 * i1);
        localObject = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas localCanvas2 = new Canvas((Bitmap)localObject);
        Rect localRect = localDrawable1.getBounds();
        int i4 = localRect.left;
        int i5 = localRect.top;
        int i6 = localRect.right;
        int i7 = localRect.bottom;
        localDrawable1.setBounds(0, 0, i2, i3);
        localDrawable1.draw(localCanvas2);
        localDrawable1.setBounds(i4, i5, i6, i7);
        break;
        i = Math.round(paramRectF.width());
        j = Math.round(paramRectF.height());
        localBundle1 = null;
      }
      while (i <= 0);
      localBundle1 = null;
    }
    while (j <= 0);
    float f1 = Math.min(1.0F, b / (i * j));
    int k = (int)(f1 * i);
    int m = (int)(f1 * j);
    if (this.a == null)
      this.a = new Matrix();
    this.a.set(paramMatrix);
    this.a.postTranslate(-paramRectF.left, -paramRectF.top);
    this.a.postScale(f1, f1);
    Bitmap localBitmap = Bitmap.createBitmap(k, m, Bitmap.Config.ARGB_8888);
    Canvas localCanvas1 = new Canvas(localBitmap);
    localCanvas1.concat(this.a);
    paramView.draw(localCanvas1);
    return (Parcelable)localBitmap;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.bn
 * JD-Core Version:    0.6.0
 */