import java.util.Random;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Random r=new Random();

        //including of array sizes

        System.out.print("m=");

        int m=sc.nextInt();

        System.out.print("n=");

        int n=sc.nextInt();

        int array[][] = new int [m][n];

        //fill of array

        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){

                System.out.print((array[i][j]=r.nextInt(200))+" ");

            }

            System.out.println("\n");

        }


        //main part of task

        System.out.println("Choose direction:(Clockwise - 1,  opposite - 2)");

        int d=sc.nextInt();

        int direction=0, step=1, currentStep=0, change=0, i, j;

        if (m % 2 == 0)
            i = m / 2 - 1;
        else
            i = m / 2;


        if (d == 1)
            if (n % 2 == 0)
                j = n / 2 - 1;
            else
                j = n / 2;
        else
            j = n / 2;


        for(int c=0; c < m*n; c++){

            if (i<0 || i>=m || j<0 || j>=n){
                break;
            }

            System.out.print(array[i][j]+" ");

            if (currentStep<step){

                currentStep++;

            } else {

                currentStep=1;

                if(change==1) step++;

                change=(change+1)%2;

                direction=(direction+1)%4;

            }

            switch (direction){

                case 0 :
                    if(d==1)
                        j++;
                    else
                        j--;
                    break;

                case 1 :
                    if(d==1)
                        i++;
                    else
                        i--;
                    break;

                case 2 :
                    if(d==1)
                        j--;
                    else
                        j++;
                    break;

                case 3 :
                    if(d==1)
                        i--;
                    else
                        i++;
                    break;

            }

        }



    }

}
