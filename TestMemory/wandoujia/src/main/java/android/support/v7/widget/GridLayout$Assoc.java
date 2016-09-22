package android.support.v7.widget;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;

final class GridLayout$Assoc<K, V> extends ArrayList<Pair<K, V>>
{
  private final Class<K> keyType;
  private final Class<V> valueType;

  private GridLayout$Assoc(Class<K> paramClass, Class<V> paramClass1)
  {
    this.keyType = paramClass;
    this.valueType = paramClass1;
  }

  public static <K, V> Assoc<K, V> of(Class<K> paramClass, Class<V> paramClass1)
  {
    return new Assoc(paramClass, paramClass1);
  }

  public final au<K, V> pack()
  {
    int i = size();
    Object[] arrayOfObject1 = (Object[])Array.newInstance(this.keyType, i);
    Object[] arrayOfObject2 = (Object[])Array.newInstance(this.valueType, i);
    for (int j = 0; j < i; j++)
    {
      arrayOfObject1[j] = ((Pair)get(j)).first;
      arrayOfObject2[j] = ((Pair)get(j)).second;
    }
    return new au(arrayOfObject1, arrayOfObject2, 0);
  }

  public final void put(K paramK, V paramV)
  {
    add(Pair.create(paramK, paramV));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.GridLayout.Assoc
 * JD-Core Version:    0.6.0
 */