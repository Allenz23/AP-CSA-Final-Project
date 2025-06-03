public class Main
{
    public static void main(String[] args)
    {
        //all questions were taken from the official SAT Suite Question Bank & Khan Academy

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
        Questions grammar15 = new SATGrammar(
          "Apple, a technology company known for creating innovative gadgets and software, launched ______ into the streaming wars with Apple TV+.",
          "Which choice completes the text so that it conforms to the conventions of Standard English?",
          "This choice correctly uses the third-person singular reflexive pronoun 'itself' to stand in for the third-person singular antecedent 'Apple'.",
          "itself", "themselves", "myself", "himself"
        );
        Questions grammar16 = new SATGrammar(
          "Ten of William Shakespeare’s plays are classified as histories. Although each one of these plays," + "\n" + "which include Henry V and Richard III, ______ on a single historical figure (specifically, an English king)," + "\n" + "some, such as Henry VI Part One and Henry VI Part Two, feature different episodes from the same monarch’s life.",
          "Which choice completes the text with the most logical transition?",
          "This is the best choice. “Focuses” is a singular verb, so it agrees with the singular subject “each one of these plays”." + "\n" + "The other choices are incorrect as they create a subject-verb agreement error.",
          "focuses", "focus", "are focused", "were focused"
        );

        //list of SAT Transition Questions
        Questions transition1 = new SATTransitions(
          "When one looks at the dark craggy vistas in Hitoshi Fugo’s evocative photo series, one’s mind might wander off to the" + "\n" + "cratered surfaces of faraway planets. ______ it’s the series’ title, Flying Frying Pan, that brings one" + "\n" + "back to Earth, reminding the viewer that each photo is actually a close-up view of a familiar household object: a frying pan.",
          "Which choice completes the text with the most logical transition?",
          "B is the best choice. The previous sentence tells us that some bacteria have developed ways of resisting antibiotics." + "\n" + "This sentence provides a specific example of a type of bacteria that has developed a means of resisting antibiotics",
          "for example", "however", "meanwhile", "consequently"
        );
        Questions transition2 = new SATTransitions(
          "A 2017 study of sign language learners tested the role of iconicity—the similarity of a sign to the" + "\n" + "thing it represents—in language acquisition. The study found that the greater the iconicity of a sign," + "\n" + "the more likely it was to have been learned. ______ the correlation between acquisition and iconicity" + "\n" + "was lower than that between acquisition and another factor studied: sign frequency.",
          "Which choice completes the text with the most logical transition?",
          "This is the best choice. In this sentence, the author admits that a totally different factor was more important for sign" + "\n" + "language acquisition than the original factor the study was testing. “Granted” is a" + "\n" + "transition that means “admittedly”, so it fits the context perfectly.",
          "Granted,", "In fact,", "In other words,", "As a result"
        );
        Questions transition3 = new SATTransitions(
          "With its clichéd imagery of suburban lawns and power lines, John Ashbery’s 2004 poem “Ignorance of the" + "\n" + "Law Is No Excuse” may seem barren terrain for critical analysis. ______ cultural critic Lauren" + "\n" + "Berlant finds fertile ground in just its first two stanzas, devoting most of a book chapter" + "\n" + "to deciphering the “weight of the default space” Ashbery creates in this poem.",
          "Which choice completes the text with the most logical transition?",
          "This is the best choice. “Nonetheless” is a transition that indicates disagreement. The first sentence describes" + "\n" + "the unlikelihood of finding much for critical analysis in Ashbery’s poem (“barren terrain”)," + "\n" + "while the second sentence describes how Berlant did in fact find much to analyze in" + "\n" + "Ashbery’s poem (“fertile ground”), so the transition “nonetheless” fits perfectly.",
          "Nonetheless,", "That is,", "In turn,", "Likewise,"
        );
        Questions transition4 = new SATTransitions(
          "In the 1850s, William Still was instrumental in helping nearly 1,000 people escape from slavery, earning him the moniker" + "\n" + "“the Father of the Underground Railroad.” ______ despite the fame of his contributions during" + "\n" + "his lifetime, Still is discussed far less today than other prominent Black abolitionists from" + "\n" + "his era, such as Frederick Douglass and Harriet Tubman.",
          "Which choice completes the text with the most logical transition?",
          "This is the best choice. “However” is used to indicate a contrast between two ideas. The first sentence" + "\n" + "describes how Still used to be famous. This sentence describes how Still is not very famous today," + "\n" + "so the transition “however” fits perfectly.",
          "However,", "Similarly,", "Specifically,", "For example,"
        );
        Questions transition5 = new SATTransitions(
          "The number of dark spots that appear on the Sun, known as sunspots, can vary greatly. For example, there were" + "\n" + "about 180 sunspots in November 2001. ______ there were only about 2 sunspots in December 2008.",
          "Which choice completes the text with the most logical transition?",
          "This is the best choice. The first sentence claims that the number of sunspots can vary greatly. To support this claim," + "\n" + "the next two sentences compare two examples: one time when there were 180 sunspots and one time when there were" + "\n" + "only 2 sunspots. So the transition “by comparison” fits perfectly.",
          "By comparison,", "In other words,", "Similarly,", "As such,"
        );
        Questions transition6 = new SATTransitions(
          "Some members of the scientific community urge caution around the use of genetically modified (GM) crops, arguing" + "\n" + "that the long-term health effects of consuming such crops are unknown. ______ they" + "\n" + "are concerned about the environmental risks associated with GM crops, including their potential to" + "\n" + "disrupt natural ecosystems by displacing or cross-pollinating with wild plants.",
          "Which choice completes the text with the most logical transition?",
          "This is the best choice. “Additionally” indicates the addition of an agreeing idea. Both this sentence and the" + "\n" + "previous one describe reasons why some scientists are concerned about GM crops.",
          "Additionally,", "Nevertheless,", "In comparison,", "For instance,"
        );
        Questions transition7 = new SATTransitions(
          "Researchers believe that pieces of hull found off Oregon’s coast are from a Spanish cargo ship that was lost in 1697." + "\n" + "Stories passed down among the area’s Confederated Tribes of Siletz Indians support this" + "\n" + "belief. ______ Siletz stories describe how blocks of beeswax, an item the ship had been" + "\n" + "carrying, began washing ashore after the ship was lost.",
          "Which choice completes the text with the most logical transition?",
          "The previous sentence tells us that Siletz stories support the theory about the ship. This sentence provides a specific" + "\n" + "example of stories that support the theory by referencing beeswax, so the transition “for" + "\n" + "example” fits perfectly.",
          "For example,", "For this reason,", "However,", "Likewise,"
        );
        Questions transition8 = new SATTransitions(
          "British World War II propaganda called for British citizens to participate in city-wide blackouts, encouraging them to" + "\n" + "“eat carrots,” as carrots were believed to be essential for night sight. _____ while" + "\n" + "scientific studies have shown that carrots are high in vitamin A, which is good for eye health," + "\n" + "they do not give people the ability to see in the dark.",
          "Which choice completes the text with the most logical transition?",
          "The first sentence presents an old belief about carrots, and the second sentence refutes that belief with scientific" + "\n" + "evidence. The transition “however” indicates a contrast, so it fits perfectly.",
          "However,", "Furthermore,", "As a result,", "Similarly"
        );
        Questions transition9 = new SATTransitions(
          "It has long been thought that humans first crossed a land bridge into the Americas approximately 13,000 years ago. ______ " + "\n" + "based on radiocarbon dating of samples uncovered in Mexico, a research team recently" + "\n" + "suggested that humans may have arrived more than 30,000 years ago—much earlier than previously thought.",
          "Which choice completes the text with the most logical transition?",
          "The previous sentence describes a longstanding theory, and this sentence describes recent findings that disagree with that" + "\n" + "theory, so the transition “however” fits perfectly.",
          "However,", "As a result,", "Similarly,", "In conclusion"
        );
        Questions transition10 = new SATTransitions(
          "Honeybees play a crucial role in pollination, supporting both wild ecosystems and human agricultural systems." + "\n" + "______ their activities affect 70% of the top human food crops, which supply about 90% of the world’s" + "\n" + "nutrition. Hence, their decline could have catastrophic consequences on global food security.",
          "Which choice completes the text with the most logical transition?",
          "The previous sentence says that honeybees play a crucial role in supporting human agricultural systems. This" + "\n" + "sentence elaborates on that by providing statistics that show just how significantly their activities" + "\n" + "affect human food crops.",
          "In fact,", "However,", "Meanwhile,", "In conclusion"
        );
        Questions transition11 = new SATTransitions(
          "With darkness falling, a mother elephant loses sight of her calf and wants to make sure it is safe. ______ she" + "\n" + "releases an infrasonic call for the calf to hear. Infrasonic sound is below the range of human hearing," + "\n" + "but many animals can hear these sounds from several miles away.",
          "Which choice completes the text with the most logical transition?",
          "“For this reason” is a cause-and-effect transition. The cause in this case is that the mother elephant wants to" + "\n" + "know that her calf is safe, so the effect is that she lets out an infrasonic call for the calf to hear." + "\n" + "Therefore, “for this reason” fits perfectly in this context.",
          "For this reason,", "Nowadays,", "For example,", "Similarly"
        );
        Questions transition12 = new SATTransitions(
          "Riley Black—the author of critically acclaimed books such as My Beloved Brontosaurus (2013)—is best known for" + "\n" + "writing about dinosaurs, but she has also conducted hands-on fieldwork. ______ her fieldwork has included" + "\n" + "paleontological digs in Utah, Montana, and Wyoming, and her dinosaur fossil discoveries can be" + "\n" + "seen at places such as the Carnegie Museum of Natural History.",
          "Which choice completes the text with the most logical transition?",
          "The second sentence provides more specific information about the fieldwork mentioned in the first sentence—that" + "\n" + "the paleontological digs took place in Utah, Montana, and Wyoming. Therefore, “specifically” fits" + "\n" + "perfectly in this context.",
          "Specifically,", "Conversely,", "Subsequently,", "Regardless,"
        );
        Questions transition13 = new SATTransitions(
          "In 1891, dancer and choreographer Loie Fuller first performed her celebrated Serpentine Dance, artfully twirling" + "\n" + "her long, flowing skirt to create striking visual effects. ______ in 1896, cinema pioneers Auguste" + "\n" + "and Louis Lumière made a groundbreaking short film of Fuller’s dance.",
          "Which choice completes the text with the most logical transition?",
          "The first sentence describes how the Serpentine Dance was first performed in 1891, while this sentence describes" + "\n" + "how it was turned into a film in 1896. “Later” makes clear that the film came after the live" + "\n" + "performance, and fits perfectly in this context.",
          "Later,", "However,", "In conclusion,", "In other words"
        );
        Questions transition14 = new SATTransitions(
          "Arkansas aviator Louise Thaden was already a record breaker when she won the inaugural National Women’s Air Derby," + "\n" + "a race from California to Ohio, in August of 1929. ______ in December of 1928, Thaden had set" + "\n" + "an aviation record when she reached an altitude of 20,269 feet in a Travel Air biplane.",
          "Which choice completes the text with the most logical transition?",
          "This choice uses a transition that indicates a shift back in time. Since the first sentence talks about Thaden’s" + "\n" + "race win in 1929 and the second shifts back to talking about her record in 1928, this makes" + "\n" + "the most sense here.",
          "Earlier,", "As a result,", "Next,", "However,"
        );
        Questions transition15 = new SATTransitions(
          "“O2 Arena,” an award-winning science fiction story by Nigerian author Oghenechovwe Donald Ekpeki, takes place" + "\n" + "in an alternate version of Nigeria where breathable air is a rare commodity that is owned and sold" + "\n" + "by companies. ______ people must purchase it with currency called O2 credits.",
          "Which choice completes the text with the most logical transition?",
          "The second sentence describes a consequence of the system laid out in the first sentence: because air is owned" + "\n" + "and sold by companies in this world, people have to buy it.",
          "As a result,", "Nevertheless,", "In any case,", "Earlier"
        );
    }
}
