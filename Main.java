import com.sun.xml.internal.fastinfoset.stax.factory.StAXOutputFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    ArrayList<People> PeopleList = new ArrayList<>();
    public static void main(String[] args) {
        new Main();
    }
        public void Main() {


        System.out.printf("   ////MENU////\n     ");
        System.out.printf("[1]--> Login");
        System.out.printf("[2]--> Create User");
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        while(flag == 0)
        {
           int x = sc.nextInt();
           switch(x) {
               case 1:
                   login();
                flag=1;
               case 2:
                   createuser();
                flag=1;
               default:
                   System.out.printf("ERROR\n-->Invalid Input");
           }
        }


/*
        int flag = 0,x;
        while(flag == 0){
            System.out.printf(" [1] --> Register On Event");
            System.out.printf(" [2] --> Register On Event");
            System.out.printf(" [3] --> Register On Event");
            System.out.printf(" [4] --> Register On Event");

            switch(x) {
                case 1:

            }


        }*/
    }


    public void login(){

        System.out.printf("\n////Log////\n");
        System.out.printf("\n-->Keyword\n");
        Scanner sc = new Scanner(System.in);


    }

    public void createuser(){

        Scanner sc = new Scanner(System.in);
        System.out.printf("\n////Job////\n");
        System.out.printf("-->Student\n-->Professor\n-->Official");
        while(true){
            String x = sc.nextLine();
            switch(x){

                case "student":
                    Students newperson = new Students();

                    System.out.printf("\n////Program////\n");
                    System.out.printf("-->LEI\n-->LDM");
                    while (true){
                        String x = sc.nextLine();
                        if (x.equals("LEI") || x.equals("LDM")){
                            //Atribuir ao newperson(student) o curso - newperson.couser = x;
                            break;
                        }
                        else System.out.printf("ERROR\n-->Invalid Input - Try Again\n");
                    }
                    break;

                case "professor":
                    Professors newperson = new Professors();

                    System.out.printf("\n////Type////\n");
                    System.out.printf("-->Auxiliar\n-->Associated\n-->Full");
                    while(true){
                        String x = sc.nextLine();
                        if(x.equals("auxiliar") || x.equals("associated")||x.equals("full")){
                            //Atribuir ao newperson(teacher) o type - newperson.type = x;
                            break;
                        }
                        else System.out.printf("ERROR\n-->Invalid Input - Try Again\n");
                    }
                    break;

                case "official":
                    Officials newperson  = new Officials();

                    System.out.printf("\n////Work Time///\n");
                    System.out.printf("-->Partial\n-->Integral");
                    while(true){
                        String x = sc.nextLine();
                        if(x.equals("partial") || x.equals("integral")){
                            //Atribuir ao newperson(oficial) o worktime - newperson.worktime = x;
                            break;
                        }
                        else System.out.printf("ERROR\n-->Invalid Input - Try Again\n");
                    }
                    break;


                 default:
                     System.out.printf("ERROR\n-->Invalid Input - Try Again\n");
                     break;

            }
            break;
        }



        System.out.printf("\n////Profile////\n");
        System.out.printf("--> Sportive\n-->Cultural\n-->Bohemian\n-->MoneySaver\n");
        while(true){
            String x = sc.nextLine();
            if (x.equals("sportive") || x.equals("cultural") || x.equals("bohemian") || x.equals("moneysaver")){
                //Atribuir ao newperson um profile - newperson.profile = x;
                break;
            }

            else System.out.printf("ERROR\n-->Invalid Input - Try Again\n");

        }



        System.out.printf("\n////Keyword////\n");
        System.out.printf("-->Choose a Keyword\n");
        while(true){
            String x = sc.nextLine();

            if (keywordcheck(x) == 0){ // Apt for creation == no other person with same keyword
                //Atribuir ao newperson uma key - newperson.key = x;
                break;
            }
            else System.out.printf("ERROR\n-->Keyword already exists");
        }
    }


    public int keywordcheck(String Keyword){
        //Percorrer arraylist de people e search for keyword..
        //return 1 if found and 0 if not
        return 0;
    }
}
