package com.jfbuilds.nplayapp.zankie.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import com.jfbuilds.nplayapp.zankie.core.GameOnZankie;

public class GameOnZankieActivity extends GameActivity {

  @Override
  public void main(){
    PlayN.run(new GameOnZankie());
  }
}
