// Create an empty list which will contain names (strings)
let nameList = [];

// Add William to the list
nameList.push("Adam");

// Print out whether the list is empty or not
if (nameList === undefined || nameList.length == 0) {
    console.log("List is empty");
}else if (nameList.length == 1) {
    console.log("The list has " + nameList.length + " entry.");
} else  {
    console.log("The list has " + nameList.length + " entries.");
}

// Add John to the list
// Add Amanda to the list
nameList.push("John");
nameList.push("Amanda");

// Print out the number of elements in the list
console.log(nameList.length);

// Iterate through the list and print out each name
console.log(nameList[0] +' \n' + nameList[1] + '\n' + nameList[2]);

// Iterate through the list and print
for (let i = 0;i < nameList.length; i++) {
    console.log((i+1)+"." + nameList[i])
}
// Remove the 2nd element
nameList.splice(1,1);
console.log(nameList);

// Iterate through the list in a reversed order and print out each name
nameList.reverse().forEach(element => console.log(element));

// Remove all elements
nameList = [];