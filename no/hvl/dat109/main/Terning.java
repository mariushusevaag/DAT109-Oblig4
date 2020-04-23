/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package no.hvl.dat109.main;
import java.util.*;

// line 19 "test.ump"
public class Terning
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Terning Attributes
  private final int max = 6;
  private int verdi;

  //Terning Associations
  private List<TerningKopp> terningKopps;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Terning() {
	  verdi = 1;
  }
  
  public Terning(int verdi) {
	  this.verdi = verdi;
	}


  //------------------------
  // INTERFACE
  //------------------------



  public boolean setVerdi(int aVerdi)
  {
    boolean wasSet = false;
    verdi = aVerdi;
    wasSet = true;
    return wasSet;
  }

  public int getMax()
  {
    return max;
  }

  public int getVerdi()
  {
    return verdi;
  }
  /* Code from template association_GetMany */
  public TerningKopp getTerningKopp(int index)
  {
    TerningKopp aTerningKopp = terningKopps.get(index);
    return aTerningKopp;
  }

  public List<TerningKopp> getTerningKopps()
  {
    List<TerningKopp> newTerningKopps = Collections.unmodifiableList(terningKopps);
    return newTerningKopps;
  }

  public int numberOfTerningKopps()
  {
    int number = terningKopps.size();
    return number;
  }

  public boolean hasTerningKopps()
  {
    boolean has = terningKopps.size() > 0;
    return has;
  }

  public int indexOfTerningKopp(TerningKopp aTerningKopp)
  {
    int index = terningKopps.indexOf(aTerningKopp);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfTerningKoppsValid()
  {
    boolean isValid = numberOfTerningKopps() >= minimumNumberOfTerningKopps() && numberOfTerningKopps() <= maximumNumberOfTerningKopps();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfTerningKopps()
  {
    return 2;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTerningKopps()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfTerningKopps()
  {
    return 2;
  }
  /* Code from template association_AddMNToOnlyOne */
  public TerningKopp addTerningKopp(Craps aCraps)
  {
    if (numberOfTerningKopps() >= maximumNumberOfTerningKopps())
    {
      return null;
    }
    else
    {
      return new TerningKopp(aCraps, this);
    }
  }

  public boolean addTerningKopp(TerningKopp aTerningKopp)
  {
    boolean wasAdded = false;
    if (terningKopps.contains(aTerningKopp)) { return false; }
    if (numberOfTerningKopps() >= maximumNumberOfTerningKopps())
    {
      return wasAdded;
    }

    Terning existingTerning = aTerningKopp.getTerning();
    boolean isNewTerning = existingTerning != null && !this.equals(existingTerning);

    if (isNewTerning && existingTerning.numberOfTerningKopps() <= minimumNumberOfTerningKopps())
    {
      return wasAdded;
    }

    if (isNewTerning)
    {
      aTerningKopp.setTerning(this);
    }
    else
    {
      terningKopps.add(aTerningKopp);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTerningKopp(TerningKopp aTerningKopp)
  {
    boolean wasRemoved = false;
    //Unable to remove aTerningKopp, as it must always have a terning
    if (this.equals(aTerningKopp.getTerning()))
    {
      return wasRemoved;
    }

    //terning already at minimum (2)
    if (numberOfTerningKopps() <= minimumNumberOfTerningKopps())
    {
      return wasRemoved;
    }
    terningKopps.remove(aTerningKopp);
    wasRemoved = true;
    return wasRemoved;
  }

  public void delete()
  {
    for(int i=terningKopps.size(); i > 0; i--)
    {
      TerningKopp aTerningKopp = terningKopps.get(i - 1);
      aTerningKopp.delete();
    }
  }

  // line 25 "test.ump"
   public int trill(){
    verdi = (int) (Math.random() * max) + 1;
    return verdi;
  }


  public String toString()
  {
    return super.toString() + "["+
            "max" + ":" + getMax()+ "," +
            "verdi" + ":" + getVerdi()+ "]";
  }
}