package com.jfbuilds.nplayapp.zankie;

import playn.core.PlayN;
import playn.java.JavaPlatform;

public class GameOnZankieJava {

  public static void main(String[] args) {
    JavaPlatform.Config config = new JavaPlatform.Config();
    // use config to customize the Java platform, if needed
    JavaPlatform.register(config);
    // Previous code needed casting to playn.core.Game: "PlayN.run(new GameOnZankie());"
    PlayN.run(new GameOnZankie());
  }
}
