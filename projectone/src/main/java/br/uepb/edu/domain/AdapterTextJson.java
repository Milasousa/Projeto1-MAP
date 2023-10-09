package br.uepb.edu.domain;

import com.google.gson.Gson;

public class AdapterTextJson {
  public static String Json(Object obj) {
    // obj= new Object();
    Gson gson = new Gson();
    String json = gson.toJson(obj);

    System.out.println(json);
    return json;
  }

}