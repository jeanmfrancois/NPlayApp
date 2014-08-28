package com.jfbuilds.nplayapp.zankie.java;

import playn.core.PlayN;
import playn.java.JavaPlatform;

import com.jfbuilds.nplayapp.zankie.core.GameOnZankie;

public class GameOnZankieJava {

  public static void main(String[] args) {
    JavaPlatform.Config config = new JavaPlatform.Config();
    // use config to customize the Java platform, if needed
    JavaPlatform.register(config);
    PlayN.run(new GameOnZankie());
  }
}
