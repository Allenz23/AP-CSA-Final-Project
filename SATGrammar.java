public class SATGrammar extends Questions
{
    private ArrayList<Questions> grammarQuestions = new ArrayList<Questions>();
    public SATGrammar(String passage, String question, String explanation, String correctAnswer, String false1, String false2, String false3)
    {
        super(passage, question, explanation, correctAnswer, false1, false2, false3);
    }

        public void addToBank(Questions question)
    {
        grammarQuestions.add(question);
    }
}