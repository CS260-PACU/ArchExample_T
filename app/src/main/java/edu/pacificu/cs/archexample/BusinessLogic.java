package edu.pacificu.cs.archexample;

import java.util.ArrayList;

public class BusinessLogic
{
  private ArrayList<String> mcData;
  private boolean mbShowEvens;
  private boolean mbShowOdds;

  public BusinessLogic() {
    mcData = new ArrayList<> ();
    mbShowEvens = true;
    mbShowOdds = true;
  }

  public void toggleOdds() {
    mbShowOdds = !mbShowOdds;
  }

  public void toggleEvens() {
    mbShowEvens = !mbShowEvens;
  }

  public void addData(String cData) {
    mcData.add (cData);
  }

  public String showData() {
    StringBuilder cSB = new StringBuilder ();
    boolean bIsOdd = false; // start with 0

    for(String cData : mcData){
      if( (bIsOdd && mbShowOdds) ||
          (!bIsOdd && mbShowEvens) )
      {
        cSB.append (cData);
        cSB.append ("\n");
      }
      bIsOdd = !bIsOdd;
    }
    return cSB.toString ();
  }

}
