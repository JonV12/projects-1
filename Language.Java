class Language{

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
  
    Language(String aName, int aSpeakers, String aRegions, String aOrder){
      this.name = aName;
      this.numSpeakers = aSpeakers;
      this.regionsSpoken = aRegions;
      this.wordOrder = aOrder;
    }
  
    public void getInfo(){
      System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". ");
      System.out.println("The language follows the word order: " + this.wordOrder);
    }
  
    public static void main(String[] args){
  
      Language english = new Language("english", 1, "USA", "Subject - Verb - Object");
      Language mayan = new Mayan("Chontal", 60563);
      Language mandarin = new SinoTibetan("Mandarin Chinese", 1000000000);
      Language burmese = new SinoTibetan("Burmese", 33000000);
      english.getInfo();
      mayan.getInfo();
      mandarin.getInfo();
      burmese.getInfo();
  
    }
  }

  class SinoTibetan extends Language{
    SinoTibetan(String aName, int aSpeakers){
      super(aName, aSpeakers, "Asia", "subject-object-verb");
      if (aName.contains("Chinese")){
        this.wordOrder = "subject-verb-object";
      }
    }
  }

  class Mayan extends Language{
    Mayan(String aName, int aSpeakers){
      super(aName, aSpeakers, "Central America", "verb-object-subject");
    }
  
  @Override
    public void getInfo(){
      System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
      System.out.println("The language follows the word order: " + this.wordOrder);
      System.out.println("Fun act: " + this.name + " in an ergative language.");
    }
  }
  