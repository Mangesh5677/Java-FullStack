import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {

        questions[0] = new Question(
                1,
                "Which language is primarily used for Android development?",
                "Java",
                "Python",
                "HTML",
                "CSS",
                "1"
        );

        questions[1] = new Question(
                2,
                "Which keyword is used to create an object in Java?",
                "class",
                "new",
                "this",
                "static",
                "2"
        );

        questions[2] = new Question(
                3,
                "Which loop is guaranteed to execute at least once?",
                "for",
                "while",
                "do-while",
                "enhanced for",
                "3"
        );

        questions[3] = new Question(
                4,
                "Which concept allows a class to inherit properties from another class?",
                "Polymorphism",
                "Encapsulation",
                "Inheritance",
                "Abstraction",
                "3"
        );

        questions[4] = new Question(
                5,
                "Which method is the entry point of a Java program?",
                "start()",
                "run()",
                "main()",
                "execute()",
                "3"
        );
    }

    public void playQuiz() {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {

            Question q = questions[i];

            System.out.println("\nQuestion No: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());

            System.out.print("Enter your answer (1-4): ");
            selection[i] = sc.nextLine();
        }
    }

    public void printScore() {

        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            Question que = questions[i];

            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }

        System.out.println("\nYour Score: " + score + "/" + questions.length);
    }
}