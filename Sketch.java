import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow * 300 / 30;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 300 + 3 + intColumn * 300 / 30; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    
    int intSectionTwoX = 0;
    int intSectionTwoY = 0;

    for(int intSectionTwoRow = 0; intSectionTwoRow < 30; intSectionTwoRow++){
      for(int intSectionTwoColumn= 0; intSectionTwoColumn < 30; intSectionTwoColumn++){
        intSectionTwoX = 3 + 300 + intSectionTwoRow * 300 / 30;
        intSectionTwoY = 3 + 300 + intSectionTwoColumn * 300 / 30;

        if(intSectionTwoRow % 2 == 0){
          fill(255);
          noStroke();
          rect(intSectionTwoX, intSectionTwoY, 5, 5);
      }
        else {
          fill(0);
          noStroke();
          rect(intSectionTwoX, intSectionTwoY, 5, 5);
          }
        }
     }
  }
  
  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){

    int intSectionThreeX = 0;
    int intSectionThreeY = 0;

    for(int intSectionThreeRow = 0; intSectionThreeRow < 30; intSectionThreeRow++){
      for(int intSectionThreeColumn = 0; intSectionThreeColumn < 30; intSectionThreeColumn++){
        intSectionThreeX = 3 + 600 + intSectionThreeRow * 300 / 30;
        intSectionThreeY = 3 + 300 + intSectionThreeColumn * 300 / 30;

        if(intSectionThreeColumn % 2 == 0){
          fill(0);
          noStroke();
          rect(intSectionThreeX, intSectionThreeY, 5, 5);
          }
          
        else {
          fill(255);
          noStroke();
          rect(intSectionThreeX, intSectionThreeY, 5, 5);
          }
       }
     }
  }
  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){


    int intSectionFourX = 0;
    int intSectionFourY = 0;

    for(int intSectionFourRow = 0; intSectionFourRow < 30; intSectionFourRow++){
      for(int intSectionFourColumn = 0; intSectionFourColumn < 30; intSectionFourColumn++){
        intSectionFourX = 3 + 900 + intSectionFourRow * 300 / 30;
        intSectionFourY = 3 + 300 + intSectionFourColumn * 300 / 30;

        if(intSectionFourColumn % 2 != 0 && intSectionFourRow % 2 == 0){
          fill(255);
          noStroke();
          rect(intSectionFourX, intSectionFourY, 5, 5);
        }
          
        else {
          fill(0);
          noStroke();
          rect(intSectionFourX, intSectionFourY, 5, 5);
        }
      }
    }
  }
  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){

    int intSectionFiveX = 0;
    int intSectionFiveY = 0;
    int intFiveCounterRow = 0;
    int intFiveCounterColumn = 0;

    for(int intSectionFiveColumn = 30; intSectionFiveColumn > intFiveCounterColumn; intSectionFiveColumn--){
      for(int intSectionFiveRow = 30; intSectionFiveRow > intFiveCounterRow; intSectionFiveRow--){
        intSectionFiveX = 3 - 10 + intSectionFiveRow * 300 / 30;
        intSectionFiveY = 3 + intSectionFiveColumn * 300 / 30;
        fill(255);
        noStroke();
        rect(intSectionFiveX, intSectionFiveY, 5, 5);
      }
      intFiveCounterRow += 1;
    }
  }

  public void draw_section6(){

    int intSectionSixX = 0;
    int intSectionSixY = 0;
    int intSixCounterRow = 30;
    int intSixCounterColumn = 0;

    for(int intSectionSixColumn = 30; intSectionSixColumn > intSixCounterColumn; intSectionSixColumn--){
      for(int intSectionSixRow = 0; intSectionSixRow < intSixCounterRow; intSectionSixRow++0{
        intSectionSixX = 3 + 300 + intSectionSixRow * 300 / 30;
        intSectionsixY = 3 - 10 + intSectionSixColumn * 300 / 30;

        fill(255);
        noStroke();
        rect(intSectionSixX, intSectionSixY, 5, 5);
      }
      intSixCounterRow -= 1;
    }
  }

  public void draw_section7(){

    int intSectionSevenX = 0;
    int intSectionSevenY = 0;
    int intSevenCounterRow = 30;
    int intSevenCounterColumn = 30;

    for(int intSectionSevenColumn = 0; intSectionSevenColumn < intSevenCounterColumn; intSectionSevenColumn++){
      for(int intSectionSevenRow = 0; intSectionSevenRow < intSevenCounterRow; intSectionSevenRow++){
        intSectionSevenX = 3 + 600 + intSectionSevenRow * 300 / 30;
        intSectionSevenY = 3 + intSectionSevenColumn * 300 / 30;

        fill(255);
        noStroke();
        rect(intSectionSevenX, intSectionSevenY, 5, 5);
      }
      intSevenCounterRow -= 1;
    }
  }
  
  public void draw_section8(){

  }






}
