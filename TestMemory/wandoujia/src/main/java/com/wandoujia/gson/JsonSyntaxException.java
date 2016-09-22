package com.wandoujia.gson;

public final class JsonSyntaxException extends JsonParseException
{
  private static final long serialVersionUID = 1L;

  public JsonSyntaxException(String paramString)
  {
    super(paramString);
  }

  public JsonSyntaxException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }

  public JsonSyntaxException(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.JsonSyntaxException
 * JD-Core Version:    0.6.0
 */