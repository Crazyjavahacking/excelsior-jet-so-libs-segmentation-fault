package apollo.impl;


import apollo.api.PublicApi;


public class PrivateImpl implements PublicApi {

  @Override
  public String apiVersion() {
    return "apollo-1.0";
  }
}
