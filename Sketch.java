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
        intX = 3 + 0;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 300 + 3 + 0; //Instead of zero, calculate the proper intY location using 'intColumn'

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
        intSectionTwoY = 3 + 300 + intSectTwoColumn * 300 / 30;

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

    for(int intSectionThreeRow = 0; intSectThreeRow < 30; intSectThreeRow++){
      for(int intSectThreeColumn = 0; intSectThreeColumn < 30; intSectThreeColumn++){
        intSectionThree = 3 + 600 + intSectionThreeRow * 300 / 30;
        intSectionThreeY = 3 + 300 + intSectThreeColumn * 300 / 30;

        if(intSectThreeColumn % 2 == 0){
          fill(0);
          noStroke();
          rect(intSectThreeX, intSectThreeY, 5, 5);
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


    int intSectFourX = 0;
    int intSectFourY = 0;

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

  }

  public void draw_section6(){

  }

  public void draw_section7(){

  }
  
  public void draw_section8(){

  }






}
