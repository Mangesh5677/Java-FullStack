public class QuestionService{
    Question[] questions = new Question[5];
    public QuestionService(){
    questions[0] = new Question(
    1,
    "Which language is primarily used for Android development?",
    "Java",
    "Python",
    "HTML",
    "CSS",
    "Java"
);

questions[1] = new Question(
    2,
    "Which keyword is used to create an object in Java?",
    "class",
    "new",
    "this",
    "static",
    "new"
);

questions[2] = new Question(
    3,
    "Which loop is guaranteed to execute at least once?",
    "for",
    "while",
    "do-while",
    "enhanced for",
    "do-while"
);

questions[3] = new Question(
    4,
    "Which concept allows a class to inherit properties from another class?",
    "Polymorphism",
    "Encapsulation",
    "Inheritance",
    "Abstraction",
    "Inheritance"
);

questions[4] = new Question(
    5,
    "Which method is the entry point of a Java program?",
    "start()",
    "run()",
    "main()",
    "execute()",
    "main()"
);
    }

    public void playQuiz(){
        for(Question q :questions){
        System.out.println("QuestionNo. :"+q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt());
    }
}
}