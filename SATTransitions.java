public class SATTransitions extends Questions
{
    private ArrayList<Questions> transitionQuestions = new ArrayList<Questions>();

    public SATTransitions(String passage, String question, String explanation, String correctAnswer, String false1, String false2, String false3)
    {
        super(passage, question, explanation, correctAnswer, false1, false2, false3);
    }

    public void addToBank(Questions question)
    {
        transitionQuestions.add(question);
    }
}