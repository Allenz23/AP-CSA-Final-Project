import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args)
    {
        //all questions were taken from the official SAT Suite Question Bank

        //list of SAT Grammar Questions
        Questions grammar1 = new SATGrammar
        (
          "Generations of mystery and horror ______ have been influenced by the dark, gothic"  + "\n" + "stories of celebrated American author Edgar Allan Poe (1809–1849).",
          "Which choice completes the text so that it conforms to the conventions of Standard English?",
          "This choice is the best answer. The convention being tested is punctuation between a subject and a verb. When, as in this case, a subject" + "\n" + "(“Generations of mystery and horror writers”) is immediately followed by a verb (“have been influenced”), no punctuation is needed."
          "writers", "writers", "writers—", "writers;";
        );
        Questions grammar2 = new SATGrammar(
          "Despite being cheap, versatile, and easy to produce, ______ they are made from nonrenewable petroleum, and most do not biodegrade in landfills."
          ,"Which choice completes the text so that it conforms to the conventions of Standard English?"
          ,"This choice is the best answer. The convention being tested is subject-modifier placement. This choice ensures that the modifying phrase" + "\n" + "“despite being cheap, versatile, and easy to produce” appears immediately before the noun it modifies, “commercial plastics,” clearly" + "\n" + "establishing that the commercial plastics—and not another noun in the sentence—are being described as cheap, versatile, and easy to produce."
          ,"commercial plastics have two associated problems:", "there are two problems associated with commercial plastics:", "two problems are associated with commercial plastics:", "commercial plastics’ two associated problems are that"
        );
        Questions grammar3 = new SATGrammar(
          "What is the correct pronunciation of Kiribati? In the Gilbertese language spoken by residents of the island nation, the letter" + "\n" + "combination -ti makes the -s sound; as a result, the country’s name ______ pronounced “Kiribas.”",
          "Which choice completes the text so that it conforms to the conventions of Standard English?",
          "This choice is the best answer. The convention being tested is subject-verb agreement. The singular verb 'is' agrees in number with the singular subject 'the country’s name.'",
          "is", "are", "has been", "are being"
        );
        Questions grammar4 = new SATGrammar(
          "American abstract artist Richard ____  his installations to make passersby keenly aware of how one’s movements are affected by the" + "\n" + "physical features of one’s environment, assembles large-scale steel plates into sculptures that dominate the outdoor spaces they occupy.",
          "Which choice completes the text so that it conforms to the conventions of Standard English?",
          "The other options don't fit gramatically into this sentence structure",
          "Serra, intending", "Serra is intending", "Serra, intends", "Serra intends"
        );
        Questions grammar5 = new SATGrammar(
          "Though kangaroos seem docile, males can be fiercely competitive when he ____ for mates.",
          "Which choice completes the text so that it conforms to the conventions of Standard English?",
          "This is correct as the plural pronoun “they” is consistent with the plural antecedent “kangaroos”.",
          "they search", "searches", "it searches", "she searches"
        );
        Questions grammar6 = new SATGrammar(
          "China’s Great Green Wall is the government’s full-fledged attempt to intentionally increase forest cover through tree planting projects," + "\n" + "but scientists have yet to determine ____ effectiveness.",
          "Which choice completes the text so that it conforms to the conventions of Standard English?",
          "This is the best choice. The singular pronoun “its” has a clear, singular antecedent(“China’s Great Green Wall”).",
          "its", "their", "this", "that"
        );
        Questions grammar7 = new SATGrammar(
          "When people try to learn a foreign language, particularly one that contains unfamiliar vowels or unexpected syntax," + "\n" + " ____ must overcome the initial struggle to form new sounds or comprehend different sentence structures.",
          "Which choice completes the text so that it conforms to the conventions of Standard English?",
          "This choice is the best choice. The plural pronoun 'they' is consistent with the sentence's earlier plural reference to 'people'.",
          "they", "he or she", "it", "one"
        );
        Questions grammar8 = new SATGrammar(
          "If history and architecture interest you, visit Paris, which offers ____ in abundance.",
          "Which choice completes the text so that it conforms to the conventions of Standard English?",
          "This choice is correct because “them” maintains consistency throughout the sentence. The third-person plural pronoun “them” matches the plural antecedents 'history and architecture'.",
          "them", "him", "it", "us"
        );
        Questions grammar9 = new SATGrammar(
          "Chef Dominique Ansel created the 'cronut', a cross between a croissant and a ____ in New York in 2013.",
          "Which choice completes the text so that it conforms to the conventions of Standard English?",
          "This choice is correct as it effectively uses commas to set off the phrase 'a cross between a croissant and a donut', " + "\n" + "which is a nonessential element that should be set off with punctuation.",
          "donut,", "donut", "donut—", "donut;"
        );
        Questions grammar10 = new SATGrammar(
          "According to Abraham Lincoln, the 16th President of the United ____ 'Most folks are about as happy as they make up their minds to be.'",
          "Which choice completes the text so that it conforms to the conventions of Standard English?",
          "This choice correctly uses commas to set off the phrase “the 16th President of the United States”," + "\n" + "which is a nonessential element that should be set off with punctuation.",
          "States,", "States", "States—", "States)"
        );
        Questions grammar11 = new SATGrammar(
          "_________________ have a population of about 2.7 million.",
          "Which choice completes the text so that it conforms to the conventions of Standard English?",
          "This choice correctly avoids punctuating the phrase “and its surrounding areas”, which is an essential element that should not be set off with punctuation.",
          "Baltimore and its surrounding areas", "Baltimore, and its surrounding areas,", "Baltimore—and its surrounding areas,", "Baltimore, and its surrounding areas—"
        );
        Questions grammar12 = new SATGrammar(
          "_________________ has puzzled linguists for decades.",
          "Which choice completes the text so that it conforms to the conventions of Standard English?",
          "This choice is correct as it correctly puts a pair of matching punctuation marks (in this case, commas) around the nonessential supplement “still undeciphered to this day”.",
          "The Voynich Manuscript, still undeciphered to this day,", "The Voynich manuscript, still undeciphered to this day", "The Voynich Manuscript—still undeciphered to this day", "The Voynich Manuscript still undeciphered to this day"
        );
        Questions grammar13 = new SATGrammar(
          "When Marie Curie discovered radium, ____________ were not fully understood.",
          "Which choice completes the text so that it conforms to the conventions of Standard English?",
          "This choice correctly uses the singular possessive “element’s”, showing that the “properties and potential” belong to the element.",
          "the element's properties and potential", "the elements' properties and potential", "the elements property's and potential", "the element's properties and potential's"
        );
        Questions grammar14 = new SATGrammar(
          "Quantum particles of light—photons—provide an unhackable means of transmitting encryption keys over networks," + "\n" + "as attempts to observe particles in quantum states will invariably alter the particles ______ dismantle any information " + "\n" + "they transmit.",
          "Which choice completes the text so that it conforms to the conventions of Standard English?",
          "D is the best choice. It uses paired punctuation in the form of two commas to set off the nonessential phrase “in the process”."
          "and, in the process,", "and in the process—", "and, in the process", "and in the process,"
        );
        //Questions grammar15 = new SATGrammar();
        //Questions grammar16 = new SATGrammar();
        //Questions grammar17 = new SATGrammar();
        //Questions grammar18 = new SATGrammar();
        //Questions grammar19 = new SATGrammar();
        //Questions grammar20 = new SATGrammar();

        //list of SAT Vocab Questions
        Questions vocab1 = new SATVocab();
        Questions vocab2 = new SATVocab();
        Questions vocab3 = new SATVocab();
        Questions vocab4 = new SATVocab();
        Questions vocab5 = new SATVocab();
        Questions vocab6 = new SATVocab();
        Questions vocab7 = new SATVocab();
        Questions vocab8 = new SATVocab();
        Questions vocab9 = new SATVocab();
        Questions vocab10 = new SATVocab();
        Questions vocab11 = new SATVocab();
        Questions vocab12 = new SATVocab();
        Questions vocab13 = new SATVocab();
        Questions vocab14 = new SATVocab();
        Questions vocab15 = new SATVocab();
        Questions vocab16 = new SATVocab();
        Questions vocab17 = new SATVocab();
        Questions vocab18 = new SATVocab();
        Questions vocab19 = new SATVocab();
        Questions vocab20 = new SATVocab();
    }
}
