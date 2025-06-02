import java.util.Scanner;
import java.util.ArrayList;
public class Flashcard
{
    private ArrayList<Questions> fullQuiz = new ArrayList<Questions>();

    public void createFlashcard()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a topic:" + "\n" + "a) SAT" + "\n" + "b) Spanish" + "c: (temp topic)" + "\n");
        String chosenTopic = scanner.nextLine();
        String topic = "";
        int length = 0;
        if (chosenTopic.equals("a"))
        {
            System.out.println("Which topic do you want for your SAT Quiz?" + "\n" + "a) Vocabulary" + "\n" + "b) Grammar");
            String chosenUnit = scanner.nextLine();
            if (chosenUnit.equals("a"))
            {
                topic = "Vocabulary";
            }
            else if (chosenUnit.equals("b"))
            {
                topic = "Grammar";
            }
        }
        String l = scanner.nextLine();
        System.out.println("How many questions do you want for your SAT quiz? (Max is 20)");
        length = Integer.valueOf(l);
        System.out.println("Generating a SAT " + topic + " quiz of length " + length);
        scanner.close();
        createQuiz(topic, length);
    }

     public void createQuiz(String topic, int length) 
    {
        fullQuiz = {};
        if (topic.equals("Vocabulary")) generateVocab(length); 
        else if (topic.equals("Grammar")) generateGrammar(length);
    }

    public void generateVocab(int length)
    {
        ArrayList<Questions> questions = SATVocab.vocabQuestions;
        for (int i = 0; i < length; i++)
        {
            fullQuiz.add(SATVocab.vocabQuestions(i))
        }
    }

    public void generateGrammar(int length)
    {
        ArrayList<Questions> questions = SATGrammar.grammarQuestions;
        for (int i = 0; i < length; i++)
        {
            fullQuiz.add(questions.remove(addRandomQuestion(questions)));
        }
    }

    public int addRandomQuestion(ArrayList<Question> list)
    {
        
    }


    



}
