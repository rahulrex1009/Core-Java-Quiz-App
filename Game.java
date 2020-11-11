package com.quizapplication;

public class Game {

    Question[] questions=new Question[3];
    Player player=new Player();

    public void initGame()
    {
        //creating five objects
        for(int i=0;i<3;i++)
        {
            questions[i]=new Question();
        }
        //applying values to the five objects
        questions[0].question="Who is the strongest avenger?";
        questions[0].option1="Thor";
        questions[0].option2="Hulk";
        questions[0].option3="IronMan";
        questions[0].option4="Captain America";
        questions[0].correctAns=1;

        questions[1].question="What is the closest planet to the Sun?";
        questions[1].option1="Venus";
        questions[1].option2="Mars";
        questions[1].option3="Mercury";
        questions[1].option4="Jupiter";
        questions[1].correctAns=3;

        questions[2].question="What is the capital of England?";
        questions[2].option1="Tokyo";
        questions[2].option2="London";
        questions[2].option3="Liverpool";
        questions[2].option4="Manchester";
        questions[2].correctAns=2;
    }
    public void play()
    {
        player.getDetails();
        for(int i=0;i<3;i++)
        {
            boolean status=questions[i].askQuestion();
            if(status==true)
            {
                System.out.println("Amazing!!! Bahut hi unda khele hai aap!!!");
                player.score++;
            }
            else{
                System.out.println("Sorry Wrong answer!!!");
            }

        }
        System.out.println(player.name+" your score is "+player.score);

    }
}
