package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.shapes.OvalShape;

final class e extends OvalShape
{
  private RadialGradient a;
  private Paint b = new Paint();
  private int c;

  public e(d paramd, int paramInt1, int paramInt2)
  {
    d.a(paramd, paramInt1);
    this.c = paramInt2;
    this.a = new RadialGradient(this.c / 2, this.c / 2, d.a(paramd), new int[] { 1023410176, 0 }, null, Shader.TileMode.CLAMP);
    this.b.setShader(this.a);
  }

  public final void draw(Canvas paramCanvas, Paint paramPaint)
  {
    int i = this.d.getWidth();
    int j = this.d.getHeight();
    paramCanvas.drawCircle(i / 2, j / 2, this.c / 2 + d.a(this.d), this.b);
    paramCanvas.drawCircle(i / 2, j / 2, this.c / 2, paramPaint);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.e
 * JD-Core Version:    0.6.0
 */