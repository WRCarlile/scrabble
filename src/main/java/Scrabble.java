import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Scrabble {
  public static void main(String[] args) {
    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/score", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      String userInput = request.queryParams("word");
      Scrabble newScrabble = new Scrabble();
      Integer totalScore = newScrabble.calculateScore(userInput);
      model.put("totalScore", totalScore);

      model.put("template", "templates/score.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());
  }


  public static Integer calculateScore(String word){
    word = word.toUpperCase();
    Integer totalScore = 0;
    char[] splitWord = word.toCharArray();

    for(Integer i = 0; i < splitWord.length; i++){
      if(splitWord[i] == 'A' || splitWord[i] == 'E' || splitWord[i] == 'I' || splitWord[i] == 'O' || splitWord[i] == 'U' || splitWord[i] == 'L'  || splitWord[i] == 'N'  || splitWord[i] == 'R'  || splitWord[i] == 'S'  || splitWord[i] == 'T' ){
        totalScore += 1;
      } else if ( splitWord[i] =='D' || splitWord[i] == 'G') {
        totalScore += 2;
      } else if ( splitWord[i] =='B' || splitWord[i] == 'C' || splitWord[i] == 'M' || splitWord[i] == 'P') {
        totalScore += 3;
      } else if ( splitWord[i] =='F' || splitWord[i] == 'H' || splitWord[i] == 'V' || splitWord[i] == 'W'|| splitWord[i] == 'Y') {
        totalScore += 4;
      } else if ( splitWord[i] =='K' ) {
        totalScore += 5;
      } else if ( splitWord[i] =='J' || splitWord[i] == 'X' ) {
        totalScore += 8;
      } else if ( splitWord[i] =='Q' || splitWord[i] == 'Z' ) {
        totalScore += 10;
      } else{
        totalScore += 0;
      }
    }
    return totalScore;
  }
}
