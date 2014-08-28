package com.jfbuilds.nplayapp.zankie.html;

import playn.core.PlayN;
import playn.html.HtmlGame;
import playn.html.HtmlPlatform;

import com.jfbuilds.nplayapp.zankie.core.GameOnZankie;

public class GameOnZankieHtml extends HtmlGame {

  @Override
  public void start() {
    HtmlPlatform.Config config = new HtmlPlatform.Config();
    // use config to customize the HTML platform, if needed
    HtmlPlatform platform = HtmlPlatform.register(config);
    platform.assets().setPathPrefix("zankie/");
    PlayN.run(new GameOnZankie());
  }
}
