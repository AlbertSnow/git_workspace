package android.support.v4.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

final class c extends SharedElementCallback
{
  private b a;

  public c(b paramb)
  {
    this.a = paramb;
  }

  public final Parcelable onCaptureSharedElementSnapshot(View paramView, Matrix paramMatrix, RectF paramRectF)
  {
    return this.a.a(paramView, paramMatrix, paramRectF);
  }

  public final View onCreateSnapshotView(Context paramContext, Parcelable paramParcelable)
  {
    return bn.a(paramContext, paramParcelable);
  }

  public final void onMapSharedElements(List<String> paramList, Map<String, View> paramMap)
  {
  }

  public final void onRejectSharedElements(List<View> paramList)
  {
  }

  public final void onSharedElementEnd(List<String> paramList, List<View> paramList1, List<View> paramList2)
  {
  }

  public final void onSharedElementStart(List<String> paramList, List<View> paramList1, List<View> paramList2)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.c
 * JD-Core Version:    0.6.0
 */