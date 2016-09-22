package com.google.ads.mediation;

import com.google.android.gms.internal.zzin;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@Deprecated
public abstract class MediationServerParameters
{
  public void load(Map<String, String> parameters)
    throws MediationServerParameters.MappingException
  {
    HashMap localHashMap = new HashMap();
    for (Object localObject3 : getClass().getFields())
    {
      Parameter localParameter = (Parameter)localObject3.getAnnotation(Parameter.class);
      if (localParameter == null)
        continue;
      localHashMap.put(localParameter.name(), localObject3);
    }
    if (localHashMap.isEmpty())
      zzin.zzaK("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
    ??? = parameters.entrySet().iterator();
    Field localField;
    while (((Iterator)???).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)???).next();
      localField = (Field)localHashMap.remove(((Map.Entry)localObject2).getKey());
      if (localField != null)
        try
        {
          localField.set(this, ((Map.Entry)localObject2).getValue());
        }
        catch (IllegalAccessException localIllegalAccessException1)
        {
          zzin.zzaK("Server option \"" + (String)((Map.Entry)localObject2).getKey() + "\" could not be set: Illegal Access");
        }
        catch (IllegalArgumentException localIllegalArgumentException1)
        {
          zzin.zzaK("Server option \"" + (String)((Map.Entry)localObject2).getKey() + "\" could not be set: Bad Type");
        }
      else
        zzin.zzaI("Unexpected server option: " + (String)((Map.Entry)localObject2).getKey() + " = \"" + (String)((Map.Entry)localObject2).getValue() + "\"");
    }
    ??? = new StringBuilder();
    Object localObject2 = localHashMap.values().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localField = (Field)((Iterator)localObject2).next();
      if (((Parameter)localField.getAnnotation(Parameter.class)).required())
      {
        zzin.zzaK("Required server option missing: " + ((Parameter)localField.getAnnotation(Parameter.class)).name());
        if (((StringBuilder)???).length() > 0)
          ((StringBuilder)???).append(", ");
        ((StringBuilder)???).append(((Parameter)localField.getAnnotation(Parameter.class)).name());
      }
    }
    if (((StringBuilder)???).length() > 0)
      throw new MappingException("Required server option(s) missing: " + ((StringBuilder)???).toString());
    zzA();
  }

  protected void zzA()
  {
  }

  public static final class MappingException extends Exception
  {
    public MappingException(String message)
    {
      super();
    }
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.FIELD})
  protected static @interface Parameter
  {
    public abstract String name();

    public abstract boolean required();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.ads.mediation.MediationServerParameters
 * JD-Core Version:    0.6.0
 */