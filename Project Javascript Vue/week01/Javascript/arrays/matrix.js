  
// -  Create (dynamically*) a two dimensional list
//    with the following matrix**. Use a loop!
//
//    0 0 0 1
//    0 0 1 0
//    0 1 0 0
//    1 0 0 0
//
// -  Print this two dimensional list to the console
//
// * size should depend on a variable
// ** Relax, a matrix is just like an array


    var matrix = new Array(4); 
  
// Loop to create 2D array using 1D array 
for (var i = 0; i < matrix.length; i++) { 
    matrix[i] = [];
} 
  
var h = 0; 
var s = "0001001001001000"; 

// Loop to initilize 2D array elements. 
for (var i = 0; i < 4; i++) { 
    for (var j = 0; j < 4; j++) { 
        matrix[i][j] = s[h++]; 
    } 
} 
  
// Loop to display the elements of 2D array.  
for (var i = 0; i < 4; i++) { 
    for (var j = 0; j < 4; j++)    { 
        document.write(matrix[i][j] + " "  ); 
    } 
    document.write("<br>"); 
}  
             