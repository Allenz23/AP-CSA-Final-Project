import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Questions 
{
    private String passage;
    private String question;
    private String correctAnswer;
    private String false1;
    private String false2;
    private String false3;
    private String explanation;

    //arraylist will always be in the order of {question, choice1, choice2, choice3, choice4}
    private ArrayList<String> fullQuestion = new ArrayList<String>();

    public Questions()
    {
    //nothing, temporary constructor
    }
    
    //constructor to set up all the variables; ill will call the randomizeQuestion() methods to randomize the order of the answer choices automatically.
    public Questions(String passage, String question, String explanation, String correctAnswer, String false1, String false2, String false3)
    {
        this.passage = passage;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.false1 = false1;
        this.false2 = false2;
        this.false3 = false3;
        this.explanation = explanation;
        fullQuestion.add(question);
        fullQuestion.add(correctAnswer);
        fullQuestion.add(false1);
        fullQuestion.add(false2);
        fullQuestion.add(false3);
        randomizeQuestion();
        addToBank(this);
    }    
    //java.util.Collections.shuffle() <- found with the help of StackOverflow

    //randomizes order of the answer choices
    public void randomizeQuestion()
    {
        String temp = fullQuestion.remove(0);
        Collections.shuffle(fullQuestion);
        fullQuestion.add(0, temp);
    }

    //prints the questions in the a, b, c, d format.
    public String printQuestion()
    {
        return 
        getPassage() +
        "\n" + "\n" + question + 
        "\n" + "a: " + fullQuestion.get(1) + 
        "\n" + "b: " + fullQuestion.get(2) +
        "\n" + "c: " + fullQuestion.get(3) +
        "\n" + "d: " + fullQuestion.get(4) +
        "\n" + "\n" + "Chosen Answer: ";
    }

    //returns the correct answer
    public String getAnswer()
    {
        return correctAnswer;
    }

    //returns the explanation
    public String getExplanation()
    {
        return "\n" + explanation + "\n" + "________________________________________________________________________________________________________________________________________________________" + "\n" + "\n";
    }

    //returns the passage
    public String getPassage()
    {
        return passage;
    }

    public void addToBank(Questions question)
    {
        //subclass call
    }

    public ArrayList<String> getFullQuestion()
    {
        return fullQuestion;
    }
}
