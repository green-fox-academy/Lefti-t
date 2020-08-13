// Create a function that can reverse a string, which is passed as the parameter
// Use it on this reversed string to check it!

let toBeReversed = `.eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI`;
console.log(toBeReversed);

function reverseString(str) {
console.log(str.split("").reverse().join("")); 
}
reverseString(toBeReversed);
