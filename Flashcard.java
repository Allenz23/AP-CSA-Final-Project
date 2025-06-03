import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Flashcard
{
    private ArrayList<Questions> fullQuiz = new ArrayList<Questions>();
    private int score = 0;


    public void createFlashcard()
    {
        Scanner scanner = new Scanner(System.in);
        String topic = "";
        int length = 0;
        //user inputs "a" or "b" to choose what topic they want
        System.out.println("Which topic do you want for your SAT Quiz?" + "\n" + "a) Transitions" + "\n" + "b) Grammar");
        String chosenTopic = scanner.nextLine();

        if (chosenTopic.equals("a"))
        {
            topic = "Transitions";
        }
        else if (chosenTopic.equals("b"))
        {
            topic = "Grammar";
        }

        //user inputs a number between 1 - 20, and a quiz of that length would be generated
        String l = scanner.nextLine();
        System.out.println("How many questions do you want for your SAT quiz? (Max is 20)");
        length = Integer.valueOf(scanner.nextLine());
        System.out.println("Generating a SAT " + topic + " quiz of length " + length);
        scanner.close();
        createQuiz(topic, length);
    }

    //creates a quiz bases off of the chosen topic
    public void createQuiz(String topic, int length) 
    {
        clearQuiz();
        resetScore();
        if (topic.equals("Transitions")) generateTransitions(length); 
        else if (topic.equals("Grammar")) generateGrammar(length);
        else System.out.println("ERROR!!!");
    }

    //creates a transitions quiz
    public void generateTransitions(int length)
    {
        ArrayList<Questions> questions = SATTransitions.transitionQuestions;
        for (int i = 0; i < length; i++)
        {
            //randomizes all questions of the list, then adds the first question of the list to the quiz
            Collections.shuffle(questions);
            fullQuiz.add(questions.remove(0));
        }
    }

    //creates a transitions quiz
    public void generateGrammar(int length)
    {
        ArrayList<Questions> questions = SATGrammar.grammarQuestions;
        for (int i = 0; i < length; i++)
        {
            //randomizes all questions of the list, then adds the first question of the list to the quiz
            Collections.shuffle(questions);
            fullQuiz.add(questions.remove(0));
        }
    }

    //clears all elements in the quiz arraylist
    public void clearQuiz()
    {
        fullQuiz.clear();
    }

    //sets the score back to 0
    public void resetScore()
    {
        score = 0;
    }

    //returns the explanation for the question
    public String getExplanation(Questions question)
    {
        return question.getExplanation();
    }

    //this prints all the actual questions for the quiz one by one
    //the user would answer the same questions until the question until they get the question correct
    //the user gets to pick if they want an explanation after each correct answer
    public void printAllQuestions()
    {
        int attempts = 0;
        System.out.println("Each question you get right adds 1 point to your total score." + "\n" + "Your score is revealed at the end.");
        for (int i = 0; i < fullQuiz.size(); i++)
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
                if (wantsExplanation) System.out.println(question.getExplanation());
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

    //checks to see if the user inputted answer is correct
    //returns true if is correct, and false otherwise
    public boolean evaluateAnswer(Questions question, String chosenAnswer)
    {
        String correctAnswer = question.getAnswer();
        return correctAnswer.equals(chosenAnswer);
    }

    //returns the user's final score and calculate the uesr's percentage score
    public String getScore()
    {
        return "You got a score of " + score + "out of " + fullQuiz.size() + "!" + "\n" + "(" + (Integer)(score / fullQuiz.size()) + "%)";
    }
}

