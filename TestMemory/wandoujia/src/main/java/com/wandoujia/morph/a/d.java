package com.wandoujia.morph.a;

import android.widget.FrameLayout;
import com.tencent.open.a.f;
import com.tencent.open.g;
import com.wandoujia.morph.engine.MoStyleable;
import com.wandoujia.morph.engine.MoWidgetType;
import com.wandoujia.morph.engine.a;
import com.wandoujia.morph.engine.i;
import java.lang.reflect.Method;
import java.util.List;

public class d
  implements t<FrameLayout>
{
  public d()
  {
  }

  public d(com.wandoujia.morph.engine.d paramd)
  {
    paramd.a(MoWidgetType.ViewGroup);
  }

  public static void a(FrameLayout paramFrameLayout, i parami)
  {
    r.a(paramFrameLayout, parami);
    a locala = parami.a(MoStyleable.FrameLayout);
    if (locala != null)
    {
      int i = locala.a();
      int j = 0;
      if (j < i)
      {
        switch (e.a[locala.a(j).ordinal()])
        {
        default:
        case 1:
        }
        while (true)
        {
          j++;
          break;
          paramFrameLayout.setMeasureAllChildren(locala.c(j));
        }
      }
    }
  }

  public void a(String paramString, List<String> paramList, g paramg)
  {
    Method[] arrayOfMethod = getClass().getDeclaredMethods();
    int i = arrayOfMethod.length;
    for (int j = 0; ; j++)
    {
      Object localObject1 = null;
      if (j < i)
      {
        Method localMethod = arrayOfMethod[j];
        if ((!localMethod.getName().equals(paramString)) || (localMethod.getParameterTypes().length != paramList.size()))
          continue;
        localObject1 = localMethod;
      }
      if (localObject1 != null)
      {
        try
        {
          Object localObject3;
          switch (paramList.size())
          {
          default:
            Object[] arrayOfObject6 = new Object[6];
            arrayOfObject6[0] = paramList.get(0);
            arrayOfObject6[1] = paramList.get(1);
            arrayOfObject6[2] = paramList.get(2);
            arrayOfObject6[3] = paramList.get(3);
            arrayOfObject6[4] = paramList.get(4);
            arrayOfObject6[5] = paramList.get(5);
            localObject3 = localObject1.invoke(this, arrayOfObject6);
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          }
          while (true)
          {
            Class localClass = localObject1.getReturnType();
            f.b("openSDK_LOG.JsBridge", "-->call, result: " + localObject3 + " | ReturnType: " + localClass.getName());
            if (((!"void".equals(localClass.getName())) && (localClass != Void.class)) || (paramg == null))
              break;
            paramg.a();
            return;
            localObject3 = localObject1.invoke(this, new Object[0]);
            continue;
            Object[] arrayOfObject5 = new Object[1];
            arrayOfObject5[0] = paramList.get(0);
            localObject3 = localObject1.invoke(this, arrayOfObject5);
            continue;
            Object[] arrayOfObject4 = new Object[2];
            arrayOfObject4[0] = paramList.get(0);
            arrayOfObject4[1] = paramList.get(1);
            localObject3 = localObject1.invoke(this, arrayOfObject4);
            continue;
            Object[] arrayOfObject3 = new Object[3];
            arrayOfObject3[0] = paramList.get(0);
            arrayOfObject3[1] = paramList.get(1);
            arrayOfObject3[2] = paramList.get(2);
            localObject3 = localObject1.invoke(this, arrayOfObject3);
            continue;
            Object[] arrayOfObject2 = new Object[4];
            arrayOfObject2[0] = paramList.get(0);
            arrayOfObject2[1] = paramList.get(1);
            arrayOfObject2[2] = paramList.get(2);
            arrayOfObject2[3] = paramList.get(3);
            localObject3 = localObject1.invoke(this, arrayOfObject2);
            continue;
            Object[] arrayOfObject1 = new Object[5];
            arrayOfObject1[0] = paramList.get(0);
            arrayOfObject1[1] = paramList.get(1);
            arrayOfObject1[2] = paramList.get(2);
            arrayOfObject1[3] = paramList.get(3);
            arrayOfObject1[4] = paramList.get(4);
            Object localObject2 = localObject1.invoke(this, arrayOfObject1);
            localObject3 = localObject2;
          }
        }
        catch (Exception localException)
        {
          f.b("openSDK_LOG.JsBridge", "-->handler call mehtod ex. targetMethod: " + localObject1, localException);
          if (paramg == null)
            break label592;
        }
        paramg.b();
        return;
      }
      else if (paramg != null)
      {
        paramg.b();
      }
      label592: return;
    }
  }

  public final MoWidgetType p()
  {
    return MoWidgetType.FrameLayout;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.a.d
 * JD-Core Version:    0.6.0
 */