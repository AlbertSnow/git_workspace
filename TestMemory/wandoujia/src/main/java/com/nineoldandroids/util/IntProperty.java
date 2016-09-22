package com.nineoldandroids.util;

public abstract class IntProperty<T> extends Property<T, Integer>
{
  public IntProperty(String paramString)
  {
    super(Integer.class, paramString);
  }

  public final void set(T paramT, Integer paramInteger)
  {
    while (true)
      paramInteger = Integer.valueOf(paramInteger.intValue());
  }

  public abstract void setValue(T paramT, int paramInt);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nineoldandroids.util.IntProperty
 * JD-Core Version:    0.6.0
 */