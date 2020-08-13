let map = {};

if ( Object.keys(map).length === 0)
console.log("The map is empty");

map = {
  97: "a",
  98: "b",
  99: "c",
  65: "A",
  66: "B",
  67: "C",
};

// Print all the keys
console.log(Object.keys(map));

// Print all the values
console.log(Object.values(map));

// Add value D with the key 68
map['68'] = 'D';

// Print how many key-value pairs are in the map
console.log(Object.keys(map).length);

// Print the value that is associated with key 99
console.log(Object.values(map['99']));

// Remove the key-value pair where with key 97
delete map['97'];
console.log(Object.keys(map));

// Print whether there is an associated value with key 100 or not
if ( map['100'] !== undefined) {
console.log("The key exists with value: " + Object.values(map['100']));
} else {
    console.log("The key doesnt exist!")
}

// Remove all the key-value pairs
map = {};