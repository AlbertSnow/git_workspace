package com.squareup.wire;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD})
public @interface ProtoField
{
  public abstract boolean deprecated();

  public abstract Message.Label label();

  public abstract int tag();

  public abstract Message.Datatype type();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.ProtoField
 * JD-Core Version:    0.6.0
 */