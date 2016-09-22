package android.support.v7.widget;

import android.support.v4.c.a;
import android.view.ViewGroup;
import com.wandoujia.jupiter.paid.a.c;

public abstract class by<VH extends co>
{
  private final bz a = new bz();

  public abstract int a();

  public int a(int paramInt)
  {
    return 0;
  }

  public abstract VH a(ViewGroup paramViewGroup, int paramInt);

  public final void a(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2);
  }

  public void a(VH paramVH)
  {
  }

  public abstract void a(VH paramVH, int paramInt);

  public final void a(c paramc)
  {
    this.a.registerObserver(paramc);
  }

  public long b(int paramInt)
  {
    return -1L;
  }

  public final void b()
  {
    this.a.a();
  }

  public final void b(int paramInt1, int paramInt2)
  {
    this.a.b(paramInt1, paramInt2);
  }

  public void b(VH paramVH)
  {
  }

  public final void b(VH paramVH, int paramInt)
  {
    paramVH.b = paramInt;
    paramVH.a(1, 519);
    a.a("RV OnBindView");
    a(paramVH, paramInt);
    a.a();
  }

  public final void b(c paramc)
  {
    this.a.unregisterObserver(paramc);
  }

  public final void c(int paramInt)
  {
    this.a.a(paramInt, 1);
  }

  public final void c(int paramInt1, int paramInt2)
  {
    this.a.c(paramInt1, paramInt2);
  }

  public void c(VH paramVH)
  {
  }

  public final void d(int paramInt)
  {
    this.a.b(paramInt, 1);
  }

  public final void e(int paramInt)
  {
    this.a.c(paramInt, 1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.by
 * JD-Core Version:    0.6.0
 */