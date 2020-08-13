
// Write a program that calculates the sum and the average from 1 to a given number.
// Example input: 5
// Example output: Sum: 15, Average: 3
let number = 5;
let sum = 0;

for (let i = 1; i <= number; i++ ){
  sum += i;
}
let average = sum / number;
console.log(sum);
console.log(average);