let a = 24;
let out = 0;

// if a is even increment out by one

if (a % 2 == 0) {
  out++;
}
console.log(out);

// if b is between 10 and 20 set out2 to "Sweet!"
// if less than 10 set out2 to "Less!",
// if more than 20 set out2 to "More!"

let b = 13;
let out2 = "";

if (b > 9 && b < 21) {
  out2 = "Sweet!";
}
if (b < 10) {
  out2 = "Less!";
} 
if (b > 20) {
  out2 = "More!";
}
console.log(out2);
// if credits are at least 50,
// and is_bonus is false decrement c by 2
// if credits are smaller than 50,
// and is_bonus is false decrement c by 1
// if is_bonus is true c should remain the same
let c = 123;
let credits = 100;
let isBonus = true;
if (isBonus == true){

}
else if (credits >= 50 && isBonus == false) {
   c = c - 2;
}
else if (credits <= 50 && isBonus == false) {
   c--;
}
console.log(c);



// if d is dividable by 4
// and time is not more than 200
// set out3 to "check"
// if time is more than 200
// set out3 to "Time out"
// otherwise set out3 to "Run Forest Run!"
let d = 7;
let time = 120;
let out3 = "";

if (d % 4 == 0 && time <= 200){
    out3 = "check";
} else if (time  > 200){
out3 = "Time out";
} else {
    out3 = "Run Forest run!";
}
console.log(out3);
