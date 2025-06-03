import java.util.Scanner;
import java.util.ArrayList;
public class Flashcard
{
    private ArrayList<Questions> fullQuiz = new ArrayList<Questions>();
    private int score = 0;

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
        length = Integer.valueOf(scanner.nextLine());
        System.out.println("Generating a SAT " + topic + " quiz of length " + length);
        scanner.close();
        createQuiz(topic, length);
    }

     public void createQuiz(String topic, int length) 
    {
        clearQuiz();
        resetScore();
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
            if (questions.size() > 0)
            {
            Collections.shuffle(questions);
            fullQuiz.add(questions.remove(0));
            }
            else i += length;
        }
    }

    public void clearQuiz()
    {
        fullQuiz = {};
    }

    public void resetScore()
    {
        score = 0;
    }

    public String getExplanation(Questions question)
    {
        return question.getExplanation();
    }

    public void printAllQuestions()
    {
        int attempts = 0;
        System.out.println("Each question you get right adds 1 point to your total score." + "\n" + "Your score is revealed at the end.")
        for (int i = 0; i < fullQuiz.length; i++)
        {
            Scanner scanner = new Scanner(System.in);
            Questions question = fullQuiz.get(i);
            question.printQuestion();
            String chosenAnswer = scanner.nextLine();
            boolean isCorrect = evaluateAnswer(question, chosenAnswer);
            
            if (isCorrect)
            {
                attempts++;
                if (attempts == 1) score++;
                System.out.println("Correct! Would you like to see the explanation? (yes/no)");
                boolean wantsExplanation = scanner.nextLine().equals("yes");
                if (wantsExplanation) return question.getExplanation();
            }
            else
            {
                System.out.println("Wrong! Try Again.");
                attempts++;
                i--;
            }
            scanner.close();
            System.out.println("Quiz Over!");
            getScore();
        }
    }

    public boolean evaluateAnswer(Questions question, String chosenAnswer)
    {
        String correctAnswer = question.getAnswer();
        return correctAnswer.equals(chosenAnswer);
    }

    public String getScore()
    {
        return "You got a score of " + score + "out of " + fullQuiz.size() + "!" + "\n" + "(" + Integer(score / fullQuiz.size()) + "%)";
    }
}
