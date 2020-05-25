package com.company;

public class Main {




    public static void main(String[] args) {


        // - Create an array variable named `numbers`
        //   with the following content: `[4, 5, 6, 7]`
        // - Print the third element of `numbers`


        int [] numbers = {4,5,6,7};
        System.out.println(numbers[2]);



        // - Create an array variable named `firstArrayOfNumbers`
        //   with the following content: `[1, 2, 3]`
        // - Create an array variable named `secondArrayOfNumbers`
        //   with the following content: `[4, 5]`
        // - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
        //   elements than `firstArrayOfNumbers`



        int[] firstArrayofNumbers = {1,2,3};
        int []secondArrayofNumbers = {4,5};
        if ( secondArrayofNumbers.length > firstArrayofNumbers.length)
        System.out.println("secondArrayOfNumbers is longer");



        // - Create an array variable named `numbers`
        //   with the following content: `[54, 23, 66, 12]`
        // - Print the sum of the second and the third element



        int [] numbers2 = {54,23,66,12};
        System.out.println(numbers2[2] + numbers2[3]);


        // - Create an array variable named `numbers`
        //   with the following content: `[1, 2, 3, 8, 5, 6]`
        // - Change the 8 to 4
        // - Print the fourth element


        int [] numbers3 = {1,2,3,8,5,6};
        numbers3[3] = 4;
        System.out.println(numbers3[3]);


        // - Create an array variable named `numbers`
        //   with the following content: `[1, 2, 3, 4, 5]`
        // - Increment the third element
        // - Print the third element


        int [] numbers4 = {1,2,3,4,5};
        for (int i = numbers4[2]; i < numbers4[4] ; i++) {
            System.out.println(numbers4[i]);
        }



        // - Create an array variable named `numbers`
        //   with the following content: `[4, 5, 6, 7]`
        // - Print all the elements of `numbers`


        int []numbers5 = {4,5,6,7};
        for (int i = 0; i < numbers5.length ; i++) {
            System.out.println(numbers5[i]);
        }



        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output



        int [][] twoDimensionalArray  = {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};

        for (int i = 0; i < twoDimensionalArray.length ; i++) {
            System.out.print(twoDimensionalArray[0][i] + " ");
        }
        System.out.println();
        for (int j = 0; j < twoDimensionalArray.length ; j++) {
            System.out.print(twoDimensionalArray[1][j] + " ");
        }
        System.out.println();
        for (int k = 0; k < twoDimensionalArray.length ; k++) {
            System.out.print(twoDimensionalArray[2][k] + " ");
        }
        System.out.println();
        for (int l = 0; l < twoDimensionalArray.length ; l++) {
            System.out.print(twoDimensionalArray[3][l] + " ");
        }
        System.out.println();


        // - Create an array variable named `numList`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array

        int[] numList = {3,4,5,6,7};
        for (int i = 0; i < numList.length ; i++) {
            numList[i] *= 2;
            System.out.println(numList[i]);
        }


        // - Create a two dimensional array
        //   which can contain the different shades of specified colors
        // - In `colors[0]` store the shades of green:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - In `colors[1]` store the shades of red:
        //   `"orange red", "red", "tomato"`
        // - In `colors[2]` store the shades of pink:
        //   `"orchid", "violet", "pink", "hot pink"`


        String [][] colorArray = {{"lime", "forest green", "olive", "pale green", "spring green"} , {"orange red", "red", "tomato"} , {"orchid", "violet", "pink", "hot pink"}};

        for (int i = 0; i < colorArray.length ; i++) {
            System.out.println(colorArray[1][i]);
        }


        // - Create an array variable named `animals`
        //   with the following content: `["koal", "pand", "zebr"]`
        // - Add all elements an `"a"` at the end


        String [] animals = {"koal","pand","zebr"};

        for (int i = 0; i < animals.length ; i++) {
            animals[i] = animals[i] + "a";
            System.out.println(animals[i]);

        }

    }
}
