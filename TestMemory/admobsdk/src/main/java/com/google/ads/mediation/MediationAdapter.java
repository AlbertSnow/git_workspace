package com.google.ads.mediation;

@Deprecated
public abstract interface MediationAdapter<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends MediationServerParameters>
{
  public abstract void destroy();

  public abstract Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

  public abstract Class<SERVER_PARAMETERS> getServerParametersType();
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.ads.mediation.MediationAdapter
 * JD-Core Version:    0.6.0
 */