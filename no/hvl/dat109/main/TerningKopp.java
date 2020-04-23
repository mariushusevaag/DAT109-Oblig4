/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package no.hvl.dat109.main;

// line 33 "test.ump"
public class TerningKopp
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TerningKopp Attributes
  private Terning t1;
  private Terning t2;

  //TerningKopp Associations
  private Craps craps;
  private Terning terning;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  
  public TerningKopp() {
	  t1 = new Terning();
	  t2 = new Terning();
  }

  public TerningKopp(Craps aCraps, Terning aTerning)
  {
    t1 = new Terning();
    t2 = new Terning();
    if (aCraps == null || aCraps.getTerningKopp() != null)
    {
      throw new RuntimeException("Unable to create TerningKopp due to aCraps");
    }
    craps = aCraps;
    boolean didAddTerning = setTerning(aTerning);
    if (!didAddTerning)
    {
      throw new RuntimeException("Unable to create terningKopp due to terning");
    }
  }

  public TerningKopp(Terning aTerning)
  {
    t1 = new Terning();
    t2 = new Terning();
    craps = new Craps(this);
    boolean didAddTerning = setTerning(aTerning);
    if (!didAddTerning)
    {
      throw new RuntimeException("Unable to create terningKopp due to terning");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setT1(Terning aT1)
  {
    boolean wasSet = false;
    t1 = aT1;
    wasSet = true;
    return wasSet;
  }

  public boolean setT2(Terning aT2)
  {
    boolean wasSet = false;
    t2 = aT2;
    wasSet = true;
    return wasSet;
  }

  public Terning getT1()
  {
    return t1;
  }

  public Terning getT2()
  {
    return t2;
  }
  /* Code from template association_GetOne */
  public Craps getCraps()
  {
    return craps;
  }
  /* Code from template association_GetOne */
  public Terning getTerning()
  {
    return terning;
  }
  /* Code from template association_SetOneToAtMostN */
  public boolean setTerning(Terning aTerning)
  {
    boolean wasSet = false;
    //Must provide terning to terningKopp
    if (aTerning == null)
    {
      return wasSet;
    }

    //terning already at maximum (2)
    if (aTerning.numberOfTerningKopps() >= Terning.maximumNumberOfTerningKopps())
    {
      return wasSet;
    }
    
    Terning existingTerning = terning;
    terning = aTerning;
    if (existingTerning != null && !existingTerning.equals(aTerning))
    {
      boolean didRemove = existingTerning.removeTerningKopp(this);
      if (!didRemove)
      {
        terning = existingTerning;
        return wasSet;
      }
    }
    terning.addTerningKopp(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Craps existingCraps = craps;
    craps = null;
    if (existingCraps != null)
    {
      existingCraps.delete();
    }
    Terning placeholderTerning = terning;
    this.terning = null;
    if(placeholderTerning != null)
    {
      placeholderTerning.removeTerningKopp(this);
    }
  }

  // line 39 "test.ump"
   public int trillTerninger(){
    return t1.trill() + t2.trill();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "t1" + "=" + (getT1() != null ? !getT1().equals(this)  ? getT1().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "t2" + "=" + (getT2() != null ? !getT2().equals(this)  ? getT2().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "craps = "+(getCraps()!=null?Integer.toHexString(System.identityHashCode(getCraps())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "terning = "+(getTerning()!=null?Integer.toHexString(System.identityHashCode(getTerning())):"null");
  }
}