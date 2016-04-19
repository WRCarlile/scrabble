import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Scrabble {
  public static void main(String[] args) {}
  public static Integer calculateScore(String word){
    if(word == "A" || word == "E" || word == "I" || word == "O" || word == "U" || word == "L"  || word == "N"  || word == "R"  || word == "S"  || word == "T" ){
      return 1;
    } else if ( word =="D" || word == "G") {
      return 2;
    } else if ( word =="B" || word == "C" || word == "M" || word == "P") {
      return 3;
    } else if ( word =="F" || word == "H" || word == "V" || word == "W"|| word == "Y") {
      return 4;
    } else if ( word =="K" ) {
      return 5;
    } else if ( word =="J" || word == "X" ) {
      return 8;
    } else if ( word =="Q" || word == "Z" ) {
      return 10;
    } else{
      return 0;
    }
  }
}
