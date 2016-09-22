import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class av
{
  static Rect a(View paramView)
  {
    Rect localRect = new Rect();
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    localRect.set(arrayOfInt[0], arrayOfInt[1], arrayOfInt[0] + paramView.getWidth(), arrayOfInt[1] + paramView.getHeight());
    return localRect;
  }

  public static Object a(Object paramObject)
  {
    if (paramObject != null)
      paramObject = ((Transition)paramObject).clone();
    return paramObject;
  }

  public static void a(Object paramObject, View paramView)
  {
    ((Transition)paramObject).setEpicenterCallback(new aw(a(paramView)));
  }

  public static void a(Object paramObject, View paramView, Map paramMap, ArrayList paramArrayList)
  {
    TransitionSet localTransitionSet = (TransitionSet)paramObject;
    paramArrayList.clear();
    paramArrayList.addAll(paramMap.values());
    List localList = localTransitionSet.getTargets();
    localList.clear();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      View localView1 = (View)paramArrayList.get(j);
      int k = localList.size();
      if (a(localList, localView1, k))
        continue;
      localList.add(localView1);
      for (int m = k; m < localList.size(); m++)
      {
        View localView2 = (View)localList.get(m);
        if (!(localView2 instanceof ViewGroup))
          continue;
        ViewGroup localViewGroup = (ViewGroup)localView2;
        int n = localViewGroup.getChildCount();
        for (int i1 = 0; i1 < n; i1++)
        {
          View localView3 = localViewGroup.getChildAt(i1);
          if (a(localList, localView3, k))
            continue;
          localList.add(localView3);
        }
      }
    }
    paramArrayList.add(paramView);
    b(localTransitionSet, paramArrayList);
  }

  public static void a(Object paramObject, View paramView, boolean paramBoolean)
  {
    ((Transition)paramObject).excludeTarget(paramView, paramBoolean);
  }

  public static void a(Object paramObject, ArrayList paramArrayList)
  {
    Transition localTransition = (Transition)paramObject;
    if ((localTransition instanceof TransitionSet))
    {
      TransitionSet localTransitionSet = (TransitionSet)localTransition;
      int j = localTransitionSet.getTransitionCount();
      for (int k = 0; k < j; k++)
        a(localTransitionSet.getTransitionAt(k), paramArrayList);
    }
    if (!a(localTransition))
    {
      List localList = localTransition.getTargets();
      if ((localList != null) && (localList.size() == paramArrayList.size()) && (localList.containsAll(paramArrayList)))
        for (int i = -1 + paramArrayList.size(); i >= 0; i--)
          localTransition.removeTarget((View)paramArrayList.get(i));
    }
  }

  static void a(ArrayList paramArrayList, View paramView)
  {
    ViewGroup localViewGroup;
    if (paramView.getVisibility() == 0)
    {
      if (!(paramView instanceof ViewGroup))
        break label65;
      localViewGroup = (ViewGroup)paramView;
      if (!localViewGroup.isTransitionGroup())
        break label33;
      paramArrayList.add(localViewGroup);
    }
    while (true)
    {
      return;
      label33: int i = localViewGroup.getChildCount();
      for (int j = 0; j < i; j++)
        a(paramArrayList, localViewGroup.getChildAt(j));
    }
    label65: paramArrayList.add(paramView);
  }

  public static void a(Map paramMap, View paramView)
  {
    if (paramView.getVisibility() == 0)
    {
      String str = paramView.getTransitionName();
      if (str != null)
        paramMap.put(str, paramView);
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        int i = localViewGroup.getChildCount();
        for (int j = 0; j < i; j++)
          a(paramMap, localViewGroup.getChildAt(j));
      }
    }
  }

  private static boolean a(Transition paramTransition)
  {
    return (!a(paramTransition.getTargetIds())) || (!a(paramTransition.getTargetNames())) || (!a(paramTransition.getTargetTypes()));
  }

  private static boolean a(List paramList)
  {
    return (paramList == null) || (paramList.isEmpty());
  }

  private static boolean a(List paramList, View paramView, int paramInt)
  {
    for (int i = 0; ; i++)
    {
      int j = 0;
      if (i < paramInt)
      {
        if (paramList.get(i) != paramView)
          continue;
        j = 1;
      }
      return j;
    }
  }

  public static void b(Object paramObject, ArrayList paramArrayList)
  {
    int i = 0;
    Transition localTransition = (Transition)paramObject;
    if ((localTransition instanceof TransitionSet))
    {
      TransitionSet localTransitionSet = (TransitionSet)localTransition;
      int m = localTransitionSet.getTransitionCount();
      while (i < m)
      {
        b(localTransitionSet.getTransitionAt(i), paramArrayList);
        i++;
      }
    }
    if ((!a(localTransition)) && (a(localTransition.getTargets())))
    {
      int j = paramArrayList.size();
      for (int k = 0; k < j; k++)
        localTransition.addTarget((View)paramArrayList.get(k));
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     av
 * JD-Core Version:    0.6.0
 */